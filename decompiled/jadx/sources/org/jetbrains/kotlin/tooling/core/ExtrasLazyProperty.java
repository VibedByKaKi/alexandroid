package org.jetbrains.kotlin.tooling.core;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.tooling.core.Extras;
import org.jetbrains.kotlin.tooling.core.HasMutableExtras;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00030\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006J\"\u0010\f\u001a\u00028\u00012\u0006\u0010\r\u001a\u00028\u00002\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0096\u0002¢\u0006\u0002\u0010\u0010J*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00028\u00002\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0013\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0014R#\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0002\b\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lorg/jetbrains/kotlin/tooling/core/ExtrasLazyProperty;", "Receiver", "Lorg/jetbrains/kotlin/tooling/core/HasMutableExtras;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lorg/jetbrains/kotlin/tooling/core/ExtrasProperty;", "Lkotlin/properties/ReadWriteProperty;", "factory", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "getFactory", "()Lkotlin/jvm/functions/Function1;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Lorg/jetbrains/kotlin/tooling/core/HasMutableExtras;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "value", "(Lorg/jetbrains/kotlin/tooling/core/HasMutableExtras;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "kotlin-tooling-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension({"SMAP\nExtrasProperty.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExtrasProperty.kt\norg/jetbrains/kotlin/tooling/core/ExtrasLazyProperty\n+ 2 ExtrasUtils.kt\norg/jetbrains/kotlin/tooling/core/ExtrasUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n58#2:152\n1#3:153\n*S KotlinDebug\n*F\n+ 1 ExtrasProperty.kt\norg/jetbrains/kotlin/tooling/core/ExtrasLazyProperty\n*L\n136#1:152\n136#1:153\n*E\n"})
/* loaded from: classes11.dex */
public interface ExtrasLazyProperty<Receiver extends HasMutableExtras, T> extends ExtrasProperty<T>, ReadWriteProperty<Receiver, T> {
    @NotNull
    Function1<Receiver, T> getFactory();

    @NotNull
    default T getValue(@NotNull Receiver thisRef, @NotNull KProperty<?> property) {
        thisRef.getClass();
        property.getClass();
        MutableExtras extras = thisRef.getExtras();
        Extras.Key<T> key = getKey();
        T t = (T) extras.get(key);
        if (t != null) {
            return t;
        }
        T invoke = getFactory().invoke(thisRef);
        extras.set(key, invoke);
        return invoke;
    }

    default void setValue(@NotNull Receiver thisRef, @NotNull KProperty<?> property, @NotNull T value) {
        thisRef.getClass();
        property.getClass();
        value.getClass();
        thisRef.getExtras().set(getKey(), value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.properties.ReadWriteProperty
    /* bridge */ /* synthetic */ default void setValue(Object obj, KProperty kProperty, Object obj2) {
        setValue((ExtrasLazyProperty<Receiver, T>) obj, (KProperty<?>) kProperty, (KProperty) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    /* bridge */ /* synthetic */ default Object getValue(Object obj, KProperty kProperty) {
        return getValue((ExtrasLazyProperty<Receiver, T>) obj, (KProperty<?>) kProperty);
    }
}
