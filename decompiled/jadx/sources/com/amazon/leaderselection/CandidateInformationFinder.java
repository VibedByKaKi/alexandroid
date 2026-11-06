package com.amazon.leaderselection;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class CandidateInformationFinder {
    private static final String TAG = "CandidateInformationFinder";
    private final CandidateRegistrationParser candidateRegistrationParser;
    private final String excludePackageName;
    private final PackageManager packageManager;

    public CandidateInformationFinder(String str, PackageManager packageManager, CandidateRegistrationParser candidateRegistrationParser) {
        this.excludePackageName = str;
        this.packageManager = packageManager;
        this.candidateRegistrationParser = candidateRegistrationParser;
    }

    public Set<CandidateInformation> discover() {
        List<ResolveInfo> queryIntentServices = this.packageManager.queryIntentServices(LeaderSelectionService.LEADER_SELECTION_INTENT, 128);
        HashSet hashSet = new HashSet();
        if (queryIntentServices != null) {
            for (ResolveInfo resolveInfo : queryIntentServices) {
                String str = resolveInfo.serviceInfo.packageName;
                if (!this.excludePackageName.equals(str) && resolveInfo.serviceInfo.exported) {
                    ComponentName componentName = new ComponentName(str, resolveInfo.serviceInfo.name);
                    String str2 = TAG;
                    componentName.toString();
                    int i = resolveInfo.serviceInfo.applicationInfo.metaData.getInt(CandidateRegistration.METADATA_REGISTRATION_KEY, 0);
                    if (i == 0) {
                        Log.e(str2, "No registration resource available for: " + componentName);
                    } else {
                        CandidateRegistration parse = this.candidateRegistrationParser.parse(i, resolveInfo.serviceInfo);
                        if (CandidateRegistration.UNKNOWN.equals(parse)) {
                            Log.e(str2, "Failed to register: " + componentName);
                        } else {
                            hashSet.add(new CandidateInformation(componentName, parse));
                        }
                    }
                }
            }
        }
        return hashSet;
    }
}
