package com.amazon.alexa.ra.core.data.model;

import androidx.annotation.Keep;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ArtifactsSummary;", "", "lastAttachedName", "", "count", "", "<init>", "(Ljava/lang/String;I)V", "getLastAttachedName", "()Ljava/lang/String;", "getCount", "()I", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ArtifactsSummary {
    public static final int $stable = 0;

    @SerializedName("count")
    private final int count;

    @SerializedName("lastAttachedName")
    @NotNull
    private final String lastAttachedName;

    public ArtifactsSummary(@NotNull String str, int i) {
        str.getClass();
        this.lastAttachedName = str;
        this.count = i;
    }

    public static /* synthetic */ ArtifactsSummary copy$default(ArtifactsSummary artifactsSummary, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = artifactsSummary.lastAttachedName;
        }
        if ((i2 & 2) != 0) {
            i = artifactsSummary.count;
        }
        return artifactsSummary.copy(str, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLastAttachedName() {
        return this.lastAttachedName;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final ArtifactsSummary copy(@NotNull String lastAttachedName, int count) {
        lastAttachedName.getClass();
        return new ArtifactsSummary(lastAttachedName, count);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArtifactsSummary)) {
            return false;
        }
        ArtifactsSummary artifactsSummary = (ArtifactsSummary) other;
        return Intrinsics.areEqual(this.lastAttachedName, artifactsSummary.lastAttachedName) && this.count == artifactsSummary.count;
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final String getLastAttachedName() {
        return this.lastAttachedName;
    }

    public int hashCode() {
        return Integer.hashCode(this.count) + (this.lastAttachedName.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return DoubleList$$ExternalSyntheticOutline0.m("ArtifactsSummary(lastAttachedName=", this.lastAttachedName, ", count=", this.count, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
