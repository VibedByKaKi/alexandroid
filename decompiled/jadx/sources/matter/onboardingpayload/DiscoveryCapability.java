package matter.onboardingpayload;

import com.amazon.devicesetupservice.smarthome.ProtocolType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lmatter/onboardingpayload/DiscoveryCapability;", "", "bitIndex", "", "<init>", "(Ljava/lang/String;II)V", "getBitIndex", "()I", "SOFT_AP", ProtocolType.BLE, "ON_NETWORK", "WIFI_PAF", "NFC", "AlexaMobileAndroidMatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DiscoveryCapability {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DiscoveryCapability[] $VALUES;
    private final int bitIndex;
    public static final DiscoveryCapability SOFT_AP = new DiscoveryCapability("SOFT_AP", 0, 0);
    public static final DiscoveryCapability BLE = new DiscoveryCapability(ProtocolType.BLE, 1, 1);
    public static final DiscoveryCapability ON_NETWORK = new DiscoveryCapability("ON_NETWORK", 2, 2);
    public static final DiscoveryCapability WIFI_PAF = new DiscoveryCapability("WIFI_PAF", 3, 3);
    public static final DiscoveryCapability NFC = new DiscoveryCapability("NFC", 4, 4);

    private static final /* synthetic */ DiscoveryCapability[] $values() {
        return new DiscoveryCapability[]{SOFT_AP, BLE, ON_NETWORK, WIFI_PAF, NFC};
    }

    static {
        DiscoveryCapability[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private DiscoveryCapability(String str, int i, int i2) {
        this.bitIndex = i2;
    }

    @NotNull
    public static EnumEntries<DiscoveryCapability> getEntries() {
        return $ENTRIES;
    }

    public static DiscoveryCapability valueOf(String str) {
        return (DiscoveryCapability) Enum.valueOf(DiscoveryCapability.class, str);
    }

    public static DiscoveryCapability[] values() {
        return (DiscoveryCapability[]) $VALUES.clone();
    }

    public final int getBitIndex() {
        return this.bitIndex;
    }
}
