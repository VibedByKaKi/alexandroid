package matter.onboardingpayload;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lmatter/onboardingpayload/Verhoeff10;", "", "<init>", "()V", "Companion", "AlexaMobileAndroidMatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Verhoeff10 {
    public static final int Base = 10;
    public static final int PolygonSize = 5;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final int[] sMultiplyTable = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 0, 6, 7, 8, 9, 5, 2, 3, 4, 0, 1, 7, 8, 9, 5, 6, 3, 4, 0, 1, 2, 8, 9, 5, 6, 7, 4, 0, 1, 2, 3, 9, 5, 6, 7, 8, 5, 9, 8, 7, 6, 0, 4, 3, 2, 1, 6, 5, 9, 8, 7, 1, 0, 4, 3, 2, 7, 6, 5, 9, 8, 2, 1, 0, 4, 3, 8, 7, 6, 5, 9, 3, 2, 1, 0, 4, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

    @NotNull
    private static final byte[] sPermTable = {1, 5, 7, 6, 2, 8, 3, 0, 9, 4};

    private Verhoeff10() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0010J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lmatter/onboardingpayload/Verhoeff10$Companion;", "", "<init>", "()V", "Base", "", "PolygonSize", "sMultiplyTable", "", "getSMultiplyTable", "()[I", "sPermTable", "", "getSPermTable", "()[B", "computeCheckChar", "", "str", "", "strLen", "validateCheckChar", "", "checkChar", "charToVal", "ch", "valToChar", "value", "AlexaMobileAndroidMatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final char valToChar(int value) {
            if (value >= 0 && value < 11) {
                return (char) (value + 48);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Input value must be a digit");
            return (char) 0;
        }

        public final int charToVal(char ch) {
            if ('0' <= ch && ch < ':') {
                return ch - '0';
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Input character must be a digit");
            return 0;
        }

        public final char computeCheckChar(@NotNull String str, int strLen) {
            str.getClass();
            int i = 0;
            int i2 = 1;
            if (1 <= strLen) {
                while (true) {
                    i = getSMultiplyTable()[(i * 10) + Verhoeff.INSTANCE.permute(charToVal(str.charAt(strLen - i2)), getSPermTable(), 10, i2)];
                    if (i2 == strLen) {
                        break;
                    }
                    i2++;
                }
            }
            return valToChar(Verhoeff.INSTANCE.dihedralInvert(i, 5));
        }

        @NotNull
        public final int[] getSMultiplyTable() {
            return Verhoeff10.sMultiplyTable;
        }

        @NotNull
        public final byte[] getSPermTable() {
            return Verhoeff10.sPermTable;
        }

        public final boolean validateCheckChar(@NotNull String str, int strLen) {
            str.getClass();
            if (strLen == 0) {
                return false;
            }
            int i = strLen - 1;
            return validateCheckChar(str.charAt(i), str, i);
        }

        private Companion() {
        }

        public final boolean validateCheckChar(char checkChar, @NotNull String str, int strLen) {
            str.getClass();
            return computeCheckChar(str, strLen) == checkChar;
        }

        public final boolean validateCheckChar(@NotNull String str) {
            str.getClass();
            return validateCheckChar(str, str.length());
        }

        public final boolean validateCheckChar(char checkChar, @NotNull String str) {
            str.getClass();
            return validateCheckChar(checkChar, str, str.length());
        }

        public final char computeCheckChar(@NotNull String str) {
            str.getClass();
            return computeCheckChar(str, str.length());
        }
    }
}
