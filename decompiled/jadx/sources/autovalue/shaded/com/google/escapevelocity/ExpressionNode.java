package autovalue.shaded.com.google.escapevelocity;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import autovalue.shaded.com.google.escapevelocity.Parser;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
abstract class ExpressionNode extends Node {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: autovalue.shaded.com.google.escapevelocity.ExpressionNode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$escapevelocity$Parser$Operator;

        static {
            int[] iArr = new int[Parser.Operator.values().length];
            $SwitchMap$com$google$escapevelocity$Parser$Operator = iArr;
            try {
                iArr[Parser.Operator.OR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$escapevelocity$Parser$Operator[Parser.Operator.AND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$escapevelocity$Parser$Operator[Parser.Operator.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$escapevelocity$Parser$Operator[Parser.Operator.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$escapevelocity$Parser$Operator[Parser.Operator.PLUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$escapevelocity$Parser$Operator[Parser.Operator.LESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$escapevelocity$Parser$Operator[Parser.Operator.LESS_OR_EQUAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$escapevelocity$Parser$Operator[Parser.Operator.GREATER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$escapevelocity$Parser$Operator[Parser.Operator.GREATER_OR_EQUAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$escapevelocity$Parser$Operator[Parser.Operator.MINUS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$escapevelocity$Parser$Operator[Parser.Operator.TIMES.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$escapevelocity$Parser$Operator[Parser.Operator.DIVIDE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$escapevelocity$Parser$Operator[Parser.Operator.REMAINDER.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class BinaryExpressionNode extends ExpressionNode {
        final ExpressionNode lhs;
        final Parser.Operator op;
        final ExpressionNode rhs;

        public BinaryExpressionNode(ExpressionNode expressionNode, Parser.Operator operator, ExpressionNode expressionNode2) {
            super(expressionNode.resourceName, expressionNode.lineNumber);
            this.lhs = expressionNode;
            this.op = operator;
            this.rhs = expressionNode2;
        }

        private boolean equal(EvaluationContext evaluationContext) {
            Object evaluate = this.lhs.evaluate(evaluationContext);
            Object evaluate2 = this.rhs.evaluate(evaluationContext);
            if (evaluate == evaluate2) {
                return true;
            }
            if (evaluate == null || evaluate2 == null) {
                return false;
            }
            return evaluate.getClass().equals(evaluate2.getClass()) ? evaluate.equals(evaluate2) : evaluate.toString().equals(evaluate2.toString());
        }

        private Void nullOperand(boolean z) {
            StringBuilder sb;
            ExpressionNode expressionNode;
            if (!this.op.isInequality()) {
                return null;
            }
            if (z) {
                sb = new StringBuilder("Left operand ");
                expressionNode = this.lhs;
            } else {
                sb = new StringBuilder("Right operand ");
                expressionNode = this.rhs;
            }
            sb.append(expressionNode);
            StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(sb.toString(), " of ");
            m1m.append(this.op);
            m1m.append(" must not be null");
            throw evaluationException(m1m.toString());
        }

        private String operandString(ExpressionNode expressionNode) {
            String valueOf = String.valueOf(expressionNode);
            return (!(expressionNode instanceof BinaryExpressionNode) || ((BinaryExpressionNode) expressionNode).op.precedence >= this.op.precedence) ? valueOf : a$$ExternalSyntheticOutline0.m(MarkdownConstants.LEFT_PARENTHESIS, valueOf, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        private Object plus(EvaluationContext evaluationContext) {
            Object evaluate = this.lhs.evaluate(evaluationContext);
            Object evaluate2 = this.rhs.evaluate(evaluationContext);
            if ((evaluate instanceof String) || (evaluate2 instanceof String)) {
                if (evaluate == null) {
                    evaluate = this.lhs.toString();
                }
                if (evaluate2 == null) {
                    evaluate2 = this.rhs.toString();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(evaluate);
                sb.append(evaluate2);
                return sb.toString();
            }
            if (evaluate == null || evaluate2 == null) {
                return null;
            }
            if ((evaluate instanceof Integer) && (evaluate2 instanceof Integer)) {
                return TableInfo$$ExternalSyntheticOutline0.m(((Integer) evaluate).intValue(), (Integer) evaluate2);
            }
            throw evaluationException("Operands of + must both be integers, or at least one must be a string: " + ExpressionNode.show(evaluate) + " + " + ExpressionNode.show(evaluate2));
        }

        @Override // autovalue.shaded.com.google.escapevelocity.ExpressionNode
        public Object evaluate(EvaluationContext evaluationContext, boolean z) {
            int[] iArr = AnonymousClass1.$SwitchMap$com$google$escapevelocity$Parser$Operator;
            int i = iArr[this.op.ordinal()];
            if (i == 1) {
                return Boolean.valueOf(this.lhs.isTrue(evaluationContext, z) || this.rhs.isTrue(evaluationContext, z));
            }
            if (i == 2) {
                if (this.lhs.isTrue(evaluationContext, z) && this.rhs.isTrue(evaluationContext, z)) {
                    r2 = true;
                }
                return Boolean.valueOf(r2);
            }
            if (i == 3) {
                return Boolean.valueOf(equal(evaluationContext));
            }
            if (i == 4) {
                return Boolean.valueOf(!equal(evaluationContext));
            }
            if (i == 5) {
                return plus(evaluationContext);
            }
            Integer intValue = this.lhs.intValue(evaluationContext);
            Integer intValue2 = this.rhs.intValue(evaluationContext);
            if (intValue == null || intValue2 == null) {
                return nullOperand(intValue == null);
            }
            switch (iArr[this.op.ordinal()]) {
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    if (intValue2.intValue() != 0) {
                        break;
                    }
                    break;
                case 13:
                    if (intValue2.intValue() != 0) {
                        break;
                    }
                    break;
                default:
                    Buffer$$ExternalSyntheticBUOutline0.m(this.op);
                    break;
            }
            return null;
        }

        @Override // autovalue.shaded.com.google.escapevelocity.ExpressionNode
        public String toString() {
            return operandString(this.lhs) + " " + this.op + " " + operandString(this.rhs);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NotExpressionNode extends ExpressionNode {
        private final ExpressionNode expr;

        public NotExpressionNode(ExpressionNode expressionNode) {
            super(expressionNode.resourceName, expressionNode.lineNumber);
            this.expr = expressionNode;
        }

        @Override // autovalue.shaded.com.google.escapevelocity.ExpressionNode
        public Object evaluate(EvaluationContext evaluationContext, boolean z) {
            return Boolean.valueOf(!this.expr.isTrue(evaluationContext, z));
        }

        @Override // autovalue.shaded.com.google.escapevelocity.ExpressionNode
        public String toString() {
            boolean z = this.expr instanceof BinaryExpressionNode;
            ExpressionNode expressionNode = this.expr;
            if (!z) {
                return MarkdownConstants.EXCLAMATION_MARK + expressionNode;
            }
            return "!(" + expressionNode + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public ExpressionNode(String str, int i) {
        super(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String show(Object obj) {
        if (obj == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(" (a ");
        return TableInfo$$ExternalSyntheticOutline0.m(sb, MarkdownConstants.RIGHT_PARENTHESIS, obj);
    }

    public final Object evaluate(EvaluationContext evaluationContext) {
        return evaluate(evaluationContext, false);
    }

    public abstract Object evaluate(EvaluationContext evaluationContext, boolean z);

    public Integer intValue(EvaluationContext evaluationContext) {
        Object evaluate = evaluate(evaluationContext);
        if (evaluate == null) {
            return null;
        }
        if (evaluate instanceof Integer) {
            return (Integer) evaluate;
        }
        throw evaluationException("Arithmetic is only available on integers, not " + show(evaluate));
    }

    public boolean isSilent() {
        return false;
    }

    public boolean isTrue(EvaluationContext evaluationContext, boolean z) {
        Object evaluate = evaluate(evaluationContext, z);
        return evaluate instanceof Boolean ? ((Boolean) evaluate).booleanValue() : evaluate != null;
    }

    @Override // autovalue.shaded.com.google.escapevelocity.Node
    public final void render(EvaluationContext evaluationContext, StringBuilder sb) {
        Object evaluate = evaluate(evaluationContext);
        if (evaluate == null) {
            if (isSilent()) {
                return;
            }
            throw evaluationException("Null value for " + this);
        }
        if (evaluate instanceof Node) {
            ((Node) evaluate).render(evaluationContext, sb);
        } else {
            sb.append(evaluate);
        }
    }

    public abstract String toString();
}
