package com.misaka.network.dominion.service.entity.token

import com.misaka.network.dominion.service.ability.token.TokenAbility
import com.misaka.network.dominion.service.entity.Token

/**
 * @author hyzhou.zhy. 2017/12/16.
 */
class BuyToken extends Token implements TokenAbility {

    @Override
    void use() {
        player.buys++
    }
}
