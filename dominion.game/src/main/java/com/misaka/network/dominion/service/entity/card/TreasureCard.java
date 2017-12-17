package com.misaka.network.dominion.service.entity.card;

import com.misaka.network.dominion.core.type.CardEnum;
import com.misaka.network.dominion.service.ability.card.TreasureCardAbility;
import com.misaka.network.dominion.service.entity.Card;
import com.misaka.network.dominion.service.type.card.CardFeature;

/**
 * @author hyzhou.zhy. 2017/12/16.
 */
public abstract class TreasureCard extends Card implements TreasureCardAbility {
    private int value;

    public TreasureCard(CardEnum cardEnum) {
        super(cardEnum);
        addFeature(CardFeature.TREASURE);
    }

    public TreasureCard(CardEnum cardEnum, int value) {
        super(cardEnum);
        addFeature(CardFeature.TREASURE);
        this.value = value;
    }

    public int getValue() {//默认的价值
        return value;
    }

    @Override
    public void use() {
        player.setCoins(player.getCoins() + value);
    }
}
