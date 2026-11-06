package kotlinx.metadata;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0002\u0010\u0006*\n\u0010\u0007\"\u00020\u00012\u00020\u0001¨\u0006\b"}, d2 = {"flagsOf", "", "Lkotlinx/metadata/Flags;", "flags", "", "Lkotlinx/metadata/Flag;", "([Lkotlinx/metadata/Flag;)I", "Flags", "kotlinx-metadata"}, k = 2, mv = {1, 7, 1}, xi = 48)
@JvmName(name = "FlagsKt")
/* loaded from: classes10.dex */
public final class FlagsKt {
    public static final int flagsOf(@NotNull Flag... flagArr) {
        flagArr.getClass();
        int i = 0;
        for (Flag flag : flagArr) {
            i = flag.plus$kotlinx_metadata(i);
        }
        return i;
    }
}
