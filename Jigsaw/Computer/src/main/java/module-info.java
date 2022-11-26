import de.michelblank.osgivsjigsaw.jigsaw.storagedevice.StorageDevice;

module Computer {
    exports de.michelblank.osgivsjigsaw.jigsaw.computer;
    requires StorageDevice;
    uses StorageDevice;
}