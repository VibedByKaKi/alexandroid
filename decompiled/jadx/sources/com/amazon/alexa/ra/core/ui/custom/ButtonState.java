package com.amazon.alexa.ra.core.ui.custom;

import com.amazon.alexa.client.metrics.core.AlexaMetricsConstants;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/ButtonState;", "", "<init>", "(Ljava/lang/String;I)V", "Enabled", AlexaMetricsConstants.DriveModeMetrics.NAVIGATE_TO_LINK_POSTFIX, BucketLifecycleConfiguration.DISABLED, "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ButtonState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ButtonState[] $VALUES;
    public static final ButtonState Enabled = new ButtonState("Enabled", 0);
    public static final ButtonState Selected = new ButtonState(AlexaMetricsConstants.DriveModeMetrics.NAVIGATE_TO_LINK_POSTFIX, 1);
    public static final ButtonState Disabled = new ButtonState(BucketLifecycleConfiguration.DISABLED, 2);

    private static final /* synthetic */ ButtonState[] $values() {
        return new ButtonState[]{Enabled, Selected, Disabled};
    }

    static {
        ButtonState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ButtonState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ButtonState> getEntries() {
        return $ENTRIES;
    }

    public static ButtonState valueOf(String str) {
        return (ButtonState) Enum.valueOf(ButtonState.class, str);
    }

    public static ButtonState[] values() {
        return (ButtonState[]) $VALUES.clone();
    }
}
