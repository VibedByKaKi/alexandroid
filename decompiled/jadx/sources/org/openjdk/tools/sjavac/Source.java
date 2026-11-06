package org.openjdk.tools.sjavac;

import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.regex.PatternSyntaxException;
import org.openjdk.tools.sjavac.Source;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class Source implements Comparable<Source> {
    private File file;
    private boolean isGenerated;
    private long lastModified;
    private boolean linkedOnly;
    private String name;
    private Package pkg;
    private String suffix;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: org.openjdk.tools.sjavac.Source$1, reason: invalid class name */
    public static class AnonymousClass1 extends SimpleFileVisitor<Path> {
        final /* synthetic */ Module val$currentModule;
        final /* synthetic */ List val$excludeMatchers;
        final /* synthetic */ Map val$foundFiles;
        final /* synthetic */ boolean val$inGensrc;
        final /* synthetic */ boolean val$inLinksrc;
        final /* synthetic */ List val$includeMatchers;
        final /* synthetic */ File val$root;
        final /* synthetic */ Set val$suffixes;

        public AnonymousClass1(File file, List list, List list2, Set set, Map map, Module module, boolean z, boolean z2) {
            this.val$root = file;
            this.val$includeMatchers = list;
            this.val$excludeMatchers = list2;
            this.val$suffixes = set;
            this.val$foundFiles = map;
            this.val$currentModule = module;
            this.val$inLinksrc = z;
            this.val$inGensrc = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$visitFile$0(Path path, PathMatcher pathMatcher) {
            return pathMatcher.matches(path);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$visitFile$1(Path path, PathMatcher pathMatcher) {
            return pathMatcher.matches(path);
        }

        @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
        public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
            final Path relativize = this.val$root.toPath().relativize(path);
            final int i = 0;
            if (this.val$includeMatchers.stream().anyMatch(new Predicate() { // from class: org.openjdk.tools.sjavac.Source$1$$ExternalSyntheticLambda0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean lambda$visitFile$0;
                    boolean lambda$visitFile$1;
                    int i2 = i;
                    Path path2 = relativize;
                    PathMatcher pathMatcher = (PathMatcher) obj;
                    switch (i2) {
                        case 0:
                            lambda$visitFile$0 = Source.AnonymousClass1.lambda$visitFile$0(path2, pathMatcher);
                            return lambda$visitFile$0;
                        default:
                            lambda$visitFile$1 = Source.AnonymousClass1.lambda$visitFile$1(path2, pathMatcher);
                            return lambda$visitFile$1;
                    }
                }
            })) {
                final int i2 = 1;
                if (this.val$excludeMatchers.stream().noneMatch(new Predicate() { // from class: org.openjdk.tools.sjavac.Source$1$$ExternalSyntheticLambda0
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        boolean lambda$visitFile$0;
                        boolean lambda$visitFile$1;
                        int i22 = i2;
                        Path path2 = relativize;
                        PathMatcher pathMatcher = (PathMatcher) obj;
                        switch (i22) {
                            case 0:
                                lambda$visitFile$0 = Source.AnonymousClass1.lambda$visitFile$0(path2, pathMatcher);
                                return lambda$visitFile$0;
                            default:
                                lambda$visitFile$1 = Source.AnonymousClass1.lambda$visitFile$1(path2, pathMatcher);
                                return lambda$visitFile$1;
                        }
                    }
                }) && this.val$suffixes.contains(Util.fileSuffix(path))) {
                    Source source = (Source) this.val$foundFiles.get(path);
                    if (source != null) {
                        StringBuilder sb = new StringBuilder("You have already added the file ");
                        sb.append(path);
                        String path2 = source.file().getPath();
                        sb.append(" from ");
                        sb.append(path2);
                        throw new IOException(sb.toString());
                    }
                    Source lookupSource = this.val$currentModule.lookupSource(path.toString());
                    if (lookupSource == null) {
                        Source source2 = new Source(this.val$currentModule, path.toString(), path.toFile());
                        if (this.val$inGensrc) {
                            source2.markAsGenerated();
                        }
                        if (this.val$inLinksrc) {
                            source2.markAsLinkedOnly();
                        }
                        String str = this.val$currentModule.name() + ":" + Source.packageOfJavaFile(this.val$root.toPath(), path);
                        this.val$foundFiles.put(path.toString(), source2);
                        this.val$currentModule.addSource(str, source2);
                    } else {
                        if (!this.val$inLinksrc) {
                            StringBuilder sb2 = new StringBuilder("Internal error: Double add of file ");
                            sb2.append(path);
                            String path3 = lookupSource.file().getPath();
                            sb2.append(" from ");
                            sb2.append(path3);
                            throw new IOException(sb2.toString());
                        }
                        if (lookupSource.isLinkedOnly()) {
                            StringBuilder sb3 = new StringBuilder("You have already added the link only file ");
                            sb3.append(path);
                            String path4 = lookupSource.file().getPath();
                            sb3.append(" from ");
                            sb3.append(path4);
                            throw new IOException(sb3.toString());
                        }
                        this.val$foundFiles.put(path.toString(), lookupSource);
                    }
                }
            }
            return FileVisitResult.CONTINUE;
        }
    }

    public Source(Package r2, String str, long j) {
        this.pkg = r2;
        this.name = str;
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf != -1) {
            this.suffix = str.substring(lastIndexOf);
        } else {
            this.suffix = "";
        }
        this.file = null;
        this.lastModified = j;
        this.linkedOnly = false;
        str.lastIndexOf(47);
    }

    private static List<PathMatcher> createPathMatchers(FileSystem fileSystem, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            try {
                arrayList.add(fileSystem.getPathMatcher("glob:" + str));
            } catch (PatternSyntaxException e) {
                Log.error("Invalid pattern: " + str);
                throw e;
            }
        }
        return arrayList;
    }

    public static Source load(Package r8, String str, boolean z) {
        int indexOf = str.indexOf(32, 4);
        if (indexOf == -1) {
            return null;
        }
        String substring = str.substring(4, indexOf);
        boolean z2 = true;
        long parseLong = Long.parseLong(str.substring(indexOf + 1));
        if (str.charAt(2) != 'L') {
            if (str.charAt(2) != 'C') {
                return null;
            }
            z2 = false;
        }
        Source source = new Source(r8, substring, parseLong);
        source.file = new File(substring);
        if (z) {
            source.markAsGenerated();
        }
        if (z2) {
            source.markAsLinkedOnly();
        }
        return source;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String packageOfJavaFile(Path path, Path path2) {
        Path relativize = path.relativize(path2.getParent());
        ArrayList arrayList = new ArrayList();
        Iterator<Path> it2 = relativize.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getFileName().toString());
        }
        return String.join(".", arrayList);
    }

    private void save(StringBuilder sb) {
        String str = this.linkedOnly ? "L" : "C";
        sb.append((this.isGenerated ? "G" : ExifInterface.LATITUDE_SOUTH) + " " + str + " " + this.name + " " + this.file.lastModified() + "\n");
    }

    public static void saveSources(Map<String, Source> map, StringBuilder sb) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        Collections.sort(arrayList);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            map.get((String) it3.next()).save(sb);
        }
    }

    public static void scanRoot(File file, Set<String> set, List<String> list, List<String> list2, Map<String, Source> map, Map<String, Module> map2, Module module, boolean z, boolean z2, boolean z3) throws IOException, ProblemException {
        if (file == null) {
            return;
        }
        FileSystem fileSystem = file.toPath().getFileSystem();
        if (list2.isEmpty()) {
            list2 = Collections.singletonList("**");
        }
        Files.walkFileTree(file.toPath(), new AnonymousClass1(file, createPathMatchers(fileSystem, list2), createPathMatchers(fileSystem, list), set, map, module, z3, z2));
    }

    @Override // java.lang.Comparable
    public int compareTo(Source source) {
        return this.name.compareTo(source.name);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Source) && this.name.equals(((Source) obj).name);
    }

    public File file() {
        return this.file;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public boolean isGenerated() {
        return this.isGenerated;
    }

    public boolean isLinkedOnly() {
        return this.linkedOnly;
    }

    public long lastModified() {
        return this.lastModified;
    }

    public void markAsGenerated() {
        this.isGenerated = true;
    }

    public void markAsLinkedOnly() {
        this.linkedOnly = true;
    }

    public String name() {
        return this.name;
    }

    public Package pkg() {
        return this.pkg;
    }

    public void setPackage(Package r1) {
        this.pkg = r1;
    }

    public String suffix() {
        return this.suffix;
    }

    public String toString() {
        return String.format("%s[pkg: %s, name: %s, suffix: %s, file: %s, isGenerated: %b, linkedOnly: %b]", getClass().getSimpleName(), this.pkg, this.name, this.suffix, this.file, Boolean.valueOf(this.isGenerated), Boolean.valueOf(this.linkedOnly));
    }

    public Source(Module module, String str, File file) {
        this.name = str;
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf != -1) {
            this.suffix = str.substring(lastIndexOf);
        } else {
            this.suffix = "";
        }
        this.file = file;
        this.lastModified = file.lastModified();
        this.linkedOnly = false;
    }
}
