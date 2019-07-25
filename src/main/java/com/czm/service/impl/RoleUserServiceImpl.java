package com.czm.service.impl;

import com.czm.dao.RoleUserMapper;
import com.czm.entity.RoleUser;
import com.czm.entity.User;
import com.czm.service.RoleUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wly on 2017/12/15.
 */
@Service
public class RoleUserServiceImpl implements RoleUserService {
    @Autowired
    private RoleUserMapper roleUserMapper;

    public List<RoleUser> findByUser(User user) {
        RoleUser roleUser = new RoleUser();
        roleUser.setuId( user.getId() );
        return roleUserMapper.select( roleUser );
    }

    public int add(RoleUser roleUser) {
        return roleUserMapper.insert( roleUser );
    }

    public void deleteByUid(Long uid) {
        RoleUser roleUser = new RoleUser();
        roleUser.setuId( uid );
        roleUserMapper.delete( roleUser );
    }
}
