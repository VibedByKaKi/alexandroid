package com.google.android.gms.internal.home;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzbc {
    private static final zzy zza = zzy.zzc('.');
    private static final zzy zzb = zzy.zzc(AbstractJsonLexerKt.COLON);
    private static final Inet4Address zzc = (Inet4Address) zzb("127.0.0.1");
    private static final Inet4Address zzd = (Inet4Address) zzb("0.0.0.0");

    public static String zza(InetAddress inetAddress) {
        inetAddress.getClass();
        if (inetAddress instanceof Inet4Address) {
            return inetAddress.getHostAddress();
        }
        zzab.zzd(inetAddress instanceof Inet6Address);
        byte[] address = inetAddress.getAddress();
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            int i2 = i + i;
            iArr[i] = (address[i2 + 1] & 255) | ((address[i2] & 255) << 8);
        }
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < 9; i6++) {
            if (i6 >= 8 || iArr[i6] != 0) {
                if (i5 >= 0) {
                    int i7 = i6 - i5;
                    int i8 = i7 > i3 ? i7 : i3;
                    if (i7 > i3) {
                        i4 = i5;
                    }
                    i5 = -1;
                    i3 = i8;
                }
            } else if (i5 < 0) {
                i5 = i6;
            }
        }
        if (i3 >= 2) {
            Arrays.fill(iArr, i4, i3 + i4, -1);
        }
        StringBuilder sb = new StringBuilder(39);
        int i9 = 0;
        boolean z = false;
        while (i9 < 8) {
            boolean z2 = iArr[i9] >= 0;
            if (z2) {
                if (z) {
                    sb.append(AbstractJsonLexerKt.COLON);
                }
                sb.append(Integer.toHexString(iArr[i9]));
            } else if (i9 == 0 || z) {
                sb.append("::");
            }
            i9++;
            z = z2;
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x013c, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x013d, code lost:
    
        r8 = r1.array();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00f8, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00ea, code lost:
    
        if (r1 == 8) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0050, code lost:
    
        r2 = androidx.room.util.TableInfo$$ExternalSyntheticOutline0.m$1(r10, java.lang.Integer.toHexString(((r2[0] & 255) << 8) | (r2[1] & 255)), ":", java.lang.Integer.toHexString((r2[3] & 255) | ((r2[2] & 255) << 8)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0077, code lost:
    
        r2 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0142, code lost:
    
        if (r2 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0144, code lost:
    
        if (r1 == (-1)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0147, code lost:
    
        r8 = zzd(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0034, code lost:
    
        if (r3 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0039, code lost:
    
        if (r2 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003b, code lost:
    
        r2 = r14.lastIndexOf(58) + 1;
        r10 = r14.substring(0, r2);
        r2 = zzd(r14.substring(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004e, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        if (r1 == (-1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r2 = r2.substring(0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        r1 = com.google.android.gms.internal.home.zzbc.zzb.zzb(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
    
        if (r1 < 2) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0086, code lost:
    
        if (r1 <= 8) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        r1 = r1 + 1;
        r3 = 8 - r1;
        r10 = 0;
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        if (r10 >= (r2.length() - 1)) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009a, code lost:
    
        if (r2.charAt(r10) != ':') goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a2, code lost:
    
        if (r2.charAt(r10 + 1) != ':') goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a4, code lost:
    
        if (r11 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a8, code lost:
    
        r11 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00aa, code lost:
    
        if (r10 != 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ac, code lost:
    
        r11 = r3 + 2;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b5, code lost:
    
        if (r10 != (r2.length() - 2)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
    
        r3 = r11;
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bb, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c1, code lost:
    
        if (r2.charAt(0) != ':') goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c7, code lost:
    
        if (r2.charAt(1) == ':') goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d4, code lost:
    
        if (r2.charAt(r2.length() - 1) != ':') goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e0, code lost:
    
        if (r2.charAt(r2.length() - 2) == ':') goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e4, code lost:
    
        if (r11 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e6, code lost:
    
        if (r3 > 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ed, code lost:
    
        r1 = java.nio.ByteBuffer.allocate(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f5, code lost:
    
        if (r2.charAt(0) != ':') goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fd, code lost:
    
        if (r9 >= r2.length()) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ff, code lost:
    
        r4 = r2.indexOf(58, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0103, code lost:
    
        if (r4 != (-1)) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0105, code lost:
    
        r4 = r2.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x010d, code lost:
    
        if (r2.charAt(r9) != ':') goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x010f, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0110, code lost:
    
        if (r9 >= r3) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0112, code lost:
    
        r1.putShort(0);
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0134, code lost:
    
        r9 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0118, code lost:
    
        r10 = r4 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x011a, code lost:
    
        if (r10 <= 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x011d, code lost:
    
        if (r10 > 4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x011f, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0120, code lost:
    
        if (r9 >= r4) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0122, code lost:
    
        r10 = (r10 << 4) | java.lang.Character.digit(r2.charAt(r9), 16);
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0130, code lost:
    
        r1.putShort((short) r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.net.InetAddress zzb(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.home.zzbc.zzb(java.lang.String):java.net.InetAddress");
    }

    private static InetAddress zzc(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Object) e);
            return null;
        }
    }

    @CheckForNull
    private static byte[] zzd(String str) {
        if (zza.zzb(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int indexOf = str.indexOf(46, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int i3 = indexOf - i;
            if (i3 <= 0 || i3 > 3) {
                throw new NumberFormatException();
            }
            if (i3 > 1) {
                try {
                    if (str.charAt(i) == '0') {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
            int i4 = 0;
            while (i < indexOf) {
                int i5 = i4 * 10;
                int digit = Character.digit(str.charAt(i), 10);
                if (digit < 0) {
                    throw new NumberFormatException();
                }
                i4 = i5 + digit;
                i++;
            }
            if (i4 > 255) {
                throw new NumberFormatException();
            }
            bArr[i2] = (byte) i4;
            i = indexOf + 1;
        }
        return bArr;
    }
}
