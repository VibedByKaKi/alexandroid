package com.amazon.alexa.client.alexaservice.base.system;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class AvsExceptionEncounteredEvent extends Event.NotGated {
    public static AvsExceptionEncounteredEvent create(ExceptionCode exceptionCode, @Nullable String str) {
        return new AutoValue_AvsExceptionEncounteredEvent(exceptionCode, str);
    }

    public abstract ExceptionCode getCode();

    @Nullable
    public abstract String getDescription();
}
