package com.misaka.network.dominion.service.entity.card.treasure

import com.misaka.network.dominion.core.type.CardEnum
import com.misaka.network.dominion.service.entity.card.TreasureCard

/**
 * @author hyzhou.zhy. 2017/12/16.
 */
class CopperCard extends TreasureCard {
    CopperCard() {
        // TODO Hyzhou
        // 示例
        //      正常情况财富卡的价值是定值
        super(CardEnum.Copper, 1)
    }
}
