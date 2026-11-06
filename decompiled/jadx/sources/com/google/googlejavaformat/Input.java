package com.google.googlejavaformat;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableRangeMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public abstract class Input extends InputOutput {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Tok {
        int getColumn();

        int getIndex();

        String getOriginalText();

        int getPosition();

        String getText();

        boolean isComment();

        boolean isJavadocComment();

        boolean isNewline();

        boolean isSlashSlashComment();

        boolean isSlashStarComment();

        int length();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Token {
        Tok getTok();

        ImmutableList<? extends Tok> getToksAfter();

        ImmutableList<? extends Tok> getToksBefore();
    }

    public FormatterDiagnostic createDiagnostic(int i, String str) {
        return FormatterDiagnostic.create(getLineNumber(i), getColumnNumber(i), str);
    }

    public abstract int getColumnNumber(int i);

    public abstract int getLineNumber(int i);

    public abstract ImmutableMap<Integer, Integer> getPositionToColumnMap();

    public abstract ImmutableRangeMap<Integer, ? extends Token> getPositionTokenMap();

    public abstract String getText();

    public abstract ImmutableList<? extends Token> getTokens();

    @Override // com.google.googlejavaformat.InputOutput
    public String toString() {
        return MoreObjects.toStringHelper(this).add("super", super.toString()).toString();
    }
}
