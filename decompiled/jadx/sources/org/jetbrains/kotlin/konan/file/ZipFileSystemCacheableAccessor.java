package org.jetbrains.kotlin.konan.file;

import androidx.exifinterface.media.ExifInterface;
import java.nio.file.FileSystem;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ/\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u0002H\u000e0\u0012H\u0016¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0015"}, d2 = {"Lorg/jetbrains/kotlin/konan/file/ZipFileSystemCacheableAccessor;", "Lorg/jetbrains/kotlin/konan/file/ZipFileSystemAccessor;", "cacheLimit", "", "(I)V", "initialCapacity", "loadFactor", "", "openedFileSystems", "org/jetbrains/kotlin/konan/file/ZipFileSystemCacheableAccessor$openedFileSystems$1", "Lorg/jetbrains/kotlin/konan/file/ZipFileSystemCacheableAccessor$openedFileSystems$1;", "reset", "", "withZipFileSystem", ExifInterface.GPS_DIRECTION_TRUE, "zipFile", "Lorg/jetbrains/kotlin/konan/file/File;", "action", "Lkotlin/Function1;", "Ljava/nio/file/FileSystem;", "(Lorg/jetbrains/kotlin/konan/file/File;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-util-io"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension({"SMAP\nZipFileSystemAccessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFileSystemAccessor.kt\norg/jetbrains/kotlin/konan/file/ZipFileSystemCacheableAccessor\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,55:1\n372#2,7:56\n*S KotlinDebug\n*F\n+ 1 ZipFileSystemAccessor.kt\norg/jetbrains/kotlin/konan/file/ZipFileSystemCacheableAccessor\n*L\n35#1:56,7\n*E\n"})
/* loaded from: classes11.dex */
public final class ZipFileSystemCacheableAccessor implements ZipFileSystemAccessor {
    private final int cacheLimit;
    private final int initialCapacity;
    private final float loadFactor = 0.75f;

    @NotNull
    private final ZipFileSystemCacheableAccessor$openedFileSystems$1 openedFileSystems;

    public ZipFileSystemCacheableAccessor(int i) {
        this.cacheLimit = i;
        int i2 = (int) ((i / 0.75f) + 1.0f);
        this.initialCapacity = i2;
        this.openedFileSystems = new ZipFileSystemCacheableAccessor$openedFileSystems$1(this, i2, 0.75f);
    }

    public final void reset() {
        Iterator<FileSystem> it2 = this.openedFileSystems.values().iterator();
        Exception e = null;
        while (it2.hasNext()) {
            try {
                it2.next().close();
            } catch (Exception e2) {
                e = e2;
            }
        }
        this.openedFileSystems.clear();
        if (e != null) {
            throw e;
        }
    }

    @Override // org.jetbrains.kotlin.konan.file.ZipFileSystemAccessor
    public <T> T withZipFileSystem(@NotNull File zipFile, @NotNull Function1<? super FileSystem, ? extends T> action) {
        zipFile.getClass();
        action.getClass();
        ZipFileSystemCacheableAccessor$openedFileSystems$1 zipFileSystemCacheableAccessor$openedFileSystems$1 = this.openedFileSystems;
        FileSystem fileSystem = zipFileSystemCacheableAccessor$openedFileSystems$1.get((Object) zipFile);
        if (fileSystem == null) {
            fileSystem = ZipUtilKt.zipFileSystem$default(zipFile, false, 1, null);
            zipFileSystemCacheableAccessor$openedFileSystems$1.put(zipFile, fileSystem);
        }
        return action.invoke(fileSystem);
    }
}
