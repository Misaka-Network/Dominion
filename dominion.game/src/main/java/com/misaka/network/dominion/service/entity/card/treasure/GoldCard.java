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
public class GoldCard extends TreasureCard {
    static {
        CardRegistry.register(CardEnum.Gold, new CardRegistry.CardStatic() {{
            setCost(6);
            setIsSupply(true);
            setExpansion(ExpansionEnum.Dominion);
            setFeatureList(Arrays.asList(CardFeature.TREASURE));
            setInstanceType(GoldCard.class);
        }});
    }

    public GoldCard() {
        super(CardEnum.Gold, 3);
    }
}
