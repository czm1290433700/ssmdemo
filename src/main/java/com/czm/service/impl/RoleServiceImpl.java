package com.czm.service.impl;

import com.czm.dao.RoleMapper;
import com.czm.entity.Role;
import com.czm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wly on 2017/12/15.
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    public Role findById(long id) {
        Role role = new Role();
        role.setId( id );
        return roleMapper.selectOne( role );
    }

    @Override
    public int add(Role role) {
        return roleMapper.insert(role);
    }
}
