package org.commonmark.parser;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.commonmark.Extension;
import org.commonmark.internal.DocumentParser;
import org.commonmark.internal.InlineParserContextImpl;
import org.commonmark.internal.InlineParserImpl;
import org.commonmark.internal.LinkReferenceDefinitions;
import org.commonmark.node.Block;
import org.commonmark.node.Node;
import org.commonmark.parser.block.BlockParserFactory;
import org.commonmark.parser.delimiter.DelimiterProcessor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Parser {
    private final List<BlockParserFactory> blockParserFactories;
    private final List<DelimiterProcessor> delimiterProcessors;
    private final IncludeSourceSpans includeSourceSpans;
    private final InlineParserFactory inlineParserFactory;
    private final List<PostProcessor> postProcessors;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private InlineParserFactory inlineParserFactory;
        private final List<BlockParserFactory> blockParserFactories = new ArrayList();
        private final List<DelimiterProcessor> delimiterProcessors = new ArrayList();
        private final List<PostProcessor> postProcessors = new ArrayList();
        private Set<Class<? extends Block>> enabledBlockTypes = DocumentParser.getDefaultBlockParserTypes();
        private IncludeSourceSpans includeSourceSpans = IncludeSourceSpans.NONE;

        /* JADX INFO: Access modifiers changed from: private */
        public InlineParserFactory getInlineParserFactory() {
            InlineParserFactory inlineParserFactory = this.inlineParserFactory;
            return inlineParserFactory != null ? inlineParserFactory : new InlineParserFactory() { // from class: org.commonmark.parser.Parser.Builder.1
                @Override // org.commonmark.parser.InlineParserFactory
                public InlineParser create(InlineParserContext inlineParserContext) {
                    return new InlineParserImpl(inlineParserContext);
                }
            };
        }

        public Parser build() {
            return new Parser(this);
        }

        public Builder customBlockParserFactory(BlockParserFactory blockParserFactory) {
            if (blockParserFactory != null) {
                this.blockParserFactories.add(blockParserFactory);
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("blockParserFactory must not be null");
            return null;
        }

        public Builder customDelimiterProcessor(DelimiterProcessor delimiterProcessor) {
            if (delimiterProcessor != null) {
                this.delimiterProcessors.add(delimiterProcessor);
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("delimiterProcessor must not be null");
            return null;
        }

        public Builder enabledBlockTypes(Set<Class<? extends Block>> set) {
            if (set == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("enabledBlockTypes must not be null");
                return null;
            }
            DocumentParser.checkEnabledBlockTypes(set);
            this.enabledBlockTypes = set;
            return this;
        }

        public Builder extensions(Iterable<? extends Extension> iterable) {
            if (iterable == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("extensions must not be null");
                return null;
            }
            for (Extension extension : iterable) {
                if (extension instanceof ParserExtension) {
                    ((ParserExtension) extension).extend(this);
                }
            }
            return this;
        }

        public Builder includeSourceSpans(IncludeSourceSpans includeSourceSpans) {
            this.includeSourceSpans = includeSourceSpans;
            return this;
        }

        public Builder inlineParserFactory(InlineParserFactory inlineParserFactory) {
            this.inlineParserFactory = inlineParserFactory;
            return this;
        }

        public Builder postProcessor(PostProcessor postProcessor) {
            if (postProcessor != null) {
                this.postProcessors.add(postProcessor);
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("postProcessor must not be null");
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ParserExtension extends Extension {
        void extend(Builder builder);
    }

    private Parser(Builder builder) {
        this.blockParserFactories = DocumentParser.calculateBlockParserFactories(builder.blockParserFactories, builder.enabledBlockTypes);
        InlineParserFactory inlineParserFactory = builder.getInlineParserFactory();
        this.inlineParserFactory = inlineParserFactory;
        this.postProcessors = builder.postProcessors;
        List<DelimiterProcessor> list = builder.delimiterProcessors;
        this.delimiterProcessors = list;
        this.includeSourceSpans = builder.includeSourceSpans;
        inlineParserFactory.create(new InlineParserContextImpl(list, new LinkReferenceDefinitions()));
    }

    public static Builder builder() {
        return new Builder();
    }

    private DocumentParser createDocumentParser() {
        return new DocumentParser(this.blockParserFactories, this.inlineParserFactory, this.delimiterProcessors, this.includeSourceSpans);
    }

    private Node postProcess(Node node) {
        Iterator<PostProcessor> it2 = this.postProcessors.iterator();
        while (it2.hasNext()) {
            node = it2.next().process(node);
        }
        return node;
    }

    public Node parse(String str) {
        if (str != null) {
            return postProcess(createDocumentParser().parse(str));
        }
        Single$$ExternalSyntheticBUOutline0.m$1("input must not be null");
        return null;
    }

    public Node parseReader(Reader reader) throws IOException {
        if (reader != null) {
            return postProcess(createDocumentParser().parse(reader));
        }
        Single$$ExternalSyntheticBUOutline0.m$1("input must not be null");
        return null;
    }
}
