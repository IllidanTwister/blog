package cn.mycookies.pojo.vo;

import cn.mycookies.pojo.dto.TagVO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@ToString
@ApiModel("评论回复实体类")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlogVO {

    public Integer id;

    public String title;

    public String summary;

    public String content;

    public String imgUrl;

    public Integer code;

    public Integer viewCount;

    public Integer likeCount;

    public String createTime;

    public String updateTime;

    public String calcTime;

    public String categoryName;

    public Integer categoryId;

    public List<TagVO> tagList;

    public BlogDetailVO last;

    public BlogDetailVO next;

    PageInfo<CommentListItemVO> comments;
}
