package com.misaka.network.dominion.service.entity;

import com.misaka.network.dominion.core.type.CardEnum;
import com.misaka.network.dominion.core.type.ExpansionEnum;
import com.misaka.network.dominion.service.api.GameEngine;
import com.misaka.network.dominion.service.type.card.CardFeature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author hyzhou.zhy. 2017/12/16.
 */

public abstract class Card {
    protected Long id;
    protected CardEnum cardEnum;
    protected Player player;                  // 持有者

    protected GameEngine game;                // 游戏实例
    protected boolean isSupply;               // 公国牌堆?

    protected boolean isPositive;             // 正面状态?
    protected ExpansionEnum expansionType;    // 扩充类型

    protected List<CardFeature> featureList = new ArrayList<CardFeature>();   // 类型属性

    public Card(CardEnum cardEnum) {
        this.cardEnum = cardEnum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CardEnum getCardEnum() {
        return cardEnum;
    }

    public void setCardEnum(CardEnum cardEnum) {
        this.cardEnum = cardEnum;
    }

    public boolean getIsSupply() {
        return isSupply;
    }

    public void setIsSupply(boolean supply) {
        this.isSupply = supply;
    }

    public boolean getIsPositive() {
        return isPositive;
    }

    public void setIsPositive(boolean isPositive) {
        this.isPositive = isPositive;
    }

    public ExpansionEnum getExpansion() {
        return expansionType;
    }

    public void setExpansion(ExpansionEnum expansion) {
        this.expansionType = expansion;
    }

    public GameEngine getGame() {
        return game;
    }

    public void setGame(GameEngine game) {
        this.game = game;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean checkFeature(CardFeature feature) {
        return featureList.contains(feature);
    }

    protected void addFeature(CardFeature feature) {
        this.featureList.add(feature);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    // 工具
    ////////////////////////////////////////////////////////////////////////////////////////////

    protected static Map<CardEnum, Class<? extends Card>> cardEnumMap = new HashMap<CardEnum, Class<? extends Card>>();

    public static Class<? extends Card> getCardClass(CardEnum cardEnum) {
        return cardEnumMap.get(cardEnum);
    }

    public static Card getCardInstance(CardEnum cardEnum) {
        Class<? extends Card> cardClass = getCardClass(cardEnum);
        if (cardClass == null) {
            throw new RuntimeException("No Such CardEnum");
        }
        try {
            return cardClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("No Such Card Creator");
    }

}
