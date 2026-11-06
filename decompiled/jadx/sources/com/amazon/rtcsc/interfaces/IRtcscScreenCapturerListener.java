package com.amazon.rtcsc.interfaces;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IRtcscScreenCapturerListener extends IInterface {
    public static final int API_VERSION = 2;
    public static final String DESCRIPTOR = "com.amazon.rtcsc.interfaces.IRtcscScreenCapturerListener";

    int getAPIVersion() throws RemoteException;

    void onPutScreenCapturerData() throws RemoteException;

    void onScreenCapturerStop() throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements IRtcscScreenCapturerListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscScreenCapturerListener
        public int getAPIVersion() throws RemoteException {
            return 0;
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscScreenCapturerListener
        public void onPutScreenCapturerData() throws RemoteException {
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscScreenCapturerListener
        public void onScreenCapturerStop() throws RemoteException {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IRtcscScreenCapturerListener {
        static final int TRANSACTION_getAPIVersion = 3;
        static final int TRANSACTION_onPutScreenCapturerData = 1;
        static final int TRANSACTION_onScreenCapturerStop = 2;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IRtcscScreenCapturerListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscScreenCapturerListener
            public int getAPIVersion() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscScreenCapturerListener.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IRtcscScreenCapturerListener.DESCRIPTOR;
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscScreenCapturerListener
            public void onPutScreenCapturerData() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscScreenCapturerListener.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscScreenCapturerListener
            public void onScreenCapturerStop() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscScreenCapturerListener.DESCRIPTOR);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IRtcscScreenCapturerListener.DESCRIPTOR);
        }

        public static IRtcscScreenCapturerListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IRtcscScreenCapturerListener.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IRtcscScreenCapturerListener)) ? new Proxy(iBinder) : (IRtcscScreenCapturerListener) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IRtcscScreenCapturerListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IRtcscScreenCapturerListener.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onPutScreenCapturerData();
            } else if (i == 2) {
                onScreenCapturerStop();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                int aPIVersion = getAPIVersion();
                parcel2.writeNoException();
                parcel2.writeInt(aPIVersion);
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
