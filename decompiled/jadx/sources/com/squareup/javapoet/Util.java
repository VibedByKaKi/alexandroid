package com.squareup.javapoet;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.lang.model.element.Modifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class Util {
    private Util() {
    }

    public static String characterLiteralWithoutSingleQuotes(char c) {
        if (c == '\f') {
            return "\\f";
        }
        if (c == '\r') {
            return "\\r";
        }
        if (c == '\"') {
            return DeviceConfigConstants.DOUBLE_QUOTE;
        }
        if (c == '\'') {
            return "\\'";
        }
        if (c == '\\') {
            return "\\\\";
        }
        switch (c) {
            case '\b':
                return "\\b";
            case '\t':
                return "\\t";
            case '\n':
                return "\\n";
            default:
                return Character.isISOControl(c) ? String.format("\\u%04x", Integer.valueOf(c)) : Character.toString(c);
        }
    }

    public static void checkArgument(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T> T checkNotNull(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    public static void checkState(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static <T> List<T> immutableList(Collection<T> collection) {
        return Collections.unmodifiableList(new ArrayList(collection));
    }

    public static <K, V> Map<K, V> immutableMap(Map<K, V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static <K, V> Map<K, List<V>> immutableMultimap(Map<K, List<V>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, List<V>> entry : map.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                linkedHashMap.put(entry.getKey(), immutableList(entry.getValue()));
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public static <T> Set<T> immutableSet(Collection<T> collection) {
        return Collections.unmodifiableSet(new LinkedHashSet(collection));
    }

    public static void requireExactlyOneOf(Set<Modifier> set, Modifier... modifierArr) {
        int i = 0;
        for (Modifier modifier : modifierArr) {
            if (set.contains(modifier)) {
                i++;
            }
        }
        checkArgument(i == 1, "modifiers %s must contain one of %s", set, Arrays.toString(modifierArr));
    }

    public static String stringLiteralWithDoubleQuotes(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('\"');
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\'') {
                sb.append("'");
            } else if (charAt == '\"') {
                sb.append("\\\"");
            } else {
                sb.append(characterLiteralWithoutSingleQuotes(charAt));
                if (charAt == '\n' && i + 1 < str.length()) {
                    AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, "\"\n", str2, str2, "+ \"");
                }
            }
        }
        sb.append('\"');
        return sb.toString();
    }

    public static <T> Set<T> union(Set<T> set, Set<T> set2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(set);
        linkedHashSet.addAll(set2);
        return linkedHashSet;
    }
}
