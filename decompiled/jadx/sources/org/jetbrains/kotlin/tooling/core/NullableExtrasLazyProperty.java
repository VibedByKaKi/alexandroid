package org.jetbrains.kotlin.tooling.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Optional;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.tooling.core.Extras;
import org.jetbrains.kotlin.tooling.core.HasMutableExtras;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00060\u00052\u0010\u0012\u0004\u0012\u0002H\u0001\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0007J$\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000e\u001a\u00028\u00002\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0096\u0002¢\u0006\u0002\u0010\u0011R%\u0010\b\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\t¢\u0006\u0002\b\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lorg/jetbrains/kotlin/tooling/core/NullableExtrasLazyProperty;", "Receiver", "Lorg/jetbrains/kotlin/tooling/core/HasMutableExtras;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lorg/jetbrains/kotlin/tooling/core/ExtrasProperty;", "Ljava/util/Optional;", "Lkotlin/properties/ReadOnlyProperty;", "factory", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "getFactory", "()Lkotlin/jvm/functions/Function1;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Lorg/jetbrains/kotlin/tooling/core/HasMutableExtras;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "kotlin-tooling-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension({"SMAP\nExtrasProperty.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExtrasProperty.kt\norg/jetbrains/kotlin/tooling/core/NullableExtrasLazyProperty\n+ 2 ExtrasUtils.kt\norg/jetbrains/kotlin/tooling/core/ExtrasUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n58#2:152\n1#3:153\n1#3:154\n*S KotlinDebug\n*F\n+ 1 ExtrasProperty.kt\norg/jetbrains/kotlin/tooling/core/NullableExtrasLazyProperty\n*L\n148#1:152\n148#1:153\n*E\n"})
/* loaded from: classes11.dex */
public interface NullableExtrasLazyProperty<Receiver extends HasMutableExtras, T> extends ExtrasProperty<Optional<T>>, ReadOnlyProperty<Receiver, T> {
    @NotNull
    Function1<Receiver, T> getFactory();

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    default T getValue(@NotNull Receiver thisRef, @NotNull KProperty<?> property) {
        thisRef.getClass();
        property.getClass();
        MutableExtras extras = thisRef.getExtras();
        Extras.Key<T> key = getKey();
        Object obj = extras.get(key);
        if (obj == null) {
            obj = Optional.ofNullable(getFactory().invoke(thisRef));
            obj.getClass();
            extras.set(key, obj);
        }
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return (T) optional.get();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.properties.ReadOnlyProperty
    /* bridge */ /* synthetic */ default Object getValue(Object obj, KProperty kProperty) {
        return getValue((NullableExtrasLazyProperty<Receiver, T>) obj, (KProperty<?>) kProperty);
    }
}
