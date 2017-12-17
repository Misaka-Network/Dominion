package com.misaka.network.dominion.service.entity;

import com.misaka.network.dominion.service.api.GameEngine;

/**
 * @author hyzhou.zhy. 2017/12/16.
 */

public abstract class Token {
    protected Long id;

    protected Player player;                  // 持有者
    protected GameEngine game;                // 游戏实例
}
