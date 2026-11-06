package com.google.auto.value.processor;

import autovalue.shaded.com.google.errorprone.annotations.FormatMethod;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.Element;
import javax.tools.Diagnostic;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class ErrorReporter {
    private int errorCount;
    private final Messager messager;

    public ErrorReporter(ProcessingEnvironment processingEnvironment) {
        this.messager = processingEnvironment.getMessager();
    }

    public void abortIfAnyError() {
        if (this.errorCount > 0) {
            throw new AbortProcessingException();
        }
    }

    @FormatMethod
    public AbortProcessingException abortWithError(Element element, String str, Object... objArr) {
        reportError(element, str, objArr);
        throw new AbortProcessingException();
    }

    public int errorCount() {
        return this.errorCount;
    }

    @FormatMethod
    public void reportError(Element element, String str, Object... objArr) {
        this.messager.printMessage(Diagnostic.Kind.ERROR, String.format(str, objArr), element);
        this.errorCount++;
    }

    @FormatMethod
    public void reportNote(Element element, String str, Object... objArr) {
        this.messager.printMessage(Diagnostic.Kind.NOTE, String.format(str, objArr), element);
    }

    @FormatMethod
    public void reportWarning(Element element, String str, Object... objArr) {
        this.messager.printMessage(Diagnostic.Kind.WARNING, String.format(str, objArr), element);
    }
}
