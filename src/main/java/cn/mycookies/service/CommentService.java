package cn.mycookies.service;

import cn.mycookies.common.ServerResponse;
import cn.mycookies.pojo.dto.CommentDTO;
import cn.mycookies.pojo.vo.CommentVO;
import com.github.pagehelper.PageInfo;


public interface CommentService {

    ServerResponse insertComment(CommentDTO commentDTO);

    ServerResponse<PageInfo<CommentVO>> listComments(Integer pageNum, Integer pageSize, String email, String replyEmail, Integer targetId, String sessionId, Byte isDeleted);

    ServerResponse deleteComment(Integer commentId,Byte isRealDelete);

    ServerResponse<String> updateCommentLikeCount(Integer id);
}
