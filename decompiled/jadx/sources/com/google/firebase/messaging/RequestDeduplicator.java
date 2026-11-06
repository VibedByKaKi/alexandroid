package com.google.firebase.messaging;

import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class RequestDeduplicator {
    private final Executor executor;

    @GuardedBy("this")
    private final Map<String, Task<String>> getTokenRequests = new ArrayMap();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetTokenRequest {
        Task<String> start();
    }

    public RequestDeduplicator(Executor executor) {
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getOrStartGetTokenRequest$0(String str, Task task) throws Exception {
        synchronized (this) {
            this.getTokenRequests.remove(str);
        }
        return task;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized Task<String> getOrStartGetTokenRequest(String str, GetTokenRequest getTokenRequest) {
        Task<String> task = this.getTokenRequests.get(str);
        if (task != null) {
            Log.isLoggable(Constants.TAG, 3);
            return task;
        }
        Log.isLoggable(Constants.TAG, 3);
        Task continueWithTask = getTokenRequest.start().continueWithTask(this.executor, new RequestDeduplicator$$ExternalSyntheticLambda0(this, str));
        this.getTokenRequests.put(str, continueWithTask);
        return continueWithTask;
    }
}
