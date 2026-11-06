package org.jetbrains.kotlin.konan.library.impl;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.konan.file.File;
import org.jetbrains.kotlin.konan.library.TargetedKotlinLibraryLayout;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lorg/jetbrains/kotlin/konan/library/impl/TargetedWriterImpl;", "", "targetLayout", "Lorg/jetbrains/kotlin/konan/library/TargetedKotlinLibraryLayout;", "(Lorg/jetbrains/kotlin/konan/library/TargetedKotlinLibraryLayout;)V", "getTargetLayout", "()Lorg/jetbrains/kotlin/konan/library/TargetedKotlinLibraryLayout;", "addIncludedBinary", "", "library", "", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public class TargetedWriterImpl {

    @NotNull
    private final TargetedKotlinLibraryLayout targetLayout;

    public TargetedWriterImpl(@NotNull TargetedKotlinLibraryLayout targetedKotlinLibraryLayout) {
        targetedKotlinLibraryLayout.getClass();
        this.targetLayout = targetedKotlinLibraryLayout;
        targetedKotlinLibraryLayout.getTargetDir().mkdirs();
        targetedKotlinLibraryLayout.getIncludedDir().mkdirs();
    }

    public final void addIncludedBinary(@NotNull String library) {
        library.getClass();
        new File(library).copyTo(new File(this.targetLayout.getIncludedDir(), new File(library).getName()));
    }

    @NotNull
    public final TargetedKotlinLibraryLayout getTargetLayout() {
        return this.targetLayout;
    }
}
