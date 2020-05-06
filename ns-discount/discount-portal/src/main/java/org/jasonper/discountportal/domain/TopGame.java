package org.jasonper.discountportal.domain;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/1 19:33
 * @description 热门游戏
 */
public class TopGame {
    private Long gameId;
    private String nameZh;
    private String ign;
    private String coverUrl;

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public String getIgn() {
        return ign;
    }

    public void setIgn(String ign) {
        this.ign = ign;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }
}
