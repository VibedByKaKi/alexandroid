package com.amazon.coral.util;

import java.io.InputStream;
import java.net.URI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class Magic {
    private static final Logger log = LogManager.getLogger((Class<?>) Magic.class);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Number {
        CLASS,
        ZIP,
        XML,
        UNKNOWN
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(3:2|3|(2:5|(2:7|(2:9|(1:11))(1:18))(1:19))(1:20))|12|13|14|(1:(0))) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0051 -> B:12:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.coral.util.Magic.Number getMagicNumber(java.net.URI r6, java.io.InputStream r7) {
        /*
            java.lang.String r0 = "Can not read "
            com.amazon.coral.util.Magic$Number r1 = com.amazon.coral.util.Magic.Number.UNKNOWN
            r2 = 4
            byte[] r3 = new byte[r2]
            r4 = 0
            read(r7, r4, r2, r3)     // Catch: java.lang.Throwable -> L43
            r2 = r3[r4]     // Catch: java.lang.Throwable -> L43
            int r2 = r2 << 24
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r4
            r4 = 1
            r4 = r3[r4]     // Catch: java.lang.Throwable -> L43
            int r4 = r4 << 16
            r5 = 16711680(0xff0000, float:2.3418052E-38)
            r4 = r4 & r5
            r2 = r2 | r4
            r4 = 2
            r4 = r3[r4]     // Catch: java.lang.Throwable -> L43
            int r4 = r4 << 8
            r5 = 65280(0xff00, float:9.1477E-41)
            r4 = r4 & r5
            r2 = r2 | r4
            r4 = 3
            r4 = r3[r4]     // Catch: java.lang.Throwable -> L43
            r4 = r4 & 255(0xff, float:3.57E-43)
            r2 = r2 | r4
            r4 = -889275714(0xffffffffcafebabe, float:-8346975.0)
            if (r2 == r4) goto L4b
            r4 = 1010792557(0x3c3f786d, float:0.011686427)
            if (r2 == r4) goto L48
            r4 = 1347093252(0x504b0304, float:1.362389E10)
            if (r2 == r4) goto L45
            boolean r2 = isXML(r2, r3, r7)     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L4d
            com.amazon.coral.util.Magic$Number r1 = com.amazon.coral.util.Magic.Number.XML     // Catch: java.lang.Throwable -> L43
            goto L4d
        L43:
            r2 = move-exception
            goto L51
        L45:
            com.amazon.coral.util.Magic$Number r1 = com.amazon.coral.util.Magic.Number.ZIP     // Catch: java.lang.Throwable -> L43
            goto L4d
        L48:
            com.amazon.coral.util.Magic$Number r1 = com.amazon.coral.util.Magic.Number.XML     // Catch: java.lang.Throwable -> L43
            goto L4d
        L4b:
            com.amazon.coral.util.Magic$Number r1 = com.amazon.coral.util.Magic.Number.CLASS     // Catch: java.lang.Throwable -> L43
        L4d:
            r7.close()     // Catch: java.lang.Throwable -> L63
            goto L63
        L51:
            org.apache.logging.log4j.Logger r3 = com.amazon.coral.util.Magic.log     // Catch: java.lang.Throwable -> L64
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L64
            r4.append(r6)     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L64
            r3.error(r6, r2)     // Catch: java.lang.Throwable -> L64
            goto L4d
        L63:
            return r1
        L64:
            r6 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L68
        L68:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.coral.util.Magic.getMagicNumber(java.net.URI, java.io.InputStream):com.amazon.coral.util.Magic$Number");
    }

    private static boolean isXML(int i, byte[] bArr, InputStream inputStream) throws Throwable {
        switch (i & (-256)) {
            case -579639693:
            case -144421888:
            case -68278272:
            case 251592448:
            case 724530688:
                return false;
            case -272908544:
                bArr[0] = bArr[3];
                read(inputStream, 1, 3, bArr);
                break;
            default:
                int i2 = i & (-65536);
                if (i2 == 0 || i2 == 65279 || i2 == 65534) {
                    return false;
                }
                break;
        }
        return bArr[0] == 60;
    }

    private static boolean read(InputStream inputStream, int i, int i2, byte[] bArr) throws Throwable {
        while (i2 > 0) {
            int read = inputStream.read(bArr, i, i2);
            if (read <= 0) {
                return false;
            }
            i2 -= read;
            i += read;
        }
        return true;
    }

    public static Number getMagicNumber(URI uri) {
        try {
            return getMagicNumber(uri, uri.toURL().openStream());
        } catch (Throwable th) {
            log.error("Can not scan " + uri, th);
            return Number.UNKNOWN;
        }
    }
}
