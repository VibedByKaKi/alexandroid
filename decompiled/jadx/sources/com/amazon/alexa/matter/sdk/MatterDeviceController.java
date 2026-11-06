package com.amazon.alexa.matter.sdk;

import androidx.annotation.NonNull;
import chip.devicecontroller.ChipDeviceController;
import chip.devicecontroller.ControllerParams;
import chip.devicecontroller.NetworkCredentials;
import java.io.Closeable;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class MatterDeviceController implements Closeable {

    @NonNull
    private final ChipDeviceController mDelegate;

    public MatterDeviceController(@NonNull ChipDeviceController chipDeviceController) {
        this.mDelegate = chipDeviceController;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mDelegate.close();
    }

    public void commissionDevice(long j, @Nullable NetworkCredentials networkCredentials) {
        this.mDelegate.commissionDevice(j, networkCredentials);
    }

    public void establishPaseConnection(long j, int i, long j2) {
        this.mDelegate.establishPaseConnection(j, i, j2);
    }

    public long onNOCChainGeneration(ControllerParams controllerParams) {
        return this.mDelegate.onNOCChainGeneration(controllerParams);
    }

    public void setCompletionListener(ChipDeviceController.CompletionListener completionListener) {
        this.mDelegate.setCompletionListener(completionListener);
    }

    public void setNOCChainIssuer(ChipDeviceController.NOCChainIssuer nOCChainIssuer) {
        this.mDelegate.setNOCChainIssuer(nOCChainIssuer);
    }

    public void setScanNetworksListener(ChipDeviceController.ScanNetworksListener scanNetworksListener) {
        this.mDelegate.setScanNetworksListener(scanNetworksListener);
    }

    public void updateCommissioningNetworkCredentials(NetworkCredentials networkCredentials) {
        this.mDelegate.updateCommissioningNetworkCredentials(networkCredentials);
    }
}
