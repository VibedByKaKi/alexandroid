package com.here.sdk.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class LocalizedText {

    @Nullable
    public Locale locale;

    @NonNull
    public String text;

    public LocalizedText(@NonNull String str, @Nullable Locale locale) {
        this.text = str;
        this.locale = locale;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalizedText)) {
            return false;
        }
        LocalizedText localizedText = (LocalizedText) obj;
        return Objects.equals(this.text, localizedText.text) && Objects.equals(this.locale, localizedText.locale);
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
        Locale locale = this.locale;
        return hashCode + (locale != null ? locale.hashCode() : 0);
    }
}
