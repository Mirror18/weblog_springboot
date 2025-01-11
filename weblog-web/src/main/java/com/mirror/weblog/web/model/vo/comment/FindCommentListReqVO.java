package com.mirror.weblog.web.model.vo.comment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author: mirror
 * @description: 获取页面所有评论
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindCommentListReqVO {

    @NotBlank(message = "路由地址不能为空")
    private String routerUrl;


}
