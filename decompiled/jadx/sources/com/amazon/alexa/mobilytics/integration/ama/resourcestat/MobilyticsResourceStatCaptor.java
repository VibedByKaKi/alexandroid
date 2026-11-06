package com.amazon.alexa.mobilytics.integration.ama.resourcestat;

import com.amazon.alexa.mobilytics.identity.resourcestat.MobilyticsResourceCaptorOutput;
import com.amazon.alexa.mobilytics.identity.resourcestat.MobilyticsResourceStat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface MobilyticsResourceStatCaptor<T extends MobilyticsResourceStat, R extends MobilyticsResourceCaptorOutput> {
    T start();

    R stop(T t);
}
