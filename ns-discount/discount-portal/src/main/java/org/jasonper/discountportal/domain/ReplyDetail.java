package org.jasonper.discountportal.domain;

import java.util.Date;
import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/3 16:38
 * @description 回复详情
 */
public class ReplyDetail {
    private Long replyId;
    private String content;
    private Long playerId;
    private String playerName;
    private String avatar;
    private Date createTime;

    private List<ReplyDetail> childrenReplyList;

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public List<ReplyDetail> getChildrenReplyList() {
        return childrenReplyList;
    }

    public void setChildrenReplyList(List<ReplyDetail> childrenReplyList) {
        this.childrenReplyList = childrenReplyList;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public Long getReplyId() {
        return replyId;
    }

    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
}
