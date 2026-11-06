package com.amazon.alexa.voice.ui.cards.util;

import androidx.annotation.Nullable;
import androidx.core.util.PatternsCompat;
import java.util.Collections;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class StringUtils {
    public static final char LEFT_DOUBLE_QUOTE = 8220;
    public static final char RIGHT_DOUBLE_QUOTE = 8221;

    private StringUtils() {
    }

    public static boolean isBlank(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            for (int i = 0; i < charSequence.length(); i++) {
                if (!Character.isWhitespace(charSequence.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidEmail(String str) {
        return !isBlank(str) && PatternsCompat.EMAIL_ADDRESS.matcher(str).matches();
    }

    @Nullable
    public static String quoteText(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return "“" + charSequence.toString() + (char) 8221;
    }

    public static String repeat(String str, int i) {
        return String.join("", Collections.nCopies(i, str));
    }
}
