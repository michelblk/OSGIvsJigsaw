package de.michelblank.osgivsjigsaw.jigsaw.computer;

import de.michelblank.osgivsjigsaw.jigsaw.storagedevice.StorageDevice;

import java.util.ServiceLoader;

public class Computer {
    public static void main(String[] args) {
        new Computer().printStorageDevices();
    }

    public void printStorageDevices() {
        ServiceLoader<StorageDevice> serviceLoader = ServiceLoader.load(StorageDevice.class);

        int i = 0;
        for (StorageDevice currentStorageDevice : serviceLoader) {
            System.out.println("Speichermedien vom Typ " + currentStorageDevice.getType() + " gefunden");
            i++;
        }
        System.out.println("Gefundene Speichermedien: " + i);
    }
}
