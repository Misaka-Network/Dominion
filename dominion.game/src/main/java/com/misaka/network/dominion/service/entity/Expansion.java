package com.misaka.network.dominion.service.entity;

import com.misaka.network.dominion.core.type.ExpansionEnum;

/**
 * @author hyzhou.zhy. 2017/12/16.
 */

public abstract class Expansion {
    private ExpansionEnum expansionType;

    public Expansion(ExpansionEnum expansionType) {
        this.expansionType = expansionType;
    }
}
