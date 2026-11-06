package org.commonmark.ext.gfm.strikethrough.internal;

import com.fasterxml.jackson.core.JsonPointer;
import org.commonmark.ext.gfm.strikethrough.Strikethrough;
import org.commonmark.node.Node;
import org.commonmark.node.Nodes;
import org.commonmark.node.SourceSpans;
import org.commonmark.node.Text;
import org.commonmark.parser.delimiter.DelimiterProcessor;
import org.commonmark.parser.delimiter.DelimiterRun;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class StrikethroughDelimiterProcessor implements DelimiterProcessor {
    private final boolean requireTwoTildes;

    public StrikethroughDelimiterProcessor(boolean z) {
        this.requireTwoTildes = z;
    }

    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public char getClosingCharacter() {
        return JsonPointer.ESC;
    }

    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public int getMinLength() {
        return this.requireTwoTildes ? 2 : 1;
    }

    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public char getOpeningCharacter() {
        return JsonPointer.ESC;
    }

    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public int process(DelimiterRun delimiterRun, DelimiterRun delimiterRun2) {
        if (delimiterRun.length() != delimiterRun2.length() || delimiterRun.length() > 2) {
            return 0;
        }
        Text opener = delimiterRun.getOpener();
        Strikethrough strikethrough = new Strikethrough();
        SourceSpans sourceSpans = new SourceSpans();
        sourceSpans.addAllFrom(delimiterRun.getOpeners(delimiterRun.length()));
        for (Node node : Nodes.between(opener, delimiterRun2.getCloser())) {
            strikethrough.appendChild(node);
            sourceSpans.addAll(node.getSourceSpans());
        }
        sourceSpans.addAllFrom(delimiterRun2.getClosers(delimiterRun2.length()));
        strikethrough.setSourceSpans(sourceSpans.getSourceSpans());
        opener.insertAfter(strikethrough);
        return delimiterRun.length();
    }

    public StrikethroughDelimiterProcessor() {
        this(false);
    }
}
