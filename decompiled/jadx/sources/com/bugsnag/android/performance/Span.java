package com.bugsnag.android.performance;

import com.bugsnag.android.performance.SpanContext;
import java.io.Closeable;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/bugsnag/android/performance/Span;", "Lcom/bugsnag/android/performance/SpanContext;", "Ljava/io/Closeable;", "Lcom/bugsnag/android/performance/HasAttributes;", "name", "", "getName", "()Ljava/lang/String;", "close", "", "end", "endTime", "", "isEnded", "", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Span extends SpanContext, Closeable, HasAttributes {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void end();

    void end(long endTime);

    @NotNull
    String getName();

    boolean isEnded();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void close(@NotNull Span span) {
            span.end();
        }

        @NotNull
        public static Runnable wrap(@NotNull Span span, @NotNull Runnable runnable) {
            runnable.getClass();
            return SpanContext.DefaultImpls.wrap(span, runnable);
        }

        @NotNull
        public static <T> Callable<T> wrap(@NotNull Span span, @NotNull Callable<T> callable) {
            callable.getClass();
            return SpanContext.DefaultImpls.wrap(span, callable);
        }
    }
}
