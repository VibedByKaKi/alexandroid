package expo.modules.kotlin.types;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [Type] */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nTypeConverterCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeConverterCollection.kt\nexpo/modules/kotlin/types/TypeConverterCollection$from$1\n+ 2 EnforceType.kt\nexpo/modules/kotlin/types/EnforceTypeKt\n*L\n1#1,101:1\n11#2:102\n*S KotlinDebug\n*F\n+ 1 TypeConverterCollection.kt\nexpo/modules/kotlin/types/TypeConverterCollection$from$1\n*L\n39#1:102\n*E\n"})
/* loaded from: classes9.dex */
public final class TypeConverterCollection$from$1<Type> implements Function1<Object, Type> {
    final /* synthetic */ Function1<P0, Type> $body;

    /* JADX WARN: Multi-variable type inference failed */
    public TypeConverterCollection$from$1(Function1<? super P0, ? extends Type> function1) {
        this.$body = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Type invoke(Object obj) {
        return this.$body.invoke(obj);
    }
}
