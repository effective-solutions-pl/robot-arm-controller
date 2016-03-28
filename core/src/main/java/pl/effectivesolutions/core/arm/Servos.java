package pl.effectivesolutions.core.arm;

import lombok.Getter;

/**
 * Created by Tomasz Sokół on 2016-03-27.
 */
public enum Servos {
    FOOT(5),ROOT(4);

    @Getter
    private int value;

    private Servos(int value) {
        this.value = value;
    }
}
