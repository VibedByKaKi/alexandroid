package kotlin.reflect.jvm.internal.impl.types.extensions;

import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SourceDebugExtension({"SMAP\nTypeAttributeTranslators.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAttributeTranslators.kt\norg/jetbrains/kotlin/types/extensions/TypeAttributeTranslators\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n1563#2:32\n1634#2,3:33\n1563#2:36\n1634#2,3:37\n*S KotlinDebug\n*F\n+ 1 TypeAttributeTranslators.kt\norg/jetbrains/kotlin/types/extensions/TypeAttributeTranslators\n*L\n18#1:32\n18#1:33,3\n25#1:36\n25#1:37,3\n*E\n"})
/* loaded from: classes10.dex */
public final class TypeAttributeTranslators {

    @NotNull
    private final List<TypeAttributeTranslator> translators;

    /* JADX WARN: Multi-variable type inference failed */
    public TypeAttributeTranslators(@NotNull List<? extends TypeAttributeTranslator> list) {
        list.getClass();
        this.translators = list;
    }

    @NotNull
    public final List<TypeAttributeTranslator> getTranslators() {
        return this.translators;
    }
}
