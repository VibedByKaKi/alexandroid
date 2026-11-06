package org.jetbrains.kotlin.konan.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlin/konan/util/CInteropHints;", "", "()V", "fmodulesHint", "", "getFmodulesHint", "()Ljava/lang/String;", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class CInteropHints {

    @NotNull
    public static final CInteropHints INSTANCE = new CInteropHints();

    @NotNull
    private static final String fmodulesHint = "It seems that library is using clang modules. Try adding `-compiler-option -fmodules` to cinterop.\nFor example, in case of cocoapods plugin:\n\npod(\"PodName\") {\n    // Add these lines\n    extraOpts += listOf(\"-compiler-option\", \"-fmodules\")\n}";

    private CInteropHints() {
    }

    @NotNull
    public final String getFmodulesHint() {
        return fmodulesHint;
    }
}
