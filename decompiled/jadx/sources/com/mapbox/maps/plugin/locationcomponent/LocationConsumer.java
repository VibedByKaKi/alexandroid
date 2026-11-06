package com.mapbox.maps.plugin.locationcomponent;

import android.animation.ValueAnimator;
import com.mapbox.common.location.LocationError;
import com.mapbox.geojson.Point;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00020\u0005\"\u00020\u00062\u001b\b\u0002\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0002\b\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J1\u0010\u000e\u001a\u00020\u00032\n\u0010\u000f\u001a\u00020\u0005\"\u00020\u00062\u001b\b\u0002\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0002\b\nH&J>\u0010\u0010\u001a\u00020\u00032\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u00132\u001b\b\u0002\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0002\b\nH&¢\u0006\u0002\u0010\u0014J!\u0010\u0015\u001a\u00020\u00032\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\b\nH&J!\u0010\u0016\u001a\u00020\u00032\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\b\nH&J!\u0010\u0017\u001a\u00020\u00032\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\b\nH&¨\u0006\u0018"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/LocationConsumer;", "", "onBearingUpdated", "", "bearing", "", "", "options", "Lkotlin/Function1;", "Landroid/animation/ValueAnimator;", "Lkotlin/ExtensionFunctionType;", "onError", "error", "Lcom/mapbox/common/location/LocationError;", "onHorizontalAccuracyRadiusUpdated", "radius", "onLocationUpdated", "location", "", "Lcom/mapbox/geojson/Point;", "([Lcom/mapbox/geojson/Point;Lkotlin/jvm/functions/Function1;)V", "onPuckAccuracyRadiusAnimatorDefaultOptionsUpdated", "onPuckBearingAnimatorDefaultOptionsUpdated", "onPuckLocationAnimatorDefaultOptionsUpdated", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface LocationConsumer {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void onBearingUpdated$default(LocationConsumer locationConsumer, double[] dArr, Function1 function1, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: onBearingUpdated");
                return;
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            locationConsumer.onBearingUpdated(dArr, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void onHorizontalAccuracyRadiusUpdated$default(LocationConsumer locationConsumer, double[] dArr, Function1 function1, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: onHorizontalAccuracyRadiusUpdated");
                return;
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            locationConsumer.onHorizontalAccuracyRadiusUpdated(dArr, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void onLocationUpdated$default(LocationConsumer locationConsumer, Point[] pointArr, Function1 function1, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: onLocationUpdated");
                return;
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            locationConsumer.onLocationUpdated(pointArr, function1);
        }
    }

    void onBearingUpdated(@NotNull double[] bearing, @Nullable Function1<? super ValueAnimator, Unit> options);

    void onError(@NotNull LocationError error);

    void onHorizontalAccuracyRadiusUpdated(@NotNull double[] radius, @Nullable Function1<? super ValueAnimator, Unit> options);

    void onLocationUpdated(@NotNull Point[] location, @Nullable Function1<? super ValueAnimator, Unit> options);

    void onPuckAccuracyRadiusAnimatorDefaultOptionsUpdated(@NotNull Function1<? super ValueAnimator, Unit> options);

    void onPuckBearingAnimatorDefaultOptionsUpdated(@NotNull Function1<? super ValueAnimator, Unit> options);

    void onPuckLocationAnimatorDefaultOptionsUpdated(@NotNull Function1<? super ValueAnimator, Unit> options);
}
