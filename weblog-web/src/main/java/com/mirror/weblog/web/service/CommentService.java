package com.mirror.weblog.web.service;

import com.mirror.weblog.common.utils.Response;
import com.mirror.weblog.web.model.vo.comment.FindCommentListReqVO;
import com.mirror.weblog.web.model.vo.comment.FindQQUserInfoReqVO;
import com.mirror.weblog.web.model.vo.comment.PublishCommentReqVO;

/**
 * @author: mirror
 * @description: 评论
 **/
public interface CommentService {

    /**
     * 根据 QQ 号获取用户信息
     * @param findQQUserInfoReqVO
     * @return
     */
    Response findQQUserInfo(FindQQUserInfoReqVO findQQUserInfoReqVO);

    /**
     * 发布评论
     * @param publishCommentReqVO
     * @return
     */
    Response publishComment(PublishCommentReqVO publishCommentReqVO);

    /**
     * 查询页面所有评论
     * @param findCommentListReqVO
     * @return
     */
    Response findCommentList(FindCommentListReqVO findCommentListReqVO);
}
