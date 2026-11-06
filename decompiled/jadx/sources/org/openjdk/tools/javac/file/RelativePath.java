package org.openjdk.tools.javac.file;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.nio.file.FileSystem;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.openjdk.javax.tools.JavaFileObject;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public abstract class RelativePath implements Comparable<RelativePath> {
    protected final String path;

    public RelativePath(String str) {
        this.path = str;
    }

    public abstract String basename();

    @Override // java.lang.Comparable
    public int compareTo(RelativePath relativePath) {
        return this.path.compareTo(relativePath.path);
    }

    public abstract RelativeDirectory dirname();

    public boolean equals(Object obj) {
        if (obj instanceof RelativePath) {
            return this.path.equals(((RelativePath) obj).path);
        }
        return false;
    }

    public String getPath() {
        return this.path;
    }

    public int hashCode() {
        return this.path.hashCode();
    }

    public Path resolveAgainst(FileSystem fileSystem) throws InvalidPathException {
        return fileSystem.getRootDirectories().iterator().next().resolve(this.path.replace("/", fileSystem.getSeparator()));
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("RelPath["), this.path, MarkdownConstants.RIGHT_BRACKET);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class RelativeFile extends RelativePath {
        public RelativeFile(String str) {
            super(str);
            if (str.endsWith("/")) {
                Single$$ExternalSyntheticBUOutline0.m$3(str);
                throw null;
            }
        }

        public static RelativeFile forClass(CharSequence charSequence, JavaFileObject.Kind kind) {
            return new RelativeFile(charSequence.toString().replace('.', '/') + kind.extension);
        }

        @Override // org.openjdk.tools.javac.file.RelativePath
        public String basename() {
            return this.path.substring(this.path.lastIndexOf(47) + 1);
        }

        @Override // org.openjdk.tools.javac.file.RelativePath, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(RelativePath relativePath) {
            return super.compareTo(relativePath);
        }

        @Override // org.openjdk.tools.javac.file.RelativePath
        public RelativeDirectory dirname() {
            return new RelativeDirectory(this.path.substring(0, this.path.lastIndexOf(47) + 1));
        }

        public ZipEntry getZipEntry(ZipFile zipFile) {
            return zipFile.getEntry(this.path);
        }

        @Override // org.openjdk.tools.javac.file.RelativePath
        public String toString() {
            return a$$ExternalSyntheticOutline0.m(new StringBuilder("RelativeFile["), this.path, MarkdownConstants.RIGHT_BRACKET);
        }

        public RelativeFile(RelativeDirectory relativeDirectory, String str) {
            this(a$$ExternalSyntheticOutline0.m(new StringBuilder(), relativeDirectory.path, str));
        }

        public RelativeFile(RelativeDirectory relativeDirectory, RelativePath relativePath) {
            this(relativeDirectory, relativePath.path);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class RelativeDirectory extends RelativePath {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RelativeDirectory(java.lang.String r3) {
            /*
                r2 = this;
                int r0 = r3.length()
                if (r0 == 0) goto L13
                java.lang.String r0 = "/"
                boolean r1 = r3.endsWith(r0)
                if (r1 == 0) goto Lf
                goto L13
            Lf:
                java.lang.String r3 = r3.concat(r0)
            L13:
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.openjdk.tools.javac.file.RelativePath.RelativeDirectory.<init>(java.lang.String):void");
        }

        public static RelativeDirectory forPackage(CharSequence charSequence) {
            return new RelativeDirectory(charSequence.toString().replace('.', '/'));
        }

        @Override // org.openjdk.tools.javac.file.RelativePath
        public String basename() {
            int length = this.path.length();
            String str = this.path;
            if (length == 0) {
                return str;
            }
            return this.path.substring(str.lastIndexOf(47, length - 2) + 1, length - 1);
        }

        @Override // org.openjdk.tools.javac.file.RelativePath, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(RelativePath relativePath) {
            return super.compareTo(relativePath);
        }

        public boolean contains(RelativePath relativePath) {
            return relativePath.path.length() > this.path.length() && relativePath.path.startsWith(this.path);
        }

        @Override // org.openjdk.tools.javac.file.RelativePath
        public RelativeDirectory dirname() {
            int length = this.path.length();
            if (length == 0) {
                return this;
            }
            return new RelativeDirectory(this.path.substring(0, this.path.lastIndexOf(47, length - 2) + 1));
        }

        @Override // org.openjdk.tools.javac.file.RelativePath
        public String toString() {
            return a$$ExternalSyntheticOutline0.m(new StringBuilder("RelativeDirectory["), this.path, MarkdownConstants.RIGHT_BRACKET);
        }

        public RelativeDirectory(RelativeDirectory relativeDirectory, String str) {
            this(a$$ExternalSyntheticOutline0.m(new StringBuilder(), relativeDirectory.path, str));
        }
    }

    public Path resolveAgainst(Path path) throws InvalidPathException {
        return path.resolve(this.path.replace("/", path.getFileSystem().getSeparator()));
    }
}
