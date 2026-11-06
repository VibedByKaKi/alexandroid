package org.jetbrains.kotlin.library.impl;

import java.nio.file.FileSystem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.library.IrKotlinLibraryLayout;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/jetbrains/kotlin/library/impl/FromZipIrLibraryImpl;", "Lorg/jetbrains/kotlin/library/impl/FromZipBaseLibraryImpl;", "Lorg/jetbrains/kotlin/library/IrKotlinLibraryLayout;", "zipped", "Lorg/jetbrains/kotlin/library/impl/IrLibraryLayoutImpl;", "zipFileSystem", "Ljava/nio/file/FileSystem;", "(Lorg/jetbrains/kotlin/library/impl/IrLibraryLayoutImpl;Ljava/nio/file/FileSystem;)V", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class FromZipIrLibraryImpl extends FromZipBaseLibraryImpl implements IrKotlinLibraryLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FromZipIrLibraryImpl(@NotNull IrLibraryLayoutImpl irLibraryLayoutImpl, @NotNull FileSystem fileSystem) {
        super(irLibraryLayoutImpl, fileSystem);
        irLibraryLayoutImpl.getClass();
        fileSystem.getClass();
    }
}
