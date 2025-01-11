package com.mirror.weblog.web.service;

import com.mirror.weblog.common.utils.Response;
import com.mirror.weblog.web.model.vo.tag.FindTagArticlePageListReqVO;
import com.mirror.weblog.web.model.vo.tag.FindTagListReqVO;

/**
 * @author mirror
 */
public interface TagService {
    /**
     * 获取标签列表
     * @return
     */
    Response findTagList(FindTagListReqVO findTagListReqVO);

    /**
     * 获取标签下文章分页列表
     * @param findTagArticlePageListReqVO
     * @return
     */
    Response findTagPageList(FindTagArticlePageListReqVO findTagArticlePageListReqVO);
}
