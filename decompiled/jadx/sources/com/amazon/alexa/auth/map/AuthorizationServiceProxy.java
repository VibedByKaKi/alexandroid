package com.amazon.alexa.auth.map;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface AuthorizationServiceProxy extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.alexa.auth.map.AuthorizationServiceProxy";

    String getAccountPool() throws RemoteException;

    String getActorToken(String str) throws RemoteException;

    String getDeviceSerialNumber() throws RemoteException;

    String getDirectedID() throws RemoteException;

    String getMarketplace() throws RemoteException;

    String getToken() throws RemoteException;

    boolean isLoggedIn() throws RemoteException;

    void killService() throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements AuthorizationServiceProxy {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
        public String getAccountPool() throws RemoteException {
            return null;
        }

        @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
        public String getActorToken(String str) throws RemoteException {
            return null;
        }

        @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
        public String getDeviceSerialNumber() throws RemoteException {
            return null;
        }

        @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
        public String getDirectedID() throws RemoteException {
            return null;
        }

        @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
        public String getMarketplace() throws RemoteException {
            return null;
        }

        @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
        public String getToken() throws RemoteException {
            return null;
        }

        @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
        public boolean isLoggedIn() throws RemoteException {
            return false;
        }

        @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
        public void killService() throws RemoteException {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements AuthorizationServiceProxy {
        static final int TRANSACTION_getAccountPool = 6;
        static final int TRANSACTION_getActorToken = 8;
        static final int TRANSACTION_getDeviceSerialNumber = 5;
        static final int TRANSACTION_getDirectedID = 4;
        static final int TRANSACTION_getMarketplace = 3;
        static final int TRANSACTION_getToken = 2;
        static final int TRANSACTION_isLoggedIn = 1;
        static final int TRANSACTION_killService = 7;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements AuthorizationServiceProxy {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
            public String getAccountPool() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AuthorizationServiceProxy.DESCRIPTOR);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
            public String getActorToken(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AuthorizationServiceProxy.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
            public String getDeviceSerialNumber() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AuthorizationServiceProxy.DESCRIPTOR);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
            public String getDirectedID() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AuthorizationServiceProxy.DESCRIPTOR);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return AuthorizationServiceProxy.DESCRIPTOR;
            }

            @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
            public String getMarketplace() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AuthorizationServiceProxy.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
            public String getToken() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AuthorizationServiceProxy.DESCRIPTOR);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
            public boolean isLoggedIn() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AuthorizationServiceProxy.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
            public void killService() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AuthorizationServiceProxy.DESCRIPTOR);
                    this.mRemote.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, AuthorizationServiceProxy.DESCRIPTOR);
        }

        public static AuthorizationServiceProxy asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(AuthorizationServiceProxy.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AuthorizationServiceProxy)) ? new Proxy(iBinder) : (AuthorizationServiceProxy) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(AuthorizationServiceProxy.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(AuthorizationServiceProxy.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    boolean isLoggedIn = isLoggedIn();
                    parcel2.writeNoException();
                    parcel2.writeInt(isLoggedIn ? 1 : 0);
                    return true;
                case 2:
                    String token = getToken();
                    parcel2.writeNoException();
                    parcel2.writeString(token);
                    return true;
                case 3:
                    String marketplace = getMarketplace();
                    parcel2.writeNoException();
                    parcel2.writeString(marketplace);
                    return true;
                case 4:
                    String directedID = getDirectedID();
                    parcel2.writeNoException();
                    parcel2.writeString(directedID);
                    return true;
                case 5:
                    String deviceSerialNumber = getDeviceSerialNumber();
                    parcel2.writeNoException();
                    parcel2.writeString(deviceSerialNumber);
                    return true;
                case 6:
                    String accountPool = getAccountPool();
                    parcel2.writeNoException();
                    parcel2.writeString(accountPool);
                    return true;
                case 7:
                    killService();
                    return true;
                case 8:
                    String actorToken = getActorToken(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(actorToken);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
