package top.xcyyds.wxfbackendclient.module.user.pojo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.OffsetDateTime;

/**
 * @Author: chasemoon
 * @CreateTime: 2025-03-09
 * @Description:
 * @Version:
 */
@Table(name="user")
@lombok.Data
@Entity
public class User {
    /**
     * 头像URL
     */
    private String avatar;
    /**
     * 创建时间
     */
    private OffsetDateTime createdAt;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 访客ID（设备唯一）
     */
    private String guestId;
    /**
     * 用户唯一对内ID（雪花算法）
     */
    @Id
    private long internalId;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 用户唯一对外ID（HMAC-SHA256加密）
     */
    private String publicId;
    /**
     * 姓名（加密存储）
     */
    private String realName;
    /**
     * 角色权限
     */
    private long role;
    /**
     * 更新时间
     */
    private OffsetDateTime updatedAt;
}
