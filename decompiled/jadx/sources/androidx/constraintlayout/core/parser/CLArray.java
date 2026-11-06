package androidx.constraintlayout.core.parser;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class CLArray extends CLContainer {
    public CLArray(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        return new CLArray(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        String json = toJSON();
        if (i2 > 0 || json.length() + i >= CLElement.sMaxLine) {
            sb.append("[\n");
            Iterator<CLElement> it2 = this.mElements.iterator();
            boolean z = true;
            while (it2.hasNext()) {
                CLElement next = it2.next();
                if (z) {
                    z = false;
                } else {
                    sb.append(",\n");
                }
                addIndent(sb, CLElement.sBaseIndent + i);
                sb.append(next.toFormattedJSON(CLElement.sBaseIndent + i, i2 - 1));
            }
            sb.append("\n");
            addIndent(sb, i);
            sb.append(MarkdownConstants.RIGHT_BRACKET);
        } else {
            sb.append(json);
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb = new StringBuilder(getDebugName() + MarkdownConstants.LEFT_BRACKET);
        boolean z = true;
        for (int i = 0; i < this.mElements.size(); i++) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(this.mElements.get(i).toJSON());
        }
        return ((Object) sb) + MarkdownConstants.RIGHT_BRACKET;
    }
}
