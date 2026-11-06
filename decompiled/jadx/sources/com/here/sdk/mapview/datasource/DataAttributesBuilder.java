package com.here.sdk.mapview.datasource;

import androidx.annotation.NonNull;
import com.here.NativeBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class DataAttributesBuilder extends NativeBase {
    public DataAttributesBuilder() {
        this(create(), null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    private static native long create();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public native DataAttributes build();

    @NonNull
    public native DataAttributesBuilder with(@NonNull String str, double d);

    @NonNull
    public native DataAttributesBuilder with(@NonNull String str, float f);

    @NonNull
    public native DataAttributesBuilder with(@NonNull String str, long j);

    @NonNull
    public native DataAttributesBuilder with(@NonNull String str, @NonNull DataAttributeValue dataAttributeValue);

    @NonNull
    public native DataAttributesBuilder with(@NonNull String str, @NonNull String str2);

    @NonNull
    public native DataAttributesBuilder with(@NonNull String str, boolean z);

    public DataAttributesBuilder(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.datasource.DataAttributesBuilder.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                DataAttributesBuilder.disposeNativeHandle(j2);
            }
        });
    }
}
