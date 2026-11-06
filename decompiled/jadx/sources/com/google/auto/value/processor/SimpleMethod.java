package com.google.auto.value.processor;

import java.util.Set;
import java.util.stream.Collectors;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class SimpleMethod {
    private final String access;
    private final String name;
    private final String throwsString;

    public SimpleMethod(ExecutableElement executableElement) {
        this.access = access(executableElement);
        this.name = executableElement.getSimpleName().toString();
        this.throwsString = throwsString(executableElement);
    }

    public static String access(ExecutableElement executableElement) {
        Set modifiers = executableElement.getModifiers();
        return modifiers.contains(Modifier.PUBLIC) ? "public " : modifiers.contains(Modifier.PROTECTED) ? "protected " : "";
    }

    private static String throwsString(ExecutableElement executableElement) {
        if (executableElement.getThrownTypes().isEmpty()) {
            return "";
        }
        return "throws " + ((String) executableElement.getThrownTypes().stream().map(new SimpleMethod$$ExternalSyntheticLambda0()).collect(Collectors.joining(", ")));
    }

    public String getAccess() {
        return this.access;
    }

    public String getName() {
        return this.name;
    }

    public String getThrows() {
        return this.throwsString;
    }
}
