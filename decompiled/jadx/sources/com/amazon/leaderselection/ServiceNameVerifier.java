package com.amazon.leaderselection;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import com.amazon.alexa.utils.security.ComponentEnabler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class ServiceNameVerifier {
    private static final String TAG = "ServiceNameVerifier";
    private final PackageManager packageManager;

    public ServiceNameVerifier(PackageManager packageManager) {
        this.packageManager = packageManager;
    }

    public boolean verify(Candidate candidate, String str) {
        return ComponentEnabler.checkIfServiceIsEnabled(this.packageManager, new ComponentName(candidate.getPackageName(), str));
    }
}
