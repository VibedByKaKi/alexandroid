package org.jetbrains.kotlin.library.impl;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import java.nio.file.FileSystem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.konan.file.File;
import org.jetbrains.kotlin.konan.file.ZipFileSystemAccessor;
import org.jetbrains.kotlin.konan.file.ZipFileSystemInPlaceAccessor;
import org.jetbrains.kotlin.library.KotlinLibraryLayout;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ%\u0010\u0012\u001a\u0002H\u0013\"\u0004\b\u0001\u0010\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00130\u0015¢\u0006\u0002\u0010\u0016J%\u0010\u0017\u001a\u0002H\u0013\"\u0004\b\u0001\u0010\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00130\u0015¢\u0006\u0002\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lorg/jetbrains/kotlin/library/impl/BaseLibraryAccess;", "L", "Lorg/jetbrains/kotlin/library/KotlinLibraryLayout;", "", "klib", "Lorg/jetbrains/kotlin/konan/file/File;", JsonFields.COMPONENT, "", "zipAccessor", "Lorg/jetbrains/kotlin/konan/file/ZipFileSystemAccessor;", "(Lorg/jetbrains/kotlin/konan/file/File;Ljava/lang/String;Lorg/jetbrains/kotlin/konan/file/ZipFileSystemAccessor;)V", "getKlib", "()Lorg/jetbrains/kotlin/konan/file/File;", "klibZipAccessor", "layout", "Lorg/jetbrains/kotlin/library/impl/KotlinLibraryLayoutImpl;", "getLayout", "()Lorg/jetbrains/kotlin/library/impl/KotlinLibraryLayoutImpl;", "inPlace", ExifInterface.GPS_DIRECTION_TRUE, "action", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "realFiles", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public class BaseLibraryAccess<L extends KotlinLibraryLayout> {

    @NotNull
    private final File klib;

    @NotNull
    private final ZipFileSystemAccessor klibZipAccessor;

    @NotNull
    private final KotlinLibraryLayoutImpl layout;

    public BaseLibraryAccess(@NotNull File file, @Nullable String str, @Nullable ZipFileSystemAccessor zipFileSystemAccessor) {
        file.getClass();
        this.klib = file;
        this.layout = new KotlinLibraryLayoutImpl(file, str);
        this.klibZipAccessor = zipFileSystemAccessor == null ? ZipFileSystemInPlaceAccessor.INSTANCE : zipFileSystemAccessor;
    }

    @NotNull
    public final File getKlib() {
        return this.klib;
    }

    @NotNull
    public KotlinLibraryLayoutImpl getLayout() {
        return this.layout;
    }

    public final <T> T inPlace(@NotNull final Function1<? super L, ? extends T> action) {
        action.getClass();
        if (getLayout().getIsZipped()) {
            return (T) this.klibZipAccessor.withZipFileSystem(getLayout().getKlib(), new Function1<FileSystem, T>() { // from class: org.jetbrains.kotlin.library.impl.BaseLibraryAccess$inPlace$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final T invoke(@NotNull FileSystem fileSystem) {
                    fileSystem.getClass();
                    Function1<L, T> function1 = action;
                    KotlinLibraryLayout directlyFromZip = this.getLayout().directlyFromZip(fileSystem);
                    directlyFromZip.getClass();
                    return function1.invoke(directlyFromZip);
                }
            });
        }
        KotlinLibraryLayoutImpl layout = getLayout();
        layout.getClass();
        return action.invoke(layout);
    }

    public final <T> T realFiles(@NotNull Function1<? super L, ? extends T> action) {
        action.getClass();
        if (getLayout().getIsZipped()) {
            KotlinLibraryLayout extractingToTemp = getLayout().getExtractingToTemp();
            extractingToTemp.getClass();
            return action.invoke(extractingToTemp);
        }
        KotlinLibraryLayoutImpl layout = getLayout();
        layout.getClass();
        return action.invoke(layout);
    }

    public /* synthetic */ BaseLibraryAccess(File file, String str, ZipFileSystemAccessor zipFileSystemAccessor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, str, (i & 4) != 0 ? null : zipFileSystemAccessor);
    }
}
