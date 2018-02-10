package com.misaka.network.dominion.service.entity.card;

import com.misaka.network.dominion.core.type.CardEnum;
import com.misaka.network.dominion.service.ability.card.VictoryCardAbility;
import com.misaka.network.dominion.service.entity.Card;

/**
 * @author hyzhou.zhy. 2017/12/16.
 */
public abstract class VictoryCard extends Card implements VictoryCardAbility {
    private int point;

    public VictoryCard(CardEnum cardEnum) {
        super(cardEnum);
    }

    public VictoryCard(CardEnum cardEnum, int point) {
        super(cardEnum);
        this.point = point;
    }

    @Override
    public void settlement() {
        game.addCoins(player, point);
    }
}
