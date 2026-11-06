package com.amazon.alexa.capabilityagent.deviceproximity.common.model;

import com.amazon.deecomms.common.Constants;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/DeviceIdType;", "", "<init>", "(Ljava/lang/String;I)V", "DMS_IDENTIFIER", "CHR_IDENTIFIER", "MAC_ADDRESS", "Companion", "AlexaMobileAndroidCapabilityAgent-DeviceProximity_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeviceIdType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeviceIdType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static final String DEVICE_DMS_IDENTIFIER_SEPARATOR = "@";
    public static final DeviceIdType DMS_IDENTIFIER = new DeviceIdType("DMS_IDENTIFIER", 0);
    public static final DeviceIdType CHR_IDENTIFIER = new DeviceIdType("CHR_IDENTIFIER", 1);
    public static final DeviceIdType MAC_ADDRESS = new DeviceIdType("MAC_ADDRESS", 2);

    private static final /* synthetic */ DeviceIdType[] $values() {
        return new DeviceIdType[]{DMS_IDENTIFIER, CHR_IDENTIFIER, MAC_ADDRESS};
    }

    static {
        DeviceIdType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private DeviceIdType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<DeviceIdType> getEntries() {
        return $ENTRIES;
    }

    public static DeviceIdType valueOf(String str) {
        return (DeviceIdType) Enum.valueOf(DeviceIdType.class, str);
    }

    public static DeviceIdType[] values() {
        return (DeviceIdType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/DeviceIdType$Companion;", "", "<init>", "()V", "DEVICE_DMS_IDENTIFIER_SEPARATOR", "", "buildDmsIdentifier", Constants.BUNDLE_SERIAL_NUMBER, "deviceType", "AlexaMobileAndroidCapabilityAgent-DeviceProximity_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final String buildDmsIdentifier(@Nullable String serialNumber, @Nullable String deviceType) {
            if (serialNumber == null || serialNumber.length() == 0 || deviceType == null || deviceType.length() == 0) {
                return null;
            }
            return a$$ExternalSyntheticOutline0.m$1(serialNumber, "@", deviceType);
        }

        private Companion() {
        }
    }
}
