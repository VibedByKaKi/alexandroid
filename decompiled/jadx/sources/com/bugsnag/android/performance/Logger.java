package com.bugsnag.android.performance;

import com.bugsnag.android.performance.internal.DebugLogger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\f"}, d2 = {"Lcom/bugsnag/android/performance/Logger;", "", "d", "", "msg", "", "throwable", "", "e", "i", "w", "Global", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Logger {

    /* renamed from: Global, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void d(@NotNull String msg);

    void d(@NotNull String msg, @NotNull Throwable throwable);

    void e(@NotNull String msg);

    void e(@NotNull String msg, @NotNull Throwable throwable);

    void i(@NotNull String msg);

    void i(@NotNull String msg, @NotNull Throwable throwable);

    void w(@NotNull String msg);

    void w(@NotNull String msg, @NotNull Throwable throwable);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R$\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/bugsnag/android/performance/Logger$Global;", "Lcom/bugsnag/android/performance/Logger;", "()V", "<set-?>", "delegate", "getDelegate", "()Lcom/bugsnag/android/performance/Logger;", "setDelegate$bugsnag_android_performance_release", "(Lcom/bugsnag/android/performance/Logger;)V", "d", "", "msg", "", "throwable", "", "e", "i", "w", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.bugsnag.android.performance.Logger$Global, reason: from kotlin metadata */
    public static final class Companion implements Logger {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static Logger delegate = DebugLogger.INSTANCE;

        private Companion() {
        }

        @Override // com.bugsnag.android.performance.Logger
        public void d(@NotNull String msg, @NotNull Throwable throwable) {
            msg.getClass();
            throwable.getClass();
            delegate.d(msg, throwable);
        }

        @Override // com.bugsnag.android.performance.Logger
        public void e(@NotNull String msg, @NotNull Throwable throwable) {
            msg.getClass();
            throwable.getClass();
            delegate.e(msg, throwable);
        }

        @NotNull
        public final Logger getDelegate() {
            return delegate;
        }

        @Override // com.bugsnag.android.performance.Logger
        public void i(@NotNull String msg, @NotNull Throwable throwable) {
            msg.getClass();
            throwable.getClass();
            delegate.i(msg, throwable);
        }

        public final void setDelegate$bugsnag_android_performance_release(@NotNull Logger logger) {
            logger.getClass();
            delegate = logger;
        }

        @Override // com.bugsnag.android.performance.Logger
        public void w(@NotNull String msg, @NotNull Throwable throwable) {
            msg.getClass();
            throwable.getClass();
            delegate.w(msg, throwable);
        }

        @Override // com.bugsnag.android.performance.Logger
        public void d(@NotNull String msg) {
            msg.getClass();
            delegate.d(msg);
        }

        @Override // com.bugsnag.android.performance.Logger
        public void e(@NotNull String msg) {
            msg.getClass();
            delegate.e(msg);
        }

        @Override // com.bugsnag.android.performance.Logger
        public void i(@NotNull String msg) {
            msg.getClass();
            delegate.i(msg);
        }

        @Override // com.bugsnag.android.performance.Logger
        public void w(@NotNull String msg) {
            msg.getClass();
            delegate.w(msg);
        }
    }
}
