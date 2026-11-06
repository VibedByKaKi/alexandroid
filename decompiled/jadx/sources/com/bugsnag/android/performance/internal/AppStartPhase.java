package com.bugsnag.android.performance.internal;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/performance/internal/AppStartPhase;", "", "phaseName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getPhaseName$bugsnag_android_performance_release", "()Ljava/lang/String;", "FRAMEWORK", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public enum AppStartPhase {
    FRAMEWORK("Framework");


    @NotNull
    private final String phaseName;

    AppStartPhase(String str) {
        this.phaseName = str;
    }

    @NotNull
    /* renamed from: getPhaseName$bugsnag_android_performance_release, reason: from getter */
    public final String getPhaseName() {
        return this.phaseName;
    }
}
