package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002¨\u0006\u0005"}, d2 = {"referentialEqualityPolicy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", ExifInterface.GPS_DIRECTION_TRUE, "structuralEqualityPolicy", "neverEqualPolicy", SmartFragmentContent.RUNTIME}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
/* loaded from: classes13.dex */
final /* synthetic */ class SnapshotStateKt__SnapshotMutationPolicyKt {
    @NotNull
    public static final <T> SnapshotMutationPolicy<T> neverEqualPolicy() {
        NeverEqualPolicy neverEqualPolicy = NeverEqualPolicy.INSTANCE;
        neverEqualPolicy.getClass();
        return neverEqualPolicy;
    }

    @NotNull
    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        ReferentialEqualityPolicy referentialEqualityPolicy = ReferentialEqualityPolicy.INSTANCE;
        referentialEqualityPolicy.getClass();
        return referentialEqualityPolicy;
    }

    @NotNull
    public static final <T> SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        StructuralEqualityPolicy structuralEqualityPolicy = StructuralEqualityPolicy.INSTANCE;
        structuralEqualityPolicy.getClass();
        return structuralEqualityPolicy;
    }
}
