package dagger.spi.shaded.androidx.room.compiler.processing;

import com.squareup.javapoet.ClassName;
import dagger.spi.shaded.androidx.room.compiler.codegen.XClassName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\b\u0010(\u001a\u00020)H&J\n\u0010*\u001a\u0004\u0018\u00010+H&J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-H&J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u0002000-H&J\u000e\u00101\u001a\b\u0012\u0004\u0012\u0002000-H\u0016J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020+0 H&J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020.0 H&J\u000e\u00104\u001a\b\u0012\u0004\u0012\u0002000 H&J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030 H\u0016J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020\u00000 H&J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020\u00000 H&J\b\u00108\u001a\u000209H&J\b\u0010:\u001a\u000209H&J\b\u0010;\u001a\u000209H&J\b\u0010<\u001a\u000209H&J\b\u0010=\u001a\u000209H&J\b\u0010>\u001a\u000209H&J\b\u0010?\u001a\u000209H&J\b\u0010@\u001a\u000209H&J\b\u0010A\u001a\u000209H&J\b\u0010B\u001a\u000209H&R\u001a\u0010\u0005\u001a\u00020\u00068&X§\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0012\u0010\u0019\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0 X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\u001c8VX\u0097\u0004¢\u0006\f\u0012\u0004\b$\u0010\b\u001a\u0004\b%\u0010\u001eR\u0012\u0010&\u001a\u00020\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006CÀ\u0006\u0001"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/XTypeElement;", "Ldagger/spi/shaded/androidx/room/compiler/processing/XHasModifiers;", "Ldagger/spi/shaded/androidx/room/compiler/processing/XParameterizable;", "Ldagger/spi/shaded/androidx/room/compiler/processing/XElement;", "Ldagger/spi/shaded/androidx/room/compiler/processing/XMemberContainer;", "className", "Lcom/squareup/javapoet/ClassName;", "getClassName$annotations", "()V", "getClassName", "()Lcom/squareup/javapoet/ClassName;", "closestMemberContainer", "getClosestMemberContainer", "()Landroidx/room/compiler/processing/XTypeElement;", "enclosingElement", "getEnclosingElement", "()Landroidx/room/compiler/processing/XMemberContainer;", "enclosingTypeElement", "getEnclosingTypeElement", "fallbackLocationText", "", "getFallbackLocationText", "()Ljava/lang/String;", "packageName", "getPackageName", "qualifiedName", "getQualifiedName", "superClass", "Ldagger/spi/shaded/androidx/room/compiler/processing/XType;", "getSuperClass", "()Landroidx/room/compiler/processing/XType;", "superInterfaces", "", "getSuperInterfaces", "()Ljava/util/List;", "superType", "getSuperType$annotations", "getSuperType", "type", "getType", "asClassName", "Ldagger/spi/shaded/androidx/room/compiler/codegen/XClassName;", "findPrimaryConstructor", "Ldagger/spi/shaded/androidx/room/compiler/processing/XConstructorElement;", "getAllFieldsIncludingPrivateSupers", "Lkotlin/sequences/Sequence;", "Ldagger/spi/shaded/androidx/room/compiler/processing/XFieldElement;", "getAllMethods", "Ldagger/spi/shaded/androidx/room/compiler/processing/XMethodElement;", "getAllNonPrivateInstanceMethods", "getConstructors", "getDeclaredFields", "getDeclaredMethods", "getEnclosedElements", "getEnclosedTypeElements", "getSuperInterfaceElements", "isAnnotationClass", "", "isClass", "isCompanionObject", "isDataClass", "isExpect", "isFunctionalInterface", "isInterface", "isKotlinObject", "isNested", "isValueClass", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface XTypeElement extends XHasModifiers, XParameterizable, XElement, XMemberContainer {
    @Override // dagger.spi.shaded.androidx.room.compiler.processing.XMemberContainer
    @NotNull
    XClassName asClassName();

    @Nullable
    XConstructorElement findPrimaryConstructor();

    @NotNull
    Sequence<XFieldElement> getAllFieldsIncludingPrivateSupers();

    @NotNull
    Sequence<XMethodElement> getAllMethods();

    @NotNull
    default Sequence<XMethodElement> getAllNonPrivateInstanceMethods() {
        return SequencesKt.filter(getAllMethods(), new Function1<XMethodElement, Boolean>() { // from class: dagger.spi.shaded.androidx.room.compiler.processing.XTypeElement$getAllNonPrivateInstanceMethods$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull XMethodElement xMethodElement) {
                xMethodElement.getClass();
                return Boolean.valueOf((xMethodElement.isPrivate() || xMethodElement.isStatic()) ? false : true);
            }
        });
    }

    @Override // dagger.spi.shaded.androidx.room.compiler.processing.XMemberContainer
    @NotNull
    ClassName getClassName();

    @NotNull
    List<XConstructorElement> getConstructors();

    @NotNull
    List<XFieldElement> getDeclaredFields();

    @NotNull
    List<XMethodElement> getDeclaredMethods();

    @NotNull
    default List<XElement> getEnclosedElements() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getEnclosedTypeElements());
        arrayList.addAll(getDeclaredFields());
        arrayList.addAll(getConstructors());
        arrayList.addAll(getDeclaredMethods());
        return arrayList;
    }

    @NotNull
    List<XTypeElement> getEnclosedTypeElements();

    @Override // dagger.spi.shaded.androidx.room.compiler.processing.XElement
    @Nullable
    XMemberContainer getEnclosingElement();

    @Nullable
    XTypeElement getEnclosingTypeElement();

    @Override // dagger.spi.shaded.androidx.room.compiler.processing.XElement
    @NotNull
    default String getFallbackLocationText() {
        return getQualifiedName();
    }

    @NotNull
    String getPackageName();

    @NotNull
    String getQualifiedName();

    @Nullable
    XType getSuperClass();

    @NotNull
    List<XTypeElement> getSuperInterfaceElements();

    @NotNull
    List<XType> getSuperInterfaces();

    @Nullable
    default XType getSuperType() {
        return getSuperClass();
    }

    @Override // dagger.spi.shaded.androidx.room.compiler.processing.XMemberContainer
    @NotNull
    XType getType();

    boolean isAnnotationClass();

    boolean isClass();

    boolean isCompanionObject();

    boolean isDataClass();

    boolean isExpect();

    boolean isFunctionalInterface();

    boolean isInterface();

    boolean isKotlinObject();

    boolean isNested();

    boolean isValueClass();

    @Override // dagger.spi.shaded.androidx.room.compiler.processing.XElement
    @NotNull
    default XTypeElement getClosestMemberContainer() {
        return this;
    }

    @Deprecated(message = "Use asClassName().toJavaPoet() to be clear the name is for JavaPoet.", replaceWith = @ReplaceWith(expression = "asClassName().toJavaPoet()", imports = {"dagger.spi.shaded.androidx.room.compiler.codegen.toJavaPoet"}))
    static /* synthetic */ void getClassName$annotations() {
    }

    @Deprecated(message = "Function name was misleading.", replaceWith = @ReplaceWith(expression = "superClass", imports = {}))
    static /* synthetic */ void getSuperType$annotations() {
    }
}
