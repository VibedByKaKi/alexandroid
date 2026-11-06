package com.amazon.alexa.mobilytics.integration.ama.resourcestat.memory;

import android.os.Debug;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class MemoryStatManager {
    public long getTotalAppMemory() {
        Debug.getMemoryInfo(new Debug.MemoryInfo());
        return r4.getTotalPss() / 1024;
    }
}
