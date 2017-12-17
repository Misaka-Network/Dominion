package com.misaka.network.dominion.core
import com.misaka.network.dominion.core.entity.Instruction
import com.misaka.network.dominion.core.type.CardEnum
/**
 * @author hyzhou.zhy. 2017/12/16.
 */
interface Game {
    /**
     * 游戏启动
     * @param playerList    玩家列表
     * @param cardList      公国牌列表
     * @return              游戏实例Id
     */
    Long gameStart(List<Long> playerIdList, List<CardEnum> cardList)

    /**
     *
     * @param player
     * @param gameId
     * @param operate
     */
    void command(Long gameId, Long playerId, Instruction instruction)
}
