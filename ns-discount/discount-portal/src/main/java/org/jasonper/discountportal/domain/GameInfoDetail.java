package org.jasonper.discountportal.domain;

import org.jasonper.discountmbg.model.GameBases;
import org.jasonper.discountmbg.model.GamePictures;
import org.jasonper.discountmbg.model.GameVideos;

import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/2 0:13
 * @description 详细游戏信息
 */
public class GameInfoDetail extends GameBases {
    private List<GamePictures> gamePictures;
    private List<GameVideos> gameVideos;

    public List<GamePictures> getGamePictures() {
        return gamePictures;
    }

    public void setGamePictures(List<GamePictures> gamePictures) {
        this.gamePictures = gamePictures;
    }

    public List<GameVideos> getGameVideos() {
        return gameVideos;
    }

    public void setGameVideos(List<GameVideos> gameVideos) {
        this.gameVideos = gameVideos;
    }

}
