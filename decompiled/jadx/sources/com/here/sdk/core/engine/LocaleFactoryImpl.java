package com.here.sdk.core.engine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class LocaleFactoryImpl extends NativeBase implements LocaleFactory {
    public LocaleFactoryImpl(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.core.engine.LocaleFactoryImpl.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                LocaleFactoryImpl.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @Override // com.here.sdk.core.engine.LocaleFactory
    @Nullable
    public native Locale getLocaleByBcp47(@NonNull String str);
}
