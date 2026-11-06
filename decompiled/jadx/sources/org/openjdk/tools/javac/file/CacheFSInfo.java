package org.openjdk.tools.javac.file;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.openjdk.tools.javac.util.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class CacheFSInfo extends FSInfo {
    private final Map<Path, Entry> cache = new ConcurrentHashMap();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Entry {
        Path canonicalFile;
        boolean exists;
        boolean isDirectory;
        boolean isFile;
        List<Path> jarClassPath;

        private Entry() {
        }
    }

    private Entry getEntry(Path path) {
        Entry entry = this.cache.get(path);
        if (entry != null) {
            return entry;
        }
        Entry entry2 = new Entry();
        entry2.canonicalFile = super.getCanonicalFile(path);
        entry2.exists = super.exists(path);
        entry2.isDirectory = super.isDirectory(path);
        entry2.isFile = super.isFile(path);
        this.cache.put(path, entry2);
        return entry2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FSInfo lambda$preRegister$0(Context context) {
        CacheFSInfo cacheFSInfo = new CacheFSInfo();
        context.put((Class<Class>) FSInfo.class, (Class) cacheFSInfo);
        return cacheFSInfo;
    }

    public static void preRegister(Context context) {
        context.put(FSInfo.class, (Context.Factory) new CacheFSInfo$$ExternalSyntheticLambda0(0));
    }

    public void clearCache() {
        this.cache.clear();
    }

    @Override // org.openjdk.tools.javac.file.FSInfo
    public boolean exists(Path path) {
        return getEntry(path).exists;
    }

    @Override // org.openjdk.tools.javac.file.FSInfo
    public Path getCanonicalFile(Path path) {
        return getEntry(path).canonicalFile;
    }

    @Override // org.openjdk.tools.javac.file.FSInfo
    public List<Path> getJarClassPath(Path path) throws IOException {
        Entry entry = getEntry(path);
        if (entry.jarClassPath == null) {
            entry.jarClassPath = super.getJarClassPath(path);
        }
        return entry.jarClassPath;
    }

    @Override // org.openjdk.tools.javac.file.FSInfo
    public boolean isDirectory(Path path) {
        return getEntry(path).isDirectory;
    }

    @Override // org.openjdk.tools.javac.file.FSInfo
    public boolean isFile(Path path) {
        return getEntry(path).isFile;
    }
}
