package com.misaka.network.dominion.service.entity.card.victory;

import com.misaka.network.dominion.core.type.CardEnum;
import com.misaka.network.dominion.service.entity.card.VictoryCard;

/**
 * @author hyzhou.zhy. 2017/12/17.
 */
public class DuchyCard extends VictoryCard {
    static {
        cardEnumMap.put(CardEnum.Duchy, DuchyCard.class);
    }

    public DuchyCard() {
        super(CardEnum.Duchy, 3);
    }
}
