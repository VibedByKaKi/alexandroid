package org.openjdk.javax.tools;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import org.openjdk.javax.tools.JavaFileManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface StandardJavaFileManager extends JavaFileManager {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface PathFactory {
        Path getPath(String str, String... strArr);
    }

    default Path asPath(FileObject fileObject) {
        throw new UnsupportedOperationException();
    }

    Iterable<? extends JavaFileObject> getJavaFileObjects(File... fileArr);

    Iterable<? extends JavaFileObject> getJavaFileObjects(String... strArr);

    default Iterable<? extends JavaFileObject> getJavaFileObjects(Path... pathArr) {
        return getJavaFileObjectsFromPaths(Arrays.asList(pathArr));
    }

    Iterable<? extends JavaFileObject> getJavaFileObjectsFromFiles(Iterable<? extends File> iterable);

    default Iterable<? extends JavaFileObject> getJavaFileObjectsFromPaths(Iterable<? extends Path> iterable) {
        return getJavaFileObjectsFromFiles(FileManagerUtils.asFiles(iterable));
    }

    Iterable<? extends JavaFileObject> getJavaFileObjectsFromStrings(Iterable<String> iterable);

    Iterable<? extends File> getLocation(JavaFileManager.Location location);

    default Iterable<? extends Path> getLocationAsPaths(JavaFileManager.Location location) {
        return FileManagerUtils.asPaths(getLocation(location));
    }

    @Override // org.openjdk.javax.tools.JavaFileManager
    boolean isSameFile(FileObject fileObject, FileObject fileObject2);

    void setLocation(JavaFileManager.Location location, Iterable<? extends File> iterable) throws IOException;

    default void setLocationForModule(JavaFileManager.Location location, String str, Collection<? extends Path> collection) throws IOException {
        throw new UnsupportedOperationException();
    }

    default void setLocationFromPaths(JavaFileManager.Location location, Collection<? extends Path> collection) throws IOException {
        setLocation(location, FileManagerUtils.asFiles(collection));
    }

    default void setPathFactory(PathFactory pathFactory) {
    }
}
