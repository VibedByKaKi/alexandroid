package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/VoiceInputUiConfig;", "", "enableVoice", "", "enableVoiceChat", "<init>", "(ZZ)V", "getEnableVoice", "()Z", "getEnableVoiceChat", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class VoiceInputUiConfig {
    public static final int $stable = 0;
    private final boolean enableVoice;
    private final boolean enableVoiceChat;

    public /* synthetic */ VoiceInputUiConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
    }

    public static /* synthetic */ VoiceInputUiConfig copy$default(VoiceInputUiConfig voiceInputUiConfig, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = voiceInputUiConfig.enableVoice;
        }
        if ((i & 2) != 0) {
            z2 = voiceInputUiConfig.enableVoiceChat;
        }
        return voiceInputUiConfig.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnableVoice() {
        return this.enableVoice;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnableVoiceChat() {
        return this.enableVoiceChat;
    }

    @NotNull
    public final VoiceInputUiConfig copy(boolean enableVoice, boolean enableVoiceChat) {
        return new VoiceInputUiConfig(enableVoice, enableVoiceChat);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceInputUiConfig)) {
            return false;
        }
        VoiceInputUiConfig voiceInputUiConfig = (VoiceInputUiConfig) other;
        return this.enableVoice == voiceInputUiConfig.enableVoice && this.enableVoiceChat == voiceInputUiConfig.enableVoiceChat;
    }

    public final boolean getEnableVoice() {
        return this.enableVoice;
    }

    public final boolean getEnableVoiceChat() {
        return this.enableVoiceChat;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enableVoiceChat) + (Boolean.hashCode(this.enableVoice) * 31);
    }

    @NotNull
    public String toString() {
        return "VoiceInputUiConfig(enableVoice=" + this.enableVoice + ", enableVoiceChat=" + this.enableVoiceChat + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public VoiceInputUiConfig(boolean z, boolean z2) {
        this.enableVoice = z;
        this.enableVoiceChat = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VoiceInputUiConfig() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.ra.core.data.model.VoiceInputUiConfig.<init>():void");
    }
}
