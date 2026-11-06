package com.amazon.alexaext.metricsextensionv2;

import com.amazon.alexaext.ActivityDescriptor;
import com.amazon.alexaext.ExtensionExecutor;
import com.amazon.common.BoundObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class MetricsExtensionV2 extends BoundObject {
    private final DestinationFactory mDestinationFactory;
    private final ExtensionExecutor mExtensionExecutor;

    public MetricsExtensionV2(DestinationFactory destinationFactory, ExtensionExecutor extensionExecutor) {
        this.mDestinationFactory = destinationFactory;
        this.mExtensionExecutor = extensionExecutor;
        bind(nCreate(destinationFactory.getNativeHandle(), extensionExecutor.getNativeHandle()));
    }

    private static native long nCreate(long j, long j2);

    private static native String nCreateRegistration(long j, String str, String str2, String str3, String str4);

    private static native boolean nInvokeCommand(long j, String str, String str2, String str3, String str4);

    private static native void nOnUnregistered(long j, String str, String str2, String str3);

    public String createRegistrationInternal(ActivityDescriptor activityDescriptor, String str) {
        return nCreateRegistration(getNativeHandle(), activityDescriptor.getURI(), activityDescriptor.getSession().getId(), activityDescriptor.getActivityId(), str);
    }

    public boolean invokeCommandInternal(ActivityDescriptor activityDescriptor, String str) {
        return nInvokeCommand(getNativeHandle(), activityDescriptor.getURI(), activityDescriptor.getSession().getId(), activityDescriptor.getActivityId(), str);
    }

    public void onUnregisteredInternal(ActivityDescriptor activityDescriptor) {
        nOnUnregistered(getNativeHandle(), activityDescriptor.getURI(), activityDescriptor.getSession().getId(), activityDescriptor.getActivityId());
    }
}
