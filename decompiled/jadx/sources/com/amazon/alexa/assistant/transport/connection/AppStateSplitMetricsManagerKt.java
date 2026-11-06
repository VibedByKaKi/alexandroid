package com.amazon.alexa.assistant.transport.connection;

import com.amazon.alexa.assistant.toolkit.lifecycle.model.ApplicationState;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"metricNameSegment", "", "Lcom/amazon/alexa/assistant/toolkit/lifecycle/model/ApplicationState;", "transport_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AppStateSplitMetricsManagerKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApplicationState.values().length];
            try {
                iArr[ApplicationState.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApplicationState.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApplicationState.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApplicationState.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String metricNameSegment(@NotNull ApplicationState applicationState) {
        applicationState.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[applicationState.ordinal()];
        if (i == 1) {
            return "Foreground";
        }
        if (i == 2) {
            return "Background";
        }
        if (i == 3) {
            return "ResingActive";
        }
        if (i == 4) {
            return "unknown";
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
