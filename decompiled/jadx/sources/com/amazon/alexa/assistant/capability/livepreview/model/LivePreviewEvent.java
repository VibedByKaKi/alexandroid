package com.amazon.alexa.assistant.capability.livepreview.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/amazon/alexa/assistant/capability/livepreview/model/LivePreviewEvent;", "", "text", "", "sequence", "Lcom/amazon/alexa/assistant/capability/livepreview/model/TranscriptSequence;", "direction", "Lcom/amazon/alexa/assistant/capability/livepreview/model/TranscriptDirection;", "locale", "dialogRequestId", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/assistant/capability/livepreview/model/TranscriptSequence;Lcom/amazon/alexa/assistant/capability/livepreview/model/TranscriptDirection;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getSequence", "()Lcom/amazon/alexa/assistant/capability/livepreview/model/TranscriptSequence;", "getDirection", "()Lcom/amazon/alexa/assistant/capability/livepreview/model/TranscriptDirection;", "getLocale", "getDialogRequestId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LivePreviewEvent {

    @Nullable
    private final String dialogRequestId;

    @Nullable
    private final TranscriptDirection direction;

    @NotNull
    private final String locale;

    @NotNull
    private final TranscriptSequence sequence;

    @NotNull
    private final String text;

    public LivePreviewEvent(@NotNull String str, @NotNull TranscriptSequence transcriptSequence, @Nullable TranscriptDirection transcriptDirection, @NotNull String str2, @Nullable String str3) {
        str.getClass();
        transcriptSequence.getClass();
        str2.getClass();
        this.text = str;
        this.sequence = transcriptSequence;
        this.direction = transcriptDirection;
        this.locale = str2;
        this.dialogRequestId = str3;
    }

    public static /* synthetic */ LivePreviewEvent copy$default(LivePreviewEvent livePreviewEvent, String str, TranscriptSequence transcriptSequence, TranscriptDirection transcriptDirection, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = livePreviewEvent.text;
        }
        if ((i & 2) != 0) {
            transcriptSequence = livePreviewEvent.sequence;
        }
        if ((i & 4) != 0) {
            transcriptDirection = livePreviewEvent.direction;
        }
        if ((i & 8) != 0) {
            str2 = livePreviewEvent.locale;
        }
        if ((i & 16) != 0) {
            str3 = livePreviewEvent.dialogRequestId;
        }
        String str4 = str3;
        TranscriptDirection transcriptDirection2 = transcriptDirection;
        return livePreviewEvent.copy(str, transcriptSequence, transcriptDirection2, str2, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TranscriptSequence getSequence() {
        return this.sequence;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final TranscriptDirection getDirection() {
        return this.direction;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @NotNull
    public final LivePreviewEvent copy(@NotNull String text, @NotNull TranscriptSequence sequence, @Nullable TranscriptDirection direction, @NotNull String locale, @Nullable String dialogRequestId) {
        text.getClass();
        sequence.getClass();
        locale.getClass();
        return new LivePreviewEvent(text, sequence, direction, locale, dialogRequestId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LivePreviewEvent)) {
            return false;
        }
        LivePreviewEvent livePreviewEvent = (LivePreviewEvent) other;
        return Intrinsics.areEqual(this.text, livePreviewEvent.text) && this.sequence == livePreviewEvent.sequence && this.direction == livePreviewEvent.direction && Intrinsics.areEqual(this.locale, livePreviewEvent.locale) && Intrinsics.areEqual(this.dialogRequestId, livePreviewEvent.dialogRequestId);
    }

    @Nullable
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Nullable
    public final TranscriptDirection getDirection() {
        return this.direction;
    }

    @NotNull
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    public final TranscriptSequence getSequence() {
        return this.sequence;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = (this.sequence.hashCode() + (this.text.hashCode() * 31)) * 31;
        TranscriptDirection transcriptDirection = this.direction;
        int m = ArcMode$$ExternalSyntheticOutline0.m((hashCode + (transcriptDirection == null ? 0 : transcriptDirection.hashCode())) * 31, 31, this.locale);
        String str = this.dialogRequestId;
        return m + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        TranscriptSequence transcriptSequence = this.sequence;
        TranscriptDirection transcriptDirection = this.direction;
        String str2 = this.locale;
        String str3 = this.dialogRequestId;
        StringBuilder sb = new StringBuilder("LivePreviewEvent(text=");
        sb.append(str);
        sb.append(", sequence=");
        sb.append(transcriptSequence);
        sb.append(", direction=");
        sb.append(transcriptDirection);
        sb.append(", locale=");
        sb.append(str2);
        sb.append(", dialogRequestId=");
        return a$$ExternalSyntheticOutline0.m(sb, str3, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
