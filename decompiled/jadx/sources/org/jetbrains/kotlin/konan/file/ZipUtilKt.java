package org.jetbrains.kotlin.konan.file;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import java.nio.file.FileSystem;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.zip.ZipException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\tH\u0002\u001a\u0014\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b*\u00020\u0001H\u0002\u001a&\u0010\r\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\t\u001a&\u0010\r\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t\u001a)\u0010\u0010\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u0011*\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00110\u0013¢\u0006\u0002\u0010\u0014\u001a1\u0010\u0010\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u0011*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\t2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00110\u0013¢\u0006\u0002\u0010\u0016\u001a\u0012\u0010\u0017\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001\u001a\u0016\u0010\u0019\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\tH\u0000¨\u0006\u001a"}, d2 = {"file", "Lorg/jetbrains/kotlin/konan/file/File;", "Ljava/nio/file/FileSystem;", "path", "", "recursiveCopyTo", "", DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.DESTINATION_QUERY_PARAM_KEY, "resetTimeAttributes", "", "toPath", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "unzipTo", "destinationDirectory", "fromSubdirectory", "withZipFileSystem", ExifInterface.GPS_DIRECTION_TRUE, "action", "Lkotlin/Function1;", "(Lorg/jetbrains/kotlin/konan/file/File;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "create", "(Lorg/jetbrains/kotlin/konan/file/File;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "zipDirAs", "unixFile", "zipFileSystem", "kotlin-util-io"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension({"SMAP\nZipUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipUtil.kt\norg/jetbrains/kotlin/konan/file/ZipUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 File.kt\norg/jetbrains/kotlin/konan/file/FileKt\n*L\n1#1,115:1\n766#2:116\n857#2,2:117\n1603#2,9:119\n1855#2:128\n1856#2:130\n1612#2:131\n1#3:129\n197#4,13:132\n*S KotlinDebug\n*F\n+ 1 ZipUtil.kt\norg/jetbrains/kotlin/konan/file/ZipUtilKt\n*L\n25#1:116\n25#1:117,2\n25#1:119,9\n25#1:128\n25#1:130\n25#1:131\n25#1:129\n79#1:132,13\n*E\n"})
/* loaded from: classes11.dex */
public final class ZipUtilKt {
    @NotNull
    public static final File file(@NotNull FileSystem fileSystem, @NotNull File file) {
        fileSystem.getClass();
        file.getClass();
        Path path = fileSystem.getPath(file.getPath(), new String[0]);
        path.getClass();
        return new File(path);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void recursiveCopyTo(File file, final File file2, final boolean z) {
        final Path javaPath$kotlin_util_io = file.getJavaPath$kotlin_util_io();
        final Path javaPath$kotlin_util_io2 = file2.getJavaPath$kotlin_util_io();
        final FileSystem fileSystem = javaPath$kotlin_util_io2.getFileSystem();
        final Path normalize = javaPath$kotlin_util_io2.normalize();
        Files.walk(javaPath$kotlin_util_io, new FileVisitOption[0]).forEach(new Consumer() { // from class: org.jetbrains.kotlin.konan.file.ZipUtilKt$recursiveCopyTo$1
            @Override // java.util.function.Consumer
            public final void accept(Path path) {
                Path relativize = javaPath$kotlin_util_io.relativize(path);
                Path path2 = fileSystem.getPath(javaPath$kotlin_util_io2.toString(), relativize.toString());
                if (!path2.normalize().startsWith(normalize)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(relativize);
                    File file3 = file2;
                    sb.append(" attempted to escape the destination directory ");
                    sb.append(file3);
                    throw new ZipException(sb.toString());
                }
                if (Intrinsics.areEqual(path2, path2.getRoot())) {
                    return;
                }
                if (Files.isDirectory(path2, new LinkOption[0])) {
                    Files.createDirectories(path2, new FileAttribute[0]);
                } else {
                    Files.copy(path, path2, StandardCopyOption.REPLACE_EXISTING);
                }
                if (z) {
                    FileTime fromMillis = FileTime.fromMillis(0L);
                    ((BasicFileAttributeView) Files.getFileAttributeView(path2, BasicFileAttributeView.class, new LinkOption[0])).setTimes(fromMillis, fromMillis, fromMillis);
                }
            }
        });
    }

    public static /* synthetic */ void recursiveCopyTo$default(File file, File file2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        recursiveCopyTo(file, file2, z);
    }

    private static final Path toPath(File file) {
        return Paths.get(file.getPath(), new String[0]);
    }

    public static final void unzipTo(@NotNull Path path, @NotNull Path path2, @NotNull Path path3, boolean z) {
        path.getClass();
        path2.getClass();
        path3.getClass();
        unzipTo(new File(path), new File(path2), new File(path3), z);
    }

    public static /* synthetic */ void unzipTo$default(Path path, Path path2, Path path3, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            path3 = Paths.get("/", new String[0]);
            path3.getClass();
        }
        if ((i & 4) != 0) {
            z = false;
        }
        unzipTo(path, path2, path3, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T withZipFileSystem(@org.jetbrains.annotations.NotNull org.jetbrains.kotlin.konan.file.File r5, boolean r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.nio.file.FileSystem, ? extends T> r7) {
        /*
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            r5.getClass()
            r7.getClass()
            java.nio.file.FileSystem r5 = zipFileSystem(r5, r6)
            r1 = 1
            r6 = 1
            r3 = 0
            java.lang.Object r7 = r7.invoke(r5)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
            if (r5 == 0) goto L51
            boolean r4 = r5 instanceof java.lang.AutoCloseable
            if (r4 == 0) goto L1e
            r5.close()
            return r7
        L1e:
            boolean r4 = r5 instanceof java.util.concurrent.ExecutorService
            if (r4 == 0) goto L4c
            java.util.concurrent.ExecutorService r5 = (java.util.concurrent.ExecutorService) r5
            java.util.concurrent.ForkJoinPool r4 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r5 != r4) goto L2b
            goto L51
        L2b:
            boolean r4 = r5.isTerminated()
            if (r4 != 0) goto L51
            r5.shutdown()
        L34:
            if (r4 != 0) goto L42
            boolean r4 = r5.awaitTermination(r1, r0)     // Catch: java.lang.InterruptedException -> L3b
            goto L34
        L3b:
            if (r3 != 0) goto L34
            r5.shutdownNow()
            r3 = r6
            goto L34
        L42:
            if (r3 == 0) goto L51
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
            goto L51
        L4c:
            okio.Path$$ExternalSyntheticBUOutline0.m()
            r5 = 0
            return r5
        L51:
            return r7
        L52:
            r7 = move-exception
            r4 = r3
            goto L60
        L55:
            r7 = move-exception
            if (r5 == 0) goto L5f
            org.threeten.bp.DayOfWeek$$ExternalSyntheticOutline0.m(r5)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            goto L5f
        L5c:
            r7 = move-exception
            r4 = r6
            goto L60
        L5f:
            throw r7     // Catch: java.lang.Throwable -> L5c
        L60:
            if (r4 != 0) goto L98
            if (r5 == 0) goto L98
            boolean r4 = r5 instanceof java.lang.AutoCloseable
            if (r4 != 0) goto L95
            boolean r4 = r5 instanceof java.util.concurrent.ExecutorService
            if (r4 == 0) goto L4c
            java.util.concurrent.ExecutorService r5 = (java.util.concurrent.ExecutorService) r5
            java.util.concurrent.ForkJoinPool r4 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r5 == r4) goto L98
            boolean r4 = r5.isTerminated()
            if (r4 != 0) goto L98
            r5.shutdown()
        L7d:
            if (r4 != 0) goto L8b
            boolean r4 = r5.awaitTermination(r1, r0)     // Catch: java.lang.InterruptedException -> L84
            goto L7d
        L84:
            if (r3 != 0) goto L7d
            r5.shutdownNow()
            r3 = r6
            goto L7d
        L8b:
            if (r3 == 0) goto L98
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
            goto L98
        L95:
            r5.close()
        L98:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jetbrains.kotlin.konan.file.ZipUtilKt.withZipFileSystem(org.jetbrains.kotlin.konan.file.File, boolean, kotlin.jvm.functions.Function1):java.lang.Object");
    }

    public static final void zipDirAs(@NotNull final File file, @NotNull File file2) {
        file.getClass();
        file2.getClass();
        withZipFileSystem(file2, true, new Function1<FileSystem, Unit>() { // from class: org.jetbrains.kotlin.konan.file.ZipUtilKt$zipDirAs$1
            {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull FileSystem fileSystem) {
                fileSystem.getClass();
                ZipUtilKt.recursiveCopyTo(File.this, ZipUtilKt.file(fileSystem, "/"), true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FileSystem fileSystem) {
                invoke2(fileSystem);
                return Unit.INSTANCE;
            }
        });
    }

    @NotNull
    public static final FileSystem zipFileSystem(@NotNull File file, boolean z) {
        FileSystem fileSystem;
        file.getClass();
        HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("create", String.valueOf(z)));
        List<FileSystemProvider> installedProviders = FileSystemProvider.installedProviders();
        installedProviders.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : installedProviders) {
            if (Intrinsics.areEqual(((FileSystemProvider) obj).getScheme(), "jar")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                fileSystem = ((FileSystemProvider) it2.next()).newFileSystem(toPath(file), hashMapOf);
            } catch (Exception e) {
                if (!(e instanceof UnsupportedOperationException ? true : e instanceof IllegalArgumentException)) {
                    throw e;
                }
                fileSystem = null;
            }
            if (fileSystem != null) {
                arrayList2.add(fileSystem);
            }
        }
        return (FileSystem) CollectionsKt.first((List) arrayList2);
    }

    public static /* synthetic */ FileSystem zipFileSystem$default(File file, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return zipFileSystem(file, z);
    }

    public static /* synthetic */ void unzipTo$default(File file, File file2, File file3, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            file3 = new File("/");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        unzipTo(file, file2, file3, z);
    }

    @NotNull
    public static final File file(@NotNull FileSystem fileSystem, @NotNull String str) {
        fileSystem.getClass();
        str.getClass();
        Path path = fileSystem.getPath(str, new String[0]);
        path.getClass();
        return new File(path);
    }

    public static final void unzipTo(@NotNull File file, @NotNull final File file2, @NotNull final File file3, final boolean z) {
        file.getClass();
        file2.getClass();
        file3.getClass();
        withZipFileSystem(file, new Function1<FileSystem, Unit>() { // from class: org.jetbrains.kotlin.konan.file.ZipUtilKt$unzipTo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull FileSystem fileSystem) {
                fileSystem.getClass();
                ZipUtilKt.recursiveCopyTo(ZipUtilKt.file(fileSystem, File.this), file2, z);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FileSystem fileSystem) {
                invoke2(fileSystem);
                return Unit.INSTANCE;
            }
        });
    }

    public static final <T> T withZipFileSystem(@NotNull File file, @NotNull Function1<? super FileSystem, ? extends T> function1) {
        file.getClass();
        function1.getClass();
        return (T) withZipFileSystem(file, false, function1);
    }
}
