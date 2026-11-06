package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/JoinedKey;", "", "left", "right", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getLeft", "()Ljava/lang/Object;", "getRight", "hashCode", "", "hashCodeOf", "value", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "toString", "", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class JoinedKey {
    public static final int $stable = 8;

    @Nullable
    private final Object left;

    @Nullable
    private final Object right;

    public JoinedKey(@Nullable Object obj, @Nullable Object obj2) {
        this.left = obj;
        this.right = obj2;
    }

    public static /* synthetic */ JoinedKey copy$default(JoinedKey joinedKey, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = joinedKey.left;
        }
        if ((i & 2) != 0) {
            obj2 = joinedKey.right;
        }
        return joinedKey.copy(obj, obj2);
    }

    private final int hashCodeOf(Object value) {
        if (value instanceof Enum) {
            return ((Enum) value).ordinal();
        }
        if (value != null) {
            return value.hashCode();
        }
        return 0;
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Object getLeft() {
        return this.left;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Object getRight() {
        return this.right;
    }

    @NotNull
    public final JoinedKey copy(@Nullable Object left, @Nullable Object right) {
        return new JoinedKey(left, right);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JoinedKey)) {
            return false;
        }
        JoinedKey joinedKey = (JoinedKey) other;
        return Intrinsics.areEqual(this.left, joinedKey.left) && Intrinsics.areEqual(this.right, joinedKey.right);
    }

    @Nullable
    public final Object getLeft() {
        return this.left;
    }

    @Nullable
    public final Object getRight() {
        return this.right;
    }

    public int hashCode() {
        return (hashCodeOf(this.left) * 31) + hashCodeOf(this.right);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("JoinedKey(left=");
        sb.append(this.left);
        sb.append(", right=");
        return BitVector$$ExternalSyntheticOutline0.m(sb, this.right, ')');
    }
}
