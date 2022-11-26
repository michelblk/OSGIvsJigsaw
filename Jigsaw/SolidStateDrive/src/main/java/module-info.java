import de.michelblank.osgivsjigsaw.jigsaw.storagedevice.StorageDevice;
import de.michelblank.osgivsjigsaw.jigsaw.solidstatedrive.SolidStateDrive;

module SolidStateDrive {
    requires StorageDevice;
    provides StorageDevice with SolidStateDrive;
}