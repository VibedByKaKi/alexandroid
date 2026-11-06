package com.amazonaws.regions;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.net.URI;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RegionMetadata {
    private final List<Region> regions;

    public RegionMetadata(List<Region> list) {
        if (list != null) {
            this.regions = ErrorUtils$$ExternalSyntheticOutline0.m(list);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("regions cannot be null");
            throw null;
        }
    }

    private static String getHost(String str) {
        String host = URI.create(str).getHost();
        if (host != null) {
            return host;
        }
        return URI.create("http://" + str).getHost();
    }

    public Region getRegion(String str) {
        for (Region region : this.regions) {
            if (region.getName().equals(str)) {
                return region;
            }
        }
        return null;
    }

    public Region getRegionByEndpoint(String str) {
        String host = getHost(str);
        for (Region region : this.regions) {
            Iterator<String> it2 = region.getServiceEndpoints().values().iterator();
            while (it2.hasNext()) {
                if (host.equals(getHost(it2.next()))) {
                    return region;
                }
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("No region found with any service for endpoint ", str));
        return null;
    }

    public List<Region> getRegions() {
        return this.regions;
    }

    public List<Region> getRegionsForService(String str) {
        LinkedList linkedList = new LinkedList();
        for (Region region : this.regions) {
            if (region.isServiceSupported(str)) {
                linkedList.add(region);
            }
        }
        return linkedList;
    }

    public String toString() {
        return this.regions.toString();
    }
}
