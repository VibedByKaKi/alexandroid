package kotlinx.metadata;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0016\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/metadata/KmExtensionType;", "", "klass", "Lkotlin/reflect/KClass;", "Lkotlinx/metadata/KmExtensionVisitor;", "(Lkotlin/reflect/KClass;)V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class KmExtensionType {

    @NotNull
    private final KClass<? extends KmExtensionVisitor> klass;

    public KmExtensionType(@NotNull KClass<? extends KmExtensionVisitor> kClass) {
        kClass.getClass();
        this.klass = kClass;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof KmExtensionType) && Intrinsics.areEqual(this.klass, ((KmExtensionType) other).klass);
    }

    public int hashCode() {
        return this.klass.hashCode();
    }

    @NotNull
    public String toString() {
        return JvmClassMappingKt.getJavaClass((KClass) this.klass).getName();
    }
}
