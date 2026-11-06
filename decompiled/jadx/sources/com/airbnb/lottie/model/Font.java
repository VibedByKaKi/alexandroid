package com.airbnb.lottie.model;

import android.graphics.Typeface;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes15.dex */
public class Font {
    private final float ascent;
    private final String family;
    private final String name;
    private final String style;

    @Nullable
    private Typeface typeface;

    public Font(String str, String str2, String str3, float f) {
        this.family = str;
        this.name = str2;
        this.style = str3;
        this.ascent = f;
    }

    public float getAscent() {
        return this.ascent;
    }

    public String getFamily() {
        return this.family;
    }

    public String getName() {
        return this.name;
    }

    public String getStyle() {
        return this.style;
    }

    @Nullable
    public Typeface getTypeface() {
        return this.typeface;
    }

    public void setTypeface(@Nullable Typeface typeface) {
        this.typeface = typeface;
    }
}
