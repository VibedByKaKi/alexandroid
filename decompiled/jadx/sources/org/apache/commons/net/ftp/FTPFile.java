package org.apache.commons.net.ftp;

import com.amazon.deecomms.common.Constants;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.TimeZone;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class FTPFile implements Serializable {
    public static final int DIRECTORY_TYPE = 1;
    public static final int EXECUTE_PERMISSION = 2;
    public static final int FILE_TYPE = 0;
    public static final int GROUP_ACCESS = 1;
    public static final int READ_PERMISSION = 0;
    public static final int SYMBOLIC_LINK_TYPE = 2;
    public static final int UNKNOWN_TYPE = 3;
    public static final int USER_ACCESS = 0;
    public static final int WORLD_ACCESS = 2;
    public static final int WRITE_PERMISSION = 1;
    private static final long serialVersionUID = 9010790363003271996L;
    private Calendar date;
    private String group;
    private int hardLinkCount;
    private String link;
    private String name;
    private final boolean[][] permissions;
    private String rawListing;
    private long size;
    private int type;
    private String user;

    public FTPFile() {
        this.type = 3;
        this.size = -1L;
        this.user = "";
        this.group = "";
        this.permissions = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, 3, 3);
    }

    private char formatType() {
        int i = this.type;
        if (i == 0) {
            return '-';
        }
        if (i == 1) {
            return 'd';
        }
        if (i != 2) {
            return Constants.DEFAULT_IMAGE_CHAR;
        }
        return 'l';
    }

    private String permissionToString(int i) {
        StringBuilder sb = new StringBuilder();
        if (hasPermission(i, 0)) {
            sb.append('r');
        } else {
            sb.append('-');
        }
        if (hasPermission(i, 1)) {
            sb.append('w');
        } else {
            sb.append('-');
        }
        if (hasPermission(i, 2)) {
            sb.append('x');
        } else {
            sb.append('-');
        }
        return sb.toString();
    }

    public String getGroup() {
        return this.group;
    }

    public int getHardLinkCount() {
        return this.hardLinkCount;
    }

    public String getLink() {
        return this.link;
    }

    public String getName() {
        return this.name;
    }

    public String getRawListing() {
        return this.rawListing;
    }

    public long getSize() {
        return this.size;
    }

    public Calendar getTimestamp() {
        return this.date;
    }

    public int getType() {
        return this.type;
    }

    public String getUser() {
        return this.user;
    }

    public boolean hasPermission(int i, int i2) {
        boolean[][] zArr = this.permissions;
        if (zArr == null) {
            return false;
        }
        return zArr[i][i2];
    }

    public boolean isDirectory() {
        return this.type == 1;
    }

    public boolean isFile() {
        return this.type == 0;
    }

    public boolean isSymbolicLink() {
        return this.type == 2;
    }

    public boolean isUnknown() {
        return this.type == 3;
    }

    public boolean isValid() {
        return this.permissions != null;
    }

    public void setGroup(String str) {
        this.group = str;
    }

    public void setHardLinkCount(int i) {
        this.hardLinkCount = i;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPermission(int i, int i2, boolean z) {
        this.permissions[i][i2] = z;
    }

    public void setRawListing(String str) {
        this.rawListing = str;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setTimestamp(Calendar calendar) {
        this.date = calendar;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUser(String str) {
        this.user = str;
    }

    public String toFormattedString(String str) {
        if (!isValid()) {
            return "[Invalid: could not parse file entry]";
        }
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);
        try {
            sb.append(formatType());
            sb.append(permissionToString(0));
            sb.append(permissionToString(1));
            sb.append(permissionToString(2));
            formatter.format(" %4d", Integer.valueOf(getHardLinkCount()));
            formatter.format(" %-8s %-8s", getUser(), getGroup());
            formatter.format(" %8d", Long.valueOf(getSize()));
            Calendar timestamp = getTimestamp();
            if (timestamp != null) {
                if (str != null) {
                    TimeZone timeZone = TimeZone.getTimeZone(str);
                    if (!timeZone.equals(timestamp.getTimeZone())) {
                        Date time = timestamp.getTime();
                        Calendar calendar = Calendar.getInstance(timeZone);
                        calendar.setTime(time);
                        timestamp = calendar;
                    }
                }
                formatter.format(" %1$tY-%1$tm-%1$td", timestamp);
                if (timestamp.isSet(11)) {
                    formatter.format(" %1$tH", timestamp);
                    if (timestamp.isSet(12)) {
                        formatter.format(":%1$tM", timestamp);
                        if (timestamp.isSet(13)) {
                            formatter.format(":%1$tS", timestamp);
                            if (timestamp.isSet(14)) {
                                formatter.format(".%1$tL", timestamp);
                            }
                        }
                    }
                    formatter.format(" %1$tZ", timestamp);
                }
            }
            sb.append(' ');
            sb.append(getName());
            formatter.close();
            return sb.toString();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    formatter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public String toString() {
        return getRawListing();
    }

    public FTPFile(String str) {
        this.type = 3;
        this.size = -1L;
        this.user = "";
        this.group = "";
        this.permissions = null;
        this.rawListing = str;
    }

    public String toFormattedString() {
        return toFormattedString(null);
    }
}
