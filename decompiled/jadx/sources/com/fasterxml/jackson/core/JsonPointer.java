package com.fasterxml.jackson.core;

import androidx.collection.SieveCacheKt;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import com.fasterxml.jackson.core.io.NumberInput;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class JsonPointer implements Serializable {
    protected static final JsonPointer EMPTY = new JsonPointer();
    public static final char ESC = '~';
    public static final String ESC_SLASH = "~1";
    public static final String ESC_TILDE = "~0";
    public static final char SEPARATOR = '/';
    private static final long serialVersionUID = 1;
    protected final String _asString;
    protected final int _asStringOffset;
    protected int _hashCode;
    protected volatile JsonPointer _head;
    protected final int _matchingElementIndex;
    protected final String _matchingPropertyName;
    protected final JsonPointer _nextSegment;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PointerParent {
        public final int fullPathOffset;
        public final PointerParent parent;
        public final String segment;

        public PointerParent(PointerParent pointerParent, int i, String str) {
            this.parent = pointerParent;
            this.fullPathOffset = i;
            this.segment = str;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PointerSegment {
        public final int index;
        public final PointerSegment next;
        public int pathOffset;
        public PointerSegment prev;
        public final String property;

        public PointerSegment(PointerSegment pointerSegment, String str, int i) {
            this.next = pointerSegment;
            this.property = str;
            this.index = i;
            if (pointerSegment != null) {
                pointerSegment.prev = this;
            }
        }
    }

    public JsonPointer(JsonPointer jsonPointer, JsonPointer jsonPointer2) {
        this._asString = jsonPointer._asString;
        this._asStringOffset = jsonPointer._asStringOffset;
        this._nextSegment = jsonPointer2;
        this._matchingPropertyName = jsonPointer._matchingPropertyName;
        this._matchingElementIndex = jsonPointer._matchingElementIndex;
    }

    private static int _appendEscape(StringBuilder sb, char c) {
        if (c == '0') {
            sb.append(ESC);
            return 1;
        }
        if (c == '1') {
            sb.append('/');
            return 1;
        }
        sb.append(ESC);
        return 0;
    }

    private static void _appendEscaped(StringBuilder sb, String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '/') {
                sb.append(ESC_SLASH);
            } else if (charAt == '~') {
                sb.append(ESC_TILDE);
            } else {
                sb.append(charAt);
            }
        }
    }

    private static JsonPointer _buildPath(String str, int i, String str2, PointerParent pointerParent) {
        JsonPointer jsonPointer = new JsonPointer(str, i, str2, EMPTY);
        while (pointerParent != null) {
            JsonPointer jsonPointer2 = new JsonPointer(str, pointerParent.fullPathOffset, pointerParent.segment, jsonPointer);
            pointerParent = pointerParent.parent;
            jsonPointer = jsonPointer2;
        }
        return jsonPointer;
    }

    private final boolean _compare(String str, int i, String str2, int i2) {
        int length = str.length();
        if (length - i != str2.length() - i2) {
            return false;
        }
        while (i < length) {
            int i3 = i + 1;
            int i4 = i2 + 1;
            if (str.charAt(i) != str2.charAt(i2)) {
                return false;
            }
            i = i3;
            i2 = i4;
        }
        return true;
    }

    public static int _extractEscapedSegment(String str, int i, int i2, StringBuilder sb) {
        int length = str.length();
        int i3 = i2 - 1;
        if (i3 - i > 0) {
            sb.append((CharSequence) str, i, i3);
        }
        int _appendEscape = _appendEscape(sb, str.charAt(i2));
        while (true) {
            i2 += _appendEscape;
            while (i2 < length) {
                char charAt = str.charAt(i2);
                if (charAt == '/') {
                    return i2;
                }
                i2++;
                if (charAt != '~' || i2 >= length) {
                    sb.append(charAt);
                }
            }
            return -1;
            _appendEscape = _appendEscape(sb, str.charAt(i2));
        }
    }

    private static final int _parseIndex(String str) {
        int length = str.length();
        if (length == 0 || length > 10) {
            return -1;
        }
        char charAt = str.charAt(0);
        if (charAt <= '0') {
            return (length == 1 && charAt == '0') ? 0 : -1;
        }
        if (charAt > '9') {
            return -1;
        }
        for (int i = 1; i < length; i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 > '9' || charAt2 < '0') {
                return -1;
            }
        }
        if (length != 10) {
            return NumberInput.parseInt(str);
        }
        long parseLong = Long.parseLong(str);
        if (parseLong > SieveCacheKt.NodeLinkMask) {
            return -1;
        }
        return (int) parseLong;
    }

    public static JsonPointer _parseTail(String str) {
        int length = str.length();
        PointerParent pointerParent = null;
        int i = 1;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '/') {
                PointerParent pointerParent2 = new PointerParent(pointerParent, i2, str.substring(i2 + 1, i));
                i2 = i;
                i++;
                pointerParent = pointerParent2;
            } else {
                i++;
                if (charAt == '~' && i < length) {
                    StringBuilder sb = new StringBuilder(32);
                    int _extractEscapedSegment = _extractEscapedSegment(str, i2 + 1, i, sb);
                    String sb2 = sb.toString();
                    if (_extractEscapedSegment < 0) {
                        return _buildPath(str, i2, sb2, pointerParent);
                    }
                    PointerParent pointerParent3 = new PointerParent(pointerParent, i2, sb2);
                    i2 = _extractEscapedSegment;
                    i = _extractEscapedSegment + 1;
                    pointerParent = pointerParent3;
                }
            }
        }
        return _buildPath(str, i2, str.substring(i2 + 1), pointerParent);
    }

    public static JsonPointer compile(String str) throws IllegalArgumentException {
        if (str == null || str.length() == 0) {
            return EMPTY;
        }
        if (str.charAt(0) == '/') {
            return _parseTail(str);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Invalid input: JSON Pointer expression must start with '/': \"", str, DeviceConfigConstants.DOUBLE_QUOTE));
        return null;
    }

    public static JsonPointer empty() {
        return EMPTY;
    }

    public static JsonPointer forPath(JsonStreamContext jsonStreamContext, boolean z) {
        if (jsonStreamContext == null) {
            return EMPTY;
        }
        if (!jsonStreamContext.hasPathSegment() && (!z || !jsonStreamContext.inRoot() || !jsonStreamContext.hasCurrentIndex())) {
            jsonStreamContext = jsonStreamContext.getParent();
        }
        int i = 0;
        PointerSegment pointerSegment = null;
        while (jsonStreamContext != null) {
            if (jsonStreamContext.inObject()) {
                String currentName = jsonStreamContext.getCurrentName();
                if (currentName == null) {
                    currentName = "";
                }
                int length = currentName.length() + 2 + i;
                pointerSegment = new PointerSegment(pointerSegment, currentName, -1);
                i = length;
            } else if (jsonStreamContext.inArray() || z) {
                i += 6;
                pointerSegment = new PointerSegment(pointerSegment, null, jsonStreamContext.getCurrentIndex());
            }
            jsonStreamContext = jsonStreamContext.getParent();
        }
        if (pointerSegment == null) {
            return EMPTY;
        }
        StringBuilder sb = new StringBuilder(i);
        PointerSegment pointerSegment2 = null;
        PointerSegment pointerSegment3 = pointerSegment;
        while (pointerSegment3 != null) {
            pointerSegment3.pathOffset = sb.length();
            sb.append('/');
            String str = pointerSegment3.property;
            if (str != null) {
                _appendEscaped(sb, str);
            } else {
                sb.append(pointerSegment3.index);
            }
            PointerSegment pointerSegment4 = pointerSegment3;
            pointerSegment3 = pointerSegment3.next;
            pointerSegment2 = pointerSegment4;
        }
        String sb2 = sb.toString();
        JsonPointer jsonPointer = EMPTY;
        while (pointerSegment2 != null) {
            String str2 = pointerSegment2.property;
            if (str2 != null) {
                jsonPointer = new JsonPointer(sb2, pointerSegment2.pathOffset, str2, jsonPointer);
            } else {
                int i2 = pointerSegment2.index;
                jsonPointer = new JsonPointer(sb2, pointerSegment2.pathOffset, String.valueOf(i2), i2, jsonPointer);
            }
            pointerSegment2 = pointerSegment2.prev;
        }
        return jsonPointer;
    }

    public static JsonPointer valueOf(String str) {
        return compile(str);
    }

    private Object writeReplace() {
        return new Serialization(toString());
    }

    public JsonPointer _constructHead() {
        JsonPointer last = last();
        if (last == this) {
            return EMPTY;
        }
        ArrayList arrayList = new ArrayList();
        String jsonPointer = toString();
        String substring = jsonPointer.substring(0, jsonPointer.length() - last.length());
        int i = -this._asStringOffset;
        while (this != last) {
            arrayList.add(new JsonPointer(this, substring, this._asStringOffset + i));
            this = this._nextSegment;
        }
        JsonPointer jsonPointer2 = EMPTY;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            JsonPointer jsonPointer3 = new JsonPointer((JsonPointer) arrayList.get(size), jsonPointer2);
            size--;
            jsonPointer2 = jsonPointer3;
        }
        return jsonPointer2;
    }

    public JsonPointer append(JsonPointer jsonPointer) {
        JsonPointer jsonPointer2 = EMPTY;
        if (this == jsonPointer2) {
            return jsonPointer;
        }
        if (jsonPointer == jsonPointer2) {
            return this;
        }
        StringBuilder m = BitVector$$ExternalSyntheticOutline0.m(toString());
        m.append(jsonPointer.toString());
        return compile(m.toString());
    }

    public JsonPointer appendIndex(int i) {
        if (i < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Negative index cannot be appended");
            return null;
        }
        StringBuilder stringBuilder = toStringBuilder(8);
        stringBuilder.append('/');
        stringBuilder.append(i);
        return compile(stringBuilder.toString());
    }

    public JsonPointer appendProperty(String str) {
        if (str == null) {
            return this;
        }
        StringBuilder stringBuilder = toStringBuilder(str.length() + 2);
        stringBuilder.append('/');
        _appendEscaped(stringBuilder, str);
        return compile(stringBuilder.toString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonPointer)) {
            return false;
        }
        JsonPointer jsonPointer = (JsonPointer) obj;
        return _compare(this._asString, this._asStringOffset, jsonPointer._asString, jsonPointer._asStringOffset);
    }

    public int getMatchingIndex() {
        return this._matchingElementIndex;
    }

    public String getMatchingProperty() {
        return this._matchingPropertyName;
    }

    public int hashCode() {
        int i = this._hashCode;
        if (i == 0) {
            i = toString().hashCode();
            if (i == 0) {
                i = -1;
            }
            this._hashCode = i;
        }
        return i;
    }

    public JsonPointer head() {
        JsonPointer jsonPointer = this._head;
        if (jsonPointer == null) {
            if (this != EMPTY) {
                jsonPointer = _constructHead();
            }
            this._head = jsonPointer;
        }
        return jsonPointer;
    }

    public JsonPointer last() {
        if (this == EMPTY) {
            return null;
        }
        while (true) {
            JsonPointer jsonPointer = this._nextSegment;
            if (jsonPointer == EMPTY) {
                return this;
            }
            this = jsonPointer;
        }
    }

    public int length() {
        return this._asString.length() - this._asStringOffset;
    }

    public JsonPointer matchElement(int i) {
        if (i != this._matchingElementIndex || i < 0) {
            return null;
        }
        return this._nextSegment;
    }

    public JsonPointer matchProperty(String str) {
        if (this._nextSegment == null || !this._matchingPropertyName.equals(str)) {
            return null;
        }
        return this._nextSegment;
    }

    public boolean matches() {
        return this._nextSegment == null;
    }

    public boolean matchesElement(int i) {
        return i == this._matchingElementIndex && i >= 0;
    }

    public boolean matchesProperty(String str) {
        return this._nextSegment != null && this._matchingPropertyName.equals(str);
    }

    public boolean mayMatchElement() {
        return this._matchingElementIndex >= 0;
    }

    public boolean mayMatchProperty() {
        return this._matchingPropertyName != null;
    }

    public JsonPointer tail() {
        return this._nextSegment;
    }

    public String toString() {
        int i = this._asStringOffset;
        String str = this._asString;
        return i <= 0 ? str : str.substring(i);
    }

    public StringBuilder toStringBuilder(int i) {
        int i2 = this._asStringOffset;
        String str = this._asString;
        if (i2 <= 0) {
            return new StringBuilder(str);
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder((length - this._asStringOffset) + i);
        sb.append((CharSequence) this._asString, this._asStringOffset, length);
        return sb;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Serialization implements Externalizable {
        private String _fullPath;

        public Serialization(String str) {
            this._fullPath = str;
        }

        private Object readResolve() throws ObjectStreamException {
            return JsonPointer.compile(this._fullPath);
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
            this._fullPath = objectInput.readUTF();
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeUTF(this._fullPath);
        }

        public Serialization() {
        }
    }

    public JsonPointer(String str, int i, String str2, JsonPointer jsonPointer) {
        this._asString = str;
        this._asStringOffset = i;
        this._nextSegment = jsonPointer;
        this._matchingPropertyName = str2;
        this._matchingElementIndex = _parseIndex(str2);
    }

    public JsonPointer(String str, int i, String str2, int i2, JsonPointer jsonPointer) {
        this._asString = str;
        this._asStringOffset = i;
        this._nextSegment = jsonPointer;
        this._matchingPropertyName = str2;
        this._matchingElementIndex = i2;
    }

    public JsonPointer() {
        this._nextSegment = null;
        this._matchingPropertyName = null;
        this._matchingElementIndex = -1;
        this._asString = "";
        this._asStringOffset = 0;
    }

    public JsonPointer(JsonPointer jsonPointer, String str, int i) {
        this._asString = str;
        this._asStringOffset = i;
        this._nextSegment = null;
        this._matchingPropertyName = jsonPointer._matchingPropertyName;
        this._matchingElementIndex = jsonPointer._matchingElementIndex;
    }
}
