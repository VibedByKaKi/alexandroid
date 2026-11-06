package ai.onnxruntime;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class NodeInfo {
    private final ValueInfo info;
    private final String name;

    public NodeInfo(String str, ValueInfo valueInfo) {
        this.name = str;
        this.info = valueInfo;
    }

    public ValueInfo getInfo() {
        return this.info;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "NodeInfo(name=" + this.name + ",info=" + this.info.toString() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
