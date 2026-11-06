package com.amazon.ptz.util;

import com.amazon.ptzcontroller.lib.model.api.ptz.directive.CameraPtzInstance;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.ptz.util.Direction$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$ptz$util$Direction;

        static {
            int[] iArr = new int[Direction.values().length];
            $SwitchMap$com$amazon$ptz$util$Direction = iArr;
            try {
                iArr[Direction.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$ptz$util$Direction[Direction.UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$ptz$util$Direction[Direction.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$ptz$util$Direction[Direction.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static Direction getDirection(float f, float f2) {
        return Math.abs(f) > Math.abs(f2) ? f > 0.0f ? RIGHT : LEFT : f2 > 0.0f ? DOWN : UP;
    }

    public static CameraPtzInstance mapToPtzInstance(Direction direction) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$ptz$util$Direction[direction.ordinal()];
        if (i == 1 || i == 2) {
            return CameraPtzInstance.CAMERA_TILT;
        }
        if (i == 3 || i == 4) {
            return CameraPtzInstance.CAMERA_PAN;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Unexpected direction encountered in mapToPtzCapability");
        return null;
    }
}
