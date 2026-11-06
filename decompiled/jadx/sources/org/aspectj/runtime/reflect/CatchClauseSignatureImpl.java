package org.aspectj.runtime.reflect;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import org.aspectj.lang.reflect.CatchClauseSignature;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
class CatchClauseSignatureImpl extends SignatureImpl implements CatchClauseSignature {
    String parameterName;
    Class parameterType;

    public CatchClauseSignatureImpl(Class cls, Class cls2, String str) {
        super(0, "catch", cls);
        this.parameterType = cls2;
        this.parameterName = str;
    }

    @Override // org.aspectj.runtime.reflect.SignatureImpl
    public String createToString(StringMaker stringMaker) {
        StringBuffer stringBuffer = new StringBuffer("catch(");
        stringBuffer.append(stringMaker.makeTypeName(getParameterType()));
        stringBuffer.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return stringBuffer.toString();
    }

    @Override // org.aspectj.lang.reflect.CatchClauseSignature
    public String getParameterName() {
        if (this.parameterName == null) {
            this.parameterName = extractString(4);
        }
        return this.parameterName;
    }

    @Override // org.aspectj.lang.reflect.CatchClauseSignature
    public Class getParameterType() {
        if (this.parameterType == null) {
            this.parameterType = extractType(3);
        }
        return this.parameterType;
    }

    public CatchClauseSignatureImpl(String str) {
        super(str);
    }
}
