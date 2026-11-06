package com.amazon.alexa.crashreporting;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class IntentionalCrashActivity extends Activity {
    private static final String TAG = "IntentionalCrashActivity";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class IntentionalCrashException extends RuntimeException {
        public IntentionalCrashException() {
            super("I'm crashing, because you asked me to do so!");
        }
    }

    private boolean isAllowedToIntentionallyCrash() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(EnvironmentService.class).get();
        EnvironmentService environmentService = (EnvironmentService) obj;
        if (environmentService.isDebugBuild()) {
            return true;
        }
        Iterator it2 = Arrays.asList("prod", "prodPhoenix").iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equalsIgnoreCase(environmentService.getBuildFlavor())) {
                Log.w(TAG, "Test crashes are not allowed on production release builds.");
                return false;
            }
        }
        return true;
    }

    @Override // android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onCreate(Bundle bundle) {
        if (isAllowedToIntentionallyCrash()) {
            throw new IntentionalCrashException();
        }
        finish();
    }
}
