package org.apache.commons.lang3;

import com.amazon.deecomms.remoteConfig.ArcusConfig;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class RegExUtils {
    static final Pattern VERSION_SPLIT_PATTERN = Pattern.compile(ArcusConfig.PATH_SEPARATOR);

    @Deprecated
    public RegExUtils() {
    }

    public static Pattern dotAll(String str) {
        return Pattern.compile(str, 32);
    }

    public static Matcher dotAllMatcher(String str, CharSequence charSequence) {
        return dotAll(str).matcher(charSequence);
    }

    public static String removeAll(CharSequence charSequence, Pattern pattern) {
        return replaceAll(charSequence, pattern, "");
    }

    public static String removeFirst(CharSequence charSequence, Pattern pattern) {
        return replaceFirst(charSequence, pattern, "");
    }

    public static String removePattern(CharSequence charSequence, String str) {
        return replacePattern(charSequence, str, "");
    }

    public static String replaceAll(CharSequence charSequence, Pattern pattern, String str) {
        return ObjectUtils.anyNull(charSequence, pattern, str) ? toStringOrNull(charSequence) : pattern.matcher(charSequence).replaceAll(str);
    }

    public static String replaceFirst(CharSequence charSequence, Pattern pattern, String str) {
        return (charSequence == null || pattern == null || str == null) ? toStringOrNull(charSequence) : pattern.matcher(charSequence).replaceFirst(str);
    }

    public static String replacePattern(CharSequence charSequence, String str, String str2) {
        return ObjectUtils.anyNull(charSequence, str, str2) ? toStringOrNull(charSequence) : dotAllMatcher(str, charSequence).replaceAll(str2);
    }

    private static String toStringOrNull(CharSequence charSequence) {
        return Objects.toString(charSequence, null);
    }

    @Deprecated
    public static String removeAll(String str, Pattern pattern) {
        return replaceAll((CharSequence) str, pattern, "");
    }

    @Deprecated
    public static String removeFirst(String str, Pattern pattern) {
        return replaceFirst(str, pattern, "");
    }

    @Deprecated
    public static String removePattern(String str, String str2) {
        return replacePattern((CharSequence) str, str2, "");
    }

    public static String removeAll(String str, String str2) {
        return replaceAll(str, str2, "");
    }

    public static String removeFirst(String str, String str2) {
        return replaceFirst(str, str2, "");
    }

    @Deprecated
    public static Matcher dotAllMatcher(String str, String str2) {
        return dotAll(str).matcher(str2);
    }

    @Deprecated
    public static String replaceFirst(String str, Pattern pattern, String str2) {
        return replaceFirst((CharSequence) str, pattern, str2);
    }

    public static String replaceFirst(String str, String str2, String str3) {
        return (str == null || str2 == null || str3 == null) ? str : str.replaceFirst(str2, str3);
    }

    @Deprecated
    public static String replaceAll(String str, Pattern pattern, String str2) {
        return replaceAll((CharSequence) str, pattern, str2);
    }

    @Deprecated
    public static String replacePattern(String str, String str2, String str3) {
        return replacePattern((CharSequence) str, str2, str3);
    }

    public static String replaceAll(String str, String str2, String str3) {
        return ObjectUtils.anyNull(str, str2, str3) ? str : str.replaceAll(str2, str3);
    }
}
