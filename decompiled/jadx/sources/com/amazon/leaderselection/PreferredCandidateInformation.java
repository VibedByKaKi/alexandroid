package com.amazon.leaderselection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class PreferredCandidateInformation {
    private final String packageName;
    private final LeaderSelectionServiceVersion version;

    private PreferredCandidateInformation(String str, LeaderSelectionServiceVersion leaderSelectionServiceVersion) {
        Preconditions.notNull(str, "Cannot create without a package name.");
        Preconditions.notNull(leaderSelectionServiceVersion, "Cannot create without a version.");
        this.packageName = str;
        this.version = leaderSelectionServiceVersion;
    }

    public static PreferredCandidateInformation create(String str, LeaderSelectionServiceVersion leaderSelectionServiceVersion) {
        return new PreferredCandidateInformation(str, leaderSelectionServiceVersion);
    }

    public boolean describes(String str, LeaderSelectionServiceVersion leaderSelectionServiceVersion) {
        return str != null && leaderSelectionServiceVersion != null && this.packageName.equals(str) && this.version.isLowerOrEquivalentTo(leaderSelectionServiceVersion);
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + this.packageName + "." + this.version;
    }

    public boolean describes(Candidate candidate) {
        return candidate != null && describes(candidate.getPackageName(), candidate.getLeaderSelectionServiceVersion());
    }
}
