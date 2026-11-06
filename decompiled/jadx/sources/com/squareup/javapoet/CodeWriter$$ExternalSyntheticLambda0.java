package com.squareup.javapoet;

import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class CodeWriter$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CodeWriter f$0;

    public /* synthetic */ CodeWriter$$ExternalSyntheticLambda0(CodeWriter codeWriter, int i) {
        this.$r8$classId = i;
        this.f$0 = codeWriter;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        CodeWriter codeWriter = this.f$0;
        TypeVariableName typeVariableName = (TypeVariableName) obj;
        switch (i) {
            case 0:
                codeWriter.lambda$popTypeVariables$1(typeVariableName);
                break;
            default:
                codeWriter.lambda$emitTypeVariables$0(typeVariableName);
                break;
        }
    }
}
