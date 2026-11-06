package org.commonmark.parser.block;

import org.commonmark.internal.BlockStartImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class BlockStart {
    public static BlockStart none() {
        return null;
    }

    public static BlockStart of(BlockParser... blockParserArr) {
        return new BlockStartImpl(blockParserArr);
    }

    public abstract BlockStart atColumn(int i);

    public abstract BlockStart atIndex(int i);

    public abstract BlockStart replaceActiveBlockParser();
}
