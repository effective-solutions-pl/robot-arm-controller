package pl.effectivesolutions.core.arm.impl;

import com.jamief.maestro.binding.LibUsbDriverBinding;
import com.jamierf.maestro.api.Product;
import org.springframework.stereotype.Service;
import pl.effectivesolutions.core.arm.ArmController;
import pl.effectivesolutions.core.arm.Servos;
import pl.effectivesolutions.core.usb.BindingListener;

/**
 * Implementation of arm controller.
 * Created by Tomasz Sokół on 2016-03-27.
 */
@Service
public class ArmControllerImpl implements ArmController {

    public static final int SERVOS_NUMBER = 6;

    private BindingListener contoller;

    public ArmControllerImpl() {
        contoller = new BindingListener();
        contoller.setTimeout(500);
        contoller.setServosAvailable(SERVOS_NUMBER);
        LibUsbDriverBinding.bindToDevice(Product.MICRO6, contoller);
    }

    private void execute(int servo, Request request) {
        contoller.getCon().setTarget(servo, request.target());
    }

    public void setMaxPosition(Servos s) {
        execute(s.getValue(), MaxRequest.instance());
    }

    public void setMinPosition(Servos s) {
        execute(s.getValue(), MinRequest.instance());
    }
}
