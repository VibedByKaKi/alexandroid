package com.mapbox.maps.text;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.text.Normalizer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Keep
/* loaded from: classes9.dex */
class StringUtils {
    @NonNull
    @Keep
    public static String unaccent(@NonNull String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("(\\p{InCombiningDiacriticalMarks}|\\p{InCombiningDiacriticalMarksForSymbols}|\\p{InCombiningDiacriticalMarksSupplement})+", "");
    }
}
