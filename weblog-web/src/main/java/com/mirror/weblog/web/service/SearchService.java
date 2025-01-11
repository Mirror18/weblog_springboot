package com.mirror.weblog.web.service;

import com.mirror.weblog.common.utils.Response;
import com.mirror.weblog.web.model.vo.search.SearchArticlePageListReqVO;

/**
 * @author: mirror
 * @description:
 **/
public interface SearchService {

    /**
     * 关键词分页搜索
     * @param searchArticlePageListReqVO
     * @return
     */
    Response searchArticlePageList(SearchArticlePageListReqVO searchArticlePageListReqVO);
}
