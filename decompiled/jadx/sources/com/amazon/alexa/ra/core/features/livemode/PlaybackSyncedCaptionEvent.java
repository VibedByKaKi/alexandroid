package com.amazon.alexa.ra.core.features.livemode;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/ra/core/features/livemode/PlaybackSyncedCaptionEvent;", "", "text", "", "dialogRequestId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getDialogRequestId", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class PlaybackSyncedCaptionEvent {
    public static final int $stable = 0;

    @NotNull
    private final String dialogRequestId;

    @NotNull
    private final String text;

    public PlaybackSyncedCaptionEvent(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.text = str;
        this.dialogRequestId = str2;
    }

    public static /* synthetic */ PlaybackSyncedCaptionEvent copy$default(PlaybackSyncedCaptionEvent playbackSyncedCaptionEvent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playbackSyncedCaptionEvent.text;
        }
        if ((i & 2) != 0) {
            str2 = playbackSyncedCaptionEvent.dialogRequestId;
        }
        return playbackSyncedCaptionEvent.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @NotNull
    public final PlaybackSyncedCaptionEvent copy(@NotNull String text, @NotNull String dialogRequestId) {
        text.getClass();
        dialogRequestId.getClass();
        return new PlaybackSyncedCaptionEvent(text, dialogRequestId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaybackSyncedCaptionEvent)) {
            return false;
        }
        PlaybackSyncedCaptionEvent playbackSyncedCaptionEvent = (PlaybackSyncedCaptionEvent) other;
        return Intrinsics.areEqual(this.text, playbackSyncedCaptionEvent.text) && Intrinsics.areEqual(this.dialogRequestId, playbackSyncedCaptionEvent.dialogRequestId);
    }

    @NotNull
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.dialogRequestId.hashCode() + (this.text.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("PlaybackSyncedCaptionEvent(text=", this.text, ", dialogRequestId=", this.dialogRequestId, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
