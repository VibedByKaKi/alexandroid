package com.amazon.alexa.location.phase3.sensor.activity;

import com.amazon.alexa.location.phase3.LocationSignal;
import com.google.android.gms.location.ActivityRecognitionResult;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class ActivitySensorInput extends LocationSignal {
    private static final String TYPE = "ActivitySensorInput";
    public final int activityType;
    public final int confidence;

    public ActivitySensorInput(long j, int i, int i2) {
        super(TYPE, 1, j);
        this.activityType = i;
        this.confidence = i2;
    }

    public static ActivitySensorInput fromActicityRecognitionResult(ActivityRecognitionResult activityRecognitionResult) {
        return new ActivitySensorInput(activityRecognitionResult.getTime(), activityRecognitionResult.getMostProbableActivity().getType(), activityRecognitionResult.getMostProbableActivity().getConfidence());
    }
}
