package org.openjdk.source.util;

import org.openjdk.source.doctree.DocTree;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class DocTreePathScanner<R, P> extends DocTreeScanner<R, P> {
    private DocTreePath path;

    public DocTreePath getCurrentPath() {
        return this.path;
    }

    @Override // org.openjdk.source.util.DocTreeScanner
    public R scan(DocTree docTree, P p) {
        if (docTree == null) {
            return null;
        }
        DocTreePath docTreePath = this.path;
        this.path = new DocTreePath(docTreePath, docTree);
        try {
            return (R) docTree.accept(this, p);
        } finally {
            this.path = docTreePath;
        }
    }

    public R scan(DocTreePath docTreePath, P p) {
        this.path = docTreePath;
        try {
            return (R) docTreePath.getLeaf().accept(this, p);
        } finally {
            this.path = null;
        }
    }
}
