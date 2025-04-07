package top.xcyyds.wxfbackendclient.module.comment.pojo.dto;

import lombok.Data;
import top.xcyyds.wxfbackendclient.module.mediaAttachment.pojo.dto.SummaryMediaAttachment;
import top.xcyyds.wxfbackendclient.module.user.pojo.dto.SummaryAuthorInfo;

import java.time.OffsetDateTime;

/**
 * @Author: chasemoon
 * @CreateTime: 2025-04-06
 * @Description:
 * @Version:v1
 */
@Data
public class AddChildCommentResponse{
    /**
     * 评论的唯一标识符，自增主键
     */
    private long commentId;
    /**
     * 评论内容
     */
    private String content;
    /**
     * 评论创建时间（ISO8601格式）
     */
    private OffsetDateTime createTime;
    /**
     * 点赞统计
     */
    private long likeCount;
    /**
     * 媒体附件（如图片、视频等）
     */
    private SummaryMediaAttachment mediaAttachment;
    /**
     * 父评论ID（自关联），NULL表示顶级评论
     */
    private Long parentCommentId;
    /**
     * 关联的帖子ID，外键引用posts表的post_id
     */
    private long postId;
    /**
     * 发表评论的用户ID
     */
    private String publicId;
    /**
     * 子评论数量统计
     */
    private long replyCount;
    /**
     * 用于回复子评论时显示回复的是谁
     */
    private String replyToNickname;
    /**
     * 评论状态：0-正常，1-已删除，2-审核中
     */
    private long status;
    /**
     * 用户基本信息
     */
    private SummaryAuthorInfo authorInfo;
}
