package pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String userId;// 用户唯一表示
    private String userUsername;// 用户名(登录账号)
    private String userPassword;// 密码(通常加密存储)
    private String userNickname;// 昵称(展示博客前台)
    private String userEmail;// 电子邮箱
    private String userAvatar;// 头像路径
    private String userIntroduction;// 个人简介
    private Date userCreateTime;// 注册时间
    private Date userUpdateTime;// 最后更新时间
}
