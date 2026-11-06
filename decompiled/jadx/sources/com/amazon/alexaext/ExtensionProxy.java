package com.amazon.alexaext;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.common.BoundObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class ExtensionProxy extends BoundObject {
    public ExtensionProxy(String str) {
        bind(nCreate(str));
    }

    private static native void nCommandResult(long j, String str, String str2, String str3, String str4);

    private native long nCreate(String str);

    private static native String nGetUri(long j);

    private static native boolean nInvokeExtensionEventHandler(long j, String str, String str2, String str3, String str4);

    private static native boolean nInvokeLiveDataUpdate(long j, String str, String str2, String str3, String str4);

    private static native void nRegistrationResult(long j, String str, String str2, String str3, String str4);

    @NonNull
    private void onRegisteredNative(ActivityDescriptor activityDescriptor) {
        onRegistered(activityDescriptor);
    }

    @NonNull
    private void onUnregisteredNative(ActivityDescriptor activityDescriptor) {
        onUnregistered(activityDescriptor);
    }

    @NonNull
    private boolean sendMessageNative(ActivityDescriptor activityDescriptor, String str) {
        return sendMessage(activityDescriptor, str);
    }

    public void commandResult(ActivityDescriptor activityDescriptor, String str) {
        if (activityDescriptor == null) {
            return;
        }
        nCommandResult(getNativeHandle(), activityDescriptor.getURI(), activityDescriptor.getSession().getId(), activityDescriptor.getActivityId(), str);
    }

    public String getUri() {
        return nGetUri(getNativeHandle());
    }

    public abstract boolean initialize(String str);

    @NonNull
    @VisibleForTesting
    public boolean initializeNative(String str) {
        return initialize(str);
    }

    public abstract boolean invokeCommand(ActivityDescriptor activityDescriptor, String str);

    @NonNull
    @VisibleForTesting
    public boolean invokeCommandNative(ActivityDescriptor activityDescriptor, String str) {
        return invokeCommand(activityDescriptor, str);
    }

    public boolean invokeExtensionEventHandler(ActivityDescriptor activityDescriptor, String str) {
        if (activityDescriptor == null) {
            return false;
        }
        return nInvokeExtensionEventHandler(getNativeHandle(), activityDescriptor.getURI(), activityDescriptor.getSession().getId(), activityDescriptor.getActivityId(), str);
    }

    public boolean invokeLiveDataUpdate(ActivityDescriptor activityDescriptor, String str) {
        if (activityDescriptor == null) {
            return false;
        }
        return nInvokeLiveDataUpdate(getNativeHandle(), activityDescriptor.getURI(), activityDescriptor.getSession().getId(), activityDescriptor.getActivityId(), str);
    }

    @NonNull
    public void onBackgroundNative(ActivityDescriptor activityDescriptor) {
        onBackground(activityDescriptor);
    }

    @NonNull
    public void onForegroundNative(ActivityDescriptor activityDescriptor) {
        onForeground(activityDescriptor);
    }

    @NonNull
    public void onHiddenNative(ActivityDescriptor activityDescriptor) {
        onHidden(activityDescriptor);
    }

    public abstract void onRegistered(ActivityDescriptor activityDescriptor);

    @NonNull
    public void onResourceReadyNative(ActivityDescriptor activityDescriptor, ResourceHolder resourceHolder) {
        onResourceReady(activityDescriptor, resourceHolder);
    }

    @NonNull
    public void onSessionEndedNative(SessionDescriptor sessionDescriptor) {
        onSessionEnded(sessionDescriptor);
    }

    @NonNull
    public void onSessionStartedNative(SessionDescriptor sessionDescriptor) {
        onSessionStarted(sessionDescriptor);
    }

    public void registrationResult(ActivityDescriptor activityDescriptor, String str) {
        if (activityDescriptor == null) {
            return;
        }
        nRegistrationResult(getNativeHandle(), activityDescriptor.getURI(), activityDescriptor.getSession().getId(), activityDescriptor.getActivityId(), str);
    }

    public abstract boolean requestRegistration(ActivityDescriptor activityDescriptor, String str);

    @NonNull
    @VisibleForTesting
    public boolean requestRegistrationNative(ActivityDescriptor activityDescriptor, String str) {
        return requestRegistration(activityDescriptor, str);
    }

    public abstract boolean sendMessage(ActivityDescriptor activityDescriptor, String str);

    public void onBackground(ActivityDescriptor activityDescriptor) {
    }

    public void onForeground(ActivityDescriptor activityDescriptor) {
    }

    public void onHidden(ActivityDescriptor activityDescriptor) {
    }

    public void onSessionEnded(SessionDescriptor sessionDescriptor) {
    }

    public void onSessionStarted(SessionDescriptor sessionDescriptor) {
    }

    public void onUnregistered(ActivityDescriptor activityDescriptor) {
    }

    public void onResourceReady(ActivityDescriptor activityDescriptor, ResourceHolder resourceHolder) {
    }
}
