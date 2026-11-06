package kotlinx.metadata;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\r\u0010\r\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lkotlinx/metadata/KmAnnotation;", "", "className", "", "Lkotlinx/metadata/ClassName;", "arguments", "", "Lkotlinx/metadata/KmAnnotationArgument;", "(Ljava/lang/String;Ljava/util/Map;)V", "getArguments", "()Ljava/util/Map;", "getClassName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class KmAnnotation {

    @NotNull
    private final Map<String, KmAnnotationArgument> arguments;

    @NotNull
    private final String className;

    /* JADX WARN: Multi-variable type inference failed */
    public KmAnnotation(@NotNull String str, @NotNull Map<String, ? extends KmAnnotationArgument> map) {
        str.getClass();
        map.getClass();
        this.className = str;
        this.arguments = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KmAnnotation copy$default(KmAnnotation kmAnnotation, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kmAnnotation.className;
        }
        if ((i & 2) != 0) {
            map = kmAnnotation.arguments;
        }
        return kmAnnotation.copy(str, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getClassName() {
        return this.className;
    }

    @NotNull
    public final Map<String, KmAnnotationArgument> component2() {
        return this.arguments;
    }

    @NotNull
    public final KmAnnotation copy(@NotNull String className, @NotNull Map<String, ? extends KmAnnotationArgument> arguments) {
        className.getClass();
        arguments.getClass();
        return new KmAnnotation(className, arguments);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KmAnnotation)) {
            return false;
        }
        KmAnnotation kmAnnotation = (KmAnnotation) other;
        return Intrinsics.areEqual(this.className, kmAnnotation.className) && Intrinsics.areEqual(this.arguments, kmAnnotation.arguments);
    }

    @NotNull
    public final Map<String, KmAnnotationArgument> getArguments() {
        return this.arguments;
    }

    @NotNull
    public final String getClassName() {
        return this.className;
    }

    public int hashCode() {
        return this.arguments.hashCode() + (this.className.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "KmAnnotation(className=" + this.className + ", arguments=" + this.arguments + ')';
    }
}
