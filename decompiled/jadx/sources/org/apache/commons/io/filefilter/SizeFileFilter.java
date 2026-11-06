package org.apache.commons.io.filefilter;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class SizeFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = 7388077430788600069L;
    private final boolean acceptLarger;
    private final long size;

    public SizeFileFilter(long j, boolean z) {
        if (j < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("The size must be non-negative");
            throw null;
        }
        this.size = j;
        this.acceptLarger = z;
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        try {
            return AbstractFileFilter.toFileVisitResult(accept(Files.size(path)), path);
        } catch (IOException e) {
            return this.handle(e);
        }
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public String toString() {
        String str = this.acceptLarger ? ">=" : "<";
        StringBuilder sb = new StringBuilder();
        AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, super.toString(), MarkdownConstants.LEFT_PARENTHESIS, str);
        return a$$ExternalSyntheticOutline0.m(this.size, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, java.nio.file.FileVisitor
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return AbstractFileFilter.toFileVisitResult(accept(Files.size(path)), path);
    }

    private boolean accept(long j) {
        return this.acceptLarger != ((j > this.size ? 1 : (j == this.size ? 0 : -1)) < 0);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return accept(file.length());
    }

    public SizeFileFilter(long j) {
        this(j, true);
    }
}
