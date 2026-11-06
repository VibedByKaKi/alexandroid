package org.aspectj.runtime.reflect;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.UnlockSignature;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
class UnlockSignatureImpl extends SignatureImpl implements UnlockSignature {
    private Class parameterType;

    public UnlockSignatureImpl(Class cls) {
        super(8, JoinPoint.SYNCHRONIZATION_UNLOCK, cls);
        this.parameterType = cls;
    }

    @Override // org.aspectj.runtime.reflect.SignatureImpl
    public String createToString(StringMaker stringMaker) {
        if (this.parameterType == null) {
            this.parameterType = extractType(3);
        }
        StringBuffer stringBuffer = new StringBuffer("unlock(");
        stringBuffer.append(stringMaker.makeTypeName(this.parameterType));
        stringBuffer.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return stringBuffer.toString();
    }

    public Class getParameterType() {
        if (this.parameterType == null) {
            this.parameterType = extractType(3);
        }
        return this.parameterType;
    }

    public UnlockSignatureImpl(String str) {
        super(str);
    }
}
