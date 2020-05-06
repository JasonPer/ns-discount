package org.jasonper.discountportal.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/4 18:23
 * @description 玩家收藏
 */
@Document(collection="post_collection")
public class PostCollection {
    @Id
    @JsonIgnore
    private String id;

    @Indexed
    private Long fromPlayerId;

    @Indexed
    private Long postId;
    private String postTheme;
    private Long toPlayerId;
    private String toPlayerName;
    private String toPlayerAvatar;

    @JsonIgnore
    private Integer status;

    @JsonIgnore
    private Date createTime;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPostTheme() {
        return postTheme;
    }

    public void setPostTheme(String postTheme) {
        this.postTheme = postTheme;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getFromPlayerId() {
        return fromPlayerId;
    }

    public void setFromPlayerId(Long fromPlayerId) {
        this.fromPlayerId = fromPlayerId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getToPlayerId() {
        return toPlayerId;
    }

    public void setToPlayerId(Long toPlayerId) {
        this.toPlayerId = toPlayerId;
    }

    public String getToPlayerName() {
        return toPlayerName;
    }

    public void setToPlayerName(String toPlayerName) {
        this.toPlayerName = toPlayerName;
    }

    public String getToPlayerAvatar() {
        return toPlayerAvatar;
    }

    public void setToPlayerAvatar(String toPlayerAvatar) {
        this.toPlayerAvatar = toPlayerAvatar;
    }
}
