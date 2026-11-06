package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.os.HandlerCompat;
import androidx.work.RunnableScheduler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes14.dex */
public class DefaultRunnableScheduler implements RunnableScheduler {
    private final Handler mHandler = HandlerCompat.createAsync(Looper.getMainLooper());

    @Override // androidx.work.RunnableScheduler
    public void cancel(@NonNull Runnable runnable) {
        this.mHandler.removeCallbacks(runnable);
    }

    @NonNull
    public Handler getHandler() {
        return this.mHandler;
    }

    @Override // androidx.work.RunnableScheduler
    public void scheduleWithDelay(long j, @NonNull Runnable runnable) {
        this.mHandler.postDelayed(runnable, j);
    }
}
