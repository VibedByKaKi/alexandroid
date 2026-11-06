package com.amazon.deecomms.common.service;

import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;
import androidx.core.app.SafeJobIntentService;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class CommsJobIntentService extends SafeJobIntentService {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, CommsJobIntentService.class);

    public static int generateJobId(@NonNull Class<? extends JobIntentService> cls) {
        int hashCode = cls.hashCode();
        LOG.d("Generated jobId for %s: %d", cls.getSimpleName(), Integer.valueOf(hashCode));
        return hashCode;
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        LOG.i("All work completed for %s", getClass().getSimpleName());
    }
}
