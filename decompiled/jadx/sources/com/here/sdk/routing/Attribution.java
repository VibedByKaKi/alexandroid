package com.here.sdk.routing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Attribution {

    @Nullable
    public String href = null;

    @Nullable
    public String hrefText = null;

    @NonNull
    String id;

    @NonNull
    public String text;

    @NonNull
    public AttributionType type;

    public Attribution(@NonNull String str, @NonNull String str2, @NonNull AttributionType attributionType) {
        this.id = str;
        this.text = str2;
        this.type = attributionType;
    }
}
