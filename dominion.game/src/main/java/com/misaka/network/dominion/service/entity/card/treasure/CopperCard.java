package com.misaka.network.dominion.service.entity.card.treasure;

import com.misaka.network.dominion.core.type.CardEnum;
import com.misaka.network.dominion.core.type.ExpansionEnum;
import com.misaka.network.dominion.service.entity.card.TreasureCard;
import com.misaka.network.dominion.service.impl.CardRegistry;
import com.misaka.network.dominion.service.type.card.CardFeature;

import java.util.Arrays;

/**
 * @author hyzhou.zhy. 2017/12/16.
 */
public class CopperCard extends TreasureCard {
    static {
        CardRegistry.register(CardEnum.Copper, new CardRegistry.CardStatic() {{
            setCost(0);
            setIsSupply(true);
            setExpansion(ExpansionEnum.Dominion);
            setFeatureList(Arrays.asList(CardFeature.TREASURE));
            setInstanceType(CopperCard.class);
        }});
    }

    public CopperCard() {
        // TODO Hyzhou
        // 示例
        //      正常情况财富卡的价值是定值
        super(CardEnum.Copper, 1);
    }
}
