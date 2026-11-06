package org.commonmark.internal;

import org.commonmark.parser.block.BlockContinue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class BlockContinueImpl extends BlockContinue {
    private final boolean finalize;
    private final int newColumn;
    private final int newIndex;

    public BlockContinueImpl(int i, int i2, boolean z) {
        this.newIndex = i;
        this.newColumn = i2;
        this.finalize = z;
    }

    public int getNewColumn() {
        return this.newColumn;
    }

    public int getNewIndex() {
        return this.newIndex;
    }

    public boolean isFinalize() {
        return this.finalize;
    }
}
