package com.google.android.material.slider;

import androidx.annotation.NonNull;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class BasicLabelFormatter implements LabelFormatter {
    private static final int BILLION = 1000000000;
    private static final int MILLION = 1000000;
    private static final int THOUSAND = 1000;
    private static final long TRILLION = 1000000000000L;

    @Override // com.google.android.material.slider.LabelFormatter
    @NonNull
    public String getFormattedValue(float f) {
        return f >= 1.0E12f ? String.format(Locale.US, "%.1fT", Float.valueOf(f / 1.0E12f)) : f >= 1.0E9f ? String.format(Locale.US, "%.1fB", Float.valueOf(f / 1.0E9f)) : f >= 1000000.0f ? String.format(Locale.US, "%.1fM", Float.valueOf(f / 1000000.0f)) : f >= 1000.0f ? String.format(Locale.US, "%.1fK", Float.valueOf(f / 1000.0f)) : String.format(Locale.US, "%.0f", Float.valueOf(f));
    }
}
