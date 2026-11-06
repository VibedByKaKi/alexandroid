package com.amazon.leaderselection;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class Candidate implements Parcelable {
    private static final String TAG = "Candidate";
    static final String UNKNOWN_PACKAGE_NAME = "unknown";
    static final String UNKNOWN_SERVICE_NAME = "unknown";
    private final AccountIdentifier accountIdentifier;
    private final CandidateRegistration candidateRegistration;
    private final ComponentName componentName;
    private final PreferredOpinion preferredOpinion;
    public static final Candidate UNKNOWN = create(CandidateRegistration.UNKNOWN, new ComponentName("unknown", "unknown"), AccountIdentifier.UNKNOWN, PreferredOpinion.UNKNOWN);
    public static final Parcelable.Creator<Candidate> CREATOR = new Parcelable.Creator<Candidate>() { // from class: com.amazon.leaderselection.Candidate.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Candidate createFromParcel(Parcel parcel) {
            return new Candidate(parcel, 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Candidate[] newArray(int i) {
            return new Candidate[i];
        }
    };

    private Candidate(Parcel parcel) {
        this.candidateRegistration = (CandidateRegistration) parcel.readParcelable(CandidateRegistration.class.getClassLoader());
        this.componentName = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
        this.accountIdentifier = (AccountIdentifier) parcel.readParcelable(AccountIdentifier.class.getClassLoader());
        this.preferredOpinion = (PreferredOpinion) parcel.readSerializable();
    }

    public static Candidate create(CandidateRegistration candidateRegistration, ComponentName componentName, AccountIdentifier accountIdentifier, PreferredOpinion preferredOpinion) {
        return (candidateRegistration == null || componentName == null || accountIdentifier == null) ? UNKNOWN : new Candidate(candidateRegistration, componentName, accountIdentifier, preferredOpinion);
    }

    public static Candidate createThisCandidate(Context context, CandidateRegistrationParser candidateRegistrationParser, PreferredCandidateAuthority preferredCandidateAuthority) {
        ComponentName componentName = new ComponentName(context, (Class<?>) LeaderSelectionService.class);
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(componentName, 128);
            int i = serviceInfo.applicationInfo.metaData.getInt(CandidateRegistration.METADATA_REGISTRATION_KEY, 0);
            if (i == 0) {
                Log.e(TAG, "This candidate is missing a resource for registration: " + componentName);
                return UNKNOWN;
            }
            CandidateRegistration parse = candidateRegistrationParser.parse(i, serviceInfo);
            if (parse.isValid()) {
                return create(parse, componentName, AccountIdentifier.UNKNOWN, preferredCandidateAuthority.isPreferred(componentName, parse) ? PreferredOpinion.PREFERRED : PreferredOpinion.NOT_PREFERRED);
            }
            Log.e(TAG, "This candidate registration was invalid: " + componentName);
            return UNKNOWN;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(TAG, "This candidate no longer exists on the system: " + componentName);
            return UNKNOWN;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(getComponentName(), ((Candidate) obj).getComponentName());
    }

    public AccountIdentifier getAccountIdentifier() {
        return this.accountIdentifier;
    }

    public CandidateRole getCandidateRole() {
        return this.candidateRegistration.getRole();
    }

    public ComponentName getComponentName() {
        return this.componentName;
    }

    public LeaderSelectionServiceVersion getLeaderSelectionServiceVersion() {
        return this.candidateRegistration.getVersion();
    }

    public String getPackageName() {
        return this.componentName.getPackageName();
    }

    public PreferredOpinion getPreferredOpinion() {
        return this.preferredOpinion;
    }

    public String getServiceName() {
        return this.componentName.getClassName();
    }

    public int hashCode() {
        return Objects.hash(getComponentName());
    }

    public String toString() {
        return String.format(Locale.US, "%s: %s.%s.%s", getClass().getSimpleName(), this.componentName, this.accountIdentifier, this.candidateRegistration);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.candidateRegistration, i);
        parcel.writeParcelable(this.componentName, i);
        parcel.writeParcelable(this.accountIdentifier, i);
        parcel.writeSerializable(this.preferredOpinion);
    }

    public static Candidate create(CandidateInformation candidateInformation, AccountIdentifier accountIdentifier, PreferredOpinion preferredOpinion) {
        return create(candidateInformation.getCandidateRegistration(), candidateInformation.getComponentName(), accountIdentifier, preferredOpinion);
    }

    private Candidate(CandidateRegistration candidateRegistration, ComponentName componentName, AccountIdentifier accountIdentifier, PreferredOpinion preferredOpinion) {
        this.candidateRegistration = candidateRegistration;
        this.componentName = componentName;
        this.accountIdentifier = accountIdentifier;
        this.preferredOpinion = preferredOpinion;
    }

    public /* synthetic */ Candidate(Parcel parcel, int i) {
        this(parcel);
    }
}
