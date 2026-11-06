package com.amazon.coral.util.http.uri;

import com.amazon.coral.util.UrlEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class QueryStringParser {
    private static final UrlEncoder urlEncoder = new UrlEncoder();
    private static final Pattern REGEX_STRING_OF_SLASHES = Pattern.compile("[/]+");

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Visitor {
        boolean onParameter(CharSequence charSequence, CharSequence charSequence2);
    }

    private static CharSequence getKey(CharSequence charSequence) {
        int keyValueSeparator = getKeyValueSeparator(charSequence);
        return keyValueSeparator == -1 ? charSequence : charSequence.subSequence(0, keyValueSeparator);
    }

    private static int getKeyValueSeparator(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (charSequence.charAt(i) == '=') {
                return i;
            }
        }
        return -1;
    }

    public static CharSequence getPath(CharSequence charSequence, boolean z) {
        CharSequence rawPath = getRawPath(charSequence);
        return z ? rawPath.toString() : REGEX_STRING_OF_SLASHES.matcher(rawPath.toString()).replaceAll("/");
    }

    public static CharSequence getQuery(CharSequence charSequence) {
        if (charSequence == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int querySeparator = getQuerySeparator(charSequence);
        if (querySeparator < 0) {
            return null;
        }
        return charSequence.subSequence(querySeparator + 1, charSequence.length());
    }

    private static int getQuerySeparator(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (charSequence.charAt(i) == '?') {
                return i;
            }
        }
        return -1;
    }

    public static CharSequence getRawPath(CharSequence charSequence) {
        if (charSequence == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int i = 0;
        while (i < charSequence.length() - 1 && charSequence.charAt(i) == '/') {
            i++;
        }
        int querySeparator = getQuerySeparator(charSequence);
        if (querySeparator < 0) {
            querySeparator = charSequence.length();
        }
        while (querySeparator > i && charSequence.charAt(querySeparator - 1) == '/') {
            querySeparator--;
        }
        return charSequence.subSequence(i, querySeparator);
    }

    private static CharSequence getValue(CharSequence charSequence) {
        int keyValueSeparator = getKeyValueSeparator(charSequence);
        return keyValueSeparator == -1 ? "" : charSequence.subSequence(keyValueSeparator + 1, charSequence.length());
    }

    private static boolean handleParam(CharSequence charSequence, int i, int i2, Visitor visitor) {
        CharSequence subSequence = charSequence.subSequence(i, i2);
        if (subSequence.length() == 0) {
            return true;
        }
        UrlEncoder urlEncoder2 = urlEncoder;
        String decode = urlEncoder2.decode(getKey(subSequence));
        CharSequence value = getValue(subSequence);
        if (value != null) {
            value = urlEncoder2.decode(value);
        }
        return visitor.onParameter(decode, value);
    }

    public static boolean parse(CharSequence charSequence, Visitor visitor) {
        if (visitor == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return false;
        }
        if (charSequence == null) {
            return true;
        }
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char charAt = charSequence.charAt(i2);
            if (charAt == '&' || charAt == ';') {
                if (!handleParam(charSequence, i, i2, visitor)) {
                    return false;
                }
                i = i2 + 1;
            }
        }
        return handleParam(charSequence, i, charSequence.length(), visitor);
    }

    public static Map<String, List<String>> toMapOfLists(CharSequence charSequence) {
        final TreeMap treeMap = new TreeMap();
        parse(charSequence, new Visitor() { // from class: com.amazon.coral.util.http.uri.QueryStringParser.2
            @Override // com.amazon.coral.util.http.uri.QueryStringParser.Visitor
            public boolean onParameter(CharSequence charSequence2, CharSequence charSequence3) {
                String valueOf = String.valueOf(charSequence2);
                String valueOf2 = charSequence3 != null ? String.valueOf(charSequence3) : null;
                List list = (List) treeMap.get(valueOf);
                if (list == null) {
                    list = new ArrayList();
                    treeMap.put(valueOf, list);
                }
                list.add(valueOf2);
                return true;
            }
        });
        return treeMap;
    }

    public static Map<String, String> toMapOfStrings(CharSequence charSequence) {
        final TreeMap treeMap = new TreeMap();
        parse(charSequence, new Visitor() { // from class: com.amazon.coral.util.http.uri.QueryStringParser.1
            @Override // com.amazon.coral.util.http.uri.QueryStringParser.Visitor
            public boolean onParameter(CharSequence charSequence2, CharSequence charSequence3) {
                treeMap.put(String.valueOf(charSequence2), charSequence3 != null ? String.valueOf(charSequence3) : null);
                return true;
            }
        });
        return treeMap;
    }

    public static CharSequence getPath(CharSequence charSequence) {
        return getPath(charSequence, false);
    }
}
