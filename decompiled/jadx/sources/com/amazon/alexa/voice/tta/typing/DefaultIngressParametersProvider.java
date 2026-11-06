package com.amazon.alexa.voice.tta.typing;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.voice.tta.metrics.EventClock;
import com.amazon.alexa.voice.tta.metrics.EventTime;
import com.amazon.alexa.voice.tta.typing.IngressParameters;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DefaultIngressParametersProvider implements IngressParameters.Provider {
    private static final String TAG = "DefaultIngressParametersProvider";
    private static final long UNKNOWN_TIME = Long.MIN_VALUE;
    private final EventClock eventClock;
    private IngressParameters ingressParameters = null;

    public DefaultIngressParametersProvider(@NonNull EventClock eventClock) {
        this.eventClock = eventClock;
    }

    @Override // com.amazon.alexa.voice.tta.typing.IngressParameters.Provider
    @NonNull
    public IngressParameters getIngressParameters() {
        IngressParameters ingressParameters = this.ingressParameters;
        if (ingressParameters != null) {
            return ingressParameters;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("IngressParameters.Provider.update() must be called before getIngressParameters()");
        return null;
    }

    @Override // com.amazon.alexa.voice.tta.typing.IngressParameters.Provider
    public void update(@Nullable Intent intent) {
        long longExtra;
        String str;
        Objects.toString(intent);
        if (intent == null) {
            str = null;
            longExtra = Long.MIN_VALUE;
        } else {
            String stringExtra = intent.getStringExtra("referer");
            longExtra = intent.getLongExtra("startTimestamp", Long.MIN_VALUE);
            str = stringExtra;
        }
        EventClock eventClock = this.eventClock;
        EventTime now = longExtra == Long.MIN_VALUE ? eventClock.now() : eventClock.fromSystemTimeMilliseconds(longExtra);
        if (str == null) {
            str = "UNKNOWN";
        }
        IngressParameters create = IngressParameters.create(str, now);
        this.ingressParameters = create;
        Objects.toString(create);
    }
}
