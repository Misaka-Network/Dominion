package com.misaka.network.dominion.service

import com.misaka.network.dominion.core.Game
import com.misaka.network.dominion.core.entity.Instruction
import com.misaka.network.dominion.core.type.CardEnum
import com.misaka.network.dominion.service.api.GameEngine
import com.misaka.network.dominion.service.entity.Card
import com.misaka.network.dominion.service.entity.Player
import groovy.transform.CompileStatic

/**
 * @author hyzhou.zhy. 2017/12/16.
 */
@CompileStatic
class GameImpl implements Game, GameEngine {
    private Long Id

    // 游戏玩家
    private Map<Long, Player> playerList

    // 公国牌
    private Map<CardEnum, List<Card>> supplyCardPileList

    @Override
    Long gameStart(List<Long> playerIdList, List<CardEnum> cardList) {
        GameImpl game = new GameImpl()
        // TODO Hyzhou 游戏初始化
        return Id
    }

    @Override
    void command(Long playerId, Long gameId, Instruction instruction) {

    }

    ////////////////////////////////////////////////////////////////////////
    //  Engine Impl
    ////////////////////////////////////////////////////////////////////////

    @Override
    void choiceCard(Long playerId, List<Card> cardList) {

    }

    @Override
    void choiceYesOrNo(Player player) {

    }

    @Override
    void reveral(Long playerId, Card card) {

    }

    @Override
    void retrace(Card card) {

    }

    @Override
    void draw(Player player) {

    }

    @Override
    void discard(Long playerId, Card card) {

    }

    @Override
    void trash(Long playerId, Card card) {

    }

    @Override
    void aside(Long playerId, Card card) {

    }

    @Override
    void attack(Long playerId, Card card, Player playerAttacked) {

    }

    @Override
    void affect(Long playerId, Card card, Player playerAffect) {

    }

    @Override
    void reaction(Long playerId, Card card, Player playerReaction) {

    }

    @Override
    void shuffle(Long playerId, List<Card> card) {

    }
}
