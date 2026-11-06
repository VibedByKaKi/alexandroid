package org.commonmark.parser.block;

import org.commonmark.internal.BlockContinueImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class BlockContinue {
    public static BlockContinue atColumn(int i) {
        return new BlockContinueImpl(-1, i, false);
    }

    public static BlockContinue atIndex(int i) {
        return new BlockContinueImpl(i, -1, false);
    }

    public static BlockContinue finished() {
        return new BlockContinueImpl(-1, -1, true);
    }

    public static BlockContinue none() {
        return null;
    }
}
