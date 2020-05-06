package org.jasonper.discountportal.domain;

import java.util.Date;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/2 16:38
 * @description 游戏评分
 */
public class GameAssess {
    private Long id;
    private Long score;
    private String gameAssess;
    private String playerName;
    private String avatar;
    private String gameName;
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public String getGameAssess() {
        return gameAssess;
    }

    public void setGameAssess(String gameAssess) {
        this.gameAssess = gameAssess;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
