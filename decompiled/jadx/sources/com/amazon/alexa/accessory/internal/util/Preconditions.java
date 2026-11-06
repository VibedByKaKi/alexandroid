package com.amazon.alexa.accessory.internal.util;

import android.os.Looper;
import android.text.TextUtils;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Locale;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class Preconditions {
    public static final String VALID_FILE_REGEX_PATTERN = "^[A-za-z0-9._-]{1,255}$";

    private Preconditions() {
        throw new IllegalStateException("No instances!");
    }

    public static void elementIndex(int i, int i2, String str) {
        if (i < 0 || i >= i2) {
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(formatElementIndex(i, i2, str));
            Logger.e("Throwing ", indexOutOfBoundsException);
            throw indexOutOfBoundsException;
        }
    }

    public static void equals(int i, int i2, String str) {
        if (i == i2) {
            return;
        }
        Locale locale = Locale.US;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str + " (" + i + ") must equal (" + i2 + MarkdownConstants.RIGHT_PARENTHESIS);
        Logger.e("Throwing ", illegalArgumentException);
        throw illegalArgumentException;
    }

    private static String formatElementIndex(int i, int i2, String str) {
        if (i < 0) {
            Locale locale = Locale.US;
            return str + " (" + i + ") must not be negative";
        }
        if (i2 < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i2, "negative size: "));
            return null;
        }
        Locale locale2 = Locale.US;
        return str + " (" + i + ") must be less than size (" + i2 + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public static void in(int i, String str, int... iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return;
            }
        }
        Locale locale = Locale.US;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(BitVector$$ExternalSyntheticOutline0.m(str, " must be in the set of values"));
        Logger.e("Throwing ", illegalArgumentException);
        throw illegalArgumentException;
    }

    public static void mainThread() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Current thread must be a main thread");
        Logger.e("Throwing ", illegalStateException);
        throw illegalStateException;
    }

    public static void notEmpty(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            Locale locale = Locale.US;
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(BitVector$$ExternalSyntheticOutline0.m(str2, " must not be empty"));
            Logger.e("Throwing ", illegalArgumentException);
            throw illegalArgumentException;
        }
    }

    public static void notNegative(int i, String str) {
        if (i >= 0) {
            return;
        }
        Locale locale = Locale.US;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str + " (" + i + ") must not be negative");
        Logger.e("Throwing ", illegalArgumentException);
        throw illegalArgumentException;
    }

    public static void notNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        Locale locale = Locale.US;
        NullPointerException nullPointerException = new NullPointerException(BitVector$$ExternalSyntheticOutline0.m(str, " must not be null"));
        Logger.e("Throwing ", nullPointerException);
        throw nullPointerException;
    }

    public static void precondition(boolean z, String str) {
        if (z) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
        Logger.e("Throwing ", illegalArgumentException);
        throw illegalArgumentException;
    }

    public static void validFileName(String str, String str2) {
        if (TextUtils.isEmpty(str) || !str.matches(VALID_FILE_REGEX_PATTERN)) {
            Locale locale = Locale.US;
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m$1(str2, " must be valid file name, provided fileName: ", str));
        }
    }
}
