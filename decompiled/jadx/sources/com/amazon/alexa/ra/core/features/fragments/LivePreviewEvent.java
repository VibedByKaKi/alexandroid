package com.amazon.alexa.ra.core.features.fragments;

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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/ra/core/features/fragments/LivePreviewEvent;", "", "text", "", "dialogRequestId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getDialogRequestId", "toLivePreviewData", "Lcom/amazon/alexa/ra/core/features/fragments/LivePreviewData;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class LivePreviewEvent {
    public static final int $stable = 0;

    @NotNull
    private final String dialogRequestId;

    @NotNull
    private final String text;

    public LivePreviewEvent(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.text = str;
        this.dialogRequestId = str2;
    }

    public static /* synthetic */ LivePreviewEvent copy$default(LivePreviewEvent livePreviewEvent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = livePreviewEvent.text;
        }
        if ((i & 2) != 0) {
            str2 = livePreviewEvent.dialogRequestId;
        }
        return livePreviewEvent.copy(str, str2);
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
    public final LivePreviewEvent copy(@NotNull String text, @NotNull String dialogRequestId) {
        text.getClass();
        dialogRequestId.getClass();
        return new LivePreviewEvent(text, dialogRequestId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LivePreviewEvent)) {
            return false;
        }
        LivePreviewEvent livePreviewEvent = (LivePreviewEvent) other;
        return Intrinsics.areEqual(this.text, livePreviewEvent.text) && Intrinsics.areEqual(this.dialogRequestId, livePreviewEvent.dialogRequestId);
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
    public final LivePreviewData toLivePreviewData() {
        return new LivePreviewData(this.dialogRequestId, this.text);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("LivePreviewEvent(text=", this.text, ", dialogRequestId=", this.dialogRequestId, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
