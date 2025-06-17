package pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String id;// 用户唯一表示
    private String username;// 用户名(登录账号)
    private String password;// 密码(通常加密存储)
    private String nickname;// 昵称(展示博客前台)
    private String email;// 电子邮箱
    private String avatar;// 头像路径
    private String introduction;// 个人简介
    private Date createTime;// 注册时间
    private Date updateTime;// 最后更新时间
}
