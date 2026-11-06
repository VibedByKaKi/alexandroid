package com.amazon.leaderselection;

import android.content.ComponentName;
import com.amazon.leaderselection.PersistentStorage;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class LeaderAuthority {
    static final String HAS_LEADER_KEY = "HAS_LEADER_KEY";
    static final String LEADER_ACCOUNT_ID_KEY = "LEADER_ACCOUNT_ID_KEY";
    static final String LEADER_AUTHORITY_PREFERENCES_NAMESPACE = "com.amazon.leaderselection.LEADER_AUTHORITY_PREFERENCES_NAMESPACE";
    static final String LEADER_PACKAGE_NAME_KEY = "LEADER_PACKAGE_NAME_KEY";
    static final String LEADER_PREFERRED_OPINION_KEY = "LEADER_PREFERRED_OPINION_KEY";
    static final String LEADER_ROLE_KEY = "LEADER_ROLE_KEY";
    static final String LEADER_SERVICE_NAME_KEY = "LEADER_SERVICE_NAME_KEY";
    static final String LEADER_VERSION_KEY = "LEADER_VERSION_KEY";
    private static final String TAG = "LeaderAuthority";
    private Candidate leadingCandidate;
    private final OtherCandidates otherCandidates;
    private final PersistentStorage persistentStorage;
    private final ComponentName thisCandidateComponentName;

    public LeaderAuthority(ComponentName componentName, OtherCandidates otherCandidates, PersistentStorage persistentStorage) {
        this.thisCandidateComponentName = componentName;
        this.otherCandidates = otherCandidates;
        this.persistentStorage = persistentStorage;
    }

    private void clearLeader() {
        Candidate candidate = Candidate.UNKNOWN;
        this.leadingCandidate = candidate;
        set(candidate);
    }

    private Candidate getLeaderFromPersistentStorage() {
        if (isLeaderInPersistentStorage()) {
            CandidateRole create = CandidateRole.create(this.persistentStorage.getString(LEADER_ROLE_KEY, null));
            String string = this.persistentStorage.getString(LEADER_PACKAGE_NAME_KEY, "unknown");
            String string2 = this.persistentStorage.getString(LEADER_SERVICE_NAME_KEY, "unknown");
            AccountIdentifier create2 = AccountIdentifier.create(this.persistentStorage.getString(LEADER_ACCOUNT_ID_KEY, null));
            PersistentStorage persistentStorage = this.persistentStorage;
            LeaderSelectionServiceVersion leaderSelectionServiceVersion = LeaderSelectionServiceVersion.UNKNOWN;
            LeaderSelectionServiceVersion create3 = LeaderSelectionServiceVersion.create(persistentStorage.getString(LEADER_VERSION_KEY, leaderSelectionServiceVersion.toString()));
            PreferredOpinion create4 = PreferredOpinion.create(this.persistentStorage.getString(LEADER_PREFERRED_OPINION_KEY, null));
            if ("unknown".equals(string) || "unknown".equals(string2) || create3.equals(leaderSelectionServiceVersion)) {
                this.leadingCandidate = Candidate.UNKNOWN;
            } else {
                this.leadingCandidate = Candidate.create(CandidateRegistration.create(create, create3), ComponentNameFactory.create(string, string2), create2, create4);
                if (!isLeaderStillAvailable()) {
                    Objects.toString(this.leadingCandidate.getComponentName());
                    clearLeader();
                }
            }
        } else {
            this.leadingCandidate = Candidate.UNKNOWN;
        }
        return this.leadingCandidate;
    }

    private boolean isLeaderInPersistentStorage() {
        return this.persistentStorage.getBoolean(HAS_LEADER_KEY, false);
    }

    private boolean isLeaderStillAvailable() {
        Candidate candidate = this.leadingCandidate;
        if (candidate == null) {
            return false;
        }
        if (this.otherCandidates.contains(candidate)) {
            return true;
        }
        return this.thisCandidateComponentName.equals(this.leadingCandidate.getComponentName());
    }

    public synchronized Candidate get() {
        try {
            if (this.leadingCandidate == null) {
                this.leadingCandidate = getLeaderFromPersistentStorage();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.leadingCandidate;
    }

    public synchronized boolean hasLeader() {
        boolean z;
        if (get() != null && !Candidate.UNKNOWN.equals(this.leadingCandidate)) {
            z = isLeaderStillAvailable();
        }
        return z;
    }

    public synchronized void set(Candidate candidate) {
        this.leadingCandidate = candidate;
        PersistentStorage.Transaction edit = this.persistentStorage.edit();
        edit.set(LEADER_ROLE_KEY, candidate.getCandidateRole().toString());
        edit.set(LEADER_PACKAGE_NAME_KEY, candidate.getPackageName());
        edit.set(LEADER_SERVICE_NAME_KEY, candidate.getServiceName());
        edit.set(LEADER_ACCOUNT_ID_KEY, candidate.getAccountIdentifier().getValue());
        edit.set(LEADER_VERSION_KEY, candidate.getLeaderSelectionServiceVersion().toString());
        edit.set(LEADER_PREFERRED_OPINION_KEY, candidate.getPreferredOpinion().toString());
        edit.set(HAS_LEADER_KEY, true);
        edit.commit();
    }
}
