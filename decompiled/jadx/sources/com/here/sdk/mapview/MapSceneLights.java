package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.NativeBase;
import com.here.sdk.core.Color;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapSceneLights extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface AttributeSettingCallback {
        void onAttributeSetting(@Nullable AttributeSettingError attributeSettingError);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AttributeSettingCallbackImpl extends NativeBase implements AttributeSettingCallback {
        public AttributeSettingCallbackImpl(long j, Object obj) {
            super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapSceneLights.AttributeSettingCallbackImpl.1
                @Override // com.here.NativeBase.Disposer
                public void disposeNative(long j2) {
                    AttributeSettingCallbackImpl.disposeNativeHandle(j2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static native void disposeNativeHandle(long j);

        @Override // com.here.sdk.mapview.MapSceneLights.AttributeSettingCallback
        public native void onAttributeSetting(@Nullable AttributeSettingError attributeSettingError);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AttributeSettingError {
        NO_LIGHTS(0);

        public final int value;

        AttributeSettingError(int i) {
            this.value = i;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Category {
        MAIN(0),
        BACK(1),
        RIM(2);

        public final int value;

        Category(int i) {
            this.value = i;
        }
    }

    public MapSceneLights(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapSceneLights.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapSceneLights.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @Nullable
    public native Color getColor(@NonNull Category category);

    @Nullable
    public native Direction getDirection(@NonNull Category category);

    @Nullable
    public native Double getIntensity(@NonNull Category category);

    public native void reset();

    public native void setColor(@NonNull Category category, @NonNull Color color, @Nullable AttributeSettingCallback attributeSettingCallback);

    public native void setDirection(@NonNull Category category, @NonNull Direction direction, @Nullable AttributeSettingCallback attributeSettingCallback);

    public native void setIntensity(@NonNull Category category, double d, @Nullable AttributeSettingCallback attributeSettingCallback);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Direction {
        public double altitude;
        public double azimuth;

        public Direction() {
            this.azimuth = 0.0d;
            this.altitude = 0.0d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Direction)) {
                return false;
            }
            Direction direction = (Direction) obj;
            return Double.compare(this.azimuth, direction.azimuth) == 0 && Double.compare(this.altitude, direction.altitude) == 0;
        }

        public int hashCode() {
            return ((JfifUtil.MARKER_EOI + ((int) (Double.doubleToLongBits(this.azimuth) ^ (Double.doubleToLongBits(this.azimuth) >>> 32)))) * 31) + ((int) (Double.doubleToLongBits(this.altitude) ^ (Double.doubleToLongBits(this.altitude) >>> 32)));
        }

        public Direction(double d, double d2) {
            this.azimuth = d;
            this.altitude = d2;
        }
    }
}
