package com.misaka.network.dominion.service.entity;

import com.misaka.network.dominion.service.api.GameEngine;

import java.util.List;

/**
 * @author hyzhou.zhy. 2017/12/16.
 */
public class Player {
    private Long id;

    private int coins;
    private int actions;
    private int buys;
    private int victory;

    private List<Token> tokens;
    private List<Card> handCards;
    private List<Card> drawPile;
    private List<Card> discardPile;

    private GameEngine game;

    public Player(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getActions() {
        return actions;
    }

    public void setActions(int actions) {
        this.actions = actions;
    }

    public int getBuys() {
        return buys;
    }

    public void setBuys(int buys) {
        this.buys = buys;
    }

    public int getVictory() {
        return victory;
    }

    public void setVictory(int victory) {
        this.victory = victory;
    }

    public List<Token> getTokens() {
        return tokens;
    }

    public void setTokens(List<Token> tokens) {
        this.tokens = tokens;
    }

    public List<Card> getHandCards() {
        return handCards;
    }

    public void setHandCards(List<Card> handCards) {
        this.handCards = handCards;
    }

    public List<Card> getDrawPile() {
        return drawPile;
    }

    public void setDrawPile(List<Card> drawPile) {
        this.drawPile = drawPile;
    }

    public List<Card> getDiscardPile() {
        return discardPile;
    }

    public void setDiscardPile(List<Card> discardPile) {
        this.discardPile = discardPile;
    }

    public GameEngine getGame() {
        return game;
    }

    public void setGame(GameEngine game) {
        this.game = game;
    }
}
