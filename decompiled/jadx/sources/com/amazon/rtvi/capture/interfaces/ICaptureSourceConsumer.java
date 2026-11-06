package com.amazon.rtvi.capture.interfaces;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.rtvi.capture.interfaces.ICaptureSourceProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public interface ICaptureSourceConsumer extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.rtvi.capture.interfaces.ICaptureSourceConsumer";

    void registerProvider(ICaptureSourceProvider iCaptureSourceProvider) throws RemoteException;

    void unregisterProvider(ICaptureSourceProvider iCaptureSourceProvider) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements ICaptureSourceConsumer {
        static final int TRANSACTION_registerProvider = 1;
        static final int TRANSACTION_unregisterProvider = 2;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements ICaptureSourceConsumer {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return "com.amazon.rtvi.capture.interfaces.ICaptureSourceConsumer";
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceConsumer
            public void registerProvider(ICaptureSourceProvider iCaptureSourceProvider) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.amazon.rtvi.capture.interfaces.ICaptureSourceConsumer");
                    obtain.writeStrongInterface(iCaptureSourceProvider);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceConsumer
            public void unregisterProvider(ICaptureSourceProvider iCaptureSourceProvider) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.amazon.rtvi.capture.interfaces.ICaptureSourceConsumer");
                    obtain.writeStrongInterface(iCaptureSourceProvider);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.amazon.rtvi.capture.interfaces.ICaptureSourceConsumer");
        }

        public static ICaptureSourceConsumer asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.amazon.rtvi.capture.interfaces.ICaptureSourceConsumer");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICaptureSourceConsumer)) ? new Proxy(iBinder) : (ICaptureSourceConsumer) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.amazon.rtvi.capture.interfaces.ICaptureSourceConsumer");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.amazon.rtvi.capture.interfaces.ICaptureSourceConsumer");
                return true;
            }
            if (i == 1) {
                registerProvider(ICaptureSourceProvider.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                unregisterProvider(ICaptureSourceProvider.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements ICaptureSourceConsumer {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceConsumer
        public void registerProvider(ICaptureSourceProvider iCaptureSourceProvider) throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceConsumer
        public void unregisterProvider(ICaptureSourceProvider iCaptureSourceProvider) throws RemoteException {
        }
    }
}
