package com.bugsnag.android.performance;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0010\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/bugsnag/android/performance/SpanKind;", "", "otelName", "", "otelOrdinal", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "INTERNAL", "SERVER", "CLIENT", "PRODUCER", "CONSUMER", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum SpanKind {
    INTERNAL("SPAN_KIND_INTERNAL", 1),
    SERVER("SPAN_KIND_SERVER", 2),
    CLIENT("SPAN_KIND_CLIENT", 3),
    PRODUCER("SPAN_KIND_PRODUCER", 4),
    CONSUMER("SPAN_KIND_CONSUMER", 5);


    @JvmField
    @NotNull
    public final String otelName;

    @JvmField
    public final int otelOrdinal;

    SpanKind(String str, int i) {
        this.otelName = str;
        this.otelOrdinal = i;
    }
}
