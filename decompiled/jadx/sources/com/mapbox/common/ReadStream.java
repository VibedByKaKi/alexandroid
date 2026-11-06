package com.mapbox.common;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.mapbox.bindgen.Expected;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public interface ReadStream {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: isExhausted */
    boolean getExhausted();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    boolean isReadable();

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    Expected<String, Long> read(@NonNull Buffer buffer);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: readBytes */
    long getProcessed();
}
