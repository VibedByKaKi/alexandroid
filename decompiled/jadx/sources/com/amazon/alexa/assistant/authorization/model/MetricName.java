package com.amazon.alexa.assistant.authorization.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/assistant/authorization/model/MetricName;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "AUTHORIZATION_START", "AUTHORIZATION_SUCCESS_LATENCY", "AUTHORIZATION_FAILURE_LATENCY", "UNAUTHORIZATION_START", "UNAUTHORIZATION_SUCCESS_LATENCY", "UNAUTHORIZATION_FAILURE_LATENCY", "authorization_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MetricName {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MetricName[] $VALUES;

    @NotNull
    private final String value;
    public static final MetricName AUTHORIZATION_START = new MetricName("AUTHORIZATION_START", 0, "authorizationStart");
    public static final MetricName AUTHORIZATION_SUCCESS_LATENCY = new MetricName("AUTHORIZATION_SUCCESS_LATENCY", 1, "authorizationSuccess");
    public static final MetricName AUTHORIZATION_FAILURE_LATENCY = new MetricName("AUTHORIZATION_FAILURE_LATENCY", 2, "authorizationFailure");
    public static final MetricName UNAUTHORIZATION_START = new MetricName("UNAUTHORIZATION_START", 3, "unauthorizationStart");
    public static final MetricName UNAUTHORIZATION_SUCCESS_LATENCY = new MetricName("UNAUTHORIZATION_SUCCESS_LATENCY", 4, "unauthorizationSuccess");
    public static final MetricName UNAUTHORIZATION_FAILURE_LATENCY = new MetricName("UNAUTHORIZATION_FAILURE_LATENCY", 5, "unauthorizationFailure");

    private static final /* synthetic */ MetricName[] $values() {
        return new MetricName[]{AUTHORIZATION_START, AUTHORIZATION_SUCCESS_LATENCY, AUTHORIZATION_FAILURE_LATENCY, UNAUTHORIZATION_START, UNAUTHORIZATION_SUCCESS_LATENCY, UNAUTHORIZATION_FAILURE_LATENCY};
    }

    static {
        MetricName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private MetricName(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<MetricName> getEntries() {
        return $ENTRIES;
    }

    public static MetricName valueOf(String str) {
        return (MetricName) Enum.valueOf(MetricName.class, str);
    }

    public static MetricName[] values() {
        return (MetricName[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
