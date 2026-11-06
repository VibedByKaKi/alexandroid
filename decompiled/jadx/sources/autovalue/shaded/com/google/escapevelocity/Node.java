package autovalue.shaded.com.google.escapevelocity;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import autovalue.shaded.com.google.common.collect.ImmutableList;
import autovalue.shaded.com.google.common.collect.UnmodifiableIterator;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
abstract class Node {
    final int lineNumber;
    final String resourceName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Cons extends Node {
        private final ImmutableList<Node> nodes;

        public Cons(String str, int i, ImmutableList<Node> immutableList) {
            super(str, i);
            this.nodes = immutableList;
        }

        @Override // autovalue.shaded.com.google.escapevelocity.Node
        public void render(EvaluationContext evaluationContext, StringBuilder sb) {
            UnmodifiableIterator<Node> it2 = this.nodes.iterator();
            while (it2.hasNext()) {
                it2.next().render(evaluationContext, sb);
            }
        }
    }

    public Node(String str, int i) {
        this.resourceName = str;
        this.lineNumber = i;
    }

    public static Node cons(String str, int i, ImmutableList<Node> immutableList) {
        return new Cons(str, i, immutableList);
    }

    public static Node emptyNode(String str, int i) {
        return new Cons(str, i, ImmutableList.of());
    }

    private String where() {
        String str = "In expression on line " + this.lineNumber;
        if (this.resourceName == null) {
            return str;
        }
        StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, " of ");
        m1m.append(this.resourceName);
        return m1m.toString();
    }

    public EvaluationException evaluationException(Throwable th) {
        return new EvaluationException(where() + ": " + th, th);
    }

    public boolean isHorizontalWhitespace() {
        return false;
    }

    public abstract void render(EvaluationContext evaluationContext, StringBuilder sb);

    public EvaluationException evaluationException(String str) {
        return new EvaluationException(ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder(), where(), ": ", str));
    }
}
