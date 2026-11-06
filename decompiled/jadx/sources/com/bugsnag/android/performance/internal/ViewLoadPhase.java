package com.bugsnag.android.performance.internal;

import androidx.annotation.RestrictTo;
import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.bugsnag.android.performance.ViewType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/bugsnag/android/performance/internal/ViewLoadPhase;", "", "phaseName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "phaseNameFor", "viewType", "Lcom/bugsnag/android/performance/ViewType;", "phaseNameFor$bugsnag_android_performance_release", "CREATE", "START", "RESUME", "DRAW", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public enum ViewLoadPhase {
    CREATE("Create"),
    START(LiveTranslationCapabilityConstants.DIRECTIVE_START),
    RESUME("Resume"),
    DRAW("Draw");


    @NotNull
    private final String phaseName;

    ViewLoadPhase(String str) {
        this.phaseName = str;
    }

    @NotNull
    public final String phaseNameFor$bugsnag_android_performance_release(@NotNull ViewType viewType) {
        viewType.getClass();
        return viewType.getSpanName() + this.phaseName;
    }
}
