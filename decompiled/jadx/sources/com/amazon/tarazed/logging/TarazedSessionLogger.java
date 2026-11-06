package com.amazon.tarazed.logging;

import android.content.Context;
import com.amazon.tarazed.coroutine.dispatcher.DispatcherProvider;
import com.amazon.tarazed.metrics.TarazedMetricsHelper;
import com.amazon.tarazed.sessionclient.model.createcredentials.LoggingCredentials;
import com.amazon.tarazed.utility.DirectBootHelper;
import com.dee.app.contacts.common.constants.Constants;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001$B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0019\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0014\u0010\u001e\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0006\u0010\u001f\u001a\u00020 J\u0018\u0010!\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0080@¢\u0006\u0004\b\"\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/amazon/tarazed/logging/TarazedSessionLogger;", "Lcom/amazon/tarazed/logging/TarazedBaseLogger;", "context", "Landroid/content/Context;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "dispatchers", "Lcom/amazon/tarazed/coroutine/dispatcher/DispatcherProvider;", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Lcom/amazon/tarazed/coroutine/dispatcher/DispatcherProvider;)V", "appender", "Lcom/amazon/tarazed/logging/TarazedLogFileAppender;", "getAppender", "()Lcom/amazon/tarazed/logging/TarazedLogFileAppender;", "setAppender", "(Lcom/amazon/tarazed/logging/TarazedLogFileAppender;)V", "cloudWatchLogUploader", "Lcom/amazon/tarazed/logging/TarazedCloudWatchLogUploader;", "initialize", "Ljava/util/concurrent/atomic/AtomicBoolean;", "loggingCredentials", "Lcom/amazon/tarazed/sessionclient/model/createcredentials/LoggingCredentials;", "getLoggingCredentials$TarazedAndroidLibrary_release", "()Lcom/amazon/tarazed/sessionclient/model/createcredentials/LoggingCredentials;", "setLoggingCredentials$TarazedAndroidLibrary_release", "(Lcom/amazon/tarazed/sessionclient/model/createcredentials/LoggingCredentials;)V", "getLogFileAppender", "initializeLogFile", "", "metricsHelper", "Lcom/amazon/tarazed/metrics/TarazedMetricsHelper;", "initializeLogFileInternal", "initialized", "", "uploadLogs", "uploadLogs$TarazedAndroidLibrary_release", "(Lcom/amazon/tarazed/metrics/TarazedMetricsHelper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class TarazedSessionLogger extends TarazedBaseLogger {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String LOG_FILE_NAME = "tarazed-session.log";

    @NotNull
    private static final String METRIC_DUPLICATE_LOG_FILE_INITIALIZE = "DuplicateLogFileInitialize";

    @NotNull
    private static final String METRIC_LOG_UPLOAD_ATTEMPTS = "SessionLogUploadAttempt";

    @NotNull
    private static final String METRIC_LOG_UPLOAD_FAILED = "SessionLogUploadFailed";

    @NotNull
    private static final String METRIC_LOG_UPLOAD_NOT_ATTEMPTED = "LogUploadNotAttempted";

    @NotNull
    private static final String TAG = "TarazedSessionLogger";

    @Nullable
    private TarazedLogFileAppender appender;

    @Nullable
    private TarazedCloudWatchLogUploader cloudWatchLogUploader;

    @NotNull
    private final Context context;

    @NotNull
    private final CoroutineScope coroutineScope;

    @NotNull
    private final DispatcherProvider dispatchers;

    @NotNull
    private final AtomicBoolean initialize;

    @Nullable
    private LoggingCredentials loggingCredentials;

    public TarazedSessionLogger(@NotNull Context context, @NotNull CoroutineScope coroutineScope, @NotNull DispatcherProvider dispatcherProvider) {
        context.getClass();
        coroutineScope.getClass();
        dispatcherProvider.getClass();
        this.context = context;
        this.coroutineScope = coroutineScope;
        this.dispatchers = dispatcherProvider;
        this.initialize = new AtomicBoolean(false);
        initializeLogFileInternal$default(this, null, 1, null);
    }

    private final void initializeLogFileInternal(TarazedMetricsHelper metricsHelper) {
        if (DirectBootHelper.INSTANCE.isDeviceInDirectBootMode(this.context)) {
            i(TAG, "Credential storage is locked. Delaying log file initialization");
            return;
        }
        if (this.initialize.getAndSet(true)) {
            i(TAG, "Log file is already initialized, ignoring");
            if (metricsHelper != null) {
                metricsHelper.addCount(TAG, METRIC_DUPLICATE_LOG_FILE_INITIALIZE, 1.0d);
                return;
            }
            return;
        }
        TarazedLogFileAppender tarazedLogFileAppender = new TarazedLogFileAppender(this.context, LOG_FILE_NAME, this.coroutineScope, this.dispatchers);
        this.cloudWatchLogUploader = new TarazedCloudWatchLogUploader(tarazedLogFileAppender, this.dispatchers);
        setAppender(tarazedLogFileAppender);
        i(TAG, "Log file initialized");
    }

    public static /* synthetic */ void initializeLogFileInternal$default(TarazedSessionLogger tarazedSessionLogger, TarazedMetricsHelper tarazedMetricsHelper, int i, Object obj) {
        if ((i & 1) != 0) {
            tarazedMetricsHelper = null;
        }
        tarazedSessionLogger.initializeLogFileInternal(tarazedMetricsHelper);
    }

    @Override // com.amazon.tarazed.logging.TarazedBaseLogger
    @Nullable
    public TarazedLogFileAppender getAppender() {
        return this.appender;
    }

    @Nullable
    public final TarazedLogFileAppender getLogFileAppender() {
        return getAppender();
    }

    @Nullable
    /* renamed from: getLoggingCredentials$TarazedAndroidLibrary_release, reason: from getter */
    public final LoggingCredentials getLoggingCredentials() {
        return this.loggingCredentials;
    }

    public final void initializeLogFile(@NotNull TarazedMetricsHelper metricsHelper) {
        metricsHelper.getClass();
        initializeLogFileInternal(metricsHelper);
    }

    public final boolean initialized() {
        return this.initialize.get();
    }

    public void setAppender(@Nullable TarazedLogFileAppender tarazedLogFileAppender) {
        this.appender = tarazedLogFileAppender;
    }

    public final void setLoggingCredentials$TarazedAndroidLibrary_release(@Nullable LoggingCredentials loggingCredentials) {
        this.loggingCredentials = loggingCredentials;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(2:10|11)(2:15|16))(2:17|(2:32|33)(3:21|22|(2:24|(2:26|(1:28)))(3:29|30|31)))|12|13))|36|6|7|(0)(0)|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0036, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        e(com.amazon.tarazed.logging.TarazedSessionLogger.TAG, "Log upload failed", r9);
        r8.addCountHighPriority(com.amazon.tarazed.logging.TarazedSessionLogger.TAG, com.amazon.tarazed.logging.TarazedSessionLogger.METRIC_LOG_UPLOAD_FAILED, 1.0d);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uploadLogs$TarazedAndroidLibrary_release(@org.jetbrains.annotations.NotNull com.amazon.tarazed.metrics.TarazedMetricsHelper r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.amazon.tarazed.logging.TarazedSessionLogger$uploadLogs$1
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.tarazed.logging.TarazedSessionLogger$uploadLogs$1 r0 = (com.amazon.tarazed.logging.TarazedSessionLogger$uploadLogs$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.tarazed.logging.TarazedSessionLogger$uploadLogs$1 r0 = new com.amazon.tarazed.logging.TarazedSessionLogger$uploadLogs$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.String r6 = "TarazedSessionLogger"
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.L$1
            r8 = r7
            com.amazon.tarazed.metrics.TarazedMetricsHelper r8 = (com.amazon.tarazed.metrics.TarazedMetricsHelper) r8
            java.lang.Object r7 = r0.L$0
            com.amazon.tarazed.logging.TarazedSessionLogger r7 = (com.amazon.tarazed.logging.TarazedSessionLogger) r7
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> L36
            goto L6c
        L36:
            r9 = move-exception
            goto L7a
        L38:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r7)
            r7 = 0
            return r7
        L3f:
            kotlin.ResultKt.throwOnFailure(r9)
            com.amazon.tarazed.logging.TarazedLogFileAppender r9 = r7.getAppender()
            if (r9 == 0) goto L87
            com.amazon.tarazed.logging.TarazedCloudWatchLogUploader r9 = r7.cloudWatchLogUploader
            if (r9 != 0) goto L4d
            goto L87
        L4d:
            java.lang.String r9 = "Uploading logs..."
            r7.i(r6, r9)
            com.amazon.tarazed.sessionclient.model.createcredentials.LoggingCredentials r9 = r7.loggingCredentials     // Catch: java.lang.Exception -> L36
            if (r9 == 0) goto L74
            java.lang.String r2 = "SessionLogUploadAttempt"
            r8.addCountHighPriority(r6, r2, r4)     // Catch: java.lang.Exception -> L36
            com.amazon.tarazed.logging.TarazedCloudWatchLogUploader r2 = r7.cloudWatchLogUploader     // Catch: java.lang.Exception -> L36
            if (r2 == 0) goto L6c
            r0.L$0 = r7     // Catch: java.lang.Exception -> L36
            r0.L$1 = r8     // Catch: java.lang.Exception -> L36
            r0.label = r3     // Catch: java.lang.Exception -> L36
            java.lang.Object r9 = r2.uploadLogs(r9, r0)     // Catch: java.lang.Exception -> L36
            if (r9 != r1) goto L6c
            return r1
        L6c:
            java.lang.String r9 = "Log upload successful"
            r7.i(r6, r9)     // Catch: java.lang.Exception -> L36
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L36
            return r7
        L74:
            java.lang.String r9 = "Log upload failed, logging credentials null"
            r7.e(r6, r9)     // Catch: java.lang.Exception -> L36
            goto L84
        L7a:
            java.lang.String r0 = "Log upload failed"
            r7.e(r6, r0, r9)
            java.lang.String r7 = "SessionLogUploadFailed"
            r8.addCountHighPriority(r6, r7, r4)
        L84:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L87:
            java.lang.String r9 = "Log file is not initialized. Nothing to upload"
            r7.i(r6, r9)
            java.lang.String r7 = "LogUploadNotAttempted"
            r8.addCount(r6, r7, r4)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.tarazed.logging.TarazedSessionLogger.uploadLogs$TarazedAndroidLibrary_release(com.amazon.tarazed.metrics.TarazedMetricsHelper, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/tarazed/logging/TarazedSessionLogger$Companion;", "", "()V", "LOG_FILE_NAME", "", "METRIC_DUPLICATE_LOG_FILE_INITIALIZE", "METRIC_LOG_UPLOAD_ATTEMPTS", "METRIC_LOG_UPLOAD_FAILED", "METRIC_LOG_UPLOAD_NOT_ATTEMPTED", Constants.LOG_TAG, "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
