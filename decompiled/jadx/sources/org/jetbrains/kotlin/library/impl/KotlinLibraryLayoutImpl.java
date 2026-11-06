package org.jetbrains.kotlin.library.impl;

import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import java.nio.file.FileSystem;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.konan.file.File;
import org.jetbrains.kotlin.library.KotlinLibraryLayout;
import org.jetbrains.kotlin.library.KotlinLibraryUtilsKt;
import org.jetbrains.kotlin.util.UtilKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\u00018VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\b¨\u0006\u001a"}, d2 = {"Lorg/jetbrains/kotlin/library/impl/KotlinLibraryLayoutImpl;", "Lorg/jetbrains/kotlin/library/KotlinLibraryLayout;", "klib", "Lorg/jetbrains/kotlin/konan/file/File;", JsonFields.COMPONENT, "", "(Lorg/jetbrains/kotlin/konan/file/File;Ljava/lang/String;)V", "getComponent", "()Ljava/lang/String;", "extractingToTemp", "getExtractingToTemp", "()Lorg/jetbrains/kotlin/library/KotlinLibraryLayout;", "extractingToTemp$delegate", "Lkotlin/Lazy;", "isZipped", "", "()Z", "getKlib", "()Lorg/jetbrains/kotlin/konan/file/File;", "libFile", "getLibFile", "libraryName", "getLibraryName", "directlyFromZip", "zipFileSystem", "Ljava/nio/file/FileSystem;", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public class KotlinLibraryLayoutImpl implements KotlinLibraryLayout {

    @Nullable
    private final String component;

    /* renamed from: extractingToTemp$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy extractingToTemp;
    private final boolean isZipped;

    @NotNull
    private final File klib;

    @NotNull
    private final File libFile;

    public KotlinLibraryLayoutImpl(@NotNull File file, @Nullable String str) {
        file.getClass();
        this.klib = file;
        this.component = str;
        boolean isFile = file.isFile();
        this.isZipped = isFile;
        if (isFile) {
            KotlinLibraryLayoutImplKt.zippedKotlinLibraryChecks(file);
        }
        this.libFile = isFile ? new File("/") : file;
        this.extractingToTemp = LazyKt.lazy(new Function0<ExtractingBaseLibraryImpl>() { // from class: org.jetbrains.kotlin.library.impl.KotlinLibraryLayoutImpl$extractingToTemp$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExtractingBaseLibraryImpl invoke() {
                return new ExtractingBaseLibraryImpl(KotlinLibraryLayoutImpl.this);
            }
        });
    }

    @NotNull
    public KotlinLibraryLayout directlyFromZip(@NotNull FileSystem zipFileSystem) {
        zipFileSystem.getClass();
        return new FromZipBaseLibraryImpl(this, zipFileSystem);
    }

    @Override // org.jetbrains.kotlin.library.KotlinLibraryLayout
    @Nullable
    public String getComponent() {
        return this.component;
    }

    @NotNull
    public KotlinLibraryLayout getExtractingToTemp() {
        return (KotlinLibraryLayout) this.extractingToTemp.getValue();
    }

    @NotNull
    public final File getKlib() {
        return this.klib;
    }

    @Override // org.jetbrains.kotlin.library.KotlinLibraryLayout
    @NotNull
    public File getLibFile() {
        return this.libFile;
    }

    @Override // org.jetbrains.kotlin.library.KotlinLibraryLayout
    @NotNull
    public String getLibraryName() {
        return this.isZipped ? UtilKt.removeSuffixIfPresent(this.klib.getPath(), KotlinLibraryUtilsKt.KLIB_FILE_EXTENSION_WITH_DOT) : getLibFile().getPath();
    }

    /* renamed from: isZipped, reason: from getter */
    public final boolean getIsZipped() {
        return this.isZipped;
    }
}
