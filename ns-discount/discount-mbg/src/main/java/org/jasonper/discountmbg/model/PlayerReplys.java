package org.jasonper.discountmbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class PlayerReplys implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "外键，关联评论表")
    private Long playerCommentId;

    @ApiModelProperty(value = "回复内容正文")
    private String content;

    @ApiModelProperty(value = "外键，关联回复表id：如果是回复评论则为0，如果是回复回复则是reply_id")
    private Long replyId;

    @ApiModelProperty(value = "外键，关联玩家id，来自于xx的回复")
    private Long fromPlayerId;

    @ApiModelProperty(value = "外键，关联玩家id，给玩家的回复")
    private Long toPlayerId;

    @ApiModelProperty(value = "回复评论：0；回复回复：1")
    private Integer type;

    @ApiModelProperty(value = "回复时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlayerCommentId() {
        return playerCommentId;
    }

    public void setPlayerCommentId(Long playerCommentId) {
        this.playerCommentId = playerCommentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getReplyId() {
        return replyId;
    }

    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

    public Long getFromPlayerId() {
        return fromPlayerId;
    }

    public void setFromPlayerId(Long fromPlayerId) {
        this.fromPlayerId = fromPlayerId;
    }

    public Long getToPlayerId() {
        return toPlayerId;
    }

    public void setToPlayerId(Long toPlayerId) {
        this.toPlayerId = toPlayerId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", playerCommentId=").append(playerCommentId);
        sb.append(", content=").append(content);
        sb.append(", replyId=").append(replyId);
        sb.append(", fromPlayerId=").append(fromPlayerId);
        sb.append(", toPlayerId=").append(toPlayerId);
        sb.append(", type=").append(type);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}