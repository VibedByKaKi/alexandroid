package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Objects;
import org.apache.commons.io.FilenameUtils;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes10.dex */
public class WildcardFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = -5037645902506953517L;
    private final String[] wildcards;

    public WildcardFilter(List<String> list) {
        if (list != null) {
            this.wildcards = (String[]) list.toArray(IOFileFilter.EMPTY_STRING_ARRAY);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("The wildcard list must not be null");
            throw null;
        }
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        if (Files.isDirectory(path, new LinkOption[0])) {
            return FileVisitResult.TERMINATE;
        }
        for (String str : this.wildcards) {
            if (FilenameUtils.wildcardMatch(Objects.toString(path.getFileName(), null), str)) {
                return FileVisitResult.CONTINUE;
            }
        }
        return FileVisitResult.TERMINATE;
    }

    public WildcardFilter(String str) {
        if (str != null) {
            this.wildcards = new String[]{str};
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("The wildcard must not be null");
            throw null;
        }
    }

    public WildcardFilter(String... strArr) {
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            this.wildcards = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The wildcard array must not be null");
        throw null;
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        if (file.isDirectory()) {
            return false;
        }
        for (String str : this.wildcards) {
            if (FilenameUtils.wildcardMatch(file.getName(), str)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        if (file != null && new File(file, str).isDirectory()) {
            return false;
        }
        for (String str2 : this.wildcards) {
            if (FilenameUtils.wildcardMatch(str, str2)) {
                return true;
            }
        }
        return false;
    }
}
