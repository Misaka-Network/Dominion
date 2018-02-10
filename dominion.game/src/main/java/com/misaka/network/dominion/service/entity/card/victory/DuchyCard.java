package com.misaka.network.dominion.service.entity.card.victory;

import com.misaka.network.dominion.core.type.CardEnum;
import com.misaka.network.dominion.core.type.ExpansionEnum;
import com.misaka.network.dominion.service.entity.card.VictoryCard;
import com.misaka.network.dominion.service.impl.CardRegistry;
import com.misaka.network.dominion.service.type.card.CardFeature;

import java.util.Arrays;

/**
 * @author hyzhou.zhy. 2017/12/17.
 */
public class DuchyCard extends VictoryCard {
    static {
        CardRegistry.register(CardEnum.Duchy, new CardRegistry.CardStatic() {{
            setCost(5);
            setIsSupply(true);
            setExpansion(ExpansionEnum.Dominion);
            setFeatureList(Arrays.asList(CardFeature.VICTORY));
            setInstanceType(DuchyCard.class);
        }});
    }

    public DuchyCard() {
        super(CardEnum.Duchy, 3);
    }
}
