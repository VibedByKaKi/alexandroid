package com.amazon.alexa.assistant.ui.conversation.source;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0003J\u0006\u0010\u000e\u001a\u00020\u0000J\u0006\u0010\u000f\u001a\u00020\u0000J\u0010\u0010\u0010\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u0011\u001a\u00020\u0005J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/source/TextDialogTracker;", "", "dialogRequestId", "", "responseFragmentReceived", "", "<init>", "(Ljava/lang/String;Z)V", "getDialogRequestId", "()Ljava/lang/String;", "getResponseFragmentReceived", "()Z", "startProcessing", "dialogId", "onResponseReceived", "reset", "matchesDialog", "isProcessing", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TextDialogTracker {
    public static final int $stable = 0;

    @Nullable
    private final String dialogRequestId;
    private final boolean responseFragmentReceived;

    public /* synthetic */ TextDialogTracker(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z);
    }

    public static /* synthetic */ TextDialogTracker copy$default(TextDialogTracker textDialogTracker, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textDialogTracker.dialogRequestId;
        }
        if ((i & 2) != 0) {
            z = textDialogTracker.responseFragmentReceived;
        }
        return textDialogTracker.copy(str, z);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getResponseFragmentReceived() {
        return this.responseFragmentReceived;
    }

    @NotNull
    public final TextDialogTracker copy(@Nullable String dialogRequestId, boolean responseFragmentReceived) {
        return new TextDialogTracker(dialogRequestId, responseFragmentReceived);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextDialogTracker)) {
            return false;
        }
        TextDialogTracker textDialogTracker = (TextDialogTracker) other;
        return Intrinsics.areEqual(this.dialogRequestId, textDialogTracker.dialogRequestId) && this.responseFragmentReceived == textDialogTracker.responseFragmentReceived;
    }

    @Nullable
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    public final boolean getResponseFragmentReceived() {
        return this.responseFragmentReceived;
    }

    public int hashCode() {
        String str = this.dialogRequestId;
        return Boolean.hashCode(this.responseFragmentReceived) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final boolean isProcessing() {
        return this.dialogRequestId != null;
    }

    public final boolean matchesDialog(@Nullable String dialogId) {
        String str = this.dialogRequestId;
        return str != null && Intrinsics.areEqual(str, dialogId);
    }

    @NotNull
    public final TextDialogTracker onResponseReceived() {
        return copy$default(this, null, true, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final TextDialogTracker reset() {
        return new TextDialogTracker(null, false, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    public final TextDialogTracker startProcessing(@NotNull String dialogId) {
        dialogId.getClass();
        return new TextDialogTracker(dialogId, false);
    }

    @NotNull
    public String toString() {
        return AppLaunchChecker$$ExternalSyntheticOutline0.m("TextDialogTracker(dialogRequestId=", this.dialogRequestId, ", responseFragmentReceived=", this.responseFragmentReceived, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public TextDialogTracker(@Nullable String str, boolean z) {
        this.dialogRequestId = str;
        this.responseFragmentReceived = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextDialogTracker() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}
