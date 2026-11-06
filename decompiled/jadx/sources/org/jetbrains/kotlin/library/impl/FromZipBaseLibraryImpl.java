package org.jetbrains.kotlin.library.impl;

import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import java.nio.file.FileSystem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.konan.file.File;
import org.jetbrains.kotlin.konan.file.ZipUtilKt;
import org.jetbrains.kotlin.library.KotlinLibraryLayout;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"Lorg/jetbrains/kotlin/library/impl/FromZipBaseLibraryImpl;", "Lorg/jetbrains/kotlin/library/KotlinLibraryLayout;", "zipped", "Lorg/jetbrains/kotlin/library/impl/KotlinLibraryLayoutImpl;", "zipFileSystem", "Ljava/nio/file/FileSystem;", "(Lorg/jetbrains/kotlin/library/impl/KotlinLibraryLayoutImpl;Ljava/nio/file/FileSystem;)V", JsonFields.COMPONENT, "", "getComponent", "()Ljava/lang/String;", "libFile", "Lorg/jetbrains/kotlin/konan/file/File;", "getLibFile", "()Lorg/jetbrains/kotlin/konan/file/File;", "libraryName", "getLibraryName", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public class FromZipBaseLibraryImpl implements KotlinLibraryLayout {

    @Nullable
    private final String component;

    @NotNull
    private final File libFile;

    @NotNull
    private final String libraryName;

    public FromZipBaseLibraryImpl(@NotNull KotlinLibraryLayoutImpl kotlinLibraryLayoutImpl, @NotNull FileSystem fileSystem) {
        kotlinLibraryLayoutImpl.getClass();
        fileSystem.getClass();
        this.libraryName = kotlinLibraryLayoutImpl.getLibraryName();
        this.libFile = ZipUtilKt.file(fileSystem, kotlinLibraryLayoutImpl.getLibFile());
        this.component = kotlinLibraryLayoutImpl.getComponent();
    }

    @Override // org.jetbrains.kotlin.library.KotlinLibraryLayout
    @Nullable
    public String getComponent() {
        return this.component;
    }

    @Override // org.jetbrains.kotlin.library.KotlinLibraryLayout
    @NotNull
    public File getLibFile() {
        return this.libFile;
    }

    @Override // org.jetbrains.kotlin.library.KotlinLibraryLayout
    @NotNull
    public String getLibraryName() {
        return this.libraryName;
    }
}
