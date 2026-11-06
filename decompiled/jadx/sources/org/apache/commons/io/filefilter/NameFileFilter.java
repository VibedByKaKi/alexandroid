package org.apache.commons.io.filefilter;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Objects;
import org.apache.commons.io.IOCase;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class NameFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = 176844364689077340L;
    private final IOCase caseSensitivity;
    private final String[] names;

    public NameFileFilter(List<String> list, IOCase iOCase) {
        if (list == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The list of names must not be null");
            throw null;
        }
        this.names = (String[]) list.toArray(IOFileFilter.EMPTY_STRING_ARRAY);
        this.caseSensitivity = toIOCase(iOCase);
    }

    private boolean acceptBaseName(String str) {
        for (String str2 : this.names) {
            if (this.caseSensitivity.checkEquals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private IOCase toIOCase(IOCase iOCase) {
        return iOCase == null ? IOCase.SENSITIVE : iOCase;
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return AbstractFileFilter.toFileVisitResult(acceptBaseName(Objects.toString(path.getFileName(), null)), path);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(MarkdownConstants.LEFT_PARENTHESIS);
        if (this.names != null) {
            for (int i = 0; i < this.names.length; i++) {
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(this.names[i]);
            }
        }
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return acceptBaseName(str);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return acceptBaseName(file.getName());
    }

    public NameFileFilter(List<String> list) {
        this(list, (IOCase) null);
    }

    public NameFileFilter(String str) {
        this(str, IOCase.SENSITIVE);
    }

    public NameFileFilter(String... strArr) {
        this(strArr, IOCase.SENSITIVE);
    }

    public NameFileFilter(String str, IOCase iOCase) {
        if (str != null) {
            this.names = new String[]{str};
            this.caseSensitivity = toIOCase(iOCase);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("The wildcard must not be null");
            throw null;
        }
    }

    public NameFileFilter(String[] strArr, IOCase iOCase) {
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            this.names = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            this.caseSensitivity = toIOCase(iOCase);
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The array of names must not be null");
        throw null;
    }
}
