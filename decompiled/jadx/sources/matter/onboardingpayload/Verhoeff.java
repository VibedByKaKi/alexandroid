package matter.onboardingpayload;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005J&\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005¨\u0006\u0010"}, d2 = {"Lmatter/onboardingpayload/Verhoeff;", "", "<init>", "()V", "dihedralMultiply", "", "x", "y", "n", "dihedralInvert", "value", "permute", "permTable", "", "permTableLen", "iterCount", "AlexaMobileAndroidMatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Verhoeff {

    @NotNull
    public static final Verhoeff INSTANCE = new Verhoeff();

    private Verhoeff() {
    }

    public final int dihedralInvert(int value, int n) {
        return (value <= 0 || value >= n) ? value : n - value;
    }

    public final int dihedralMultiply(int x, int y, int n) {
        int i = n * 2;
        int i2 = x % i;
        int i3 = y % i;
        return i2 < n ? i3 < n ? (i2 + i3) % n : (((i3 - n) + i2) % n) + n : i3 < n ? ((((i2 - n) + n) - i3) % n) + n : (((i2 - n) + n) - (i3 - n)) % n;
    }

    public final int permute(int value, @NotNull byte[] permTable, int permTableLen, int iterCount) {
        permTable.getClass();
        int i = value % permTableLen;
        return iterCount == 0 ? i : permute(permTable[i], permTable, permTableLen, iterCount - 1);
    }
}
