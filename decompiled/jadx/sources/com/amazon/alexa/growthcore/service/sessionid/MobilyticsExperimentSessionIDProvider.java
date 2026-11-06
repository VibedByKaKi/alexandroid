package com.amazon.alexa.growthcore.service.sessionid;

import android.content.Context;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class MobilyticsExperimentSessionIDProvider implements ExperimentSessionIDProvider {
    private static final String INSTALLATION_ID_KEY = "InstallationId";
    private static final String SHARED_PREFERENCES_FILE = "mobilytics.installation-id";
    private final Context context;

    public MobilyticsExperimentSessionIDProvider(@NonNull Context context) {
        this.context = context;
    }

    @Override // com.amazon.alexa.growthcore.service.sessionid.ExperimentSessionIDProvider
    public String get() {
        return this.context.getSharedPreferences(SHARED_PREFERENCES_FILE, 0).getString("InstallationId", "");
    }
}
