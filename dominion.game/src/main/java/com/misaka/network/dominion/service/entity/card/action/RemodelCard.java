package com.misaka.network.dominion.service.entity.card.action;

import com.misaka.network.dominion.core.type.CardEnum;
import com.misaka.network.dominion.core.type.ExpansionEnum;
import com.misaka.network.dominion.service.entity.Card;
import com.misaka.network.dominion.service.entity.card.ActionCard;
import com.misaka.network.dominion.service.impl.CardRegistry;
import com.misaka.network.dominion.service.type.card.CardFeature;

import java.util.*;

/**
 * @author hyzhou.zhy. 2017/12/23.
 */
public class RemodelCard extends ActionCard {
    static {
        CardRegistry.register(CardEnum.Remodel, new CardRegistry.CardStatic() {{
            setCost(4);
            setIsSupply(true);
            setExpansion(ExpansionEnum.Dominion);
            setFeatureList(Arrays.asList(CardFeature.ACTION));
            setInstanceType(RemodelCard.class);
        }});
    }

    public RemodelCard() {
        super(CardEnum.Village);
    }

    @Override
    public void use() {
        List<Card> handCards = game.getPlayer(player).getHandCards();
        Card trashCard = game.choiceCard(player, handCards);
        game.trash(player, trashCard);

        List<Card> enableChoices = new ArrayList<Card>();
        Set<Map.Entry<CardEnum, List<Card>>> cardPileMap = new HashSet<Map.Entry<CardEnum, List<Card>>>();
        cardPileMap.addAll(game.getSupplyCardPileList().entrySet());
        cardPileMap.addAll(game.getBasicCardPileList().entrySet());
        for (Map.Entry<CardEnum, List<Card>> cardPile : cardPileMap) {
            if (!cardPile.getValue().isEmpty()) {
                Card card = cardPile.getValue().get(0);
                if (card.getCost() + 2 <= trashCard.getCost()) {
                    enableChoices.add(card);
                }
            }
        }
        game.gain(player, game.choiceCard(player, enableChoices));
    }
}
