package de.michelblank.osgivsjigsaw.osgi.computer;

import de.michelblank.osgivsjigsaw.osgi.storagedevice.StorageDevice;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import java.util.List;

@Component(
        service = Computer.class,
        immediate = true
)
public class Computer {
    @Reference(cardinality = ReferenceCardinality.MULTIPLE)
    List<StorageDevice> storageDeviceList;

    @Activate
    public void activate() {
        String[] storageDeviceTypes = storageDeviceList.stream().map(StorageDevice::getType).toArray(String[]::new);

        System.out.print(storageDeviceList.size() + " Speichermedien gefunden: ");
        System.out.println(String.join(", ", storageDeviceTypes));
    }
}
