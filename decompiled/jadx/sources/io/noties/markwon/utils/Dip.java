package io.noties.markwon.utils;

import android.content.Context;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class Dip {
    private final float density;

    public Dip(float f) {
        this.density = f;
    }

    @NonNull
    public static Dip create(@NonNull Context context) {
        return new Dip(context.getResources().getDisplayMetrics().density);
    }

    public int toPx(int i) {
        return (int) ((i * this.density) + 0.5f);
    }

    @NonNull
    public static Dip create(float f) {
        return new Dip(f);
    }
}
