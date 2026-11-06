package com.amazon.appmanager.lib;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PreloadMetricData {
    private Map<String, String> mExceptionMap = new ConcurrentHashMap();
    private String mPTPreviousValue;
    private String mPTSource;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SourceType {
        SP,
        CP,
        File
    }

    public String formatToString() {
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<Map.Entry<String, String>> it2 = this.mExceptionMap.entrySet().iterator();
            while (it2.hasNext()) {
                String key = it2.next().getKey();
                sb.append(key);
                sb.append('\'');
                sb.append(this.mExceptionMap.get(key));
                sb.append(AbstractJsonLexerKt.COMMA);
            }
            return "mPTSource=" + this.mPTSource + ";mPTPreviousValue=" + this.mPTPreviousValue + ";mExceptionMap=" + (this.mExceptionMap.size() == 0 ? "null" : sb.toString()) + ";";
        } catch (Exception unused) {
            return "PreloadMetricData FormatToString error";
        }
    }

    public String getPTPreviousValue() {
        return this.mPTPreviousValue;
    }

    public String getPTSource() {
        return this.mPTSource;
    }

    public void logException(String str, String str2) {
        this.mExceptionMap.put(str, str2);
    }

    public void setPTPreviousValue(String str) {
        this.mPTPreviousValue = str;
    }

    public void setPTSource(String str) {
        this.mPTSource = str;
    }
}
