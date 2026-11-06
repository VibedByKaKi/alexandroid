package amazon.speech.simclient.context;

import amazon.speech.simclient.context.IDeviceContextQueryCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public abstract class DeviceContextQueryCallback extends IDeviceContextQueryCallback.Stub {
    @Override // amazon.speech.simclient.context.IDeviceContextQueryCallback
    public abstract void onQueryFinished(String str);
}
