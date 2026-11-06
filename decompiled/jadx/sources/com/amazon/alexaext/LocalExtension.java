package com.amazon.alexaext;

import com.amazon.alexaext.IExtension;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class LocalExtension implements IExtension {
    private static String COMMAND_FAILURE = "{    \"version\": \"1.0\",    \"method\": \"CommandFailure\",    \"id\": %d,    \"code\": %d,    \"message\": %s}";
    private static String COMMAND_SUCCESS = "{    \"version\": \"1.0\",    \"method\": \"CommandSuccess\",    \"id\": %d}";
    IExtension.IExtensionActivityCommandResultCallback mActivityCommandCallback;
    IExtension.IExtensionActivityEventCallback mActivityEventCallback;
    IExtension.ILiveDataActivityUpdateCallback mActivityLiveDataCallback;
    IExtension.IExtensionCommandResultCallback mCommandCallback;
    IExtension.IExtensionEventCallback mEventCallback;
    ILiveDataUpdateCallback mLiveDataCallback;
    private Set<String> mUris;

    public LocalExtension(String str) {
        HashSet hashSet = new HashSet();
        this.mUris = hashSet;
        hashSet.add(str);
    }

    public void commandFailure(ActivityDescriptor activityDescriptor, int i, int i2, String str) {
        IExtension.IExtensionActivityCommandResultCallback iExtensionActivityCommandResultCallback = this.mActivityCommandCallback;
        if (iExtensionActivityCommandResultCallback != null) {
            iExtensionActivityCommandResultCallback.sendCommandResult(activityDescriptor, String.format(COMMAND_FAILURE, Integer.valueOf(i), Integer.valueOf(i2), str));
        }
    }

    public void commandSuccess(ActivityDescriptor activityDescriptor, int i) {
        IExtension.IExtensionActivityCommandResultCallback iExtensionActivityCommandResultCallback = this.mActivityCommandCallback;
        if (iExtensionActivityCommandResultCallback != null) {
            iExtensionActivityCommandResultCallback.sendCommandResult(activityDescriptor, String.format(COMMAND_SUCCESS, Integer.valueOf(i)));
        }
    }

    @Override // com.amazon.alexaext.IExtension
    public Set<String> getURIs() {
        return this.mUris;
    }

    public boolean invokeExtensionEventHandler(ActivityDescriptor activityDescriptor, String str) {
        IExtension.IExtensionActivityEventCallback iExtensionActivityEventCallback = this.mActivityEventCallback;
        if (iExtensionActivityEventCallback == null) {
            return false;
        }
        iExtensionActivityEventCallback.sendExtensionEvent(activityDescriptor, str);
        return true;
    }

    public boolean invokeLiveDataUpdate(ActivityDescriptor activityDescriptor, String str) {
        IExtension.ILiveDataActivityUpdateCallback iLiveDataActivityUpdateCallback = this.mActivityLiveDataCallback;
        if (iLiveDataActivityUpdateCallback == null) {
            return false;
        }
        iLiveDataActivityUpdateCallback.invokeLiveDataUpdate(activityDescriptor, str);
        return true;
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
        this.mActivityCommandCallback = iExtensionActivityCommandResultCallback;
    }

    @Override // com.amazon.alexaext.IExtension
    public void registerEventCallback(IExtension.IExtensionActivityEventCallback iExtensionActivityEventCallback) {
        this.mActivityEventCallback = iExtensionActivityEventCallback;
    }

    @Override // com.amazon.alexaext.IExtension
    public void registerLiveDataUpdateCallback(IExtension.ILiveDataActivityUpdateCallback iLiveDataActivityUpdateCallback) {
        this.mActivityLiveDataCallback = iLiveDataActivityUpdateCallback;
    }

    @Deprecated
    public boolean invokeExtensionEventHandler(String str, String str2) {
        IExtension.IExtensionEventCallback iExtensionEventCallback = this.mEventCallback;
        if (iExtensionEventCallback == null) {
            return false;
        }
        iExtensionEventCallback.sendExtensionEvent(str, str2);
        return true;
    }

    @Deprecated
    public boolean invokeLiveDataUpdate(String str, String str2) {
        ILiveDataUpdateCallback iLiveDataUpdateCallback = this.mLiveDataCallback;
        if (iLiveDataUpdateCallback == null) {
            return false;
        }
        iLiveDataUpdateCallback.invokeLiveDataUpdate(str, str2);
        return true;
    }

    public LocalExtension(List<String> list) {
        HashSet hashSet = new HashSet();
        this.mUris = hashSet;
        hashSet.addAll(list);
    }

    @Deprecated
    public void commandSuccess(String str, int i) {
        IExtension.IExtensionCommandResultCallback iExtensionCommandResultCallback = this.mCommandCallback;
        if (iExtensionCommandResultCallback != null) {
            iExtensionCommandResultCallback.sendCommandResult(str, String.format(COMMAND_SUCCESS, Integer.valueOf(i)));
        }
    }

    @Deprecated
    public void commandFailure(String str, int i, int i2, String str2) {
        IExtension.IExtensionCommandResultCallback iExtensionCommandResultCallback = this.mCommandCallback;
        if (iExtensionCommandResultCallback != null) {
            iExtensionCommandResultCallback.sendCommandResult(str, String.format(COMMAND_FAILURE, Integer.valueOf(i), Integer.valueOf(i2), str2));
        }
    }
}
