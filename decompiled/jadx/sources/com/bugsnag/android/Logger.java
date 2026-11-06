package com.bugsnag.android;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bugsnag/android/Logger;", "", "d", "", "msg", "", "throwable", "", "e", "i", "w", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public interface Logger {
    void d(@NotNull String msg);

    void d(@NotNull String msg, @NotNull Throwable throwable);

    void e(@NotNull String msg);

    void e(@NotNull String msg, @NotNull Throwable throwable);

    void i(@NotNull String msg);

    void i(@NotNull String msg, @NotNull Throwable throwable);

    void w(@NotNull String msg);

    void w(@NotNull String msg, @NotNull Throwable throwable);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static final class DefaultImpls {
        public static void d(@NotNull Logger logger, @NotNull String str, @NotNull Throwable th) {
            str.getClass();
            th.getClass();
        }

        public static void e(@NotNull Logger logger, @NotNull String str, @NotNull Throwable th) {
            str.getClass();
            th.getClass();
        }

        public static void i(@NotNull Logger logger, @NotNull String str, @NotNull Throwable th) {
            str.getClass();
            th.getClass();
        }

        public static void w(@NotNull Logger logger, @NotNull String str, @NotNull Throwable th) {
            str.getClass();
            th.getClass();
        }

        public static void d(@NotNull Logger logger, @NotNull String str) {
            str.getClass();
        }

        public static void e(@NotNull Logger logger, @NotNull String str) {
            str.getClass();
        }

        public static void i(@NotNull Logger logger, @NotNull String str) {
            str.getClass();
        }

        public static void w(@NotNull Logger logger, @NotNull String str) {
            str.getClass();
        }
    }
}
