package com.amazon.alexa.accessoryclient.common.connection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class Constants {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ConnectionChannels {
        public static final int INITIALIZE = 0;
        public static final int MAIN = 2;
        public static final int TEAR_DOWN = 1;

        private ConnectionChannels() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Keys {
        public static final String CLIENT_CONNECTION_ACCEPTED = "clientConnectionAccepted";
        public static final String MAJOR_VERSION_KEY = "majorVersion";
        public static final String MINOR_VERSION_KEY = "minorVersion";
        public static final String TOP_LEVEL_BUNDLE_DATA_KEY = "data";
        public static final String UUID_KEY = "uuid";
    }

    private Constants() {
    }
}
