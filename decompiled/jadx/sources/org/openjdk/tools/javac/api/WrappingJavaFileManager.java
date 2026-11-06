package org.openjdk.tools.javac.api;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import org.openjdk.javax.tools.FileObject;
import org.openjdk.javax.tools.ForwardingJavaFileManager;
import org.openjdk.javax.tools.JavaFileManager;
import org.openjdk.javax.tools.JavaFileObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class WrappingJavaFileManager<M extends JavaFileManager> extends ForwardingJavaFileManager<M> {
    public WrappingJavaFileManager(M m) {
        super(m);
    }

    @Override // org.openjdk.javax.tools.ForwardingJavaFileManager, org.openjdk.javax.tools.JavaFileManager
    public FileObject getFileForInput(JavaFileManager.Location location, String str, String str2) throws IOException {
        return wrap(super.getFileForInput(location, str, str2));
    }

    @Override // org.openjdk.javax.tools.ForwardingJavaFileManager, org.openjdk.javax.tools.JavaFileManager
    public FileObject getFileForOutput(JavaFileManager.Location location, String str, String str2, FileObject fileObject) throws IOException {
        return wrap(super.getFileForOutput(location, str, str2, unwrap(fileObject)));
    }

    @Override // org.openjdk.javax.tools.ForwardingJavaFileManager, org.openjdk.javax.tools.JavaFileManager
    public JavaFileObject getJavaFileForInput(JavaFileManager.Location location, String str, JavaFileObject.Kind kind) throws IOException {
        return wrap(super.getJavaFileForInput(location, str, kind));
    }

    @Override // org.openjdk.javax.tools.ForwardingJavaFileManager, org.openjdk.javax.tools.JavaFileManager
    public JavaFileObject getJavaFileForOutput(JavaFileManager.Location location, String str, JavaFileObject.Kind kind, FileObject fileObject) throws IOException {
        return wrap(super.getJavaFileForOutput(location, str, kind, unwrap(fileObject)));
    }

    @Override // org.openjdk.javax.tools.ForwardingJavaFileManager, org.openjdk.javax.tools.JavaFileManager
    public String inferBinaryName(JavaFileManager.Location location, JavaFileObject javaFileObject) {
        return super.inferBinaryName(location, unwrap(javaFileObject));
    }

    @Override // org.openjdk.javax.tools.ForwardingJavaFileManager, org.openjdk.javax.tools.JavaFileManager
    public Iterable<JavaFileObject> list(JavaFileManager.Location location, String str, Set<JavaFileObject.Kind> set, boolean z) throws IOException {
        return wrap(super.list(location, str, set, z));
    }

    public JavaFileObject unwrap(JavaFileObject javaFileObject) {
        return (JavaFileObject) unwrap((FileObject) javaFileObject);
    }

    public Iterable<JavaFileObject> wrap(Iterable<JavaFileObject> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<JavaFileObject> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(wrap(it2.next()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public FileObject unwrap(FileObject fileObject) {
        return fileObject;
    }

    public URI unwrap(URI uri) {
        return uri;
    }

    public JavaFileObject wrap(JavaFileObject javaFileObject) {
        return (JavaFileObject) wrap((FileObject) javaFileObject);
    }

    public FileObject wrap(FileObject fileObject) {
        return fileObject;
    }
}
