package org.openjdk.source.util;

import java.util.Iterator;
import java.util.Objects;
import org.openjdk.source.doctree.DocCommentTree;
import org.openjdk.source.doctree.DocTree;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class DocTreePath implements Iterable<DocTree> {
    private final DocCommentTree docComment;
    private final DocTree leaf;
    private final DocTreePath parent;
    private final TreePath treePath;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: org.openjdk.source.util.DocTreePath$1Result, reason: invalid class name */
    public class C1Result extends Error {
        static final long serialVersionUID = -5942088234594905625L;
        DocTreePath path;

        public C1Result(DocTreePath docTreePath) {
            this.path = docTreePath;
        }
    }

    public DocTreePath(DocTreePath docTreePath, DocTree docTree) {
        if (docTree.getKind() == DocTree.Kind.DOC_COMMENT) {
            Single$$ExternalSyntheticBUOutline0.m$3("Use DocTreePath(TreePath, DocCommentTree) to construct DocTreePath for a DocCommentTree.");
            throw null;
        }
        this.treePath = docTreePath.treePath;
        this.docComment = docTreePath.docComment;
        this.parent = docTreePath;
        this.leaf = docTree;
    }

    public static DocTreePath getPath(DocTreePath docTreePath, DocTree docTree) {
        Objects.requireNonNull(docTreePath);
        Objects.requireNonNull(docTree);
        if (docTreePath.getLeaf() == docTree) {
            return docTreePath;
        }
        try {
            new DocTreePathScanner<DocTreePath, DocTree>() { // from class: org.openjdk.source.util.DocTreePath.1PathFinder
                @Override // org.openjdk.source.util.DocTreePathScanner, org.openjdk.source.util.DocTreeScanner
                public DocTreePath scan(DocTree docTree2, DocTree docTree3) {
                    if (docTree2 != docTree3) {
                        return (DocTreePath) super.scan(docTree2, docTree3);
                    }
                    throw new C1Result(new DocTreePath(getCurrentPath(), docTree3));
                }
            }.scan(docTreePath, (DocTreePath) docTree);
            return null;
        } catch (C1Result e) {
            return e.path;
        }
    }

    public DocCommentTree getDocComment() {
        return this.docComment;
    }

    public DocTree getLeaf() {
        return this.leaf;
    }

    public DocTreePath getParentPath() {
        return this.parent;
    }

    public TreePath getTreePath() {
        return this.treePath;
    }

    @Override // java.lang.Iterable
    public Iterator<DocTree> iterator() {
        return new Iterator<DocTree>() { // from class: org.openjdk.source.util.DocTreePath.1
            private DocTreePath next;

            {
                this.next = DocTreePath.this;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.next != null;
            }

            @Override // java.util.Iterator
            public DocTree next() {
                DocTree docTree = this.next.leaf;
                this.next = this.next.parent;
                return docTree;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static DocTreePath getPath(TreePath treePath, DocCommentTree docCommentTree, DocTree docTree) {
        return getPath(new DocTreePath(treePath, docCommentTree), docTree);
    }

    public DocTreePath(TreePath treePath, DocCommentTree docCommentTree) {
        this.treePath = treePath;
        Objects.requireNonNull(docCommentTree);
        this.docComment = docCommentTree;
        this.parent = null;
        this.leaf = docCommentTree;
    }
}
