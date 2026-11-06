package kotlinx.metadata;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0015\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000f"}, d2 = {"Lkotlinx/metadata/KmConstantValue;", "", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class KmConstantValue {

    @Nullable
    private final Object value;

    public KmConstantValue(@Nullable Object obj) {
        this.value = obj;
    }

    public static /* synthetic */ KmConstantValue copy$default(KmConstantValue kmConstantValue, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = kmConstantValue.value;
        }
        return kmConstantValue.copy(obj);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    @NotNull
    public final KmConstantValue copy(@Nullable Object value) {
        return new KmConstantValue(value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof KmConstantValue) && Intrinsics.areEqual(this.value, ((KmConstantValue) other).value);
    }

    @Nullable
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @NotNull
    public String toString() {
        return BitVector$$ExternalSyntheticOutline0.m(new StringBuilder("KmConstantValue(value="), this.value, ')');
    }
}
