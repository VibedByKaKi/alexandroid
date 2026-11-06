package kotlin.text;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0005\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0006\u001a\f\u0010\u0007\u001a\u00020\u0002*\u00020\u0001H\u0007\u001a\u0014\u0010\u0007\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0002H\u0007\u001a\u0015\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\tH\u0087\n\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r\u001a\n\u0010\u000f\u001a\u00020\r*\u00020\u0002¨\u0006\u0010"}, d2 = {"digitToInt", "", "", "radix", "digitToIntOrNull", "(C)Ljava/lang/Integer;", "(CI)Ljava/lang/Integer;", "digitToChar", "titlecase", "", "plus", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "equals", "", "ignoreCase", "isSurrogate", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/CharsKt")
@SourceDebugExtension({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,339:1\n1#2:340\n*E\n"})
/* loaded from: classes10.dex */
public class CharsKt__CharKt extends CharsKt__CharJVMKt {
    @SinceKotlin(version = "1.5")
    public static final char digitToChar(int i, int i2) {
        if (2 > i2 || i2 >= 37) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i2, "Invalid radix: ", ". Valid radix values are in range 2..36"));
            return (char) 0;
        }
        if (i >= 0 && i < i2) {
            return i < 10 ? (char) (i + 48) : (char) (((char) (i + 65)) - '\n');
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Digit ", i, " does not represent a valid digit in radix ", i2));
        return (char) 0;
    }

    @SinceKotlin(version = "1.5")
    public static final int digitToInt(char c, int i) {
        Integer digitToIntOrNull = digitToIntOrNull(c, i);
        if (digitToIntOrNull != null) {
            return digitToIntOrNull.intValue();
        }
        throw new IllegalArgumentException("Char " + c + " is not a digit in the given radix=" + i);
    }

    @SinceKotlin(version = "1.5")
    @Nullable
    public static final Integer digitToIntOrNull(char c, int i) {
        CharsKt__CharJVMKt.checkRadix(i);
        Integer valueOf = Integer.valueOf(CharsKt__CharJVMKt.digitOf(c, i));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final boolean equals(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static /* synthetic */ boolean equals$default(char c, char c2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return equals(c, c2, z);
    }

    public static boolean isSurrogate(char c) {
        return 55296 <= c && c < 57344;
    }

    @InlineOnly
    private static final String plus(char c, String str) {
        str.getClass();
        return c + str;
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    public static String titlecase(char c) {
        return _OneToManyTitlecaseMappingsKt.titlecaseImpl(c);
    }

    @SinceKotlin(version = "1.5")
    @Nullable
    public static final Integer digitToIntOrNull(char c) {
        Integer valueOf = Integer.valueOf(CharsKt__CharJVMKt.digitOf(c, 10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    @SinceKotlin(version = "1.5")
    public static int digitToInt(char c) {
        int digitOf = CharsKt__CharJVMKt.digitOf(c, 10);
        if (digitOf >= 0) {
            return digitOf;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(c, "Char ", " is not a decimal digit"));
        return 0;
    }

    @SinceKotlin(version = "1.5")
    public static final char digitToChar(int i) {
        if (i >= 0 && i < 10) {
            return (char) (i + 48);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Int ", " is not a decimal digit"));
        return (char) 0;
    }
}
