package com.mirror.weblog.web.service;

import com.mirror.weblog.common.utils.Response;
import com.mirror.weblog.web.model.vo.wiki.FindWikiArticlePreNextReqVO;
import com.mirror.weblog.web.model.vo.wiki.FindWikiCatalogListReqVO;

/**
 * @author: mirror
 * @description: 知识库
 **/
public interface WikiService {

    /**
     * 获取知识库
     * @return
     */
    Response findWikiList();

    /**
     * 获取知识库目录
     * @param findWikiCatalogListReqVO
     * @return
     */
    Response findWikiCatalogList(FindWikiCatalogListReqVO findWikiCatalogListReqVO);

    /**
     * 获取上下页
     * @param findWikiArticlePreNextReqVO
     * @return
     */
    Response findArticlePreNext(FindWikiArticlePreNextReqVO findWikiArticlePreNextReqVO);

}
