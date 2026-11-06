package com.amazon.alexa.enrollment.voiceSDK.enrollmentEvents;

import android.util.Log;
import com.amazon.alexa.enrollment.voiceSDK.enrollmentEvents.events.EnrollmentBaseEvent;
import org.greenrobot.eventbus.EventBus;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EnrollmentEventBus {
    private static final String TAG = "VoxEn_EnrollmentEventBus";
    private EventBus eventBus;

    public EnrollmentEventBus(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void deRegister(Object obj) {
        this.eventBus.unregister(obj);
    }

    public void register(Object obj) {
        this.eventBus.register(obj);
    }

    public void sendEvent(EnrollmentBaseEvent enrollmentBaseEvent) {
        Log.i(TAG, "Sending event");
        this.eventBus.post(enrollmentBaseEvent);
    }
}
