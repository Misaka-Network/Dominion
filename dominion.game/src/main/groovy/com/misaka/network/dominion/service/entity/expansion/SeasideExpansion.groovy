package com.misaka.network.dominion.service.entity.expansion

import com.misaka.network.dominion.core.type.ExpansionEnum
import com.misaka.network.dominion.service.entity.Expansion
import groovy.transform.CompileStatic

/**
 * 海岸扩充
 *
 * @author hyzhou.zhy. 2017/12/16.
 */
@CompileStatic
class SeasideExpansion extends Expansion {
    SeasideExpansion() {
        super(ExpansionEnum.Seaside)
    }
}
