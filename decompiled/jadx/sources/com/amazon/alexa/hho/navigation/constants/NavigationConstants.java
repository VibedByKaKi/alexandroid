package com.amazon.alexa.hho.navigation.constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class NavigationConstants {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class LocationFilterThresholds {
        public static final double DEFAULT_SPEED_VARIANCE_M2PS2 = 9.0d;
        public static final double MAX_HORIZONTAL_ACCURACY_METERS = 50.0d;
        public static final double MAX_PLAUSIBLE_SPEED_MPS = 13.88888888888889d;
        public static final double PROCESS_NOISE_MPS = 5.0d;
        public static final double SPEED_PROCESS_NOISE_MPS2 = 0.1d;
        public static final double STATIONARY_ENTER_SPEED_MPS = 0.3d;
        public static final double STATIONARY_EXIT_SPEED_MPS = 0.6d;
        public static final double STATIONARY_VARIANCE_INFLATION = 50.0d;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NavigationDirectiveTransportMode {
        public static final String BIKING = "BIKING";
        public static final String DRIVING = "DRIVING";
        public static final String TRANSIT = "TRANSIT";
        public static final String WALKING = "WALKING";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TransitNavigationThresholds {
        public static final double BEARING_DETECTION_THRESHOLD_METERS = 10.0d;
        public static final double DRIFT_DISTANCE_THRESHOLD_METERS = 10.0d;
        public static final double REROUTE_THRESHOLD_METERS = 30.0d;
        public static final double SEGMENT_ADVANCE_THRESHOLD_METERS = 15.0d;
    }
}
