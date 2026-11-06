package com.amazon.whisperjoin.deviceprovisioningservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface ProvisioningWorkflowEventCallback extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.whisperjoin.deviceprovisioningservice.ProvisioningWorkflowEventCallback";

    void onComplete() throws RemoteException;

    void onError(String str, String str2, String str3) throws RemoteException;

    void onNext(String str, String str2) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements ProvisioningWorkflowEventCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.whisperjoin.deviceprovisioningservice.ProvisioningWorkflowEventCallback
        public void onComplete() throws RemoteException {
        }

        @Override // com.amazon.whisperjoin.deviceprovisioningservice.ProvisioningWorkflowEventCallback
        public void onNext(String str, String str2) throws RemoteException {
        }

        @Override // com.amazon.whisperjoin.deviceprovisioningservice.ProvisioningWorkflowEventCallback
        public void onError(String str, String str2, String str3) throws RemoteException {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements ProvisioningWorkflowEventCallback {
        static final int TRANSACTION_onComplete = 1;
        static final int TRANSACTION_onError = 3;
        static final int TRANSACTION_onNext = 2;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements ProvisioningWorkflowEventCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ProvisioningWorkflowEventCallback.DESCRIPTOR;
            }

            @Override // com.amazon.whisperjoin.deviceprovisioningservice.ProvisioningWorkflowEventCallback
            public void onComplete() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProvisioningWorkflowEventCallback.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.whisperjoin.deviceprovisioningservice.ProvisioningWorkflowEventCallback
            public void onError(String str, String str2, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProvisioningWorkflowEventCallback.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.whisperjoin.deviceprovisioningservice.ProvisioningWorkflowEventCallback
            public void onNext(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProvisioningWorkflowEventCallback.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ProvisioningWorkflowEventCallback.DESCRIPTOR);
        }

        public static ProvisioningWorkflowEventCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ProvisioningWorkflowEventCallback.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ProvisioningWorkflowEventCallback)) ? new Proxy(iBinder) : (ProvisioningWorkflowEventCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ProvisioningWorkflowEventCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ProvisioningWorkflowEventCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onComplete();
                parcel2.writeNoException();
            } else if (i == 2) {
                onNext(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onError(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
