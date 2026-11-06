package org.commonmark.parser.block;

import org.commonmark.parser.SourceLines;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface MatchedBlockParser {
    BlockParser getMatchedBlockParser();

    SourceLines getParagraphLines();
}
