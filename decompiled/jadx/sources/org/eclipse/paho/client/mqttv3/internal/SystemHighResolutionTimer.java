package org.eclipse.paho.client.mqttv3.internal;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SystemHighResolutionTimer implements HighResolutionTimer {
    @Override // org.eclipse.paho.client.mqttv3.internal.HighResolutionTimer
    public long nanoTime() {
        return System.nanoTime();
    }
}
