package com.misaka.network.dominion.service;

import com.misaka.network.dominion.service.api.GameEngine;
import com.misaka.network.dominion.service.entity.Card;
import com.misaka.network.dominion.service.entity.Player;

import java.util.List;

/**
 * Created by Luhaijie on 2018/3/6.
 * for web server test.
 */
@Deprecated
public class GameEngineDemo implements GameEngine {
    @Override
    public void addActions(Long playerId, int count) {
        System.out.println("addActions: " + playerId + "-" + count);
    }

    @Override
    public void addCoins(Long playerId, int count) {
        System.out.println("addCoins: " + playerId + "-" + count);
    }

    @Override
    public void addBuys(Long playerId, int count) {
        System.out.println("addBuys: " + playerId + "-" + count);
    }

    @Override
    public void addCards(Long playerId, int count) {
        System.out.println("addCards: " + playerId + "-" + count);
    }

    @Override
    public void reveral(Long playerId, Card card) {
        System.out.println("reveral: " + playerId + "-" + card);
    }

    @Override
    public void retrace(Card card) {
        System.out.println("retrace: " + card);
    }

    @Override
    public void draw(Long playerId) {
        System.out.println("draw: " + playerId);
    }

    @Override
    public void gain(Long playerId, Card card) {
        System.out.println("gain: " + playerId + "-" + card);
    }

    @Override
    public void discard(Long playerId, Card card) {
        System.out.println("discard: " + playerId + "-" + card);
    }

    @Override
    public void trash(Long playerId, Card card) {
        System.out.println("trash: " + playerId + "-" + card);
    }

    @Override
    public void aside(Long playerId, Card card) {
        System.out.println("aside: " + playerId + "-" + card);
    }

    @Override
    public void attack(Long playerId, Card card, Player playerAttacked) {
        System.out.println("attack: " + playerId + "-" + card + "-" + playerAttacked);
    }

    @Override
    public void affect(Long playerId, Card card, Player playerAffect) {
        System.out.println("affect: " + playerId + "-" + card + "-" + playerAffect);
    }

    @Override
    public void reaction(Long playerId, Card card, Player playerReaction) {
        System.out.println("reaction: " + playerId + "-" + card + "-" + playerReaction);
    }

    @Override
    public void shuffle(Long playerId, List<Card> card) {
        System.out.println("shuffle: " + playerId + "-" + card);
    }

    @Override
    public Card choiceCard(Long playerId, List<Card> cardList) {
        System.out.println("choiceCard: " + playerId + "-" + cardList);
        return null;
    }

    @Override
    public void choiceYesOrNo(Long playerId) {
        System.out.println("choiceYesOrNo: " + playerId);
    }
}
