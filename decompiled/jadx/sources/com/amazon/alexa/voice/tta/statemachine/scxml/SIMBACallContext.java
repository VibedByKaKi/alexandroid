package com.amazon.alexa.voice.tta.statemachine.scxml;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.TextResponse;
import com.amazon.alexa.mobilytics.event.userinteraction.InteractionType;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/voice/tta/statemachine/scxml/SIMBACallContext;", "", "avsTextResponse", "Lcom/amazon/alexa/api/TextResponse;", InteractionType.UTTERANCE, "", "<init>", "(Lcom/amazon/alexa/api/TextResponse;Ljava/lang/String;)V", "getAvsTextResponse", "()Lcom/amazon/alexa/api/TextResponse;", "getUtterance", "()Ljava/lang/String;", "uuid", "getUuid", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class SIMBACallContext {

    @NotNull
    private final TextResponse avsTextResponse;

    @NotNull
    private final String utterance;

    @NotNull
    private final String uuid;

    public SIMBACallContext(@NotNull TextResponse textResponse, @NotNull String str) {
        textResponse.getClass();
        str.getClass();
        this.avsTextResponse = textResponse;
        this.utterance = str;
        this.uuid = TableInfo$$ExternalSyntheticOutline0.m();
    }

    public boolean equals(@Nullable Object other) {
        SIMBACallContext sIMBACallContext = other instanceof SIMBACallContext ? (SIMBACallContext) other : null;
        if (sIMBACallContext == null) {
            return false;
        }
        return Intrinsics.areEqual(this.uuid, sIMBACallContext.uuid);
    }

    @NotNull
    public final TextResponse getAvsTextResponse() {
        return this.avsTextResponse;
    }

    @NotNull
    public final String getUtterance() {
        return this.utterance;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }
}
