package com.here.sdk.core.engine;

import androidx.annotation.NonNull;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class UsageStats {

    @NonNull
    public Feature feature;

    @NonNull
    public List<NetworkStats> networkStats;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Feature {
        DETAILED_RENDERING(0),
        EV_RENDERING(1),
        EV_SEARCH(2),
        NAVIGATION(3),
        PLACES(4),
        RDS_TRAFFIC(5),
        RENDERING(6),
        ROUTER(7),
        ROUTING(8),
        SATELLITES(9),
        SEARCH(10),
        SEARCH_ONLINE(11),
        TRANSIT(12),
        TRANSIT_ROUTING_ENGINE(13),
        TRAFFIC(14),
        TRAFFIC_VECTOR_TILES(15),
        TRUCK(16),
        VECTOR_TILES(17),
        OTHER(18),
        POSITIONING(19);

        public final int value;

        Feature(int i) {
            this.value = i;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class MethodNames {
        public static final String ANALYTICS = "analytics";
        public static final String AUTHENTICATION = "authentication";
        public static final String CALCULATE_ROUTE = "calculateRoute";
        public static final String CALCULATE_ROUTE_WITH_TRAFFIC = "calculateRouteWithTraffic";
        public static final String CALCULATE_TRANSIT_ROUTE = "calculateTransitRoute";
        public static final String DEFAULT_NETWORK_CALL = "networkCall";
        public static final String MAP_CONTENT = "mapContent";
        public static final String SEARCH_METHOD = "search";
        public static final String TRAFFIC_FETCH_INCIDENTS = "fetchIncidents";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NetworkStats {

        @NonNull
        public String methodCall;
        public long receivedBytes;
        public long requestCounter;
        public long sentBytes;

        public NetworkStats(long j, long j2, @NonNull String str, long j3) {
            this.sentBytes = j;
            this.receivedBytes = j2;
            this.methodCall = str;
            this.requestCounter = j3;
        }
    }

    public UsageStats(@NonNull List<NetworkStats> list, @NonNull Feature feature) {
        this.networkStats = list;
        this.feature = feature;
    }
}
