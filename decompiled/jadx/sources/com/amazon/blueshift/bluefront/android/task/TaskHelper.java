package com.amazon.blueshift.bluefront.android.task;

import android.annotation.SuppressLint;
import android.os.AsyncTask;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class TaskHelper {
    private TaskHelper() {
    }

    @SuppressLint({"NewApi"})
    public static <P, T extends AsyncTask<P, ?, ?>> void execute(T t, P... pArr) {
        t.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, pArr);
    }

    public static <P, T extends AsyncTask<P, ?, ?>> void execute(T t) {
        execute(t, null);
    }
}
