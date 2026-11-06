package com.mrousavy.camera.core.utils;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CancellableContinuation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes9.dex */
public final class RunOnUiThreadKt$runOnUiThreadAndWait$2$1 implements Runnable {
    final /* synthetic */ CancellableContinuation<T> $continuation;
    final /* synthetic */ Function0<T> $function;

    /* JADX WARN: Multi-variable type inference failed */
    public RunOnUiThreadKt$runOnUiThreadAndWait$2$1(CancellableContinuation<? super T> cancellableContinuation, Function0<? extends T> function0) {
        this.$continuation = cancellableContinuation;
        this.$function = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.$continuation.isCancelled()) {
            throw new CancellationException();
        }
        this.$continuation.resumeWith(Result.m25294constructorimpl(this.$function.invoke()));
    }
}
