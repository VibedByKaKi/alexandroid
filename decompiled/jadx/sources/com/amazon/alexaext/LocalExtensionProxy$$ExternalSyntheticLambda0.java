package com.amazon.alexaext;

import com.amazon.alexaext.IExtension;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class LocalExtensionProxy$$ExternalSyntheticLambda0 implements IExtension.IExtensionActivityEventCallback, IExtension.ILiveDataActivityUpdateCallback, IExtension.IExtensionActivityCommandResultCallback, IExtension.IExtensionEventCallback, ILiveDataUpdateCallback, IExtension.IExtensionCommandResultCallback {
    public final /* synthetic */ LocalExtensionProxy f$0;

    public /* synthetic */ LocalExtensionProxy$$ExternalSyntheticLambda0(LocalExtensionProxy localExtensionProxy) {
        this.f$0 = localExtensionProxy;
    }

    @Override // com.amazon.alexaext.IExtension.ILiveDataActivityUpdateCallback
    public boolean invokeLiveDataUpdate(ActivityDescriptor activityDescriptor, String str) {
        return this.f$0.invokeLiveDataUpdate(activityDescriptor, str);
    }

    @Override // com.amazon.alexaext.IExtension.IExtensionActivityCommandResultCallback
    public void sendCommandResult(ActivityDescriptor activityDescriptor, String str) {
        this.f$0.commandResult(activityDescriptor, str);
    }

    @Override // com.amazon.alexaext.IExtension.IExtensionActivityEventCallback
    public boolean sendExtensionEvent(ActivityDescriptor activityDescriptor, String str) {
        return this.f$0.invokeExtensionEventHandler(activityDescriptor, str);
    }

    @Override // com.amazon.alexaext.IExtension.IExtensionCommandResultCallback
    public void sendCommandResult(String str, String str2) {
        this.f$0.lambda$initialize$2(str, str2);
    }

    @Override // com.amazon.alexaext.ILiveDataUpdateCallback
    public boolean invokeLiveDataUpdate(String str, String str2) {
        boolean lambda$initialize$1;
        lambda$initialize$1 = this.f$0.lambda$initialize$1(str, str2);
        return lambda$initialize$1;
    }

    @Override // com.amazon.alexaext.IExtension.IExtensionEventCallback
    public boolean sendExtensionEvent(String str, String str2) {
        boolean lambda$initialize$0;
        lambda$initialize$0 = this.f$0.lambda$initialize$0(str, str2);
        return lambda$initialize$0;
    }
}
