package com.amazon.coral.util.contextualendpoint;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
interface DataSource {
    default String findString(String str) {
        throw new UnsupportedOperationException("findString not supported for this data source");
    }

    default String getRegion() {
        throw new UnsupportedOperationException("getRegion not supported for this data source");
    }

    default String getServiceName() {
        throw new UnsupportedOperationException("getServiceName not supported for this data source");
    }

    default Boolean isOneBox() {
        throw new UnsupportedOperationException("isOneBox not supported for this data source");
    }

    default Boolean isProduction() {
        throw new UnsupportedOperationException("isProduction not supported for this data source");
    }
}
