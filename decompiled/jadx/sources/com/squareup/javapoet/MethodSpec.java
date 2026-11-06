package com.squareup.javapoet;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.squareup.javapoet.CodeBlock;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.ExecutableType;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Types;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class MethodSpec {
    static final String CONSTRUCTOR = "<init>";
    public final List<AnnotationSpec> annotations;
    public final CodeBlock code;
    public final CodeBlock defaultValue;
    public final List<TypeName> exceptions;
    public final CodeBlock javadoc;
    public final Set<Modifier> modifiers;
    public final String name;
    public final List<ParameterSpec> parameters;
    public final TypeName returnType;
    public final List<TypeVariableName> typeVariables;
    public final boolean varargs;

    private MethodSpec(Builder builder) {
        CodeBlock build = builder.code.build();
        boolean z = true;
        Util.checkArgument(build.isEmpty() || !builder.modifiers.contains(Modifier.ABSTRACT), "abstract method %s cannot have code", builder.name);
        if (builder.varargs && !lastParameterIsArray(builder.parameters)) {
            z = false;
        }
        Util.checkArgument(z, "last parameter of varargs method %s must be an array", builder.name);
        this.name = (String) Util.checkNotNull(builder.name, "name == null", new Object[0]);
        this.javadoc = builder.javadoc.build();
        this.annotations = Util.immutableList(builder.annotations);
        this.modifiers = Util.immutableSet(builder.modifiers);
        this.typeVariables = Util.immutableList(builder.typeVariables);
        this.returnType = builder.returnType;
        this.parameters = Util.immutableList(builder.parameters);
        this.varargs = builder.varargs;
        this.exceptions = Util.immutableList(builder.exceptions);
        this.defaultValue = builder.defaultValue;
        this.code = build;
    }

    public static Builder constructorBuilder() {
        return new Builder(CONSTRUCTOR);
    }

    private CodeBlock javadocWithParameters() {
        CodeBlock.Builder builder = this.javadoc.toBuilder();
        boolean z = true;
        for (ParameterSpec parameterSpec : this.parameters) {
            if (!parameterSpec.javadoc.isEmpty()) {
                if (z && !this.javadoc.isEmpty()) {
                    builder.add("\n", new Object[0]);
                }
                builder.add("@param $L $L", parameterSpec.name, parameterSpec.javadoc);
                z = false;
            }
        }
        return builder.build();
    }

    private boolean lastParameterIsArray(List<ParameterSpec> list) {
        return (list.isEmpty() || TypeName.asArray(((ParameterSpec) ErrorUtils$$ExternalSyntheticOutline0.m(list, 1)).type) == null) ? false : true;
    }

    public static Builder methodBuilder(String str) {
        return new Builder(str);
    }

    public static Builder overriding(ExecutableElement executableElement) {
        Util.checkNotNull(executableElement, "method == null", new Object[0]);
        Element enclosingElement = executableElement.getEnclosingElement();
        if (enclosingElement.getModifiers().contains(Modifier.FINAL)) {
            Gson$$ExternalSyntheticBUOutline0.m((Object) enclosingElement, "Cannot override method on final class ");
            return null;
        }
        Set modifiers = executableElement.getModifiers();
        if (modifiers.contains(Modifier.PRIVATE) || modifiers.contains(Modifier.FINAL) || modifiers.contains(Modifier.STATIC)) {
            Gson$$ExternalSyntheticBUOutline0.m((Object) modifiers, "cannot override method with modifiers: ");
            return null;
        }
        Builder methodBuilder = methodBuilder(executableElement.getSimpleName().toString());
        methodBuilder.addAnnotation(Override.class);
        LinkedHashSet linkedHashSet = new LinkedHashSet(modifiers);
        linkedHashSet.remove(Modifier.ABSTRACT);
        linkedHashSet.remove(Modifier.DEFAULT);
        methodBuilder.addModifiers(linkedHashSet);
        Iterator it2 = executableElement.getTypeParameters().iterator();
        while (it2.hasNext()) {
            methodBuilder.addTypeVariable(TypeVariableName.get(((TypeParameterElement) it2.next()).asType()));
        }
        methodBuilder.returns(TypeName.get(executableElement.getReturnType()));
        methodBuilder.addParameters(ParameterSpec.parametersOf(executableElement));
        methodBuilder.varargs(executableElement.isVarArgs());
        Iterator it3 = executableElement.getThrownTypes().iterator();
        while (it3.hasNext()) {
            methodBuilder.addException(TypeName.get((TypeMirror) it3.next()));
        }
        return methodBuilder;
    }

    public void emit(CodeWriter codeWriter, String str, Set<Modifier> set) throws IOException {
        codeWriter.emitJavadoc(javadocWithParameters());
        codeWriter.emitAnnotations(this.annotations, false);
        codeWriter.emitModifiers(this.modifiers, set);
        if (!this.typeVariables.isEmpty()) {
            codeWriter.emitTypeVariables(this.typeVariables);
            codeWriter.emit(" ");
        }
        if (isConstructor()) {
            codeWriter.emit("$L($Z", str);
        } else {
            codeWriter.emit("$T $L($Z", this.returnType, this.name);
        }
        Iterator<ParameterSpec> it2 = this.parameters.iterator();
        boolean z = true;
        while (it2.hasNext()) {
            ParameterSpec next = it2.next();
            if (!z) {
                codeWriter.emit(",").emitWrappingSpace();
            }
            next.emit(codeWriter, !it2.hasNext() && this.varargs);
            z = false;
        }
        codeWriter.emit(MarkdownConstants.RIGHT_PARENTHESIS);
        CodeBlock codeBlock = this.defaultValue;
        if (codeBlock != null && !codeBlock.isEmpty()) {
            codeWriter.emit(" default ");
            codeWriter.emit(this.defaultValue);
        }
        if (!this.exceptions.isEmpty()) {
            codeWriter.emitWrappingSpace().emit("throws");
            boolean z2 = true;
            for (TypeName typeName : this.exceptions) {
                if (!z2) {
                    codeWriter.emit(",");
                }
                codeWriter.emitWrappingSpace().emit("$T", typeName);
                z2 = false;
            }
        }
        if (hasModifier(Modifier.ABSTRACT)) {
            codeWriter.emit(";\n");
        } else if (hasModifier(Modifier.NATIVE)) {
            codeWriter.emit(this.code);
            codeWriter.emit(";\n");
        } else {
            codeWriter.emit(" {\n");
            codeWriter.indent();
            codeWriter.emit(this.code, true);
            codeWriter.unindent();
            codeWriter.emit("}\n");
        }
        codeWriter.popTypeVariables(this.typeVariables);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MethodSpec.class == obj.getClass()) {
            return toString().equals(obj.toString());
        }
        return false;
    }

    public boolean hasModifier(Modifier modifier) {
        return this.modifiers.contains(modifier);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public boolean isConstructor() {
        return this.name.equals(CONSTRUCTOR);
    }

    public Builder toBuilder() {
        Builder builder = new Builder(this.name);
        builder.javadoc.add(this.javadoc);
        builder.annotations.addAll(this.annotations);
        builder.modifiers.addAll(this.modifiers);
        builder.typeVariables.addAll(this.typeVariables);
        builder.returnType = this.returnType;
        builder.parameters.addAll(this.parameters);
        builder.exceptions.addAll(this.exceptions);
        builder.code.add(this.code);
        builder.varargs = this.varargs;
        builder.defaultValue = this.defaultValue;
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            emit(new CodeWriter(sb), "Constructor", Collections.EMPTY_SET);
            return sb.toString();
        } catch (IOException unused) {
            Buffer$$ExternalSyntheticBUOutline0.m$2();
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        public final List<AnnotationSpec> annotations;
        private final CodeBlock.Builder code;
        private CodeBlock defaultValue;
        private final Set<TypeName> exceptions;
        private final CodeBlock.Builder javadoc;
        public final List<Modifier> modifiers;
        private String name;
        public final List<ParameterSpec> parameters;
        private TypeName returnType;
        public final List<TypeVariableName> typeVariables;
        private boolean varargs;

        private Builder(String str) {
            this.javadoc = CodeBlock.builder();
            this.exceptions = new LinkedHashSet();
            this.code = CodeBlock.builder();
            this.typeVariables = new ArrayList();
            this.annotations = new ArrayList();
            this.modifiers = new ArrayList();
            this.parameters = new ArrayList();
            setName(str);
        }

        public Builder addAnnotation(ClassName className) {
            this.annotations.add(AnnotationSpec.builder(className).build());
            return this;
        }

        public Builder addAnnotations(Iterable<AnnotationSpec> iterable) {
            Util.checkArgument(iterable != null, "annotationSpecs == null", new Object[0]);
            Iterator<AnnotationSpec> it2 = iterable.iterator();
            while (it2.hasNext()) {
                this.annotations.add(it2.next());
            }
            return this;
        }

        public Builder addCode(String str, Object... objArr) {
            this.code.add(str, objArr);
            return this;
        }

        public Builder addComment(String str, Object... objArr) {
            this.code.add("// " + str + "\n", objArr);
            return this;
        }

        public Builder addException(Type type) {
            return addException(TypeName.get(type));
        }

        public Builder addExceptions(Iterable<? extends TypeName> iterable) {
            Util.checkArgument(iterable != null, "exceptions == null", new Object[0]);
            Iterator<? extends TypeName> it2 = iterable.iterator();
            while (it2.hasNext()) {
                this.exceptions.add(it2.next());
            }
            return this;
        }

        public Builder addJavadoc(String str, Object... objArr) {
            this.javadoc.add(str, objArr);
            return this;
        }

        public Builder addModifiers(Iterable<Modifier> iterable) {
            Util.checkNotNull(iterable, "modifiers == null", new Object[0]);
            Iterator<Modifier> it2 = iterable.iterator();
            while (it2.hasNext()) {
                this.modifiers.add(it2.next());
            }
            return this;
        }

        public Builder addNamedCode(String str, Map<String, ?> map) {
            this.code.addNamed(str, map);
            return this;
        }

        public Builder addParameter(TypeName typeName, String str, Modifier... modifierArr) {
            return addParameter(ParameterSpec.builder(typeName, str, modifierArr).build());
        }

        public Builder addParameters(Iterable<ParameterSpec> iterable) {
            Util.checkArgument(iterable != null, "parameterSpecs == null", new Object[0]);
            Iterator<ParameterSpec> it2 = iterable.iterator();
            while (it2.hasNext()) {
                this.parameters.add(it2.next());
            }
            return this;
        }

        public Builder addStatement(String str, Object... objArr) {
            this.code.addStatement(str, objArr);
            return this;
        }

        public Builder addTypeVariable(TypeVariableName typeVariableName) {
            this.typeVariables.add(typeVariableName);
            return this;
        }

        public Builder addTypeVariables(Iterable<TypeVariableName> iterable) {
            Util.checkArgument(iterable != null, "typeVariables == null", new Object[0]);
            Iterator<TypeVariableName> it2 = iterable.iterator();
            while (it2.hasNext()) {
                this.typeVariables.add(it2.next());
            }
            return this;
        }

        public Builder beginControlFlow(CodeBlock codeBlock) {
            return beginControlFlow("$L", codeBlock);
        }

        public MethodSpec build() {
            return new MethodSpec(this);
        }

        public Builder defaultValue(CodeBlock codeBlock) {
            Util.checkState(this.defaultValue == null, "defaultValue was already set", new Object[0]);
            this.defaultValue = (CodeBlock) Util.checkNotNull(codeBlock, "codeBlock == null", new Object[0]);
            return this;
        }

        public Builder endControlFlow(CodeBlock codeBlock) {
            return endControlFlow("$L", codeBlock);
        }

        public Builder nextControlFlow(CodeBlock codeBlock) {
            return nextControlFlow("$L", codeBlock);
        }

        public Builder returns(TypeName typeName) {
            Util.checkState(!this.name.equals(MethodSpec.CONSTRUCTOR), "constructor cannot have return type.", new Object[0]);
            this.returnType = typeName;
            return this;
        }

        public Builder setName(String str) {
            Util.checkNotNull(str, "name == null", new Object[0]);
            Util.checkArgument(str.equals(MethodSpec.CONSTRUCTOR) || SourceVersion.isName(str), "not a valid name: %s", str);
            this.name = str;
            this.returnType = str.equals(MethodSpec.CONSTRUCTOR) ? null : TypeName.VOID;
            return this;
        }

        public Builder varargs() {
            return varargs(true);
        }

        public Builder addCode(CodeBlock codeBlock) {
            this.code.add(codeBlock);
            return this;
        }

        public Builder addJavadoc(CodeBlock codeBlock) {
            this.javadoc.add(codeBlock);
            return this;
        }

        public Builder addStatement(CodeBlock codeBlock) {
            this.code.addStatement(codeBlock);
            return this;
        }

        public Builder varargs(boolean z) {
            this.varargs = z;
            return this;
        }

        public Builder addException(TypeName typeName) {
            this.exceptions.add(typeName);
            return this;
        }

        public Builder beginControlFlow(String str, Object... objArr) {
            this.code.beginControlFlow(str, objArr);
            return this;
        }

        public Builder endControlFlow(String str, Object... objArr) {
            this.code.endControlFlow(str, objArr);
            return this;
        }

        public Builder nextControlFlow(String str, Object... objArr) {
            this.code.nextControlFlow(str, objArr);
            return this;
        }

        public Builder endControlFlow() {
            this.code.endControlFlow();
            return this;
        }

        public Builder addParameter(ParameterSpec parameterSpec) {
            this.parameters.add(parameterSpec);
            return this;
        }

        public Builder addAnnotation(AnnotationSpec annotationSpec) {
            this.annotations.add(annotationSpec);
            return this;
        }

        public Builder addParameter(Type type, String str, Modifier... modifierArr) {
            return addParameter(TypeName.get(type), str, modifierArr);
        }

        public Builder addAnnotation(Class<?> cls) {
            return addAnnotation(ClassName.get(cls));
        }

        public Builder returns(Type type) {
            return returns(TypeName.get(type));
        }

        public Builder defaultValue(String str, Object... objArr) {
            return defaultValue(CodeBlock.of(str, objArr));
        }

        public Builder addModifiers(Modifier... modifierArr) {
            Util.checkNotNull(modifierArr, "modifiers == null", new Object[0]);
            Collections.addAll(this.modifiers, modifierArr);
            return this;
        }
    }

    public static Builder overriding(ExecutableElement executableElement, DeclaredType declaredType, Types types) {
        ExecutableType asMemberOf = types.asMemberOf(declaredType, executableElement);
        List parameterTypes = asMemberOf.getParameterTypes();
        List thrownTypes = asMemberOf.getThrownTypes();
        TypeMirror returnType = asMemberOf.getReturnType();
        Builder overriding = overriding(executableElement);
        overriding.returns(TypeName.get(returnType));
        int size = overriding.parameters.size();
        for (int i = 0; i < size; i++) {
            ParameterSpec parameterSpec = overriding.parameters.get(i);
            overriding.parameters.set(i, parameterSpec.toBuilder(TypeName.get((TypeMirror) parameterTypes.get(i)), parameterSpec.name).build());
        }
        overriding.exceptions.clear();
        int size2 = thrownTypes.size();
        for (int i2 = 0; i2 < size2; i2++) {
            overriding.addException(TypeName.get((TypeMirror) thrownTypes.get(i2)));
        }
        return overriding;
    }
}
