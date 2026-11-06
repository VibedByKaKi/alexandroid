package org.joda.time.tz;

import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang3.time.TimeZones;
import org.joda.time.DateTimeZone;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class FixedDateTimeZone extends DateTimeZone {
    private static final long serialVersionUID = -3513011772763289092L;
    private final String iNameKey;
    private final int iStandardOffset;
    private final int iWallOffset;

    public FixedDateTimeZone(String str, String str2, int i, int i2) {
        super(str);
        this.iNameKey = str2;
        this.iWallOffset = i;
        this.iStandardOffset = i2;
    }

    @Override // org.joda.time.DateTimeZone
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FixedDateTimeZone) {
            FixedDateTimeZone fixedDateTimeZone = (FixedDateTimeZone) obj;
            if (getID().equals(fixedDateTimeZone.getID()) && this.iStandardOffset == fixedDateTimeZone.iStandardOffset && this.iWallOffset == fixedDateTimeZone.iWallOffset) {
                return true;
            }
        }
        return false;
    }

    @Override // org.joda.time.DateTimeZone
    public String getNameKey(long j) {
        return this.iNameKey;
    }

    @Override // org.joda.time.DateTimeZone
    public int getOffset(long j) {
        return this.iWallOffset;
    }

    @Override // org.joda.time.DateTimeZone
    public int getOffsetFromLocal(long j) {
        return this.iWallOffset;
    }

    @Override // org.joda.time.DateTimeZone
    public int getStandardOffset(long j) {
        return this.iStandardOffset;
    }

    @Override // org.joda.time.DateTimeZone
    public int hashCode() {
        return (this.iWallOffset * 31) + (this.iStandardOffset * 37) + getID().hashCode();
    }

    @Override // org.joda.time.DateTimeZone
    public boolean isFixed() {
        return true;
    }

    @Override // org.joda.time.DateTimeZone
    public TimeZone toTimeZone() {
        String id = getID();
        if (id.length() != 6 || (!id.startsWith("+") && !id.startsWith("-"))) {
            return new SimpleTimeZone(this.iWallOffset, getID());
        }
        return TimeZone.getTimeZone(TimeZones.GMT_ID + getID());
    }

    @Override // org.joda.time.DateTimeZone
    public long nextTransition(long j) {
        return j;
    }

    @Override // org.joda.time.DateTimeZone
    public long previousTransition(long j) {
        return j;
    }
}
