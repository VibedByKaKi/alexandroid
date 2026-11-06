package com.amazon.alexa.pmi.implementation.taplatency;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/taplatency/TapTarget;", "", "label", "", "isReactNative", "", "<init>", "(Ljava/lang/String;Z)V", "getLabel", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class TapTarget {
    private final boolean isReactNative;

    @NotNull
    private final String label;

    public TapTarget(@NotNull String str, boolean z) {
        str.getClass();
        this.label = str;
        this.isReactNative = z;
    }

    public static /* synthetic */ TapTarget copy$default(TapTarget tapTarget, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tapTarget.label;
        }
        if ((i & 2) != 0) {
            z = tapTarget.isReactNative;
        }
        return tapTarget.copy(str, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsReactNative() {
        return this.isReactNative;
    }

    @NotNull
    public final TapTarget copy(@NotNull String label, boolean isReactNative) {
        label.getClass();
        return new TapTarget(label, isReactNative);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TapTarget)) {
            return false;
        }
        TapTarget tapTarget = (TapTarget) other;
        return Intrinsics.areEqual(this.label, tapTarget.label) && this.isReactNative == tapTarget.isReactNative;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isReactNative) + (this.label.hashCode() * 31);
    }

    public final boolean isReactNative() {
        return this.isReactNative;
    }

    @NotNull
    public String toString() {
        return AppLaunchChecker$$ExternalSyntheticOutline0.m("TapTarget(label=", this.label, ", isReactNative=", this.isReactNative, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
