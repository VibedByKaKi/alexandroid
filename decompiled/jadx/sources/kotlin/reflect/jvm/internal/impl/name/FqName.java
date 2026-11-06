package kotlin.reflect.jvm.internal.impl.name;

import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SourceDebugExtension({"SMAP\nFqName.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FqName.kt\norg/jetbrains/kotlin/name/FqName\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"})
/* loaded from: classes10.dex */
public final class FqName {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @JvmField
    @NotNull
    public static final FqName ROOT = new FqName("");

    @NotNull
    private final FqNameUnsafe fqName;

    @Nullable
    private transient FqName parent;

    public FqName(@NotNull String str) {
        str.getClass();
        this.fqName = new FqNameUnsafe(str, this);
    }

    @NotNull
    public final String asString() {
        return this.fqName.asString();
    }

    @NotNull
    public final FqName child(@NotNull Name name) {
        name.getClass();
        return new FqName(this.fqName.child(name), this);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqName) && Intrinsics.areEqual(this.fqName, ((FqName) obj).fqName);
    }

    public int hashCode() {
        return this.fqName.hashCode();
    }

    public final boolean isRoot() {
        return this.fqName.isRoot();
    }

    @NotNull
    public final FqName parent() {
        FqName fqName = this.parent;
        if (fqName != null) {
            return fqName;
        }
        if (isRoot()) {
            Single$$ExternalSyntheticBUOutline0.m$2("root");
            return null;
        }
        FqName fqName2 = new FqName(this.fqName.parent());
        this.parent = fqName2;
        return fqName2;
    }

    @NotNull
    public final List<Name> pathSegments() {
        return this.fqName.pathSegments();
    }

    @NotNull
    public final Name shortName() {
        return this.fqName.shortName();
    }

    @NotNull
    public final Name shortNameOrSpecial() {
        return this.fqName.shortNameOrSpecial();
    }

    public final boolean startsWith(@NotNull Name name) {
        name.getClass();
        return this.fqName.startsWith(name);
    }

    @NotNull
    public String toString() {
        return this.fqName.toString();
    }

    @NotNull
    public final FqNameUnsafe toUnsafe() {
        return this.fqName;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final FqName topLevel(@NotNull Name name) {
            name.getClass();
            return new FqName(FqNameUnsafe.Companion.topLevel(name));
        }

        private Companion() {
        }
    }

    public FqName(@NotNull FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        this.fqName = fqNameUnsafe;
    }

    private FqName(FqNameUnsafe fqNameUnsafe, FqName fqName) {
        this.fqName = fqNameUnsafe;
        this.parent = fqName;
    }
}
