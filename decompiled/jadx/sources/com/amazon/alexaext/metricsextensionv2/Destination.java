package com.amazon.alexaext.metricsextensionv2;

import com.amazon.common.BoundObject;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class Destination extends BoundObject {
    public Destination() {
        init();
    }

    private native long nCreate();

    public void init() {
        bind(nCreate());
    }

    public abstract void publish(Metric metric);

    public abstract void publish(List<Metric> list);

    public void publishInternal(Metric metric) {
        publish(metric);
    }

    public void publishInternal(List<Metric> list) {
        publish(list);
    }
}
