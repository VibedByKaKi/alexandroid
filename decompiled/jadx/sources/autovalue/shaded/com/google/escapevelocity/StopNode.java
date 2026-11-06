package autovalue.shaded.com.google.escapevelocity;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
abstract class StopNode extends Node {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ElseIfNode extends StopNode {
        public ElseIfNode(String str, int i) {
            super(str, i);
        }

        @Override // autovalue.shaded.com.google.escapevelocity.StopNode
        public String name() {
            return "#elseif";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ElseNode extends StopNode {
        public ElseNode(String str, int i) {
            super(str, i);
        }

        @Override // autovalue.shaded.com.google.escapevelocity.StopNode
        public String name() {
            return "#else";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class EndNode extends StopNode {
        public EndNode(String str, int i) {
            super(str, i);
        }

        @Override // autovalue.shaded.com.google.escapevelocity.StopNode
        public String name() {
            return "#end";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class EofNode extends StopNode {
        public EofNode(String str, int i) {
            super(str, i);
        }

        @Override // autovalue.shaded.com.google.escapevelocity.StopNode
        public String name() {
            return "end of file";
        }
    }

    public StopNode(String str, int i) {
        super(str, i);
    }

    public abstract String name();

    @Override // autovalue.shaded.com.google.escapevelocity.Node
    public void render(EvaluationContext evaluationContext, StringBuilder sb) {
        throw new UnsupportedOperationException(getClass().getName());
    }
}
