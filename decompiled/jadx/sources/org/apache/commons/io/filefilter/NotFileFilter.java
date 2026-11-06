package org.apache.commons.io.filefilter;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class NotFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = 6131563330944994230L;
    private final IOFileFilter filter;

    public NotFileFilter(IOFileFilter iOFileFilter) {
        if (iOFileFilter != null) {
            this.filter = iOFileFilter;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("The filter must not be null");
            throw null;
        }
    }

    private FileVisitResult not(FileVisitResult fileVisitResult) {
        FileVisitResult fileVisitResult2 = FileVisitResult.CONTINUE;
        return fileVisitResult == fileVisitResult2 ? FileVisitResult.TERMINATE : fileVisitResult2;
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return not(this.filter.accept(path, basicFileAttributes));
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public String toString() {
        return "NOT (" + this.filter.toString() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return !this.filter.accept(file, str);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return !this.filter.accept(file);
    }
}
