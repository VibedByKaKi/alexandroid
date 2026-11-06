package org.openjdk.tools.javac.file;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import org.openjdk.tools.javac.util.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class FSInfo {
    private FileSystemProvider jarFSProvider;

    public FSInfo(Context context) {
        context.put((Class<Class>) FSInfo.class, (Class) this);
    }

    public static FSInfo instance(Context context) {
        FSInfo fSInfo = (FSInfo) context.get(FSInfo.class);
        return fSInfo == null ? new FSInfo() : fSInfo;
    }

    public boolean exists(Path path) {
        return Files.exists(path, new LinkOption[0]);
    }

    public Path getCanonicalFile(Path path) {
        try {
            return path.toRealPath(new LinkOption[0]);
        } catch (IOException unused) {
            return path.toAbsolutePath().normalize();
        }
    }

    public List<Path> getJarClassPath(Path path) throws IOException {
        Path parent = path.getParent();
        JarFile jarFile = new JarFile(path.toFile());
        try {
            Manifest manifest = jarFile.getManifest();
            if (manifest == null) {
                List<Path> list = Collections.EMPTY_LIST;
                jarFile.close();
                return list;
            }
            Attributes mainAttributes = manifest.getMainAttributes();
            if (mainAttributes == null) {
                List<Path> list2 = Collections.EMPTY_LIST;
                jarFile.close();
                return list2;
            }
            String value = mainAttributes.getValue(Attributes.Name.CLASS_PATH);
            if (value == null) {
                List<Path> list3 = Collections.EMPTY_LIST;
                jarFile.close();
                return list3;
            }
            ArrayList arrayList = new ArrayList();
            StringTokenizer stringTokenizer = new StringTokenizer(value);
            while (stringTokenizer.hasMoreTokens()) {
                Path path2 = FileSystems.getDefault().getPath(stringTokenizer.nextToken(), new String[0]);
                if (!path2.isAbsolute() && parent != null) {
                    path2 = parent.resolve(path2).toAbsolutePath();
                }
                arrayList.add(path2);
            }
            jarFile.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    jarFile.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public synchronized FileSystemProvider getJarFSProvider() {
        FileSystemProvider fileSystemProvider = this.jarFSProvider;
        if (fileSystemProvider != null) {
            return fileSystemProvider;
        }
        for (FileSystemProvider fileSystemProvider2 : FileSystemProvider.installedProviders()) {
            if (fileSystemProvider2.getScheme().equals("jar")) {
                this.jarFSProvider = fileSystemProvider2;
                return fileSystemProvider2;
            }
        }
        return null;
    }

    public boolean isDirectory(Path path) {
        return Files.isDirectory(path, new LinkOption[0]);
    }

    public boolean isFile(Path path) {
        return Files.isRegularFile(path, new LinkOption[0]);
    }

    public FSInfo() {
    }
}
