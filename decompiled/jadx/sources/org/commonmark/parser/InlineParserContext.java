package org.commonmark.parser;

import java.util.List;
import org.commonmark.node.LinkReferenceDefinition;
import org.commonmark.parser.delimiter.DelimiterProcessor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface InlineParserContext {
    List<DelimiterProcessor> getCustomDelimiterProcessors();

    LinkReferenceDefinition getLinkReferenceDefinition(String str);
}
