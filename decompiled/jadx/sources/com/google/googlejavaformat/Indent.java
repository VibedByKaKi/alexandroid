package com.google.googlejavaformat;

import com.google.common.base.MoreObjects;
import com.google.googlejavaformat.Output;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public abstract class Indent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Const extends Indent {
        public static final Const ZERO = new Const(0);
        private final int n;

        private Const(int i) {
            this.n = i;
        }

        public static Const make(int i, int i2) {
            return new Const(i * i2);
        }

        @Override // com.google.googlejavaformat.Indent
        public int eval() {
            return this.n;
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).add("n", this.n).toString();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class If extends Indent {
        private final Output.BreakTag condition;
        private final Indent elseIndent;
        private final Indent thenIndent;

        private If(Output.BreakTag breakTag, Indent indent, Indent indent2) {
            this.condition = breakTag;
            this.thenIndent = indent;
            this.elseIndent = indent2;
        }

        public static If make(Output.BreakTag breakTag, Indent indent, Indent indent2) {
            return new If(breakTag, indent, indent2);
        }

        @Override // com.google.googlejavaformat.Indent
        public int eval() {
            return (this.condition.wasBreakTaken() ? this.thenIndent : this.elseIndent).eval();
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).add("condition", this.condition).add("thenIndent", this.thenIndent).add("elseIndent", this.elseIndent).toString();
        }
    }

    public abstract int eval();
}
