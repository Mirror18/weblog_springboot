package com.mirror.weblog.jwt.service;

import com.mirror.weblog.common.domain.dos.UserDO;
import com.mirror.weblog.common.domain.dos.UserRoleDO;
import com.mirror.weblog.common.domain.mapper.UserMapper;
import com.mirror.weblog.common.domain.mapper.UserRoleMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author mirror
 */
@Service
@Slf4j
public class UserDetailServiceImpl implements UserDetailsService {

    @Resource
    private UserMapper userMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 从数据库中查询
        UserDO userDO = userMapper.findByUsername(username);

        // 判断用户是否存在
        if (Objects.isNull(userDO)) {
            throw new UsernameNotFoundException("该用户不存在");
        }

        // 用户角色
        List<UserRoleDO> roleDOS = userRoleMapper.selectByUsername(username);

        String[] roleArr = null;

        // 转数组
        if (!CollectionUtils.isEmpty(roleDOS)) {
            List<String> roles = roleDOS.stream().map(UserRoleDO::getRole).collect(Collectors.toList());
            roleArr = roles.toArray(new String[0]);
        }

        // authorities 用于指定角色，这里写死为 ADMIN 管理员
        return User.withUsername(userDO.getUsername())
                .password(userDO.getPassword())
                .authorities(roleArr)
                .build();
    }
}

