package org.json;

import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Cookie {
    public static String escape(String str) {
        String trim = str.trim();
        int length = trim.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = trim.charAt(i);
            if (charAt < ' ' || charAt == '+' || charAt == '%' || charAt == '=' || charAt == ';') {
                sb.append('%');
                sb.append(Character.forDigit((char) ((charAt >>> 4) & 15), 16));
                sb.append(Character.forDigit((char) (charAt & 15), 16));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static JSONObject toJSONObject(String str) {
        Object trim;
        JSONObject jSONObject = new JSONObject();
        JSONTokener jSONTokener = new JSONTokener(str);
        String unescape = unescape(jSONTokener.nextTo('=').trim());
        if ("".equals(unescape)) {
            XML$$ExternalSyntheticBUOutline0.m$1("Cookies must have a 'name'");
            return null;
        }
        jSONObject.put("name", unescape);
        jSONTokener.next('=');
        jSONObject.put("value", unescape(jSONTokener.nextTo(';')).trim());
        jSONTokener.next();
        while (jSONTokener.more()) {
            String lowerCase = unescape(jSONTokener.nextTo("=;")).trim().toLowerCase(Locale.ROOT);
            if ("name".equalsIgnoreCase(lowerCase)) {
                XML$$ExternalSyntheticBUOutline0.m$1("Illegal attribute name: 'name'");
                return null;
            }
            if ("value".equalsIgnoreCase(lowerCase)) {
                XML$$ExternalSyntheticBUOutline0.m$1("Illegal attribute name: 'value'");
                return null;
            }
            if (jSONTokener.next() != '=') {
                trim = Boolean.TRUE;
            } else {
                trim = unescape(jSONTokener.nextTo(';')).trim();
                jSONTokener.next();
            }
            if (!"".equals(lowerCase) && !"".equals(trim)) {
                jSONObject.put(lowerCase, trim);
            }
        }
        return jSONObject;
    }

    public static String toString(JSONObject jSONObject) throws JSONException {
        StringBuilder sb = new StringBuilder();
        String str = null;
        String str2 = null;
        for (String str3 : jSONObject.keySet()) {
            if ("name".equalsIgnoreCase(str3)) {
                str = jSONObject.getString(str3).trim();
            }
            if ("value".equalsIgnoreCase(str3)) {
                str2 = jSONObject.getString(str3).trim();
            }
            if (str != null && str2 != null) {
                break;
            }
        }
        if (str == null || "".equals(str.trim())) {
            XML$$ExternalSyntheticBUOutline0.m$1("Cookie does not have a name");
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        sb.append(escape(str));
        sb.append("=");
        sb.append(escape(str2));
        for (String str4 : jSONObject.keySet()) {
            if (!"name".equalsIgnoreCase(str4) && !"value".equalsIgnoreCase(str4)) {
                Object opt = jSONObject.opt(str4);
                if (!(opt instanceof Boolean)) {
                    sb.append(';');
                    sb.append(escape(str4));
                    sb.append('=');
                    sb.append(escape(opt.toString()));
                } else if (Boolean.TRUE.equals(opt)) {
                    sb.append(';');
                    sb.append(escape(str4));
                }
            }
        }
        return sb.toString();
    }

    public static String unescape(String str) {
        int i;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt == '+') {
                charAt = ' ';
            } else if (charAt == '%' && (i = i2 + 2) < length) {
                int dehexchar = JSONTokener.dehexchar(str.charAt(i2 + 1));
                int dehexchar2 = JSONTokener.dehexchar(str.charAt(i));
                if (dehexchar >= 0 && dehexchar2 >= 0) {
                    charAt = (char) ((dehexchar * 16) + dehexchar2);
                    i2 = i;
                }
            }
            sb.append(charAt);
            i2++;
        }
        return sb.toString();
    }
}
