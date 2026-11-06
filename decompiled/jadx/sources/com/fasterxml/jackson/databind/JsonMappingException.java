package com.fasterxml.jackson.databind;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.deecomms.common.Constants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.util.ClassUtil;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class JsonMappingException extends DatabindException {
    static final int MAX_REFS_TO_LIST = 1000;
    private static final long serialVersionUID = 3;
    protected LinkedList<Reference> _path;
    protected transient Closeable _processor;

    public JsonMappingException(Closeable closeable, String str, Throwable th) {
        super(str, th);
        this._processor = closeable;
        if (th instanceof JacksonException) {
            this._location = ((JacksonException) th).getLocation();
        } else if (closeable instanceof JsonParser) {
            this._location = ((JsonParser) closeable).currentTokenLocation();
        }
    }

    private static JsonGenerator _generator(SerializerProvider serializerProvider) {
        if (serializerProvider == null) {
            return null;
        }
        return serializerProvider.getGenerator();
    }

    private static JsonParser _parser(DeserializationContext deserializationContext) {
        if (deserializationContext == null) {
            return null;
        }
        return deserializationContext.getParser();
    }

    public static JsonMappingException from(DeserializationContext deserializationContext, String str) {
        return new JsonMappingException(_parser(deserializationContext), str);
    }

    public static JsonMappingException fromUnexpectedIOE(IOException iOException) {
        return new JsonMappingException((Closeable) null, a$$ExternalSyntheticOutline0.m("Unexpected IOException (of type ", iOException.getClass().getName(), "): ", ClassUtil.exceptionMessage(iOException)));
    }

    public static JsonMappingException wrapWithPath(Throwable th, Reference reference) {
        Closeable closeable;
        JsonMappingException jsonMappingException;
        if (th instanceof JsonMappingException) {
            jsonMappingException = (JsonMappingException) th;
        } else {
            String exceptionMessage = ClassUtil.exceptionMessage(th);
            if (exceptionMessage == null || exceptionMessage.isEmpty()) {
                exceptionMessage = "(was " + th.getClass().getName() + MarkdownConstants.RIGHT_PARENTHESIS;
            }
            if (th instanceof JacksonException) {
                Object processor = ((JacksonException) th).getProcessor();
                if (processor instanceof Closeable) {
                    closeable = (Closeable) processor;
                    jsonMappingException = new JsonMappingException(closeable, exceptionMessage, th);
                }
            }
            closeable = null;
            jsonMappingException = new JsonMappingException(closeable, exceptionMessage, th);
        }
        jsonMappingException.prependPath(reference);
        return jsonMappingException;
    }

    public void _appendPathDesc(StringBuilder sb) {
        LinkedList<Reference> linkedList = this._path;
        if (linkedList == null) {
            return;
        }
        Iterator<Reference> it2 = linkedList.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().toString());
            if (it2.hasNext()) {
                sb.append("->");
            }
        }
    }

    public StringBuilder _appendReferenceChain(StringBuilder sb) {
        sb.append(" (through reference chain: ");
        StringBuilder pathReference = getPathReference(sb);
        pathReference.append(')');
        return pathReference;
    }

    public String _buildMessage() {
        String message = super.getMessage();
        if (this._path == null) {
            return message;
        }
        return _appendReferenceChain(message == null ? new StringBuilder() : new StringBuilder(message)).toString();
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return _buildMessage();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        return _buildMessage();
    }

    public List<Reference> getPath() {
        LinkedList<Reference> linkedList = this._path;
        return linkedList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(linkedList);
    }

    public String getPathReference() {
        return getPathReference(new StringBuilder()).toString();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    @JsonIgnore
    public Object getProcessor() {
        return this._processor;
    }

    public void prependPath(Reference reference) {
        if (this._path == null) {
            this._path = new LinkedList<>();
        }
        if (this._path.size() < 1000) {
            this._path.addFirst(reference);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    public JsonMappingException withCause(Throwable th) {
        initCause(th);
        return this;
    }

    public static JsonMappingException from(JsonParser jsonParser, String str, Throwable th) {
        return new JsonMappingException(jsonParser, str, th);
    }

    public static JsonMappingException from(JsonGenerator jsonGenerator, String str) {
        return new JsonMappingException(jsonGenerator, str, (Throwable) null);
    }

    public static JsonMappingException from(JsonGenerator jsonGenerator, String str, Throwable th) {
        return new JsonMappingException(jsonGenerator, str, th);
    }

    public static JsonMappingException from(JsonParser jsonParser, String str) {
        return new JsonMappingException(jsonParser, str);
    }

    public static JsonMappingException from(DeserializationContext deserializationContext, String str, Throwable th) {
        return new JsonMappingException(_parser(deserializationContext), str, th);
    }

    public StringBuilder getPathReference(StringBuilder sb) {
        _appendPathDesc(sb);
        return sb;
    }

    public static JsonMappingException from(SerializerProvider serializerProvider, String str) {
        return new JsonMappingException(_generator(serializerProvider), str);
    }

    public static JsonMappingException from(SerializerProvider serializerProvider, String str, Throwable th) {
        return new JsonMappingException(_generator(serializerProvider), str, th);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Reference implements Serializable {
        private static final long serialVersionUID = 2;
        protected String _desc;
        protected String _fieldName;
        protected transient Object _from;
        protected int _index;

        public Reference(Object obj, String str) {
            this._index = -1;
            this._from = obj;
            if (str != null) {
                this._fieldName = str;
            } else {
                Single$$ExternalSyntheticBUOutline0.m$1("Cannot pass null fieldName");
                throw null;
            }
        }

        public String getDescription() {
            if (this._desc == null) {
                StringBuilder sb = new StringBuilder();
                Object obj = this._from;
                if (obj != null) {
                    Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
                    int i = 0;
                    while (cls.isArray()) {
                        cls = cls.getComponentType();
                        i++;
                    }
                    sb.append(cls.getName());
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                    }
                } else {
                    sb.append("UNKNOWN");
                }
                sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                if (this._fieldName != null) {
                    sb.append('\"');
                    sb.append(this._fieldName);
                    sb.append('\"');
                } else {
                    int i2 = this._index;
                    if (i2 >= 0) {
                        sb.append(i2);
                    } else {
                        sb.append(Constants.DEFAULT_IMAGE_CHAR);
                    }
                }
                sb.append(AbstractJsonLexerKt.END_LIST);
                this._desc = sb.toString();
            }
            return this._desc;
        }

        public String getFieldName() {
            return this._fieldName;
        }

        @JsonIgnore
        public Object getFrom() {
            return this._from;
        }

        public int getIndex() {
            return this._index;
        }

        public void setDescription(String str) {
            this._desc = str;
        }

        public void setFieldName(String str) {
            this._fieldName = str;
        }

        public void setIndex(int i) {
            this._index = i;
        }

        public String toString() {
            return getDescription();
        }

        public Object writeReplace() {
            getDescription();
            return this;
        }

        public Reference(Object obj) {
            this._index = -1;
            this._from = obj;
        }

        public Reference() {
            this._index = -1;
        }

        public Reference(Object obj, int i) {
            this._from = obj;
            this._index = i;
        }
    }

    @Override // com.fasterxml.jackson.databind.DatabindException
    public void prependPath(Object obj, int i) {
        prependPath(new Reference(obj, i));
    }

    @Override // com.fasterxml.jackson.databind.DatabindException
    public void prependPath(Object obj, String str) {
        prependPath(new Reference(obj, str));
    }

    @Deprecated
    public JsonMappingException(String str, Throwable th) {
        super(str, th);
    }

    @Deprecated
    public JsonMappingException(String str, JsonLocation jsonLocation) {
        super(str, jsonLocation);
    }

    @Deprecated
    public JsonMappingException(String str, JsonLocation jsonLocation, Throwable th) {
        super(str, jsonLocation, th);
    }

    public JsonMappingException(Closeable closeable, String str) {
        super(str);
        this._processor = closeable;
        if (closeable instanceof JsonParser) {
            this._location = ((JsonParser) closeable).currentTokenLocation();
        }
    }

    @Deprecated
    public JsonMappingException(String str) {
        super(str);
    }

    public JsonMappingException(Closeable closeable, String str, JsonLocation jsonLocation) {
        super(str, jsonLocation);
        this._processor = closeable;
    }

    public static JsonMappingException wrapWithPath(Throwable th, Object obj, int i) {
        return wrapWithPath(th, new Reference(obj, i));
    }

    public static JsonMappingException wrapWithPath(Throwable th, Object obj, String str) {
        return wrapWithPath(th, new Reference(obj, str));
    }
}
