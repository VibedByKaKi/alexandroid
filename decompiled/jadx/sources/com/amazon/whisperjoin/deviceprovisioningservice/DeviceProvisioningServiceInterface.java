package com.amazon.whisperjoin.deviceprovisioningservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.amazon.whisperjoin.deviceprovisioningservice.ProvisioningWorkflowEventCallback;
import com.amazon.whisperjoin.deviceprovisioningservice.service.ProvisioningServiceConfiguration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface DeviceProvisioningServiceInterface extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.whisperjoin.deviceprovisioningservice.DeviceProvisioningServiceInterface";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements DeviceProvisioningServiceInterface {
        @Override // com.amazon.whisperjoin.deviceprovisioningservice.DeviceProvisioningServiceInterface
        public boolean addCallback(ProvisioningWorkflowEventCallback provisioningWorkflowEventCallback) throws RemoteException {
            return false;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.whisperjoin.deviceprovisioningservice.DeviceProvisioningServiceInterface
        public boolean isActive() throws RemoteException {
            return false;
        }

        @Override // com.amazon.whisperjoin.deviceprovisioningservice.DeviceProvisioningServiceInterface
        public boolean removeCallback(ProvisioningWorkflowEventCallback provisioningWorkflowEventCallback) throws RemoteException {
            return false;
        }

        @Override // com.amazon.whisperjoin.deviceprovisioningservice.DeviceProvisioningServiceInterface
        public boolean shutdown() throws RemoteException {
            return false;
        }

        @Override // com.amazon.whisperjoin.deviceprovisioningservice.DeviceProvisioningServiceInterface
        public boolean start(ProvisioningServiceConfiguration provisioningServiceConfiguration) throws RemoteException {
            return false;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    boolean addCallback(ProvisioningWorkflowEventCallback provisioningWorkflowEventCallback) throws RemoteException;

    boolean isActive() throws RemoteException;

    boolean removeCallback(ProvisioningWorkflowEventCallback provisioningWorkflowEventCallback) throws RemoteException;

    boolean shutdown() throws RemoteException;

    boolean start(ProvisioningServiceConfiguration provisioningServiceConfiguration) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements DeviceProvisioningServiceInterface {
        static final int TRANSACTION_addCallback = 3;
        static final int TRANSACTION_isActive = 1;
        static final int TRANSACTION_removeCallback = 4;
        static final int TRANSACTION_shutdown = 5;
        static final int TRANSACTION_start = 2;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements DeviceProvisioningServiceInterface {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.amazon.whisperjoin.deviceprovisioningservice.DeviceProvisioningServiceInterface
            public boolean addCallback(ProvisioningWorkflowEventCallback provisioningWorkflowEventCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DeviceProvisioningServiceInterface.DESCRIPTOR);
                    obtain.writeStrongInterface(provisioningWorkflowEventCallback);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return DeviceProvisioningServiceInterface.DESCRIPTOR;
            }

            @Override // com.amazon.whisperjoin.deviceprovisioningservice.DeviceProvisioningServiceInterface
            public boolean isActive() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DeviceProvisioningServiceInterface.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.whisperjoin.deviceprovisioningservice.DeviceProvisioningServiceInterface
            public boolean removeCallback(ProvisioningWorkflowEventCallback provisioningWorkflowEventCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DeviceProvisioningServiceInterface.DESCRIPTOR);
                    obtain.writeStrongInterface(provisioningWorkflowEventCallback);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.whisperjoin.deviceprovisioningservice.DeviceProvisioningServiceInterface
            public boolean shutdown() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DeviceProvisioningServiceInterface.DESCRIPTOR);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.whisperjoin.deviceprovisioningservice.DeviceProvisioningServiceInterface
            public boolean start(ProvisioningServiceConfiguration provisioningServiceConfiguration) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DeviceProvisioningServiceInterface.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, provisioningServiceConfiguration, 0);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DeviceProvisioningServiceInterface.DESCRIPTOR);
        }

        public static DeviceProvisioningServiceInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DeviceProvisioningServiceInterface.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof DeviceProvisioningServiceInterface)) ? new Proxy(iBinder) : (DeviceProvisioningServiceInterface) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(DeviceProvisioningServiceInterface.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(DeviceProvisioningServiceInterface.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                boolean isActive = isActive();
                parcel2.writeNoException();
                parcel2.writeInt(isActive ? 1 : 0);
                return true;
            }
            if (i == 2) {
                boolean start = start((ProvisioningServiceConfiguration) _Parcel.readTypedObject(parcel, ProvisioningServiceConfiguration.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(start ? 1 : 0);
                return true;
            }
            if (i == 3) {
                boolean addCallback = addCallback(ProvisioningWorkflowEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(addCallback ? 1 : 0);
                return true;
            }
            if (i == 4) {
                boolean removeCallback = removeCallback(ProvisioningWorkflowEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(removeCallback ? 1 : 0);
                return true;
            }
            if (i != 5) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            boolean shutdown = shutdown();
            parcel2.writeNoException();
            parcel2.writeInt(shutdown ? 1 : 0);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
