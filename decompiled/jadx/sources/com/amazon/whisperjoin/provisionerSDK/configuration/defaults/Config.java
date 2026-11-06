package com.amazon.whisperjoin.provisionerSDK.configuration.defaults;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class Config {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Bluetooth {
        public static final int BLE_SCAN_MODE = 1;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Overactive {
        public static final long BUCKET_LENGTH_MS = 10000;
        public static final long MONITORING_WINDOW_MS = 180000;
        public static final double THRESHOLD_PERCENTAGE = 50.0d;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Radio {
        public static final long BLE_MINIMUM_SIGNAL_STRENGTH = -100;
        public static final long BLE_RADIO_WAIT_TIME_MILLISECONDS = 10;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Transport {
        public static final int MAX_MESSAGE_SIZE_BYTES = 8192;
        public static final int OPERATION_RETRIES = 3;
        public static final long OPERATION_TIMEOUT_MS = 40000;
    }
}
