package androidx.compose.runtime.tooling;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/tooling/ObjectLocation;", "", "group", "", "dataOffset", "<init>", "(ILjava/lang/Integer;)V", "getGroup", "()I", "getDataOffset", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(ILjava/lang/Integer;)Landroidx/compose/runtime/tooling/ObjectLocation;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ObjectLocation {
    public static final int $stable = 0;

    @Nullable
    private final Integer dataOffset;
    private final int group;

    public ObjectLocation(int i, @Nullable Integer num) {
        this.group = i;
        this.dataOffset = num;
    }

    public static /* synthetic */ ObjectLocation copy$default(ObjectLocation objectLocation, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = objectLocation.group;
        }
        if ((i2 & 2) != 0) {
            num = objectLocation.dataOffset;
        }
        return objectLocation.copy(i, num);
    }

    /* renamed from: component1, reason: from getter */
    public final int getGroup() {
        return this.group;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getDataOffset() {
        return this.dataOffset;
    }

    @NotNull
    public final ObjectLocation copy(int group, @Nullable Integer dataOffset) {
        return new ObjectLocation(group, dataOffset);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ObjectLocation)) {
            return false;
        }
        ObjectLocation objectLocation = (ObjectLocation) other;
        return this.group == objectLocation.group && Intrinsics.areEqual(this.dataOffset, objectLocation.dataOffset);
    }

    @Nullable
    public final Integer getDataOffset() {
        return this.dataOffset;
    }

    public final int getGroup() {
        return this.group;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.group) * 31;
        Integer num = this.dataOffset;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "ObjectLocation(group=" + this.group + ", dataOffset=" + this.dataOffset + ')';
    }
}
