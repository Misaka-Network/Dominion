package com.misaka.network.dominion.service;

import com.misaka.network.dominion.core.Game;
import com.misaka.network.dominion.core.entity.Instruction;
import com.misaka.network.dominion.core.type.CardEnum;
import com.misaka.network.dominion.service.api.GameEngine;
import com.misaka.network.dominion.service.entity.Card;
import com.misaka.network.dominion.service.entity.Player;
import com.misaka.network.dominion.service.impl.CardRegistry;

import java.util.*;

/**
 * @author hyzhou.zhy. 2017/12/16.
 */

public class GameImpl implements Game, GameEngine {
    private static final Map<CardEnum, List<Integer>> basicCardCount = new HashMap<CardEnum, List<Integer>>() {{
        put(CardEnum.Copper, Arrays.asList(0, 0, 60, 60, 60, 60, 60));
        put(CardEnum.Silver, Arrays.asList(0, 0, 40, 40, 40, 40, 40));
        put(CardEnum.Gold, Arrays.asList(0, 0, 30, 30, 30, 30, 30));
        put(CardEnum.Estate, Arrays.asList(0, 0, 8, 12, 12, 12, 12));
        put(CardEnum.Duchy, Arrays.asList(0, 0, 8, 12, 12, 12, 12));
        put(CardEnum.Province, Arrays.asList(0, 0, 8, 12, 12, 15, 18));
    }};

    private Long id;

    // 游戏玩家
    private Map<Long, Player> playerList;

    // 公国牌堆
    private Map<CardEnum, List<Card>> supplyCardPileList;

    // 基础牌堆
    private Map<CardEnum, List<Card>> basicCardPileList;

    @Override
    public Long gameStart(List<Long> userIdList, List<CardEnum> cardList) {
        GameImpl game = new GameImpl();
        playerList = new HashMap<Long, Player>();
        supplyCardPileList = new HashMap<CardEnum, List<Card>>();
        basicCardPileList = new HashMap<CardEnum, List<Card>>();

        for (Long userId : userIdList) {
            playerList.put(userId, new Player(userId));
        }

        for (CardEnum cardEnum : cardList) {
            ArrayList<Card> supplyCardPile = new ArrayList<Card>();
            for (int i = 0; i < 10; i++) {
                supplyCardPile.add(CardRegistry.getNewInstance(cardEnum));
            }
            supplyCardPileList.put(cardEnum, supplyCardPile);
        }

        for (CardEnum cardEnum : Arrays.asList(CardEnum.Copper, CardEnum.Silver, CardEnum.Gold, CardEnum.Estate, CardEnum.Duchy, CardEnum.Province)) {
            ArrayList<Card> basicCardPile = new ArrayList<Card>();
            for (int i = 0; i < basicCardCount.get(cardEnum).get(playerList.size()); i++) {
                basicCardPile.add(CardRegistry.getNewInstance(cardEnum));
            }
            basicCardPileList.put(cardEnum, basicCardPile);
        }

        return game.id;
    }

    @Override
    public void command(Long playerId, Long gameId, Instruction instruction) {

    }

//////////////////////////////////////////////////////

    public Player getPlayer(Long id) {
        return playerList.get(id);
    }


    public List<Card> getSupplyCardPile(CardEnum cardEnum) {
        return supplyCardPileList.get(cardEnum);
    }

    public List<Card> getBasicCardPile(CardEnum cardEnum) {
        return basicCardPileList.get(cardEnum);
    }

    public Map<Long, Player> getPlayerList() {
        return playerList;
    }

    public Map<CardEnum, List<Card>> getSupplyCardPileList() {
        return supplyCardPileList;
    }

    public Map<CardEnum, List<Card>> getBasicCardPileList() {
        return basicCardPileList;
    }

    //////////////////////////////////////////////////////

    @Override
    public void addActions(Long playerId, int count) {

    }

    @Override
    public void addCoins(Long playerId, int count) {

    }

    @Override
    public void addBuys(Long playerId, int count) {

    }

    @Override
    public void addCards(Long playerId, int count) {

    }

    @Override
    public Card choiceCard(Long playerId, List<Card> cardList) {
        return null;
    }

    @Override
    public void choiceYesOrNo(Long playerId) {

    }

    @Override
    public void reveral(Long playerId, Card card) {

    }

    @Override
    public void retrace(Card card) {

    }

    @Override
    public void draw(Long playerId) {

    }

    @Override
    public void gain(Long playerId, Card card) {

    }

    @Override
    public void discard(Long playerId, Card card) {

    }

    @Override
    public void trash(Long playerId, Card card) {

    }

    @Override
    public void aside(Long playerId, Card card) {

    }

    @Override
    public void attack(Long playerId, Card card, Player playerAttacked) {

    }

    @Override
    public void affect(Long playerId, Card card, Player playerAffect) {

    }

    @Override
    public void reaction(Long playerId, Card card, Player playerReaction) {

    }

    @Override
    public void shuffle(Long playerId, List<Card> card) {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
