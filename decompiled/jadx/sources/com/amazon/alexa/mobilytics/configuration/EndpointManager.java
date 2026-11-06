package com.amazon.alexa.mobilytics.configuration;

import com.amazonaws.regions.Regions;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface EndpointManager {
    List<Endpoint> dcmEndpoints();

    List<Map<Regions, Endpoint>> endpoints();

    void initialize();
}
