package com.google.auto.value.processor;

import autovalue.shaded.com.google.auto.common.MoreElements;
import autovalue.shaded.com.google.auto.common.MoreStreams;
import autovalue.shaded.com.google.common.base.VerifyException;
import autovalue.shaded.com.google.common.collect.ImmutableList;
import autovalue.shaded.com.google.common.collect.ImmutableSet;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.stream.Collectors;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class Executable {
    private final ExecutableElement executableElement;
    private final ImmutableSet<String> optionalParameters;
    private final ImmutableList<VariableElement> parameters;
    private final ImmutableList<TypeParameterElement> typeParameters;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.google.auto.value.processor.Executable$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$javax$lang$model$element$ElementKind;

        static {
            int[] iArr = new int[ElementKind.values().length];
            $SwitchMap$javax$lang$model$element$ElementKind = iArr;
            try {
                iArr[ElementKind.CONSTRUCTOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$javax$lang$model$element$ElementKind[ElementKind.METHOD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private Executable(ExecutableElement executableElement, ImmutableSet<String> immutableSet) {
        this.executableElement = executableElement;
        this.parameters = ImmutableList.copyOf((Collection) executableElement.getParameters());
        this.optionalParameters = immutableSet;
        int i = AnonymousClass1.$SwitchMap$javax$lang$model$element$ElementKind[executableElement.getKind().ordinal()];
        if (i == 1) {
            this.typeParameters = ImmutableList.builder().addAll((Iterable) MoreElements.asType(executableElement.getEnclosingElement()).getTypeParameters()).addAll((Iterable) executableElement.getTypeParameters()).build();
        } else {
            if (i == 2) {
                this.typeParameters = ImmutableList.copyOf((Collection) executableElement.getTypeParameters());
                return;
            }
            throw new VerifyException("Unexpected executable kind " + executableElement.getKind());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$parameterNames$0(VariableElement variableElement) {
        return variableElement.getSimpleName().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$toString$1(VariableElement variableElement) {
        return variableElement.asType() + " " + variableElement.getSimpleName();
    }

    public static Executable of(ExecutableElement executableElement) {
        return of(executableElement, ImmutableSet.of());
    }

    public TypeMirror builtType() {
        int i = AnonymousClass1.$SwitchMap$javax$lang$model$element$ElementKind[this.executableElement.getKind().ordinal()];
        if (i == 1) {
            return this.executableElement.getEnclosingElement().asType();
        }
        ExecutableElement executableElement = this.executableElement;
        if (i == 2) {
            return executableElement.getReturnType();
        }
        throw new VerifyException("Unexpected executable kind " + executableElement.getKind());
    }

    public ExecutableElement executableElement() {
        return this.executableElement;
    }

    public String invoke() {
        TypeElement asType = MoreElements.asType(this.executableElement.getEnclosingElement());
        String encodeRaw = TypeEncoder.encodeRaw(asType.asType());
        int i = AnonymousClass1.$SwitchMap$javax$lang$model$element$ElementKind[this.executableElement.getKind().ordinal()];
        if (i == 1) {
            return a$$ExternalSyntheticOutline0.m("new ", encodeRaw, !asType.getTypeParameters().isEmpty() ? "<>" : "");
        }
        if (i == 2) {
            StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(encodeRaw, ".");
            m1m.append(this.executableElement.getSimpleName());
            return m1m.toString();
        }
        throw new VerifyException("Unexpected executable kind " + this.executableElement.getKind());
    }

    public boolean isOptional(String str) {
        return this.optionalParameters.contains(str);
    }

    public int optionalParameterCount() {
        return this.optionalParameters.size();
    }

    public ImmutableList<String> parameterNames() {
        return (ImmutableList) this.parameters.stream().map(new Executable$$ExternalSyntheticLambda1()).collect(MoreStreams.toImmutableList());
    }

    public ImmutableList<VariableElement> parameters() {
        return this.parameters;
    }

    public String toString() {
        Element element = this.executableElement;
        return (element.getKind() == ElementKind.CONSTRUCTOR ? element.getEnclosingElement() : element).getSimpleName() + ((String) element.getParameters().stream().map(new Executable$$ExternalSyntheticLambda0()).collect(Collectors.joining(", ", MarkdownConstants.LEFT_PARENTHESIS, MarkdownConstants.RIGHT_PARENTHESIS)));
    }

    public ImmutableList<TypeParameterElement> typeParameters() {
        return this.typeParameters;
    }

    public static Executable of(ExecutableElement executableElement, ImmutableSet<String> immutableSet) {
        return new Executable(executableElement, immutableSet);
    }
}
