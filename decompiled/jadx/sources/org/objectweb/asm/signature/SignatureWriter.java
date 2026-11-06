package org.objectweb.asm.signature;

import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes11.dex */
public class SignatureWriter extends SignatureVisitor {

    /* renamed from: a, reason: collision with root package name */
    private final StringBuffer f1189a;
    private boolean b;
    private boolean c;
    private int d;

    public SignatureWriter() {
        super(327680);
        this.f1189a = new StringBuffer();
    }

    private void a() {
        if (this.b) {
            this.b = false;
            this.f1189a.append(Typography.greater);
        }
    }

    private void b() {
        if (this.d % 2 != 0) {
            this.f1189a.append(Typography.greater);
        }
        this.d /= 2;
    }

    public String toString() {
        return this.f1189a.toString();
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitArrayType() {
        this.f1189a.append(AbstractJsonLexerKt.BEGIN_LIST);
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitBaseType(char c) {
        this.f1189a.append(c);
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitClassType(String str) {
        this.f1189a.append(Matrix.MATRIX_TYPE_RANDOM_LT);
        this.f1189a.append(str);
        this.d *= 2;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitEnd() {
        b();
        this.f1189a.append(';');
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitExceptionType() {
        this.f1189a.append('^');
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitFormalTypeParameter(String str) {
        if (!this.b) {
            this.b = true;
            this.f1189a.append(Typography.less);
        }
        this.f1189a.append(str);
        this.f1189a.append(AbstractJsonLexerKt.COLON);
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitInnerClassType(String str) {
        b();
        this.f1189a.append('.');
        this.f1189a.append(str);
        this.d *= 2;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitInterfaceBound() {
        this.f1189a.append(AbstractJsonLexerKt.COLON);
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitParameterType() {
        a();
        if (!this.c) {
            this.c = true;
            this.f1189a.append('(');
        }
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitReturnType() {
        a();
        if (!this.c) {
            this.f1189a.append('(');
        }
        this.f1189a.append(')');
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitSuperclass() {
        a();
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitTypeArgument(char c) {
        int i = this.d;
        if (i % 2 == 0) {
            this.d = i + 1;
            this.f1189a.append(Typography.less);
        }
        if (c != '=') {
            this.f1189a.append(c);
        }
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitTypeVariable(String str) {
        this.f1189a.append('T');
        this.f1189a.append(str);
        this.f1189a.append(';');
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitClassBound() {
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitInterface() {
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitTypeArgument() {
        int i = this.d;
        if (i % 2 == 0) {
            this.d = i + 1;
            this.f1189a.append(Typography.less);
        }
        this.f1189a.append('*');
    }
}
