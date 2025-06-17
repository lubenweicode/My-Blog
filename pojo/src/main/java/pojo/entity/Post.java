package pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    private String id;// 文章唯一标识符
    private String title;// 文章标题
    private String content;// 文章正文
    private Integer status;// 状态
    private long viewCount;// 浏览量
    private long commentCount;// 评论数
    private Date createTime;// 发布时间
    private Date updateTime;// 最后修改时间
}
