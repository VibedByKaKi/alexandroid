package com.amazon.alexa.assistant.toolkit.metric.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/metric/model/MetricSubcomponent;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "EXTERNAL_AUDIO_SESSION", "INTERNAL_AUDIO_SESSION", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MetricSubcomponent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MetricSubcomponent[] $VALUES;
    public static final MetricSubcomponent EXTERNAL_AUDIO_SESSION = new MetricSubcomponent("EXTERNAL_AUDIO_SESSION", 0, "DeviceManageAudioSession");
    public static final MetricSubcomponent INTERNAL_AUDIO_SESSION = new MetricSubcomponent("INTERNAL_AUDIO_SESSION", 1, "SDKManageAudioSession");

    @NotNull
    private final String value;

    private static final /* synthetic */ MetricSubcomponent[] $values() {
        return new MetricSubcomponent[]{EXTERNAL_AUDIO_SESSION, INTERNAL_AUDIO_SESSION};
    }

    static {
        MetricSubcomponent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private MetricSubcomponent(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<MetricSubcomponent> getEntries() {
        return $ENTRIES;
    }

    public static MetricSubcomponent valueOf(String str) {
        return (MetricSubcomponent) Enum.valueOf(MetricSubcomponent.class, str);
    }

    public static MetricSubcomponent[] values() {
        return (MetricSubcomponent[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
