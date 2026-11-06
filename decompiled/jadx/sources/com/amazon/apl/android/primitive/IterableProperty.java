package com.amazon.apl.android.primitive;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface IterableProperty<T> extends Iterable<T> {
    static <K extends IterableProperty<T>, T> K create(ArrayGetter<K, T> arrayGetter) {
        K builder = arrayGetter.builder();
        for (int i = 0; i < arrayGetter.size(); i++) {
            builder.list().add(i, arrayGetter.get(i));
        }
        return builder;
    }

    default void add(T t) {
        list().add(t);
    }

    default T at(int i) {
        return list().get(i);
    }

    @Override // java.lang.Iterable
    @NonNull
    default Iterator<T> iterator() {
        return list().iterator();
    }

    List<T> list();

    default int size() {
        return list().size();
    }

    default void add(int i, T t) {
        list().add(i, t);
    }

    static <K extends IterableProperty<T>, T> K create(SimpleArrayGetter<K, T> simpleArrayGetter) {
        return simpleArrayGetter.builder();
    }
}
