package cn.yam.boot.service.impl;

import cn.yam.boot.entity.Users;
import cn.yam.boot.mapper.UserMapper;
import cn.yam.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Users> getAllUser() {
        List<Users> usersList = userMapper.getAllUser();
        return usersList;
    }
}
