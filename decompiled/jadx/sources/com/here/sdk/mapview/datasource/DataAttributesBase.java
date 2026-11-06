package com.here.sdk.mapview.datasource;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.sdk.mapview.datasource.DataAttributeValue;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public interface DataAttributesBase {
    @Nullable
    String getAsString(@NonNull String str);

    @NonNull
    List<String> getAttributeNames();

    @Nullable
    Boolean getBoolean(@NonNull String str);

    @Nullable
    Double getDouble(@NonNull String str);

    @Nullable
    Float getFloat(@NonNull String str);

    @Nullable
    Long getInt64(@NonNull String str);

    @Nullable
    String getString(@NonNull String str);

    @Nullable
    DataAttributeValue getValue(@NonNull String str);

    @Nullable
    DataAttributeValue.ValueType getValueType(@NonNull String str);
}
