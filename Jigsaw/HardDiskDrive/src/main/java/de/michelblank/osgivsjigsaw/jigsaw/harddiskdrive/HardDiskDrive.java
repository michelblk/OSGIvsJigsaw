package de.michelblank.osgivsjigsaw.jigsaw.harddiskdrive;

import de.michelblank.osgivsjigsaw.jigsaw.storagedevice.StorageDevice;

public class HardDiskDrive implements StorageDevice {
    @Override
    public String getType() {
        return "HDD";
    }
}
