package org.apache.commons.text.diff;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ReplacementsFinder<T> implements CommandVisitor<T> {
    private final ReplacementsHandler<T> handler;
    private final List<T> pendingInsertions = new ArrayList();
    private final List<T> pendingDeletions = new ArrayList();
    private int skipped = 0;

    public ReplacementsFinder(ReplacementsHandler<T> replacementsHandler) {
        this.handler = replacementsHandler;
    }

    @Override // org.apache.commons.text.diff.CommandVisitor
    public void visitDeleteCommand(T t) {
        this.pendingDeletions.add(t);
    }

    @Override // org.apache.commons.text.diff.CommandVisitor
    public void visitInsertCommand(T t) {
        this.pendingInsertions.add(t);
    }

    @Override // org.apache.commons.text.diff.CommandVisitor
    public void visitKeepCommand(T t) {
        if (this.pendingDeletions.isEmpty() && this.pendingInsertions.isEmpty()) {
            this.skipped++;
            return;
        }
        this.handler.handleReplacement(this.skipped, this.pendingDeletions, this.pendingInsertions);
        this.pendingDeletions.clear();
        this.pendingInsertions.clear();
        this.skipped = 1;
    }
}
