package com.misaka.network.dominion.core;

import com.misaka.network.dominion.core.entity.Instruction;
import com.misaka.network.dominion.core.type.CardEnum;

import java.util.List;

/**
 * @author hyzhou.zhy. 2017/12/16.
 */
public interface Game {
    /**
     * 游戏启动
     *
     * @param playerIdList 玩家列表
     * @param cardList     公国牌列表
     * @return 游戏实例Id
     */
    Long gameStart(List<Long> playerIdList, List<CardEnum> cardList);

    /**
     * @param gameId
     * @param playerId
     * @param instruction
     */
    void command(Long gameId, Long playerId, Instruction instruction);
}
