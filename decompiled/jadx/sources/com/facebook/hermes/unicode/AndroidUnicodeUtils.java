package com.facebook.hermes.unicode;

import com.facebook.proguard.annotations.DoNotStrip;
import java.text.Collator;
import java.text.DateFormat;
import java.text.Normalizer;
import java.util.Locale;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DoNotStrip
/* loaded from: classes6.dex */
public class AndroidUnicodeUtils {
    @DoNotStrip
    public static String convertToCase(String str, int i, boolean z) {
        Locale locale = z ? Locale.getDefault() : Locale.ENGLISH;
        if (i == 0) {
            return str.toUpperCase(locale);
        }
        if (i == 1) {
            return str.toLowerCase(locale);
        }
        Single$$ExternalSyntheticBUOutline0.m("Invalid target case");
        return null;
    }

    @DoNotStrip
    public static String dateFormat(double d, boolean z, boolean z2) {
        DateFormat timeInstance;
        if (z && z2) {
            timeInstance = DateFormat.getDateTimeInstance(2, 2);
        } else if (z) {
            timeInstance = DateFormat.getDateInstance(2);
        } else {
            if (!z2) {
                Single$$ExternalSyntheticBUOutline0.m("Bad dateFormat configuration");
                return null;
            }
            timeInstance = DateFormat.getTimeInstance(2);
        }
        return timeInstance.format(Long.valueOf((long) d)).toString();
    }

    @DoNotStrip
    public static int localeCompare(String str, String str2) {
        return Collator.getInstance().compare(str, str2);
    }

    @DoNotStrip
    public static String normalize(String str, int i) {
        if (i == 0) {
            return Normalizer.normalize(str, Normalizer.Form.NFC);
        }
        if (i == 1) {
            return Normalizer.normalize(str, Normalizer.Form.NFD);
        }
        if (i == 2) {
            return Normalizer.normalize(str, Normalizer.Form.NFKC);
        }
        if (i == 3) {
            return Normalizer.normalize(str, Normalizer.Form.NFKD);
        }
        Single$$ExternalSyntheticBUOutline0.m("Invalid form");
        return null;
    }
}
