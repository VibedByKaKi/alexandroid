package com.here.sdk.core;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TimeRule extends NativeBase {
    static final SDKLibraryLoader LIBRARY_LOADER = new SDKLibraryLoader("SDK");

    public TimeRule(@NonNull String str, int i, @NonNull String str2) {
        this(make(str, i, str2), null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    private static native long make(@NonNull String str, int i, @NonNull String str2);

    public native boolean appliesTo(@NonNull Date date);

    public native boolean equals(Object obj);

    @NonNull
    public native String getDstSpec();

    @NonNull
    public native String getTimeRuleString();

    public native int getTimeZoneOffsetSeconds();

    public native int hashCode();

    public TimeRule(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.core.TimeRule.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                TimeRule.disposeNativeHandle(j2);
            }
        });
    }
}
