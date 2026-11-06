package com.amazon.alexa.assistant.metric;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/metric/OpenVoiceTurn;", "", "invocationType", "", "<init>", "(Ljava/lang/String;)V", "getInvocationType", "()Ljava/lang/String;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final class OpenVoiceTurn {

    @Nullable
    private final String invocationType;

    public OpenVoiceTurn(@Nullable String str) {
        this.invocationType = str;
    }

    @Nullable
    public final String getInvocationType() {
        return this.invocationType;
    }
}
