package org.apache.thrift.orig.partial;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.lang3.StringUtils;
import org.apache.thrift.orig.TBase;
import org.apache.thrift.orig.TFieldIdEnum;
import org.apache.thrift.orig.TUnion;
import org.apache.thrift.orig.meta_data.FieldMetaData;
import org.apache.thrift.orig.meta_data.ListMetaData;
import org.apache.thrift.orig.meta_data.MapMetaData;
import org.apache.thrift.orig.meta_data.SetMetaData;
import org.apache.thrift.orig.meta_data.StructMetaData;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ThriftMetadata {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ComparisonResult {
        UNKNOWN,
        EQUAL,
        NOT_EQUAL
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum FieldTypeEnum implements TFieldIdEnum {
        ROOT(0, "root"),
        ENUM(1, "enum"),
        LIST_ELEMENT(2, "listElement"),
        MAP_KEY(3, "mapKey"),
        MAP_VALUE(4, "mapValue"),
        SET_ELEMENT(5, "setElement");

        private final short id;
        private final String name;

        FieldTypeEnum(short s, String str) {
            this.id = s;
            this.name = str;
        }

        @Override // org.apache.thrift.orig.TFieldIdEnum
        public String getFieldName() {
            return this.name;
        }

        @Override // org.apache.thrift.orig.TFieldIdEnum
        public short getThriftFieldId() {
            return this.id;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class ThriftContainer extends ThriftObject {
        public ThriftContainer(ThriftObject thriftObject, TFieldIdEnum tFieldIdEnum, FieldMetaData fieldMetaData) {
            super(thriftObject, tFieldIdEnum, fieldMetaData);
        }

        public abstract boolean hasUnion();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ThriftEnum extends ThriftObject {
        private static EnumCache enums = new EnumCache();

        public ThriftEnum(ThriftObject thriftObject, TFieldIdEnum tFieldIdEnum, FieldMetaData fieldMetaData) {
            super(thriftObject, tFieldIdEnum, fieldMetaData);
        }

        @Override // org.apache.thrift.orig.partial.ThriftMetadata.ThriftObject
        public void toPrettyString(StringBuilder sb, int i) {
            append(sb, "%senum %s;\n", getIndent(i), getName());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ThriftList extends ThriftContainer {
        public final ThriftObject elementData;

        public ThriftList(ThriftObject thriftObject, TFieldIdEnum tFieldIdEnum, FieldMetaData fieldMetaData, List<ThriftField> list) {
            super(thriftObject, tFieldIdEnum, fieldMetaData);
            this.elementData = ThriftObject.Factory.createNew(this, FieldTypeEnum.LIST_ELEMENT, new FieldMetaData(getSubElementName(tFieldIdEnum), (byte) 1, ((ListMetaData) fieldMetaData.valueMetaData).elemMetaData), list);
        }

        @Override // org.apache.thrift.orig.partial.ThriftMetadata.ThriftContainer
        public boolean hasUnion() {
            return this.elementData instanceof ThriftUnion;
        }

        @Override // org.apache.thrift.orig.partial.ThriftMetadata.ThriftObject
        public void toPrettyString(StringBuilder sb, int i) {
            append(sb, "%slist<\n", getIndent(i));
            this.elementData.toPrettyString(sb, i + 1);
            append(sb, "%s> %s;\n", getIndent(i), getName());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ThriftMap extends ThriftContainer {
        public final ThriftObject keyData;
        public final ThriftObject valueData;

        public ThriftMap(ThriftObject thriftObject, TFieldIdEnum tFieldIdEnum, FieldMetaData fieldMetaData, List<ThriftField> list) {
            super(thriftObject, tFieldIdEnum, fieldMetaData);
            this.keyData = ThriftObject.Factory.createNew(this, FieldTypeEnum.MAP_KEY, new FieldMetaData(getSubElementName(tFieldIdEnum, "key"), (byte) 1, ((MapMetaData) fieldMetaData.valueMetaData).keyMetaData), Collections.EMPTY_LIST);
            this.valueData = ThriftObject.Factory.createNew(this, FieldTypeEnum.MAP_VALUE, new FieldMetaData(getSubElementName(tFieldIdEnum, "value"), (byte) 1, ((MapMetaData) fieldMetaData.valueMetaData).valueMetaData), list);
        }

        @Override // org.apache.thrift.orig.partial.ThriftMetadata.ThriftContainer
        public boolean hasUnion() {
            return (this.keyData instanceof ThriftUnion) || (this.valueData instanceof ThriftUnion);
        }

        @Override // org.apache.thrift.orig.partial.ThriftMetadata.ThriftObject
        public void toPrettyString(StringBuilder sb, int i) {
            append(sb, "%smap<\n", getIndent(i));
            int i2 = i + 1;
            append(sb, "%skey = {\n", getIndent(i2));
            int i3 = i + 2;
            this.keyData.toPrettyString(sb, i3);
            append(sb, "%s},\n", getIndent(i2));
            append(sb, "%svalue = {\n", getIndent(i2));
            this.valueData.toPrettyString(sb, i3);
            append(sb, "%s}\n", getIndent(i2));
            append(sb, "%s> %s;\n", getIndent(i), getName());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ThriftPrimitive extends ThriftObject {
        public ThriftPrimitive(ThriftObject thriftObject, TFieldIdEnum tFieldIdEnum, FieldMetaData fieldMetaData) {
            super(thriftObject, tFieldIdEnum, fieldMetaData);
        }

        private String getTypeName() {
            byte b = this.data.valueMetaData.type;
            if (b == 2) {
                return "bool";
            }
            if (b == 3) {
                return "byte";
            }
            if (b == 4) {
                return "double";
            }
            if (b == 6) {
                return "i16";
            }
            if (b == 8) {
                return "i32";
            }
            if (b == 10) {
                return "i64";
            }
            if (b == 11) {
                return isBinary() ? "binary" : TypedValues.Custom.S_STRING;
            }
            throw ThriftMetadata.unsupportedFieldTypeException(b);
        }

        public boolean isBinary() {
            return this.data.valueMetaData.isBinary();
        }

        @Override // org.apache.thrift.orig.partial.ThriftMetadata.ThriftObject
        public void toPrettyString(StringBuilder sb, int i) {
            append(sb, "%s%s %s;\n", getIndent(i), getTypeName(), getName());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ThriftSet extends ThriftContainer {
        public final ThriftObject elementData;

        public ThriftSet(ThriftObject thriftObject, TFieldIdEnum tFieldIdEnum, FieldMetaData fieldMetaData, List<ThriftField> list) {
            super(thriftObject, tFieldIdEnum, fieldMetaData);
            this.elementData = ThriftObject.Factory.createNew(this, FieldTypeEnum.SET_ELEMENT, new FieldMetaData(getSubElementName(tFieldIdEnum), (byte) 1, ((SetMetaData) fieldMetaData.valueMetaData).elemMetaData), list);
        }

        @Override // org.apache.thrift.orig.partial.ThriftMetadata.ThriftContainer
        public boolean hasUnion() {
            return this.elementData instanceof ThriftUnion;
        }

        @Override // org.apache.thrift.orig.partial.ThriftMetadata.ThriftObject
        public void toPrettyString(StringBuilder sb, int i) {
            append(sb, "%sset<\n", getIndent(i));
            this.elementData.toPrettyString(sb, i + 1);
            append(sb, "%s> %s;\n", getIndent(i), getName());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ThriftStruct<U extends TBase> extends ThriftStructBase {
        public final Map<Integer, ThriftObject> fields;

        public ThriftStruct(ThriftObject thriftObject, TFieldIdEnum tFieldIdEnum, FieldMetaData fieldMetaData, Iterable<ThriftField> iterable) {
            super(thriftObject, tFieldIdEnum, fieldMetaData);
            this.fields = getFields(this, ThriftStructBase.getStructClass(fieldMetaData), iterable);
        }

        private static TFieldIdEnum findFieldId(Map<? extends TFieldIdEnum, FieldMetaData> map, String str) {
            for (TFieldIdEnum tFieldIdEnum : map.keySet()) {
                if (tFieldIdEnum.getFieldName().equals(str)) {
                    return tFieldIdEnum;
                }
            }
            throw ThriftMetadata.fieldNotFoundException(str);
        }

        private static FieldMetaData findFieldMetaData(Map<? extends TFieldIdEnum, FieldMetaData> map, String str) {
            for (FieldMetaData fieldMetaData : map.values()) {
                if (fieldMetaData.fieldName.equals(str)) {
                    return fieldMetaData;
                }
            }
            throw ThriftMetadata.fieldNotFoundException(str);
        }

        public static <T extends TBase> ThriftStruct fromFieldNames(Class<T> cls, Collection<String> collection) {
            return fromFields(cls, ThriftField.fromNames(collection));
        }

        public static <T extends TBase> ThriftStruct fromFields(Class<T> cls, Iterable<ThriftField> iterable) {
            Validate.checkNotNull(cls, "clasz");
            Validate.checkNotNull(iterable, "fields");
            FieldTypeEnum fieldTypeEnum = FieldTypeEnum.ROOT;
            return new ThriftStruct(null, fieldTypeEnum, new FieldMetaData(fieldTypeEnum.getFieldName(), (byte) 1, new StructMetaData((byte) 12, cls)), iterable);
        }

        private static <U extends TBase> Map<Integer, ThriftObject> getFields(ThriftStruct thriftStruct, Class<U> cls, Iterable<ThriftField> iterable) {
            Map structMetaDataMap = FieldMetaData.getStructMetaDataMap(cls);
            HashMap hashMap = new HashMap();
            if (iterable.iterator().hasNext()) {
                for (ThriftField thriftField : iterable) {
                    String str = thriftField.name;
                    FieldMetaData findFieldMetaData = findFieldMetaData(structMetaDataMap, str);
                    TFieldIdEnum findFieldId = findFieldId(structMetaDataMap, str);
                    hashMap.put(Integer.valueOf(findFieldId.getThriftFieldId()), ThriftObject.Factory.createNew(thriftStruct, findFieldId, findFieldMetaData, thriftField.fields));
                }
            } else {
                for (Map.Entry entry : structMetaDataMap.entrySet()) {
                    TFieldIdEnum tFieldIdEnum = (TFieldIdEnum) entry.getKey();
                    hashMap.put(Integer.valueOf(tFieldIdEnum.getThriftFieldId()), ThriftObject.Factory.createNew(thriftStruct, tFieldIdEnum, (FieldMetaData) entry.getValue(), Collections.EMPTY_LIST));
                }
            }
            return hashMap;
        }

        public static <T extends TBase> ThriftStruct of(Class<T> cls) {
            return fromFields(cls, Collections.EMPTY_LIST);
        }

        public <T extends TBase> T createNewStruct() {
            try {
                return (T) ThriftStructBase.getStructClass(this.data).getDeclaredConstructor(null).newInstance(null);
            } catch (ReflectiveOperationException e) {
                Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
                return null;
            }
        }

        @Override // org.apache.thrift.orig.partial.ThriftMetadata.ThriftObject
        public void toPrettyString(StringBuilder sb, int i) {
            String indent = getIndent(i);
            int i2 = i + 1;
            String indent2 = getIndent(i2);
            append(sb, "%sstruct %s {\n", indent, getName());
            if (this.fields.size() == 0) {
                append(sb, "%s*;", indent2);
            } else {
                ArrayList arrayList = new ArrayList(this.fields.keySet());
                Collections.sort(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    this.fields.get((Integer) it2.next()).toPrettyString(sb, i2);
                }
            }
            append(sb, "%s}\n", indent);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            toPrettyString(sb, 0);
            return sb.toString();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ThriftUnion<U extends TBase> extends ThriftStructBase {
        public ThriftUnion(ThriftObject thriftObject, TFieldIdEnum tFieldIdEnum, FieldMetaData fieldMetaData, Iterable<ThriftField> iterable) {
            super(thriftObject, tFieldIdEnum, fieldMetaData);
        }

        @Override // org.apache.thrift.orig.partial.ThriftMetadata.ThriftObject
        public void toPrettyString(StringBuilder sb, int i) {
            String indent = getIndent(i);
            String indent2 = getIndent(i + 1);
            append(sb, "%sunion %s {\n", indent, getName());
            append(sb, "%s// unions not adequately supported at present.\n", indent2);
            append(sb, "%s}\n", indent);
        }
    }

    public static IllegalArgumentException fieldNotFoundException(String str) {
        return new IllegalArgumentException(a$$ExternalSyntheticOutline0.m("field not found: '", str, "'"));
    }

    public static UnsupportedOperationException unsupportedFieldTypeException(byte b) {
        return new UnsupportedOperationException(a$$ExternalSyntheticOutline0.m((int) b, "field type not supported: '", "'"));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class ThriftStructBase<U extends TBase> extends ThriftObject {
        public ThriftStructBase(ThriftObject thriftObject, TFieldIdEnum tFieldIdEnum, FieldMetaData fieldMetaData) {
            super(thriftObject, tFieldIdEnum, fieldMetaData);
        }

        public static ThriftStructBase create(ThriftObject thriftObject, TFieldIdEnum tFieldIdEnum, FieldMetaData fieldMetaData, Iterable<ThriftField> iterable) {
            return isUnion(fieldMetaData) ? new ThriftUnion(thriftObject, tFieldIdEnum, fieldMetaData, iterable) : new ThriftStruct(thriftObject, tFieldIdEnum, fieldMetaData, iterable);
        }

        public static boolean isUnion(FieldMetaData fieldMetaData) {
            return TUnion.class.isAssignableFrom(getStructClass(fieldMetaData));
        }

        public Class<U> getStructClass() {
            return getStructClass(this.data);
        }

        public static <U extends TBase> Class<U> getStructClass(FieldMetaData fieldMetaData) {
            return (Class<U>) ((StructMetaData) fieldMetaData.valueMetaData).structClass;
        }

        public boolean isUnion() {
            return isUnion(this.data);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class ThriftObject implements Serializable {
        public Object additionalData;
        public final FieldMetaData data;
        public final TFieldIdEnum fieldId;
        protected List<String> noFields = Collections.EMPTY_LIST;
        public final ThriftObject parent;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Factory {
            private Factory() {
            }

            public static ThriftObject createNew(ThriftObject thriftObject, TFieldIdEnum tFieldIdEnum, FieldMetaData fieldMetaData, List<ThriftField> list) {
                byte b = fieldMetaData.valueMetaData.type;
                if (b == -1) {
                    return new ThriftEnum(thriftObject, tFieldIdEnum, fieldMetaData);
                }
                if (b != 6 && b != 8 && b != 2 && b != 3 && b != 4) {
                    switch (b) {
                        case 10:
                        case 11:
                            break;
                        case 12:
                            return ThriftStructBase.create(thriftObject, tFieldIdEnum, fieldMetaData, list);
                        case 13:
                            return new ThriftMap(thriftObject, tFieldIdEnum, fieldMetaData, list);
                        case 14:
                            return new ThriftSet(thriftObject, tFieldIdEnum, fieldMetaData, list);
                        case 15:
                            return new ThriftList(thriftObject, tFieldIdEnum, fieldMetaData, list);
                        default:
                            throw ThriftMetadata.unsupportedFieldTypeException(b);
                    }
                }
                return new ThriftPrimitive(thriftObject, tFieldIdEnum, fieldMetaData);
            }
        }

        public ThriftObject(ThriftObject thriftObject, TFieldIdEnum tFieldIdEnum, FieldMetaData fieldMetaData) {
            this.parent = thriftObject;
            this.fieldId = tFieldIdEnum;
            this.data = fieldMetaData;
        }

        public void append(StringBuilder sb, String str, Object... objArr) {
            sb.append(String.format(str, objArr));
        }

        public String getIndent(int i) {
            return StringUtils.repeat(" ", i * 4);
        }

        public String getName() {
            return this.fieldId.getFieldName();
        }

        public String getSubElementName(TFieldIdEnum tFieldIdEnum, String str) {
            return a$$ExternalSyntheticOutline0.m$1(tFieldIdEnum.getFieldName(), "_", str);
        }

        public abstract void toPrettyString(StringBuilder sb, int i);

        public String getSubElementName(TFieldIdEnum tFieldIdEnum) {
            return getSubElementName(tFieldIdEnum, "element");
        }
    }
}
