package org.jetbrains.kotlin.konan.file;

import kotlin.Metadata;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, d2 = {"isBitcode", "", "", "(Ljava/lang/String;)Z", "isJavaScript", "isUnixStaticLib", "isWindowsStaticLib", "kotlin-native-utils"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class NativeFileTypeKt {
    public static final boolean isBitcode(@NotNull String str) {
        boolean endsWith$default;
        str.getClass();
        endsWith$default = StringsKt__StringsJVMKt.endsWith$default(str, ".bc", false, 2, null);
        return endsWith$default;
    }

    public static final boolean isJavaScript(@NotNull String str) {
        boolean endsWith$default;
        str.getClass();
        endsWith$default = StringsKt__StringsJVMKt.endsWith$default(str, ".js", false, 2, null);
        return endsWith$default;
    }

    public static final boolean isUnixStaticLib(@NotNull String str) {
        boolean endsWith$default;
        str.getClass();
        endsWith$default = StringsKt__StringsJVMKt.endsWith$default(str, ".a", false, 2, null);
        return endsWith$default;
    }

    public static final boolean isWindowsStaticLib(@NotNull String str) {
        boolean endsWith$default;
        str.getClass();
        endsWith$default = StringsKt__StringsJVMKt.endsWith$default(str, ".lib", false, 2, null);
        return endsWith$default;
    }
}
