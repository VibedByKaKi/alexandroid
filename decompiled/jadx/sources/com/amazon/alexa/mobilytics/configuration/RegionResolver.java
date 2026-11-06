package com.amazon.alexa.mobilytics.configuration;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.MobilyticsConfiguration;
import com.amazon.alexa.mobilytics.identity.MobilyticsEndpointPicker;
import com.amazon.alexa.mobilytics.identity.MobilyticsUser;
import com.amazon.alexa.mobilytics.marketplace.Marketplace;
import com.amazon.alexa.mobilytics.util.Log;
import com.amazonaws.regions.Regions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class RegionResolver {
    private static final String TAG = Log.tag((Class<?>) RegionResolver.class);
    private final EndpointManager endpointManager;

    @Inject
    public RegionResolver(@NonNull EndpointManager endpointManager) {
        this.endpointManager = endpointManager;
    }

    @Nullable
    private Map<Regions, Endpoint> firstEndpointMap() {
        List<Map<Regions, Endpoint>> endpoints = this.endpointManager.endpoints();
        if (endpoints == null || endpoints.isEmpty()) {
            return null;
        }
        return endpoints.get(0);
    }

    @NonNull
    private Regions resolveRegion(@Nullable MobilyticsConfiguration mobilyticsConfiguration) {
        Marketplace findMarketplaceById;
        MobilyticsUser user = (mobilyticsConfiguration == null || mobilyticsConfiguration.userProvider() == null) ? null : mobilyticsConfiguration.userProvider().user();
        Map<Regions, Endpoint> firstEndpointMap = firstEndpointMap();
        if (user == null || !user.hasFeature("ALEXA_MOBILYTICS_DATA_REGIONS_ANDROID")) {
            Region region = Region.DEFAULT;
            Region fromCountryCode = (user == null || (findMarketplaceById = Marketplace.findMarketplaceById(user.marketplaceId(), Marketplace.US)) == null) ? region : Region.fromCountryCode(findMarketplaceById.name());
            if (firstEndpointMap != null) {
                Endpoint endpoint = firstEndpointMap.get(fromCountryCode.awsRegion());
                if (endpoint == null) {
                    endpoint = firstEndpointMap.get(region.awsRegion());
                }
                if (endpoint instanceof KinesisEndpoint) {
                    return ((KinesisEndpoint) endpoint).awsRegion();
                }
            }
            return fromCountryCode.awsRegion();
        }
        MobilyticsEndpointPicker endpointPicker = mobilyticsConfiguration.endpointPicker();
        if (endpointPicker != null && firstEndpointMap != null && !firstEndpointMap.isEmpty()) {
            Endpoint endpoint2 = (Endpoint) endpointPicker.getEndpoint(toRegionNameMap(firstEndpointMap));
            if (endpoint2 instanceof KinesisEndpoint) {
                return ((KinesisEndpoint) endpoint2).awsRegion();
            }
        }
        if (firstEndpointMap != null) {
            Endpoint endpoint3 = firstEndpointMap.get(Region.DEFAULT.awsRegion());
            if (endpoint3 instanceof KinesisEndpoint) {
                return ((KinesisEndpoint) endpoint3).awsRegion();
            }
        }
        return Region.DEFAULT.awsRegion();
    }

    @NonNull
    private Map<String, Endpoint> toRegionNameMap(@NonNull Map<Regions, Endpoint> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Regions, Endpoint> entry : map.entrySet()) {
            hashMap.put(entry.getKey().getName(), entry.getValue());
        }
        return hashMap;
    }

    @NonNull
    public String resolveAwsRegionName(@Nullable MobilyticsConfiguration mobilyticsConfiguration) {
        return resolveRegion(mobilyticsConfiguration).getName();
    }
}
