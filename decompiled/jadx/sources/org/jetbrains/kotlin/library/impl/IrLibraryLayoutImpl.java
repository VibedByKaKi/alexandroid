package org.jetbrains.kotlin.library.impl;

import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import java.nio.file.FileSystem;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.konan.file.File;
import org.jetbrains.kotlin.library.IrKotlinLibraryLayout;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001b\u0010\b\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lorg/jetbrains/kotlin/library/impl/IrLibraryLayoutImpl;", "Lorg/jetbrains/kotlin/library/impl/KotlinLibraryLayoutImpl;", "Lorg/jetbrains/kotlin/library/IrKotlinLibraryLayout;", "klib", "Lorg/jetbrains/kotlin/konan/file/File;", JsonFields.COMPONENT, "", "(Lorg/jetbrains/kotlin/konan/file/File;Ljava/lang/String;)V", "extractingToTemp", "getExtractingToTemp", "()Lorg/jetbrains/kotlin/library/IrKotlinLibraryLayout;", "extractingToTemp$delegate", "Lkotlin/Lazy;", "directlyFromZip", "zipFileSystem", "Ljava/nio/file/FileSystem;", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class IrLibraryLayoutImpl extends KotlinLibraryLayoutImpl implements IrKotlinLibraryLayout {

    /* renamed from: extractingToTemp$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy extractingToTemp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IrLibraryLayoutImpl(@NotNull File file, @NotNull String str) {
        super(file, str);
        file.getClass();
        str.getClass();
        this.extractingToTemp = LazyKt.lazy(new Function0<ExtractingIrLibraryImpl>() { // from class: org.jetbrains.kotlin.library.impl.IrLibraryLayoutImpl$extractingToTemp$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExtractingIrLibraryImpl invoke() {
                return new ExtractingIrLibraryImpl(IrLibraryLayoutImpl.this);
            }
        });
    }

    @Override // org.jetbrains.kotlin.library.impl.KotlinLibraryLayoutImpl
    @NotNull
    public IrKotlinLibraryLayout directlyFromZip(@NotNull FileSystem zipFileSystem) {
        zipFileSystem.getClass();
        return new FromZipIrLibraryImpl(this, zipFileSystem);
    }

    @Override // org.jetbrains.kotlin.library.impl.KotlinLibraryLayoutImpl
    @NotNull
    public IrKotlinLibraryLayout getExtractingToTemp() {
        return (IrKotlinLibraryLayout) this.extractingToTemp.getValue();
    }
}
