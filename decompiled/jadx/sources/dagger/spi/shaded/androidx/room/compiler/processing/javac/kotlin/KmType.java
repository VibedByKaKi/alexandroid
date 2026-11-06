package dagger.spi.shaded.androidx.room.compiler.processing.javac.kotlin;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.metadata.Flag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\r\u0010\u0012\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0019\u001a\u00020\u0000J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u001b\u001a\u00020\tJ\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/javac/kotlin/KmType;", "", "flags", "", "Lkotlinx/metadata/Flags;", "typeArguments", "", "extendsBound", "isExtensionType", "", "(ILjava/util/List;Landroidx/room/compiler/processing/javac/kotlin/KmType;Z)V", "getExtendsBound", "()Landroidx/room/compiler/processing/javac/kotlin/KmType;", "getFlags", "()I", "()Z", "getTypeArguments", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "erasure", "hashCode", "isNullable", "toString", "", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class KmType {

    @Nullable
    private final KmType extendsBound;
    private final int flags;
    private final boolean isExtensionType;

    @NotNull
    private final List<KmType> typeArguments;

    public KmType(int i, @NotNull List<KmType> list, @Nullable KmType kmType, boolean z) {
        list.getClass();
        this.flags = i;
        this.typeArguments = list;
        this.extendsBound = kmType;
        this.isExtensionType = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KmType copy$default(KmType kmType, int i, List list, KmType kmType2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = kmType.flags;
        }
        if ((i2 & 2) != 0) {
            list = kmType.typeArguments;
        }
        if ((i2 & 4) != 0) {
            kmType2 = kmType.extendsBound;
        }
        if ((i2 & 8) != 0) {
            z = kmType.isExtensionType;
        }
        return kmType.copy(i, list, kmType2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getFlags() {
        return this.flags;
    }

    @NotNull
    public final List<KmType> component2() {
        return this.typeArguments;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final KmType getExtendsBound() {
        return this.extendsBound;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsExtensionType() {
        return this.isExtensionType;
    }

    @NotNull
    public final KmType copy(int flags, @NotNull List<KmType> typeArguments, @Nullable KmType extendsBound, boolean isExtensionType) {
        typeArguments.getClass();
        return new KmType(flags, typeArguments, extendsBound, isExtensionType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KmType)) {
            return false;
        }
        KmType kmType = (KmType) other;
        return this.flags == kmType.flags && Intrinsics.areEqual(this.typeArguments, kmType.typeArguments) && Intrinsics.areEqual(this.extendsBound, kmType.extendsBound) && this.isExtensionType == kmType.isExtensionType;
    }

    @NotNull
    public final KmType erasure() {
        int i = this.flags;
        List emptyList = CollectionsKt.emptyList();
        KmType kmType = this.extendsBound;
        return new KmType(i, emptyList, kmType != null ? kmType.erasure() : null, this.isExtensionType);
    }

    @Nullable
    public final KmType getExtendsBound() {
        return this.extendsBound;
    }

    public final int getFlags() {
        return this.flags;
    }

    @NotNull
    public final List<KmType> getTypeArguments() {
        return this.typeArguments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(this.typeArguments, Integer.hashCode(this.flags) * 31, 31);
        KmType kmType = this.extendsBound;
        int hashCode = (m + (kmType == null ? 0 : kmType.hashCode())) * 31;
        boolean z = this.isExtensionType;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final boolean isExtensionType() {
        return this.isExtensionType;
    }

    public final boolean isNullable() {
        return Flag.Type.IS_NULLABLE.invoke(this.flags);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("KmType(flags=");
        sb.append(this.flags);
        sb.append(", typeArguments=");
        sb.append(this.typeArguments);
        sb.append(", extendsBound=");
        sb.append(this.extendsBound);
        sb.append(", isExtensionType=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.isExtensionType, ')');
    }
}
