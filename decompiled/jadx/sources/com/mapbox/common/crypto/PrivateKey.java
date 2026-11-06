package com.mapbox.common.crypto;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public interface PrivateKey {
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    SignatureAlgorithm getAlgorithm();

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    Expected<String, Signature> sign(@NonNull DataRef dataRef);
}
