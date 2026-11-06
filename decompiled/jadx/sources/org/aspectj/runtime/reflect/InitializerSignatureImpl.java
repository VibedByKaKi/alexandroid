package org.aspectj.runtime.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import org.aspectj.lang.reflect.InitializerSignature;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
class InitializerSignatureImpl extends CodeSignatureImpl implements InitializerSignature {
    private Constructor constructor;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InitializerSignatureImpl(int r9, java.lang.Class r10) {
        /*
            r8 = this;
            boolean r0 = java.lang.reflect.Modifier.isStatic(r9)
            if (r0 == 0) goto La
            java.lang.String r0 = "<clinit>"
        L8:
            r3 = r0
            goto Ld
        La:
            java.lang.String r0 = "<init>"
            goto L8
        Ld:
            java.lang.Class[] r5 = org.aspectj.runtime.reflect.SignatureImpl.EMPTY_CLASS_ARRAY
            java.lang.String[] r6 = org.aspectj.runtime.reflect.SignatureImpl.EMPTY_STRING_ARRAY
            r7 = r5
            r1 = r8
            r2 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.aspectj.runtime.reflect.InitializerSignatureImpl.<init>(int, java.lang.Class):void");
    }

    @Override // org.aspectj.runtime.reflect.SignatureImpl
    public String createToString(StringMaker stringMaker) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(stringMaker.makeModifiersString(getModifiers()));
        stringBuffer.append(stringMaker.makePrimaryTypeName(getDeclaringType(), getDeclaringTypeName()));
        stringBuffer.append(".");
        stringBuffer.append(getName());
        return stringBuffer.toString();
    }

    @Override // org.aspectj.lang.reflect.InitializerSignature
    public Constructor getInitializer() {
        if (this.constructor == null) {
            try {
                this.constructor = getDeclaringType().getDeclaredConstructor(getParameterTypes());
            } catch (Exception unused) {
            }
        }
        return this.constructor;
    }

    @Override // org.aspectj.runtime.reflect.SignatureImpl, org.aspectj.lang.Signature
    public String getName() {
        return Modifier.isStatic(getModifiers()) ? "<clinit>" : "<init>";
    }

    public InitializerSignatureImpl(String str) {
        super(str);
    }
}
