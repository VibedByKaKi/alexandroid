package com.amazon.alexa.ra.core.data.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/LiveTranscriptTurn;", "", "dialogRequestId", "", "requestText", "responseText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDialogRequestId", "()Ljava/lang/String;", "getRequestText", "getResponseText", "isEmpty", "", "activeCaption", "component1", "component2", "component3", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLiveTranscript.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveTranscript.kt\ncom/amazon/alexa/ra/core/data/model/LiveTranscriptTurn\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
/* loaded from: classes18.dex */
public final /* data */ class LiveTranscriptTurn {
    public static final int $stable = 0;

    @Nullable
    private final String dialogRequestId;

    @NotNull
    private final String requestText;

    @NotNull
    private final String responseText;

    public /* synthetic */ LiveTranscriptTurn(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public static /* synthetic */ LiveTranscriptTurn copy$default(LiveTranscriptTurn liveTranscriptTurn, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liveTranscriptTurn.dialogRequestId;
        }
        if ((i & 2) != 0) {
            str2 = liveTranscriptTurn.requestText;
        }
        if ((i & 4) != 0) {
            str3 = liveTranscriptTurn.responseText;
        }
        return liveTranscriptTurn.copy(str, str2, str3);
    }

    @NotNull
    public final String activeCaption() {
        String str = this.responseText;
        return StringsKt.isBlank(str) ? this.requestText : str;
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getRequestText() {
        return this.requestText;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getResponseText() {
        return this.responseText;
    }

    @NotNull
    public final LiveTranscriptTurn copy(@Nullable String dialogRequestId, @NotNull String requestText, @NotNull String responseText) {
        requestText.getClass();
        responseText.getClass();
        return new LiveTranscriptTurn(dialogRequestId, requestText, responseText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveTranscriptTurn)) {
            return false;
        }
        LiveTranscriptTurn liveTranscriptTurn = (LiveTranscriptTurn) other;
        return Intrinsics.areEqual(this.dialogRequestId, liveTranscriptTurn.dialogRequestId) && Intrinsics.areEqual(this.requestText, liveTranscriptTurn.requestText) && Intrinsics.areEqual(this.responseText, liveTranscriptTurn.responseText);
    }

    @Nullable
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @NotNull
    public final String getRequestText() {
        return this.requestText;
    }

    @NotNull
    public final String getResponseText() {
        return this.responseText;
    }

    public int hashCode() {
        String str = this.dialogRequestId;
        return this.responseText.hashCode() + ArcMode$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.requestText);
    }

    public final boolean isEmpty() {
        return StringsKt.isBlank(this.requestText) && StringsKt.isBlank(this.responseText);
    }

    @NotNull
    public String toString() {
        String str = this.dialogRequestId;
        String str2 = this.requestText;
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("LiveTranscriptTurn(dialogRequestId=", str, ", requestText=", str2, ", responseText="), this.responseText, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public LiveTranscriptTurn(@Nullable String str, @NotNull String str2, @NotNull String str3) {
        str2.getClass();
        str3.getClass();
        this.dialogRequestId = str;
        this.requestText = str2;
        this.responseText = str3;
    }

    public LiveTranscriptTurn() {
        this(null, null, null, 7, null);
    }
}
