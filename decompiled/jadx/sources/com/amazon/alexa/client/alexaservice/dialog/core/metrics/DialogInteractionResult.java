package com.amazon.alexa.client.alexaservice.dialog.core.metrics;

import com.amazon.alexa.api.AlexaMetricsName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class DialogInteractionResult {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum FailureKeys {
        STATUS_CODE,
        EXCEPTION_MESSAGE,
        EXCEPTION_TYPE
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Reason {
        AlexaMetricsName getMetricName();

        Type getType();

        boolean isNetworkFailure();

        void setTextDialog(boolean z);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        ABANDONED,
        CANCEL,
        FAILURE,
        SUCCESS
    }
}
