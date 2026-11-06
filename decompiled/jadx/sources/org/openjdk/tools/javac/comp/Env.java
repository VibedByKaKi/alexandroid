package org.openjdk.tools.javac.comp;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.Iterator;
import org.openjdk.tools.javac.tree.JCTree;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class Env<A> implements Iterable<Env<A>> {
    public A info;
    public JCTree tree;
    public boolean baseClause = false;
    public Env<A> next = null;
    public Env<A> outer = null;
    public JCTree.JCCompilationUnit toplevel = null;
    public JCTree.JCClassDecl enclClass = null;
    public JCTree.JCMethodDecl enclMethod = null;

    public Env(JCTree jCTree, A a2) {
        this.tree = jCTree;
        this.info = a2;
    }

    public Env<A> dup(JCTree jCTree, A a2) {
        return dupto(new Env<>(jCTree, a2));
    }

    public Env<A> dupto(Env<A> env) {
        env.next = this;
        env.outer = this.outer;
        env.toplevel = this.toplevel;
        env.enclClass = this.enclClass;
        env.enclMethod = this.enclMethod;
        return env;
    }

    public Env<A> enclosing(JCTree.Tag tag) {
        while (this != null && !this.tree.hasTag(tag)) {
            this = this.next;
        }
        return this;
    }

    @Override // java.lang.Iterable
    public Iterator<Env<A>> iterator() {
        return new Iterator<Env<A>>() { // from class: org.openjdk.tools.javac.comp.Env.1
            Env<A> next;

            {
                this.next = Env.this;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.next.outer != null;
            }

            @Override // java.util.Iterator
            public Env<A> next() {
                if (!hasNext()) {
                    Single$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
                Env<A> env = this.next;
                this.next = env.outer;
                return env;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Env[");
        sb.append(this.info);
        if (this.outer != null) {
            sb.append(",outer=");
            sb.append(this.outer);
        }
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }

    public Env<A> dup(JCTree jCTree) {
        return dup(jCTree, this.info);
    }
}
