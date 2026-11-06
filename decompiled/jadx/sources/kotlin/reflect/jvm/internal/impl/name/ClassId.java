package kotlin.reflect.jvm.internal.impl.name;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SourceDebugExtension({"SMAP\nClassId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassId.kt\norg/jetbrains/kotlin/name/ClassId\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n*L\n1#1,141:1\n1#2:142\n231#3:143\n231#3:144\n*S KotlinDebug\n*F\n+ 1 ClassId.kt\norg/jetbrains/kotlin/name/ClassId\n*L\n37#1:143\n47#1:144\n*E\n"})
/* loaded from: classes10.dex */
public final class ClassId {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final boolean isLocal;

    @NotNull
    private final FqName packageFqName;

    @NotNull
    private final FqName relativeClassName;

    public ClassId(@NotNull FqName fqName, @NotNull FqName fqName2, boolean z) {
        fqName.getClass();
        fqName2.getClass();
        this.packageFqName = fqName;
        this.relativeClassName = fqName2;
        this.isLocal = z;
        fqName2.isRoot();
    }

    private static final String asString$escapeSlashes(FqName fqName) {
        boolean contains$default;
        String asString = fqName.asString();
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) asString, '/', false, 2, (Object) null);
        return contains$default ? AppLaunchChecker$$ExternalSyntheticOutline0.m('`', "`", asString) : asString;
    }

    @JvmStatic
    @NotNull
    public static final ClassId topLevel(@NotNull FqName fqName) {
        return Companion.topLevel(fqName);
    }

    @NotNull
    public final FqName asSingleFqName() {
        if (this.packageFqName.isRoot()) {
            return this.relativeClassName;
        }
        return new FqName(this.packageFqName.asString() + '.' + this.relativeClassName.asString());
    }

    @NotNull
    public final String asString() {
        String replace$default;
        if (this.packageFqName.isRoot()) {
            return asString$escapeSlashes(this.relativeClassName);
        }
        StringBuilder sb = new StringBuilder();
        replace$default = StringsKt__StringsJVMKt.replace$default(this.packageFqName.asString(), '.', '/', false, 4, (Object) null);
        sb.append(replace$default);
        sb.append("/");
        sb.append(asString$escapeSlashes(this.relativeClassName));
        return sb.toString();
    }

    @NotNull
    public final ClassId createNestedClassId(@NotNull Name name) {
        name.getClass();
        return new ClassId(this.packageFqName, this.relativeClassName.child(name), this.isLocal);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassId)) {
            return false;
        }
        ClassId classId = (ClassId) obj;
        return Intrinsics.areEqual(this.packageFqName, classId.packageFqName) && Intrinsics.areEqual(this.relativeClassName, classId.relativeClassName) && this.isLocal == classId.isLocal;
    }

    @Nullable
    public final ClassId getOuterClassId() {
        FqName parent = this.relativeClassName.parent();
        if (parent.isRoot()) {
            return null;
        }
        return new ClassId(this.packageFqName, parent, this.isLocal);
    }

    @NotNull
    public final FqName getPackageFqName() {
        return this.packageFqName;
    }

    @NotNull
    public final FqName getRelativeClassName() {
        return this.relativeClassName;
    }

    @NotNull
    public final Name getShortClassName() {
        return this.relativeClassName.shortName();
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLocal) + ((this.relativeClassName.hashCode() + (this.packageFqName.hashCode() * 31)) * 31);
    }

    public final boolean isLocal() {
        return this.isLocal;
    }

    public final boolean isNestedClass() {
        return !this.relativeClassName.parent().isRoot();
    }

    @NotNull
    public String toString() {
        if (!this.packageFqName.isRoot()) {
            return asString();
        }
        return "/" + asString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ClassId fromString$default(Companion companion, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.fromString(str, z);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final ClassId fromString(@NotNull String str, boolean z) {
            int indexOf$default;
            int lastIndexOf$default;
            String replace$default;
            String replace$default2;
            str.getClass();
            indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '`', 0, false, 6, (Object) null);
            if (indexOf$default == -1) {
                indexOf$default = str.length();
            }
            lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default(str, "/", indexOf$default, false, 4, (Object) null);
            String str2 = "";
            if (lastIndexOf$default == -1) {
                replace$default2 = StringsKt__StringsJVMKt.replace$default(str, "`", "", false, 4, (Object) null);
            } else {
                replace$default = StringsKt__StringsJVMKt.replace$default(str.substring(0, lastIndexOf$default), '/', '.', false, 4, (Object) null);
                replace$default2 = StringsKt__StringsJVMKt.replace$default(str.substring(lastIndexOf$default + 1), "`", "", false, 4, (Object) null);
                str2 = replace$default;
            }
            return new ClassId(new FqName(str2), new FqName(replace$default2), z);
        }

        @JvmStatic
        @NotNull
        public final ClassId topLevel(@NotNull FqName fqName) {
            fqName.getClass();
            return new ClassId(fqName.parent(), fqName.shortName());
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClassId(@NotNull FqName fqName, @NotNull Name name) {
        this(fqName, FqName.Companion.topLevel(name), false);
        fqName.getClass();
        name.getClass();
    }
}
