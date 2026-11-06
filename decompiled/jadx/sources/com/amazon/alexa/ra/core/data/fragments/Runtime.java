package com.amazon.alexa.ra.core.data.fragments;

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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/Runtime;", "", Runtime.BUNDLE_FORMAT, "", Runtime.RUNTIME_VERSION, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBundleFormat", "()Ljava/lang/String;", "getRuntimeVersion", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "SpecificationKeys", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class Runtime {
    public static final int $stable = 0;

    @NotNull
    public static final String BUNDLE_FORMAT = "bundleFormat";

    @NotNull
    public static final String RUNTIME_VERSION = "runtimeVersion";

    @NotNull
    private final String bundleFormat;

    @NotNull
    private final String runtimeVersion;

    public Runtime(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.bundleFormat = str;
        this.runtimeVersion = str2;
    }

    public static /* synthetic */ Runtime copy$default(Runtime runtime, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = runtime.bundleFormat;
        }
        if ((i & 2) != 0) {
            str2 = runtime.runtimeVersion;
        }
        return runtime.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBundleFormat() {
        return this.bundleFormat;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getRuntimeVersion() {
        return this.runtimeVersion;
    }

    @NotNull
    public final Runtime copy(@NotNull String bundleFormat, @NotNull String runtimeVersion) {
        bundleFormat.getClass();
        runtimeVersion.getClass();
        return new Runtime(bundleFormat, runtimeVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Runtime)) {
            return false;
        }
        Runtime runtime = (Runtime) other;
        return Intrinsics.areEqual(this.bundleFormat, runtime.bundleFormat) && Intrinsics.areEqual(this.runtimeVersion, runtime.runtimeVersion);
    }

    @NotNull
    public final String getBundleFormat() {
        return this.bundleFormat;
    }

    @NotNull
    public final String getRuntimeVersion() {
        return this.runtimeVersion;
    }

    public int hashCode() {
        return this.runtimeVersion.hashCode() + (this.bundleFormat.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("Runtime(bundleFormat=", this.bundleFormat, ", runtimeVersion=", this.runtimeVersion, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
