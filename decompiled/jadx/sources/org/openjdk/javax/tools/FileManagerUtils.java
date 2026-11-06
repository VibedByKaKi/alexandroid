package org.openjdk.javax.tools;

import java.io.File;
import java.nio.file.Path;
import java.util.Iterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
class FileManagerUtils {
    private FileManagerUtils() {
    }

    public static Iterable<File> asFiles(Iterable<? extends Path> iterable) {
        return new FileManagerUtils$$ExternalSyntheticLambda0(iterable, 1);
    }

    public static Iterable<Path> asPaths(Iterable<? extends File> iterable) {
        return new FileManagerUtils$$ExternalSyntheticLambda0(iterable, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator lambda$asFiles$1(Iterable iterable) {
        return new Iterator<File>(iterable) { // from class: org.openjdk.javax.tools.FileManagerUtils.2
            Iterator iter;
            final /* synthetic */ Iterable val$paths;

            {
                this.val$paths = iterable;
                this.iter = iterable.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.iter.hasNext();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public File next() {
                Path path = (Path) this.iter.next();
                try {
                    return path.toFile();
                } catch (UnsupportedOperationException e) {
                    Single$$ExternalSyntheticBUOutline0.m(path.toString(), e);
                    return null;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator lambda$asPaths$0(Iterable iterable) {
        return new Iterator<Path>(iterable) { // from class: org.openjdk.javax.tools.FileManagerUtils.1
            Iterator iter;
            final /* synthetic */ Iterable val$files;

            {
                this.val$files = iterable;
                this.iter = iterable.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.iter.hasNext();
            }

            @Override // java.util.Iterator
            public Path next() {
                return ((File) this.iter.next()).toPath();
            }
        };
    }
}
