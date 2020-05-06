package org.jasonper.discountportal.domain;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/5 19:08
 * @description
 */
public class PlayerInfo {
    private Long id;
    private String playerName;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
