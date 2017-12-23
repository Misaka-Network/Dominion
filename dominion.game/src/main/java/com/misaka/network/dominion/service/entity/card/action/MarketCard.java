package com.misaka.network.dominion.service.entity.card.action;

import com.misaka.network.dominion.core.type.CardEnum;
import com.misaka.network.dominion.core.type.ExpansionEnum;
import com.misaka.network.dominion.service.entity.card.ActionCard;
import com.misaka.network.dominion.service.impl.CardRegistry;
import com.misaka.network.dominion.service.type.card.CardFeature;

import java.util.Arrays;

/**
 * @author hyzhou.zhy. 2017/12/23.
 */
public class MarketCard extends ActionCard {
    static {
        CardRegistry.register(CardEnum.Market, new CardRegistry.CardStatic() {{
            setCost(5);
            setIsSupply(true);
            setExpansion(ExpansionEnum.Dominion);
            setFeatureList(Arrays.asList(CardFeature.ACTION));
            setInstanceType(MarketCard.class);
        }});
    }

    public MarketCard() {
        super(CardEnum.Village);
    }

    @Override
    public void use() {
        game.addCards(player, 1);
        game.addActions(player, 1);
        game.addBuys(player, 1);
        game.addCoins(player, 1);
    }
}
