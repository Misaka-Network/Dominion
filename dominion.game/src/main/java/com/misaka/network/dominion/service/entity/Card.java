package com.misaka.network.dominion.service.entity;

import com.misaka.network.dominion.core.type.CardEnum;
import com.misaka.network.dominion.service.GameImpl;
import com.misaka.network.dominion.service.impl.CardRegistry;
import com.misaka.network.dominion.service.type.card.CardFeature;

/**
 * @author hyzhou.zhy. 2017/12/16.
 */

public abstract class Card {
    protected Long id;
    protected CardEnum cardEnum;

    protected Long player;                    // 持有者
    protected GameImpl game;                  // 游戏实例

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

    public GameImpl getGame() {
        return game;
    }

    public void setGame(GameImpl game) {
        this.game = game;
    }

    public void setPlayer(Long player) {
        this.player = player;
    }

    public Long getPlayer() {
        return player;
    }

    ////////////////////////////////////////////////////////////////////////////
    // 卡的综合属性
    ////////////////////////////////////////////////////////////////////////////

    public int getCost() {
        return CardRegistry.getCost(cardEnum);
    }

    public boolean hasFeature(CardFeature cardFeature) {
        return CardRegistry.getFeatureList(cardEnum).contains(cardFeature);
    }
}
