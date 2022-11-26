import de.michelblank.osgivsjigsaw.jigsaw.storagedevice.StorageDevice;
import de.michelblank.osgivsjigsaw.jigsaw.harddiskdrive.HardDiskDrive;

module HardDiskDrive {
    requires StorageDevice;
    provides StorageDevice with HardDiskDrive;
}

