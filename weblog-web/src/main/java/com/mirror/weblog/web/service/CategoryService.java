package com.mirror.weblog.web.service;

import com.mirror.weblog.common.utils.Response;
import com.mirror.weblog.web.model.vo.category.FindCategoryArticlePageListReqVO;
import com.mirror.weblog.web.model.vo.category.FindCategoryListReqVO;

/**
 * @author mirror
 */
public interface CategoryService {
    /**
     * 获取分类列表
     * @return
     */
    Response findCategoryList(FindCategoryListReqVO findCategoryListReqVO);

    /**
     * 获取分类下文章分页数据
     * @param findCategoryArticlePageListReqVO
     * @return
     */
    Response findCategoryArticlePageList(FindCategoryArticlePageListReqVO findCategoryArticlePageListReqVO);
}
