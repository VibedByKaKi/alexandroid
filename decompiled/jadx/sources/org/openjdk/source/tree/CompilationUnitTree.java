package org.openjdk.source.tree;

import java.util.List;
import org.openjdk.javax.tools.JavaFileObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface CompilationUnitTree extends Tree {
    List<? extends ImportTree> getImports();

    LineMap getLineMap();

    PackageTree getPackage();

    List<? extends AnnotationTree> getPackageAnnotations();

    ExpressionTree getPackageName();

    JavaFileObject getSourceFile();

    List<? extends Tree> getTypeDecls();
}
