package androidx.core.app;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public abstract class SafeJobIntentService extends JobIntentService {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, SafeJobIntentService.class);

    @Override // androidx.core.app.JobIntentService
    public JobIntentService.GenericWorkItem dequeueWork() {
        try {
            JobIntentService.GenericWorkItem dequeueWork = super.dequeueWork();
            if (dequeueWork != null) {
                return new WrappedGenericWorkItem(this, dequeueWork, 0);
            }
            return null;
        } catch (SecurityException e) {
            LOG.e("Error to dequeue work", e);
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class WrappedGenericWorkItem implements JobIntentService.GenericWorkItem {

        @NonNull
        private final JobIntentService.GenericWorkItem original;

        private WrappedGenericWorkItem(@NonNull JobIntentService.GenericWorkItem genericWorkItem) {
            this.original = genericWorkItem;
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public void complete() {
            try {
                this.original.complete();
            } catch (IllegalArgumentException | SecurityException e) {
                SafeJobIntentService.LOG.e("Error while completing work item", e);
            } catch (RuntimeException e2) {
                SafeJobIntentService.LOG.e("Error while executing background task ", e2);
            }
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public Intent getIntent() {
            return this.original.getIntent();
        }

        public /* synthetic */ WrappedGenericWorkItem(SafeJobIntentService safeJobIntentService, JobIntentService.GenericWorkItem genericWorkItem, int i) {
            this(genericWorkItem);
        }
    }
}
