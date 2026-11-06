package com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup;

import com.facebook.imageutils.JfifUtil;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class LocaleGroup {
    private List<Locale> locales;

    public LocaleGroup(List<Locale> list) {
        this.locales = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.locales.equals(((LocaleGroup) obj).locales);
    }

    public List<Locale> getLocales() {
        return this.locales;
    }

    public Locale getPrimaryLocale() {
        return this.locales.get(0);
    }

    public int hashCode() {
        return this.locales.hashCode() + JfifUtil.MARKER_EOI;
    }
}
