package gm.facade.user.service;

import gm.facade.user.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 保存用户
     * @param name
     * @return
     */
    Long saveUser(String name);

    /**
     * 通过id获取用户
     * @param id
     * @return
     */
    User getUser(Long id);

    /**
     * 通过用户名获取用户
     * @param name
     * @return
     */
    List<User> listUser(String name);
}
