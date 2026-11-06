package com.bugsnag.android.performance.internal;

import com.amazon.devicesetupservice.smarthome.ProtocolType;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/bugsnag/android/performance/internal/NetworkType;", "", "otelName", "", "(Ljava/lang/String;ILjava/lang/String;)V", ProtocolType.WIFI, "WIRED", "CELL", "UNAVAILABLE", "UNKNOWN", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum NetworkType {
    WIFI("wifi"),
    WIRED("wired"),
    CELL("cell"),
    UNAVAILABLE("unavailable"),
    UNKNOWN("unknown");


    @JvmField
    @NotNull
    public final String otelName;

    NetworkType(String str) {
        this.otelName = str;
    }
}
