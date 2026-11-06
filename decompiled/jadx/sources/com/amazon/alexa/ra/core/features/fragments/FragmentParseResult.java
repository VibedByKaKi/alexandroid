package com.amazon.alexa.ra.core.features.fragments;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.common.metrics.CoreUiEventName;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/ra/core/features/fragments/FragmentParseResult;", "", "success", "", "dialogRequestId", "", "breadcrumbName", "Lcom/amazon/alexa/ra/common/metrics/CoreUiEventName;", "<init>", "(ZLjava/lang/String;Lcom/amazon/alexa/ra/common/metrics/CoreUiEventName;)V", "getSuccess", "()Z", "getDialogRequestId", "()Ljava/lang/String;", "getBreadcrumbName", "()Lcom/amazon/alexa/ra/common/metrics/CoreUiEventName;", "component1", "component2", "component3", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class FragmentParseResult {
    public static final int $stable = 0;

    @NotNull
    private final CoreUiEventName breadcrumbName;

    @NotNull
    private final String dialogRequestId;
    private final boolean success;

    public FragmentParseResult(boolean z, @NotNull String str, @NotNull CoreUiEventName coreUiEventName) {
        str.getClass();
        coreUiEventName.getClass();
        this.success = z;
        this.dialogRequestId = str;
        this.breadcrumbName = coreUiEventName;
    }

    public static /* synthetic */ FragmentParseResult copy$default(FragmentParseResult fragmentParseResult, boolean z, String str, CoreUiEventName coreUiEventName, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fragmentParseResult.success;
        }
        if ((i & 2) != 0) {
            str = fragmentParseResult.dialogRequestId;
        }
        if ((i & 4) != 0) {
            coreUiEventName = fragmentParseResult.breadcrumbName;
        }
        return fragmentParseResult.copy(z, str, coreUiEventName);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CoreUiEventName getBreadcrumbName() {
        return this.breadcrumbName;
    }

    @NotNull
    public final FragmentParseResult copy(boolean success, @NotNull String dialogRequestId, @NotNull CoreUiEventName breadcrumbName) {
        dialogRequestId.getClass();
        breadcrumbName.getClass();
        return new FragmentParseResult(success, dialogRequestId, breadcrumbName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FragmentParseResult)) {
            return false;
        }
        FragmentParseResult fragmentParseResult = (FragmentParseResult) other;
        return this.success == fragmentParseResult.success && Intrinsics.areEqual(this.dialogRequestId, fragmentParseResult.dialogRequestId) && this.breadcrumbName == fragmentParseResult.breadcrumbName;
    }

    @NotNull
    public final CoreUiEventName getBreadcrumbName() {
        return this.breadcrumbName;
    }

    @NotNull
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return this.breadcrumbName.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.success) * 31, 31, this.dialogRequestId);
    }

    @NotNull
    public String toString() {
        return "FragmentParseResult(success=" + this.success + ", dialogRequestId=" + this.dialogRequestId + ", breadcrumbName=" + this.breadcrumbName + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
