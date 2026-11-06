package com.amazon.alexa.voice.tta.metrics;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.tta.metrics.TtaEvent;
import com.google.auto.value.AutoValue;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes19.dex */
public abstract class TtaIngressEvent implements TtaEvent {
    public static final TtaIngressEvent UNKNOWN = create("UNKNOWN");

    @NonNull
    public static TtaIngressEvent create(@NonNull String str) {
        return new AutoValue_TtaIngressEvent(str);
    }

    @Override // com.amazon.alexa.voice.ui.tta.metrics.TtaEvent
    @NonNull
    public String getName() {
        return a$$ExternalSyntheticOutline0.m("TTA_INGRESS:", getReferrer());
    }

    @NonNull
    public abstract String getReferrer();
}
