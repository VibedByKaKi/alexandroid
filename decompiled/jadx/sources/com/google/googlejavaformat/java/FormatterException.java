package com.google.googlejavaformat.java;

import com.google.common.collect.ImmutableList;
import com.google.googlejavaformat.FormatterDiagnostic;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class FormatterException extends Exception {
    private ImmutableList<FormatterDiagnostic> diagnostics;

    public FormatterException(Iterable<FormatterDiagnostic> iterable) {
        super(iterable.iterator().next().toString());
        this.diagnostics = ImmutableList.copyOf(iterable);
    }

    public List<FormatterDiagnostic> diagnostics() {
        return this.diagnostics;
    }

    public FormatterException(FormatterDiagnostic formatterDiagnostic) {
        this(ImmutableList.of(formatterDiagnostic));
    }

    public FormatterException(String str) {
        this(FormatterDiagnostic.create(str));
    }
}
