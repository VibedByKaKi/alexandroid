package com.amazonaws;

import com.amazonaws.internal.config.HttpClientConfig;
import com.amazonaws.internal.config.InternalConfig;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
enum ServiceNameFactory {
    ;

    public static String getServiceName(String str) {
        HttpClientConfig httpClientConfig = InternalConfig.Factory.getInternalConfig().getHttpClientConfig(str);
        if (httpClientConfig == null) {
            return null;
        }
        return httpClientConfig.getServiceName();
    }
}
