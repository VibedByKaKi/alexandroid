package com.amazon.alexa.ra.core.features.dictation;

import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"metricValue", "", "Lcom/amazon/alexa/ra/core/features/dictation/DictationError;", "getMetricValue", "(Lcom/amazon/alexa/ra/core/features/dictation/DictationError;)Ljava/lang/String;", "ui-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class DictationMetricsKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DictationError.values().length];
            try {
                iArr[DictationError.MIC_DENIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DictationError.MIC_INTERRUPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DictationError.CONNECTION_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DictationError.NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DictationError.SERVICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String getMetricValue(@NotNull DictationError dictationError) {
        dictationError.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[dictationError.ordinal()];
        if (i == 1) {
            return "micDenied";
        }
        if (i == 2) {
            return "micInterrupted";
        }
        if (i == 3) {
            return "connectionFailed";
        }
        if (i == 4) {
            return "network";
        }
        if (i == 5) {
            return "service";
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
