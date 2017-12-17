package com.misaka.network.dominion.service.entity.card

import com.misaka.network.dominion.core.type.CardEnum
import com.misaka.network.dominion.service.entity.Card
import com.misaka.network.dominion.service.type.card.CardFeature

/**
 * @author hyzhou.zhy. 2017/12/16.
 */
abstract class ActionCard extends Card {
    ActionCard(CardEnum cardEnum) {
        super(cardEnum);
        addFeature(CardFeature.ACTION)
    }
}
