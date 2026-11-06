package com.amazonaws.internal;

import com.amazonaws.async.Callback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public abstract class ReturningRunnable<R> {
    private final String operationDescription;

    public ReturningRunnable() {
        this.operationDescription = null;
    }

    public void async(final Callback<R> callback) {
        new Thread(new Runnable() { // from class: com.amazonaws.internal.ReturningRunnable.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    callback.onResult(ReturningRunnable.this.run());
                } catch (Exception e) {
                    String str = ReturningRunnable.this.operationDescription;
                    Callback callback2 = callback;
                    if (str == null) {
                        callback2.onError(e);
                    } else {
                        callback2.onError(new Exception(ReturningRunnable.this.operationDescription, e));
                    }
                }
            }
        }).start();
    }

    public R await() throws Exception {
        return run();
    }

    public abstract R run() throws Exception;

    public ReturningRunnable(String str) {
        this.operationDescription = str;
    }
}
