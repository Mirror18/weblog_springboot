package com.mirror.weblog.admin.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @author: mirror
 * @description: 评论更新事件
 **/

@Getter
public class UpdateCommentEvent extends ApplicationEvent {

    /**
     * 评论 ID
     */
    private Long commentId;

    public UpdateCommentEvent(Object source, Long commentId) {
        super(source);
        this.commentId = commentId;
    }
}
