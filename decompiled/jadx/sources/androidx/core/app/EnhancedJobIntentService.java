package androidx.core.app;

import android.util.Log;
import androidx.core.app.JobIntentService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public abstract class EnhancedJobIntentService extends JobIntentService {
    private static final String TAG = "EnhancedJobIntentService";

    @Override // androidx.core.app.JobIntentService
    public JobIntentService.GenericWorkItem dequeueWork() {
        try {
            return super.dequeueWork();
        } catch (SecurityException e) {
            Log.e(TAG, "Error to dequeue work", e);
            return null;
        }
    }
}
