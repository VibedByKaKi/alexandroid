package matter.onboardingpayload;

import com.amazon.alexa.client.metrics.core.AlexaMetricsConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lmatter/onboardingpayload/CommissioningFlow;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", AlexaMetricsConstants.CardMode.STANDARD_MODE, "USER_ACTION_REQUIRED", "CUSTOM", "AlexaMobileAndroidMatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CommissioningFlow {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CommissioningFlow[] $VALUES;
    private final int value;
    public static final CommissioningFlow STANDARD = new CommissioningFlow(AlexaMetricsConstants.CardMode.STANDARD_MODE, 0, 0);
    public static final CommissioningFlow USER_ACTION_REQUIRED = new CommissioningFlow("USER_ACTION_REQUIRED", 1, 1);
    public static final CommissioningFlow CUSTOM = new CommissioningFlow("CUSTOM", 2, 2);

    private static final /* synthetic */ CommissioningFlow[] $values() {
        return new CommissioningFlow[]{STANDARD, USER_ACTION_REQUIRED, CUSTOM};
    }

    static {
        CommissioningFlow[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private CommissioningFlow(String str, int i, int i2) {
        this.value = i2;
    }

    @NotNull
    public static EnumEntries<CommissioningFlow> getEntries() {
        return $ENTRIES;
    }

    public static CommissioningFlow valueOf(String str) {
        return (CommissioningFlow) Enum.valueOf(CommissioningFlow.class, str);
    }

    public static CommissioningFlow[] values() {
        return (CommissioningFlow[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
