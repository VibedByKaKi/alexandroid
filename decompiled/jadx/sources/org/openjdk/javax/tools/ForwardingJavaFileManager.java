package org.openjdk.javax.tools;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.Set;
import org.openjdk.javax.tools.JavaFileManager;
import org.openjdk.javax.tools.JavaFileObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ForwardingJavaFileManager<M extends JavaFileManager> implements JavaFileManager {
    protected final M fileManager;

    public ForwardingJavaFileManager(M m) {
        Objects.requireNonNull(m);
        this.fileManager = m;
    }

    @Override // org.openjdk.javax.tools.JavaFileManager, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.fileManager.close();
    }

    @Override // org.openjdk.javax.tools.JavaFileManager, java.io.Flushable
    public void flush() throws IOException {
        this.fileManager.flush();
    }

    @Override // org.openjdk.javax.tools.JavaFileManager
    public ClassLoader getClassLoader(JavaFileManager.Location location) {
        return this.fileManager.getClassLoader(location);
    }

    @Override // org.openjdk.javax.tools.JavaFileManager
    public FileObject getFileForInput(JavaFileManager.Location location, String str, String str2) throws IOException {
        return this.fileManager.getFileForInput(location, str, str2);
    }

    @Override // org.openjdk.javax.tools.JavaFileManager
    public FileObject getFileForOutput(JavaFileManager.Location location, String str, String str2, FileObject fileObject) throws IOException {
        return this.fileManager.getFileForOutput(location, str, str2, fileObject);
    }

    @Override // org.openjdk.javax.tools.JavaFileManager
    public JavaFileObject getJavaFileForInput(JavaFileManager.Location location, String str, JavaFileObject.Kind kind) throws IOException {
        return this.fileManager.getJavaFileForInput(location, str, kind);
    }

    @Override // org.openjdk.javax.tools.JavaFileManager
    public JavaFileObject getJavaFileForOutput(JavaFileManager.Location location, String str, JavaFileObject.Kind kind, FileObject fileObject) throws IOException {
        return this.fileManager.getJavaFileForOutput(location, str, kind, fileObject);
    }

    @Override // org.openjdk.javax.tools.JavaFileManager
    public JavaFileManager.Location getLocationForModule(JavaFileManager.Location location, String str) throws IOException {
        return this.fileManager.getLocationForModule(location, str);
    }

    @Override // org.openjdk.javax.tools.JavaFileManager
    public <S> ServiceLoader<S> getServiceLoader(JavaFileManager.Location location, Class<S> cls) throws IOException {
        return this.fileManager.getServiceLoader(location, cls);
    }

    @Override // org.openjdk.javax.tools.JavaFileManager
    public boolean handleOption(String str, Iterator<String> it2) {
        return this.fileManager.handleOption(str, it2);
    }

    @Override // org.openjdk.javax.tools.JavaFileManager
    public boolean hasLocation(JavaFileManager.Location location) {
        return this.fileManager.hasLocation(location);
    }

    @Override // org.openjdk.javax.tools.JavaFileManager
    public String inferBinaryName(JavaFileManager.Location location, JavaFileObject javaFileObject) {
        return this.fileManager.inferBinaryName(location, javaFileObject);
    }

    @Override // org.openjdk.javax.tools.JavaFileManager
    public String inferModuleName(JavaFileManager.Location location) throws IOException {
        return this.fileManager.inferModuleName(location);
    }

    @Override // org.openjdk.javax.tools.JavaFileManager
    public boolean isSameFile(FileObject fileObject, FileObject fileObject2) {
        return this.fileManager.isSameFile(fileObject, fileObject2);
    }

    @Override // org.openjdk.javax.tools.OptionChecker
    public int isSupportedOption(String str) {
        return this.fileManager.isSupportedOption(str);
    }

    @Override // org.openjdk.javax.tools.JavaFileManager
    public Iterable<JavaFileObject> list(JavaFileManager.Location location, String str, Set<JavaFileObject.Kind> set, boolean z) throws IOException {
        return this.fileManager.list(location, str, set, z);
    }

    @Override // org.openjdk.javax.tools.JavaFileManager
    public Iterable<Set<JavaFileManager.Location>> listLocationsForModules(JavaFileManager.Location location) throws IOException {
        return this.fileManager.listLocationsForModules(location);
    }

    @Override // org.openjdk.javax.tools.JavaFileManager
    public JavaFileManager.Location getLocationForModule(JavaFileManager.Location location, JavaFileObject javaFileObject) throws IOException {
        return this.fileManager.getLocationForModule(location, javaFileObject);
    }
}
