package com.amazon.alexa.location.phase3.sensor.motiondetection;

import com.amazon.alexa.location.phase3.evaluator.LocationEvent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class MotionEvent extends LocationEvent {
    public static final int MOTION_ARRIVING = 1;
    public static final int MOTION_DWELLING = 2;
    public static final int MOTION_INTRANSIT = 4;
    public static final int MOTION_LEAVING = 3;
    public static final int MOTION_UNKNOWN = 0;
    public final int state;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface MotionState {
    }

    public MotionEvent(int i, long j) {
        super("MotionEvent", 1, j);
        this.state = i;
    }
}
