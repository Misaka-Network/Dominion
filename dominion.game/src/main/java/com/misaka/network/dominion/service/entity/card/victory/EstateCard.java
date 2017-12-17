package com.misaka.network.dominion.service.entity.card.victory;

import com.misaka.network.dominion.core.type.CardEnum;
import com.misaka.network.dominion.service.entity.card.VictoryCard;

/**
 * @author hyzhou.zhy. 2017/12/17.
 */
public class EstateCard extends VictoryCard {
    static {
        cardEnumMap.put(CardEnum.Estate, EstateCard.class);
    }

    public EstateCard() {
        super(CardEnum.Estate, 1);
    }
}
