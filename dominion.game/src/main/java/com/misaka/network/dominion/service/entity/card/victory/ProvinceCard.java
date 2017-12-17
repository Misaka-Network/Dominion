package com.misaka.network.dominion.service.entity.card.victory;

import com.misaka.network.dominion.core.type.CardEnum;
import com.misaka.network.dominion.service.entity.card.VictoryCard;

/**
 * @author hyzhou.zhy. 2017/12/17.
 */
public class ProvinceCard extends VictoryCard {
    static {
        cardEnumMap.put(CardEnum.Province, ProvinceCard.class);
    }

    public ProvinceCard() {
        super(CardEnum.Province, 6);
    }
}
