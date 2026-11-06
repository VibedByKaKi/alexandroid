package org.commonmark.internal;

import java.util.List;
import org.commonmark.node.LinkReferenceDefinition;
import org.commonmark.parser.InlineParserContext;
import org.commonmark.parser.delimiter.DelimiterProcessor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class InlineParserContextImpl implements InlineParserContext {
    private final List<DelimiterProcessor> delimiterProcessors;
    private final LinkReferenceDefinitions linkReferenceDefinitions;

    public InlineParserContextImpl(List<DelimiterProcessor> list, LinkReferenceDefinitions linkReferenceDefinitions) {
        this.delimiterProcessors = list;
        this.linkReferenceDefinitions = linkReferenceDefinitions;
    }

    @Override // org.commonmark.parser.InlineParserContext
    public List<DelimiterProcessor> getCustomDelimiterProcessors() {
        return this.delimiterProcessors;
    }

    @Override // org.commonmark.parser.InlineParserContext
    public LinkReferenceDefinition getLinkReferenceDefinition(String str) {
        return this.linkReferenceDefinitions.get(str);
    }
}
