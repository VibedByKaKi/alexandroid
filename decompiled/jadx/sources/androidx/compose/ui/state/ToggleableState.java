package androidx.compose.ui.state;

import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/state/ToggleableState;", "", "<init>", "(Ljava/lang/String;I)V", "On", BucketVersioningConfiguration.OFF, "Indeterminate", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ToggleableState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ToggleableState[] $VALUES;
    public static final ToggleableState On = new ToggleableState("On", 0);
    public static final ToggleableState Off = new ToggleableState(BucketVersioningConfiguration.OFF, 1);
    public static final ToggleableState Indeterminate = new ToggleableState("Indeterminate", 2);

    private static final /* synthetic */ ToggleableState[] $values() {
        return new ToggleableState[]{On, Off, Indeterminate};
    }

    static {
        ToggleableState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ToggleableState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ToggleableState> getEntries() {
        return $ENTRIES;
    }

    public static ToggleableState valueOf(String str) {
        return (ToggleableState) Enum.valueOf(ToggleableState.class, str);
    }

    public static ToggleableState[] values() {
        return (ToggleableState[]) $VALUES.clone();
    }
}
