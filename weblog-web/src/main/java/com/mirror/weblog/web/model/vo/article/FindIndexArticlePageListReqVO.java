package com.mirror.weblog.web.model.vo.article;

import com.mirror.weblog.common.model.BasePageQuery;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
//@ApiModel(value = "首页查询文章分页 VO")
public class FindIndexArticlePageListReqVO extends BasePageQuery {
}
