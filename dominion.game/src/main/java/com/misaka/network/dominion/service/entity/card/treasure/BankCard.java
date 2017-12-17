package com.misaka.network.dominion.service.entity.card.treasure;

import com.misaka.network.dominion.core.type.CardEnum;
import com.misaka.network.dominion.service.entity.card.TreasureCard;

/**
 * @author hyzhou.zhy. 2017/12/16.
 */
public class BankCard extends TreasureCard {
    static {
        cardEnumMap.put(CardEnum.Bank, BankCard.class);
    }

    public BankCard() {
        super(CardEnum.Bank);
    }

    @Override
    public int getValue() {
        // TODO Hyzhou
        // 示例
        //      价值作为一个接口是可以扩展的.
        //      根据玩家和游戏盘面状态动态变化.
        return -1;
    }
}
