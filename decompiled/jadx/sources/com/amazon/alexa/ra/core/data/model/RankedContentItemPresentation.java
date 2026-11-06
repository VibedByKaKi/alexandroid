package com.amazon.alexa.ra.core.data.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.data.utils.JSONConvertible;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/RankedContentItemPresentation;", "Lcom/amazon/alexa/ra/core/data/utils/JSONConvertible;", "version", "", "type", "", "data", "Lcom/amazon/alexa/ra/core/data/model/RankedContentItemPresentationData;", "<init>", "(ILjava/lang/String;Lcom/amazon/alexa/ra/core/data/model/RankedContentItemPresentationData;)V", "getVersion", "()I", "getType", "()Ljava/lang/String;", "getData", "()Lcom/amazon/alexa/ra/core/data/model/RankedContentItemPresentationData;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class RankedContentItemPresentation implements JSONConvertible {
    public static final int $stable = 8;

    @SerializedName("data")
    @NotNull
    private final RankedContentItemPresentationData data;

    @SerializedName("type")
    @NotNull
    private final String type;

    @SerializedName("version")
    private final int version;

    public RankedContentItemPresentation(int i, @NotNull String str, @NotNull RankedContentItemPresentationData rankedContentItemPresentationData) {
        str.getClass();
        rankedContentItemPresentationData.getClass();
        this.version = i;
        this.type = str;
        this.data = rankedContentItemPresentationData;
    }

    public static /* synthetic */ RankedContentItemPresentation copy$default(RankedContentItemPresentation rankedContentItemPresentation, int i, String str, RankedContentItemPresentationData rankedContentItemPresentationData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = rankedContentItemPresentation.version;
        }
        if ((i2 & 2) != 0) {
            str = rankedContentItemPresentation.type;
        }
        if ((i2 & 4) != 0) {
            rankedContentItemPresentationData = rankedContentItemPresentation.data;
        }
        return rankedContentItemPresentation.copy(i, str, rankedContentItemPresentationData);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final RankedContentItemPresentationData getData() {
        return this.data;
    }

    @NotNull
    public final RankedContentItemPresentation copy(int version, @NotNull String type, @NotNull RankedContentItemPresentationData data) {
        type.getClass();
        data.getClass();
        return new RankedContentItemPresentation(version, type, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankedContentItemPresentation)) {
            return false;
        }
        RankedContentItemPresentation rankedContentItemPresentation = (RankedContentItemPresentation) other;
        return this.version == rankedContentItemPresentation.version && Intrinsics.areEqual(this.type, rankedContentItemPresentation.type) && Intrinsics.areEqual(this.data, rankedContentItemPresentation.data);
    }

    @NotNull
    public final RankedContentItemPresentationData getData() {
        return this.data;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.data.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(Integer.hashCode(this.version) * 31, 31, this.type);
    }

    @NotNull
    public String toString() {
        int i = this.version;
        String str = this.type;
        RankedContentItemPresentationData rankedContentItemPresentationData = this.data;
        StringBuilder m = TableInfo$$ExternalSyntheticOutline0.m(i, "RankedContentItemPresentation(version=", ", type=", str, ", data=");
        m.append(rankedContentItemPresentationData);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }
}
