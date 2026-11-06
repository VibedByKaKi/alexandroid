package com.amazon.rtvi.alexa.model.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/amazon/rtvi/alexa/model/common/ResolutionParameters;", "", "maxCompressedFrameSizeInBytes", "", "<init>", "(Ljava/lang/Long;)V", "getMaxCompressedFrameSizeInBytes", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "copy", "(Ljava/lang/Long;)Lcom/amazon/rtvi/alexa/model/common/ResolutionParameters;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ResolutionParameters {

    @Nullable
    private final Long maxCompressedFrameSizeInBytes;

    public /* synthetic */ ResolutionParameters(Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l);
    }

    public static /* synthetic */ ResolutionParameters copy$default(ResolutionParameters resolutionParameters, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = resolutionParameters.maxCompressedFrameSizeInBytes;
        }
        return resolutionParameters.copy(l);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Long getMaxCompressedFrameSizeInBytes() {
        return this.maxCompressedFrameSizeInBytes;
    }

    @NotNull
    public final ResolutionParameters copy(@JsonProperty("maxCompressedFrameSizeInBytes") @Nullable Long maxCompressedFrameSizeInBytes) {
        return new ResolutionParameters(maxCompressedFrameSizeInBytes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ResolutionParameters) && Intrinsics.areEqual(this.maxCompressedFrameSizeInBytes, ((ResolutionParameters) other).maxCompressedFrameSizeInBytes);
    }

    @Nullable
    public final Long getMaxCompressedFrameSizeInBytes() {
        return this.maxCompressedFrameSizeInBytes;
    }

    public int hashCode() {
        Long l = this.maxCompressedFrameSizeInBytes;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    @NotNull
    public String toString() {
        return "ResolutionParameters(maxCompressedFrameSizeInBytes=" + this.maxCompressedFrameSizeInBytes + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public ResolutionParameters(@JsonProperty("maxCompressedFrameSizeInBytes") @Nullable Long l) {
        this.maxCompressedFrameSizeInBytes = l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResolutionParameters() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
