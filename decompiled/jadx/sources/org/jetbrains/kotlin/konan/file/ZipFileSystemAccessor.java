package org.jetbrains.kotlin.konan.file;

import androidx.exifinterface.media.ExifInterface;
import java.nio.file.FileSystem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\u00030\u0007H&¢\u0006\u0002\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lorg/jetbrains/kotlin/konan/file/ZipFileSystemAccessor;", "", "withZipFileSystem", ExifInterface.GPS_DIRECTION_TRUE, "zipFile", "Lorg/jetbrains/kotlin/konan/file/File;", "action", "Lkotlin/Function1;", "Ljava/nio/file/FileSystem;", "(Lorg/jetbrains/kotlin/konan/file/File;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-util-io"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface ZipFileSystemAccessor {
    <T> T withZipFileSystem(@NotNull File zipFile, @NotNull Function1<? super FileSystem, ? extends T> action);
}
