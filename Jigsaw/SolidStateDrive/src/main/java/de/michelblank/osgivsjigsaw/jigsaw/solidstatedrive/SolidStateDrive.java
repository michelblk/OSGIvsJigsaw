package de.michelblank.osgivsjigsaw.jigsaw.solidstatedrive;

import de.michelblank.osgivsjigsaw.jigsaw.storagedevice.StorageDevice;

public class SolidStateDrive implements StorageDevice {
    @Override
    public String getType() {
        return "SSD";
    }
}
