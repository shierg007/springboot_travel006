package com.qf.j1904.service.impl;

import com.github.pagehelper.PageHelper;
import com.qf.j1904.mapper.TbUsersMapper;
import com.qf.j1904.pojo.TbPermissions;
import com.qf.j1904.pojo.TbRoles;
import com.qf.j1904.pojo.TbUsers;
import com.qf.j1904.pojo.TbUsersExample;
import com.qf.j1904.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TbUsersMapper userMapper;
    @Override
    public List<TbUsers> selectByLoginName(String loginName) {
        TbUsersExample example = new TbUsersExample();
        TbUsersExample.Criteria criteria = example.createCriteria();
        criteria.andLoginnameEqualTo(loginName);
        return userMapper.selectByExample(example);
    }

    @Override
    public TbRoles selectRoleByLoginName(String loginName) {
        return userMapper.selectRoleByLoginName(loginName);
    }

    @Override
    public List<TbUsers> selectByNickName(String nickName) {
        TbUsersExample example = new TbUsersExample();
        TbUsersExample.Criteria criteria = example.createCriteria();
        criteria.andNicknameEqualTo(nickName);
        return userMapper.selectByExample(example);
    }

    @Override
    public boolean reg(TbUsers user) {
        int maxId = userMapper.maxUserId();
        int count = userMapper.insertSelective(user);
        Map<String,Integer> map = new HashMap<>();
        map.put("uid",maxId+1);
        map.put("rid",1);
        int count1 = userMapper.regAddRole(map);
        return count>0 && count1>0;
    }

    @Override
    public List<TbUsers> loadAllUser(int page,int rows) {
        PageHelper.startPage(page,rows);
        return userMapper.selectByExample(null);
    }

    @Override
    public int calcMaxPage(int rows) {
        int count = userMapper.countByExample(null);
        return count%rows == 0 ? count/rows : count/rows+1;
    }

    @Override
    public List<TbPermissions> selectPermissionsByLoginName(String loginName) {
        return userMapper.selectPermissionsByLoginName(loginName);
    }

    @Override
    public List<TbRoles> selectCurrentRole(int userId) {
        return userMapper.selectCurrentRole(userId);
    }

    @Override
    public List<TbRoles> selectNoHaveRole(int userId) {
        return userMapper.selectNoHaveRole(userId);
    }

    @Override
    public boolean addRole(int uid, int rid) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("uid",uid);
        map.put("rid",rid);
        return userMapper.addRole(map)>0;
    }

    @Override
    public boolean removeRole(int uid, int rid) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("uid",uid);
        map.put("rid",rid);
        return userMapper.removeRole(map)>0;
    }

    @Override
    public List<TbUsers> fuzzyQueryUser(int page, int rows, String keywords) {
        HashMap<String, String> map = new HashMap<>();
        map.put("loginName","%"+keywords+"%");
        map.put("nickName","%"+keywords+"%");
        map.put("email","%"+keywords+"%");
        PageHelper.startPage(page,rows);
        return userMapper.fuzzyQueryUser(map);
    }

    @Override
    public int calcFuzzyQueryUserMaxPage(int rows,String keywords) {
        HashMap<String, String> map = new HashMap<>();
        map.put("loginName","%"+keywords+"%");
        map.put("nickName","%"+keywords+"%");
        map.put("email","%"+keywords+"%");
        int count = userMapper.fuzzyQueryUserCount(map);
        return count%rows == 0 ? count/rows :count/rows+1;
    }

    @Override
    public List<TbRoles> managedRoles(int userId) {
        List<TbRoles> tbRoles = userMapper.selectCurrentRole(userId);
        int roleId = 0;
        for (TbRoles role:tbRoles) {
            roleId = role.getRoleid();
        }
        return userMapper.managedRoles(roleId);
    }

    @Override
    public boolean addUserOfAdmin(TbUsers user, int roleId) {
        int maxUserId = userMapper.maxUserId();
        int count1 = userMapper.insertSelective(user);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("uid",maxUserId+1);
        map.put("rid",roleId);
        int count2 = userMapper.addRole(map);
        return count1>0 && count2>0;
    }

}
