package org.jetbrains.kotlin.konan.util;

import java.io.File;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.konan.file.ZipUtilKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lorg/jetbrains/kotlin/konan/util/DependencyExtractor;", "", "archiveType", "Lorg/jetbrains/kotlin/konan/util/ArchiveType;", "(Lorg/jetbrains/kotlin/konan/util/ArchiveType;)V", "extract", "", "archive", "Ljava/io/File;", "targetDirectory", "extractTarGz", "tarGz", "Companion", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class DependencyExtractor {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long extractionTimeout = 3600;

    @NotNull
    private static final TimeUnit extractionTimeoutUntis = TimeUnit.SECONDS;

    @NotNull
    private final ArchiveType archiveType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ArchiveType.values().length];
            try {
                iArr[ArchiveType.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ArchiveType.TAR_GZ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DependencyExtractor(@NotNull ArchiveType archiveType) {
        archiveType.getClass();
        this.archiveType = archiveType;
    }

    private final void extractTarGz(File tarGz, File targetDirectory) {
        ProcessBuilder processBuilder = new ProcessBuilder(new String[0]);
        processBuilder.command("tar", "-xzf", tarGz.getCanonicalPath());
        processBuilder.directory(targetDirectory);
        processBuilder.inheritIO();
        Process start = processBuilder.start();
        long j = extractionTimeout;
        TimeUnit timeUnit = extractionTimeoutUntis;
        boolean waitFor = start.waitFor(j, timeUnit);
        if (waitFor && start.exitValue() != 0) {
            throw new RuntimeException("Cannot extract archive with dependency: " + tarGz.getCanonicalPath() + ".\nTar exit code: " + start.exitValue() + '.');
        }
        if (waitFor) {
            return;
        }
        start.destroy();
        throw new RuntimeException("Cannot extract archive with dependency: " + tarGz.getCanonicalPath() + ".\nTar process hasn't finished in " + timeUnit.toSeconds(j) + " sec.");
    }

    public final void extract(@NotNull File archive, @NotNull File targetDirectory) {
        archive.getClass();
        targetDirectory.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[this.archiveType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            extractTarGz(archive, targetDirectory);
        } else {
            Path path = archive.toPath();
            path.getClass();
            Path path2 = targetDirectory.toPath();
            path2.getClass();
            ZipUtilKt.unzipTo$default(path, path2, (Path) null, false, 6, (Object) null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lorg/jetbrains/kotlin/konan/util/DependencyExtractor$Companion;", "", "()V", "extractionTimeout", "", "getExtractionTimeout", "()J", "extractionTimeoutUntis", "Ljava/util/concurrent/TimeUnit;", "getExtractionTimeoutUntis", "()Ljava/util/concurrent/TimeUnit;", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getExtractionTimeout() {
            return DependencyExtractor.extractionTimeout;
        }

        @NotNull
        public final TimeUnit getExtractionTimeoutUntis() {
            return DependencyExtractor.extractionTimeoutUntis;
        }

        private Companion() {
        }
    }
}
