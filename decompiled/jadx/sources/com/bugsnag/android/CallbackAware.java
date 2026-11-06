package com.bugsnag.android;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\u000f"}, d2 = {"Lcom/bugsnag/android/CallbackAware;", "", "addOnBreadcrumb", "", "onBreadcrumb", "Lcom/bugsnag/android/OnBreadcrumbCallback;", "addOnError", "onError", "Lcom/bugsnag/android/OnErrorCallback;", "addOnSession", "onSession", "Lcom/bugsnag/android/OnSessionCallback;", "removeOnBreadcrumb", "removeOnError", "removeOnSession", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public interface CallbackAware {
    void addOnBreadcrumb(@NotNull OnBreadcrumbCallback onBreadcrumb);

    void addOnError(@NotNull OnErrorCallback onError);

    void addOnSession(@NotNull OnSessionCallback onSession);

    void removeOnBreadcrumb(@NotNull OnBreadcrumbCallback onBreadcrumb);

    void removeOnError(@NotNull OnErrorCallback onError);

    void removeOnSession(@NotNull OnSessionCallback onSession);
}
