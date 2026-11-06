package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.JsonNodeFeature;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.RawValue;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class ObjectNode extends ContainerNode<ObjectNode> implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Map<String, JsonNode> _children;

    public ObjectNode(JsonNodeFactory jsonNodeFactory, Map<String, JsonNode> map) {
        super(jsonNodeFactory);
        Objects.requireNonNull(map, "Must not pass `null` for 'children' argument");
        this._children = map;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode _at(JsonPointer jsonPointer) {
        return get(jsonPointer.getMatchingProperty());
    }

    public boolean _childrenEqual(ObjectNode objectNode) {
        return this._children.equals(objectNode._children);
    }

    public Map<String, JsonNode> _contentsToSerialize(SerializerProvider serializerProvider) {
        return (!serializerProvider.isEnabled(JsonNodeFeature.WRITE_PROPERTIES_SORTED) || this._children.isEmpty() || (this._children instanceof TreeMap)) ? this._children : new TreeMap(this._children);
    }

    public ObjectNode _put(String str, JsonNode jsonNode) {
        Map<String, JsonNode> map = this._children;
        Objects.requireNonNull(str);
        map.put(str, jsonNode);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public ArrayNode _withArray(JsonPointer jsonPointer, JsonPointer jsonPointer2, JsonNode.OverwriteMode overwriteMode, boolean z) {
        ObjectNode objectNode;
        JsonPointer jsonPointer3;
        boolean z2;
        if (jsonPointer2.matches()) {
            return null;
        }
        JsonNode _at = _at(jsonPointer2);
        if (_at == null || !(_at instanceof BaseJsonNode)) {
            objectNode = this;
            jsonPointer3 = jsonPointer2;
            z2 = z;
        } else {
            ArrayNode _withArray = ((BaseJsonNode) _at)._withArray(jsonPointer, jsonPointer2.tail(), overwriteMode, z);
            if (_withArray != null) {
                return _withArray;
            }
            objectNode = this;
            jsonPointer3 = jsonPointer2;
            z2 = z;
            objectNode._withXxxVerifyReplace(jsonPointer, jsonPointer3, overwriteMode, z2, _at);
        }
        return objectNode._withArrayAddTailProperty(jsonPointer3, z2);
    }

    public ArrayNode _withArrayAddTailProperty(JsonPointer jsonPointer, boolean z) {
        String matchingProperty = jsonPointer.getMatchingProperty();
        JsonPointer tail = jsonPointer.tail();
        return tail.matches() ? putArray(matchingProperty) : (z && tail.mayMatchElement()) ? putArray(matchingProperty)._withArrayAddTailElement(tail, z) : putObject(matchingProperty)._withArrayAddTailProperty(tail, z);
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.node.BaseJsonNode
    public ObjectNode _withObject(JsonPointer jsonPointer, JsonPointer jsonPointer2, JsonNode.OverwriteMode overwriteMode, boolean z) {
        ObjectNode objectNode;
        JsonPointer jsonPointer3;
        boolean z2;
        if (jsonPointer2.matches()) {
            return this;
        }
        JsonNode _at = _at(jsonPointer2);
        if (_at == null || !(_at instanceof BaseJsonNode)) {
            objectNode = this;
            jsonPointer3 = jsonPointer2;
            z2 = z;
        } else {
            ObjectNode _withObject = ((BaseJsonNode) _at)._withObject(jsonPointer, jsonPointer2.tail(), overwriteMode, z);
            if (_withObject != null) {
                return _withObject;
            }
            objectNode = this;
            jsonPointer3 = jsonPointer2;
            z2 = z;
            objectNode._withXxxVerifyReplace(jsonPointer, jsonPointer3, overwriteMode, z2, _at);
        }
        return objectNode._withObjectAddTailProperty(jsonPointer3, z2);
    }

    public ObjectNode _withObjectAddTailProperty(JsonPointer jsonPointer, boolean z) {
        String matchingProperty = jsonPointer.getMatchingProperty();
        JsonPointer tail = jsonPointer.tail();
        return tail.matches() ? putObject(matchingProperty) : (z && tail.mayMatchElement()) ? putArray(matchingProperty)._withObjectAddTailElement(tail, z) : putObject(matchingProperty)._withObjectAddTailProperty(tail, z);
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.START_OBJECT;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public ObjectNode deepCopy() {
        ObjectNode objectNode = objectNode();
        for (Map.Entry<String, JsonNode> entry : this._children.entrySet()) {
            objectNode._children.put(entry.getKey(), entry.getValue().deepCopy());
        }
        return objectNode;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Iterator<JsonNode> elements() {
        return this._children.values().iterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Comparator<JsonNode> comparator, JsonNode jsonNode) {
        if (!(jsonNode instanceof ObjectNode)) {
            return false;
        }
        Map<String, JsonNode> map = this._children;
        Map<String, JsonNode> map2 = ((ObjectNode) jsonNode)._children;
        if (map2.size() != map.size()) {
            return false;
        }
        for (Map.Entry<String, JsonNode> entry : map.entrySet()) {
            JsonNode jsonNode2 = map2.get(entry.getKey());
            if (jsonNode2 == null || !entry.getValue().equals(comparator, jsonNode2)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public Iterator<String> fieldNames() {
        return this._children.keySet().iterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    @Deprecated
    public Iterator<Map.Entry<String, JsonNode>> fields() {
        return this._children.entrySet().iterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public ObjectNode findParent(String str) {
        if (this._children.get(str) != null) {
            return this;
        }
        Iterator<JsonNode> it2 = this._children.values().iterator();
        while (it2.hasNext()) {
            JsonNode findParent = it2.next().findParent(str);
            if (findParent != null) {
                return (ObjectNode) findParent;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<JsonNode> findParents(String str, List<JsonNode> list) {
        for (Map.Entry<String, JsonNode> entry : this._children.entrySet()) {
            if (str.equals(entry.getKey())) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(this);
            } else {
                list = entry.getValue().findParents(str, list);
            }
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode findValue(String str) {
        JsonNode jsonNode = this._children.get(str);
        if (jsonNode != null) {
            return jsonNode;
        }
        Iterator<JsonNode> it2 = this._children.values().iterator();
        while (it2.hasNext()) {
            JsonNode findValue = it2.next().findValue(str);
            if (findValue != null) {
                return findValue;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<JsonNode> findValues(String str, List<JsonNode> list) {
        for (Map.Entry<String, JsonNode> entry : this._children.entrySet()) {
            if (str.equals(entry.getKey())) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(entry.getValue());
            } else {
                list = entry.getValue().findValues(str, list);
            }
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<String> findValuesAsText(String str, List<String> list) {
        for (Map.Entry<String, JsonNode> entry : this._children.entrySet()) {
            if (str.equals(entry.getKey())) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(entry.getValue().asText());
            } else {
                list = entry.getValue().findValuesAsText(str, list);
            }
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public void forEachEntry(BiConsumer<? super String, ? super JsonNode> biConsumer) {
        this._children.forEach(biConsumer);
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode get(String str) {
        return this._children.get(str);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.OBJECT;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this._children.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable.Base
    public boolean isEmpty(SerializerProvider serializerProvider) {
        return this._children.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public final boolean isObject() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Optional<JsonNode> optional(String str) {
        return Optional.ofNullable(get(str));
    }

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode path(String str) {
        JsonNode jsonNode = this._children.get(str);
        return jsonNode != null ? jsonNode : MissingNode.getInstance();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Set<Map.Entry<String, JsonNode>> properties() {
        return this._children.entrySet();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Stream<Map.Entry<String, JsonNode>> propertyStream() {
        return this._children.entrySet().stream();
    }

    public ObjectNode put(String str, Short sh) {
        return _put(str, sh == null ? nullNode() : numberNode(sh.shortValue()));
    }

    @Deprecated
    public JsonNode putAll(Map<String, ? extends JsonNode> map) {
        return setAll(map);
    }

    public ArrayNode putArray(String str) {
        ArrayNode arrayNode = arrayNode();
        _put(str, arrayNode);
        return arrayNode;
    }

    public JsonNode putIfAbsent(String str, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        Map<String, JsonNode> map = this._children;
        Objects.requireNonNull(str);
        return map.putIfAbsent(str, jsonNode);
    }

    public ObjectNode putNull(String str) {
        return _put(str, nullNode());
    }

    public ObjectNode putObject(String str) {
        ObjectNode objectNode = objectNode();
        _put(str, objectNode);
        return objectNode;
    }

    public ObjectNode putPOJO(String str, Object obj) {
        return _put(str, pojoNode(obj));
    }

    public ObjectNode putRawValue(String str, RawValue rawValue) {
        return _put(str, rawValueNode(rawValue));
    }

    public ObjectNode remove(Collection<String> collection) {
        this._children.keySet().removeAll(collection);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode
    public ObjectNode removeAll() {
        this._children.clear();
        return this;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode
    /* renamed from: removeIf, reason: avoid collision after fix types in other method */
    public ObjectNode removeIf2(Predicate<? super JsonNode> predicate) {
        this._children.values().removeIf(predicate);
        return this;
    }

    public JsonNode replace(String str, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        Map<String, JsonNode> map = this._children;
        Objects.requireNonNull(str);
        return map.put(str, jsonNode);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonNode
    public JsonNode required(String str) {
        JsonNode jsonNode = this._children.get(str);
        return jsonNode != null ? jsonNode : (JsonNode) _reportRequiredViolation("No value for property '%s' of `ObjectNode`", str);
    }

    public ObjectNode retain(Collection<String> collection) {
        this._children.keySet().retainAll(collection);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (serializerProvider != null) {
            boolean isEnabled = serializerProvider.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
            boolean z = !isEnabled;
            boolean isEnabled2 = serializerProvider.isEnabled(JsonNodeFeature.WRITE_NULL_PROPERTIES);
            boolean z2 = !isEnabled2;
            if (!isEnabled || !isEnabled2) {
                jsonGenerator.writeStartObject(this);
                serializeFilteredContents(jsonGenerator, serializerProvider, z, z2);
                jsonGenerator.writeEndObject();
                return;
            }
        }
        jsonGenerator.writeStartObject(this);
        for (Map.Entry<String, JsonNode> entry : _contentsToSerialize(serializerProvider).entrySet()) {
            JsonNode value = entry.getValue();
            jsonGenerator.writeFieldName(entry.getKey());
            value.serialize(jsonGenerator, serializerProvider);
        }
        jsonGenerator.writeEndObject();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r1.isNull() == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void serializeFilteredContents(com.fasterxml.jackson.core.JsonGenerator r4, com.fasterxml.jackson.databind.SerializerProvider r5, boolean r6, boolean r7) throws java.io.IOException {
        /*
            r3 = this;
            java.util.Map r3 = r3._contentsToSerialize(r5)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        Lc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            com.fasterxml.jackson.databind.JsonNode r1 = (com.fasterxml.jackson.databind.JsonNode) r1
            if (r6 == 0) goto L2d
            boolean r2 = r1.isArray()
            if (r2 == 0) goto L2d
            boolean r2 = r1.isEmpty(r5)
            if (r2 == 0) goto L2d
            goto Lc
        L2d:
            if (r7 == 0) goto L36
            boolean r2 = r1.isNull()
            if (r2 == 0) goto L36
            goto Lc
        L36:
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r4.writeFieldName(r0)
            r1.serialize(r4, r5)
            goto Lc
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.node.ObjectNode.serializeFilteredContents(com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, boolean, boolean):void");
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        boolean z;
        boolean z2;
        if (serializerProvider != null) {
            z = !serializerProvider.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
            z2 = !serializerProvider.isEnabled(JsonNodeFeature.WRITE_NULL_PROPERTIES);
        } else {
            z = false;
            z2 = false;
        }
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(this, JsonToken.START_OBJECT));
        if (z || z2) {
            serializeFilteredContents(jsonGenerator, serializerProvider, z, z2);
        } else {
            for (Map.Entry<String, JsonNode> entry : _contentsToSerialize(serializerProvider).entrySet()) {
                JsonNode value = entry.getValue();
                jsonGenerator.writeFieldName(entry.getKey());
                value.serialize(jsonGenerator, serializerProvider);
            }
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    public <T extends JsonNode> T set(String str, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        return _put(str, jsonNode);
    }

    public <T extends JsonNode> T setAll(Map<String, ? extends JsonNode> map) {
        for (Map.Entry<String, ? extends JsonNode> entry : map.entrySet()) {
            JsonNode value = entry.getValue();
            if (value == null) {
                value = nullNode();
            }
            _put(entry.getKey(), value);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public int size() {
        return this._children.size();
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode
    public Stream<JsonNode> valueStream() {
        return this._children.values().stream();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Iterator<JsonNode> values() {
        return this._children.values().iterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    @Deprecated
    public ObjectNode with(String str) {
        JsonPointer _jsonPointerIfValid = _jsonPointerIfValid(str);
        if (_jsonPointerIfValid != null) {
            return withObject(_jsonPointerIfValid);
        }
        JsonNode jsonNode = this._children.get(str);
        if (jsonNode == null) {
            ObjectNode objectNode = objectNode();
            _put(str, objectNode);
            return objectNode;
        }
        if (jsonNode instanceof ObjectNode) {
            return (ObjectNode) jsonNode;
        }
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Property '", str, "' has value that is not of type `ObjectNode` (but `");
        m2m.append(jsonNode.getClass().getName());
        m2m.append("`)");
        throw new UnsupportedOperationException(m2m.toString());
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public ArrayNode withArray(String str) {
        JsonPointer _jsonPointerIfValid = _jsonPointerIfValid(str);
        if (_jsonPointerIfValid != null) {
            return withArray(_jsonPointerIfValid);
        }
        JsonNode jsonNode = this._children.get(str);
        if (jsonNode == null) {
            ArrayNode arrayNode = arrayNode();
            _put(str, arrayNode);
            return arrayNode;
        }
        if (jsonNode instanceof ArrayNode) {
            return (ArrayNode) jsonNode;
        }
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Property '", str, "' has value that is not of type `ArrayNode` (but `");
        m2m.append(jsonNode.getClass().getName());
        m2m.append("`)");
        throw new UnsupportedOperationException(m2m.toString());
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public ArrayNode withArrayProperty(String str) {
        JsonNode jsonNode = this._children.get(str);
        return (jsonNode == null || jsonNode.isNull()) ? putArray(str) : jsonNode.isArray() ? (ArrayNode) jsonNode : (ArrayNode) _reportWrongNodeType("Cannot replace `JsonNode` of type `%s` with `ArrayNode` for property \"%s\" with (default mode `OverwriteMode.%s`)", jsonNode.getClass().getName(), str, JsonNode.OverwriteMode.NULLS);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public ObjectNode withObject(String str) {
        JsonPointer _jsonPointerIfValid = _jsonPointerIfValid(str);
        return _jsonPointerIfValid != null ? withObject(_jsonPointerIfValid) : withObjectProperty(str);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public ObjectNode withObjectProperty(String str) {
        JsonNode jsonNode = this._children.get(str);
        return (jsonNode == null || jsonNode.isNull()) ? putObject(str) : jsonNode.isObject() ? (ObjectNode) jsonNode : (ObjectNode) _reportWrongNodeType("Cannot replace `JsonNode` of type `%s` with `ObjectNode` for property \"%s\" (default mode `OverwriteMode.%s`)", jsonNode.getClass().getName(), str, JsonNode.OverwriteMode.NULLS);
    }

    public <T extends JsonNode> T without(Collection<String> collection) {
        this._children.keySet().removeAll(collection);
        return this;
    }

    @Deprecated
    public JsonNode putAll(ObjectNode objectNode) {
        return setAll(objectNode);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean isEmpty() {
        return this._children.isEmpty();
    }

    public JsonNode remove(String str) {
        return this._children.remove(str);
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode
    public /* bridge */ /* synthetic */ ObjectNode removeIf(Predicate predicate) {
        return removeIf2((Predicate<? super JsonNode>) predicate);
    }

    public ObjectNode retain(String... strArr) {
        return retain(Arrays.asList(strArr));
    }

    public <T extends JsonNode> T without(String str) {
        this._children.remove(str);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode get(int i) {
        return null;
    }

    public ObjectNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this._children = new LinkedHashMap();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode path(int i) {
        return MissingNode.getInstance();
    }

    public ObjectNode put(String str, short s) {
        return _put(str, numberNode(s));
    }

    @Deprecated
    public JsonNode put(String str, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        Map<String, JsonNode> map = this._children;
        Objects.requireNonNull(str);
        return map.put(str, jsonNode);
    }

    public ObjectNode put(String str, int i) {
        return _put(str, numberNode(i));
    }

    public ObjectNode put(String str, Integer num) {
        JsonNode numberNode;
        if (num == null) {
            numberNode = nullNode();
        } else {
            numberNode = numberNode(num.intValue());
        }
        return _put(str, numberNode);
    }

    public ObjectNode put(String str, long j) {
        return _put(str, numberNode(j));
    }

    public ObjectNode put(String str, Long l) {
        JsonNode numberNode;
        if (l == null) {
            numberNode = nullNode();
        } else {
            numberNode = numberNode(l.longValue());
        }
        return _put(str, numberNode);
    }

    public ObjectNode put(String str, float f) {
        return _put(str, numberNode(f));
    }

    public ObjectNode put(String str, Float f) {
        JsonNode numberNode;
        if (f == null) {
            numberNode = nullNode();
        } else {
            numberNode = numberNode(f.floatValue());
        }
        return _put(str, numberNode);
    }

    public ObjectNode put(String str, double d) {
        return _put(str, numberNode(d));
    }

    public ObjectNode put(String str, Double d) {
        JsonNode numberNode;
        if (d == null) {
            numberNode = nullNode();
        } else {
            numberNode = numberNode(d.doubleValue());
        }
        return _put(str, numberNode);
    }

    public ObjectNode put(String str, BigDecimal bigDecimal) {
        ValueNode numberNode;
        if (bigDecimal == null) {
            numberNode = nullNode();
        } else {
            numberNode = numberNode(bigDecimal);
        }
        return _put(str, numberNode);
    }

    public ObjectNode put(String str, BigInteger bigInteger) {
        ValueNode numberNode;
        if (bigInteger == null) {
            numberNode = nullNode();
        } else {
            numberNode = numberNode(bigInteger);
        }
        return _put(str, numberNode);
    }

    public <T extends JsonNode> T setAll(ObjectNode objectNode) {
        this._children.putAll(objectNode._children);
        return this;
    }

    public ObjectNode put(String str, String str2) {
        JsonNode textNode;
        if (str2 == null) {
            textNode = nullNode();
        } else {
            textNode = textNode(str2);
        }
        return _put(str, textNode);
    }

    public ObjectNode put(String str, boolean z) {
        return _put(str, booleanNode(z));
    }

    public ObjectNode put(String str, Boolean bool) {
        JsonNode booleanNode;
        if (bool == null) {
            booleanNode = nullNode();
        } else {
            booleanNode = booleanNode(bool.booleanValue());
        }
        return _put(str, booleanNode);
    }

    public ObjectNode put(String str, byte[] bArr) {
        JsonNode binaryNode;
        if (bArr == null) {
            binaryNode = nullNode();
        } else {
            binaryNode = binaryNode(bArr);
        }
        return _put(str, binaryNode);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ObjectNode)) {
            return _childrenEqual((ObjectNode) obj);
        }
        return false;
    }
}
