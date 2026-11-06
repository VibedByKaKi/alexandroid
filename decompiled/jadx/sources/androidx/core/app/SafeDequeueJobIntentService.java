package androidx.core.app;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public abstract class SafeDequeueJobIntentService extends JobIntentService {
    private static final String TAG = "SafeDequeueJobIntentService";

    @Override // androidx.core.app.JobIntentService
    public JobIntentService.GenericWorkItem dequeueWork() {
        int i = 0;
        try {
            JobIntentService.GenericWorkItem dequeueWork = super.dequeueWork();
            if (dequeueWork != null) {
                return new WrappedGenericWorkItem(this, dequeueWork, i);
            }
            return null;
        } catch (SecurityException e) {
            Log.e(TAG, "Error while dequeuing work from SafeDequeueJobIntentService: ", e, new Object[0]);
            return null;
        }
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class WrappedGenericWorkItem implements JobIntentService.GenericWorkItem {

        @NonNull
        private final JobIntentService.GenericWorkItem mWrappedWorkItem;

        private WrappedGenericWorkItem(@NonNull JobIntentService.GenericWorkItem genericWorkItem) {
            this.mWrappedWorkItem = genericWorkItem;
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public void complete() {
            try {
                this.mWrappedWorkItem.complete();
            } catch (SecurityException e) {
                Log.e(SafeDequeueJobIntentService.TAG, "Error while completing work item: ", e, new Object[0]);
            }
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public Intent getIntent() {
            return this.mWrappedWorkItem.getIntent();
        }

        public /* synthetic */ WrappedGenericWorkItem(SafeDequeueJobIntentService safeDequeueJobIntentService, JobIntentService.GenericWorkItem genericWorkItem, int i) {
            this(genericWorkItem);
        }
    }
}
