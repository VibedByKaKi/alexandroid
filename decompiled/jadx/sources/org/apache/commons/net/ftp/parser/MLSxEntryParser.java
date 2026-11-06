package org.apache.commons.net.ftp.parser;

import com.amazon.identity.auth.device.api.MultipleAccountManager;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.lang3.time.TimeZones;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPFileEntryParserImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class MLSxEntryParser extends FTPFileEntryParserImpl {
    private static final MLSxEntryParser INSTANCE = new MLSxEntryParser();
    private static final HashMap<String, Integer> TYPE_TO_INT;
    private static final int[] UNIX_GROUPS;
    private static final int[][] UNIX_PERMS;

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        TYPE_TO_INT = hashMap;
        hashMap.put("file", 0);
        hashMap.put("cdir", 1);
        hashMap.put("pdir", 1);
        hashMap.put("dir", 1);
        UNIX_GROUPS = new int[]{0, 1, 2};
        UNIX_PERMS = new int[][]{new int[0], new int[]{2}, new int[]{1}, new int[]{2, 1}, new int[]{0}, new int[]{0, 2}, new int[]{0, 1}, new int[]{0, 1, 2}};
    }

    private void doUnixPerms(FTPFile fTPFile, String str) {
        for (char c : str.toCharArray()) {
            if (c == 'a') {
                fTPFile.setPermission(0, 1, true);
            } else if (c == 'p') {
                fTPFile.setPermission(0, 1, true);
            } else if (c == 'r') {
                fTPFile.setPermission(0, 0, true);
            } else if (c == 'w') {
                fTPFile.setPermission(0, 1, true);
            } else if (c == 'l') {
                fTPFile.setPermission(0, 2, true);
            } else if (c != 'm') {
                switch (c) {
                    case 'c':
                        fTPFile.setPermission(0, 1, true);
                        break;
                    case 'd':
                        fTPFile.setPermission(0, 1, true);
                        break;
                    case 'e':
                        fTPFile.setPermission(0, 0, true);
                        break;
                }
            } else {
                fTPFile.setPermission(0, 1, true);
            }
        }
    }

    public static MLSxEntryParser getInstance() {
        return INSTANCE;
    }

    public static FTPFile parseEntry(String str) {
        return INSTANCE.parseFTPEntry(str);
    }

    public static Calendar parseGMTdateTime(String str) {
        SimpleDateFormat simpleDateFormat;
        boolean z;
        if (str.contains(".")) {
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
            z = true;
        } else {
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            z = false;
        }
        TimeZone timeZone = TimeZone.getTimeZone(TimeZones.GMT_ID);
        simpleDateFormat.setTimeZone(timeZone);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        ParsePosition parsePosition = new ParsePosition(0);
        simpleDateFormat.setLenient(false);
        Date parse = simpleDateFormat.parse(str, parsePosition);
        if (parsePosition.getIndex() != str.length()) {
            return null;
        }
        gregorianCalendar.setTime(parse);
        if (!z) {
            gregorianCalendar.clear(14);
        }
        return gregorianCalendar;
    }

    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    public FTPFile parseFTPEntry(String str) {
        FTPFile fTPFile;
        FTPFile fTPFile2 = null;
        if (str.startsWith(" ")) {
            if (str.length() <= 1) {
                return null;
            }
            FTPFile fTPFile3 = new FTPFile();
            fTPFile3.setRawListing(str);
            fTPFile3.setName(str.substring(1));
            return fTPFile3;
        }
        int i = 2;
        String[] split = str.split(" ", 2);
        if (split.length != 2 || split[1].isEmpty()) {
            return null;
        }
        String str2 = split[0];
        if (!str2.endsWith(";")) {
            return null;
        }
        FTPFile fTPFile4 = new FTPFile();
        fTPFile4.setRawListing(str);
        fTPFile4.setName(split[1]);
        String[] split2 = str2.split(";");
        boolean contains = split[0].toLowerCase(Locale.ENGLISH).contains("unix.mode=");
        int length = split2.length;
        int i2 = 0;
        while (i2 < length) {
            String[] split3 = split2[i2].split("=", -1);
            if (split3.length != i) {
                return fTPFile2;
            }
            String str3 = split3[0];
            Locale locale = Locale.ENGLISH;
            String lowerCase = str3.toLowerCase(locale);
            String str4 = split3[1];
            if (!str4.isEmpty()) {
                String lowerCase2 = str4.toLowerCase(locale);
                if ("size".equals(lowerCase) || "sizd".equals(lowerCase)) {
                    fTPFile = fTPFile2;
                    fTPFile4.setSize(Long.parseLong(str4));
                } else if ("modify".equals(lowerCase)) {
                    Calendar parseGMTdateTime = parseGMTdateTime(str4);
                    if (parseGMTdateTime == null) {
                        return fTPFile2;
                    }
                    fTPFile4.setTimestamp(parseGMTdateTime);
                } else if ("type".equals(lowerCase)) {
                    Integer num = TYPE_TO_INT.get(lowerCase2);
                    if (num == null) {
                        fTPFile4.setType(3);
                    } else {
                        fTPFile4.setType(num.intValue());
                    }
                } else if (lowerCase.startsWith("unix.")) {
                    String lowerCase3 = lowerCase.substring(5).toLowerCase(locale);
                    if ("group".equals(lowerCase3)) {
                        fTPFile4.setGroup(str4);
                    } else if (MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER.equals(lowerCase3)) {
                        fTPFile4.setUser(str4);
                    } else if ("mode".equals(lowerCase3)) {
                        int length2 = str4.length() - 3;
                        int i3 = 0;
                        while (i3 < 3) {
                            int charAt = str4.charAt(length2 + i3) - '0';
                            if (charAt >= 0 && charAt <= 7) {
                                int[] iArr = UNIX_PERMS[charAt];
                                int length3 = iArr.length;
                                int i4 = 0;
                                while (i4 < length3) {
                                    fTPFile4.setPermission(UNIX_GROUPS[i3], iArr[i4], true);
                                    i4++;
                                    fTPFile2 = fTPFile2;
                                }
                            }
                            i3++;
                            fTPFile2 = fTPFile2;
                        }
                    }
                    fTPFile = fTPFile2;
                } else {
                    fTPFile = fTPFile2;
                    if (!contains && "perm".equals(lowerCase)) {
                        doUnixPerms(fTPFile4, lowerCase2);
                    }
                }
                i2++;
                fTPFile2 = fTPFile;
                i = 2;
            }
            fTPFile = fTPFile2;
            i2++;
            fTPFile2 = fTPFile;
            i = 2;
        }
        return fTPFile4;
    }
}
