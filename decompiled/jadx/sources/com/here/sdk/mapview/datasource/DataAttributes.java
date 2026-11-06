package com.here.sdk.mapview.datasource;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;
import com.here.sdk.mapview.datasource.DataAttributeValue;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class DataAttributes extends NativeBase implements DataAttributesBase {
    public DataAttributes(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.datasource.DataAttributes.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                DataAttributes.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @Override // com.here.sdk.mapview.datasource.DataAttributesBase
    @Nullable
    public native String getAsString(@NonNull String str);

    @Override // com.here.sdk.mapview.datasource.DataAttributesBase
    @NonNull
    public native List<String> getAttributeNames();

    @Override // com.here.sdk.mapview.datasource.DataAttributesBase
    @Nullable
    public native Boolean getBoolean(@NonNull String str);

    @Override // com.here.sdk.mapview.datasource.DataAttributesBase
    @Nullable
    public native Double getDouble(@NonNull String str);

    @Override // com.here.sdk.mapview.datasource.DataAttributesBase
    @Nullable
    public native Float getFloat(@NonNull String str);

    @Override // com.here.sdk.mapview.datasource.DataAttributesBase
    @Nullable
    public native Long getInt64(@NonNull String str);

    @Override // com.here.sdk.mapview.datasource.DataAttributesBase
    @Nullable
    public native String getString(@NonNull String str);

    @Override // com.here.sdk.mapview.datasource.DataAttributesBase
    @Nullable
    public native DataAttributeValue getValue(@NonNull String str);

    @Override // com.here.sdk.mapview.datasource.DataAttributesBase
    @Nullable
    public native DataAttributeValue.ValueType getValueType(@NonNull String str);
}
