package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.Room$$ExternalSyntheticBUOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001eB9\b\u0000\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\b\u0010\u001c\u001a\u00020\u0019H\u0016J\u0018\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Landroidx/navigation/NavArgument;", "", "type", "Landroidx/navigation/NavType;", "isNullable", "", "defaultValue", "defaultValuePresent", "unknownDefaultValuePresent", "(Landroidx/navigation/NavType;ZLjava/lang/Object;ZZ)V", "getDefaultValue", "()Ljava/lang/Object;", "isDefaultValuePresent", "()Z", "isDefaultValueUnknown", "isDefaultValueUnknown$navigation_common_release", "getType", "()Landroidx/navigation/NavType;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "putDefaultValue", "", "name", "", "bundle", "Landroid/os/Bundle;", "toString", "verify", "Builder", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class NavArgument {

    @Nullable
    private final Object defaultValue;
    private final boolean isDefaultValuePresent;
    private final boolean isDefaultValueUnknown;
    private final boolean isNullable;

    @NotNull
    private final NavType<Object> type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u001a\u0010\u000e\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u000f0\bJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0011R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/navigation/NavArgument$Builder;", "", "()V", "defaultValue", "defaultValuePresent", "", "isNullable", "type", "Landroidx/navigation/NavType;", "unknownDefaultValuePresent", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Landroidx/navigation/NavArgument;", "setDefaultValue", "setIsNullable", "setType", ExifInterface.GPS_DIRECTION_TRUE, "setUnknownDefaultValuePresent", "setUnknownDefaultValuePresent$navigation_common_release", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private Object defaultValue;
        private boolean defaultValuePresent;
        private boolean isNullable;

        @Nullable
        private NavType<Object> type;
        private boolean unknownDefaultValuePresent;

        @NotNull
        public final NavArgument build() {
            NavType<Object> navType = this.type;
            if (navType == null) {
                navType = NavType.INSTANCE.inferFromValueType(this.defaultValue);
                navType.getClass();
            }
            return new NavArgument(navType, this.isNullable, this.defaultValue, this.defaultValuePresent, this.unknownDefaultValuePresent);
        }

        @NotNull
        public final Builder setDefaultValue(@Nullable Object defaultValue) {
            this.defaultValue = defaultValue;
            this.defaultValuePresent = true;
            return this;
        }

        @NotNull
        public final Builder setIsNullable(boolean isNullable) {
            this.isNullable = isNullable;
            return this;
        }

        @NotNull
        public final <T> Builder setType(@NotNull NavType<T> type) {
            type.getClass();
            this.type = type;
            return this;
        }

        @NotNull
        public final Builder setUnknownDefaultValuePresent$navigation_common_release(boolean unknownDefaultValuePresent) {
            this.unknownDefaultValuePresent = unknownDefaultValuePresent;
            return this;
        }
    }

    public NavArgument(@NotNull NavType<Object> navType, boolean z, @Nullable Object obj, boolean z2, boolean z3) {
        navType.getClass();
        if (!navType.getIsNullableAllowed() && z) {
            Room$$ExternalSyntheticBUOutline0.m((Object) navType.getName(), (Object) " does not allow nullable values");
            throw null;
        }
        if (!z && z2 && obj == null) {
            Room$$ExternalSyntheticBUOutline0.m$3("Argument with type ", navType.getName(), " has null value but is not nullable.");
            throw null;
        }
        this.type = navType;
        this.isNullable = z;
        this.defaultValue = obj;
        this.isDefaultValuePresent = z2 || z3;
        this.isDefaultValueUnknown = z3;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && Intrinsics.areEqual(NavArgument.class, other.getClass())) {
            NavArgument navArgument = (NavArgument) other;
            if (this.isNullable != navArgument.isNullable || this.isDefaultValuePresent != navArgument.isDefaultValuePresent || !Intrinsics.areEqual(this.type, navArgument.type)) {
                return false;
            }
            Object obj = this.defaultValue;
            Object obj2 = navArgument.defaultValue;
            if (obj != null) {
                return Intrinsics.areEqual(obj, obj2);
            }
            if (obj2 == null) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final Object getDefaultValue() {
        return this.defaultValue;
    }

    @NotNull
    public final NavType<Object> getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((this.type.hashCode() * 31) + (this.isNullable ? 1 : 0)) * 31) + (this.isDefaultValuePresent ? 1 : 0)) * 31;
        Object obj = this.defaultValue;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    /* renamed from: isDefaultValuePresent, reason: from getter */
    public final boolean getIsDefaultValuePresent() {
        return this.isDefaultValuePresent;
    }

    /* renamed from: isDefaultValueUnknown$navigation_common_release, reason: from getter */
    public final boolean getIsDefaultValueUnknown() {
        return this.isDefaultValueUnknown;
    }

    /* renamed from: isNullable, reason: from getter */
    public final boolean getIsNullable() {
        return this.isNullable;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void putDefaultValue(@NotNull String name, @NotNull Bundle bundle) {
        Object obj;
        name.getClass();
        bundle.getClass();
        if (!this.isDefaultValuePresent || (obj = this.defaultValue) == null) {
            return;
        }
        this.type.put(bundle, name, obj);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("NavArgument");
        sb.append(" Type: " + this.type);
        sb.append(" Nullable: " + this.isNullable);
        if (this.isDefaultValuePresent) {
            sb.append(" DefaultValue: " + this.defaultValue);
        }
        return sb.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean verify(@NotNull String name, @NotNull Bundle bundle) {
        name.getClass();
        bundle.getClass();
        if (!this.isNullable && bundle.containsKey(name) && bundle.get(name) == null) {
            return false;
        }
        try {
            this.type.get(bundle, name);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }
}
