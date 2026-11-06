package com.amazon.alexaext;

import com.amazon.alexaext.IExtension;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class LocalExtensionV2 implements IExtension {
    private IExtension.IExtensionActivityCommandResultCallback mActivityCommandResultCallback;
    private IExtension.IExtensionActivityEventCallback mActivityEventCallback;
    private IExtension.ILiveDataActivityUpdateCallback mActivityLiveDataCallback;
    IExtension.IExtensionCommandResultCallback mCommandCallback;
    IExtension.IExtensionEventCallback mEventCallback;
    ILiveDataUpdateCallback mLiveDataCallback;
    private Set<String> mUris;

    public LocalExtensionV2(String str) {
        HashSet hashSet = new HashSet();
        this.mUris = hashSet;
        hashSet.add(str);
    }

    @Override // com.amazon.alexaext.IExtension
    public Set<String> getURIs() {
        return this.mUris;
    }

    public void invokeCommandResultHandler(ActivityDescriptor activityDescriptor, String str) {
        IExtension.IExtensionActivityCommandResultCallback iExtensionActivityCommandResultCallback = this.mActivityCommandResultCallback;
        if (iExtensionActivityCommandResultCallback != null) {
            iExtensionActivityCommandResultCallback.sendCommandResult(activityDescriptor, str);
        }
    }

    public boolean invokeExtensionEventHandler(ActivityDescriptor activityDescriptor, String str) {
        IExtension.IExtensionActivityEventCallback iExtensionActivityEventCallback = this.mActivityEventCallback;
        if (iExtensionActivityEventCallback != null) {
            return iExtensionActivityEventCallback.sendExtensionEvent(activityDescriptor, str);
        }
        return false;
    }

    public boolean invokeLiveDataUpdate(ActivityDescriptor activityDescriptor, String str) {
        IExtension.ILiveDataActivityUpdateCallback iLiveDataActivityUpdateCallback = this.mActivityLiveDataCallback;
        if (iLiveDataActivityUpdateCallback != null) {
            return iLiveDataActivityUpdateCallback.invokeLiveDataUpdate(activityDescriptor, str);
        }
        return false;
    }

    @Override // com.amazon.alexaext.IExtension
    public void registerCommandResultCallback(IExtension.IExtensionCommandResultCallback iExtensionCommandResultCallback) {
        this.mCommandCallback = iExtensionCommandResultCallback;
    }

    @Override // com.amazon.alexaext.IExtension
    public void registerEventCallback(IExtension.IExtensionEventCallback iExtensionEventCallback) {
        this.mEventCallback = iExtensionEventCallback;
    }

    @Override // com.amazon.alexaext.IExtension
    public void registerLiveDataUpdateCallback(ILiveDataUpdateCallback iLiveDataUpdateCallback) {
        this.mLiveDataCallback = iLiveDataUpdateCallback;
    }

    @Override // com.amazon.alexaext.IExtension
    public void registerCommandResultCallback(IExtension.IExtensionActivityCommandResultCallback iExtensionActivityCommandResultCallback) {
        this.mActivityCommandResultCallback = iExtensionActivityCommandResultCallback;
    }

    @Override // com.amazon.alexaext.IExtension
    public void registerEventCallback(IExtension.IExtensionActivityEventCallback iExtensionActivityEventCallback) {
        this.mActivityEventCallback = iExtensionActivityEventCallback;
    }

    @Override // com.amazon.alexaext.IExtension
    public void registerLiveDataUpdateCallback(IExtension.ILiveDataActivityUpdateCallback iLiveDataActivityUpdateCallback) {
        this.mActivityLiveDataCallback = iLiveDataActivityUpdateCallback;
    }

    public LocalExtensionV2(List<String> list) {
        HashSet hashSet = new HashSet();
        this.mUris = hashSet;
        hashSet.addAll(list);
    }
}
