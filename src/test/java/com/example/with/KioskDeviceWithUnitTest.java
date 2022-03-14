package com.example.with;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KioskDeviceWithUnitTest {

    @Test
    public void whenDeviceInspected_thenClonedAndUpdated() {
        KioskDevice device = new KioskDevice("S-001", false);

        Device inspectedDevice = device.withInspected(true);

        assertNotSame(inspectedDevice, device);
        assertFalse(device.isInspected());
        assertTrue(inspectedDevice.isInspected());
    }
}
