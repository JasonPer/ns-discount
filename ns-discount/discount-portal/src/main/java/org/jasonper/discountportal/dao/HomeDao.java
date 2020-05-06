package org.jasonper.discountportal.dao;

import org.jasonper.discountportal.domain.GameAssess;
import org.jasonper.discountportal.domain.GameInfoDetail;

import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/4/30 16:20
 * @description 首页内容管理Service
 */
public interface HomeDao {
    GameInfoDetail getGameInfoDetailsByGameId(Long id);

    List<GameAssess> getGameAssessByGameId(Long gameId);

    GameInfoDetail getGameInfoDetailsByGameCode(Long code);
}
