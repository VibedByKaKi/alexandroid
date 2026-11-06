package com.amazon.alexa.ra.core.data.model;

import android.os.Bundle;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.ra.sdk.capability.ConversationCapability;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/UiEventMetadata;", "", "dialogRequestId", "", ConversationCapability.INTENT_EXTRA_FRAGMENT_URI, "messageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDialogRequestId", "()Ljava/lang/String;", "getFragmentUri", "getMessageId", "toBundle", "Landroid/os/Bundle;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUiEventMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiEventMetadata.kt\ncom/amazon/alexa/ra/core/data/model/UiEventMetadata\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1#2:31\n*E\n"})
/* loaded from: classes18.dex */
public final /* data */ class UiEventMetadata {
    public static final int $stable = 0;

    @Nullable
    private final String dialogRequestId;

    @Nullable
    private final String fragmentUri;

    @Nullable
    private final String messageId;

    public /* synthetic */ UiEventMetadata(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public static /* synthetic */ UiEventMetadata copy$default(UiEventMetadata uiEventMetadata, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uiEventMetadata.dialogRequestId;
        }
        if ((i & 2) != 0) {
            str2 = uiEventMetadata.fragmentUri;
        }
        if ((i & 4) != 0) {
            str3 = uiEventMetadata.messageId;
        }
        return uiEventMetadata.copy(str, str2, str3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getFragmentUri() {
        return this.fragmentUri;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    public final UiEventMetadata copy(@Nullable String dialogRequestId, @Nullable String fragmentUri, @Nullable String messageId) {
        return new UiEventMetadata(dialogRequestId, fragmentUri, messageId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiEventMetadata)) {
            return false;
        }
        UiEventMetadata uiEventMetadata = (UiEventMetadata) other;
        return Intrinsics.areEqual(this.dialogRequestId, uiEventMetadata.dialogRequestId) && Intrinsics.areEqual(this.fragmentUri, uiEventMetadata.fragmentUri) && Intrinsics.areEqual(this.messageId, uiEventMetadata.messageId);
    }

    @Nullable
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Nullable
    public final String getFragmentUri() {
        return this.fragmentUri;
    }

    @Nullable
    public final String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        String str = this.dialogRequestId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fragmentUri;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.messageId;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        String str = this.dialogRequestId;
        if (str != null) {
            bundle.putString("DIALOG_REQUEST_ID", str);
        }
        String str2 = this.fragmentUri;
        if (str2 != null) {
            bundle.putString("FRAGMENT_URI", str2);
        }
        String str3 = this.messageId;
        if (str3 != null) {
            bundle.putString("MESSAGE_ID", str3);
        }
        return bundle;
    }

    @NotNull
    public String toString() {
        String str = this.dialogRequestId;
        String str2 = this.fragmentUri;
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("UiEventMetadata(dialogRequestId=", str, ", fragmentUri=", str2, ", messageId="), this.messageId, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public UiEventMetadata(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.dialogRequestId = str;
        this.fragmentUri = str2;
        this.messageId = str3;
    }

    public UiEventMetadata() {
        this(null, null, null, 7, null);
    }
}
