package org.commonmark.parser.block;

import org.commonmark.node.Block;
import org.commonmark.node.SourceSpan;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.SourceLine;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface BlockParser {
    void addLine(SourceLine sourceLine);

    void addSourceSpan(SourceSpan sourceSpan);

    boolean canContain(Block block);

    boolean canHaveLazyContinuationLines();

    void closeBlock();

    Block getBlock();

    boolean isContainer();

    void parseInlines(InlineParser inlineParser);

    BlockContinue tryContinue(ParserState parserState);
}
