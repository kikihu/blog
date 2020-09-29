package frank.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Article {
    private Integer id;
    private String title;
    //文章内容
    private String content;
    //用户ID
    private Integer userId;
    private Date createTime;
    //用户账号
    private String userAccout;
}
