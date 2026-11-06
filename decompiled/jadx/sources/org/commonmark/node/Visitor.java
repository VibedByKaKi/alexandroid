package org.commonmark.node;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface Visitor {
    void visit(BlockQuote blockQuote);

    void visit(BulletList bulletList);

    void visit(Code code);

    void visit(CustomBlock customBlock);

    void visit(CustomNode customNode);

    void visit(Document document);

    void visit(Emphasis emphasis);

    void visit(FencedCodeBlock fencedCodeBlock);

    void visit(HardLineBreak hardLineBreak);

    void visit(Heading heading);

    void visit(HtmlBlock htmlBlock);

    void visit(HtmlInline htmlInline);

    void visit(Image image);

    void visit(IndentedCodeBlock indentedCodeBlock);

    void visit(Link link);

    void visit(LinkReferenceDefinition linkReferenceDefinition);

    void visit(ListItem listItem);

    void visit(OrderedList orderedList);

    void visit(Paragraph paragraph);

    void visit(SoftLineBreak softLineBreak);

    void visit(StrongEmphasis strongEmphasis);

    void visit(Text text);

    void visit(ThematicBreak thematicBreak);
}
