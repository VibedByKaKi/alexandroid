package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/IdleBreathingConstants;", "", "<init>", "()V", "AMPLITUDE", "", "PERIOD_MS", "", "PROGRESS_START", "PROGRESS_END", "VOLUME_FLOOR", "VOLUME_SAMPLE_INTERVAL_MS", "", "EMA_RETAIN", "EMA_INTAKE", "EMA_THRESHOLD", "NORMALIZATION_DIVISOR", "NORMALIZATION_OFFSET", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class IdleBreathingConstants {
    public static final int $stable = 0;
    public static final float AMPLITUDE = 0.18f;
    public static final float EMA_INTAKE = 0.3f;
    public static final float EMA_RETAIN = 0.7f;
    public static final float EMA_THRESHOLD = 0.001f;

    @NotNull
    public static final IdleBreathingConstants INSTANCE = new IdleBreathingConstants();
    public static final float NORMALIZATION_DIVISOR = 2.0f;
    public static final float NORMALIZATION_OFFSET = 1.0f;
    public static final int PERIOD_MS = 1700;
    public static final float PROGRESS_END = 1.0f;
    public static final float PROGRESS_START = 0.0f;
    public static final float VOLUME_FLOOR = 0.0f;
    public static final long VOLUME_SAMPLE_INTERVAL_MS = 150;

    private IdleBreathingConstants() {
    }
}
