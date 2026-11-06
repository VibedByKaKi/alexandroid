package org.jetbrains.kotlin.konan.target;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/Family;", "", "exeSuffix", "", "dynamicPrefix", "dynamicSuffix", "staticPrefix", "staticSuffix", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDynamicPrefix", "()Ljava/lang/String;", "getDynamicSuffix", "getExeSuffix", "isAppleFamily", "", "()Z", "getStaticPrefix", "getStaticSuffix", "OSX", "IOS", "TVOS", "WATCHOS", "LINUX", "MINGW", "ANDROID", "WASM", "ZEPHYR", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public enum Family {
    OSX("kexe", "lib", "dylib", "lib", "a"),
    IOS("kexe", "lib", "dylib", "lib", "a"),
    TVOS("kexe", "lib", "dylib", "lib", "a"),
    WATCHOS("kexe", "lib", "dylib", "lib", "a"),
    LINUX("kexe", "lib", "so", "lib", "a"),
    MINGW("exe", "", "dll", "lib", "a"),
    ANDROID("kexe", "lib", "so", "lib", "a"),
    WASM("wasm", "", "wasm", "", "wasm"),
    ZEPHYR("o", "lib", "a", "lib", "a");


    @NotNull
    private final String dynamicPrefix;

    @NotNull
    private final String dynamicSuffix;

    @NotNull
    private final String exeSuffix;

    @NotNull
    private final String staticPrefix;

    @NotNull
    private final String staticSuffix;

    Family(String str, String str2, String str3, String str4, String str5) {
        this.exeSuffix = str;
        this.dynamicPrefix = str2;
        this.dynamicSuffix = str3;
        this.staticPrefix = str4;
        this.staticSuffix = str5;
    }

    @NotNull
    public final String getDynamicPrefix() {
        return this.dynamicPrefix;
    }

    @NotNull
    public final String getDynamicSuffix() {
        return this.dynamicSuffix;
    }

    @NotNull
    public final String getExeSuffix() {
        return this.exeSuffix;
    }

    @NotNull
    public final String getStaticPrefix() {
        return this.staticPrefix;
    }

    @NotNull
    public final String getStaticSuffix() {
        return this.staticSuffix;
    }

    public final boolean isAppleFamily() {
        return this == OSX || this == IOS || this == TVOS || this == WATCHOS;
    }
}
