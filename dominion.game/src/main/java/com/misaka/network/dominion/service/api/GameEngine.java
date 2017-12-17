package com.misaka.network.dominion.service.api;

import com.misaka.network.dominion.service.entity.Card;
import com.misaka.network.dominion.service.entity.Player;

import java.util.List;

/**
 * @author hyzhou.zhy. 2017/12/16.
 */
public interface GameEngine {
    void choiceCard(Long playerId, List<Card> cardList);

    void choiceYesOrNo(Player player);

    void reveral(Long playerId, Card card);

    void retrace(Card card);

    void draw(Player player);

    void discard(Long playerId, Card card);

    void trash(Long playerId, Card card);

    void aside(Long playerId, Card card);

    void attack(Long playerId, Card card, Player playerAttacked);

    void affect(Long playerId, Card card, Player playerAffect);

    void reaction(Long playerId, Card card, Player playerReaction);

    void shuffle(Long playerId, List<Card> card);
}
