package org.aspectj.internal.lang.reflect;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import org.aspectj.lang.reflect.PerClauseKind;
import org.aspectj.lang.reflect.TypePattern;
import org.aspectj.lang.reflect.TypePatternBasedPerClause;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TypePatternBasedPerClauseImpl extends PerClauseImpl implements TypePatternBasedPerClause {
    private TypePattern typePattern;

    public TypePatternBasedPerClauseImpl(PerClauseKind perClauseKind, String str) {
        super(perClauseKind);
        this.typePattern = new TypePatternImpl(str);
    }

    @Override // org.aspectj.lang.reflect.TypePatternBasedPerClause
    public TypePattern getTypePattern() {
        return this.typePattern;
    }

    @Override // org.aspectj.internal.lang.reflect.PerClauseImpl
    public String toString() {
        return "pertypewithin(" + this.typePattern.asString() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
