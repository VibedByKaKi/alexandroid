package com.mapbox.common;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import java.util.Date;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public interface PersistentStorageInterface {
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    Expected<PersistentStorageError, PersistentStorageData> get(@NonNull String str);

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    Expected<PersistentStorageError, List<String>> getAllKeys();

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    Expected<PersistentStorageError, List<PersistentStorageData>> getMulti(@NonNull List<String> list);

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    Expected<PersistentStorageError, Long> getStorageSize();

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    Expected<PersistentStorageError, Date> put(@NonNull String str, @NonNull DataRef dataRef);

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    Expected<PersistentStorageError, Date> putMulti(@NonNull List<PersistentStorageKeyValue> list);

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    Expected<PersistentStorageError, None> remove(@NonNull String str);

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    Expected<PersistentStorageError, Long> removeAll();

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    Expected<PersistentStorageError, Long> removeMulti(@NonNull List<String> list, boolean z);

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    Expected<PersistentStorageError, None> shrinkToFit();
}
