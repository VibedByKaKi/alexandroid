package kotlinx.metadata.internal.metadata.jvm.deserialization;

import java.util.List;
import kotlin.Metadata;
import kotlinx.metadata.internal.metadata.ProtoBuf;
import kotlinx.metadata.internal.metadata.deserialization.NameResolver;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/metadata/internal/metadata/jvm/deserialization/BinaryModuleData;", "", "annotations", "", "", "optionalAnnotations", "Lkotlinx/metadata/internal/metadata/ProtoBuf$Class;", "nameResolver", "Lkotlinx/metadata/internal/metadata/deserialization/NameResolver;", "(Ljava/util/List;Ljava/util/List;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;)V", "getAnnotations", "()Ljava/util/List;", "getNameResolver", "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;", "getOptionalAnnotations", "metadata.jvm"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class BinaryModuleData {

    @NotNull
    private final List<String> annotations;

    @NotNull
    private final NameResolver nameResolver;

    @NotNull
    private final List<ProtoBuf.Class> optionalAnnotations;

    public BinaryModuleData(@NotNull List<String> list, @NotNull List<ProtoBuf.Class> list2, @NotNull NameResolver nameResolver) {
        list.getClass();
        list2.getClass();
        nameResolver.getClass();
        this.annotations = list;
        this.optionalAnnotations = list2;
        this.nameResolver = nameResolver;
    }

    @NotNull
    public final List<String> getAnnotations() {
        return this.annotations;
    }

    @NotNull
    public final NameResolver getNameResolver() {
        return this.nameResolver;
    }

    @NotNull
    public final List<ProtoBuf.Class> getOptionalAnnotations() {
        return this.optionalAnnotations;
    }
}
