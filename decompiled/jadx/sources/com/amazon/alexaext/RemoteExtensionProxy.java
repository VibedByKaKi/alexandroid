package com.amazon.alexaext;

import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.dee.app.metrics.MetricsConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RemoteExtensionProxy extends ExtensionProxy {
    private static final String METHOD_COMMAND_FAILURE = "CommandFailure";
    private static final String METHOD_COMMAND_SUCCESS = "CommandSuccess";
    private static final String METHOD_EVENT = "Event";
    private static final String METHOD_LIVE_DATA_UPDATE = "LiveDataUpdate";
    private static final String METHOD_REGISTER_FAILURE = "RegisterFailure";
    private static final String METHOD_REGISTER_SUCCESS = "RegisterSuccess";
    private static final String TAG = "RemoteExtensionProxy";
    Long mExtensionRegistrationStartTime;

    @NonNull
    private final BaseRemoteProxyDelegate mProxyDelegate;
    private final String mUri;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface IExtensionDisconnectCallback {
        void onFailure(String str);
    }

    public RemoteExtensionProxy(@NonNull String str, @NonNull BaseRemoteProxyDelegate baseRemoteProxyDelegate) {
        super(str);
        this.mUri = str;
        this.mProxyDelegate = baseRemoteProxyDelegate;
        baseRemoteProxyDelegate.setOnInternalMessageAction(new RemoteExtensionProxy$$ExternalSyntheticLambda0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public /* synthetic */ boolean lambda$new$0(ActivityDescriptor activityDescriptor, String str, boolean z) {
        try {
            String optString = new JSONObject(str).optString(MetricsConstants.NativeFetch.METHOD, "");
            if (!optString.equals(METHOD_REGISTER_SUCCESS) && !optString.equals(METHOD_REGISTER_FAILURE) && !z) {
                return false;
            }
            switch (optString.hashCode()) {
                case -238268609:
                    if (!optString.equals(METHOD_LIVE_DATA_UPDATE)) {
                        return true;
                    }
                    invokeLiveDataUpdate(activityDescriptor, str);
                    return true;
                case 16648792:
                    if (!optString.equals(METHOD_COMMAND_SUCCESS)) {
                        return true;
                    }
                    commandResult(activityDescriptor, str);
                    return true;
                case 67338874:
                    if (!optString.equals("Event")) {
                        return true;
                    }
                    invokeExtensionEventHandler(activityDescriptor, str);
                    return true;
                case 797244383:
                    if (!optString.equals(METHOD_COMMAND_FAILURE)) {
                        return true;
                    }
                    commandResult(activityDescriptor, str);
                    return true;
                case 1284780992:
                    if (!optString.equals(METHOD_REGISTER_SUCCESS)) {
                        return true;
                    }
                    registrationResult(activityDescriptor, str);
                    return true;
                case 2065376583:
                    if (!optString.equals(METHOD_REGISTER_FAILURE)) {
                        return true;
                    }
                    registrationResult(activityDescriptor, str);
                    return true;
                default:
                    return true;
            }
        } catch (JSONException unused) {
            Log.w(TAG, "Message processing failure.");
            return true;
        }
    }

    public void disconnectV1() {
        this.mProxyDelegate.disconnectV1(getUri(), "Clean up V1 connections using disconnect.");
    }

    public void finalize() throws Throwable {
        try {
            if (getNativeHandle() != 0) {
                String uri = getUri();
                BaseRemoteProxyDelegate baseRemoteProxyDelegate = this.mProxyDelegate;
                if (baseRemoteProxyDelegate != null && uri != null) {
                    baseRemoteProxyDelegate.disconnect(uri, "Clean up.");
                }
            } else {
                Log.e(TAG, "Native handle is invalid during finalization.");
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // com.amazon.alexaext.ExtensionProxy
    public boolean initialize(@NonNull String str) {
        return this.mProxyDelegate.onProxyInitialize(str);
    }

    @Override // com.amazon.alexaext.ExtensionProxy
    public boolean invokeCommand(@NonNull ActivityDescriptor activityDescriptor, String str) {
        return this.mProxyDelegate.sendMessage(activityDescriptor, str);
    }

    @Override // com.amazon.alexaext.ExtensionProxy
    public void onBackground(ActivityDescriptor activityDescriptor) {
        this.mProxyDelegate.onBackgroundInternal(activityDescriptor);
    }

    @Override // com.amazon.alexaext.ExtensionProxy
    public void onForeground(ActivityDescriptor activityDescriptor) {
        this.mProxyDelegate.onForegroundInternal(activityDescriptor);
    }

    @Override // com.amazon.alexaext.ExtensionProxy
    public void onHidden(ActivityDescriptor activityDescriptor) {
        this.mProxyDelegate.onHiddenInternal(activityDescriptor);
    }

    @Override // com.amazon.alexaext.ExtensionProxy
    public void onRegistered(@NonNull ActivityDescriptor activityDescriptor) {
        if (this.mExtensionRegistrationStartTime != null) {
            Log.i(TAG, String.format("Extension '%s' took %d milliseconds to register.", this.mUri, Long.valueOf((SystemClock.elapsedRealtimeNanos() - this.mExtensionRegistrationStartTime.longValue()) / 1000000)));
        }
        this.mProxyDelegate.onRegisteredInternal(activityDescriptor);
    }

    @Override // com.amazon.alexaext.ExtensionProxy
    public void onResourceReady(@NonNull ActivityDescriptor activityDescriptor, ResourceHolder resourceHolder) {
        this.mProxyDelegate.onResourceReadyInternal(activityDescriptor, resourceHolder);
    }

    @Override // com.amazon.alexaext.ExtensionProxy
    public void onSessionEnded(SessionDescriptor sessionDescriptor) {
        this.mProxyDelegate.onSessionEndedInternal(sessionDescriptor);
    }

    @Override // com.amazon.alexaext.ExtensionProxy
    public void onSessionStarted(SessionDescriptor sessionDescriptor) {
        this.mProxyDelegate.onSessionStartedInternal(sessionDescriptor);
    }

    @Override // com.amazon.alexaext.ExtensionProxy
    public void onUnregistered(@NonNull ActivityDescriptor activityDescriptor) {
        this.mProxyDelegate.onUnregisteredInternal(activityDescriptor);
    }

    @Override // com.amazon.alexaext.ExtensionProxy
    public boolean requestRegistration(@NonNull ActivityDescriptor activityDescriptor, String str) {
        this.mExtensionRegistrationStartTime = Long.valueOf(SystemClock.elapsedRealtimeNanos());
        return this.mProxyDelegate.onRequestRegistration(activityDescriptor, str);
    }

    @Override // com.amazon.alexaext.ExtensionProxy
    public boolean sendMessage(@NonNull ActivityDescriptor activityDescriptor, String str) {
        return this.mProxyDelegate.sendMessage(activityDescriptor, str);
    }

    public void setExtensionDisconnectCallback(IExtensionDisconnectCallback iExtensionDisconnectCallback) {
        this.mProxyDelegate.setExtensionDisconnectCallback(iExtensionDisconnectCallback);
    }
}
