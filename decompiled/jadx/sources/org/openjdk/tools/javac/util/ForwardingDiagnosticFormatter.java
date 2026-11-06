package org.openjdk.tools.javac.util;

import java.util.Locale;
import java.util.Set;
import org.openjdk.javax.tools.Diagnostic;
import org.openjdk.tools.javac.api.DiagnosticFormatter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class ForwardingDiagnosticFormatter<D extends Diagnostic<?>, F extends DiagnosticFormatter<D>> implements DiagnosticFormatter<D> {
    protected ForwardingConfiguration configuration;
    protected F formatter;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ForwardingConfiguration implements DiagnosticFormatter.Configuration {
        protected DiagnosticFormatter.Configuration configuration;

        public ForwardingConfiguration(DiagnosticFormatter.Configuration configuration) {
            this.configuration = configuration;
        }

        public DiagnosticFormatter.Configuration getDelegatedConfiguration() {
            return this.configuration;
        }

        @Override // org.openjdk.tools.javac.api.DiagnosticFormatter.Configuration
        public int getMultilineLimit(DiagnosticFormatter.Configuration.MultilineLimit multilineLimit) {
            return this.configuration.getMultilineLimit(multilineLimit);
        }

        @Override // org.openjdk.tools.javac.api.DiagnosticFormatter.Configuration
        public Set<DiagnosticFormatter.Configuration.DiagnosticPart> getVisible() {
            return this.configuration.getVisible();
        }

        @Override // org.openjdk.tools.javac.api.DiagnosticFormatter.Configuration
        public void setMultilineLimit(DiagnosticFormatter.Configuration.MultilineLimit multilineLimit, int i) {
            this.configuration.setMultilineLimit(multilineLimit, i);
        }

        @Override // org.openjdk.tools.javac.api.DiagnosticFormatter.Configuration
        public void setVisible(Set<DiagnosticFormatter.Configuration.DiagnosticPart> set) {
            this.configuration.setVisible(set);
        }
    }

    public ForwardingDiagnosticFormatter(F f) {
        this.formatter = f;
        this.configuration = new ForwardingConfiguration(f.getConfiguration());
    }

    @Override // org.openjdk.tools.javac.api.DiagnosticFormatter
    public boolean displaySource(D d) {
        return this.formatter.displaySource(d);
    }

    @Override // org.openjdk.tools.javac.api.DiagnosticFormatter
    public String format(D d, Locale locale) {
        return this.formatter.format(d, locale);
    }

    @Override // org.openjdk.tools.javac.api.DiagnosticFormatter
    public String formatKind(D d, Locale locale) {
        return this.formatter.formatKind(d, locale);
    }

    @Override // org.openjdk.tools.javac.api.DiagnosticFormatter
    public String formatMessage(D d, Locale locale) {
        return this.formatter.formatMessage(d, locale);
    }

    @Override // org.openjdk.tools.javac.api.DiagnosticFormatter
    public String formatPosition(D d, DiagnosticFormatter.PositionKind positionKind, Locale locale) {
        return this.formatter.formatPosition(d, positionKind, locale);
    }

    @Override // org.openjdk.tools.javac.api.DiagnosticFormatter
    public String formatSource(D d, boolean z, Locale locale) {
        return this.formatter.formatSource(d, z, locale);
    }

    @Override // org.openjdk.tools.javac.api.DiagnosticFormatter
    public DiagnosticFormatter.Configuration getConfiguration() {
        return this.configuration;
    }

    public F getDelegatedFormatter() {
        return this.formatter;
    }
}
