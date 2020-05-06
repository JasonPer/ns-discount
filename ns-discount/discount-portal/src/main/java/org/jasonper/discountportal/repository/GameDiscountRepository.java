package org.jasonper.discountportal.repository;

import org.jasonper.discountportal.domain.GameDiscount;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/4/30 18:14
 * @description 游戏折扣Repository
 */
public interface GameDiscountRepository extends MongoRepository<GameDiscount, String> {
}
