package com.amazon.alexa.pmi.implementation.taplatency;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"LOW_PRIORITY_NAMES", "", "", "getLOW_PRIORITY_NAMES", "()Ljava/util/Set;", "ATTRIBUTION_WINDOW_MS", "", "MAX_TAP_RECORDS", "", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class TapAttributionBufferKt {
    public static final long ATTRIBUTION_WINDOW_MS = 1500;

    @NotNull
    private static final Set<String> LOW_PRIORITY_NAMES = SetsKt.setOf("mosaic.bottom_sheet.open");
    public static final int MAX_TAP_RECORDS = 32;

    @NotNull
    public static final Set<String> getLOW_PRIORITY_NAMES() {
        return LOW_PRIORITY_NAMES;
    }
}
