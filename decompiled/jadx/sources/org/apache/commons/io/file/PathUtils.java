package org.apache.commons.io.file;

import com.google.common.io.MoreFiles$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFilePermission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.io.IOExceptionList;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.file.Counters;
import org.apache.commons.lang3.Functions$$ExternalSyntheticLambda11;
import org.apache.commons.text.WordUtils$$ExternalSyntheticLambda2;
import org.openjdk.tools.javac.comp.Check$$ExternalSyntheticLambda1;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class PathUtils {
    public static final CopyOption[] EMPTY_COPY_OPTIONS = new CopyOption[0];
    public static final DeleteOption[] EMPTY_DELETE_OPTION_ARRAY = new DeleteOption[0];
    public static final FileVisitOption[] EMPTY_FILE_VISIT_OPTION_ARRAY = new FileVisitOption[0];
    public static final LinkOption[] EMPTY_LINK_OPTION_ARRAY = new LinkOption[0];
    public static final LinkOption[] NOFOLLOW_LINK_OPTION_ARRAY = {LinkOption.NOFOLLOW_LINKS};
    public static final OpenOption[] EMPTY_OPEN_OPTION_ARRAY = new OpenOption[0];
    public static final Path[] EMPTY_PATH_ARRAY = new Path[0];

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class RelativeSortedPaths {
        final boolean equals;
        final List<Path> relativeFileList1;
        final List<Path> relativeFileList2;

        private RelativeSortedPaths(Path path, Path path2, int i, LinkOption[] linkOptionArr, FileVisitOption[] fileVisitOptionArr) throws IOException {
            List<Path> list;
            List<Path> list2 = null;
            if (path == null && path2 == null) {
                this.equals = true;
            } else {
                if ((path == null) ^ (path2 == null)) {
                    this.equals = false;
                } else {
                    boolean notExists = Files.notExists(path, linkOptionArr);
                    boolean notExists2 = Files.notExists(path2, linkOptionArr);
                    if (notExists || notExists2) {
                        this.equals = notExists && notExists2;
                    } else {
                        AccumulatorPathVisitor accumulate = PathUtils.accumulate(path, i, fileVisitOptionArr);
                        AccumulatorPathVisitor accumulate2 = PathUtils.accumulate(path2, i, fileVisitOptionArr);
                        if (accumulate.getDirList().size() != accumulate2.getDirList().size() || accumulate.getFileList().size() != accumulate2.getFileList().size()) {
                            this.equals = false;
                        } else {
                            if (accumulate.relativizeDirectories(path, true, null).equals(accumulate2.relativizeDirectories(path2, true, null))) {
                                List<Path> relativizeFiles = accumulate.relativizeFiles(path, true, null);
                                List<Path> relativizeFiles2 = accumulate2.relativizeFiles(path2, true, null);
                                this.equals = relativizeFiles.equals(relativizeFiles2);
                                list2 = relativizeFiles;
                                list = relativizeFiles2;
                                this.relativeFileList1 = list2;
                                this.relativeFileList2 = list;
                            }
                            this.equals = false;
                        }
                    }
                }
            }
            list = null;
            this.relativeFileList1 = list2;
            this.relativeFileList2 = list;
        }
    }

    private PathUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AccumulatorPathVisitor accumulate(Path path, int i, FileVisitOption[] fileVisitOptionArr) throws IOException {
        return (AccumulatorPathVisitor) visitFileTree(AccumulatorPathVisitor.withLongCounters(), path, toFileVisitOptionSet(fileVisitOptionArr), i);
    }

    public static Counters.PathCounters cleanDirectory(Path path, DeleteOption... deleteOptionArr) throws IOException {
        return ((CleaningPathVisitor) visitFileTree(new CleaningPathVisitor(Counters.longPathCounters(), deleteOptionArr, new String[0]), path)).getPathCounters();
    }

    public static Counters.PathCounters copyDirectory(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        Path absolutePath = path.toAbsolutePath();
        return ((CopyDirectoryVisitor) visitFileTree(new CopyDirectoryVisitor(Counters.longPathCounters(), absolutePath, path2, copyOptionArr), absolutePath)).getPathCounters();
    }

    public static Path copyFile(URL url, Path path, CopyOption... copyOptionArr) throws IOException {
        InputStream openStream = url.openStream();
        try {
            Files.copy(openStream, path, copyOptionArr);
            if (openStream != null) {
                openStream.close();
            }
            return path;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (openStream != null) {
                    try {
                        openStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static Path copyFileToDirectory(URL url, Path path, CopyOption... copyOptionArr) throws IOException {
        InputStream openStream = url.openStream();
        try {
            Files.copy(openStream, path.resolve(url.getFile()), copyOptionArr);
            if (openStream != null) {
                openStream.close();
            }
            return path;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (openStream != null) {
                    try {
                        openStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static Counters.PathCounters countDirectory(Path path) throws IOException {
        return ((CountingPathVisitor) visitFileTree(new CountingPathVisitor(Counters.longPathCounters()), path)).getPathCounters();
    }

    public static Path createParentDirectories(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        Path parent = path.getParent();
        if (parent == null) {
            return null;
        }
        return Files.createDirectories(parent, fileAttributeArr);
    }

    public static Path current() {
        return Paths.get("", new String[0]);
    }

    public static Counters.PathCounters delete(Path path, DeleteOption... deleteOptionArr) throws IOException {
        return Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS) ? deleteDirectory(path, deleteOptionArr) : deleteFile(path, deleteOptionArr);
    }

    public static Counters.PathCounters deleteDirectory(Path path, DeleteOption... deleteOptionArr) throws IOException {
        return ((DeletingPathVisitor) visitFileTree(new DeletingPathVisitor(Counters.longPathCounters(), NOFOLLOW_LINK_OPTION_ARRAY, deleteOptionArr, new String[0]), path)).getPathCounters();
    }

    public static Counters.PathCounters deleteFile(Path path, LinkOption[] linkOptionArr, DeleteOption... deleteOptionArr) throws NoSuchFileException, IOException {
        if (Files.isDirectory(path, linkOptionArr)) {
            throw new NoSuchFileException(path.toString());
        }
        Counters.PathCounters longPathCounters = Counters.longPathCounters();
        boolean exists = Files.exists(path, linkOptionArr);
        long size = (!exists || Files.isSymbolicLink(path)) ? 0L : Files.size(path);
        if (overrideReadOnly(deleteOptionArr) && exists) {
            setReadOnly(path, false, linkOptionArr);
        }
        if (Files.deleteIfExists(path)) {
            longPathCounters.getFileCounter().increment();
            longPathCounters.getByteCounter().add(size);
        }
        return longPathCounters;
    }

    public static boolean directoryAndFileContentEquals(Path path, Path path2, LinkOption[] linkOptionArr, OpenOption[] openOptionArr, FileVisitOption[] fileVisitOptionArr) throws IOException {
        if (path == null && path2 == null) {
            return true;
        }
        if (path == null || path2 == null) {
            return false;
        }
        if (Files.notExists(path, new LinkOption[0]) && Files.notExists(path2, new LinkOption[0])) {
            return true;
        }
        RelativeSortedPaths relativeSortedPaths = new RelativeSortedPaths(path, path2, Integer.MAX_VALUE, linkOptionArr, fileVisitOptionArr);
        if (!relativeSortedPaths.equals) {
            return false;
        }
        List<Path> list = relativeSortedPaths.relativeFileList1;
        List<Path> list2 = relativeSortedPaths.relativeFileList2;
        for (Path path3 : list) {
            if (Collections.binarySearch(list2, path3) <= -1) {
                Single$$ExternalSyntheticBUOutline0.m$2("Unexpected mismatch.");
                return false;
            }
            if (!fileContentEquals(path.resolve(path3), path2.resolve(path3), linkOptionArr, openOptionArr)) {
                return false;
            }
        }
        return true;
    }

    public static boolean directoryContentEquals(Path path, Path path2, int i, LinkOption[] linkOptionArr, FileVisitOption[] fileVisitOptionArr) throws IOException {
        return new RelativeSortedPaths(path, path2, i, linkOptionArr, fileVisitOptionArr).equals;
    }

    public static boolean fileContentEquals(Path path, Path path2, LinkOption[] linkOptionArr, OpenOption[] openOptionArr) throws IOException {
        if (path == null && path2 == null) {
            return true;
        }
        if (path == null || path2 == null) {
            return false;
        }
        Path normalize = path.normalize();
        Path normalize2 = path2.normalize();
        boolean exists = Files.exists(normalize, linkOptionArr);
        if (exists != Files.exists(normalize2, linkOptionArr)) {
            return false;
        }
        if (!exists) {
            return true;
        }
        if (Files.isDirectory(normalize, linkOptionArr)) {
            MoreFiles$$ExternalSyntheticBUOutline0.m(normalize, "Can't compare directories, only files: ");
            return false;
        }
        if (Files.isDirectory(normalize2, linkOptionArr)) {
            MoreFiles$$ExternalSyntheticBUOutline0.m(normalize2, "Can't compare directories, only files: ");
            return false;
        }
        if (Files.size(normalize) != Files.size(normalize2)) {
            return false;
        }
        if (path.equals(path2)) {
            return true;
        }
        InputStream newInputStream = Files.newInputStream(normalize, openOptionArr);
        try {
            InputStream newInputStream2 = Files.newInputStream(normalize2, openOptionArr);
            try {
                boolean contentEquals = IOUtils.contentEquals(newInputStream, newInputStream2);
                if (newInputStream2 != null) {
                    newInputStream2.close();
                }
                if (newInputStream != null) {
                    newInputStream.close();
                }
                return contentEquals;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (newInputStream != null) {
                    try {
                        newInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static Path[] filter(PathFilter pathFilter, Path... pathArr) {
        Objects.requireNonNull(pathFilter, "filter");
        return pathArr == null ? EMPTY_PATH_ARRAY : (Path[]) ((List) filterPaths(pathFilter, Stream.of((Object[]) pathArr), Collectors.toList())).toArray(EMPTY_PATH_ARRAY);
    }

    private static <R, A> R filterPaths(PathFilter pathFilter, Stream<Path> stream, Collector<? super Path, A, R> collector) {
        Objects.requireNonNull(pathFilter, "filter");
        Objects.requireNonNull(collector, "collector");
        return stream == null ? (R) Stream.empty().collect(collector) : (R) stream.filter(new WordUtils$$ExternalSyntheticLambda2(pathFilter, 20)).collect(collector);
    }

    public static List<AclEntry> getAclEntryList(Path path) throws IOException {
        AclFileAttributeView aclFileAttributeView = (AclFileAttributeView) Files.getFileAttributeView(path, AclFileAttributeView.class, new LinkOption[0]);
        if (aclFileAttributeView == null) {
            return null;
        }
        return aclFileAttributeView.getAcl();
    }

    public static boolean isDirectory(Path path, LinkOption... linkOptionArr) {
        return path != null && Files.isDirectory(path, linkOptionArr);
    }

    public static boolean isEmpty(Path path) throws IOException {
        return Files.isDirectory(path, new LinkOption[0]) ? isEmptyDirectory(path) : isEmptyFile(path);
    }

    public static boolean isEmptyDirectory(Path path) throws IOException {
        DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(path);
        try {
            boolean z = !newDirectoryStream.iterator().hasNext();
            newDirectoryStream.close();
            return z;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (newDirectoryStream != null) {
                    try {
                        newDirectoryStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static boolean isEmptyFile(Path path) throws IOException {
        return Files.size(path) <= 0;
    }

    public static boolean isNewer(Path path, long j, LinkOption... linkOptionArr) throws IOException {
        Objects.requireNonNull(path, "file");
        return !Files.notExists(path, new LinkOption[0]) && Files.getLastModifiedTime(path, linkOptionArr).toMillis() > j;
    }

    public static boolean isRegularFile(Path path, LinkOption... linkOptionArr) {
        return path != null && Files.isRegularFile(path, linkOptionArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$filterPaths$0(PathFilter pathFilter, Path path) {
        if (path != null) {
            try {
                if (pathFilter.accept(path, readBasicFileAttributes(path)) == FileVisitResult.CONTINUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$overrideReadOnly$1(DeleteOption deleteOption) {
        return deleteOption == StandardDeleteOption.OVERRIDE_READ_ONLY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$walk$2(PathFilter pathFilter, boolean z, Path path) {
        return pathFilter.accept(path, z ? readBasicFileAttributesUnchecked(path) : null) == FileVisitResult.CONTINUE;
    }

    public static DirectoryStream<Path> newDirectoryStream(Path path, PathFilter pathFilter) throws IOException {
        return Files.newDirectoryStream(path, new DirectoryStreamFilter(pathFilter));
    }

    private static boolean overrideReadOnly(DeleteOption... deleteOptionArr) {
        if (deleteOptionArr == null) {
            return false;
        }
        return Stream.of((Object[]) deleteOptionArr).anyMatch(new PathUtils$$ExternalSyntheticLambda3(0));
    }

    public static BasicFileAttributes readBasicFileAttributes(Path path) throws IOException {
        return Files.readAttributes(path, BasicFileAttributes.class, new LinkOption[0]);
    }

    public static BasicFileAttributes readBasicFileAttributesUnchecked(Path path) {
        try {
            return readBasicFileAttributes(path);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static List<Path> relativize(Collection<Path> collection, Path path, boolean z, Comparator<? super Path> comparator) {
        Stream<Path> stream = collection.stream();
        path.getClass();
        Stream map = stream.map(new Functions$$ExternalSyntheticLambda11(path, 20));
        if (z) {
            map = comparator == null ? map.sorted() : map.sorted(comparator);
        }
        return (List) map.collect(Collectors.toList());
    }

    public static Path setReadOnly(Path path, boolean z, LinkOption... linkOptionArr) throws IOException {
        ArrayList arrayList = new ArrayList(2);
        DosFileAttributeView dosFileAttributeView = (DosFileAttributeView) Files.getFileAttributeView(path, DosFileAttributeView.class, linkOptionArr);
        if (dosFileAttributeView != null) {
            try {
                dosFileAttributeView.setReadOnly(z);
                return path;
            } catch (IOException e) {
                arrayList.add(e);
            }
        }
        PosixFileAttributeView posixFileAttributeView = (PosixFileAttributeView) Files.getFileAttributeView(path, PosixFileAttributeView.class, linkOptionArr);
        if (posixFileAttributeView != null) {
            Set<PosixFilePermission> permissions = posixFileAttributeView.readAttributes().permissions();
            permissions.remove(PosixFilePermission.OWNER_WRITE);
            permissions.remove(PosixFilePermission.GROUP_WRITE);
            permissions.remove(PosixFilePermission.OTHERS_WRITE);
            try {
                return Files.setPosixFilePermissions(path, permissions);
            } catch (IOException e2) {
                arrayList.add(e2);
            }
        }
        if (arrayList.isEmpty()) {
            throw new IOException(String.format("No DosFileAttributeView or PosixFileAttributeView for '%s' (linkOptions=%s)", path, Arrays.toString(linkOptionArr)));
        }
        throw new IOExceptionList(path.toString(), arrayList);
    }

    public static Set<FileVisitOption> toFileVisitOptionSet(FileVisitOption... fileVisitOptionArr) {
        return fileVisitOptionArr == null ? EnumSet.noneOf(FileVisitOption.class) : (Set) Stream.of((Object[]) fileVisitOptionArr).collect(Collectors.toSet());
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t, String str, String... strArr) throws IOException {
        return (T) visitFileTree(t, Paths.get(str, strArr));
    }

    public static Stream<Path> walk(Path path, PathFilter pathFilter, int i, boolean z, FileVisitOption... fileVisitOptionArr) throws IOException {
        return Files.walk(path, i, fileVisitOptionArr).filter(new Check$$ExternalSyntheticLambda1(pathFilter, z, 1));
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t, Path path, Set<FileVisitOption> set, int i) throws IOException {
        Files.walkFileTree(path, set, i, t);
        return t;
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t, Path path) throws IOException {
        Files.walkFileTree(path, t);
        return t;
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t, URI uri) throws IOException {
        return (T) visitFileTree(t, Paths.get(uri));
    }

    public static boolean directoryContentEquals(Path path, Path path2) throws IOException {
        return directoryContentEquals(path, path2, Integer.MAX_VALUE, EMPTY_LINK_OPTION_ARRAY, EMPTY_FILE_VISIT_OPTION_ARRAY);
    }

    public static Counters.PathCounters delete(Path path) throws IOException {
        return delete(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static Counters.PathCounters cleanDirectory(Path path) throws IOException {
        return cleanDirectory(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static Counters.PathCounters delete(Path path, LinkOption[] linkOptionArr, DeleteOption... deleteOptionArr) throws IOException {
        return Files.isDirectory(path, linkOptionArr) ? deleteDirectory(path, linkOptionArr, deleteOptionArr) : deleteFile(path, linkOptionArr, deleteOptionArr);
    }

    public static Counters.PathCounters deleteDirectory(Path path) throws IOException {
        return deleteDirectory(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static Counters.PathCounters deleteDirectory(Path path, LinkOption[] linkOptionArr, DeleteOption... deleteOptionArr) throws IOException {
        return ((DeletingPathVisitor) visitFileTree(new DeletingPathVisitor(Counters.longPathCounters(), linkOptionArr, deleteOptionArr, new String[0]), path)).getPathCounters();
    }

    public static Path copyFileToDirectory(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        return Files.copy(path, path2.resolve(path.getFileName()), copyOptionArr);
    }

    public static Counters.PathCounters deleteFile(Path path, DeleteOption... deleteOptionArr) throws IOException {
        return deleteFile(path, NOFOLLOW_LINK_OPTION_ARRAY, deleteOptionArr);
    }

    public static Counters.PathCounters deleteFile(Path path) throws IOException {
        return deleteFile(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static boolean directoryAndFileContentEquals(Path path, Path path2) throws IOException {
        return directoryAndFileContentEquals(path, path2, EMPTY_LINK_OPTION_ARRAY, EMPTY_OPEN_OPTION_ARRAY, EMPTY_FILE_VISIT_OPTION_ARRAY);
    }

    public static boolean fileContentEquals(Path path, Path path2) throws IOException {
        return fileContentEquals(path, path2, EMPTY_LINK_OPTION_ARRAY, EMPTY_OPEN_OPTION_ARRAY);
    }
}
