package org.jetbrains.kotlin.konan.library;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.konan.file.File;
import org.jetbrains.kotlin.library.KotlinLibraryLayout;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lorg/jetbrains/kotlin/konan/library/BitcodeKotlinLibraryLayout;", "Lorg/jetbrains/kotlin/konan/library/TargetedKotlinLibraryLayout;", "Lorg/jetbrains/kotlin/library/KotlinLibraryLayout;", "kotlinDir", "Lorg/jetbrains/kotlin/konan/file/File;", "getKotlinDir", "()Lorg/jetbrains/kotlin/konan/file/File;", "mainBitcodeFile", "getMainBitcodeFile", "mainBitcodeFileName", "", "getMainBitcodeFileName", "()Ljava/lang/String;", "nativeDir", "getNativeDir", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface BitcodeKotlinLibraryLayout extends TargetedKotlinLibraryLayout, KotlinLibraryLayout {
    @NotNull
    default File getKotlinDir() {
        return new File(getTargetDir(), "kotlin");
    }

    @NotNull
    default File getMainBitcodeFile() {
        return new File(getKotlinDir(), "program.kt.bc");
    }

    @NotNull
    default String getMainBitcodeFileName() {
        return getMainBitcodeFile().getPath();
    }

    @NotNull
    default File getNativeDir() {
        return new File(getTargetDir(), "native");
    }
}
