package org.commonmark.internal.inline;

import java.util.regex.Pattern;
import org.commonmark.node.HardLineBreak;
import org.commonmark.node.Text;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class BackslashInlineParser implements InlineContentParser {
    private static final Pattern ESCAPABLE = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    @Override // org.commonmark.internal.inline.InlineContentParser
    public ParsedInline tryParse(InlineParserState inlineParserState) {
        Scanner scanner = inlineParserState.scanner();
        scanner.next();
        char peek = scanner.peek();
        if (peek == '\n') {
            scanner.next();
            return ParsedInline.of(new HardLineBreak(), scanner.position());
        }
        if (!ESCAPABLE.matcher(String.valueOf(peek)).matches()) {
            return ParsedInline.of(new Text("\\"), scanner.position());
        }
        scanner.next();
        return ParsedInline.of(new Text(String.valueOf(peek)), scanner.position());
    }
}
