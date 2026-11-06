package com.typesafe.config.impl;

import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigOrigin;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class ConfigImplUtil {
    public static boolean equalsHandlingNull(Object obj, Object obj2) {
        if (obj == null && obj2 != null) {
            return false;
        }
        if (obj != null && obj2 == null) {
            return false;
        }
        if (obj == obj2) {
            return true;
        }
        return obj.equals(obj2);
    }

    public static ConfigException extractInitializerError(ExceptionInInitializerError exceptionInInitializerError) {
        Throwable cause = exceptionInInitializerError.getCause();
        if (cause == null) {
            throw exceptionInInitializerError;
        }
        if (cause instanceof ConfigException) {
            return (ConfigException) cause;
        }
        throw exceptionInInitializerError;
    }

    public static boolean isC0Control(int i) {
        return i >= 0 && i <= 31;
    }

    public static boolean isWhitespace(int i) {
        if (i == 10 || i == 32 || i == 160 || i == 8199 || i == 8239 || i == 65279) {
            return true;
        }
        return Character.isWhitespace(i);
    }

    public static String joinPath(List<String> list) {
        return joinPath((String[]) list.toArray(new String[0]));
    }

    public static ConfigOrigin readOrigin(ObjectInputStream objectInputStream) throws IOException {
        return SerializedConfigValue.readOrigin(objectInputStream, null);
    }

    public static String renderJsonString(String str) {
        StringBuilder sb = new StringBuilder(DeviceConfigConstants.DOUBLE_QUOTE);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\f') {
                sb.append("\\f");
            } else if (charAt == '\r') {
                sb.append("\\r");
            } else if (charAt == '\"') {
                sb.append("\\\"");
            } else if (charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        sb.append("\\b");
                        break;
                    case '\t':
                        sb.append("\\t");
                        break;
                    case '\n':
                        sb.append("\\n");
                        break;
                    default:
                        if (isC0Control(charAt)) {
                            sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                            break;
                        } else {
                            sb.append(charAt);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        sb.append('\"');
        return sb.toString();
    }

    public static String renderStringUnquotedIfPossible(String str) {
        if (str.length() == 0) {
            return renderJsonString(str);
        }
        int codePointAt = str.codePointAt(0);
        if (Character.isDigit(codePointAt) || codePointAt == 45) {
            return renderJsonString(str);
        }
        if (str.startsWith("include") || str.startsWith("true") || str.startsWith("false") || str.startsWith("null") || str.contains("//")) {
            return renderJsonString(str);
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isLetter(charAt) && !Character.isDigit(charAt) && charAt != '-') {
                return renderJsonString(str);
            }
        }
        return str;
    }

    public static List<String> splitPath(String str) {
        ArrayList arrayList = new ArrayList();
        for (Path newPath = Path.newPath(str); newPath != null; newPath = newPath.remainder()) {
            arrayList.add(newPath.first());
        }
        return arrayList;
    }

    public static String toCamelCase(String str) {
        String[] split = str.split("-+");
        StringBuilder sb = new StringBuilder(str.length());
        for (String str2 : split) {
            if (sb.length() == 0) {
                sb.append(str2);
            } else {
                sb.append(str2.substring(0, 1).toUpperCase());
                sb.append(str2.substring(1));
            }
        }
        return sb.toString();
    }

    public static String unicodeTrim(String str) {
        int codePointAt;
        int i;
        int length = str.length();
        if (length == 0) {
            return str;
        }
        int i2 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt != ' ' && charAt != '\n') {
                int codePointAt2 = str.codePointAt(i2);
                if (!isWhitespace(codePointAt2)) {
                    break;
                }
                i2 = Character.charCount(codePointAt2) + i2;
            } else {
                i2++;
            }
        }
        while (length > i2) {
            int i3 = length - 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 != ' ' && charAt2 != '\n') {
                if (Character.isLowSurrogate(charAt2)) {
                    codePointAt = str.codePointAt(length - 2);
                    i = 2;
                } else {
                    codePointAt = str.codePointAt(i3);
                    i = 1;
                }
                if (!isWhitespace(codePointAt)) {
                    break;
                }
                length -= i;
            } else {
                length--;
            }
        }
        return str.substring(i2, length);
    }

    public static File urlToFile(URL url) {
        try {
            return new File(url.toURI());
        } catch (IllegalArgumentException unused) {
            return new File(url.getPath());
        } catch (URISyntaxException unused2) {
            return new File(url.getPath());
        }
    }

    public static void writeOrigin(ObjectOutputStream objectOutputStream, ConfigOrigin configOrigin) throws IOException {
        SerializedConfigValue.writeOrigin(new DataOutputStream(objectOutputStream), (SimpleConfigOrigin) configOrigin, null);
    }

    public static String joinPath(String... strArr) {
        return new Path(strArr).render();
    }
}
