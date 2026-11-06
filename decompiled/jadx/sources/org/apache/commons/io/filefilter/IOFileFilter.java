package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import org.apache.commons.io.file.PathFilter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public interface IOFileFilter extends FileFilter, FilenameFilter, PathFilter {
    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    default FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return AbstractFileFilter.toFileVisitResult(accept(path.toFile()), path);
    }

    @Override // java.io.FileFilter
    boolean accept(File file);

    boolean accept(File file, String str);

    default IOFileFilter and(IOFileFilter iOFileFilter) {
        return new AndFileFilter(this, iOFileFilter);
    }

    default IOFileFilter negate() {
        return new NotFileFilter(this);
    }

    default IOFileFilter or(IOFileFilter iOFileFilter) {
        return new OrFileFilter(this, iOFileFilter);
    }
}
