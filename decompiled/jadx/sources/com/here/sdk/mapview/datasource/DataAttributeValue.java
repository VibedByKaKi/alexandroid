package com.here.sdk.mapview.datasource;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class DataAttributeValue extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ValueType {
        STRING(0),
        INT64(1),
        FLOAT(2),
        DOUBLE(3),
        BOOLEAN(4),
        ARRAY(5);

        public final int value;

        ValueType(int i) {
            this.value = i;
        }
    }

    public DataAttributeValue(@NonNull String str) {
        this(make(str), null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    private static native long make(double d);

    private static native long make(float f);

    private static native long make(long j);

    private static native long make(@NonNull String str);

    private static native long make(@NonNull List<DataAttributeValue> list);

    private static native long make(boolean z);

    @Nullable
    public native List<DataAttributeValue> getArray();

    @NonNull
    public native String getAsString();

    @Nullable
    public native Boolean getBoolean();

    @Nullable
    public native Double getDouble();

    @Nullable
    public native Float getFloat();

    @Nullable
    public native Long getInt64();

    @Nullable
    public native String getString();

    @NonNull
    public native ValueType getType();

    public DataAttributeValue(long j) {
        this(make(j), null);
        cacheThisInstance();
    }

    public DataAttributeValue(float f) {
        this(make(f), null);
        cacheThisInstance();
    }

    public DataAttributeValue(double d) {
        this(make(d), null);
        cacheThisInstance();
    }

    public DataAttributeValue(boolean z) {
        this(make(z), null);
        cacheThisInstance();
    }

    public DataAttributeValue(@NonNull List<DataAttributeValue> list) {
        this(make(list), null);
        cacheThisInstance();
    }

    public DataAttributeValue(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.datasource.DataAttributeValue.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                DataAttributeValue.disposeNativeHandle(j2);
            }
        });
    }
}
