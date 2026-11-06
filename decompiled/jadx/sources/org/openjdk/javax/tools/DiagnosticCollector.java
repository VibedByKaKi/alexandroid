package org.openjdk.javax.tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class DiagnosticCollector<S> implements DiagnosticListener<S> {
    private List<Diagnostic<? extends S>> diagnostics = Collections.synchronizedList(new ArrayList());

    public List<Diagnostic<? extends S>> getDiagnostics() {
        return Collections.unmodifiableList(this.diagnostics);
    }

    @Override // org.openjdk.javax.tools.DiagnosticListener
    public void report(Diagnostic<? extends S> diagnostic) {
        Objects.requireNonNull(diagnostic);
        this.diagnostics.add(diagnostic);
    }
}
