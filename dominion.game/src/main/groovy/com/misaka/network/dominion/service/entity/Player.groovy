package com.misaka.network.dominion.service.entity

import com.misaka.network.dominion.service.api.GameEngine
/**
 * @author hyzhou.zhy. 2017/12/16.
 */
class Player {
    private Long id

    private Long coins
    private Long actions
    private Long buys

    private List<Token> tokens
    private List<Card> handCards
    private List<Card> drawPile
    private List<Card> discardPile

    private GameEngine game

    Long getId() {
        return id
    }

    void setId(Long id) {
        this.id = id
    }

    Long getCoins() {
        return coins
    }

    void setCoins(Long coins) {
        this.coins = coins
    }

    Long getActions() {
        return actions
    }

    void setActions(Long actions) {
        this.actions = actions
    }

    Long getBuys() {
        return buys
    }

    void setBuys(Long buys) {
        this.buys = buys
    }

    List<Token> getTokens() {
        return tokens
    }

    void setTokens(List<Token> tokens) {
        this.tokens = tokens
    }

    List<Card> getHandCards() {
        return handCards
    }

    void setHandCards(List<Card> handCards) {
        this.handCards = handCards
    }

    List<Card> getDrawPile() {
        return drawPile
    }

    void setDrawPile(List<Card> drawPile) {
        this.drawPile = drawPile
    }

    List<Card> getDiscardPile() {
        return discardPile
    }

    void setDiscardPile(List<Card> discardPile) {
        this.discardPile = discardPile
    }
}