package com.amazon.leaderselection;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.amazon.alexa.client.annotations.NonNull;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class LeaderSelectionServiceVersion implements Parcelable {
    private static final String SEPARATOR = ".";
    private static final String SEPARATOR_REGEX = "\\.";
    private static final String TAG = "LeaderSelectionServiceVersion";
    private static final int UNKNOWN_VERSION_VALUE = 0;
    private final boolean isValid;
    private final int majorVersion;
    private final int minorVersion;
    private final int patchVersion;
    static final LeaderSelectionServiceVersion UNKNOWN = new LeaderSelectionServiceVersion("0.0.0");
    public static final Parcelable.Creator<LeaderSelectionServiceVersion> CREATOR = new Parcelable.Creator<LeaderSelectionServiceVersion>() { // from class: com.amazon.leaderselection.LeaderSelectionServiceVersion.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LeaderSelectionServiceVersion createFromParcel(Parcel parcel) {
            return new LeaderSelectionServiceVersion(parcel, 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LeaderSelectionServiceVersion[] newArray(int i) {
            return new LeaderSelectionServiceVersion[i];
        }
    };

    private LeaderSelectionServiceVersion(String str) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4 = 0;
        String[] split = str != null ? str.split("\\.") : new String[0];
        if (split.length == 3) {
            try {
                i = Integer.valueOf(split[0]).intValue();
                z = true;
                try {
                    i2 = Integer.valueOf(split[1]).intValue();
                } catch (NumberFormatException unused) {
                    i2 = 0;
                }
            } catch (NumberFormatException unused2) {
                i = 0;
                i2 = 0;
            }
            try {
                i4 = i;
                i3 = Integer.valueOf(split[2]).intValue();
            } catch (NumberFormatException unused3) {
                Log.e(TAG, "Failed to parse LeaderSelectionService version. Must be 'integer.integer.integer'.");
                z = false;
                i4 = i;
                i3 = 0;
                this.majorVersion = i4;
                this.minorVersion = i2;
                this.patchVersion = i3;
                this.isValid = z;
            }
        } else {
            i3 = 0;
            z = false;
            i2 = 0;
        }
        this.majorVersion = i4;
        this.minorVersion = i2;
        this.patchVersion = i3;
        this.isValid = z;
    }

    private int compareTo(@NonNull LeaderSelectionServiceVersion leaderSelectionServiceVersion) {
        if (!isValid()) {
            return -1;
        }
        if (!leaderSelectionServiceVersion.isValid()) {
            return 1;
        }
        int i = this.majorVersion - leaderSelectionServiceVersion.majorVersion;
        int i2 = this.minorVersion - leaderSelectionServiceVersion.minorVersion;
        return i == 0 ? i2 == 0 ? this.patchVersion - leaderSelectionServiceVersion.patchVersion : i2 : i;
    }

    public static LeaderSelectionServiceVersion create(String str) {
        return new LeaderSelectionServiceVersion(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LeaderSelectionServiceVersion leaderSelectionServiceVersion = (LeaderSelectionServiceVersion) obj;
            if (this.majorVersion == leaderSelectionServiceVersion.majorVersion && this.minorVersion == leaderSelectionServiceVersion.minorVersion && this.patchVersion == leaderSelectionServiceVersion.patchVersion) {
                return true;
            }
        }
        return false;
    }

    public int getMajorVersion() {
        return this.majorVersion;
    }

    public int getMinorVersion() {
        return this.minorVersion;
    }

    public int getPatchVersion() {
        return this.patchVersion;
    }

    public String getValue() {
        return this.majorVersion + "." + this.minorVersion + "." + this.patchVersion;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.majorVersion), Integer.valueOf(this.minorVersion), Integer.valueOf(this.patchVersion));
    }

    public boolean isHigherOrEquivalent(LeaderSelectionServiceVersion leaderSelectionServiceVersion) {
        return compareTo(leaderSelectionServiceVersion) >= 0;
    }

    public boolean isLowerOrEquivalentTo(LeaderSelectionServiceVersion leaderSelectionServiceVersion) {
        return compareTo(leaderSelectionServiceVersion) <= 0;
    }

    public boolean isSignificantlyHigherThan(LeaderSelectionServiceVersion leaderSelectionServiceVersion) {
        return (this.majorVersion > leaderSelectionServiceVersion.getMajorVersion()) || ((this.majorVersion == leaderSelectionServiceVersion.getMajorVersion()) && (this.minorVersion > leaderSelectionServiceVersion.getMinorVersion()));
    }

    public boolean isValid() {
        return this.isValid;
    }

    public String toString() {
        return getValue();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.majorVersion);
        parcel.writeInt(this.minorVersion);
        parcel.writeInt(this.patchVersion);
        parcel.writeValue(Boolean.valueOf(this.isValid));
    }

    public /* synthetic */ LeaderSelectionServiceVersion(Parcel parcel, int i) {
        this(parcel);
    }

    private LeaderSelectionServiceVersion(Parcel parcel) {
        this.majorVersion = parcel.readInt();
        this.minorVersion = parcel.readInt();
        this.patchVersion = parcel.readInt();
        this.isValid = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
    }
}
