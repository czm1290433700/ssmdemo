
/*
 * Copyright (C) 2013-2016 ShangHai DoIT Network
 * All rights reserved.
 * ShangHai DoIt Network
 */
package com.czm.service.impl;

import com.czm.dao.LoginLogMapper;
import com.czm.entity.LoginLog;
import com.czm.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by wly on 2017/12/15.
 */
@Service
public class LoginLogServiceImpl implements LoginLogService {
    
    @Autowired
    private LoginLogMapper loginLogMapper;


    public int add(LoginLog loginLog) {
        return loginLogMapper.insert( loginLog );
    }

    @Override
    public List<LoginLog> findAll() {
        return loginLogMapper.select(null);
    }

    @Override
    public List<LoginLog> findByUid(Long uid) {
        LoginLog loginLog = new LoginLog();
        loginLog.setUserId(uid);
        return loginLogMapper.select(loginLog);
    }
}

