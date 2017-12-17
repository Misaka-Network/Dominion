package com.misaka.network.dominion.service.entity.card;

import com.misaka.network.dominion.core.type.CardEnum;
import com.misaka.network.dominion.service.ability.card.VictoryCardAbility;
import com.misaka.network.dominion.service.entity.Card;
import com.misaka.network.dominion.service.type.card.CardFeature;

/**
 * @author hyzhou.zhy. 2017/12/16.
 */
public abstract class VictoryCard extends Card implements VictoryCardAbility {
    private int point;

    public VictoryCard(CardEnum cardEnum) {
        super(cardEnum);
        addFeature(CardFeature.VICTORY);
    }

    public VictoryCard(CardEnum cardEnum, int point) {
        super(cardEnum);
        addFeature(CardFeature.VICTORY);
        this.point = point;
    }

    @Override
    public void settlement() {
        player.setVictory(player.getVictory() + point);
    }
}
