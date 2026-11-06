package com.amazon.alexa.ra.core.data.model;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ArtifactUploadConfiguration;", "", "disableFragmentGeneration", "", "disableAutoSummary", "disableShoppingPill", "<init>", "(ZZZ)V", "getDisableFragmentGeneration", "()Z", "getDisableAutoSummary", "getDisableShoppingPill", "component1", "component2", "component3", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ArtifactUploadConfiguration {
    public static final int $stable = 0;
    private final boolean disableAutoSummary;
    private final boolean disableFragmentGeneration;
    private final boolean disableShoppingPill;

    public /* synthetic */ ArtifactUploadConfiguration(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }

    public static /* synthetic */ ArtifactUploadConfiguration copy$default(ArtifactUploadConfiguration artifactUploadConfiguration, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = artifactUploadConfiguration.disableFragmentGeneration;
        }
        if ((i & 2) != 0) {
            z2 = artifactUploadConfiguration.disableAutoSummary;
        }
        if ((i & 4) != 0) {
            z3 = artifactUploadConfiguration.disableShoppingPill;
        }
        return artifactUploadConfiguration.copy(z, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getDisableFragmentGeneration() {
        return this.disableFragmentGeneration;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDisableAutoSummary() {
        return this.disableAutoSummary;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getDisableShoppingPill() {
        return this.disableShoppingPill;
    }

    @NotNull
    public final ArtifactUploadConfiguration copy(boolean disableFragmentGeneration, boolean disableAutoSummary, boolean disableShoppingPill) {
        return new ArtifactUploadConfiguration(disableFragmentGeneration, disableAutoSummary, disableShoppingPill);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArtifactUploadConfiguration)) {
            return false;
        }
        ArtifactUploadConfiguration artifactUploadConfiguration = (ArtifactUploadConfiguration) other;
        return this.disableFragmentGeneration == artifactUploadConfiguration.disableFragmentGeneration && this.disableAutoSummary == artifactUploadConfiguration.disableAutoSummary && this.disableShoppingPill == artifactUploadConfiguration.disableShoppingPill;
    }

    public final boolean getDisableAutoSummary() {
        return this.disableAutoSummary;
    }

    public final boolean getDisableFragmentGeneration() {
        return this.disableFragmentGeneration;
    }

    public final boolean getDisableShoppingPill() {
        return this.disableShoppingPill;
    }

    public int hashCode() {
        return Boolean.hashCode(this.disableShoppingPill) + DoubleList$$ExternalSyntheticOutline0.m(this.disableAutoSummary, Boolean.hashCode(this.disableFragmentGeneration) * 31, 31);
    }

    @NotNull
    public String toString() {
        boolean z = this.disableFragmentGeneration;
        boolean z2 = this.disableAutoSummary;
        return a$$ExternalSyntheticOutline0.m(Automotive$$ExternalSyntheticOutline0.m("ArtifactUploadConfiguration(disableFragmentGeneration=", z, ", disableAutoSummary=", z2, ", disableShoppingPill="), this.disableShoppingPill, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public ArtifactUploadConfiguration(boolean z, boolean z2, boolean z3) {
        this.disableFragmentGeneration = z;
        this.disableAutoSummary = z2;
        this.disableShoppingPill = z3;
    }

    public ArtifactUploadConfiguration() {
        this(false, false, false, 7, null);
    }
}
