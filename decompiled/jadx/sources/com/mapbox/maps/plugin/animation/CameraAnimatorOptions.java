package com.mapbox.maps.plugin.animation;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.identity.auth.device.api.MultipleAccountManager;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.mapbox.maps.plugin.animation.CameraAnimatorOptions;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u0017*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0016\u0017B/\b\u0002\u0012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions;", ExifInterface.GPS_DIRECTION_TRUE, "", "targets", "", "startValue", MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER, "", "([Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V", "getOwner", "()Ljava/lang/String;", "getStartValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTargets", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "Builder", "Companion", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CameraAnimatorOptions<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String owner;

    @Nullable
    private final T startValue;

    @NotNull
    private final T[] targets;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0019\u0012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0004\"\u00028\u0001¢\u0006\u0002\u0010\u0005J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00028\u0001¢\u0006\u0002\u0010\u000fR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00018\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u001b\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions$Builder;", ExifInterface.GPS_DIRECTION_TRUE, "", "targets", "", "([Ljava/lang/Object;)V", MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER, "", "startValue", "Ljava/lang/Object;", "getTargets", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions;", "(Ljava/lang/Object;)Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions$Builder;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder<T> {

        @Nullable
        private String owner;

        @Nullable
        private T startValue;

        @NotNull
        private final T[] targets;

        public Builder(@NotNull T... tArr) {
            tArr.getClass();
            this.targets = tArr;
        }

        @NotNull
        public final CameraAnimatorOptions<T> build() {
            T[] tArr = this.targets;
            return new CameraAnimatorOptions<>(Arrays.copyOf(tArr, tArr.length), this.startValue, this.owner, null);
        }

        @NotNull
        public final T[] getTargets() {
            return this.targets;
        }

        @NotNull
        public final Builder<T> owner(@NotNull String owner) {
            owner.getClass();
            this.owner = owner;
            return this;
        }

        @NotNull
        public final Builder<T> startValue(T startValue) {
            this.startValue = startValue;
            return this;
        }
    }

    private CameraAnimatorOptions(T[] tArr, T t, String str) {
        this.targets = tArr;
        this.startValue = t;
        this.owner = str;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(CameraAnimatorOptions.class, other.getClass())) {
            return false;
        }
        CameraAnimatorOptions cameraAnimatorOptions = (CameraAnimatorOptions) other;
        return Intrinsics.areEqual(cameraAnimatorOptions.owner, this.owner) && Arrays.equals(cameraAnimatorOptions.targets, this.targets) && Intrinsics.areEqual(cameraAnimatorOptions.startValue, this.startValue);
    }

    @Nullable
    public final String getOwner() {
        return this.owner;
    }

    @Nullable
    public final T getStartValue() {
        return this.startValue;
    }

    @NotNull
    public final T[] getTargets() {
        return this.targets;
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.targets) * 31;
        String str = this.owner;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        T t = this.startValue;
        return hashCode2 + (t != null ? t.hashCode() : 0);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JR\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u0007\"\u0002H\u00052\u001f\b\u0002\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions$Companion;", "", "()V", "cameraAnimatorOptions", "Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions;", ExifInterface.GPS_DIRECTION_TRUE, "targets", "", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions$Builder;", "", "Lkotlin/ExtensionFunctionType;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CameraAnimatorOptions cameraAnimatorOptions$default(Companion companion, Object[] objArr, Function1 function1, int i, Object obj) {
            if ((i & 2) != 0) {
                function1 = new Function1<Builder<T>, Unit>() { // from class: com.mapbox.maps.plugin.animation.CameraAnimatorOptions$Companion$cameraAnimatorOptions$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                        invoke((CameraAnimatorOptions.Builder) obj2);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull CameraAnimatorOptions.Builder<T> builder) {
                        builder.getClass();
                    }
                };
            }
            objArr.getClass();
            function1.getClass();
            Builder builder = new Builder(Arrays.copyOf(objArr, objArr.length));
            function1.invoke(builder);
            return builder.build();
        }

        @NotNull
        public final <T> CameraAnimatorOptions<T> cameraAnimatorOptions(@NotNull T[] targets, @NotNull Function1<? super Builder<T>, Unit> block) {
            targets.getClass();
            block.getClass();
            Builder builder = new Builder(Arrays.copyOf(targets, targets.length));
            block.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CameraAnimatorOptions(Object[] objArr, Object obj, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(objArr, obj, str);
    }
}
