package org.apache.http.message;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.text.Regex$$ExternalSyntheticBUOutline0;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ParserCursor {
    private final int lowerBound;
    private int pos;
    private final int upperBound;

    public ParserCursor(int i, int i2) {
        if (i < 0) {
            XML$$ExternalSyntheticBUOutline0.m("Lower bound cannot be negative");
            throw null;
        }
        if (i > i2) {
            XML$$ExternalSyntheticBUOutline0.m("Lower bound cannot be greater then upper bound");
            throw null;
        }
        this.lowerBound = i;
        this.upperBound = i2;
        this.pos = i;
    }

    public boolean atEnd() {
        return this.pos >= this.upperBound;
    }

    public int getLowerBound() {
        return this.lowerBound;
    }

    public int getPos() {
        return this.pos;
    }

    public int getUpperBound() {
        return this.upperBound;
    }

    public String toString() {
        return MarkdownConstants.LEFT_BRACKET + Integer.toString(this.lowerBound) + Typography.greater + Integer.toString(this.pos) + Typography.greater + Integer.toString(this.upperBound) + AbstractJsonLexerKt.END_LIST;
    }

    public void updatePos(int i) {
        if (i < this.lowerBound) {
            Regex$$ExternalSyntheticBUOutline0.m(this.lowerBound, a$$ExternalSyntheticOutline0.m0m(i, "pos: ", " < lowerBound: "));
        } else if (i <= this.upperBound) {
            this.pos = i;
        } else {
            Regex$$ExternalSyntheticBUOutline0.m(this.upperBound, a$$ExternalSyntheticOutline0.m0m(i, "pos: ", " > upperBound: "));
        }
    }
}
