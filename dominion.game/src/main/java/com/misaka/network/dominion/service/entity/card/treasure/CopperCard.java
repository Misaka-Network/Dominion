package com.misaka.network.dominion.service.entity.card.treasure;

import com.misaka.network.dominion.core.type.CardEnum;
import com.misaka.network.dominion.service.entity.card.TreasureCard;

/**
 * @author hyzhou.zhy. 2017/12/16.
 */
public class CopperCard extends TreasureCard {
    static {
        cardEnumMap.put(CardEnum.Copper, CopperCard.class);
    }

    public CopperCard() {
        // TODO Hyzhou
        // 示例
        //      正常情况财富卡的价值是定值
        super(CardEnum.Copper, 1);
    }
}
