package com.google.auto.value.processor;

import autovalue.shaded.com.google.auto.common.MoreTypes;
import autovalue.shaded.com.google.common.collect.ImmutableList;
import java.util.List;
import javax.lang.model.element.Name;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class EclipseHack {
    private EclipseHack() {
    }

    public static TypeMirror getEnclosingType(DeclaredType declaredType) {
        TypeMirror enclosingType = declaredType.getEnclosingType();
        if (!enclosingType.getKind().equals(TypeKind.DECLARED) || !enclosingType.getClass().getName().contains("eclipse")) {
            return enclosingType;
        }
        DeclaredType asDeclared = MoreTypes.asDeclared(enclosingType);
        List typeArguments = asDeclared.getTypeArguments();
        if (typeArguments.isEmpty() || !typeArguments.stream().allMatch(new EclipseHack$$ExternalSyntheticLambda0()) || !((ImmutableList) typeArguments.stream().map(new EclipseHack$$ExternalSyntheticLambda1()).collect(ImmutableList.toImmutableList())).equals((ImmutableList) MoreTypes.asTypeElement(asDeclared).getTypeParameters().stream().map(new EclipseHack$$ExternalSyntheticLambda2()).collect(ImmutableList.toImmutableList()))) {
            return asDeclared;
        }
        while (enclosingType.getKind().equals(TypeKind.DECLARED)) {
            enclosingType = MoreTypes.asDeclared(enclosingType).getEnclosingType();
        }
        return enclosingType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getEnclosingType$0(TypeMirror typeMirror) {
        return typeMirror.getKind().equals(TypeKind.TYPEVAR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Name lambda$getEnclosingType$1(TypeMirror typeMirror) {
        return MoreTypes.asTypeVariable(typeMirror).asElement().getSimpleName();
    }
}
