package com.amazon.alexa.capabilityagent.deviceproximity.common;

import com.amazon.alexa.api.AlexaCapability;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/capabilityagent/deviceproximity/common/Constants;", "", "<init>", "()V", "DEVICE_PROXIMITY_FEATURE_ID", "", "UNKNOWN_DEVICE_TYPE", "", "DEVICE_PROXIMITY_CAPABILITY_NAMESPACE", "DEVICE_PROXIMITY_CAPABILITY_VERSION", "SYNC_DEVICE_PROXIMITY_POLICY_EVENT_NAME", "SYNC_SECURITY_MATERIAL_EVENT_NAME", "SET_POLICY_CONFIGURATION_DIRECTIVE_NAME", "SET_SECURITY_MATERIAL_DIRECTIVE_NAME", "DEVICE_PROXIMITY_CAPABILITY_TYPE", "SupportingCapability", "AlexaMobileAndroidCapabilityAgent-DeviceProximity_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Constants {

    @NotNull
    public static final String DEVICE_PROXIMITY_CAPABILITY_NAMESPACE = "Alexa.Sensor.Proximity";

    @NotNull
    public static final String DEVICE_PROXIMITY_CAPABILITY_TYPE = "AlexaInterface";

    @NotNull
    public static final String DEVICE_PROXIMITY_CAPABILITY_VERSION = "1.0";
    public static final int DEVICE_PROXIMITY_FEATURE_ID = 37;

    @NotNull
    public static final Constants INSTANCE = new Constants();

    @NotNull
    public static final String SET_POLICY_CONFIGURATION_DIRECTIVE_NAME = "SetDeviceProximityPolicy";

    @NotNull
    public static final String SET_SECURITY_MATERIAL_DIRECTIVE_NAME = "SetSecurityMaterial";

    @NotNull
    public static final String SYNC_DEVICE_PROXIMITY_POLICY_EVENT_NAME = "SyncDeviceProximityPolicy";

    @NotNull
    public static final String SYNC_SECURITY_MATERIAL_EVENT_NAME = "SyncSecurityMaterial";

    @NotNull
    public static final String UNKNOWN_DEVICE_TYPE = "UNKNOWN";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/capabilityagent/deviceproximity/common/Constants$SupportingCapability;", "", "alexaCapability", "Lcom/amazon/alexa/api/AlexaCapability;", "<init>", "(Ljava/lang/String;ILcom/amazon/alexa/api/AlexaCapability;)V", "getAlexaCapability", "()Lcom/amazon/alexa/api/AlexaCapability;", "DEVICE_PROXIMITY_CAPABILITY", "getNamespace", "", "getVersion", "AlexaMobileAndroidCapabilityAgent-DeviceProximity_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SupportingCapability {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SupportingCapability[] $VALUES;
        public static final SupportingCapability DEVICE_PROXIMITY_CAPABILITY;

        @NotNull
        private final AlexaCapability alexaCapability;

        private static final /* synthetic */ SupportingCapability[] $values() {
            return new SupportingCapability[]{DEVICE_PROXIMITY_CAPABILITY};
        }

        static {
            AlexaCapability create = AlexaCapability.create("AlexaInterface", Constants.DEVICE_PROXIMITY_CAPABILITY_NAMESPACE, "1.0", null, "BLUETOOTH");
            create.getClass();
            DEVICE_PROXIMITY_CAPABILITY = new SupportingCapability("DEVICE_PROXIMITY_CAPABILITY", 0, create);
            SupportingCapability[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private SupportingCapability(String str, int i, AlexaCapability alexaCapability) {
            this.alexaCapability = alexaCapability;
        }

        @NotNull
        public static EnumEntries<SupportingCapability> getEntries() {
            return $ENTRIES;
        }

        public static SupportingCapability valueOf(String str) {
            return (SupportingCapability) Enum.valueOf(SupportingCapability.class, str);
        }

        public static SupportingCapability[] values() {
            return (SupportingCapability[]) $VALUES.clone();
        }

        @NotNull
        public final AlexaCapability getAlexaCapability() {
            return this.alexaCapability;
        }

        @NotNull
        public final String getNamespace() {
            String str = this.alexaCapability.getInterface();
            str.getClass();
            return str;
        }

        @NotNull
        public final String getVersion() {
            String version = this.alexaCapability.getVersion();
            version.getClass();
            return version;
        }
    }

    private Constants() {
    }
}
