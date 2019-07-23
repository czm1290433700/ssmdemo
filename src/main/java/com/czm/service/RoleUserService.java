package com.czm.service;

import com.czm.entity.RoleUser;
import com.czm.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 12903 on 2018/4/16.
 */
public interface RoleUserService {
    /**
     * 根据用户查询角色用户集合
     * @param user
     * @return
     */
    List<RoleUser> findByUser(User user);

    /**
     * 添加用户角色中间对象
     * @param roleUser
     * @return id
     */
    int add(RoleUser roleUser);


    /**
     * 根据用户id删除
     * @param uid
     */
    void deleteByUid(Long uid);
}
