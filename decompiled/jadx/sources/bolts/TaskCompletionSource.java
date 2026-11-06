package bolts;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class TaskCompletionSource<TResult> {
    private final Task<TResult> task = new Task<>();

    public Task<TResult> getTask() {
        return this.task;
    }

    public void setCancelled() {
        if (trySetCancelled()) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Cannot cancel a completed task.");
    }

    public void setError(Exception exc) {
        if (trySetError(exc)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Cannot set the error on a completed task.");
    }

    public void setResult(TResult tresult) {
        if (trySetResult(tresult)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Cannot set the result of a completed task.");
    }

    public boolean trySetCancelled() {
        return this.task.trySetCancelled();
    }

    public boolean trySetError(Exception exc) {
        return this.task.trySetError(exc);
    }

    public boolean trySetResult(TResult tresult) {
        return this.task.trySetResult(tresult);
    }
}
