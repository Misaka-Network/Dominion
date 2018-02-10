package com.misaka.network.dominion.service.impl;

import com.misaka.network.dominion.core.type.CardEnum;
import com.misaka.network.dominion.core.type.ExpansionEnum;
import com.misaka.network.dominion.service.entity.Card;
import com.misaka.network.dominion.service.type.card.CardFeature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author hyzhou.zhy. 2017/12/19.
 */
public class CardRegistry {
    private static final Map<CardEnum, CardStatic> cardStaticMap = new HashMap<CardEnum, CardStatic>();

    public static void register(CardEnum cardEnum, CardStatic cardInfo) {
        cardStaticMap.put(cardEnum, cardInfo);
    }

    public static Card getNewInstance(CardEnum cardEnum) {
        Class<? extends Card> cardClass = getCardStatic(cardEnum).getInstanceType();
        try {
            return cardClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("No Such Card Creator");
    }

    public static boolean getIsSupply(CardEnum cardEnum) {
        return getCardStatic(cardEnum).getIsSupply();
    }

    public static ExpansionEnum getExpansionType(CardEnum cardEnum) {
        return getCardStatic(cardEnum).getExpansion();
    }

    public static List<CardFeature> getFeatureList(CardEnum cardEnum) {
        return getCardStatic(cardEnum).getFeatureList();
    }

    public static int getCost(CardEnum cardEnum) {
        return getCardStatic(cardEnum).getCost();
    }

    private static CardStatic getCardStatic(CardEnum cardEnum) {
        CardStatic cardStatic = cardStaticMap.get(cardEnum);
        if (cardStatic == null) {
            throw new RuntimeException("No Such CardEnum");
        }
        return cardStatic;
    }

    public static class CardStatic {
        protected int cost;                             // 卡片费用
        protected boolean isSupply;                     // 公国牌堆
        protected ExpansionEnum expansionType;          // 扩充类型
        protected Class<? extends Card> instanceType;   // 实例类型

        protected List<CardFeature> featureList = new ArrayList<CardFeature>();   // 类型属性

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        public boolean getIsSupply() {
            return isSupply;
        }

        public void setIsSupply(boolean supply) {
            this.isSupply = supply;
        }

        public ExpansionEnum getExpansion() {
            return expansionType;
        }

        public void setExpansion(ExpansionEnum expansion) {
            this.expansionType = expansion;
        }

        public Class<? extends Card> getInstanceType() {
            return instanceType;
        }

        public void setInstanceType(Class<? extends Card> instanceType) {
            this.instanceType = instanceType;
        }

        public List<CardFeature> getFeatureList() {
            return featureList;
        }

        public void setFeatureList(List<CardFeature> featureList) {
            this.featureList = featureList;
        }
    }
}
