package com.misaka.network.dominion.service.entity.card.treasure;

import com.misaka.network.dominion.core.type.CardEnum;
import com.misaka.network.dominion.service.entity.card.TreasureCard;

/**
 * @author hyzhou.zhy. 2017/12/16.
 */
public class GoldCard extends TreasureCard {
    static {
        cardEnumMap.put(CardEnum.Goad, GoldCard.class);
    }

    public GoldCard() {
        super(CardEnum.Goad, 3);
    }
}
