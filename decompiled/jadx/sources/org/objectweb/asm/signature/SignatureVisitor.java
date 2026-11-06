package org.objectweb.asm.signature;

import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public abstract class SignatureVisitor {
    public static final char EXTENDS = '+';
    public static final char INSTANCEOF = '=';
    public static final char SUPER = '-';
    protected final int api;

    public SignatureVisitor(int i) {
        if (i == 262144 || i == 327680) {
            this.api = i;
        } else {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
    }

    public void visitTypeArgument() {
    }

    public SignatureVisitor visitArrayType() {
        return this;
    }

    public SignatureVisitor visitClassBound() {
        return this;
    }

    public void visitEnd() {
    }

    public SignatureVisitor visitExceptionType() {
        return this;
    }

    public SignatureVisitor visitInterface() {
        return this;
    }

    public SignatureVisitor visitInterfaceBound() {
        return this;
    }

    public SignatureVisitor visitParameterType() {
        return this;
    }

    public SignatureVisitor visitReturnType() {
        return this;
    }

    public SignatureVisitor visitSuperclass() {
        return this;
    }

    public void visitBaseType(char c) {
    }

    public void visitClassType(String str) {
    }

    public void visitFormalTypeParameter(String str) {
    }

    public void visitInnerClassType(String str) {
    }

    public SignatureVisitor visitTypeArgument(char c) {
        return this;
    }

    public void visitTypeVariable(String str) {
    }
}
