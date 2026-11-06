package org.openjdk.tools.javac.file;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.ref.SoftReference;
import java.net.URI;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.ProviderNotFoundException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;
import org.openjdk.javax.tools.FileObject;
import org.openjdk.tools.javac.file.RelativePath;
import org.openjdk.tools.javac.util.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class JRTIndex {
    private static JRTIndex sharedInstance;
    private ResourceBundle ctBundle;
    private final FileSystem jrtfs = FileSystems.getFileSystem(URI.create("jrt:/"));
    private final Map<RelativePath.RelativeDirectory, SoftReference<Entry>> entries = new HashMap();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CtSym {
        static final CtSym EMPTY = new CtSym(false, false, null);
        public final boolean hidden;
        public final String minProfile;
        public final boolean proprietary;

        public CtSym(boolean z, boolean z2, String str) {
            this.hidden = z;
            this.proprietary = z2;
            this.minProfile = str;
        }

        public String toString() {
            boolean z;
            StringBuilder sb = new StringBuilder("CtSym[");
            boolean z2 = true;
            if (this.hidden) {
                sb.append("hidden");
                z = true;
            } else {
                z = false;
            }
            if (this.proprietary) {
                if (z) {
                    sb.append(",");
                }
                sb.append("proprietary");
            } else {
                z2 = z;
            }
            if (this.minProfile != null) {
                if (z2) {
                    sb.append(",");
                }
                sb.append(this.minProfile);
            }
            sb.append(MarkdownConstants.RIGHT_BRACKET);
            return sb.toString();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class Entry {
        final CtSym ctSym;
        final Map<String, Path> files;
        final Set<RelativePath.RelativeDirectory> subdirs;

        private Entry(Map<String, Path> map, Set<RelativePath.RelativeDirectory> set, CtSym ctSym) {
            this.files = map;
            this.subdirs = set;
            this.ctSym = ctSym;
        }
    }

    private JRTIndex() throws IOException {
    }

    private CtSym getCtInfo(RelativePath.RelativeDirectory relativeDirectory) {
        if (relativeDirectory.path.isEmpty()) {
            return CtSym.EMPTY;
        }
        if (this.ctBundle == null) {
            this.ctBundle = ResourceBundle.getBundle("org.openjdk.tools.javac.resources.ct");
        }
        try {
            boolean z = false;
            String str = null;
            boolean z2 = false;
            for (String str2 : this.ctBundle.getString(relativeDirectory.path.replace('/', '.') + '*').split(" +", 0)) {
                int hashCode = str2.hashCode();
                if (hashCode != -1217487446) {
                    if (hashCode == -261419329 && str2.equals("proprietary")) {
                        z = true;
                    }
                    str = str2;
                } else {
                    if (str2.equals("hidden")) {
                        z2 = true;
                    }
                    str = str2;
                }
            }
            return new CtSym(z2, z, str);
        } catch (MissingResourceException unused) {
            return CtSym.EMPTY;
        }
    }

    public static synchronized JRTIndex getSharedInstance() {
        JRTIndex jRTIndex;
        synchronized (JRTIndex.class) {
            if (sharedInstance == null) {
                try {
                    sharedInstance = new JRTIndex();
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            jRTIndex = sharedInstance;
        }
        return jRTIndex;
    }

    public static JRTIndex instance(Context context) {
        try {
            JRTIndex jRTIndex = (JRTIndex) context.get(JRTIndex.class);
            if (jRTIndex != null) {
                return jRTIndex;
            }
            JRTIndex jRTIndex2 = new JRTIndex();
            context.put((Class<Class>) JRTIndex.class, (Class) jRTIndex2);
            return jRTIndex2;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static boolean isAvailable() {
        try {
            FileSystems.getFileSystem(URI.create("jrt:/"));
            return true;
        } catch (FileSystemNotFoundException | ProviderNotFoundException unused) {
            return false;
        }
    }

    public CtSym getCtSym(CharSequence charSequence) throws IOException {
        return getEntry(RelativePath.RelativeDirectory.forPackage(charSequence)).ctSym;
    }

    public synchronized Entry getEntry(RelativePath.RelativeDirectory relativeDirectory) throws IOException {
        Throwable th;
        JRTIndex jRTIndex;
        JRTIndex jRTIndex2;
        Path path;
        try {
            try {
                SoftReference<Entry> softReference = this.entries.get(relativeDirectory);
                Entry entry = softReference == null ? null : softReference.get();
                if (entry == null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    boolean isEmpty = relativeDirectory.path.isEmpty();
                    FileSystem fileSystem = this.jrtfs;
                    if (isEmpty) {
                        try {
                            path = fileSystem.getPath("/modules", new String[0]);
                        } catch (Throwable th2) {
                            th = th2;
                            jRTIndex = this;
                            throw th;
                        }
                    } else {
                        path = fileSystem.getPath("/packages", new String[0]).resolve(relativeDirectory.getPath().replaceAll("/$", "").replace("/", "."));
                    }
                    if (Files.exists(path, new LinkOption[0])) {
                        DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(path);
                        try {
                            for (Path path2 : newDirectoryStream) {
                                if (Files.isSymbolicLink(path2)) {
                                    path2 = Files.readSymbolicLink(path2);
                                }
                                Path resolveAgainst = relativeDirectory.resolveAgainst(path2);
                                if (Files.exists(resolveAgainst, new LinkOption[0])) {
                                    newDirectoryStream = Files.newDirectoryStream(resolveAgainst);
                                    try {
                                        for (Path path3 : newDirectoryStream) {
                                            String path4 = path3.getFileName().toString();
                                            if (Files.isRegularFile(path3, new LinkOption[0])) {
                                                linkedHashMap.put(path4, path3);
                                            } else if (Files.isDirectory(path3, new LinkOption[0])) {
                                                linkedHashSet.add(new RelativePath.RelativeDirectory(relativeDirectory, path4));
                                            }
                                        }
                                        newDirectoryStream.close();
                                    } catch (Throwable th3) {
                                        try {
                                            throw th3;
                                        } catch (Throwable th4) {
                                            if (newDirectoryStream != null) {
                                                try {
                                                    newDirectoryStream.close();
                                                    throw th4;
                                                } catch (Throwable th5) {
                                                    th3.addSuppressed(th5);
                                                    throw th4;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            newDirectoryStream.close();
                        } catch (Throwable th6) {
                            try {
                                throw th6;
                            } finally {
                                if (newDirectoryStream == null) {
                                    throw th4;
                                }
                                try {
                                    newDirectoryStream.close();
                                    throw th4;
                                } catch (Throwable th7) {
                                    th6.addSuppressed(th7);
                                }
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
                    Set unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
                    jRTIndex2 = this;
                    entry = new Entry(unmodifiableMap, unmodifiableSet, getCtInfo(relativeDirectory));
                    jRTIndex2.entries.put(relativeDirectory, new SoftReference<>(entry));
                } else {
                    jRTIndex2 = this;
                }
                return entry;
            } catch (Throwable th8) {
                th = th8;
                jRTIndex = this;
                th = th;
                throw th;
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    public boolean isInJRT(FileObject fileObject) {
        return (fileObject instanceof PathFileObject) && ((PathFileObject) fileObject).getPath().getFileSystem() == this.jrtfs;
    }
}
