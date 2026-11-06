package com.swmansion.reanimated.sensor;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public enum ReanimatedSensorType {
    ACCELEROMETER(10),
    GYROSCOPE(4),
    GRAVITY(9),
    MAGNETIC_FIELD(2),
    ROTATION_VECTOR(11);

    private final int type;

    ReanimatedSensorType(int i) {
        this.type = i;
    }

    public static ReanimatedSensorType getInstanceById(int i) {
        if (i == 1) {
            return ACCELEROMETER;
        }
        if (i == 2) {
            return GYROSCOPE;
        }
        if (i == 3) {
            return GRAVITY;
        }
        if (i == 4) {
            return MAGNETIC_FIELD;
        }
        if (i == 5) {
            return ROTATION_VECTOR;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("[Reanimated] Unknown sensor type.");
        return null;
    }

    public int getType() {
        return this.type;
    }
}
