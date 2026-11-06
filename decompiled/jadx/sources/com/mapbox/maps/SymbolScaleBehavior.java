package com.mapbox.maps;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.identity.auth.accounts.MultipleAccountsCommunication$DoesAccountHaveMappingAction;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B/\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\r\u0010\u0013\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0014J\r\u0010\u0015\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/mapbox/maps/SymbolScaleBehavior;", "", "type", "", "scaleFactor", "", MultipleAccountsCommunication$DoesAccountHaveMappingAction.KEY_ACCOUNT_MAPPING, "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;)V", "getMapping$maps_sdk_release", "()Lkotlin/jvm/functions/Function1;", "getScaleFactor$maps_sdk_release", "()Ljava/lang/Float;", "Ljava/lang/Float;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "isFixed", "isFixed$maps_sdk_release", "isSystem", "isSystem$maps_sdk_release", "toString", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
/* loaded from: classes8.dex */
public final class SymbolScaleBehavior {

    @NotNull
    private static final String TYPE_FIXED = "FIXED";

    @NotNull
    private static final String TYPE_SYSTEM = "SYSTEM";

    @Nullable
    private final Function1<Float, Float> mapping;

    @Nullable
    private final Float scaleFactor;

    @NotNull
    private final String type;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Function1<Float, Float> defaultMapping = new Function1<Float, Float>() { // from class: com.mapbox.maps.SymbolScaleBehavior$Companion$defaultMapping$1
        @NotNull
        public final Float invoke(float f) {
            if (f < 0.85f) {
                f = 0.8f;
            } else if (f > 2.0f) {
                f = 2.0f;
            } else if (f < 1.0f) {
                f = (((f - 0.85f) / 0.15f) * 0.2f) + 0.8f;
            }
            return Float.valueOf(f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f) {
            return invoke(f.floatValue());
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    private SymbolScaleBehavior(String str, Float f, Function1<? super Float, Float> function1) {
        this.type = str;
        this.scaleFactor = f;
        this.mapping = function1;
    }

    @JvmStatic
    @NotNull
    public static final SymbolScaleBehavior fixed(float f) {
        return INSTANCE.fixed(f);
    }

    @NotNull
    public static final SymbolScaleBehavior getSystem() {
        return INSTANCE.getSystem();
    }

    @JvmStatic
    @NotNull
    public static final SymbolScaleBehavior system(@NotNull Function1<? super Float, Float> function1) {
        return INSTANCE.system(function1);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof SymbolScaleBehavior)) {
            return false;
        }
        SymbolScaleBehavior symbolScaleBehavior = (SymbolScaleBehavior) other;
        return Intrinsics.areEqual(this.type, symbolScaleBehavior.type) && Intrinsics.areEqual(this.scaleFactor, symbolScaleBehavior.scaleFactor) && this.mapping == symbolScaleBehavior.mapping;
    }

    @Nullable
    public final Function1<Float, Float> getMapping$maps_sdk_release() {
        return this.mapping;
    }

    @Nullable
    /* renamed from: getScaleFactor$maps_sdk_release, reason: from getter */
    public final Float getScaleFactor() {
        return this.scaleFactor;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.scaleFactor, this.mapping);
    }

    public final boolean isFixed$maps_sdk_release() {
        return Intrinsics.areEqual(this.type, TYPE_FIXED);
    }

    public final boolean isSystem$maps_sdk_release() {
        return Intrinsics.areEqual(this.type, TYPE_SYSTEM);
    }

    @NotNull
    public String toString() {
        String str = this.type;
        if (Intrinsics.areEqual(str, TYPE_FIXED)) {
            return "SymbolScaleBehavior.Fixed(scaleFactor=" + this.scaleFactor + ')';
        }
        if (!Intrinsics.areEqual(str, TYPE_SYSTEM)) {
            return ArcMode$$ExternalSyntheticOutline0.m(')', this.type, new StringBuilder("SymbolScaleBehavior(type="));
        }
        return ArcMode$$ExternalSyntheticOutline0.m(')', Intrinsics.areEqual(this.mapping, defaultMapping) ? "default" : "custom", new StringBuilder("SymbolScaleBehavior.System(mapping="));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\bH\u0007J\u001c\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/mapbox/maps/SymbolScaleBehavior$Companion;", "", "()V", "TYPE_FIXED", "", "TYPE_SYSTEM", "defaultMapping", "Lkotlin/Function1;", "", "getDefaultMapping$maps_sdk_release", "()Lkotlin/jvm/functions/Function1;", "system", "Lcom/mapbox/maps/SymbolScaleBehavior;", "getSystem$annotations", "getSystem", "()Lcom/mapbox/maps/SymbolScaleBehavior;", "fixed", "scaleFactor", MultipleAccountsCommunication$DoesAccountHaveMappingAction.KEY_ACCOUNT_MAPPING, "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @NotNull
        public final SymbolScaleBehavior fixed(float scaleFactor) {
            return new SymbolScaleBehavior(SymbolScaleBehavior.TYPE_FIXED, Float.valueOf(scaleFactor), null, 0 == true ? 1 : 0);
        }

        @NotNull
        public final Function1<Float, Float> getDefaultMapping$maps_sdk_release() {
            return SymbolScaleBehavior.defaultMapping;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final SymbolScaleBehavior getSystem() {
            Function1<Float, Float> defaultMapping$maps_sdk_release = getDefaultMapping$maps_sdk_release();
            return new SymbolScaleBehavior(SymbolScaleBehavior.TYPE_SYSTEM, null, defaultMapping$maps_sdk_release, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @NotNull
        public final SymbolScaleBehavior system(@NotNull Function1<? super Float, Float> mapping) {
            mapping.getClass();
            return new SymbolScaleBehavior(SymbolScaleBehavior.TYPE_SYSTEM, null, mapping, 0 == true ? 1 : 0);
        }

        private Companion() {
        }

        @JvmStatic
        public static /* synthetic */ void getSystem$annotations() {
        }
    }

    public /* synthetic */ SymbolScaleBehavior(String str, Float f, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, function1);
    }
}
