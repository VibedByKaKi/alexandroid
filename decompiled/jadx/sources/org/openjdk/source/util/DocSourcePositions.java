package org.openjdk.source.util;

import org.openjdk.source.doctree.DocCommentTree;
import org.openjdk.source.doctree.DocTree;
import org.openjdk.source.tree.CompilationUnitTree;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface DocSourcePositions extends SourcePositions {
    long getEndPosition(CompilationUnitTree compilationUnitTree, DocCommentTree docCommentTree, DocTree docTree);

    long getStartPosition(CompilationUnitTree compilationUnitTree, DocCommentTree docCommentTree, DocTree docTree);
}
