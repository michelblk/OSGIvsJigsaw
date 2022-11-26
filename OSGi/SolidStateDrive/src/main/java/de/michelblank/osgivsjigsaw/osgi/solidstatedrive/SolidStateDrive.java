package de.michelblank.osgivsjigsaw.osgi.solidstatedrive;

import de.michelblank.osgivsjigsaw.osgi.storagedevice.StorageDevice;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

@Component(
        service = StorageDevice.class,
        immediate = false
)
public class SolidStateDrive implements StorageDevice {
    @Activate
    public void activate() {
        System.out.println(getType() + " wird gestartet");
    }

    @Deactivate
    public void deactivate() {
        System.out.println(getType() + " wird gestoppt");
    }

    @Override
    public String getType() {
        return "SSD";
    }
}
