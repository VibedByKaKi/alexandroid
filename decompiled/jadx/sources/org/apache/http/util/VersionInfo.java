package org.apache.http.util;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.ArrayList;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang3.SystemProperties;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class VersionInfo {
    public static final String PROPERTY_MODULE = "info.module";
    public static final String PROPERTY_RELEASE = "info.release";
    public static final String PROPERTY_TIMESTAMP = "info.timestamp";
    public static final String UNAVAILABLE = "UNAVAILABLE";
    public static final String VERSION_PROPERTY_FILE = "version.properties";
    private final String infoClassloader;
    private final String infoModule;
    private final String infoPackage;
    private final String infoRelease;
    private final String infoTimestamp;

    public VersionInfo(String str, String str2, String str3, String str4, String str5) {
        Args.notNull(str, "Package identifier");
        this.infoPackage = str;
        this.infoModule = str2 == null ? "UNAVAILABLE" : str2;
        this.infoRelease = str3 == null ? "UNAVAILABLE" : str3;
        this.infoTimestamp = str4 == null ? "UNAVAILABLE" : str4;
        this.infoClassloader = str5 == null ? "UNAVAILABLE" : str5;
    }

    public static VersionInfo fromMap(String str, Map<?, ?> map, ClassLoader classLoader) {
        String str2;
        String str3;
        String str4;
        Args.notNull(str, "Package identifier");
        if (map != null) {
            String str5 = (String) map.get(PROPERTY_MODULE);
            if (str5 != null && str5.length() < 1) {
                str5 = null;
            }
            String str6 = (String) map.get(PROPERTY_RELEASE);
            if (str6 != null && (str6.length() < 1 || str6.equals("${pom.version}"))) {
                str6 = null;
            }
            String str7 = (String) map.get(PROPERTY_TIMESTAMP);
            str4 = (str7 == null || (str7.length() >= 1 && !str7.equals("${mvn.timestamp}"))) ? str7 : null;
            str2 = str5;
            str3 = str6;
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
        }
        return new VersionInfo(str, str2, str3, str4, classLoader != null ? classLoader.toString() : null);
    }

    public static String getUserAgent(String str, String str2, Class<?> cls) {
        VersionInfo loadVersionInfo = loadVersionInfo(str2, cls.getClassLoader());
        StringBuilder m = TableInfo$$ExternalSyntheticOutline0.m(str, "/", loadVersionInfo != null ? loadVersionInfo.getRelease() : "UNAVAILABLE", " (Java/", System.getProperty(SystemProperties.JAVA_VERSION));
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.apache.http.util.VersionInfo loadVersionInfo(java.lang.String r5, java.lang.ClassLoader r6) {
        /*
            java.lang.String r0 = "/version.properties"
            java.lang.String r1 = "Package identifier"
            org.apache.http.util.Args.notNull(r5, r1)
            if (r6 == 0) goto La
            goto L12
        La:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r6 = r6.getContextClassLoader()
        L12:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L41
            r2.<init>()     // Catch: java.io.IOException -> L41
            r3 = 46
            r4 = 47
            java.lang.String r3 = r5.replace(r3, r4)     // Catch: java.io.IOException -> L41
            r2.append(r3)     // Catch: java.io.IOException -> L41
            r2.append(r0)     // Catch: java.io.IOException -> L41
            java.lang.String r0 = r2.toString()     // Catch: java.io.IOException -> L41
            java.io.InputStream r0 = r6.getResourceAsStream(r0)     // Catch: java.io.IOException -> L41
            if (r0 == 0) goto L41
            java.util.Properties r2 = new java.util.Properties     // Catch: java.lang.Throwable -> L3c
            r2.<init>()     // Catch: java.lang.Throwable -> L3c
            r2.load(r0)     // Catch: java.lang.Throwable -> L3c
            r0.close()     // Catch: java.io.IOException -> L42
            goto L42
        L3c:
            r2 = move-exception
            r0.close()     // Catch: java.io.IOException -> L41
            throw r2     // Catch: java.io.IOException -> L41
        L41:
            r2 = r1
        L42:
            if (r2 == 0) goto L48
            org.apache.http.util.VersionInfo r1 = fromMap(r5, r2, r6)
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.util.VersionInfo.loadVersionInfo(java.lang.String, java.lang.ClassLoader):org.apache.http.util.VersionInfo");
    }

    public final String getClassloader() {
        return this.infoClassloader;
    }

    public final String getModule() {
        return this.infoModule;
    }

    public final String getPackage() {
        return this.infoPackage;
    }

    public final String getRelease() {
        return this.infoRelease;
    }

    public final String getTimestamp() {
        return this.infoTimestamp;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.infoClassloader.length() + this.infoTimestamp.length() + this.infoRelease.length() + this.infoModule.length() + this.infoPackage.length() + 20);
        sb.append("VersionInfo(");
        sb.append(this.infoPackage);
        sb.append(AbstractJsonLexerKt.COLON);
        sb.append(this.infoModule);
        if (!"UNAVAILABLE".equals(this.infoRelease)) {
            sb.append(AbstractJsonLexerKt.COLON);
            sb.append(this.infoRelease);
        }
        if (!"UNAVAILABLE".equals(this.infoTimestamp)) {
            sb.append(AbstractJsonLexerKt.COLON);
            sb.append(this.infoTimestamp);
        }
        sb.append(')');
        if (!"UNAVAILABLE".equals(this.infoClassloader)) {
            sb.append('@');
            sb.append(this.infoClassloader);
        }
        return sb.toString();
    }

    public static VersionInfo[] loadVersionInfo(String[] strArr, ClassLoader classLoader) {
        Args.notNull(strArr, "Package identifier array");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            VersionInfo loadVersionInfo = loadVersionInfo(str, classLoader);
            if (loadVersionInfo != null) {
                arrayList.add(loadVersionInfo);
            }
        }
        return (VersionInfo[]) arrayList.toArray(new VersionInfo[arrayList.size()]);
    }
}
