package com.misaka.network.dominion.service.api;

import com.misaka.network.dominion.service.entity.Card;
import com.misaka.network.dominion.service.entity.Player;

import java.util.List;

/**
 * @author hyzhou.zhy. 2017/12/16.
 */
public interface GameEngine {
    // 标记操作

    void addActions(Long playerId, int count);

    void addCoins(Long playerId, int count);

    void addBuys(Long playerId, int count);

    void addCards(Long playerId, int count);

    // 基本术语操作

    void reveral(Long playerId, Card card);

    void retrace(Card card);

    void draw(Long playerId);

    void gain(Long playerId, Card card);

    void discard(Long playerId, Card card);

    void trash(Long playerId, Card card);

    void aside(Long playerId, Card card);

    void attack(Long playerId, Card card, Player playerAttacked);

    void affect(Long playerId, Card card, Player playerAffect);

    void reaction(Long playerId, Card card, Player playerReaction);

    void shuffle(Long playerId, List<Card> card);

    // 高级交互

    Card choiceCard(Long playerId, List<Card> cardList);

    void choiceYesOrNo(Long playerId);
}
