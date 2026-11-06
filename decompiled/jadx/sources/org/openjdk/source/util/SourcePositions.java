package org.openjdk.source.util;

import org.openjdk.source.tree.CompilationUnitTree;
import org.openjdk.source.tree.Tree;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface SourcePositions {
    long getEndPosition(CompilationUnitTree compilationUnitTree, Tree tree);

    long getStartPosition(CompilationUnitTree compilationUnitTree, Tree tree);
}
