package com.google.googlejavaformat;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.Range;
import com.google.googlejavaformat.Input;
import com.google.googlejavaformat.OpsBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public abstract class Output extends InputOutput {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class BreakTag {
        Optional<Boolean> taken = Optional.absent();

        public void recordBroken(boolean z) {
            this.taken = Optional.of(Boolean.valueOf(z));
        }

        public boolean wasBreakTaken() {
            return this.taken.or((Optional<Boolean>) Boolean.FALSE).booleanValue();
        }
    }

    public abstract void append(String str, Range<Integer> range);

    public abstract void blankLine(int i, OpsBuilder.BlankLineWanted blankLineWanted);

    public abstract CommentsHelper getCommentsHelper();

    public abstract void indent(int i);

    public abstract void markForPartialFormat(Input.Token token, Input.Token token2);

    @Override // com.google.googlejavaformat.InputOutput
    public String toString() {
        return MoreObjects.toStringHelper(this).add("super", super.toString()).toString();
    }
}
