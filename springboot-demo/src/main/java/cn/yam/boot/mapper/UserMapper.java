package cn.yam.boot.mapper;

import cn.yam.boot.entity.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<Users> getAllUser();
}
