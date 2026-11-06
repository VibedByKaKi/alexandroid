package org.codehaus.jackson.impl;

import com.amazon.deecomms.common.Constants;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.codehaus.jackson.JsonStreamContext;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class JsonWriteContext extends JsonStreamContext {
    public static final int STATUS_EXPECT_NAME = 5;
    public static final int STATUS_EXPECT_VALUE = 4;
    public static final int STATUS_OK_AFTER_COLON = 2;
    public static final int STATUS_OK_AFTER_COMMA = 1;
    public static final int STATUS_OK_AFTER_SPACE = 3;
    public static final int STATUS_OK_AS_IS = 0;
    protected JsonWriteContext _child = null;
    protected String _currentName;
    protected final JsonWriteContext _parent;

    public JsonWriteContext(int i, JsonWriteContext jsonWriteContext) {
        this._type = i;
        this._parent = jsonWriteContext;
        this._index = -1;
    }

    public static JsonWriteContext createRootContext() {
        return new JsonWriteContext(0, null);
    }

    private final JsonWriteContext reset(int i) {
        this._type = i;
        this._index = -1;
        this._currentName = null;
        return this;
    }

    public final void appendDesc(StringBuilder sb) {
        int i = this._type;
        if (i != 2) {
            if (i != 1) {
                sb.append("/");
                return;
            }
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(getCurrentIndex());
            sb.append(AbstractJsonLexerKt.END_LIST);
            return;
        }
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        if (this._currentName != null) {
            sb.append('\"');
            sb.append(this._currentName);
            sb.append('\"');
        } else {
            sb.append(Constants.DEFAULT_IMAGE_CHAR);
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
    }

    public final JsonWriteContext createChildArrayContext() {
        JsonWriteContext jsonWriteContext = this._child;
        if (jsonWriteContext != null) {
            return jsonWriteContext.reset(1);
        }
        JsonWriteContext jsonWriteContext2 = new JsonWriteContext(1, this);
        this._child = jsonWriteContext2;
        return jsonWriteContext2;
    }

    public final JsonWriteContext createChildObjectContext() {
        JsonWriteContext jsonWriteContext = this._child;
        if (jsonWriteContext != null) {
            return jsonWriteContext.reset(2);
        }
        JsonWriteContext jsonWriteContext2 = new JsonWriteContext(2, this);
        this._child = jsonWriteContext2;
        return jsonWriteContext2;
    }

    @Override // org.codehaus.jackson.JsonStreamContext
    public final String getCurrentName() {
        return this._currentName;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        appendDesc(sb);
        return sb.toString();
    }

    public final int writeFieldName(String str) {
        if (this._type != 2 || this._currentName != null) {
            return 4;
        }
        this._currentName = str;
        return this._index < 0 ? 0 : 1;
    }

    public final int writeValue() {
        int i = this._type;
        if (i == 2) {
            if (this._currentName == null) {
                return 5;
            }
            this._currentName = null;
            this._index++;
            return 2;
        }
        int i2 = this._index;
        if (i == 1) {
            this._index = i2 + 1;
            return i2 < 0 ? 0 : 1;
        }
        int i3 = i2 + 1;
        this._index = i3;
        return i3 == 0 ? 0 : 3;
    }

    @Override // org.codehaus.jackson.JsonStreamContext
    public final JsonWriteContext getParent() {
        return this._parent;
    }
}
