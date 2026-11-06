package org.apache.commons.net.ntp;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.dee.sdk.iotsoftap.Constants;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.json.XML$$ExternalSyntheticBUOutline0;
import org.openjdk.tools.javac.code.Flags;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TimeStamp implements Serializable, Comparable<TimeStamp> {
    public static final String NTP_DATE_FORMAT = "EEE, MMM dd yyyy HH:mm:ss.SSS";
    protected static final long msb0baseTime = 2085978496000L;
    protected static final long msb1baseTime = -2208988800000L;
    private static final long serialVersionUID = 8139806907588338737L;
    private final long ntpTime;
    private DateFormat simpleFormatter;
    private DateFormat utcFormatter;

    public TimeStamp(Date date) {
        this.ntpTime = date == null ? 0L : toNtpTime(date.getTime());
    }

    private static void appendHexString(StringBuilder sb, long j) {
        String hexString = Long.toHexString(j);
        for (int length = hexString.length(); length < 8; length++) {
            sb.append('0');
        }
        sb.append(hexString);
    }

    public static long decodeNtpHexString(String str) throws NumberFormatException {
        if (str == null) {
            XML$$ExternalSyntheticBUOutline0.m$2("null");
            return 0L;
        }
        int indexOf = str.indexOf(46);
        if (indexOf != -1) {
            return (Long.parseLong(str.substring(0, indexOf), 16) << 32) | Long.parseLong(str.substring(indexOf + 1), 16);
        }
        if (str.isEmpty()) {
            return 0L;
        }
        return Long.parseLong(str, 16) << 32;
    }

    public static TimeStamp getCurrentTime() {
        return getNtpTime(System.currentTimeMillis());
    }

    public static TimeStamp getNtpTime(long j) {
        return new TimeStamp(toNtpTime(j));
    }

    public static long getTime(long j) {
        long j2 = j >>> 32;
        long j3 = j2 & 4294967295L;
        long round = Math.round(((j & 4294967295L) * 1000.0d) / 4.294967296E9d);
        return (Flags.BRIDGE & j2) == 0 ? ParcelCompat$$ExternalSyntheticOutline0.m(j3, 1000L, msb0baseTime, round) : ParcelCompat$$ExternalSyntheticOutline0.m(j3, 1000L, msb1baseTime, round);
    }

    public static TimeStamp parseNtpString(String str) throws NumberFormatException {
        return new TimeStamp(decodeNtpHexString(str));
    }

    public static long toNtpTime(long j) {
        long j2 = msb0baseTime;
        boolean z = j < msb0baseTime;
        if (z) {
            j2 = msb1baseTime;
        }
        long j3 = j - j2;
        long j4 = j3 / 1000;
        long j5 = ((j3 % 1000) * 4294967296L) / 1000;
        if (z) {
            j4 |= Flags.BRIDGE;
        }
        return j5 | (j4 << 32);
    }

    public static String toString(long j) {
        StringBuilder sb = new StringBuilder();
        appendHexString(sb, (j >>> 32) & 4294967295L);
        sb.append('.');
        appendHexString(sb, j & 4294967295L);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(TimeStamp timeStamp) {
        long j = this.ntpTime;
        long j2 = timeStamp.ntpTime;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public boolean equals(Object obj) {
        return (obj instanceof TimeStamp) && this.ntpTime == ((TimeStamp) obj).ntpValue();
    }

    public Date getDate() {
        return new Date(getTime(this.ntpTime));
    }

    public long getFraction() {
        return this.ntpTime & 4294967295L;
    }

    public long getSeconds() {
        return (this.ntpTime >>> 32) & 4294967295L;
    }

    public int hashCode() {
        long j = this.ntpTime;
        return (int) (j ^ (j >>> 32));
    }

    public long ntpValue() {
        return this.ntpTime;
    }

    public String toDateString() {
        if (this.simpleFormatter == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(NTP_DATE_FORMAT, Locale.US);
            this.simpleFormatter = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
        }
        return this.simpleFormatter.format(getDate());
    }

    public String toUTCString() {
        if (this.utcFormatter == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, MMM dd yyyy HH:mm:ss.SSS 'UTC'", Locale.US);
            this.utcFormatter = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(Constants.UTC));
        }
        return this.utcFormatter.format(getDate());
    }

    public TimeStamp(String str) throws NumberFormatException {
        this.ntpTime = decodeNtpHexString(str);
    }

    public TimeStamp(long j) {
        this.ntpTime = j;
    }

    public String toString() {
        return toString(this.ntpTime);
    }

    public long getTime() {
        return getTime(this.ntpTime);
    }
}
