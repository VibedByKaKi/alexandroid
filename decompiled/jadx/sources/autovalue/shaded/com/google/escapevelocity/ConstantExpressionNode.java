package autovalue.shaded.com.google.escapevelocity;

import autovalue.shaded.com.google.common.base.CharMatcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
class ConstantExpressionNode extends ExpressionNode {
    private static final CharMatcher HORIZONTAL_SPACE = CharMatcher.whitespace().and(CharMatcher.noneOf("\r\n")).precomputed();
    private final Object value;

    public ConstantExpressionNode(String str, int i, Object obj) {
        super(str, i);
        this.value = obj;
    }

    @Override // autovalue.shaded.com.google.escapevelocity.ExpressionNode
    public Object evaluate(EvaluationContext evaluationContext, boolean z) {
        return this.value;
    }

    @Override // autovalue.shaded.com.google.escapevelocity.Node
    public boolean isHorizontalWhitespace() {
        Object obj = this.value;
        return (obj instanceof String) && HORIZONTAL_SPACE.matchesAllOf((String) obj);
    }

    @Override // autovalue.shaded.com.google.escapevelocity.ExpressionNode
    public String toString() {
        return String.valueOf(this.value);
    }
}
