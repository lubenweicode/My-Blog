create table user(
    user_id varchar(50) primary key comment '用户唯一表示',
    user_username varchar(50) comment '用户名(登录账号)',
    user_password varchar(50) comment '密码(通常加密存储)',
    user_nickname varchar(50) comment '昵称(展示博客前台)',
    user_email varchar(50) comment '电子邮箱',
    user_avatar varchar(255) comment '头像路径',
    user_introduction varchar(255) comment '个人简介',
    user_create_time DATETIME comment '注册时间',
    user_update_time DATETIME comment '更新时间'
)