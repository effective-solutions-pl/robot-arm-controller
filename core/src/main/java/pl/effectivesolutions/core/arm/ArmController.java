package pl.effectivesolutions.core.arm;

/**
 * Robot afm controller .
 * Created by Tomasz Sokół on 2016-03-27.
 */
public interface ArmController {
    void setMaxPosition(Servos s);

    void setMinPosition(Servos s);

    void setDegreePosition(Servos s, int degree);

}
