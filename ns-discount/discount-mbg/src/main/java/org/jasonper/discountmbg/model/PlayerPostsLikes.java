package org.jasonper.discountmbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class PlayerPostsLikes implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "外键，关联帖子表，被点赞的帖子")
    private Long likedPostsId;

    @ApiModelProperty(value = "外键，关联玩家表，点赞人")
    private Long likedPlayerId;

    @ApiModelProperty(value = "点赞状态：0点赞1取消")
    private Integer status;

    @ApiModelProperty(value = "点赞时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLikedPostsId() {
        return likedPostsId;
    }

    public void setLikedPostsId(Long likedPostsId) {
        this.likedPostsId = likedPostsId;
    }

    public Long getLikedPlayerId() {
        return likedPlayerId;
    }

    public void setLikedPlayerId(Long likedPlayerId) {
        this.likedPlayerId = likedPlayerId;
    }

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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", likedPostsId=").append(likedPostsId);
        sb.append(", likedPlayerId=").append(likedPlayerId);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}