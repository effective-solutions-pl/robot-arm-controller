package pl.effectivesolutions.core.arm.impl;

import lombok.Getter;

/**
 * Defines max
 * Created by Tomasz Sokół on 2016-03-27.
 */
enum PositionLimits {
    MAX(8000), MIN(3968);

    @Getter
    private int value;

    private PositionLimits(int value) {
        this.value = value;
    }
}
