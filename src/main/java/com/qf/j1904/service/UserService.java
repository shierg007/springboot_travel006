package com.qf.j1904.service;


import com.qf.j1904.pojo.TbPermissions;
import com.qf.j1904.pojo.TbRoles;
import com.qf.j1904.pojo.TbUsers;


import java.util.List;

public interface UserService {

    /**
     * 根据帐户名查询用户信息
     * @param loginName 账户名
     * @return 用户信息
     */
    List<TbUsers> selectByLoginName(String loginName);

    /**
     * 根据账户名查询用户的角色信息
     * @param loginName 账户名
     * @return 账户的角色信息
     */
    TbRoles selectRoleByLoginName(String loginName);

    /**
     * 根据昵称查询的所有账户信息
     * @param nickName 用户昵称
     * @return 满足条件的用户信息
     */
    List<TbUsers> selectByNickName(String nickName);

    /**
     * 会员注册时同时添加角色信息
     * @param user  用户信息
     * @return 是否注册成功
     */
    boolean reg(TbUsers user);

    /**
     * 查询所有用户信息
     * @return 所有用户信息的集合
     */
    List<TbUsers> loadAllUser(int page,int rows);

    /**
     * 计算最大的页数
     * @param rows 每一页显示的行数
     * @return 最大页数
     */
    int calcMaxPage(int rows);

    /**
     * 根据账号名查询权限信息
     * @param loginName 账号名
     * @return 该账号拥有的权限集合
     */
    List<TbPermissions> selectPermissionsByLoginName(String loginName);

    /**
     * 用户已拥有角色
     * @param userId 用户id
     * @return 角色信息
     */
    List<TbRoles> selectCurrentRole(int userId);

    /**
     * 用户未拥有角色
     * @param userId 用户id
     * @return 角色信息
     */
    List<TbRoles> selectNoHaveRole(int userId);

    /**
     * 给用户添加新角色
     * @param uid 用户id
     * @param rid 角色id
     * @return 是否成功
     */
    boolean addRole(int uid,int rid);
    /**
     * 移除已拥有角色
     * @param uid 用户id
     * @param rid 角色id
     * @return 是否成功
     */
    boolean removeRole(int uid,int rid);

    /**
     * 多条件模糊查询用户信息
     * @param page 页码
     * @param rows 每页显示行数
     * @param keywords 模糊查询关键字
     * @return 满足条件的数据
     */
    List<TbUsers> fuzzyQueryUser(int page,int rows,String keywords);

    /**
     * 模糊查询后显示的最大页码
     * @param rows 每页显示的行数
     * @return 最大页码
     */
    int calcFuzzyQueryUserMaxPage(int rows,String keywords);

    /**
     * 查询可以管理的角色
     * @param userId 当前用户id
     * @return 可以管理的角色
     */
    List<TbRoles> managedRoles(int userId);
}
