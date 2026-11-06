package org.jetbrains.kotlin.tooling.core;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.tooling.core.Extras;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00010\u0004J\"\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00052\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH\u0096\u0002¢\u0006\u0002\u0010\u000eJ*\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00052\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0012R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lorg/jetbrains/kotlin/tooling/core/ExtrasFactoryProperty;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lorg/jetbrains/kotlin/tooling/core/ExtrasProperty;", "Lkotlin/properties/ReadWriteProperty;", "Lorg/jetbrains/kotlin/tooling/core/HasMutableExtras;", "factory", "Lkotlin/Function0;", "getFactory", "()Lkotlin/jvm/functions/Function0;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Lorg/jetbrains/kotlin/tooling/core/HasMutableExtras;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "value", "(Lorg/jetbrains/kotlin/tooling/core/HasMutableExtras;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "kotlin-tooling-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension({"SMAP\nExtrasProperty.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExtrasProperty.kt\norg/jetbrains/kotlin/tooling/core/ExtrasFactoryProperty\n+ 2 ExtrasUtils.kt\norg/jetbrains/kotlin/tooling/core/ExtrasUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n58#2:152\n1#3:153\n*S KotlinDebug\n*F\n+ 1 ExtrasProperty.kt\norg/jetbrains/kotlin/tooling/core/ExtrasFactoryProperty\n*L\n124#1:152\n124#1:153\n*E\n"})
/* loaded from: classes11.dex */
public interface ExtrasFactoryProperty<T> extends ExtrasProperty<T>, ReadWriteProperty<HasMutableExtras, T> {
    @NotNull
    Function0<T> getFactory();

    @NotNull
    default T getValue(@NotNull HasMutableExtras thisRef, @NotNull KProperty<?> property) {
        thisRef.getClass();
        property.getClass();
        MutableExtras extras = thisRef.getExtras();
        Extras.Key<T> key = getKey();
        Function0<T> factory = getFactory();
        T t = (T) extras.get(key);
        if (t != null) {
            return t;
        }
        T invoke = factory.invoke();
        extras.set(key, invoke);
        return invoke;
    }

    /* renamed from: setValue, reason: avoid collision after fix types in other method */
    default void setValue2(@NotNull HasMutableExtras thisRef, @NotNull KProperty<?> property, @NotNull T value) {
        thisRef.getClass();
        property.getClass();
        value.getClass();
        thisRef.getExtras().set(getKey(), value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.properties.ReadWriteProperty
    /* bridge */ /* synthetic */ default void setValue(HasMutableExtras hasMutableExtras, KProperty kProperty, Object obj) {
        setValue2(hasMutableExtras, (KProperty<?>) kProperty, (KProperty) obj);
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    /* bridge */ /* synthetic */ default Object getValue(Object obj, KProperty kProperty) {
        return getValue((HasMutableExtras) obj, (KProperty<?>) kProperty);
    }
}
