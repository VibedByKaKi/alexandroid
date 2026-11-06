package org.openjdk.tools.javac.file;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.text.Normalizer;
import java.util.Iterator;
import java.util.Objects;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.lang3.SystemProperties;
import org.openjdk.javax.lang.model.element.Modifier;
import org.openjdk.javax.lang.model.element.NestingKind;
import org.openjdk.javax.tools.FileObject;
import org.openjdk.javax.tools.JavaFileObject;
import org.openjdk.tools.javac.file.RelativePath;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public abstract class PathFileObject implements JavaFileObject {
    private static final FileSystem defaultFileSystem = FileSystems.getDefault();
    private static final boolean isMacOS = System.getProperty(SystemProperties.OS_NAME, "").contains("OS X");
    protected final BaseFileManager fileManager;
    private boolean hasParents;
    protected final Path path;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CannotCreateUriError extends Error {
        private static final long serialVersionUID = 9101708840997613546L;

        public CannotCreateUriError(String str, Throwable th) {
            super(str, th);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DirectoryFileObject extends PathFileObject {
        private final RelativePath relativePath;
        private final Path userPackageRootDir;

        private DirectoryFileObject(BaseFileManager baseFileManager, Path path, Path path2, RelativePath relativePath) {
            super(baseFileManager, path);
            Objects.requireNonNull(path2);
            this.userPackageRootDir = path2;
            this.relativePath = relativePath;
        }

        @Override // org.openjdk.javax.tools.FileObject
        public String getName() {
            return this.relativePath.resolveAgainst(this.userPackageRootDir).toString();
        }

        @Override // org.openjdk.tools.javac.file.PathFileObject
        public PathFileObject getSibling(String str) {
            return new DirectoryFileObject(this.fileManager, this.path.resolveSibling(str), this.userPackageRootDir, new RelativePath.RelativeFile(this.relativePath.dirname(), str));
        }

        @Override // org.openjdk.tools.javac.file.PathFileObject
        public String inferBinaryName(Iterable<? extends Path> iterable) {
            return PathFileObject.toBinaryName(this.relativePath);
        }

        @Override // org.openjdk.tools.javac.file.PathFileObject
        public String toString() {
            StringBuilder sb = new StringBuilder("DirectoryFileObject[");
            sb.append(this.userPackageRootDir);
            sb.append(":");
            return a$$ExternalSyntheticOutline0.m(sb, this.relativePath.path, MarkdownConstants.RIGHT_BRACKET);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class JarFileObject extends PathFileObject {
        private final Path userJarPath;

        private JarFileObject(BaseFileManager baseFileManager, Path path, Path path2) {
            super(baseFileManager, path);
            this.userJarPath = path2;
        }

        private static URI createJarUri(Path path, String str) {
            URI normalize = path.toUri().normalize();
            String str2 = str.startsWith("/") ? MarkdownConstants.EXCLAMATION_MARK : "!/";
            try {
                return new URI("jar:" + normalize + str2 + str);
            } catch (URISyntaxException e) {
                throw new CannotCreateUriError(normalize + str2 + str, e);
            }
        }

        @Override // org.openjdk.javax.tools.FileObject
        public String getName() {
            return this.userJarPath + MarkdownConstants.LEFT_PARENTHESIS + this.path + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        @Override // org.openjdk.tools.javac.file.PathFileObject
        public PathFileObject getSibling(String str) {
            return new JarFileObject(this.fileManager, this.path.resolveSibling(str), this.userJarPath);
        }

        @Override // org.openjdk.tools.javac.file.PathFileObject
        public String inferBinaryName(Iterable<? extends Path> iterable) {
            return PathFileObject.toBinaryName(this.path.getFileSystem().getRootDirectories().iterator().next().relativize(this.path));
        }

        @Override // org.openjdk.tools.javac.file.PathFileObject
        public String toString() {
            return "JarFileObject[" + this.userJarPath + ":" + this.path + MarkdownConstants.RIGHT_BRACKET;
        }

        @Override // org.openjdk.tools.javac.file.PathFileObject, org.openjdk.javax.tools.FileObject
        public URI toUri() {
            return createJarUri(this.userJarPath, this.path.toString());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SimpleFileObject extends PathFileObject {
        private final Path userPath;

        private SimpleFileObject(BaseFileManager baseFileManager, Path path, Path path2) {
            super(baseFileManager, path);
            this.userPath = path2;
        }

        @Override // org.openjdk.javax.tools.FileObject
        public String getName() {
            return this.userPath.toString();
        }

        @Override // org.openjdk.tools.javac.file.PathFileObject
        public PathFileObject getSibling(String str) {
            return new SimpleFileObject(this.fileManager, this.path.resolveSibling(str), this.userPath.resolveSibling(str));
        }

        @Override // org.openjdk.tools.javac.file.PathFileObject
        public String inferBinaryName(Iterable<? extends Path> iterable) {
            Path absolutePath = this.path.toAbsolutePath();
            Iterator<? extends Path> it2 = iterable.iterator();
            while (it2.hasNext()) {
                Path absolutePath2 = it2.next().toAbsolutePath();
                if (absolutePath.startsWith(absolutePath2)) {
                    try {
                        Path relativize = absolutePath2.relativize(absolutePath);
                        if (relativize != null) {
                            return PathFileObject.toBinaryName(relativize);
                        }
                        continue;
                    } catch (IllegalArgumentException unused) {
                        continue;
                    }
                }
            }
            return null;
        }
    }

    public PathFileObject(BaseFileManager baseFileManager, Path path) {
        Objects.requireNonNull(baseFileManager);
        this.fileManager = baseFileManager;
        if (Files.isDirectory(path, new LinkOption[0])) {
            Single$$ExternalSyntheticBUOutline0.m$3("directories not supported");
            throw null;
        }
        this.path = path;
    }

    private void ensureParentDirectoriesExist() throws IOException {
        if (this.hasParents) {
            return;
        }
        Path parent = this.path.getParent();
        if (parent != null && !Files.isDirectory(parent, new LinkOption[0])) {
            try {
                Files.createDirectories(parent, new FileAttribute[0]);
            } catch (IOException e) {
                Buffer$$ExternalSyntheticBUOutline0.m("could not create parent directories", e);
                return;
            }
        }
        this.hasParents = true;
    }

    public static PathFileObject forDirectoryPath(BaseFileManager baseFileManager, Path path, Path path2, RelativePath relativePath) {
        return new DirectoryFileObject(baseFileManager, path, path2, relativePath);
    }

    public static PathFileObject forJRTPath(BaseFileManager baseFileManager, Path path) {
        return new JRTFileObject(baseFileManager, path);
    }

    public static PathFileObject forJarPath(BaseFileManager baseFileManager, Path path, Path path2) {
        return new JarFileObject(baseFileManager, path, path2);
    }

    public static PathFileObject forSimplePath(BaseFileManager baseFileManager, Path path, Path path2) {
        return new SimpleFileObject(baseFileManager, path, path2);
    }

    public static String getSimpleName(FileObject fileObject) {
        String schemeSpecificPart = fileObject.toUri().getSchemeSpecificPart();
        return schemeSpecificPart.substring(schemeSpecificPart.lastIndexOf("/") + 1);
    }

    private static String removeExtension(String str) {
        int lastIndexOf = str.lastIndexOf(".");
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    public static String toBinaryName(Path path) {
        return toBinaryName(path.toString(), path.getFileSystem().getSeparator());
    }

    @Override // org.openjdk.javax.tools.FileObject
    public boolean delete() {
        try {
            Files.delete(this.path);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof PathFileObject) && this.path.equals(((PathFileObject) obj).path);
    }

    @Override // org.openjdk.javax.tools.JavaFileObject
    public Modifier getAccessLevel() {
        return null;
    }

    @Override // org.openjdk.javax.tools.FileObject
    public CharSequence getCharContent(boolean z) throws IOException {
        CharBuffer cachedContent = this.fileManager.getCachedContent(this);
        if (cachedContent != null) {
            return cachedContent;
        }
        InputStream openInputStream = openInputStream();
        try {
            ByteBuffer makeByteBuffer = this.fileManager.makeByteBuffer(openInputStream);
            JavaFileObject useSource = this.fileManager.log.useSource(this);
            try {
                CharBuffer decode = this.fileManager.decode(makeByteBuffer, z);
                this.fileManager.log.useSource(useSource);
                this.fileManager.recycleByteBuffer(makeByteBuffer);
                if (!z) {
                    this.fileManager.cache(this, decode);
                }
                if (openInputStream != null) {
                    openInputStream.close();
                }
                return decode;
            } catch (Throwable th) {
                this.fileManager.log.useSource(useSource);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                if (openInputStream != null) {
                    try {
                        openInputStream.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    @Override // org.openjdk.javax.tools.JavaFileObject
    public JavaFileObject.Kind getKind() {
        return BaseFileManager.getKind(this.path.getFileName().toString());
    }

    @Override // org.openjdk.javax.tools.FileObject
    public long getLastModified() {
        try {
            return Files.getLastModifiedTime(this.path, new LinkOption[0]).toMillis();
        } catch (IOException unused) {
            return 0L;
        }
    }

    @Override // org.openjdk.javax.tools.JavaFileObject
    public NestingKind getNestingKind() {
        return null;
    }

    public Path getPath() {
        return this.path;
    }

    public String getShortName() {
        return this.path.getFileName().toString();
    }

    public abstract PathFileObject getSibling(String str);

    public int hashCode() {
        return this.path.hashCode();
    }

    public abstract String inferBinaryName(Iterable<? extends Path> iterable);

    @Override // org.openjdk.javax.tools.JavaFileObject
    public boolean isNameCompatible(String str, JavaFileObject.Kind kind) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(kind);
        if (kind == JavaFileObject.Kind.OTHER && getKind() != kind) {
            return false;
        }
        StringBuilder m = BitVector$$ExternalSyntheticOutline0.m(str);
        m.append(kind.extension);
        String sb = m.toString();
        String path = this.path.getFileName().toString();
        if (path.equals(sb)) {
            return true;
        }
        if (this.path.getFileSystem() == defaultFileSystem) {
            if (isMacOS) {
                String path2 = this.path.getFileName().toString();
                if (Normalizer.isNormalized(path2, Normalizer.Form.NFD)) {
                    Normalizer.Form form = Normalizer.Form.NFC;
                    if (Normalizer.isNormalized(sb, form) && Normalizer.normalize(path2, form).equals(sb)) {
                        return true;
                    }
                }
            }
            if (path.equalsIgnoreCase(sb)) {
                try {
                    return this.path.toRealPath(LinkOption.NOFOLLOW_LINKS).getFileName().toString().equals(sb);
                } catch (IOException unused) {
                }
            }
        }
        return false;
    }

    public boolean isSameFile(PathFileObject pathFileObject) {
        return this.path.equals(pathFileObject.path);
    }

    @Override // org.openjdk.javax.tools.FileObject
    public InputStream openInputStream() throws IOException {
        this.fileManager.updateLastUsedTime();
        return Files.newInputStream(this.path, new OpenOption[0]);
    }

    @Override // org.openjdk.javax.tools.FileObject
    public OutputStream openOutputStream() throws IOException {
        this.fileManager.updateLastUsedTime();
        this.fileManager.flushCache(this);
        ensureParentDirectoriesExist();
        return Files.newOutputStream(this.path, new OpenOption[0]);
    }

    @Override // org.openjdk.javax.tools.FileObject
    public Reader openReader(boolean z) throws IOException {
        BaseFileManager baseFileManager = this.fileManager;
        return new InputStreamReader(openInputStream(), baseFileManager.getDecoder(baseFileManager.getEncodingName(), z));
    }

    @Override // org.openjdk.javax.tools.FileObject
    public Writer openWriter() throws IOException {
        this.fileManager.updateLastUsedTime();
        this.fileManager.flushCache(this);
        ensureParentDirectoriesExist();
        return new OutputStreamWriter(Files.newOutputStream(this.path, new OpenOption[0]), this.fileManager.getEncodingName());
    }

    public String toString() {
        return getClass().getSimpleName() + MarkdownConstants.LEFT_BRACKET + this.path + MarkdownConstants.RIGHT_BRACKET;
    }

    @Override // org.openjdk.javax.tools.FileObject
    public URI toUri() {
        return this.path.toUri();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class JRTFileObject extends PathFileObject {
        @Override // org.openjdk.javax.tools.FileObject
        public String getName() {
            return this.path.toString();
        }

        @Override // org.openjdk.tools.javac.file.PathFileObject
        public PathFileObject getSibling(String str) {
            return new JRTFileObject(this.fileManager, this.path.resolveSibling(str));
        }

        @Override // org.openjdk.tools.javac.file.PathFileObject
        public String inferBinaryName(Iterable<? extends Path> iterable) {
            Path path = this.path;
            return PathFileObject.toBinaryName(path.subpath(2, path.getNameCount()));
        }

        @Override // org.openjdk.tools.javac.file.PathFileObject
        public String toString() {
            return "JRTFileObject[" + this.path + MarkdownConstants.RIGHT_BRACKET;
        }

        private JRTFileObject(BaseFileManager baseFileManager, Path path) {
            super(baseFileManager, path);
        }
    }

    public static String toBinaryName(RelativePath relativePath) {
        return toBinaryName(relativePath.path, "/");
    }

    private static String toBinaryName(String str, String str2) {
        return removeExtension(str).replace(str2, ".");
    }
}
