package com.amazon.alexa.location.phase3.sensor;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.location.phase3.LocationSignal;
import com.amazon.alexa.location.phase3.SensorController;
import com.amazon.alexa.location.utils.MetricsUtil;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public abstract class AbstractSensor {
    protected final LazyComponent<Mobilytics> mobilytics;

    public AbstractSensor(@NonNull LazyComponent<Mobilytics> lazyComponent) {
        this.mobilytics = lazyComponent;
    }

    public boolean canHandleIntent(@Nullable Intent intent) {
        return intent != null && getCorrespondingIntentActions().contains(intent.getAction());
    }

    @NonNull
    public abstract Set<String> getCorrespondingIntentActions();

    @NonNull
    public abstract String getSensorName();

    public List<? extends LocationSignal> processInput(@NonNull Intent intent) {
        if (!canHandleIntent(intent)) {
            return new ArrayList(0);
        }
        this.mobilytics.get().recordOccurrence(BitVector$$ExternalSyntheticOutline0.m(getSensorName(), "_invoked"), true, "location", MetricsUtil.buildSubComponentName("location", "phase3"), OwnerIdentifier.APP_LOCATION_LIBRARIES_ANDROID);
        return processInternal(intent);
    }

    public abstract List<? extends LocationSignal> processInternal(@NonNull Intent intent);

    public abstract void startInternal(SensorController.SensorState sensorState);

    public abstract void stopInternal();

    public void toggleSensorState(SensorController.SensorState sensorState) {
        if (SensorController.SensorState.OFF.equals(sensorState) || SensorController.SensorState.DEFAULT.equals(sensorState)) {
            stopInternal();
            this.mobilytics.get().recordOccurrence(BitVector$$ExternalSyntheticOutline0.m(getSensorName(), "_stopped"), true, "location", MetricsUtil.buildSubComponentName("location", "phase3"), OwnerIdentifier.APP_LOCATION_LIBRARIES_ANDROID);
        } else {
            startInternal(sensorState);
            this.mobilytics.get().recordOccurrence(BitVector$$ExternalSyntheticOutline0.m(getSensorName(), "_started"), true, "location", MetricsUtil.buildSubComponentName("location", "phase3"), OwnerIdentifier.APP_LOCATION_LIBRARIES_ANDROID);
        }
    }
}
