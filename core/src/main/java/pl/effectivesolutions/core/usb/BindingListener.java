package pl.effectivesolutions.core.usb;

import com.jamief.maestro.binding.LibUsbDriverBinding;
import com.jamierf.maestro.MaestroServoController;
import com.jamierf.maestro.binding.AsyncBindingListener;
import com.jamierf.maestro.settings.Settings;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Tomasz Sokół on 2016-03-26.
 */
public class BindingListener implements AsyncBindingListener<LibUsbDriverBinding> {

    @Setter
    private int servosAvailable;

    @Setter
    private int timeout;

    @Getter
    private MaestroServoController con;

    @Override
    public void onBind(int i, int i1, LibUsbDriverBinding libUsbDriverBinding) {
        Settings.Builder builder = new Settings.Builder();
        builder.setTimeout(timeout);
        builder.setServosAvailable(servosAvailable);
        con = new MaestroServoController(libUsbDriverBinding,builder.build());
    }

    @Override
    public void onException(Throwable throwable) {
        throw new RuntimeException("Cannot bind Meastro device", throwable);
    }
}
