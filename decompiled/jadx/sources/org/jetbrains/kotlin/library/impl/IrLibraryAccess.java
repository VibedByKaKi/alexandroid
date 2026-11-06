package org.jetbrains.kotlin.library.impl;

import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.konan.file.File;
import org.jetbrains.kotlin.konan.file.ZipFileSystemAccessor;
import org.jetbrains.kotlin.library.KotlinLibraryLayout;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lorg/jetbrains/kotlin/library/impl/IrLibraryAccess;", "L", "Lorg/jetbrains/kotlin/library/KotlinLibraryLayout;", "Lorg/jetbrains/kotlin/library/impl/BaseLibraryAccess;", "klib", "Lorg/jetbrains/kotlin/konan/file/File;", JsonFields.COMPONENT, "", "zipAccessor", "Lorg/jetbrains/kotlin/konan/file/ZipFileSystemAccessor;", "(Lorg/jetbrains/kotlin/konan/file/File;Ljava/lang/String;Lorg/jetbrains/kotlin/konan/file/ZipFileSystemAccessor;)V", "layout", "Lorg/jetbrains/kotlin/library/impl/IrLibraryLayoutImpl;", "getLayout", "()Lorg/jetbrains/kotlin/library/impl/IrLibraryLayoutImpl;", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class IrLibraryAccess<L extends KotlinLibraryLayout> extends BaseLibraryAccess<L> {

    @NotNull
    private final IrLibraryLayoutImpl layout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IrLibraryAccess(@NotNull File file, @NotNull String str, @Nullable ZipFileSystemAccessor zipFileSystemAccessor) {
        super(file, str, zipFileSystemAccessor);
        file.getClass();
        str.getClass();
        this.layout = new IrLibraryLayoutImpl(file, str);
    }

    @Override // org.jetbrains.kotlin.library.impl.BaseLibraryAccess
    @NotNull
    public IrLibraryLayoutImpl getLayout() {
        return this.layout;
    }

    public /* synthetic */ IrLibraryAccess(File file, String str, ZipFileSystemAccessor zipFileSystemAccessor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, str, (i & 4) != 0 ? null : zipFileSystemAccessor);
    }
}
