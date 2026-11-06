package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class CanExecuteFileFilter extends AbstractFileFilter implements Serializable {
    public static final IOFileFilter CANNOT_EXECUTE;
    public static final IOFileFilter CAN_EXECUTE;
    private static final long serialVersionUID = 3179904805251622989L;

    static {
        CanExecuteFileFilter canExecuteFileFilter = new CanExecuteFileFilter();
        CAN_EXECUTE = canExecuteFileFilter;
        CANNOT_EXECUTE = canExecuteFileFilter.negate();
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return AbstractFileFilter.toFileVisitResult(Files.isExecutable(path), path);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return file.canExecute();
    }
}
