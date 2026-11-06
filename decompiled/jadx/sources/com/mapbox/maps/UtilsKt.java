package com.mapbox.maps;

import android.content.Context;
import android.util.TypedValue;
import androidx.exifinterface.media.ExifInterface;
import com.dee.app.metrics.MetricsConstants;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Cancelable;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000J\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aQ\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001aU\u0010\f\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\r\u0018\u0001\"\u0006\b\u0001\u0010\u000e\u0018\u0001\"\u0016\b\u0002\u0010\u0001\u0018\u0001*\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e0\u000f2\u001a\b\u0004\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\t\u0012\u0004\u0012\u00020\u00110\bH\u0080Hø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a<\u0010\u0013\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0014*\b\u0012\u0004\u0012\u0002H\u00010\u00152\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00140\b¢\u0006\u0002\b\u0017H\u0000¢\u0006\u0002\u0010\u0018\u001a#\u0010\u0019\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u001a*\u0002H\u00012\u0006\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"safeBinderCall", ExifInterface.GPS_DIRECTION_TRUE, "fallback", "logTag", "", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "operation", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/lang/Object;Ljava/lang/String;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suspendMapboxCancellableCoroutine", ExifInterface.LONGITUDE_EAST, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/mapbox/bindgen/Expected;", "block", "Lcom/mapbox/common/Cancelable;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "call", "R", "Ljava/lang/ref/WeakReference;", MetricsConstants.NativeFetch.METHOD, "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/ref/WeakReference;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "toDP", "", "context", "Landroid/content/Context;", "(Ljava/lang/Number;Landroid/content/Context;)Ljava/lang/Number;", "maps-sdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class UtilsKt {
    public static final <T, R> R call(@NotNull WeakReference<T> weakReference, @NotNull Function1<? super T, ? extends R> function1) {
        weakReference.getClass();
        function1.getClass();
        T t = weakReference.get();
        if (t != null) {
            return function1.invoke(t);
        }
        Duration$$ExternalSyntheticBUOutline0.m$1();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object safeBinderCall(T r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineDispatcher r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r8) {
        /*
            boolean r0 = r8 instanceof com.mapbox.maps.UtilsKt$safeBinderCall$1
            if (r0 == 0) goto L13
            r0 = r8
            com.mapbox.maps.UtilsKt$safeBinderCall$1 r0 = (com.mapbox.maps.UtilsKt$safeBinderCall$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.mapbox.maps.UtilsKt$safeBinderCall$1 r0 = new com.mapbox.maps.UtilsKt$safeBinderCall$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.L$1
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L76
            return r8
        L30:
            r6 = move-exception
            goto L5b
        L32:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r4)
            r4 = 0
            return r4
        L39:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.CoroutineName r8 = new kotlinx.coroutines.CoroutineName     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L76
            java.lang.String r2 = "safeBinderCall"
            r8.<init>(r2)     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L76
            kotlin.coroutines.CoroutineContext r6 = r6.plus(r8)     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L76
            com.mapbox.maps.UtilsKt$safeBinderCall$2 r8 = new com.mapbox.maps.UtilsKt$safeBinderCall$2     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L76
            r2 = 0
            r8.<init>(r7, r2)     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L76
            r0.L$0 = r4     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L76
            r0.L$1 = r5     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L76
            r0.label = r3     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L76
            java.lang.Object r4 = kotlinx.coroutines.BuildersKt.withContext(r6, r8, r0)     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L76
            if (r4 != r1) goto L5a
            return r1
        L5a:
            return r4
        L5b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "System call failed: "
            r7.<init>(r8)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = ", using fallback"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.mapbox.maps.MapboxLogger.logE(r5, r6)
            return r4
        L76:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.UtilsKt.safeBinderCall(java.lang.Object, java.lang.String, kotlinx.coroutines.CoroutineDispatcher, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object safeBinderCall$default(Object obj, String str, CoroutineDispatcher coroutineDispatcher, Function1 function1, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = "SystemCall";
        }
        if ((i & 4) != 0) {
            coroutineDispatcher = Dispatchers.getIO();
        }
        return safeBinderCall(obj, str, coroutineDispatcher, function1, continuation);
    }

    public static final /* synthetic */ <E, V, T extends Expected<E, V>> Object suspendMapboxCancellableCoroutine(Function1<? super Continuation<? super T>, ? extends Cancelable> function1, Continuation<? super T> continuation) {
        InlineMarker.mark(0);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(function1.invoke(cancellableContinuationImpl)));
        Unit unit = Unit.INSTANCE;
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        InlineMarker.mark(1);
        return result;
    }

    @NotNull
    public static final <T extends Number> T toDP(@NotNull T t, @NotNull Context context) {
        t.getClass();
        context.getClass();
        return Float.valueOf(TypedValue.applyDimension(1, t.floatValue(), context.getResources().getDisplayMetrics()));
    }
}
