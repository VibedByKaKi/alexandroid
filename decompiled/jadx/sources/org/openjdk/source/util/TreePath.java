package org.openjdk.source.util;

import java.util.Iterator;
import java.util.Objects;
import org.openjdk.source.tree.CompilationUnitTree;
import org.openjdk.source.tree.Tree;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TreePath implements Iterable<Tree> {
    private CompilationUnitTree compilationUnit;
    private Tree leaf;
    private TreePath parent;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: org.openjdk.source.util.TreePath$1Result, reason: invalid class name */
    public class C1Result extends Error {
        static final long serialVersionUID = -5942088234594905625L;
        TreePath path;

        public C1Result(TreePath treePath) {
            this.path = treePath;
        }
    }

    public TreePath(TreePath treePath, Tree tree) {
        if (tree.getKind() == Tree.Kind.COMPILATION_UNIT) {
            this.compilationUnit = (CompilationUnitTree) tree;
            this.parent = null;
        } else {
            this.compilationUnit = treePath.compilationUnit;
            this.parent = treePath;
        }
        this.leaf = tree;
    }

    public static TreePath getPath(TreePath treePath, Tree tree) {
        Objects.requireNonNull(treePath);
        Objects.requireNonNull(tree);
        if (treePath.getLeaf() == tree) {
            return treePath;
        }
        try {
            new TreePathScanner<TreePath, Tree>() { // from class: org.openjdk.source.util.TreePath.1PathFinder
                @Override // org.openjdk.source.util.TreePathScanner, org.openjdk.source.util.TreeScanner
                public TreePath scan(Tree tree2, Tree tree3) {
                    if (tree2 != tree3) {
                        return (TreePath) super.scan(tree2, tree3);
                    }
                    throw new C1Result(new TreePath(getCurrentPath(), tree3));
                }
            }.scan(treePath, (TreePath) tree);
            return null;
        } catch (C1Result e) {
            return e.path;
        }
    }

    public CompilationUnitTree getCompilationUnit() {
        return this.compilationUnit;
    }

    public Tree getLeaf() {
        return this.leaf;
    }

    public TreePath getParentPath() {
        return this.parent;
    }

    @Override // java.lang.Iterable
    public Iterator<Tree> iterator() {
        return new Iterator<Tree>() { // from class: org.openjdk.source.util.TreePath.1
            private TreePath next;

            {
                this.next = TreePath.this;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.next != null;
            }

            @Override // java.util.Iterator
            public Tree next() {
                Tree tree = this.next.leaf;
                this.next = this.next.parent;
                return tree;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static TreePath getPath(CompilationUnitTree compilationUnitTree, Tree tree) {
        return getPath(new TreePath(compilationUnitTree), tree);
    }

    public TreePath(CompilationUnitTree compilationUnitTree) {
        this(null, compilationUnitTree);
    }
}
