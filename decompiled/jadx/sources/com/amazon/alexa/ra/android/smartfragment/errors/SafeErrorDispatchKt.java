package com.amazon.alexa.ra.android.smartfragment.errors;

import com.amazon.alexa.ra.android.smartfragment.util.Logger;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u00020\u0001*\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002j\u0004\u0018\u0001`\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¨\u0006\u0006"}, d2 = {"invokeSafely", "", "Lkotlin/Function1;", "Lcom/amazon/alexa/ra/android/smartfragment/errors/SandboxError;", "Lcom/amazon/alexa/ra/android/smartfragment/messaging/ErrorHandler;", "error", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSafeErrorDispatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeErrorDispatch.kt\ncom/amazon/alexa/ra/android/smartfragment/errors/SafeErrorDispatchKt\n+ 2 SafeCatching.kt\ncom/amazon/alexa/ra/android/smartfragment/util/SafeCatchingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n19#2,7:28\n1#3:35\n*S KotlinDebug\n*F\n+ 1 SafeErrorDispatch.kt\ncom/amazon/alexa/ra/android/smartfragment/errors/SafeErrorDispatchKt\n*L\n25#1:28,7\n*E\n"})
/* loaded from: classes18.dex */
public final class SafeErrorDispatchKt {
    public static final void invokeSafely(@Nullable Function1<? super SandboxError, Unit> function1, @NotNull SandboxError sandboxError) {
        Object m25294constructorimpl;
        sandboxError.getClass();
        if (function1 == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            function1.invoke(sandboxError);
            m25294constructorimpl = Result.m25294constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Result.Companion companion2 = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(e2));
        }
        Throwable m25297exceptionOrNullimpl = Result.m25297exceptionOrNullimpl(m25294constructorimpl);
        if (m25297exceptionOrNullimpl != null) {
            Logger.INSTANCE.error("host onError handler threw", m25297exceptionOrNullimpl);
        }
    }
}
