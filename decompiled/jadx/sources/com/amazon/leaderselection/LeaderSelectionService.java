package com.amazon.leaderselection;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.amazon.alexa.utils.security.SignatureVerifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class LeaderSelectionService extends Service {
    public static final String LEADER_SELECTION_ACTION = "com.amazon.leaderselection.ACTION_SELECT";
    public static final String LEADER_SELECTION_CATEGORY = "com.amazon.leaderselection.CATEGORY_LEADER_SELECTION";
    public static final Intent LEADER_SELECTION_INTENT;
    public static final IntentFilter LEADER_SELECTION_INTENT_FILTER;
    private static final String TAG = "LeaderSelectionService";
    private CandidateConnectionCache candidateConnectionCache;
    private LeaderSelectionStrategy leaderSelectionStrategy;

    static {
        IntentFilter intentFilter = new IntentFilter();
        LEADER_SELECTION_INTENT_FILTER = intentFilter;
        Intent intent = new Intent();
        LEADER_SELECTION_INTENT = intent;
        intentFilter.addCategory(LEADER_SELECTION_CATEGORY);
        intentFilter.addCategory(LEADER_SELECTION_ACTION);
        intent.addCategory(LEADER_SELECTION_CATEGORY);
        intent.setAction(LEADER_SELECTION_ACTION);
    }

    private void finish() {
        this.candidateConnectionCache.teardown();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        getPackageName();
        return new LeaderSelection(getPackageManager(), new SignatureVerifier(this), this.leaderSelectionStrategy);
    }

    @Override // android.app.Service
    public void onCreate() {
        getPackageName();
        PreferredCandidateAuthority create = PreferredCandidateAuthority.create(this);
        CandidateRegistrationParser candidateRegistrationParser = new CandidateRegistrationParser(getPackageManager());
        Candidate createThisCandidate = Candidate.createThisCandidate(this, candidateRegistrationParser, create);
        OtherCandidates otherCandidates = new OtherCandidates(create, new CandidateInformationFinder(getPackageName(), getPackageManager(), candidateRegistrationParser), new SignatureVerifier(this));
        LeaderAuthority leaderAuthority = new LeaderAuthority(createThisCandidate.getComponentName(), otherCandidates, new SharedPreferencePersistentStorage(this, "com.amazon.leaderselection.LEADER_AUTHORITY_PREFERENCES_NAMESPACE"));
        MessageFactory messageFactory = new MessageFactory(createThisCandidate, otherCandidates, leaderAuthority);
        CandidateConnectionCache candidateConnectionCache = new CandidateConnectionCache();
        this.candidateConnectionCache = candidateConnectionCache;
        this.leaderSelectionStrategy = LeaderSelectionStrategyFactory.create(createThisCandidate, otherCandidates, create, leaderAuthority, messageFactory, new MessageSender(this, candidateConnectionCache, messageFactory));
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        getPackageName();
        finish();
        return false;
    }
}
