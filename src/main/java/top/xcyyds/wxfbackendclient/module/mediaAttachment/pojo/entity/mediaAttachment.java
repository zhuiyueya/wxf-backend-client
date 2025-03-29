package top.xcyyds.wxfbackendclient.module.mediaAttachment.pojo.entity;

/**
 * @Author: chasemoon
 * @CreateTime: 2025-03-29
 * @Description:
 * @Version:
 */

import top.xcyyds.wxfbackendclient.module.like.pojo.entity.TargetType;

import java.time.OffsetDateTime;

/**
 * mediaAttachment
 */
@lombok.Data
public class mediaAttachment {
    /**
     * 附件唯一标识符（自增主键）
     */
    private Long attachId;
    /**
     * SHA-256文件哈希值（模拟64位Hex）
     */
    private String fileHash;
    /**
     * 文件大小（字节，图片1KB-10MB，视频1MB-1GB）
     */
    private Long fileSize;
    /**
     * 媒体类型代码（1-图片, 2-视频, 3-音频）
     */
    private Long mediaType;
    /**
     * 上传者用户ID（与posts.public_id一致）
     */
    private String publicId;
    /**
     * 软删除标记（0-正常，1-已删除）
     */
    private Long status;
    /**
     * CDN存储路径（随机图片/视频URL）
     */
    private String storagePath;
    /**
     * 所属帖子ID（关联posts.post_id）
     */
    private Long targetId;
    /**
     * 附件所属的内容类型
     */
    private TargetType targetType;
    /**
     * 上传时间戳（晚于帖子创建时间）
     */
    private OffsetDateTime uploadTime;
}
