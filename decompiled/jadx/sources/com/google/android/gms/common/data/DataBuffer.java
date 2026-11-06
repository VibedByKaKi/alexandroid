package com.google.android.gms.common.data;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Releasable;
import java.io.Closeable;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface DataBuffer<T> extends Iterable<T>, Releasable, Closeable {
    void close();

    @NonNull
    T get(int i);

    int getCount();

    @Nullable
    @KeepForSdk
    Bundle getMetadata();

    @Deprecated
    boolean isClosed();

    @Override // java.lang.Iterable
    @NonNull
    Iterator<T> iterator();

    void release();

    @NonNull
    Iterator<T> singleRefIterator();
}
