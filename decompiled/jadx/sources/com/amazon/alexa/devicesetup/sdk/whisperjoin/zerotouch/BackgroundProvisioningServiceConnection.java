package com.amazon.alexa.devicesetup.sdk.whisperjoin.zerotouch;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.amazon.alexa.eventing.Event$$ExternalSyntheticLambda2;
import com.amazon.whisperjoin.deviceprovisioningservice.DeviceProvisioningServiceInterface;
import com.amazon.whisperjoin.deviceprovisioningservice.service.ProvisioningServiceConfiguration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class BackgroundProvisioningServiceConnection implements ServiceConnection {
    private ComponentName componentName;
    private DeviceProvisioningServiceInterface provisioningService;
    private ProvisioningServiceConfiguration serviceConfiguration;
    private Future<?> startProvisioningServiceFuture;
    private ProvisioningEventCallback provisioningEventCallback = new ProvisioningEventCallback();
    private volatile boolean isServiceActive = false;
    private volatile boolean isProvisioningStartRequested = false;

    public BackgroundProvisioningServiceConnection(ProvisioningServiceConfiguration provisioningServiceConfiguration) {
        this.serviceConfiguration = provisioningServiceConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onServiceConnected$0(ExecutorService executorService) {
        try {
            this.isServiceActive = this.provisioningService.isActive();
            this.provisioningService.addCallback(this.provisioningEventCallback);
            if (this.isProvisioningStartRequested) {
                startService();
                this.isProvisioningStartRequested = false;
            }
        } catch (RemoteException unused) {
        } finally {
            executorService.shutdown();
        }
    }

    public ComponentName getComponentName() {
        return this.componentName;
    }

    public DeviceProvisioningServiceInterface getProvisioningService() {
        return this.provisioningService;
    }

    public boolean isServiceActive() {
        return this.isServiceActive;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.provisioningService = DeviceProvisioningServiceInterface.Stub.asInterface(iBinder);
        this.componentName = componentName;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.startProvisioningServiceFuture = newSingleThreadExecutor.submit(new Event$$ExternalSyntheticLambda2(this, newSingleThreadExecutor, 8));
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.isServiceActive = false;
        this.provisioningService = null;
    }

    public void startService() {
        try {
            DeviceProvisioningServiceInterface deviceProvisioningServiceInterface = this.provisioningService;
            if (deviceProvisioningServiceInterface == null) {
                this.isProvisioningStartRequested = true;
            } else {
                if (deviceProvisioningServiceInterface.isActive()) {
                    return;
                }
                try {
                    this.provisioningService.start(this.serviceConfiguration);
                    this.isServiceActive = true;
                } catch (IllegalStateException unused) {
                }
                this.isProvisioningStartRequested = false;
            }
        } catch (RemoteException unused2) {
        }
    }

    public void stopService() {
        try {
            DeviceProvisioningServiceInterface deviceProvisioningServiceInterface = this.provisioningService;
            if (deviceProvisioningServiceInterface != null && deviceProvisioningServiceInterface.isActive()) {
                this.provisioningService.shutdown();
            }
            this.isServiceActive = false;
            this.isProvisioningStartRequested = false;
        } catch (RemoteException unused) {
        }
    }
}
