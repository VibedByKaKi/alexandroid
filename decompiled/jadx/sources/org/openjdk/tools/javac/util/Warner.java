package org.openjdk.tools.javac.util;

import java.util.EnumSet;
import org.openjdk.tools.javac.code.Lint;
import org.openjdk.tools.javac.util.JCDiagnostic;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class Warner {
    private EnumSet<Lint.LintCategory> nonSilentLintSet;
    private JCDiagnostic.DiagnosticPosition pos;
    private EnumSet<Lint.LintCategory> silentLintSet;
    protected boolean warned;

    public Warner(JCDiagnostic.DiagnosticPosition diagnosticPosition) {
        this.pos = null;
        this.warned = false;
        this.nonSilentLintSet = EnumSet.noneOf(Lint.LintCategory.class);
        this.silentLintSet = EnumSet.noneOf(Lint.LintCategory.class);
        this.pos = diagnosticPosition;
    }

    public void clear() {
        this.nonSilentLintSet.clear();
        this.silentLintSet.clear();
        this.warned = false;
    }

    public boolean hasLint(Lint.LintCategory lintCategory) {
        return hasSilentLint(lintCategory) || hasNonSilentLint(lintCategory);
    }

    public boolean hasNonSilentLint(Lint.LintCategory lintCategory) {
        return this.nonSilentLintSet.contains(lintCategory);
    }

    public boolean hasSilentLint(Lint.LintCategory lintCategory) {
        return this.silentLintSet.contains(lintCategory);
    }

    public JCDiagnostic.DiagnosticPosition pos() {
        return this.pos;
    }

    public void silentWarn(Lint.LintCategory lintCategory) {
        this.silentLintSet.add(lintCategory);
    }

    public void warn(Lint.LintCategory lintCategory) {
        this.nonSilentLintSet.add(lintCategory);
    }

    public Warner() {
        this(null);
    }
}
