package org.jasonper.discountportal.domain;

import java.util.Date;
import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/3 16:34
 * @description 帖子详情
 */
public class PostDetail {
    private Long id;
    private String theme;
    private String content;
    private Date createTime;
    private String playerName;
    private String avatar;
    private String gameName;

    private List<CommentDetail> commentDetailList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
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

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public List<CommentDetail> getCommentDetailList() {
        return commentDetailList;
    }

    public void setCommentDetailList(List<CommentDetail> commentDetailList) {
        this.commentDetailList = commentDetailList;
    }
}
