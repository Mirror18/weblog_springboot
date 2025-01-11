package com.mirror.weblog.admin.service;

import com.mirror.weblog.admin.model.vo.comment.DeleteCommentReqVO;
import com.mirror.weblog.admin.model.vo.comment.ExamineCommentReqVO;
import com.mirror.weblog.admin.model.vo.comment.FindCommentPageListReqVO;
import com.mirror.weblog.common.utils.Response;

/**
 * @author: mirror
 * @description: 评论
 **/
public interface AdminCommentService {

    /**
     * 查询评论分页数据
     * @param findCommentPageListReqVO
     * @return
     */
    Response findCommentPageList(FindCommentPageListReqVO findCommentPageListReqVO);

    /**
     * 删除评论
     * @param deleteCommentReqVO
     * @return
     */
    Response deleteComment(DeleteCommentReqVO deleteCommentReqVO);

    /**
     * 评论审核
     * @param examineCommentReqVO
     * @return
     */
    Response examine(ExamineCommentReqVO examineCommentReqVO);

}
