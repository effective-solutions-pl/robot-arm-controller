package pl.effectivesolutions.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.effectivesolutions.core.arm.Servos;

/**
 * Arm controller.
 * Created by Tomasz Sokół on 2016-03-28.
 */
@RestController
@RequestMapping(value="/arm")
public class ArmController {

    @Autowired
    private pl.effectivesolutions.core.arm.ArmController armController;

    @RequestMapping("/maxFoot")
    void setMaxFootPosition(){
        armController.setMaxPosition(Servos.FOOT);
    }

    @RequestMapping("/maxRoot")
    void setMaxRootPosition(){
        armController.setMaxPosition(Servos.ROOT);
    }

    @RequestMapping("/minFoot")
    void setMinFootPosition(){
        armController.setMinPosition(Servos.FOOT);
    }

    @RequestMapping("/minRoot")
    void setMinRootPosition(){
        armController.setMinPosition(Servos.ROOT);
    }
}
