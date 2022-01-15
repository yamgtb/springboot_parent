package cn.yam.boot.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("yam_user")
public class Users implements Serializable {

    @TableId(value = "id")
    private String id;
    private String userName;
    private String userPassword;
    private String gender;
    private String userEmail;
    private String userNumber;
    private String userAge;
    private String userBirthday;
    private String memberBirthday;
    private String createTime;
    private String updateTime;
    private String isDelete;
}
