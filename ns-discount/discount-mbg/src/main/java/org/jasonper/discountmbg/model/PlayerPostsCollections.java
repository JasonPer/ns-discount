package org.jasonper.discountmbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class PlayerPostsCollections implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "外键，关联帖子表，被收藏的帖子")
    private Long collectedPostId;

    @ApiModelProperty(value = "外键，关联玩家表，收藏人")
    private Long collectedPlayerId;

    @ApiModelProperty(value = "收藏状态：0取消，1点赞")
    private Integer status;

    @ApiModelProperty(value = "收藏时间")
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

    public Long getCollectedPostId() {
        return collectedPostId;
    }

    public void setCollectedPostId(Long collectedPostId) {
        this.collectedPostId = collectedPostId;
    }

    public Long getCollectedPlayerId() {
        return collectedPlayerId;
    }

    public void setCollectedPlayerId(Long collectedPlayerId) {
        this.collectedPlayerId = collectedPlayerId;
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
        sb.append(", collectedPostId=").append(collectedPostId);
        sb.append(", collectedPlayerId=").append(collectedPlayerId);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}