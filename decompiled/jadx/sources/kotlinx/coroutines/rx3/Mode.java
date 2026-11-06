package kotlinx.coroutines.rx3;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.selfbargein.SelfBargeInMetrics;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u0003H\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/rx3/Mode;", "", CmcdData.Factory.STREAMING_FORMAT_SS, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "FIRST", "FIRST_OR_DEFAULT", SelfBargeInMetrics.EMIT_REASON_LAST, "SINGLE", "toString", "kotlinx-coroutines-rx3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class Mode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Mode[] $VALUES;
    public static final Mode FIRST = new Mode("FIRST", 0, "awaitFirst");
    public static final Mode FIRST_OR_DEFAULT = new Mode("FIRST_OR_DEFAULT", 1, "awaitFirstOrDefault");
    public static final Mode LAST = new Mode(SelfBargeInMetrics.EMIT_REASON_LAST, 2, "awaitLast");
    public static final Mode SINGLE = new Mode("SINGLE", 3, "awaitSingle");

    @JvmField
    @NotNull
    public final String s;

    private static final /* synthetic */ Mode[] $values() {
        return new Mode[]{FIRST, FIRST_OR_DEFAULT, LAST, SINGLE};
    }

    static {
        Mode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private Mode(String str, int i, String str2) {
        this.s = str2;
    }

    @NotNull
    public static EnumEntries<Mode> getEntries() {
        return $ENTRIES;
    }

    public static Mode valueOf(String str) {
        return (Mode) Enum.valueOf(Mode.class, str);
    }

    public static Mode[] values() {
        return (Mode[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.s;
    }
}
