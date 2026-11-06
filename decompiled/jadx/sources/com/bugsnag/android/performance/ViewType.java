package com.bugsnag.android.performance;

import com.amazon.alexa.capabilityagent.cardstudiosurface.common.SurfaceWire;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/bugsnag/android/performance/ViewType;", "", "typeName", "", "spanName", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getSpanName$bugsnag_android_performance_release", "()Ljava/lang/String;", "getTypeName$bugsnag_android_performance_release", "ACTIVITY", SurfaceWire.RENDER_TYPE_FRAGMENT, "COMPOSE", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum ViewType {
    ACTIVITY("activity", "Activity"),
    FRAGMENT("fragment", "Fragment"),
    COMPOSE("compose", "Compose");


    @NotNull
    private final String spanName;

    @NotNull
    private final String typeName;

    ViewType(String str, String str2) {
        this.typeName = str;
        this.spanName = str2;
    }

    @NotNull
    /* renamed from: getSpanName$bugsnag_android_performance_release, reason: from getter */
    public final String getSpanName() {
        return this.spanName;
    }

    @NotNull
    /* renamed from: getTypeName$bugsnag_android_performance_release, reason: from getter */
    public final String getTypeName() {
        return this.typeName;
    }
}
