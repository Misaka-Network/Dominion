package com.misaka.network.dominion.service.entity.card;

import com.misaka.network.dominion.core.type.CardEnum;
import com.misaka.network.dominion.service.ability.card.ActionCardAbility;
import com.misaka.network.dominion.service.entity.Card;

/**
 * @author hyzhou.zhy. 2017/12/16.
 */
public abstract class ActionCard extends Card implements ActionCardAbility {
    public ActionCard(CardEnum cardEnum) {
        super(cardEnum);
    }
}
