package org.commonmark.parser.block;

import org.commonmark.node.Block;
import org.commonmark.node.SourceSpan;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.SourceLine;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class AbstractBlockParser implements BlockParser {
    @Override // org.commonmark.parser.block.BlockParser
    public void addSourceSpan(SourceSpan sourceSpan) {
        getBlock().addSourceSpan(sourceSpan);
    }

    @Override // org.commonmark.parser.block.BlockParser
    public boolean canContain(Block block) {
        return false;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public boolean canHaveLazyContinuationLines() {
        return false;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public boolean isContainer() {
        return false;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public void closeBlock() {
    }

    @Override // org.commonmark.parser.block.BlockParser
    public void addLine(SourceLine sourceLine) {
    }

    @Override // org.commonmark.parser.block.BlockParser
    public void parseInlines(InlineParser inlineParser) {
    }
}
