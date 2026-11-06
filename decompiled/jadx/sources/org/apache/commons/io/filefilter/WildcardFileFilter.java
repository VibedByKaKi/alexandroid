package org.apache.commons.io.filefilter;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Objects;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOCase;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class WildcardFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = -7426486598995782105L;
    private final IOCase caseSensitivity;
    private final String[] wildcards;

    public WildcardFileFilter(List<String> list, IOCase iOCase) {
        if (list == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The wildcard list must not be null");
            throw null;
        }
        this.wildcards = (String[]) list.toArray(IOFileFilter.EMPTY_STRING_ARRAY);
        this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
    }

    private boolean accept(String str) {
        for (String str2 : this.wildcards) {
            if (FilenameUtils.wildcardMatch(str, str2, this.caseSensitivity)) {
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
        for (int i = 0; i < this.wildcards.length; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(this.wildcards[i]);
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
        return AbstractFileFilter.toFileVisitResult(accept(Objects.toString(path.getFileName(), null)), path);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return accept(file.getName());
    }

    public WildcardFileFilter(List<String> list) {
        this(list, IOCase.SENSITIVE);
    }

    public WildcardFileFilter(String str) {
        this(str, IOCase.SENSITIVE);
    }

    public WildcardFileFilter(String... strArr) {
        this(strArr, IOCase.SENSITIVE);
    }

    public WildcardFileFilter(String str, IOCase iOCase) {
        if (str != null) {
            this.wildcards = new String[]{str};
            this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("The wildcard must not be null");
            throw null;
        }
    }

    public WildcardFileFilter(String[] strArr, IOCase iOCase) {
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            this.wildcards = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The wildcard array must not be null");
        throw null;
    }
}
