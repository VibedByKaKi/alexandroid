package com.amazon.comms.calling.domain.model.dataChannel;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/amazon/comms/calling/domain/model/dataChannel/RemoveEffectEvent;", "", "requestId", "", "effectsSessionId", "effectId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRequestId", "()Ljava/lang/String;", "getEffectsSessionId", "getEffectId", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class RemoveEffectEvent {

    @SerializedName("effectId")
    @Nullable
    private final String effectId;

    @SerializedName("effectsSessionId")
    @NotNull
    private final String effectsSessionId;

    @SerializedName("requestId")
    @NotNull
    private final String requestId;

    public RemoveEffectEvent(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        str.getClass();
        str2.getClass();
        this.requestId = str;
        this.effectsSessionId = str2;
        this.effectId = str3;
    }

    public static /* synthetic */ RemoveEffectEvent copy$default(RemoveEffectEvent removeEffectEvent, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = removeEffectEvent.requestId;
        }
        if ((i & 2) != 0) {
            str2 = removeEffectEvent.effectsSessionId;
        }
        if ((i & 4) != 0) {
            str3 = removeEffectEvent.effectId;
        }
        return removeEffectEvent.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getEffectsSessionId() {
        return this.effectsSessionId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getEffectId() {
        return this.effectId;
    }

    @NotNull
    public final RemoveEffectEvent copy(@NotNull String requestId, @NotNull String effectsSessionId, @Nullable String effectId) {
        requestId.getClass();
        effectsSessionId.getClass();
        return new RemoveEffectEvent(requestId, effectsSessionId, effectId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoveEffectEvent)) {
            return false;
        }
        RemoveEffectEvent removeEffectEvent = (RemoveEffectEvent) other;
        return Intrinsics.areEqual(this.requestId, removeEffectEvent.requestId) && Intrinsics.areEqual(this.effectsSessionId, removeEffectEvent.effectsSessionId) && Intrinsics.areEqual(this.effectId, removeEffectEvent.effectId);
    }

    @Nullable
    public final String getEffectId() {
        return this.effectId;
    }

    @NotNull
    public final String getEffectsSessionId() {
        return this.effectsSessionId;
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        int a2 = b.a(this.effectsSessionId, this.requestId.hashCode() * 31, 31);
        String str = this.effectId;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.requestId;
        String str2 = this.effectsSessionId;
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("RemoveEffectEvent(requestId=", str, ", effectsSessionId=", str2, ", effectId="), this.effectId, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ RemoveEffectEvent(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
