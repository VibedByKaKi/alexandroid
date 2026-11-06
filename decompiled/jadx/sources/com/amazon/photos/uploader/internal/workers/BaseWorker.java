package com.amazon.photos.uploader.internal.workers;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.ForegroundInfo;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.amazon.clouddrive.android.core.interfaces.MetricRecordingType;
import com.amazon.clouddrive.android.core.interfaces.Metrics;
import com.amazon.photos.uploader.internal.NotificationUpdatesNotifier;
import com.amazon.photos.uploader.observables.NotificationObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u001fH$J\b\u0010 \u001a\u00020!H$J\b\u0010\"\u001a\u00020\u0015H$J\u000e\u0010#\u001a\u00020\u001cH¤@¢\u0006\u0002\u0010\u001dJ\u0016\u0010$\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u0015H\u0002J\r\u0010'\u001a\u00020\u0015H\u0000¢\u0006\u0002\b(R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u0004\u0018\u00010\u000eX \u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/amazon/photos/uploader/internal/workers/BaseWorker;", "Landroidx/work/CoroutineWorker;", "Lcom/amazon/photos/uploader/observables/NotificationObserver;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "attemptCount", "", "componentFailureHappened", "", "componentInjected", "notificationUpdatesNotifier", "Lcom/amazon/photos/uploader/internal/NotificationUpdatesNotifier;", "getNotificationUpdatesNotifier$AndroidPhotosUploader_release", "()Lcom/amazon/photos/uploader/internal/NotificationUpdatesNotifier;", "setNotificationUpdatesNotifier$AndroidPhotosUploader_release", "(Lcom/amazon/photos/uploader/internal/NotificationUpdatesNotifier;)V", "startForegroundDone", "componentsSetup", "", "createForegroundInfo", "Landroidx/work/ForegroundInfo;", "notificationId", "notification", "Landroid/app/Notification;", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMetricsObj", "Lcom/amazon/clouddrive/android/core/interfaces/Metrics;", "getTag", "", "injectMethod", "mainTask", "onNotificationUpdate", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerNotificationObserver", "unregisterNotificationObserver", "unregisterNotificationObserver$AndroidPhotosUploader_release", "Companion", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class BaseWorker extends CoroutineWorker implements NotificationObserver {
    public static final int MAX_RETRIES = 5;
    private int attemptCount;
    private boolean componentFailureHappened;
    private boolean componentInjected;
    private boolean startForegroundDone;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    private final void componentsSetup() {
        if (this.componentInjected) {
            return;
        }
        injectMethod();
        this.componentInjected = true;
        if (this.componentFailureHappened) {
            getMetricsObj().recordSimpleEvent(getTag(), new BaseWorker$$ExternalSyntheticLambda0(0), new MetricRecordingType[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String componentsSetup$lambda$0() {
        return "INJECT_FAILED";
    }

    private final ForegroundInfo createForegroundInfo(int notificationId, Notification notification) {
        return Build.VERSION.SDK_INT >= 34 ? new ForegroundInfo(notificationId, notification, 1) : new ForegroundInfo(notificationId, notification);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object doWork$suspendImpl(com.amazon.photos.uploader.internal.workers.BaseWorker r4, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> r5) {
        /*
            boolean r0 = r5 instanceof com.amazon.photos.uploader.internal.workers.BaseWorker$doWork$1
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.photos.uploader.internal.workers.BaseWorker$doWork$1 r0 = (com.amazon.photos.uploader.internal.workers.BaseWorker$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.photos.uploader.internal.workers.BaseWorker$doWork$1 r0 = new com.amazon.photos.uploader.internal.workers.BaseWorker$doWork$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.amazon.photos.uploader.internal.workers.BaseWorker r4 = (com.amazon.photos.uploader.internal.workers.BaseWorker) r4
            kotlin.ResultKt.throwOnFailure(r5)
            goto L4b
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r4)
            r4 = 0
            return r4
        L34:
            kotlin.ResultKt.throwOnFailure(r5)
            r5 = 0
            r4.startForegroundDone = r5     // Catch: java.lang.IllegalStateException -> L51
            r4.componentsSetup()     // Catch: java.lang.IllegalStateException -> L51
            r4.registerNotificationObserver()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.mainTask(r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            androidx.work.ListenableWorker$Result r5 = (androidx.work.ListenableWorker.Result) r5
            r4.unregisterNotificationObserver$AndroidPhotosUploader_release()
            return r5
        L51:
            r4.componentFailureHappened = r3
            int r5 = r4.attemptCount
            r0 = 5
            if (r5 >= r0) goto L7f
            int r5 = r5 + r3
            r4.attemptCount = r5
            java.lang.String r5 = r4.getTag()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error injecting components to worker on attempt "
            r0.<init>(r1)
            int r4 = r4.attemptCount
            r0.append(r4)
            java.lang.String r4 = ". Retrying..."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            android.util.Log.w(r5, r4)
            androidx.work.ListenableWorker$Result r4 = androidx.work.ListenableWorker.Result.retry()
            r4.getClass()
            return r4
        L7f:
            java.lang.String r4 = r4.getTag()
            java.lang.String r5 = "Component injection failed."
            android.util.Log.e(r4, r5)
            androidx.work.ListenableWorker$Result r4 = androidx.work.ListenableWorker.Result.failure()
            r4.getClass()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.photos.uploader.internal.workers.BaseWorker.doWork$suspendImpl(com.amazon.photos.uploader.internal.workers.BaseWorker, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object onNotificationUpdate$suspendImpl(com.amazon.photos.uploader.internal.workers.BaseWorker r4, int r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            boolean r0 = r6 instanceof com.amazon.photos.uploader.internal.workers.BaseWorker$onNotificationUpdate$1
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.photos.uploader.internal.workers.BaseWorker$onNotificationUpdate$1 r0 = (com.amazon.photos.uploader.internal.workers.BaseWorker$onNotificationUpdate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.photos.uploader.internal.workers.BaseWorker$onNotificationUpdate$1 r0 = new com.amazon.photos.uploader.internal.workers.BaseWorker$onNotificationUpdate$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.amazon.photos.uploader.internal.workers.BaseWorker r4 = (com.amazon.photos.uploader.internal.workers.BaseWorker) r4
            kotlin.ResultKt.throwOnFailure(r6)
            goto L59
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r4)
            r4 = 0
            return r4
        L34:
            kotlin.ResultKt.throwOnFailure(r6)
            boolean r6 = r4.startForegroundDone
            if (r6 == 0) goto L3e
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L3e:
            com.amazon.photos.uploader.internal.NotificationUpdatesNotifier r6 = r4.getNotificationUpdatesNotifier()
            if (r6 == 0) goto L5b
            android.app.Notification r6 = r6.getNotification()
            if (r6 == 0) goto L5b
            androidx.work.ForegroundInfo r5 = r4.createForegroundInfo(r5, r6)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.setForeground(r5, r0)
            if (r5 != r1) goto L59
            return r1
        L59:
            r4.startForegroundDone = r3
        L5b:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.photos.uploader.internal.workers.BaseWorker.onNotificationUpdate$suspendImpl(com.amazon.photos.uploader.internal.workers.BaseWorker, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void registerNotificationObserver() {
        NotificationUpdatesNotifier notificationUpdatesNotifier = getNotificationUpdatesNotifier();
        if (notificationUpdatesNotifier != null) {
            notificationUpdatesNotifier.addNotificationObserver(this);
        }
    }

    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull Continuation<? super ListenableWorker.Result> continuation) {
        return doWork$suspendImpl(this, continuation);
    }

    @NotNull
    public abstract Metrics getMetricsObj();

    @Nullable
    /* renamed from: getNotificationUpdatesNotifier$AndroidPhotosUploader_release */
    public abstract NotificationUpdatesNotifier getNotificationUpdatesNotifier();

    @NotNull
    public abstract String getTag();

    public abstract void injectMethod();

    @Nullable
    public abstract Object mainTask(@NotNull Continuation<? super ListenableWorker.Result> continuation);

    @Override // com.amazon.photos.uploader.observables.NotificationObserver
    @Nullable
    public Object onNotificationUpdate(int i, @NotNull Continuation<? super Unit> continuation) {
        return onNotificationUpdate$suspendImpl(this, i, continuation);
    }

    public abstract void setNotificationUpdatesNotifier$AndroidPhotosUploader_release(@Nullable NotificationUpdatesNotifier notificationUpdatesNotifier);

    public final void unregisterNotificationObserver$AndroidPhotosUploader_release() {
        NotificationUpdatesNotifier notificationUpdatesNotifier = getNotificationUpdatesNotifier();
        if (notificationUpdatesNotifier != null) {
            notificationUpdatesNotifier.removeNotificationObserver(this);
        }
    }
}
