package dagger.spi.shaded.androidx.room.compiler.processing.javac.kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\f\u0010\n\u001a\u00020\u0004*\u00020\u0004H\u0002J\f\u0010\u000b\u001a\u00020\f*\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/javac/kotlin/JvmAbi;", "", "()V", "GET_PREFIX", "", "IS_PREFIX", "SET_PREFIX", "computeGetterName", "propertyName", "computeSetterName", "capitalizeAsciiOnly", "startsWithIsPrefix", "", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class JvmAbi {

    @NotNull
    private static final String GET_PREFIX = "get";

    @NotNull
    public static final JvmAbi INSTANCE = new JvmAbi();

    @NotNull
    private static final String IS_PREFIX = "is";

    @NotNull
    private static final String SET_PREFIX = "set";

    private JvmAbi() {
    }

    private final String capitalizeAsciiOnly(String str) {
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' > charAt || charAt >= '{') {
            return str;
        }
        return Character.toUpperCase(charAt) + str.substring(1);
    }

    private final boolean startsWithIsPrefix(String str) {
        boolean startsWith$default;
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, IS_PREFIX, false, 2, null);
        if (!startsWith$default || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        return Intrinsics.compare(97, (int) charAt) > 0 || Intrinsics.compare((int) charAt, 122) > 0;
    }

    @NotNull
    public final String computeGetterName(@NotNull String propertyName) {
        propertyName.getClass();
        if (startsWithIsPrefix(propertyName)) {
            return propertyName;
        }
        return "get" + capitalizeAsciiOnly(propertyName);
    }

    @NotNull
    public final String computeSetterName(@NotNull String propertyName) {
        propertyName.getClass();
        StringBuilder sb = new StringBuilder(SET_PREFIX);
        sb.append(startsWithIsPrefix(propertyName) ? propertyName.substring(2) : capitalizeAsciiOnly(propertyName));
        return sb.toString();
    }
}
