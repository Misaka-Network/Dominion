package com.misaka.network.dominion.service.entity
import com.misaka.network.dominion.core.type.CardEnum
import com.misaka.network.dominion.core.type.ExpansionEnum
import com.misaka.network.dominion.service.api.GameEngine
import com.misaka.network.dominion.service.type.card.CardFeature
import groovy.transform.CompileStatic
/**
 * @author hyzhou.zhy. 2017/12/16.
 */
@CompileStatic
abstract class Card {
    protected Long id
    protected CardEnum cardEnum;

    protected Player player                  // 持有者
    protected GameEngine game                  // 游戏实例

    protected boolean isSupply               // 公国牌堆?
    protected boolean isPositive             // 正面状态?
    protected ExpansionEnum expansionType    // 扩充类型

    protected List<CardFeature> featureList = new ArrayList<CardFeature>()   // 类型属性

    Card(CardEnum cardEnum) {
        this.cardEnum = cardEnum
    }

    Long getId() {
        return id
    }

    void setId(Long id) {
        this.id = id
    }

    CardEnum getCardEnum() {
        return cardEnum
    }

    void setCardEnum(CardEnum cardEnum) {
        this.cardEnum = cardEnum
    }

    boolean getIsSupply() {
        return isSupply
    }

    void setIsSupply(boolean supply) {
        this.isSupply = supply
    }

    boolean getIsPositive() {
        return isPositive
    }

    void setIsPositive(boolean isPositive) {
        this.isPositive = isPositive
    }

    ExpansionEnum getExpansion() {
        return expansionType
    }

    void setExpansion(ExpansionEnum expansion) {
        this.expansionType = expansion
    }

    GameEngine getGame() {
        return game
    }

    void setGame(GameEngine game) {
        this.game = game
    }

    void setPlayer(Player player) {
        this.player = player
    }

    Player getPlayer() {
        return player
    }

    boolean checkFeature(CardFeature feature) {
        return featureList.contains(feature)
    }

    protected void addFeature(CardFeature feature) {
        this.featureList.add(feature)
    }
}
