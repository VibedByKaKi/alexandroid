package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;
import org.apache.commons.io.file.PathVisitor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public abstract class AbstractFileFilter implements IOFileFilter, PathVisitor {
    public static FileVisitResult toFileVisitResult(boolean z, Path path) {
        return z ? FileVisitResult.CONTINUE : FileVisitResult.TERMINATE;
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        Objects.requireNonNull(file, "file");
        return accept(file.getParentFile(), file.getName());
    }

    public FileVisitResult handle(Throwable th) {
        return FileVisitResult.TERMINATE;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    @Override // java.nio.file.FileVisitor
    public FileVisitResult postVisitDirectory(Path path, IOException iOException) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override // java.nio.file.FileVisitor
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return accept(path, basicFileAttributes);
    }

    @Override // java.nio.file.FileVisitor
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return accept(path, basicFileAttributes);
    }

    @Override // java.nio.file.FileVisitor
    public FileVisitResult visitFileFailed(Path path, IOException iOException) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        Objects.requireNonNull(str, "name");
        return accept(new File(file, str));
    }
}
