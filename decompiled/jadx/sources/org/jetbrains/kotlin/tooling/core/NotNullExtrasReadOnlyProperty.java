package org.jetbrains.kotlin.tooling.core;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00010\u0004J\"\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0096\u0002¢\u0006\u0002\u0010\rR\u0012\u0010\u0006\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lorg/jetbrains/kotlin/tooling/core/NotNullExtrasReadOnlyProperty;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lorg/jetbrains/kotlin/tooling/core/ExtrasProperty;", "Lkotlin/properties/ReadOnlyProperty;", "Lorg/jetbrains/kotlin/tooling/core/HasExtras;", "defaultValue", "getDefaultValue", "()Ljava/lang/Object;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Lorg/jetbrains/kotlin/tooling/core/HasExtras;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "kotlin-tooling-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface NotNullExtrasReadOnlyProperty<T> extends ExtrasProperty<T>, ReadOnlyProperty<HasExtras, T> {
    @NotNull
    T getDefaultValue();

    @NotNull
    /* renamed from: getValue, reason: avoid collision after fix types in other method */
    default T getValue2(@NotNull HasExtras thisRef, @NotNull KProperty<?> property) {
        thisRef.getClass();
        property.getClass();
        T t = (T) thisRef.getExtras().get(getKey());
        return t == null ? getDefaultValue() : t;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    /* bridge */ /* synthetic */ default Object getValue(HasExtras hasExtras, KProperty kProperty) {
        return getValue2(hasExtras, (KProperty<?>) kProperty);
    }
}
