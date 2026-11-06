package com.amazon.alexa.smarthomecameras.directive;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/smarthomecameras/directive/SnapshotAuthenticationType;", "", "<init>", "(Ljava/lang/String;I)V", "ACCESS_NONE", "ACCESS_TOKEN", "AlexaMobileAndroidSmartHomeCameras_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class SnapshotAuthenticationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SnapshotAuthenticationType[] $VALUES;
    public static final SnapshotAuthenticationType ACCESS_NONE = new SnapshotAuthenticationType("ACCESS_NONE", 0);
    public static final SnapshotAuthenticationType ACCESS_TOKEN = new SnapshotAuthenticationType("ACCESS_TOKEN", 1);

    private static final /* synthetic */ SnapshotAuthenticationType[] $values() {
        return new SnapshotAuthenticationType[]{ACCESS_NONE, ACCESS_TOKEN};
    }

    static {
        SnapshotAuthenticationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private SnapshotAuthenticationType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<SnapshotAuthenticationType> getEntries() {
        return $ENTRIES;
    }

    public static SnapshotAuthenticationType valueOf(String str) {
        return (SnapshotAuthenticationType) Enum.valueOf(SnapshotAuthenticationType.class, str);
    }

    public static SnapshotAuthenticationType[] values() {
        return (SnapshotAuthenticationType[]) $VALUES.clone();
    }
}
