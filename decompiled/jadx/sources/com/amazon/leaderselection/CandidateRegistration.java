package com.amazon.leaderselection;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class CandidateRegistration implements Parcelable {
    public static final String METADATA_REGISTRATION_KEY = "com.amazon.leaderselection.registration";
    public static final int NO_REGISTRATION_RESOUCE_ID = 0;
    private static final String TAG = "CandidateRegistration";
    private CandidateRole role;
    private LeaderSelectionServiceVersion version;
    public static final CandidateRegistration UNKNOWN = new CandidateRegistration(CandidateRole.NONE, LeaderSelectionServiceVersion.UNKNOWN);
    public static final Parcelable.Creator<CandidateRegistration> CREATOR = new Parcelable.Creator<CandidateRegistration>() { // from class: com.amazon.leaderselection.CandidateRegistration.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CandidateRegistration createFromParcel(Parcel parcel) {
            return new CandidateRegistration(parcel, 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CandidateRegistration[] newArray(int i) {
            return new CandidateRegistration[i];
        }
    };

    private CandidateRegistration(Parcel parcel) {
        this.role = (CandidateRole) parcel.readSerializable();
        this.version = (LeaderSelectionServiceVersion) parcel.readParcelable(LeaderSelectionServiceVersion.class.getClassLoader());
    }

    public static CandidateRegistration create(CandidateRole candidateRole, LeaderSelectionServiceVersion leaderSelectionServiceVersion) {
        return new CandidateRegistration(candidateRole, leaderSelectionServiceVersion);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CandidateRole getRole() {
        return this.role;
    }

    public LeaderSelectionServiceVersion getVersion() {
        return this.version;
    }

    public boolean isValid() {
        LeaderSelectionServiceVersion leaderSelectionServiceVersion;
        CandidateRole candidateRole = this.role;
        return (candidateRole == null || (leaderSelectionServiceVersion = this.version) == null || candidateRole == CandidateRole.NONE || !leaderSelectionServiceVersion.isValid()) ? false : true;
    }

    public String toString() {
        return getClass().getSimpleName() + ":" + this.role + "." + this.version;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.role);
        parcel.writeParcelable(this.version, i);
    }

    private CandidateRegistration(CandidateRole candidateRole, LeaderSelectionServiceVersion leaderSelectionServiceVersion) {
        this.role = candidateRole;
        this.version = leaderSelectionServiceVersion;
    }

    public /* synthetic */ CandidateRegistration(Parcel parcel, int i) {
        this(parcel);
    }
}
