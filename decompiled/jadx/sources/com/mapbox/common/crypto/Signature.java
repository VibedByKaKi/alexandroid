package com.mapbox.common.crypto;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public final class Signature {
    protected long peer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SignaturePeerCleaner implements Runnable {
        private long peer;

        public SignaturePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            Signature.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Signature(@NonNull DataRef dataRef, @NonNull SignatureEncoding signatureEncoding, @NonNull SignatureAlgorithm signatureAlgorithm) {
        initialize(dataRef, signatureEncoding, signatureAlgorithm);
    }

    public static native void cleanNativePeer(long j);

    private native void initialize(@NonNull DataRef dataRef, @NonNull SignatureEncoding signatureEncoding, @NonNull SignatureAlgorithm signatureAlgorithm);

    private static native void nativeSelfRegister();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new SignaturePeerCleaner(j));
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public native SignatureAlgorithm getAlgorithm();

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public native DataRef getData();

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public native SignatureEncoding getEncoding();

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public native Expected<String, Signature> reEncode(@NonNull SignatureEncoding signatureEncoding);

    public Signature(long j) {
        setPeer(j);
    }
}
