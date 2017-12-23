package com.misaka.network.dominion.service.entity.card.treasure;

import com.misaka.network.dominion.core.type.CardEnum;
import com.misaka.network.dominion.core.type.ExpansionEnum;
import com.misaka.network.dominion.service.entity.Card;
import com.misaka.network.dominion.service.entity.card.TreasureCard;
import com.misaka.network.dominion.service.impl.CardRegistry;
import com.misaka.network.dominion.service.type.card.CardFeature;

import java.util.Arrays;

/**
 * @author hyzhou.zhy. 2017/12/16.
 */
public class BankCard extends TreasureCard {
    static {
        CardRegistry.register(CardEnum.Bank, new CardRegistry.CardStatic() {{
            setCost(7);
            setIsSupply(true);
            setExpansion(ExpansionEnum.Prosperity);
            setFeatureList(Arrays.asList(CardFeature.TREASURE));
            setInstanceType(BankCard.class);
        }});
    }

    public BankCard() {
        super(CardEnum.Bank);
    }

    @Override
    public int getValue() {
        int treasureCardCount = 1; // 算上自己一个
        for (Card card : game.getPlayer(player).getBoardPile()) {
            if (card.hasFeature(CardFeature.TREASURE)) {
                treasureCardCount++;
            }
        }
        return treasureCardCount;
    }
}
