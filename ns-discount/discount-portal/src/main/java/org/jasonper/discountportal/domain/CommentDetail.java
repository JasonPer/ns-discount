package org.jasonper.discountportal.domain;

import java.util.Date;
import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/3 16:36
 * @description 评论详情
 */
public class CommentDetail {
    private Long commentId;
    private String content;
    private Long playerId;
    private String playerName;
    private String avatar;
    private Date createTime;

    private List<ReplyDetail> replyDetailList;

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public List<ReplyDetail> getReplyDetailList() {
        return replyDetailList;
    }

    public void setReplyDetailList(List<ReplyDetail> replyDetailList) {
        this.replyDetailList = replyDetailList;
    }
}
