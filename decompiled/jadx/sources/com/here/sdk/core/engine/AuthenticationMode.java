package com.here.sdk.core.engine;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import com.here.sdk.core.SDKLibraryLoader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class AuthenticationMode extends NativeBase {
    static final SDKLibraryLoader LIBRARY_LOADER = new SDKLibraryLoader("SDK");

    public AuthenticationMode(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.core.engine.AuthenticationMode.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                AuthenticationMode.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public static native AuthenticationMode withExternal();

    @NonNull
    public static native AuthenticationMode withKeySecret(@NonNull String str, @NonNull String str2);

    @NonNull
    public static native AuthenticationMode withToken(@NonNull String str);
}
