package com.amazon.dcp.sso;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface IWebserviceCallback extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.dcp.sso.IWebserviceCallback";

    void onAuthenticationFailed() throws RemoteException;

    void onBadResponse() throws RemoteException;

    void onInvalidRequest() throws RemoteException;

    void onNetworkError() throws RemoteException;

    void onResponseReceived(long j, Map map, byte[] bArr) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IWebserviceCallback {
        static final int TRANSACTION_onAuthenticationFailed = 3;
        static final int TRANSACTION_onBadResponse = 4;
        static final int TRANSACTION_onInvalidRequest = 5;
        static final int TRANSACTION_onNetworkError = 2;
        static final int TRANSACTION_onResponseReceived = 1;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IWebserviceCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IWebserviceCallback.DESCRIPTOR;
            }

            @Override // com.amazon.dcp.sso.IWebserviceCallback
            public void onAuthenticationFailed() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IWebserviceCallback.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.dcp.sso.IWebserviceCallback
            public void onBadResponse() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IWebserviceCallback.DESCRIPTOR);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.dcp.sso.IWebserviceCallback
            public void onInvalidRequest() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IWebserviceCallback.DESCRIPTOR);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.dcp.sso.IWebserviceCallback
            public void onNetworkError() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IWebserviceCallback.DESCRIPTOR);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.dcp.sso.IWebserviceCallback
            public void onResponseReceived(long j, Map map, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IWebserviceCallback.DESCRIPTOR);
                    obtain.writeLong(j);
                    obtain.writeMap(map);
                    obtain.writeByteArray(bArr);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IWebserviceCallback.DESCRIPTOR);
        }

        public static IWebserviceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IWebserviceCallback.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IWebserviceCallback)) ? new Proxy(iBinder) : (IWebserviceCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IWebserviceCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IWebserviceCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onResponseReceived(parcel.readLong(), parcel.readHashMap(getClass().getClassLoader()), parcel.createByteArray());
                parcel2.writeNoException();
            } else if (i == 2) {
                onNetworkError();
                parcel2.writeNoException();
            } else if (i == 3) {
                onAuthenticationFailed();
                parcel2.writeNoException();
            } else if (i == 4) {
                onBadResponse();
                parcel2.writeNoException();
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onInvalidRequest();
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
