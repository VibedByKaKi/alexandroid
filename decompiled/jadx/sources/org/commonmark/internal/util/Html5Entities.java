package org.commonmark.internal.util;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.biloba.utils.WebConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Html5Entities {
    private static final String ENTITY_PATH = "/org/commonmark/internal/util/entities.properties";
    private static final Map<String, String> NAMED_CHARACTER_REFERENCES = readEntities();

    public static String entityToString(String str) {
        int i;
        if (str.startsWith(WebConstants.UriConstants.AMPERSAND_KEY) && str.endsWith(";")) {
            String m = AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 1, str);
            if (m.startsWith("#")) {
                String substring = m.substring(1);
                if (substring.startsWith("x") || substring.startsWith("X")) {
                    substring = substring.substring(1);
                    i = 16;
                } else {
                    i = 10;
                }
                try {
                    int parseInt = Integer.parseInt(substring, i);
                    return parseInt == 0 ? "�" : new String(Character.toChars(parseInt));
                } catch (IllegalArgumentException unused) {
                    return "�";
                }
            }
            String str2 = NAMED_CHARACTER_REFERENCES.get(m);
            if (str2 != null) {
                return str2;
            }
        }
        return str;
    }

    private static Map<String, String> readEntities() {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Html5Entities.class.getResourceAsStream(ENTITY_PATH), StandardCharsets.UTF_8));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        hashMap.put("NewLine", "\n");
                        return hashMap;
                    }
                    if (readLine.length() != 0) {
                        int indexOf = readLine.indexOf("=");
                        hashMap.put(readLine.substring(0, indexOf), readLine.substring(indexOf + 1));
                    }
                } finally {
                }
            }
        } catch (IOException e) {
            Single$$ExternalSyntheticBUOutline0.m$1("Failed reading data for HTML named character references", e);
            return null;
        }
    }
}
