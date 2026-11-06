package com.amazon.alexa.cantilever;

import androidx.annotation.NonNull;
import com.amazon.alexa.cantilever.HelpMetricsConstants;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class HelpMetricsService {
    private static final String TAG = "HelpMetricsService";
    private final LazyComponent<Mobilytics> mobilytics;

    public HelpMetricsService(ComponentRegistry componentRegistry) {
        this.mobilytics = componentRegistry.getLazy(Mobilytics.class);
    }

    private void recordError(String str, @NonNull String str2) {
        this.mobilytics.get().recordCriticalEvent(str, str, HelpMetricsConstants.ComponentName.CANTILEVER, HelpMetricsConstants.ComponentName.CANTILEVER_SUB, new Throwable(str2), "cbea4080-337a-4b7e-8e0b-ea16ec85c09a");
    }

    private void recordOccurrence(String str) {
        this.mobilytics.get().recordOccurrence(str, true, HelpMetricsConstants.ComponentName.CANTILEVER, HelpMetricsConstants.ComponentName.CANTILEVER_SUB, "cbea4080-337a-4b7e-8e0b-ea16ec85c09a");
    }

    public void recordHelpLoadAttempt() {
        recordOccurrence(HelpMetricsConstants.EventName.LOAD_ATTEMPT);
    }

    public void recordHelpLoadCancel() {
        recordOccurrence(HelpMetricsConstants.EventName.LOAD_CANCEL);
    }

    public void recordHelpLoadHttpError(int i, @NonNull String str) {
        recordError(a$$ExternalSyntheticOutline0.m(i, HelpMetricsConstants.EventName.LOAD_ERROR_PREFIX_HTTP), str);
    }

    public void recordHelpLoadOtherError(int i, @NonNull String str) {
        recordError(HelpMetricsConstants.EventName.LOAD_ERROR_PREFIX_OTHER, i + ":" + str);
    }

    public void recordHelpLoadSignIn() {
        recordOccurrence(HelpMetricsConstants.EventName.LOAD_SIGNIN);
    }

    public void recordHelpLoadSuccess() {
        recordOccurrence(HelpMetricsConstants.EventName.LOAD_SUCCESS);
    }

    public void recordJsEvent(String str) {
        recordOccurrence(a$$ExternalSyntheticOutline0.m(HelpMetricsConstants.EventName.JS_EVENT_PREFIX, str));
    }

    public HelpMetricsService() {
        this(ComponentRegistry.getInstance());
    }
}
