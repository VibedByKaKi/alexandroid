package com.amazon.apl.android.dependencies;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class ExtensionFilterParameters {
    public static ExtensionFilterParameters create(String str, String str2, Integer num, Integer num2, Map<String, Object> map) {
        return new AutoValue_ExtensionFilterParameters(str, str2, num, num2, map);
    }

    @Nullable
    public abstract Integer getDestination();

    @Nullable
    public abstract Map<String, Object> getFilterParams();

    @NonNull
    public abstract String getName();

    @Nullable
    public abstract Integer getSource();

    @NonNull
    public abstract String getURI();
}
