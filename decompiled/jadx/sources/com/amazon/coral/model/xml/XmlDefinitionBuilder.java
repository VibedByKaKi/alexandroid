package com.amazon.coral.model.xml;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.model.ModelIndexFactoryException;
import com.amazon.coral.model.xml.XmlModelParser;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.apache.http.cookie.ClientCookie;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class XmlDefinitionBuilder implements XmlModelParser.Listener {
    private DefinitionImpl last;
    private DefinitionImpl root;
    private int depth = 0;
    private String comment = null;
    private Stack<XmlModelParser.ElementInfo> tagStack = new Stack<>();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DefinitionImpl implements Definition {
        private final String name;
        DefinitionImpl parent;
        private final String source;
        private final HashMap<String, String> attributes = new HashMap<>();
        private final StringBuilder text = new StringBuilder();
        private List<Definition> children = Collections.EMPTY_LIST;

        public DefinitionImpl(String str, String str2) {
            this.name = str;
            this.source = str2;
        }

        @Override // com.amazon.coral.model.xml.Definition
        public String expectAttribute(String str) {
            String attribute = getAttribute(str);
            if (attribute != null) {
                return attribute;
            }
            String name = getName();
            String source = getSource();
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("Missing \"", str, "\" attribute in \"", name, "\" element at: ");
            m.append(source);
            throw new ModelIndexFactoryException(m.toString());
        }

        @Override // com.amazon.coral.model.xml.Definition
        public String getAttribute(String str) {
            return this.attributes.get(str);
        }

        @Override // com.amazon.coral.model.xml.Definition
        public Iterable<String> getAttributes() {
            return this.attributes.keySet();
        }

        @Override // com.amazon.coral.model.xml.Definition
        public Iterable<Definition> getChildren() {
            return this.children;
        }

        @Override // com.amazon.coral.model.xml.Definition
        public String getName() {
            return this.name;
        }

        @Override // com.amazon.coral.model.xml.Definition
        public String getSource() {
            return this.source;
        }

        @Override // com.amazon.coral.model.xml.Definition
        public String getText() {
            return this.text.toString();
        }

        public String toString() {
            return this.name + " " + this.attributes + " " + this.source;
        }
    }

    public Definition getDefinition() {
        return this.root;
    }

    @Override // com.amazon.coral.model.xml.XmlModelParser.Listener
    public void onAttribute(XmlModelParser.AttributeInfo attributeInfo) {
        this.last.attributes.put(attributeInfo.getName(), attributeInfo.getValue());
    }

    @Override // com.amazon.coral.model.xml.XmlModelParser.Listener
    public void onComment(XmlModelParser.TextInfo textInfo) {
        if (this.last == null) {
            return;
        }
        textInfo.getSource();
        textInfo.getX();
        textInfo.getY();
        this.comment = textInfo.getText().toString();
    }

    @Override // com.amazon.coral.model.xml.XmlModelParser.Listener
    public void onElementBegin(XmlModelParser.ElementInfo elementInfo) {
        this.tagStack.push(elementInfo);
        DefinitionImpl definitionImpl = new DefinitionImpl(elementInfo.getName().toLowerCase(), elementInfo.getSource() + " [" + elementInfo.getY() + "," + elementInfo.getX() + MarkdownConstants.RIGHT_BRACKET);
        DefinitionImpl definitionImpl2 = this.last;
        if (definitionImpl2 != null) {
            if (definitionImpl2.children == Collections.EMPTY_LIST) {
                this.last.children = new LinkedList();
            }
            this.last.children.add(definitionImpl);
        } else {
            this.root = definitionImpl;
        }
        definitionImpl.parent = this.last;
        this.last = definitionImpl;
        if (this.comment != null) {
            definitionImpl.attributes.put(ClientCookie.COMMENT_ATTR, this.comment);
        }
        this.comment = null;
        this.depth++;
    }

    @Override // com.amazon.coral.model.xml.XmlModelParser.Listener
    public void onElementEnd(XmlModelParser.ElementInfo elementInfo) {
        XmlModelParser.ElementInfo pop = this.tagStack.pop();
        if (pop == elementInfo) {
            this.depth--;
            this.last = this.last.parent;
        } else {
            throw new ModelIndexFactoryException("Check your syntax, looks like a tag was left unclosed " + pop.getName());
        }
    }

    @Override // com.amazon.coral.model.xml.XmlModelParser.Listener
    public void onText(XmlModelParser.TextInfo textInfo) {
        this.last.text.append(textInfo.getText());
    }
}
