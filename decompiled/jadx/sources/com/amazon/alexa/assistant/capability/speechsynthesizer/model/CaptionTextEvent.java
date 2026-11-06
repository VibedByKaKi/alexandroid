package com.amazon.alexa.assistant.capability.speechsynthesizer.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.voice.tta.metrics.SimbaEventProcessor;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechsynthesizer/model/CaptionTextEvent;", "", "dialogRequestId", "", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDialogRequestId", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CaptionTextEvent {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final CaptionTextEvent EMPTY = new CaptionTextEvent(null, "");

    @Nullable
    private final String dialogRequestId;

    @NotNull
    private final String text;

    public CaptionTextEvent(@Nullable String str, @NotNull String str2) {
        str2.getClass();
        this.dialogRequestId = str;
        this.text = str2;
    }

    public static /* synthetic */ CaptionTextEvent copy$default(CaptionTextEvent captionTextEvent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = captionTextEvent.dialogRequestId;
        }
        if ((i & 2) != 0) {
            str2 = captionTextEvent.text;
        }
        return captionTextEvent.copy(str, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final CaptionTextEvent copy(@Nullable String dialogRequestId, @NotNull String text) {
        text.getClass();
        return new CaptionTextEvent(dialogRequestId, text);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptionTextEvent)) {
            return false;
        }
        CaptionTextEvent captionTextEvent = (CaptionTextEvent) other;
        return Intrinsics.areEqual(this.dialogRequestId, captionTextEvent.dialogRequestId) && Intrinsics.areEqual(this.text, captionTextEvent.text);
    }

    @Nullable
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.dialogRequestId;
        return this.text.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("CaptionTextEvent(dialogRequestId=", this.dialogRequestId, ", text=", this.text, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechsynthesizer/model/CaptionTextEvent$Companion;", "", "<init>", "()V", SimbaEventProcessor.SOURCE_EMPTY, "Lcom/amazon/alexa/assistant/capability/speechsynthesizer/model/CaptionTextEvent;", "getEMPTY", "()Lcom/amazon/alexa/assistant/capability/speechsynthesizer/model/CaptionTextEvent;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CaptionTextEvent getEMPTY() {
            return CaptionTextEvent.EMPTY;
        }

        private Companion() {
        }
    }
}
