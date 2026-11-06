package com.mapbox.maps.plugin.locationcomponent;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.view.WindowManager;
import androidx.annotation.RestrictTo;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.mobile.heremapsexplore.Constants.ResponseFields;
import com.dee.app.contacts.common.constants.Constants;
import com.mapbox.maps.MapboxLogger;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 :2\u00020\u0001:\u0002:;B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007J\u0015\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\tH\u0000¢\u0006\u0002\b\u001fJ,\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0002J\u0014\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!H\u0002J\b\u0010&\u001a\u00020'H\u0002J\u001a\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020-H\u0002J\u001a\u0010.\u001a\u00020\u001b2\b\u0010/\u001a\u0004\u0018\u00010\u000b2\u0006\u00100\u001a\u00020\"H\u0016J\u0010\u00101\u001a\u00020\u001b2\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020\u001bH\u0002J\u000e\u00105\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007J\u0015\u00106\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\tH\u0000¢\u0006\u0002\b7J\b\u00108\u001a\u00020\u001bH\u0002J\b\u00109\u001a\u00020\u001bH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/LocationCompassEngine;", "Landroid/hardware/SensorEventListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "calibrationListeners", "", "Lcom/mapbox/maps/plugin/locationcomponent/LocationCompassCalibrationListener;", "compassListeners", "Lcom/mapbox/maps/plugin/locationcomponent/LocationCompassEngine$CompassListener;", "compassSensor", "Landroid/hardware/Sensor;", "compassUpdateNextTimestamp", "", "gravitySensor", "gravityValues", "", "magneticFieldSensor", "magneticValues", ModelSourceWrapper.ORIENTATION, "rotationMatrix", "rotationVectorValue", "sensorManager", "Landroid/hardware/SensorManager;", "windowManager", "Landroid/view/WindowManager;", "addCalibrationListener", "", "compassCalibrationListener", "addCompassListener", "compassListener", "addCompassListener$plugin_locationcomponent_release", "adjustWorldAxis", "Lkotlin/Pair;", "", "worldAxisForDeviceAxisX", "worldAxisForDeviceAxisY", "getWorldAxisFromRotation", "isCompassSensorAvailable", "", "lowPassFilter", "newValues", "smoothedValues", "notifyCompassChangeListeners", ResponseFields.HEADING, "", "onAccuracyChanged", "sensor", "accuracy", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "registerSensorListeners", "removeCalibrationListener", "removeCompassListener", "removeCompassListener$plugin_locationcomponent_release", "unregisterSensorListeners", "updateOrientation", "Companion", "CompassListener", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes9.dex */
public final class LocationCompassEngine implements SensorEventListener {

    @Deprecated
    private static final float ALPHA = 0.45f;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final int SENSOR_DELAY_MICROS = 100000;

    @Deprecated
    @NotNull
    private static final String TAG = "LocationCompassProvider";

    @NotNull
    private final Set<LocationCompassCalibrationListener> calibrationListeners;

    @NotNull
    private final Set<CompassListener> compassListeners;

    @Nullable
    private Sensor compassSensor;
    private long compassUpdateNextTimestamp;

    @Nullable
    private Sensor gravitySensor;

    @NotNull
    private float[] gravityValues;

    @Nullable
    private Sensor magneticFieldSensor;

    @NotNull
    private float[] magneticValues;

    @NotNull
    private final float[] orientation;

    @NotNull
    private final float[] rotationMatrix;

    @Nullable
    private float[] rotationVectorValue;

    @NotNull
    private final SensorManager sensorManager;

    @NotNull
    private final WindowManager windowManager;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/LocationCompassEngine$CompassListener;", "", "onCompassChanged", "", "userHeading", "", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface CompassListener {
        void onCompassChanged(float userHeading);
    }

    public LocationCompassEngine(@NotNull Context context) {
        context.getClass();
        Object systemService = context.getApplicationContext().getSystemService("window");
        systemService.getClass();
        this.windowManager = (WindowManager) systemService;
        Object systemService2 = context.getApplicationContext().getSystemService("sensor");
        systemService2.getClass();
        SensorManager sensorManager = (SensorManager) systemService2;
        this.sensorManager = sensorManager;
        this.compassListeners = new LinkedHashSet();
        this.calibrationListeners = new LinkedHashSet();
        this.rotationMatrix = new float[9];
        this.gravityValues = new float[3];
        this.magneticValues = new float[3];
        this.orientation = new float[3];
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        this.compassSensor = defaultSensor;
        if (defaultSensor == null) {
            MapboxLogger.logW(TAG, "Rotation vector sensor not supported on device, falling back to accelerometer and magnetic field.");
            this.gravitySensor = sensorManager.getDefaultSensor(1);
            this.magneticFieldSensor = sensorManager.getDefaultSensor(2);
        }
    }

    private final Pair<Integer, Integer> adjustWorldAxis(float[] orientation, int worldAxisForDeviceAxisX, int worldAxisForDeviceAxisY) {
        float f = orientation[1];
        if (f < -0.7853981633974483d) {
            int rotation = this.windowManager.getDefaultDisplay().getRotation();
            if (rotation == 1) {
                worldAxisForDeviceAxisY = 129;
                worldAxisForDeviceAxisX = 3;
            } else if (rotation == 2) {
                worldAxisForDeviceAxisY = 131;
                worldAxisForDeviceAxisX = 129;
            } else if (rotation != 3) {
                worldAxisForDeviceAxisX = 1;
                worldAxisForDeviceAxisY = 3;
            } else {
                worldAxisForDeviceAxisY = 1;
                worldAxisForDeviceAxisX = 131;
            }
        } else if (f > 0.7853981633974483d) {
            int rotation2 = this.windowManager.getDefaultDisplay().getRotation();
            if (rotation2 == 1) {
                worldAxisForDeviceAxisX = 131;
                worldAxisForDeviceAxisY = 129;
            } else if (rotation2 == 2) {
                worldAxisForDeviceAxisX = 129;
                worldAxisForDeviceAxisY = 3;
            } else if (rotation2 != 3) {
                worldAxisForDeviceAxisX = 1;
                worldAxisForDeviceAxisY = 131;
            } else {
                worldAxisForDeviceAxisY = 1;
                worldAxisForDeviceAxisX = 3;
            }
        } else if (Math.abs(orientation[2]) > 1.5707963267948966d) {
            int rotation3 = this.windowManager.getDefaultDisplay().getRotation();
            worldAxisForDeviceAxisX = 130;
            if (rotation3 != 1) {
                if (rotation3 == 2) {
                    worldAxisForDeviceAxisX = 129;
                    worldAxisForDeviceAxisY = 2;
                } else if (rotation3 != 3) {
                    worldAxisForDeviceAxisY = 130;
                    worldAxisForDeviceAxisX = 1;
                } else {
                    worldAxisForDeviceAxisY = 1;
                    worldAxisForDeviceAxisX = 2;
                }
            }
            worldAxisForDeviceAxisY = 129;
        }
        return TuplesKt.to(Integer.valueOf(worldAxisForDeviceAxisX), Integer.valueOf(worldAxisForDeviceAxisY));
    }

    private final Pair<Integer, Integer> getWorldAxisFromRotation() {
        int rotation = this.windowManager.getDefaultDisplay().getRotation();
        int i = 129;
        int i2 = 2;
        if (rotation == 1) {
            i2 = 129;
            i = 2;
        } else if (rotation == 2) {
            i2 = 130;
        } else if (rotation != 3) {
            i = 1;
        } else {
            i2 = 1;
            i = 130;
        }
        return TuplesKt.to(Integer.valueOf(i), Integer.valueOf(i2));
    }

    private final boolean isCompassSensorAvailable() {
        return this.compassSensor != null;
    }

    private final float[] lowPassFilter(float[] newValues, float[] smoothedValues) {
        if (smoothedValues == null) {
            return newValues;
        }
        int length = newValues.length;
        for (int i = 0; i < length; i++) {
            float f = smoothedValues[i];
            smoothedValues[i] = ErrorUtils$$ExternalSyntheticOutline0.m(newValues[i], f, ALPHA, f);
        }
        return smoothedValues;
    }

    private final void notifyCompassChangeListeners(float heading) {
        Iterator<CompassListener> it2 = this.compassListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onCompassChanged(heading);
        }
    }

    private final void registerSensorListeners() {
        boolean isCompassSensorAvailable = isCompassSensorAvailable();
        SensorManager sensorManager = this.sensorManager;
        if (isCompassSensorAvailable) {
            sensorManager.registerListener(this, this.compassSensor, 100000);
        } else {
            sensorManager.registerListener(this, this.gravitySensor, 100000);
            this.sensorManager.registerListener(this, this.magneticFieldSensor, 100000);
        }
    }

    private final void unregisterSensorListeners() {
        boolean isCompassSensorAvailable = isCompassSensorAvailable();
        SensorManager sensorManager = this.sensorManager;
        if (isCompassSensorAvailable) {
            sensorManager.unregisterListener(this, this.compassSensor);
        } else {
            sensorManager.unregisterListener(this, this.gravitySensor);
            this.sensorManager.unregisterListener(this, this.magneticFieldSensor);
        }
    }

    private final void updateOrientation() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime < this.compassUpdateNextTimestamp) {
            return;
        }
        float[] fArr = this.rotationVectorValue;
        float[] fArr2 = this.rotationMatrix;
        if (fArr != null) {
            SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        } else {
            SensorManager.getRotationMatrix(fArr2, null, this.gravityValues, this.magneticValues);
        }
        Pair<Integer, Integer> worldAxisFromRotation = getWorldAxisFromRotation();
        int intValue = worldAxisFromRotation.component1().intValue();
        int intValue2 = worldAxisFromRotation.component2().intValue();
        float[] fArr3 = new float[9];
        SensorManager.remapCoordinateSystem(this.rotationMatrix, intValue, intValue2, fArr3);
        SensorManager.getOrientation(fArr3, this.orientation);
        Pair<Integer, Integer> adjustWorldAxis = adjustWorldAxis(this.orientation, intValue, intValue2);
        SensorManager.remapCoordinateSystem(this.rotationMatrix, adjustWorldAxis.component1().intValue(), adjustWorldAxis.component2().intValue(), fArr3);
        SensorManager.getOrientation(fArr3, this.orientation);
        notifyCompassChangeListeners((float) Math.toDegrees(this.orientation[0]));
        this.compassUpdateNextTimestamp = elapsedRealtime + 500;
    }

    public final void addCalibrationListener(@NotNull LocationCompassCalibrationListener compassCalibrationListener) {
        compassCalibrationListener.getClass();
        this.calibrationListeners.add(compassCalibrationListener);
    }

    public final void addCompassListener$plugin_locationcomponent_release(@NotNull CompassListener compassListener) {
        compassListener.getClass();
        if (this.compassListeners.isEmpty()) {
            registerSensorListeners();
        }
        this.compassListeners.add(compassListener);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(@Nullable Sensor sensor, int accuracy) {
        if (accuracy == 0) {
            MapboxLogger.logW(TAG, "Compass sensor is unreliable, device calibration is needed.");
            Iterator<LocationCompassCalibrationListener> it2 = this.calibrationListeners.iterator();
            while (it2.hasNext()) {
                it2.next().onCompassCalibrationNeeded();
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(@NotNull SensorEvent event) {
        event.getClass();
        int type = event.sensor.getType();
        if (type == 1) {
            float[] fArr = event.values;
            fArr.getClass();
            this.gravityValues = lowPassFilter(fArr, this.gravityValues);
        } else if (type == 2) {
            float[] fArr2 = event.values;
            fArr2.getClass();
            this.magneticValues = lowPassFilter(fArr2, this.magneticValues);
        } else if (type == 11) {
            this.rotationVectorValue = event.values;
        }
        updateOrientation();
    }

    public final void removeCalibrationListener(@NotNull LocationCompassCalibrationListener compassCalibrationListener) {
        compassCalibrationListener.getClass();
        this.calibrationListeners.remove(compassCalibrationListener);
    }

    public final void removeCompassListener$plugin_locationcomponent_release(@NotNull CompassListener compassListener) {
        compassListener.getClass();
        if (this.compassListeners.remove(compassListener) && this.compassListeners.isEmpty()) {
            unregisterSensorListeners();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/LocationCompassEngine$Companion;", "", "()V", "ALPHA", "", "SENSOR_DELAY_MICROS", "", Constants.LOG_TAG, "", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
