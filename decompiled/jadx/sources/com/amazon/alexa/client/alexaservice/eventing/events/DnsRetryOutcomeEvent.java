package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class DnsRetryOutcomeEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Outcome {
        SUCCEEDED_ON_ATTEMPT_2,
        SUCCEEDED_ON_ATTEMPT_3,
        SUCCEEDED_ON_ATTEMPT_4,
        SUCCEEDED_ON_ATTEMPT_5,
        GAVE_UP_EXHAUSTED,
        GAVE_UP_OFFLINE,
        GAVE_UP_CANCELED,
        GAVE_UP_OTHER_ERROR,
        GAVE_UP_INTERRUPTED;

        public static Outcome succeededOnAttempt(int i) {
            if (i == 2) {
                return SUCCEEDED_ON_ATTEMPT_2;
            }
            if (i == 3) {
                return SUCCEEDED_ON_ATTEMPT_3;
            }
            if (i == 4) {
                return SUCCEEDED_ON_ATTEMPT_4;
            }
            if (i == 5) {
                return SUCCEEDED_ON_ATTEMPT_5;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "No outcome for a response on attempt "));
            return null;
        }
    }

    public static DnsRetryOutcomeEvent create(int i, Outcome outcome) {
        return new AutoValue_DnsRetryOutcomeEvent(i, outcome);
    }

    public abstract int getMaxRetries();

    public abstract Outcome getOutcome();
}
