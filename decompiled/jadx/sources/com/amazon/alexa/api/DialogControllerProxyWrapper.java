package com.amazon.alexa.api;

import android.os.IBinder;
import android.os.RemoteException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class DialogControllerProxyWrapper implements AlexaDialogControllerProxy, AlexaDialogControllerProxyV2 {
    private final AlexaDialogExtras dialogExtras;
    private final WrapperLifecycle lifecycle;
    private final AlexaDialogControllerProxy proxy;
    private final AlexaDialogControllerProxyV2 proxyV2;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface WrapperLifecycle {
        void onFinished();

        void onStarted();
    }

    public DialogControllerProxyWrapper(AlexaDialogExtras alexaDialogExtras, AlexaDialogControllerProxy alexaDialogControllerProxy, WrapperLifecycle wrapperLifecycle) {
        this.dialogExtras = alexaDialogExtras;
        this.proxy = alexaDialogControllerProxy;
        this.proxyV2 = null;
        this.lifecycle = wrapperLifecycle;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        AlexaDialogControllerProxy alexaDialogControllerProxy = this.proxy;
        if (alexaDialogControllerProxy != null) {
            return alexaDialogControllerProxy.asBinder();
        }
        AlexaDialogControllerProxyV2 alexaDialogControllerProxyV2 = this.proxyV2;
        if (alexaDialogControllerProxyV2 != null) {
            return alexaDialogControllerProxyV2.asBinder();
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Both proxy and proxyV2 are null");
        return null;
    }

    public AlexaDialogExtras getDialogExtras() {
        return this.dialogExtras;
    }

    @Override // com.amazon.alexa.api.AlexaDialogControllerProxy
    public String getDialogIdentifier() throws RemoteException {
        AlexaDialogControllerProxy alexaDialogControllerProxy = this.proxy;
        if (alexaDialogControllerProxy != null) {
            return alexaDialogControllerProxy.getDialogIdentifier();
        }
        AlexaDialogControllerProxyV2 alexaDialogControllerProxyV2 = this.proxyV2;
        if (alexaDialogControllerProxyV2 != null) {
            return alexaDialogControllerProxyV2.getDialogIdentifier();
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Both proxy and proxyV2 are null");
        return null;
    }

    @Override // com.amazon.alexa.api.AlexaDialogControllerProxy
    public String getDialogTurnIdentifier() throws RemoteException {
        AlexaDialogControllerProxy alexaDialogControllerProxy = this.proxy;
        if (alexaDialogControllerProxy != null) {
            return alexaDialogControllerProxy.getDialogTurnIdentifier();
        }
        AlexaDialogControllerProxyV2 alexaDialogControllerProxyV2 = this.proxyV2;
        if (alexaDialogControllerProxyV2 != null) {
            return alexaDialogControllerProxyV2.getDialogTurnIdentifier();
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Both proxy and proxyV2 are null");
        return null;
    }

    @Override // com.amazon.alexa.api.AlexaDialogControllerProxy
    public void onDialogFinished() throws RemoteException {
        AlexaDialogControllerProxy alexaDialogControllerProxy = this.proxy;
        if (alexaDialogControllerProxy != null) {
            alexaDialogControllerProxy.onDialogFinished();
        } else {
            AlexaDialogControllerProxyV2 alexaDialogControllerProxyV2 = this.proxyV2;
            if (alexaDialogControllerProxyV2 != null) {
                alexaDialogControllerProxyV2.onDialogFinished();
            }
        }
        this.lifecycle.onFinished();
    }

    @Override // com.amazon.alexa.api.AlexaDialogControllerProxy
    public void onDialogStarted() throws RemoteException {
        AlexaDialogControllerProxy alexaDialogControllerProxy = this.proxy;
        if (alexaDialogControllerProxy != null) {
            alexaDialogControllerProxy.onDialogStarted();
        } else {
            AlexaDialogControllerProxyV2 alexaDialogControllerProxyV2 = this.proxyV2;
            if (alexaDialogControllerProxyV2 != null) {
                alexaDialogControllerProxyV2.onDialogStarted();
            }
        }
        this.lifecycle.onStarted();
    }

    @Override // com.amazon.alexa.api.AlexaDialogControllerProxy
    public void onDialogTurnFinished() throws RemoteException {
        AlexaDialogControllerProxy alexaDialogControllerProxy = this.proxy;
        if (alexaDialogControllerProxy != null) {
            alexaDialogControllerProxy.onDialogTurnFinished();
            return;
        }
        AlexaDialogControllerProxyV2 alexaDialogControllerProxyV2 = this.proxyV2;
        if (alexaDialogControllerProxyV2 != null) {
            alexaDialogControllerProxyV2.onDialogTurnFinished();
        }
    }

    @Override // com.amazon.alexa.api.AlexaDialogControllerProxyV2
    public void onDialogTurnStarted(String str) throws RemoteException {
        AlexaDialogControllerProxyV2 alexaDialogControllerProxyV2 = this.proxyV2;
        if (alexaDialogControllerProxyV2 != null) {
            alexaDialogControllerProxyV2.onDialogTurnStarted(str);
        }
    }

    @Override // com.amazon.alexa.api.AlexaDialogControllerProxy
    public void startRecordingNextDialogTurn(String str) throws RemoteException {
        AlexaDialogControllerProxy alexaDialogControllerProxy = this.proxy;
        if (alexaDialogControllerProxy != null) {
            alexaDialogControllerProxy.startRecordingNextDialogTurn(str);
            return;
        }
        AlexaDialogControllerProxyV2 alexaDialogControllerProxyV2 = this.proxyV2;
        if (alexaDialogControllerProxyV2 != null) {
            alexaDialogControllerProxyV2.startRecordingNextDialogTurn(str);
        }
    }

    @Override // com.amazon.alexa.api.AlexaDialogControllerProxy
    public void stopRecording() throws RemoteException {
        AlexaDialogControllerProxy alexaDialogControllerProxy = this.proxy;
        if (alexaDialogControllerProxy != null) {
            alexaDialogControllerProxy.stopRecording();
            return;
        }
        AlexaDialogControllerProxyV2 alexaDialogControllerProxyV2 = this.proxyV2;
        if (alexaDialogControllerProxyV2 != null) {
            alexaDialogControllerProxyV2.stopRecording();
        }
    }

    @Override // com.amazon.alexa.api.AlexaDialogControllerProxy
    public void onDialogTurnStarted() throws RemoteException {
        AlexaDialogControllerProxy alexaDialogControllerProxy = this.proxy;
        if (alexaDialogControllerProxy != null) {
            alexaDialogControllerProxy.onDialogTurnStarted();
        }
    }

    public DialogControllerProxyWrapper(AlexaDialogExtras alexaDialogExtras, AlexaDialogControllerProxyV2 alexaDialogControllerProxyV2, WrapperLifecycle wrapperLifecycle) {
        this.dialogExtras = alexaDialogExtras;
        this.proxy = null;
        this.proxyV2 = alexaDialogControllerProxyV2;
        this.lifecycle = wrapperLifecycle;
    }
}
