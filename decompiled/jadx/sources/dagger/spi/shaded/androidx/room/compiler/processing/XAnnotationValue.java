package dagger.spi.shaded.androidx.room.compiler.processing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u001f\bf\u0018\u00002\u00020\u0001J\b\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0010H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0010H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0010H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0010H\u0016J\b\u0010$\u001a\u00020%H\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0010H\u0016J\b\u0010'\u001a\u00020(H\u0016J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0010H\u0016J\b\u0010*\u001a\u00020+H\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0010H\u0016J\b\u0010-\u001a\u00020\u0003H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0016J\b\u0010/\u001a\u00020\nH\u0016J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0016J\b\u00101\u001a\u00020\u0013H&J\b\u00102\u001a\u00020\u0013H&J\b\u00103\u001a\u00020\u0013H&J\b\u00104\u001a\u00020\u0013H&J\b\u00105\u001a\u00020\u0013H&J\b\u00106\u001a\u00020\u0013H&J\b\u00107\u001a\u00020\u0013H&J\b\u00108\u001a\u00020\u0013H&J\b\u00109\u001a\u00020\u0013H&J\b\u0010:\u001a\u00020\u0013H&J\b\u0010;\u001a\u00020\u0013H&J\b\u0010<\u001a\u00020\u0013H&J\b\u0010=\u001a\u00020\u0013H&J\b\u0010>\u001a\u00020\u0013H&J\b\u0010?\u001a\u00020\u0013H&J\b\u0010@\u001a\u00020\u0013H&J\b\u0010A\u001a\u00020\u0013H&J\b\u0010B\u001a\u00020\u0013H&J\b\u0010C\u001a\u00020\u0013H&J\b\u0010D\u001a\u00020\u0013H&J\b\u0010E\u001a\u00020\u0013H&J\b\u0010F\u001a\u00020\u0013H&J\b\u0010G\u001a\u00020\u0013H&J\b\u0010H\u001a\u00020\u0013H&J\b\u0010I\u001a\u00020\u0013H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006JÀ\u0006\u0001"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/XAnnotationValue;", "", "name", "", "getName", "()Ljava/lang/String;", "value", "getValue", "()Ljava/lang/Object;", "valueType", "Ldagger/spi/shaded/androidx/room/compiler/processing/XType;", "getValueType", "()Landroidx/room/compiler/processing/XType;", "asAnnotation", "Ldagger/spi/shaded/androidx/room/compiler/processing/XAnnotation;", "asAnnotationList", "", "asAnnotationValueList", "asBoolean", "", "asBooleanList", "asByte", "", "asByteList", "asChar", "", "asCharList", "asDouble", "", "asDoubleList", "asEnum", "Ldagger/spi/shaded/androidx/room/compiler/processing/XEnumEntry;", "asEnumList", "asFloat", "", "asFloatList", "asInt", "", "asIntList", "asLong", "", "asLongList", "asShort", "", "asShortList", "asString", "asStringList", "asType", "asTypeList", "hasAnnotationListValue", "hasAnnotationValue", "hasBooleanListValue", "hasBooleanValue", "hasByteListValue", "hasByteValue", "hasCharListValue", "hasCharValue", "hasDoubleListValue", "hasDoubleValue", "hasEnumListValue", "hasEnumValue", "hasFloatListValue", "hasFloatValue", "hasIntListValue", "hasIntValue", "hasListValue", "hasLongListValue", "hasLongValue", "hasShortListValue", "hasShortValue", "hasStringListValue", "hasStringValue", "hasTypeListValue", "hasTypeValue", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface XAnnotationValue {
    @NotNull
    default XAnnotation asAnnotation() {
        Object value = getValue();
        value.getClass();
        return (XAnnotation) value;
    }

    @NotNull
    default List<XAnnotation> asAnnotationList() {
        List<XAnnotationValue> asAnnotationValueList = asAnnotationValueList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asAnnotationValueList, 10));
        Iterator<T> it2 = asAnnotationValueList.iterator();
        while (it2.hasNext()) {
            arrayList.add(((XAnnotationValue) it2.next()).asAnnotation());
        }
        return arrayList;
    }

    @NotNull
    default List<XAnnotationValue> asAnnotationValueList() {
        Object value = getValue();
        value.getClass();
        return (List) value;
    }

    default boolean asBoolean() {
        Object value = getValue();
        value.getClass();
        return ((Boolean) value).booleanValue();
    }

    @NotNull
    default List<Boolean> asBooleanList() {
        List<XAnnotationValue> asAnnotationValueList = asAnnotationValueList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asAnnotationValueList, 10));
        Iterator<T> it2 = asAnnotationValueList.iterator();
        while (it2.hasNext()) {
            arrayList.add(Boolean.valueOf(((XAnnotationValue) it2.next()).asBoolean()));
        }
        return arrayList;
    }

    default byte asByte() {
        Object value = getValue();
        value.getClass();
        return ((Byte) value).byteValue();
    }

    @NotNull
    default List<Byte> asByteList() {
        List<XAnnotationValue> asAnnotationValueList = asAnnotationValueList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asAnnotationValueList, 10));
        Iterator<T> it2 = asAnnotationValueList.iterator();
        while (it2.hasNext()) {
            arrayList.add(Byte.valueOf(((XAnnotationValue) it2.next()).asByte()));
        }
        return arrayList;
    }

    default char asChar() {
        Object value = getValue();
        value.getClass();
        return ((Character) value).charValue();
    }

    @NotNull
    default List<Character> asCharList() {
        List<XAnnotationValue> asAnnotationValueList = asAnnotationValueList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asAnnotationValueList, 10));
        Iterator<T> it2 = asAnnotationValueList.iterator();
        while (it2.hasNext()) {
            arrayList.add(Character.valueOf(((XAnnotationValue) it2.next()).asChar()));
        }
        return arrayList;
    }

    default double asDouble() {
        Object value = getValue();
        value.getClass();
        return ((Double) value).doubleValue();
    }

    @NotNull
    default List<Double> asDoubleList() {
        List<XAnnotationValue> asAnnotationValueList = asAnnotationValueList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asAnnotationValueList, 10));
        Iterator<T> it2 = asAnnotationValueList.iterator();
        while (it2.hasNext()) {
            arrayList.add(Double.valueOf(((XAnnotationValue) it2.next()).asDouble()));
        }
        return arrayList;
    }

    @NotNull
    default XEnumEntry asEnum() {
        Object value = getValue();
        value.getClass();
        return (XEnumEntry) value;
    }

    @NotNull
    default List<XEnumEntry> asEnumList() {
        List<XAnnotationValue> asAnnotationValueList = asAnnotationValueList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asAnnotationValueList, 10));
        Iterator<T> it2 = asAnnotationValueList.iterator();
        while (it2.hasNext()) {
            arrayList.add(((XAnnotationValue) it2.next()).asEnum());
        }
        return arrayList;
    }

    default float asFloat() {
        Object value = getValue();
        value.getClass();
        return ((Float) value).floatValue();
    }

    @NotNull
    default List<Float> asFloatList() {
        List<XAnnotationValue> asAnnotationValueList = asAnnotationValueList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asAnnotationValueList, 10));
        Iterator<T> it2 = asAnnotationValueList.iterator();
        while (it2.hasNext()) {
            Object value = ((XAnnotationValue) it2.next()).getValue();
            value.getClass();
            arrayList.add((Float) value);
        }
        return arrayList;
    }

    default int asInt() {
        Object value = getValue();
        value.getClass();
        return ((Integer) value).intValue();
    }

    @NotNull
    default List<Integer> asIntList() {
        List<XAnnotationValue> asAnnotationValueList = asAnnotationValueList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asAnnotationValueList, 10));
        Iterator<T> it2 = asAnnotationValueList.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((XAnnotationValue) it2.next()).asInt()));
        }
        return arrayList;
    }

    default long asLong() {
        Object value = getValue();
        value.getClass();
        return ((Long) value).longValue();
    }

    @NotNull
    default List<Long> asLongList() {
        List<XAnnotationValue> asAnnotationValueList = asAnnotationValueList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asAnnotationValueList, 10));
        Iterator<T> it2 = asAnnotationValueList.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((XAnnotationValue) it2.next()).asLong()));
        }
        return arrayList;
    }

    default short asShort() {
        Object value = getValue();
        value.getClass();
        return ((Short) value).shortValue();
    }

    @NotNull
    default List<Short> asShortList() {
        List<XAnnotationValue> asAnnotationValueList = asAnnotationValueList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asAnnotationValueList, 10));
        Iterator<T> it2 = asAnnotationValueList.iterator();
        while (it2.hasNext()) {
            arrayList.add(Short.valueOf(((XAnnotationValue) it2.next()).asShort()));
        }
        return arrayList;
    }

    @NotNull
    default String asString() {
        Object value = getValue();
        value.getClass();
        return (String) value;
    }

    @NotNull
    default List<String> asStringList() {
        List<XAnnotationValue> asAnnotationValueList = asAnnotationValueList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asAnnotationValueList, 10));
        Iterator<T> it2 = asAnnotationValueList.iterator();
        while (it2.hasNext()) {
            arrayList.add(((XAnnotationValue) it2.next()).asString());
        }
        return arrayList;
    }

    @NotNull
    default XType asType() {
        Object value = getValue();
        value.getClass();
        return (XType) value;
    }

    @NotNull
    default List<XType> asTypeList() {
        List<XAnnotationValue> asAnnotationValueList = asAnnotationValueList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asAnnotationValueList, 10));
        Iterator<T> it2 = asAnnotationValueList.iterator();
        while (it2.hasNext()) {
            arrayList.add(((XAnnotationValue) it2.next()).asType());
        }
        return arrayList;
    }

    @NotNull
    String getName();

    @Nullable
    Object getValue();

    @NotNull
    XType getValueType();

    boolean hasAnnotationListValue();

    boolean hasAnnotationValue();

    boolean hasBooleanListValue();

    boolean hasBooleanValue();

    boolean hasByteListValue();

    boolean hasByteValue();

    boolean hasCharListValue();

    boolean hasCharValue();

    boolean hasDoubleListValue();

    boolean hasDoubleValue();

    boolean hasEnumListValue();

    boolean hasEnumValue();

    boolean hasFloatListValue();

    boolean hasFloatValue();

    boolean hasIntListValue();

    boolean hasIntValue();

    boolean hasListValue();

    boolean hasLongListValue();

    boolean hasLongValue();

    boolean hasShortListValue();

    boolean hasShortValue();

    boolean hasStringListValue();

    boolean hasStringValue();

    boolean hasTypeListValue();

    boolean hasTypeValue();
}
