package pl.effectivesolutions.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.effectivesolutions.core.arm.Servos;

/**
 * Arm controller.
 * Created by Tomasz Sokół on 2016-03-28.
 */
@RestController
@RequestMapping(value = "/arm")
public class ArmController {

    @Autowired
    private pl.effectivesolutions.core.arm.ArmController armController;

    @RequestMapping("/foot/max")
    void setMaxFootPosition() {
        armController.setMaxPosition(Servos.FOOT);
    }

    @RequestMapping("/foot/min")
    void setMinFootPosition() {
        armController.setMinPosition(Servos.FOOT);
    }

    @RequestMapping("/foot/degree/{degree}")
    void setFootDegree(@PathVariable("degree") int degree) {
        armController.setDegreePosition(Servos.FOOT, degree);
    }

    @RequestMapping("/root/max")
    void setMaxRootPosition() {
        armController.setMaxPosition(Servos.ROOT);
    }

    @RequestMapping("/root/min")
    void setMinRootPosition() {
        armController.setMinPosition(Servos.ROOT);
    }

    @RequestMapping("/root/degree/{degree}")
    void setRootDegree(@PathVariable("degree") int degree) {
        armController.setDegreePosition(Servos.ROOT, degree);
    }
}
