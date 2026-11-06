package com.here.sdk.routing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Agency {

    @NonNull
    String id;

    @NonNull
    public String name;

    @Nullable
    public String website;

    public Agency(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        this.id = str;
        this.name = str2;
        this.website = str3;
    }
}
