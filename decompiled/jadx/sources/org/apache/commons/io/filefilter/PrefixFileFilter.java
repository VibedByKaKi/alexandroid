package org.apache.commons.io.filefilter;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import org.apache.commons.io.IOCase;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class PrefixFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = 8533897440809599867L;
    private final IOCase caseSensitivity;
    private final String[] prefixes;

    public PrefixFileFilter(List<String> list, IOCase iOCase) {
        if (list == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The list of prefixes must not be null");
            throw null;
        }
        this.prefixes = (String[]) list.toArray(IOFileFilter.EMPTY_STRING_ARRAY);
        this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
    }

    private boolean accept(String str) {
        for (String str2 : this.prefixes) {
            if (this.caseSensitivity.checkStartsWith(str, str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(MarkdownConstants.LEFT_PARENTHESIS);
        if (this.prefixes != null) {
            for (int i = 0; i < this.prefixes.length; i++) {
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(this.prefixes[i]);
            }
        }
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return accept(str);
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        Path fileName = path.getFileName();
        return AbstractFileFilter.toFileVisitResult(accept(fileName == null ? null : fileName.toFile()), path);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return accept(file == null ? null : file.getName());
    }

    public PrefixFileFilter(List<String> list) {
        this(list, IOCase.SENSITIVE);
    }

    public PrefixFileFilter(String str) {
        this(str, IOCase.SENSITIVE);
    }

    public PrefixFileFilter(String... strArr) {
        this(strArr, IOCase.SENSITIVE);
    }

    public PrefixFileFilter(String str, IOCase iOCase) {
        if (str != null) {
            this.prefixes = new String[]{str};
            this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("The prefix must not be null");
            throw null;
        }
    }

    public PrefixFileFilter(String[] strArr, IOCase iOCase) {
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            this.prefixes = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The array of prefixes must not be null");
        throw null;
    }
}
