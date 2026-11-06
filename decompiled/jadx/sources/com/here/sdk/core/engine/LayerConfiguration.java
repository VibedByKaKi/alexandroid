package com.here.sdk.core.engine;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class LayerConfiguration {

    @NonNull
    public List<Feature> enabledFeatures;

    @NonNull
    public List<Feature> implicitlyPrefetchedFeatures;

    @NonNull
    List<Feature> onDemandImplicitlyPrefetchedFeatures;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Feature {
        DETAIL_RENDERING(0),
        NAVIGATION(1),
        OFFLINE_SEARCH(2),
        OFFLINE_ROUTING(3),
        RENDERING(4),
        TRUCK(5),
        LANDMARKS_3D(6),
        TRAFFIC(7),
        EV(8),
        TRUCK_SERVICE_ATTRIBUTES(9),
        FUEL_STATION_ATTRIBUTES(10),
        OFFLINE_BUS_ROUTING(11),
        JUNCTION_VIEW_3X4(12),
        JUNCTION_VIEW_16X9(13),
        JUNCTION_SIGN_3X4(14),
        JUNCTION_SIGN_3X5(15),
        JUNCTION_SIGN_4X3(16),
        JUNCTION_SIGN_5X3(17),
        JUNCTION_SIGN_16X9(18),
        TERRAIN(19),
        ADAS(20),
        EHORIZON(21),
        RDS_TRAFFIC(22);

        public final int value;

        Feature(int i) {
            this.value = i;
        }
    }

    public LayerConfiguration() {
        Feature feature = Feature.DETAIL_RENDERING;
        Feature feature2 = Feature.NAVIGATION;
        Feature feature3 = Feature.OFFLINE_SEARCH;
        Feature feature4 = Feature.OFFLINE_ROUTING;
        Feature feature5 = Feature.RENDERING;
        Feature feature6 = Feature.TRUCK;
        this.enabledFeatures = new ArrayList(Arrays.asList(feature, feature2, feature3, feature4, feature5, feature6));
        this.implicitlyPrefetchedFeatures = new ArrayList(Arrays.asList(feature, feature2, feature3, feature4, feature5, feature6));
        this.onDemandImplicitlyPrefetchedFeatures = new ArrayList(Arrays.asList(feature, feature2, feature3, feature4, feature5, feature6, Feature.LANDMARKS_3D, Feature.TRAFFIC, Feature.RDS_TRAFFIC, Feature.EV, Feature.TRUCK_SERVICE_ATTRIBUTES, Feature.FUEL_STATION_ATTRIBUTES, Feature.OFFLINE_BUS_ROUTING, Feature.JUNCTION_VIEW_3X4, Feature.JUNCTION_VIEW_16X9, Feature.JUNCTION_SIGN_3X4, Feature.JUNCTION_SIGN_3X5, Feature.JUNCTION_SIGN_4X3, Feature.JUNCTION_SIGN_5X3, Feature.JUNCTION_SIGN_16X9, Feature.TERRAIN, Feature.ADAS, Feature.EHORIZON));
    }

    private static native LayerConfiguration fromFeatures(@NonNull List<Feature> list);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LayerConfiguration)) {
            return false;
        }
        LayerConfiguration layerConfiguration = (LayerConfiguration) obj;
        return Objects.equals(this.enabledFeatures, layerConfiguration.enabledFeatures) && Objects.equals(this.implicitlyPrefetchedFeatures, layerConfiguration.implicitlyPrefetchedFeatures) && Objects.equals(this.onDemandImplicitlyPrefetchedFeatures, layerConfiguration.onDemandImplicitlyPrefetchedFeatures);
    }

    public int hashCode() {
        List<Feature> list = this.enabledFeatures;
        int hashCode = (JfifUtil.MARKER_EOI + (list != null ? list.hashCode() : 0)) * 31;
        List<Feature> list2 = this.implicitlyPrefetchedFeatures;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<Feature> list3 = this.onDemandImplicitlyPrefetchedFeatures;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public LayerConfiguration(@NonNull List<Feature> list) {
        LayerConfiguration fromFeatures = fromFeatures(list);
        this.enabledFeatures = fromFeatures.enabledFeatures;
        this.implicitlyPrefetchedFeatures = fromFeatures.implicitlyPrefetchedFeatures;
        this.onDemandImplicitlyPrefetchedFeatures = fromFeatures.onDemandImplicitlyPrefetchedFeatures;
    }

    public LayerConfiguration(@NonNull List<Feature> list, @NonNull List<Feature> list2) {
        this.enabledFeatures = list;
        this.implicitlyPrefetchedFeatures = list2;
        this.onDemandImplicitlyPrefetchedFeatures = new ArrayList(Arrays.asList(Feature.DETAIL_RENDERING, Feature.NAVIGATION, Feature.OFFLINE_SEARCH, Feature.OFFLINE_ROUTING, Feature.RENDERING, Feature.TRUCK, Feature.LANDMARKS_3D, Feature.TRAFFIC, Feature.RDS_TRAFFIC, Feature.EV, Feature.TRUCK_SERVICE_ATTRIBUTES, Feature.FUEL_STATION_ATTRIBUTES, Feature.OFFLINE_BUS_ROUTING, Feature.JUNCTION_VIEW_3X4, Feature.JUNCTION_VIEW_16X9, Feature.JUNCTION_SIGN_3X4, Feature.JUNCTION_SIGN_3X5, Feature.JUNCTION_SIGN_4X3, Feature.JUNCTION_SIGN_5X3, Feature.JUNCTION_SIGN_16X9, Feature.TERRAIN, Feature.ADAS, Feature.EHORIZON));
    }

    public LayerConfiguration(@NonNull List<Feature> list, @NonNull List<Feature> list2, @NonNull List<Feature> list3) {
        this.enabledFeatures = list;
        this.implicitlyPrefetchedFeatures = list2;
        this.onDemandImplicitlyPrefetchedFeatures = list3;
    }
}
