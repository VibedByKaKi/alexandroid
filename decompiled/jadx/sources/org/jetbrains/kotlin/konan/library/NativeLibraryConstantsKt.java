package org.jetbrains.kotlin.konan.library;

import java.io.File;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001\u001a\u0016\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"KLIB_INTEROP_IR_PROVIDER_IDENTIFIER", "", "KONAN_DISTRIBUTION_COMMONIZED_LIBS_DIR", "KONAN_DISTRIBUTION_COMMON_LIBS_DIR", "KONAN_DISTRIBUTION_KLIB_DIR", "KONAN_DISTRIBUTION_PLATFORM_LIBS_DIR", "KONAN_DISTRIBUTION_SOURCES_DIR", "KONAN_PLATFORM_LIBS_NAME_PREFIX", "KONAN_STDLIB_NAME", "konanCommonLibraryPath", "Ljava/io/File;", "libraryName", "konanPlatformLibraryPath", "platform", "kotlin-native-utils"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class NativeLibraryConstantsKt {

    @NotNull
    public static final String KLIB_INTEROP_IR_PROVIDER_IDENTIFIER = "kotlin.native.cinterop";

    @NotNull
    public static final String KONAN_DISTRIBUTION_COMMONIZED_LIBS_DIR = "commonized";

    @NotNull
    public static final String KONAN_DISTRIBUTION_COMMON_LIBS_DIR = "common";

    @NotNull
    public static final String KONAN_DISTRIBUTION_KLIB_DIR = "klib";

    @NotNull
    public static final String KONAN_DISTRIBUTION_PLATFORM_LIBS_DIR = "platform";

    @NotNull
    public static final String KONAN_DISTRIBUTION_SOURCES_DIR = "sources";

    @NotNull
    public static final String KONAN_PLATFORM_LIBS_NAME_PREFIX = "org.jetbrains.kotlin.native.platform.";

    @NotNull
    public static final String KONAN_STDLIB_NAME = "stdlib";

    @NotNull
    public static final File konanCommonLibraryPath(@NotNull String str) {
        str.getClass();
        return FilesKt.resolve(new File("klib", KONAN_DISTRIBUTION_COMMON_LIBS_DIR), str);
    }

    @NotNull
    public static final File konanPlatformLibraryPath(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        return FilesKt.resolve(FilesKt.resolve(new File("klib", "platform"), str2), str);
    }
}
