package com.amazon.alexa.ra.core.metrics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/core/metrics/VisualShareStopInitiator;", "", "<init>", "()V", VisualShareStopInitiator.USER_APP, "", VisualShareStopInitiator.OS, VisualShareStopInitiator.LIVE_MODE_EXIT, "APP_CRASH", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class VisualShareStopInitiator {
    public static final int $stable = 0;

    @NotNull
    public static final String APP_CRASH = "APP_CRASH";

    @NotNull
    public static final VisualShareStopInitiator INSTANCE = new VisualShareStopInitiator();

    @NotNull
    public static final String LIVE_MODE_EXIT = "LIVE_MODE_EXIT";

    @NotNull
    public static final String OS = "OS";

    @NotNull
    public static final String USER_APP = "USER_APP";

    private VisualShareStopInitiator() {
    }
}
