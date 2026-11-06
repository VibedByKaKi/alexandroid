package org.codehaus.jackson.impl;

import com.amazon.deecomms.common.Constants;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.codehaus.jackson.JsonLocation;
import org.codehaus.jackson.JsonStreamContext;
import org.codehaus.jackson.util.CharTypes;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class JsonReadContext extends JsonStreamContext {
    protected JsonReadContext _child = null;
    protected int _columnNr;
    protected String _currentName;
    protected int _lineNr;
    protected final JsonReadContext _parent;

    public JsonReadContext(JsonReadContext jsonReadContext, int i, int i2, int i3) {
        this._type = i;
        this._parent = jsonReadContext;
        this._lineNr = i2;
        this._columnNr = i3;
        this._index = -1;
    }

    public static JsonReadContext createRootContext() {
        return new JsonReadContext(null, 0, 1, 0);
    }

    public final JsonReadContext createChildArrayContext(int i, int i2) {
        JsonReadContext jsonReadContext = this._child;
        if (jsonReadContext != null) {
            jsonReadContext.reset(1, i, i2);
            return jsonReadContext;
        }
        JsonReadContext jsonReadContext2 = new JsonReadContext(this, 1, i, i2);
        this._child = jsonReadContext2;
        return jsonReadContext2;
    }

    public final JsonReadContext createChildObjectContext(int i, int i2) {
        JsonReadContext jsonReadContext = this._child;
        if (jsonReadContext != null) {
            jsonReadContext.reset(2, i, i2);
            return jsonReadContext;
        }
        JsonReadContext jsonReadContext2 = new JsonReadContext(this, 2, i, i2);
        this._child = jsonReadContext2;
        return jsonReadContext2;
    }

    public final boolean expectComma() {
        int i = this._index + 1;
        this._index = i;
        return this._type != 0 && i > 0;
    }

    @Override // org.codehaus.jackson.JsonStreamContext
    public final String getCurrentName() {
        return this._currentName;
    }

    public final JsonLocation getStartLocation(Object obj) {
        return new JsonLocation(obj, -1L, this._lineNr, this._columnNr);
    }

    public final void reset(int i, int i2, int i3) {
        this._type = i;
        this._index = -1;
        this._lineNr = i2;
        this._columnNr = i3;
        this._currentName = null;
    }

    public void setCurrentName(String str) {
        this._currentName = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this._type;
        if (i == 0) {
            sb.append("/");
        } else if (i == 1) {
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(getCurrentIndex());
            sb.append(AbstractJsonLexerKt.END_LIST);
        } else if (i == 2) {
            sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
            if (this._currentName != null) {
                sb.append('\"');
                CharTypes.appendQuoted(sb, this._currentName);
                sb.append('\"');
            } else {
                sb.append(Constants.DEFAULT_IMAGE_CHAR);
            }
            sb.append(AbstractJsonLexerKt.END_OBJ);
        }
        return sb.toString();
    }

    @Override // org.codehaus.jackson.JsonStreamContext
    public final JsonReadContext getParent() {
        return this._parent;
    }

    public static JsonReadContext createRootContext(int i, int i2) {
        return new JsonReadContext(null, 0, i, i2);
    }
}
