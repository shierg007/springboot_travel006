package com.qf.j1904.mapper;

import com.qf.j1904.pojo.TbPermissions;
import com.qf.j1904.pojo.TbRoles;
import com.qf.j1904.pojo.TbUsers;
import com.qf.j1904.pojo.TbUsersExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbUsersMapper {
    /**
     * 查询某列的值的数目
     * @param example
     * @return
     */
    int countByExample(TbUsersExample example);

    /**
     * 根据某一列数据删除
     * @param example
     * @return
     */
    int deleteByExample(TbUsersExample example);

    /**
     * 根据主键数据删除
     * @param userid
     * @return
     */
    int deleteByPrimaryKey(Integer userid);

    /**
     * 插入数据（全数据）
     * @param record
     * @return
     */
    int insert(TbUsers record);

    /**
     * 动态插入数据
     * @param record
     * @return
     */
    int insertSelective(TbUsers record);

    /**
     * 根据某列数据查询用户
     * @param example
     * @return满足条件的用户信息集合
     */
    List<TbUsers> selectByExample(TbUsersExample example);

    /**
     * 根据主键查询
     * @param userid
     * @return
     */
    TbUsers selectByPrimaryKey(Integer userid);

    /**
     * 根据某列数据动态更新
     * @param record 新用户信息（部分）
     * @param example
     * @return
     */
    int updateByExampleSelective(@Param("record") TbUsers record, @Param("example") TbUsersExample example);

    /**
     * 根据某列数据更新
     * @param record 新用户信息（全部）
     * @param example
     * @return
     */
    int updateByExample(@Param("record") TbUsers record, @Param("example") TbUsersExample example);

    /**
     * 动态根据主键更新数据
     * @param record 新用户信息（部分）
     * @return
     */
    int updateByPrimaryKeySelective(TbUsers record);


    /**
     * 根据主键更新全部数据
     * @param record 新用户信息
     * @return
     */
    int updateByPrimaryKey(TbUsers record);

    /**
     * 根据用户名查询用户的角色信息
     * @param loginName 用户名
     * @return 角色信息
     */
    TbRoles selectRoleByLoginName(String loginName);

    /**
     * 注册时添加角色信息
     * @param map uid，rid
     * @return
     */
    int regAddRole(Map<String,Integer> map);

    /**
     * 根据账号名查询权限信息
     * @param loginName 账号名
     * @return 该账号拥有的权限集合
     */
    List<TbPermissions> selectPermissionsByLoginName(String loginName);

    /**
     * 查询最大id
     * @return 最大id
     */
    int maxUserId();

    /**
     * 查询用户拥有的角色
     * @param userId 用户id
     * @return 角色信息集合
     */
    List<TbRoles> selectCurrentRole(int userId);

    /**
     * 查询用户未拥有的角色信息
     * @param userId 用户id
     * @return 角色
     */
    List<TbRoles> selectNoHaveRole(int userId);

    /**
     * 给用户添加新角色
     * @param map uid，rid
     * @return count
     */
    int addRole(Map<String,Integer> map);

    /**
     * 移除用户已拥有的角色
     * @param map uid，rid
     * @returncount
     */
    int removeRole(Map<String,Integer> map);

    /**
     * 多条件模糊查询
     * @param map loginName，nickName,email(加%，业务层实现)
     * @return 用户信息
     */
    List<TbUsers> fuzzyQueryUser(Map<String,String> map);

    /**
     * 模糊查询后的数据数目
     * @param map loginName，nickName,email(加%，业务层实现)
     * @return 数据数目
     */
    int fuzzyQueryUserCount(Map<String,String> map);

    /**
     * 查询可以管理的管理员角色（id小于当前登陆的角色id，大于所有会员角色id）
     * @param userId 当前用户id
     * @return 可以管理的角色
     */
    List<TbRoles> managedRoles(int userId);
}