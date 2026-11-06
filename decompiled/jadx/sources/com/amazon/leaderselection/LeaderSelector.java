package com.amazon.leaderselection;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import com.amazon.alexa.utils.security.ComponentEnabler;
import com.amazon.alexa.utils.security.SignatureVerifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class LeaderSelector {
    private static final String TAG = "LeaderSelector";
    private final Context context;
    private final LeaderAuthority leaderAuthority;
    private final ServiceNameVerifier serviceNameVerifier;
    private final ComponentName thisCandidateComponentName;

    public LeaderSelector(Context context) {
        this.context = context;
        ComponentName componentName = new ComponentName(context, (Class<?>) LeaderSelectionService.class);
        this.thisCandidateComponentName = componentName;
        this.serviceNameVerifier = new ServiceNameVerifier(context.getPackageManager());
        this.leaderAuthority = new LeaderAuthority(componentName, new OtherCandidates(PreferredCandidateAuthority.create(context), new CandidateInformationFinder(context.getPackageName(), context.getPackageManager(), new CandidateRegistrationParser(context.getPackageManager())), new SignatureVerifier(context)), new SharedPreferencePersistentStorage(context, "com.amazon.leaderselection.LEADER_AUTHORITY_PREFERENCES_NAMESPACE"));
    }

    public static void enable(Context context, boolean z) {
        ComponentEnabler.setServiceEnabled(context, (Class<?>) LeaderSelectionService.class, z);
    }

    public static boolean isEnabled(Context context) {
        return ComponentEnabler.checkIfServiceIsEnabled(context, (Class<?>) LeaderSelectionService.class);
    }

    private Leader makeSelectionRequest(String str) {
        return new LeaderSelectionRequest(str, new CandidateConnection(this.context, this.thisCandidateComponentName)).select();
    }

    public Leader select(String str) {
        String str2 = TAG;
        if (!this.leaderAuthority.hasLeader()) {
            return makeSelectionRequest(str);
        }
        Candidate candidate = this.leaderAuthority.get();
        if (this.serviceNameVerifier.verify(candidate, str)) {
            return Leader.create(candidate.getPackageName(), str);
        }
        Log.i(str2, "Existing leader doesn't provide requested service. Initiate new leader selection process.");
        return makeSelectionRequest(str);
    }
}
