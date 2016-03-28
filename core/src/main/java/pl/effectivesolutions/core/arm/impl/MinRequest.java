package pl.effectivesolutions.core.arm.impl;

/**
 * Request setting servo in min position.
 * Created by Tomasz Sokół on 2016-03-27.
 */
public class MinRequest implements Request {

    private static MinRequest instance;

    private MinRequest() {

    }

    public static MinRequest instance() {
        if (instance == null) {
            instance = new MinRequest();
        }
        return instance;
    }

    @Override
    public int target() {
        return PositionLimits.MIN.getValue();
    }
}
