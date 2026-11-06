package io.branch.referral;

import android.os.AsyncTask;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class BranchAsyncTask<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    public final AsyncTask<Params, Progress, Result> executeTask(Params... paramsArr) {
        try {
            return executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramsArr);
        } catch (Exception e) {
            BranchLogger.w("Caught Exception in AsyncTask: " + e.getMessage());
            return this.execute(paramsArr);
        }
    }
}
