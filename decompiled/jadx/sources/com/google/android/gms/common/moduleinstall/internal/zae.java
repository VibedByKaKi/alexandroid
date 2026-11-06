package com.google.android.gms.common.moduleinstall.internal;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface zae extends IInterface {
    void zab(Status status) throws RemoteException;

    void zac(Status status, @Nullable ModuleInstallIntentResponse moduleInstallIntentResponse) throws RemoteException;

    void zad(Status status, @Nullable ModuleInstallResponse moduleInstallResponse) throws RemoteException;

    void zae(Status status, @Nullable ModuleAvailabilityResponse moduleAvailabilityResponse) throws RemoteException;
}
