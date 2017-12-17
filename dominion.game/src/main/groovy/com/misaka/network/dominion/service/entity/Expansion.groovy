package com.misaka.network.dominion.service.entity

import com.misaka.network.dominion.core.type.ExpansionEnum
import groovy.transform.CompileStatic
/**
 * @author hyzhou.zhy. 2017/12/16.
 */
@CompileStatic
abstract class Expansion {
    private ExpansionEnum expansionType

    Expansion(ExpansionEnum expansionType) {
        this.expansionType = expansionType
    }
}
