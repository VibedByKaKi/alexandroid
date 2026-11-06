package org.jetbrains.kotlin.konan.file;

import com.amazon.alexa.auth.BuildConfig;
import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.routing.api.RouteParameter;
import com.amazon.deecomms.common.metrics.MetricKeys;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.util.UtilKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0086\b\u0018\u0000 g2\u00020\u0001:\u0001gB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0005\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bB\r\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\u0016\u0010/\u001a\n 0*\u0004\u0018\u00010\u00030\u00032\u0006\u00101\u001a\u000202J\u0014\u00103\u001a\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000506J\u000e\u00107\u001a\u0002042\u0006\u00108\u001a\u00020\u0005J\u000e\u00109\u001a\n 0*\u0004\u0018\u00010:0:J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0005J\u000e\u0010;\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b<J\u0013\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u000e\u0010>\u001a\u0002042\u0006\u0010?\u001a\u00020\u0000J\u000e\u0010@\u001a\u0002042\u0006\u0010A\u001a\u00020\u0005J\u0006\u0010B\u001a\u00020\u0019J\u0006\u0010C\u001a\u00020\u0019J\u0006\u0010D\u001a\u00020\u0000J\u0006\u0010E\u001a\u000204J\u0006\u0010F\u001a\u000204J\u0013\u0010G\u001a\u00020\u00192\b\u0010H\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u001a\u0010I\u001a\u0002042\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002040KJ\b\u0010L\u001a\u00020MH\u0016J$\u0010N\u001a\u00020O2\b\b\u0002\u0010P\u001a\u00020Q2\b\b\u0002\u0010R\u001a\u00020S2\b\b\u0002\u0010T\u001a\u00020SJ\u000e\u0010U\u001a\n 0*\u0004\u0018\u00010\u00030\u0003J\u000e\u0010V\u001a\n 0*\u0004\u0018\u00010W0WJ\u001a\u0010X\u001a\u0002042\u0012\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002040KJ\u001a\u0010Z\u001a\u0002042\u0012\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002040KJ\u0006\u0010[\u001a\u00020\\J\u000e\u0010]\u001a\n 0*\u0004\u0018\u00010202J\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00050_J\u000e\u0010`\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\u0000J\u000e\u0010a\u001a\u00020\u00192\u0006\u0010b\u001a\u00020\u0000J\b\u0010c\u001a\u00020\u0005H\u0016J\u0016\u0010d\u001a\n 0*\u0004\u0018\u00010\u00030\u00032\u0006\u00101\u001a\u000202J\u0014\u0010e\u001a\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000506J\u000e\u0010f\u001a\u0002042\u0006\u00108\u001a\u00020\u0005R\u0011\u0010\u000e\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0016\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u001e\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010 \u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b \u0010\u001bR\u0014\u0010\f\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00000$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00000$8F¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0011\u0010)\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b*\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b+\u0010\u0013R\u0011\u0010,\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b-\u0010\u0010R\u0011\u0010\t\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b.\u0010\u0013¨\u0006h"}, d2 = {"Lorg/jetbrains/kotlin/konan/file/File;", "", RouteParameter.PARENT, "Ljava/nio/file/Path;", MetricKeys.VALUE_IS_CHILD, "", "(Ljava/nio/file/Path;Ljava/lang/String;)V", "(Lorg/jetbrains/kotlin/konan/file/File;Ljava/lang/String;)V", "(Lorg/jetbrains/kotlin/konan/file/File;Lorg/jetbrains/kotlin/konan/file/File;)V", "path", "(Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "javaPath", "(Ljava/nio/file/Path;)V", "absoluteFile", "getAbsoluteFile", "()Lorg/jetbrains/kotlin/konan/file/File;", "absolutePath", "getAbsolutePath", "()Ljava/lang/String;", "canonicalFile", "getCanonicalFile", "canonicalPath", "getCanonicalPath", "exists", "", "getExists", "()Z", "extension", "getExtension", "isAbsolute", "isDirectory", "isFile", "getJavaPath$kotlin_util_io", "()Ljava/nio/file/Path;", "listFiles", "", "getListFiles", "()Ljava/util/List;", "listFilesOrEmpty", "getListFilesOrEmpty", "name", "getName", "getParent", "parentFile", "getParentFile", "getPath", "appendBytes", "kotlin.jvm.PlatformType", "bytes", "", "appendLines", "", "lines", "", "appendText", "text", "bufferedReader", "Ljava/io/BufferedReader;", "component1", "component1$kotlin_util_io", "copy", "copyTo", DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.DESTINATION_QUERY_PARAM_KEY, "createAsSymlink", "target", "createNew", "delete", "deleteOnExit", "deleteOnExitRecursively", "deleteRecursively", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "forEachLine", "action", "Lkotlin/Function1;", "hashCode", "", BuildConfig.FLAVOR_authType, "Ljava/nio/MappedByteBuffer;", "mode", "Ljava/nio/channels/FileChannel$MapMode;", "start", "", "size", "mkdirs", "outputStream", "Ljava/io/OutputStream;", "postorder", "task", "preorder", "printWriter", "Ljava/io/PrintWriter;", "readBytes", "readStrings", "", "renameTo", "startsWith", "another", "toString", "writeBytes", "writeLines", "writeText", "Companion", "kotlin-util-io"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension({"SMAP\nFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 File.kt\norg/jetbrains/kotlin/konan/file/File\n+ 2 File.kt\norg/jetbrains/kotlin/konan/file/FileKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n197#2,3:214\n208#2,2:221\n200#2,7:223\n197#2,13:231\n1549#3:217\n1620#3,3:218\n1#4:230\n*S KotlinDebug\n*F\n+ 1 File.kt\norg/jetbrains/kotlin/konan/file/File\n*L\n54#1:214,3\n54#1:221,2\n54#1:223,7\n141#1:231,13\n54#1:217\n54#1:218,3\n*E\n"})
/* loaded from: classes11.dex */
public final /* data */ class File {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String pathSeparator = java.io.File.pathSeparator;
    private static final String separator = java.io.File.separator;
    private static final char separatorChar = java.io.File.separatorChar;

    @NotNull
    private final Path javaPath;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public File(@org.jetbrains.annotations.NotNull org.jetbrains.kotlin.konan.file.File r1, @org.jetbrains.annotations.NotNull org.jetbrains.kotlin.konan.file.File r2) {
        /*
            r0 = this;
            r1.getClass()
            r2.getClass()
            java.nio.file.Path r1 = r1.javaPath
            java.nio.file.Path r2 = r2.javaPath
            java.nio.file.Path r1 = r1.resolve(r2)
            r1.getClass()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jetbrains.kotlin.konan.file.File.<init>(org.jetbrains.kotlin.konan.file.File, org.jetbrains.kotlin.konan.file.File):void");
    }

    public static /* synthetic */ File copy$default(File file, Path path, int i, Object obj) {
        if ((i & 1) != 0) {
            path = file.javaPath;
        }
        return file.copy(path);
    }

    public static /* synthetic */ MappedByteBuffer map$default(File file, FileChannel.MapMode mapMode, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            mapMode = FileChannel.MapMode.READ_ONLY;
            mapMode.getClass();
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            j2 = -1;
        }
        return file.map(mapMode, j, j2);
    }

    public final Path appendBytes(@NotNull byte[] bytes) {
        bytes.getClass();
        return Files.write(this.javaPath, bytes, StandardOpenOption.APPEND);
    }

    public final void appendLines(@NotNull Iterable<String> lines) {
        lines.getClass();
        Files.write(this.javaPath, lines, StandardOpenOption.APPEND);
    }

    public final void appendText(@NotNull String text) {
        text.getClass();
        appendLines(CollectionsKt.listOf(text));
    }

    public final BufferedReader bufferedReader() {
        return Files.newBufferedReader(this.javaPath);
    }

    @NotNull
    public final File child(@NotNull String name) {
        name.getClass();
        return new File(this, name);
    }

    @NotNull
    /* renamed from: component1$kotlin_util_io, reason: from getter */
    public final Path getJavaPath() {
        return this.javaPath;
    }

    @NotNull
    public final File copy(@NotNull Path javaPath) {
        javaPath.getClass();
        return new File(javaPath);
    }

    public final void copyTo(@NotNull File destination) {
        destination.getClass();
        Files.copy(this.javaPath, destination.javaPath, StandardCopyOption.REPLACE_EXISTING);
    }

    public final void createAsSymlink(@NotNull String target) {
        target.getClass();
        Path path = Paths.get(target, new String[0]);
        if (Files.isSymbolicLink(this.javaPath) && Intrinsics.areEqual(Files.readSymbolicLink(this.javaPath), path)) {
            return;
        }
        Files.createSymbolicLink(this.javaPath, path, new FileAttribute[0]);
    }

    public final boolean createNew() {
        return this.javaPath.toFile().createNewFile();
    }

    public final boolean delete() {
        return Files.deleteIfExists(this.javaPath);
    }

    @NotNull
    public final File deleteOnExit() {
        this.javaPath.toFile().deleteOnExit();
        return this;
    }

    public final void deleteOnExitRecursively() {
        preorder(new Function1<Path, Unit>() { // from class: org.jetbrains.kotlin.konan.file.File$deleteOnExitRecursively$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Path path) {
                path.getClass();
                new File(path).deleteOnExit();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Path path) {
                invoke2(path);
                return Unit.INSTANCE;
            }
        });
    }

    public final void deleteRecursively() {
        postorder(new Function1<Path, Unit>() { // from class: org.jetbrains.kotlin.konan.file.File$deleteRecursively$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Path path) {
                invoke2(path);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Path path) {
                path.getClass();
                Files.delete(path);
            }
        });
    }

    public boolean equals(@Nullable Object other) {
        File file = other instanceof File ? (File) other : null;
        if (file == null) {
            return false;
        }
        return Intrinsics.areEqual(file.javaPath.toAbsolutePath(), this.javaPath.toAbsolutePath());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void forEachLine(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r7) {
        /*
            r6 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            r7.getClass()
            java.nio.file.Path r6 = r6.javaPath
            java.util.stream.Stream r6 = java.nio.file.Files.lines(r6)
            r1 = 1
            r3 = 1
            r4 = 0
            org.jetbrains.kotlin.konan.file.File$forEachLine$1$1 r5 = new org.jetbrains.kotlin.konan.file.File$forEachLine$1$1     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            r5.<init>()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            r6.forEach(r5)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            boolean r7 = r6 instanceof java.lang.AutoCloseable
            if (r7 == 0) goto L21
            r6.close()
            return
        L21:
            boolean r7 = r6 instanceof java.util.concurrent.ExecutorService
            if (r7 == 0) goto L4f
            java.util.concurrent.ExecutorService r6 = (java.util.concurrent.ExecutorService) r6
            java.util.concurrent.ForkJoinPool r7 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r6 != r7) goto L2e
            goto L4e
        L2e:
            boolean r7 = r6.isTerminated()
            if (r7 != 0) goto L4e
            r6.shutdown()
        L37:
            if (r7 != 0) goto L45
            boolean r7 = r6.awaitTermination(r1, r0)     // Catch: java.lang.InterruptedException -> L3e
            goto L37
        L3e:
            if (r4 != 0) goto L37
            r6.shutdownNow()
            r4 = r3
            goto L37
        L45:
            if (r4 == 0) goto L4e
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
        L4e:
            return
        L4f:
            boolean r7 = r6 instanceof android.content.res.TypedArray
            if (r7 == 0) goto L59
            android.content.res.TypedArray r6 = (android.content.res.TypedArray) r6
            r6.recycle()
            return
        L59:
            okio.Path$$ExternalSyntheticBUOutline0.m()
            return
        L5d:
            r7 = move-exception
            r5 = r4
            goto L6b
        L60:
            r7 = move-exception
            if (r6 == 0) goto L6a
            org.threeten.bp.DayOfWeek$$ExternalSyntheticOutline0.m(r6)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6a
            goto L6a
        L67:
            r7 = move-exception
            r5 = r3
            goto L6b
        L6a:
            throw r7     // Catch: java.lang.Throwable -> L67
        L6b:
            if (r5 != 0) goto Lb1
            if (r6 == 0) goto Lb1
            boolean r5 = r6 instanceof java.lang.AutoCloseable
            if (r5 != 0) goto Lae
            boolean r5 = r6 instanceof java.util.concurrent.ExecutorService
            if (r5 == 0) goto La0
            java.util.concurrent.ExecutorService r6 = (java.util.concurrent.ExecutorService) r6
            java.util.concurrent.ForkJoinPool r5 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r6 == r5) goto Lb1
            boolean r5 = r6.isTerminated()
            if (r5 != 0) goto Lb1
            r6.shutdown()
        L88:
            if (r5 != 0) goto L96
            boolean r5 = r6.awaitTermination(r1, r0)     // Catch: java.lang.InterruptedException -> L8f
            goto L88
        L8f:
            if (r4 != 0) goto L88
            r6.shutdownNow()
            r4 = r3
            goto L88
        L96:
            if (r4 == 0) goto Lb1
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
            goto Lb1
        La0:
            boolean r0 = r6 instanceof android.content.res.TypedArray
            if (r0 != 0) goto La8
            okio.Path$$ExternalSyntheticBUOutline0.m()
            return
        La8:
            android.content.res.TypedArray r6 = (android.content.res.TypedArray) r6
            r6.recycle()
            goto Lb1
        Lae:
            r6.close()
        Lb1:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jetbrains.kotlin.konan.file.File.forEachLine(kotlin.jvm.functions.Function1):void");
    }

    @NotNull
    public final File getAbsoluteFile() {
        return new File(getAbsolutePath());
    }

    @NotNull
    public final String getAbsolutePath() {
        return this.javaPath.toAbsolutePath().toString();
    }

    @NotNull
    public final File getCanonicalFile() {
        return new File(getCanonicalPath());
    }

    @NotNull
    public final String getCanonicalPath() {
        String canonicalPath = this.javaPath.toFile().getCanonicalPath();
        canonicalPath.getClass();
        return canonicalPath;
    }

    public final boolean getExists() {
        return Files.exists(this.javaPath, new LinkOption[0]);
    }

    @NotNull
    public final String getExtension() {
        String substringAfterLast;
        substringAfterLast = StringsKt__StringsKt.substringAfterLast(getName(), '.', "");
        return substringAfterLast;
    }

    @NotNull
    public final Path getJavaPath$kotlin_util_io() {
        return this.javaPath;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c7  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<org.jetbrains.kotlin.konan.file.File> getListFiles() {
        /*
            r9 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            java.nio.file.Path r9 = r9.javaPath
            java.nio.file.DirectoryStream r9 = java.nio.file.Files.newDirectoryStream(r9)
            r1 = 1
            r3 = 1
            r4 = 0
            r9.getClass()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L36
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L36
            r6 = 10
            int r6 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r9, r6)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L36
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L36
            java.util.Iterator r6 = r9.iterator()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L36
        L1e:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L36
            if (r7 == 0) goto L38
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L36
            java.nio.file.Path r7 = (java.nio.file.Path) r7     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L36
            org.jetbrains.kotlin.konan.file.File r8 = new org.jetbrains.kotlin.konan.file.File     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L36
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L36
            r5.add(r8)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L36
            goto L1e
        L33:
            r5 = move-exception
            r6 = r4
            goto L87
        L36:
            r5 = move-exception
            goto L7d
        L38:
            boolean r6 = r9 instanceof java.lang.AutoCloseable
            if (r6 == 0) goto L40
            r9.close()
            return r5
        L40:
            boolean r6 = r9 instanceof java.util.concurrent.ExecutorService
            if (r6 == 0) goto L6e
            java.util.concurrent.ExecutorService r9 = (java.util.concurrent.ExecutorService) r9
            java.util.concurrent.ForkJoinPool r6 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r9 != r6) goto L4d
            goto L6d
        L4d:
            boolean r6 = r9.isTerminated()
            if (r6 != 0) goto L6d
            r9.shutdown()
        L56:
            if (r6 != 0) goto L64
            boolean r6 = r9.awaitTermination(r1, r0)     // Catch: java.lang.InterruptedException -> L5d
            goto L56
        L5d:
            if (r4 != 0) goto L56
            r9.shutdownNow()
            r4 = r3
            goto L56
        L64:
            if (r4 == 0) goto L6d
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            r9.interrupt()
        L6d:
            return r5
        L6e:
            boolean r0 = r9 instanceof android.content.res.TypedArray
            if (r0 == 0) goto L78
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r9.recycle()
            return r5
        L78:
            okio.Path$$ExternalSyntheticBUOutline0.m()
            r9 = 0
            return r9
        L7d:
            if (r9 == 0) goto L86
            org.threeten.bp.DayOfWeek$$ExternalSyntheticOutline0.m(r9)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
            goto L86
        L83:
            r5 = move-exception
            r6 = r3
            goto L87
        L86:
            throw r5     // Catch: java.lang.Throwable -> L83
        L87:
            if (r6 != 0) goto Lca
            if (r9 == 0) goto Lca
            boolean r6 = r9 instanceof java.lang.AutoCloseable
            if (r6 != 0) goto Lc7
            boolean r6 = r9 instanceof java.util.concurrent.ExecutorService
            if (r6 == 0) goto Lbc
            java.util.concurrent.ExecutorService r9 = (java.util.concurrent.ExecutorService) r9
            java.util.concurrent.ForkJoinPool r6 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r9 == r6) goto Lca
            boolean r6 = r9.isTerminated()
            if (r6 != 0) goto Lca
            r9.shutdown()
        La4:
            if (r6 != 0) goto Lb2
            boolean r6 = r9.awaitTermination(r1, r0)     // Catch: java.lang.InterruptedException -> Lab
            goto La4
        Lab:
            if (r4 != 0) goto La4
            r9.shutdownNow()
            r4 = r3
            goto La4
        Lb2:
            if (r4 == 0) goto Lca
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            r9.interrupt()
            goto Lca
        Lbc:
            boolean r0 = r9 instanceof android.content.res.TypedArray
            if (r0 != 0) goto Lc1
            goto L78
        Lc1:
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r9.recycle()
            goto Lca
        Lc7:
            r9.close()
        Lca:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jetbrains.kotlin.konan.file.File.getListFiles():java.util.List");
    }

    @NotNull
    public final List<File> getListFilesOrEmpty() {
        return getExists() ? getListFiles() : CollectionsKt.emptyList();
    }

    @NotNull
    public final String getName() {
        String obj = this.javaPath.getFileName().toString();
        String str = separator;
        str.getClass();
        return UtilKt.removeSuffixIfPresent(obj, str);
    }

    @NotNull
    public final String getParent() {
        return this.javaPath.getParent().toString();
    }

    @NotNull
    public final File getParentFile() {
        Path parent = this.javaPath.getParent();
        parent.getClass();
        return new File(parent);
    }

    @NotNull
    public final String getPath() {
        return this.javaPath.toString();
    }

    public int hashCode() {
        return this.javaPath.toAbsolutePath().hashCode();
    }

    public final boolean isAbsolute() {
        return this.javaPath.isAbsolute();
    }

    public final boolean isDirectory() {
        return Files.isDirectory(this.javaPath, new LinkOption[0]);
    }

    public final boolean isFile() {
        return Files.isRegularFile(this.javaPath, new LinkOption[0]);
    }

    @NotNull
    public final MappedByteBuffer map(@NotNull FileChannel.MapMode mode, long start, long size) {
        mode.getClass();
        String path = getPath();
        FileChannel.MapMode mapMode = FileChannel.MapMode.READ_ONLY;
        RandomAccessFile randomAccessFile = new RandomAccessFile(path, Intrinsics.areEqual(mode, mapMode) ? "r" : "rw");
        if (Intrinsics.areEqual(mode, mapMode)) {
            size = randomAccessFile.length();
        }
        FileChannel channel = randomAccessFile.getChannel();
        MappedByteBuffer map = channel.map(mode, start, size);
        channel.close();
        map.getClass();
        return map;
    }

    public final Path mkdirs() {
        return Files.createDirectories(this.javaPath, new FileAttribute[0]);
    }

    public final OutputStream outputStream() {
        return Files.newOutputStream(this.javaPath, new OpenOption[0]);
    }

    public final void postorder(@NotNull final Function1<? super Path, Unit> task) {
        task.getClass();
        if (getExists()) {
            Files.walkFileTree(this.javaPath, new SimpleFileVisitor<Path>() { // from class: org.jetbrains.kotlin.konan.file.File$postorder$1
                @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
                @NotNull
                public FileVisitResult postVisitDirectory(@Nullable Path dir, @Nullable IOException exc) {
                    Function1<Path, Unit> function1 = task;
                    dir.getClass();
                    function1.invoke(dir);
                    return FileVisitResult.CONTINUE;
                }

                @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
                @NotNull
                public FileVisitResult visitFile(@Nullable Path file, @Nullable BasicFileAttributes attrs) {
                    Function1<Path, Unit> function1 = task;
                    file.getClass();
                    function1.invoke(file);
                    return FileVisitResult.CONTINUE;
                }
            });
        }
    }

    public final void preorder(@NotNull final Function1<? super Path, Unit> task) {
        task.getClass();
        if (getExists()) {
            Files.walkFileTree(this.javaPath, new SimpleFileVisitor<Path>() { // from class: org.jetbrains.kotlin.konan.file.File$preorder$1
                @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
                @NotNull
                public FileVisitResult preVisitDirectory(@Nullable Path dir, @Nullable BasicFileAttributes attrs) {
                    Function1<Path, Unit> function1 = task;
                    dir.getClass();
                    function1.invoke(dir);
                    return FileVisitResult.CONTINUE;
                }

                @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
                @NotNull
                public FileVisitResult visitFile(@Nullable Path file, @Nullable BasicFileAttributes attrs) {
                    Function1<Path, Unit> function1 = task;
                    file.getClass();
                    function1.invoke(file);
                    return FileVisitResult.CONTINUE;
                }
            });
        }
    }

    @NotNull
    public final PrintWriter printWriter() {
        java.io.File file = this.javaPath.toFile();
        file.getClass();
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), Charsets.UTF_8), 8192));
    }

    public final byte[] readBytes() {
        return Files.readAllBytes(this.javaPath);
    }

    @NotNull
    public final List<String> readStrings() {
        final ArrayList arrayList = new ArrayList();
        forEachLine(new Function1<String, Unit>() { // from class: org.jetbrains.kotlin.konan.file.File$readStrings$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String str) {
                str.getClass();
                arrayList.add(str);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }
        });
        return arrayList;
    }

    public final boolean renameTo(@NotNull File destination) {
        destination.getClass();
        return this.javaPath.toFile().renameTo(destination.javaPath.toFile());
    }

    public final boolean startsWith(@NotNull File another) {
        another.getClass();
        return this.javaPath.startsWith(another.javaPath);
    }

    @NotNull
    public String toString() {
        return getPath();
    }

    public final Path writeBytes(@NotNull byte[] bytes) {
        bytes.getClass();
        return Files.write(this.javaPath, bytes, new OpenOption[0]);
    }

    public final void writeLines(@NotNull Iterable<String> lines) {
        lines.getClass();
        Files.write(this.javaPath, lines, new OpenOption[0]);
    }

    public final void writeText(@NotNull String text) {
        text.getClass();
        writeLines(CollectionsKt.listOf(text));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u0011\u0010\u0014\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0006¨\u0006\u0016"}, d2 = {"Lorg/jetbrains/kotlin/konan/file/File$Companion;", "", "()V", "javaHome", "Lorg/jetbrains/kotlin/konan/file/File;", "getJavaHome", "()Lorg/jetbrains/kotlin/konan/file/File;", "pathSeparator", "", "kotlin.jvm.PlatformType", "getPathSeparator", "()Ljava/lang/String;", "separator", "getSeparator", "separatorChar", "", "getSeparatorChar", "()C", "userDir", "getUserDir", "userHome", "getUserHome", "kotlin-util-io"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final File getJavaHome() {
            String property = System.getProperty("java.home");
            property.getClass();
            return new File(property);
        }

        public final String getPathSeparator() {
            return File.pathSeparator;
        }

        public final String getSeparator() {
            return File.separator;
        }

        public final char getSeparatorChar() {
            return File.separatorChar;
        }

        @NotNull
        public final File getUserDir() {
            String property = System.getProperty("user.dir");
            property.getClass();
            return new File(property);
        }

        @NotNull
        public final File getUserHome() {
            String property = System.getProperty("user.home");
            property.getClass();
            return new File(property);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public File(@org.jetbrains.annotations.NotNull java.nio.file.Path r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
        /*
            r0 = this;
            r1.getClass()
            r2.getClass()
            java.nio.file.Path r1 = r1.resolve(r2)
            r1.getClass()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jetbrains.kotlin.konan.file.File.<init>(java.nio.file.Path, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public File(@org.jetbrains.annotations.NotNull org.jetbrains.kotlin.konan.file.File r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
        /*
            r0 = this;
            r1.getClass()
            r2.getClass()
            java.nio.file.Path r1 = r1.javaPath
            java.nio.file.Path r1 = r1.resolve(r2)
            r1.getClass()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jetbrains.kotlin.konan.file.File.<init>(org.jetbrains.kotlin.konan.file.File, java.lang.String):void");
    }

    public File(@NotNull Path path) {
        path.getClass();
        this.javaPath = path;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public File(@org.jetbrains.annotations.NotNull java.lang.String r2) {
        /*
            r1 = this;
            r2.getClass()
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.nio.file.Path r2 = java.nio.file.Paths.get(r2, r0)
            r2.getClass()
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jetbrains.kotlin.konan.file.File.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public File(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
        /*
            r0 = this;
            r1.getClass()
            r2.getClass()
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.nio.file.Path r1 = java.nio.file.Paths.get(r1, r2)
            r1.getClass()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jetbrains.kotlin.konan.file.File.<init>(java.lang.String, java.lang.String):void");
    }
}
