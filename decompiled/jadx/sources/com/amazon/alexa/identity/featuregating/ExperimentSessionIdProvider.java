package com.amazon.alexa.identity.featuregating;

import android.content.Context;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class ExperimentSessionIdProvider {
    public static final String FALLBACK_EXPERIMENT_SESSION_ID = "";
    private static final String INSTALLATION_ID_KEY = "InstallationId";
    private static final String SHARED_PREFERENCES_FILE = "mobilytics.installation-id";
    private final Context context;

    public ExperimentSessionIdProvider(@NonNull Context context) {
        this.context = context;
    }

    public String get() {
        return this.context.getSharedPreferences(SHARED_PREFERENCES_FILE, 0).getString("InstallationId", "");
    }
}
