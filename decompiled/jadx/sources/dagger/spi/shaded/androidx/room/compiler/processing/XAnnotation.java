package dagger.spi.shaded.androidx.room.compiler.processing;

import com.squareup.javapoet.ClassName;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\fH&J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u00032\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00032\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00032\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00032\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00032\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00032\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010-\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00032\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u00100\u001a\u0002012\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0016\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00032\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u00103\u001a\u0002042\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0016\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00032\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u00106\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u00108\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u0006\u0010\u001a\u001a\u00020\fH\u0016R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006:À\u0006\u0001"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/XAnnotation;", "", "annotationValues", "", "Ldagger/spi/shaded/androidx/room/compiler/processing/XAnnotationValue;", "getAnnotationValues", "()Ljava/util/List;", "className", "Lcom/squareup/javapoet/ClassName;", "getClassName", "()Lcom/squareup/javapoet/ClassName;", "name", "", "getName", "()Ljava/lang/String;", "qualifiedName", "getQualifiedName", "type", "Ldagger/spi/shaded/androidx/room/compiler/processing/XType;", "getType", "()Landroidx/room/compiler/processing/XType;", "typeElement", "Ldagger/spi/shaded/androidx/room/compiler/processing/XTypeElement;", "getTypeElement", "()Landroidx/room/compiler/processing/XTypeElement;", "getAnnotationValue", "methodName", "getAsAnnotation", "getAsAnnotationList", "getAsAnnotationValueList", "getAsBoolean", "", "getAsBooleanList", "getAsByte", "", "getAsByteList", "getAsDouble", "", "getAsDoubleList", "getAsEnum", "Ldagger/spi/shaded/androidx/room/compiler/processing/XEnumEntry;", "getAsEnumList", "getAsFloat", "", "getAsFloatList", "getAsInt", "", "getAsIntList", "getAsLong", "", "getAsLongList", "getAsShort", "", "getAsShortList", "getAsString", "getAsStringList", "getAsType", "getAsTypeList", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface XAnnotation {
    @NotNull
    XAnnotationValue getAnnotationValue(@NotNull String methodName);

    @NotNull
    List<XAnnotationValue> getAnnotationValues();

    @NotNull
    default XAnnotation getAsAnnotation(@NotNull String methodName) {
        methodName.getClass();
        return getAnnotationValue(methodName).asAnnotation();
    }

    @NotNull
    default List<XAnnotation> getAsAnnotationList(@NotNull String methodName) {
        methodName.getClass();
        return getAnnotationValue(methodName).asAnnotationList();
    }

    @NotNull
    default List<XAnnotationValue> getAsAnnotationValueList(@NotNull String methodName) {
        methodName.getClass();
        return getAnnotationValue(methodName).asAnnotationValueList();
    }

    default boolean getAsBoolean(@NotNull String methodName) {
        methodName.getClass();
        return getAnnotationValue(methodName).asBoolean();
    }

    @NotNull
    default List<Boolean> getAsBooleanList(@NotNull String methodName) {
        methodName.getClass();
        return getAnnotationValue(methodName).asBooleanList();
    }

    default byte getAsByte(@NotNull String methodName) {
        methodName.getClass();
        return getAnnotationValue(methodName).asByte();
    }

    @NotNull
    default List<Byte> getAsByteList(@NotNull String methodName) {
        methodName.getClass();
        return getAnnotationValue(methodName).asByteList();
    }

    default double getAsDouble(@NotNull String methodName) {
        methodName.getClass();
        return getAnnotationValue(methodName).asDouble();
    }

    @NotNull
    default List<Double> getAsDoubleList(@NotNull String methodName) {
        methodName.getClass();
        return getAnnotationValue(methodName).asDoubleList();
    }

    @NotNull
    default XEnumEntry getAsEnum(@NotNull String methodName) {
        methodName.getClass();
        return getAnnotationValue(methodName).asEnum();
    }

    @NotNull
    default List<XEnumEntry> getAsEnumList(@NotNull String methodName) {
        methodName.getClass();
        return getAnnotationValue(methodName).asEnumList();
    }

    default float getAsFloat(@NotNull String methodName) {
        methodName.getClass();
        return getAnnotationValue(methodName).asFloat();
    }

    @NotNull
    default List<Float> getAsFloatList(@NotNull String methodName) {
        methodName.getClass();
        return getAnnotationValue(methodName).asFloatList();
    }

    default int getAsInt(@NotNull String methodName) {
        methodName.getClass();
        return getAnnotationValue(methodName).asInt();
    }

    @NotNull
    default List<Integer> getAsIntList(@NotNull String methodName) {
        methodName.getClass();
        return getAnnotationValue(methodName).asIntList();
    }

    default long getAsLong(@NotNull String methodName) {
        methodName.getClass();
        return getAnnotationValue(methodName).asLong();
    }

    @NotNull
    default List<Long> getAsLongList(@NotNull String methodName) {
        methodName.getClass();
        return getAnnotationValue(methodName).asLongList();
    }

    default short getAsShort(@NotNull String methodName) {
        methodName.getClass();
        return getAnnotationValue(methodName).asShort();
    }

    @NotNull
    default List<Short> getAsShortList(@NotNull String methodName) {
        methodName.getClass();
        return getAnnotationValue(methodName).asShortList();
    }

    @NotNull
    default String getAsString(@NotNull String methodName) {
        methodName.getClass();
        return getAnnotationValue(methodName).asString();
    }

    @NotNull
    default List<String> getAsStringList(@NotNull String methodName) {
        methodName.getClass();
        return getAnnotationValue(methodName).asStringList();
    }

    @NotNull
    default XType getAsType(@NotNull String methodName) {
        methodName.getClass();
        return getAnnotationValue(methodName).asType();
    }

    @NotNull
    default List<XType> getAsTypeList(@NotNull String methodName) {
        methodName.getClass();
        return getAnnotationValue(methodName).asTypeList();
    }

    @NotNull
    default ClassName getClassName() {
        return getTypeElement().asClassName().getJava();
    }

    @NotNull
    String getName();

    @NotNull
    String getQualifiedName();

    @NotNull
    XType getType();

    @NotNull
    default XTypeElement getTypeElement() {
        XTypeElement typeElement = getType().getTypeElement();
        if (typeElement != null) {
            return typeElement;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
        return null;
    }
}
