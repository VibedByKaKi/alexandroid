package org.apache.logging.log4j.util;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import com.google.common.math.Stats$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalApi
/* loaded from: classes11.dex */
public final class Strings {
    private static final String COMMA_DELIMITED_RE = "\\s*,\\s*";
    public static final String EMPTY = "";
    private static final int MAX_FORMAT_BUFFER_LENGTH = 518;
    private static final ThreadLocal<StringBuilder> FORMAT_BUFFER_REF = ThreadLocal.withInitial(new Stats$$ExternalSyntheticLambda0(25));
    public static final String[] EMPTY_ARRAY = new String[0];
    public static final String LINE_SEPARATOR = System.lineSeparator();

    private Strings() {
    }

    public static String concat(String str, String str2) {
        if (isEmpty(str)) {
            return str2;
        }
        if (isEmpty(str2)) {
            return str;
        }
        StringBuilder sb = FORMAT_BUFFER_REF.get();
        try {
            sb.append(str);
            sb.append(str2);
            return sb.toString();
        } finally {
            StringBuilders.trimToMaxSize(sb, MAX_FORMAT_BUFFER_LENGTH);
            sb.setLength(0);
        }
    }

    public static String dquote(String str) {
        return AppLaunchChecker$$ExternalSyntheticOutline0.m('\"', DeviceConfigConstants.DOUBLE_QUOTE, str);
    }

    public static boolean isBlank(String str) {
        if (str != null && !str.isEmpty()) {
            for (int i = 0; i < str.length(); i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    public static boolean isNotEmpty(CharSequence charSequence) {
        return !isEmpty(charSequence);
    }

    public static String join(Iterator<?> it2, char c) {
        if (it2 == null) {
            return null;
        }
        if (!it2.hasNext()) {
            return "";
        }
        Object next = it2.next();
        if (!it2.hasNext()) {
            return Objects.toString(next, "");
        }
        StringBuilder sb = new StringBuilder(256);
        if (next != null) {
            sb.append(next);
        }
        while (it2.hasNext()) {
            sb.append(c);
            Object next2 = it2.next();
            if (next2 != null) {
                sb.append(next2);
            }
        }
        return sb.toString();
    }

    public static String left(String str, int i) {
        if (str == null) {
            return null;
        }
        return i < 0 ? "" : str.length() <= i ? str : str.substring(0, i);
    }

    public static String quote(String str) {
        return AppLaunchChecker$$ExternalSyntheticOutline0.m('\'', "'", str);
    }

    public static String repeat(String str, int i) {
        Objects.requireNonNull(str, "str");
        if (i < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("count");
            return null;
        }
        StringBuilder sb = FORMAT_BUFFER_REF.get();
        for (int i2 = 0; i2 < i; i2++) {
            try {
                sb.append(str);
            } catch (Throwable th) {
                StringBuilders.trimToMaxSize(sb, MAX_FORMAT_BUFFER_LENGTH);
                sb.setLength(0);
                throw th;
            }
        }
        String sb2 = sb.toString();
        StringBuilders.trimToMaxSize(sb, MAX_FORMAT_BUFFER_LENGTH);
        sb.setLength(0);
        return sb2;
    }

    public static String[] splitList(String str) {
        return str != null ? str.split(COMMA_DELIMITED_RE) : new String[0];
    }

    public static String toRootLowerCase(String str) {
        return str.toLowerCase(Locale.ROOT);
    }

    public static String toRootUpperCase(String str) {
        return str.toUpperCase(Locale.ROOT);
    }

    public static String trimToNull(String str) {
        String trim = str == null ? null : str.trim();
        if (isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    public static String join(Iterable<?> iterable, char c) {
        if (iterable == null) {
            return null;
        }
        return join(iterable.iterator(), c);
    }
}
