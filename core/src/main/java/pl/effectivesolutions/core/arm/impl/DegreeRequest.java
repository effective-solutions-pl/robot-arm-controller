package pl.effectivesolutions.core.arm.impl;

/**
 * Request moving servo to position from 0 to 60 drgrees.
 * Created by Tomasz Sokół on 2016-03-28.
 */
public class DegreeRequest implements Request {
    private static final int DEGREE_VALUE = 67;

    private static final int MAX = 60;

    private static final int MIN = 0;

    private int value;

    public DegreeRequest(int degree) {
        int val = degree;
        if (degree < MIN) {
            val = MIN;
        } else if (degree > MAX) {
            val = MAX;
        }
        value = PositionLimits.MIN.getValue() + val * DEGREE_VALUE;
    }

    @Override
    public int target() {
        return value;
    }
}
