package com.qf.j1904.shiro;

import com.qf.j1904.pojo.TbPermissions;
import com.qf.j1904.pojo.TbRoles;
import com.qf.j1904.pojo.TbUsers;
import com.qf.j1904.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        Object primaryPrincipal = principalCollection.getPrimaryPrincipal();
        if (!StringUtils.isEmpty(primaryPrincipal)){
            String loginName = (String)primaryPrincipal;
            //用户的角色
            TbRoles role = userService.selectRoleByLoginName(loginName);
            //用户的权限
            List<TbPermissions> tbPermissions = userService.selectPermissionsByLoginName(loginName);
            //权限去重
            Set<String> permissions = new HashSet<>();
            //新的foreach
            tbPermissions.forEach(permission -> permissions.add(permission.getPermissionname()));
            SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
            //给授权信息对象添加当前账户拥有的角色，权限信息
            authorizationInfo.addRole(role.getRoletype());
            authorizationInfo.addStringPermissions(permissions);
            return authorizationInfo;
        }
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        Object principal = token.getPrincipal();
        if (!StringUtils.isEmpty(principal)){
            String loginName = (String)principal;
            List<TbUsers> users = userService.selectByLoginName(loginName);
            for (TbUsers user:users) {
                ByteSource salt = ByteSource.Util.bytes(user.getLoginname());
                SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user.getLoginname(), user.getPassword(), salt, getName());
                return authenticationInfo;
            }
        }
        return null;
    }
}
