package com.here.sdk.routing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.sdk.core.Color;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TransitTransport {

    @Nullable
    public String category;

    @Nullable
    public Color color;

    @Nullable
    public String headsign;

    @NonNull
    public TransitMode mode;

    @Nullable
    public String name;

    @Nullable
    public Color textColor;

    public TransitTransport(@NonNull TransitMode transitMode, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Color color, @Nullable Color color2) {
        this.mode = transitMode;
        this.name = str;
        this.headsign = str2;
        this.category = str3;
        this.color = color;
        this.textColor = color2;
    }
}
