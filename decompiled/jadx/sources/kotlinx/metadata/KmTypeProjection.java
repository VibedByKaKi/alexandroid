package kotlinx.metadata;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lkotlinx/metadata/KmTypeProjection;", "", "variance", "Lkotlinx/metadata/KmVariance;", "type", "Lkotlinx/metadata/KmType;", "(Lkotlinx/metadata/KmVariance;Lkotlinx/metadata/KmType;)V", "getType", "()Lkotlinx/metadata/KmType;", "setType", "(Lkotlinx/metadata/KmType;)V", "getVariance", "()Lkotlinx/metadata/KmVariance;", "setVariance", "(Lkotlinx/metadata/KmVariance;)V", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "Companion", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class KmTypeProjection {

    @JvmField
    @NotNull
    public static final KmTypeProjection STAR = new KmTypeProjection(null, null);

    @Nullable
    private KmType type;

    @Nullable
    private KmVariance variance;

    public KmTypeProjection(@Nullable KmVariance kmVariance, @Nullable KmType kmType) {
        this.variance = kmVariance;
        this.type = kmType;
    }

    public static /* synthetic */ KmTypeProjection copy$default(KmTypeProjection kmTypeProjection, KmVariance kmVariance, KmType kmType, int i, Object obj) {
        if ((i & 1) != 0) {
            kmVariance = kmTypeProjection.variance;
        }
        if ((i & 2) != 0) {
            kmType = kmTypeProjection.type;
        }
        return kmTypeProjection.copy(kmVariance, kmType);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final KmVariance getVariance() {
        return this.variance;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final KmType getType() {
        return this.type;
    }

    @NotNull
    public final KmTypeProjection copy(@Nullable KmVariance variance, @Nullable KmType type) {
        return new KmTypeProjection(variance, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KmTypeProjection)) {
            return false;
        }
        KmTypeProjection kmTypeProjection = (KmTypeProjection) other;
        return this.variance == kmTypeProjection.variance && Intrinsics.areEqual(this.type, kmTypeProjection.type);
    }

    @Nullable
    public final KmType getType() {
        return this.type;
    }

    @Nullable
    public final KmVariance getVariance() {
        return this.variance;
    }

    public int hashCode() {
        KmVariance kmVariance = this.variance;
        int hashCode = (kmVariance == null ? 0 : kmVariance.hashCode()) * 31;
        KmType kmType = this.type;
        return hashCode + (kmType != null ? kmType.hashCode() : 0);
    }

    public final void setType(@Nullable KmType kmType) {
        this.type = kmType;
    }

    public final void setVariance(@Nullable KmVariance kmVariance) {
        this.variance = kmVariance;
    }

    @NotNull
    public String toString() {
        return "KmTypeProjection(variance=" + this.variance + ", type=" + this.type + ')';
    }
}
