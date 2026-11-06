package org.openjdk.tools.javac.file;

import java.nio.file.Path;
import java.nio.file.Paths;
import org.openjdk.javax.tools.StandardJavaFileManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class JavacFileManager$$ExternalSyntheticLambda2 implements StandardJavaFileManager.PathFactory {
    @Override // org.openjdk.javax.tools.StandardJavaFileManager.PathFactory
    public final Path getPath(String str, String[] strArr) {
        return Paths.get(str, strArr);
    }
}
