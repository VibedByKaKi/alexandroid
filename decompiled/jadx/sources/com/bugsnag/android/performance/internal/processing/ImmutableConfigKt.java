package com.bugsnag.android.performance.internal.processing;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"BUGSNAG_ENDPOINT", "", "DEFAULT_ENDPOINT", "HUB_API_PREFIX", "HUB_ENDPOINT", "bugsnag-android-performance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImmutableConfigKt {

    @NotNull
    private static final String BUGSNAG_ENDPOINT = "https://%s.otlp.bugsnag.com/v1/traces";

    @NotNull
    public static final String DEFAULT_ENDPOINT = "https://otlp.bugsnag.com/v1/traces";

    @NotNull
    private static final String HUB_API_PREFIX = "00000";

    @NotNull
    private static final String HUB_ENDPOINT = "https://%s.otlp.insighthub.smartbear.com/v1/traces";
}
