package kotlinx.coroutines.reactive;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.selfbargein.SelfBargeInMetrics;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\r\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/reactive/Mode;", "", CmcdData.Factory.STREAMING_FORMAT_SS, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getS", "()Ljava/lang/String;", "FIRST", "FIRST_OR_DEFAULT", SelfBargeInMetrics.EMIT_REASON_LAST, "SINGLE", "SINGLE_OR_DEFAULT", "toString", "kotlinx-coroutines-reactive"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class Mode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Mode[] $VALUES;
    public static final Mode FIRST = new Mode("FIRST", 0, "awaitFirst");
    public static final Mode FIRST_OR_DEFAULT = new Mode("FIRST_OR_DEFAULT", 1, "awaitFirstOrDefault");
    public static final Mode LAST = new Mode(SelfBargeInMetrics.EMIT_REASON_LAST, 2, "awaitLast");
    public static final Mode SINGLE = new Mode("SINGLE", 3, "awaitSingle");
    public static final Mode SINGLE_OR_DEFAULT = new Mode("SINGLE_OR_DEFAULT", 4, "awaitSingleOrDefault");

    @NotNull
    private final String s;

    private static final /* synthetic */ Mode[] $values() {
        return new Mode[]{FIRST, FIRST_OR_DEFAULT, LAST, SINGLE, SINGLE_OR_DEFAULT};
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

    @NotNull
    public final String getS() {
        return this.s;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.s;
    }
}
