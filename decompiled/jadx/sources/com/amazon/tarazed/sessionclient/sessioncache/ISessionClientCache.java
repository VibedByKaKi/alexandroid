package com.amazon.tarazed.sessionclient.sessioncache;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface ISessionClientCache extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.tarazed.sessionclient.sessioncache.ISessionClientCache";

    void clearLaunchRequest() throws RemoteException;

    String getLaunchRequest() throws RemoteException;

    String getSessionCredentials(String str) throws RemoteException;

    void putLaunchRequest(String str) throws RemoteException;

    void putSessionCredentials(String str, String str2) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements ISessionClientCache {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.tarazed.sessionclient.sessioncache.ISessionClientCache
        public String getLaunchRequest() throws RemoteException {
            return null;
        }

        @Override // com.amazon.tarazed.sessionclient.sessioncache.ISessionClientCache
        public String getSessionCredentials(String str) throws RemoteException {
            return null;
        }

        @Override // com.amazon.tarazed.sessionclient.sessioncache.ISessionClientCache
        public void clearLaunchRequest() throws RemoteException {
        }

        @Override // com.amazon.tarazed.sessionclient.sessioncache.ISessionClientCache
        public void putLaunchRequest(String str) throws RemoteException {
        }

        @Override // com.amazon.tarazed.sessionclient.sessioncache.ISessionClientCache
        public void putSessionCredentials(String str, String str2) throws RemoteException {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements ISessionClientCache {
        static final int TRANSACTION_clearLaunchRequest = 3;
        static final int TRANSACTION_getLaunchRequest = 4;
        static final int TRANSACTION_getSessionCredentials = 1;
        static final int TRANSACTION_putLaunchRequest = 5;
        static final int TRANSACTION_putSessionCredentials = 2;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements ISessionClientCache {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.amazon.tarazed.sessionclient.sessioncache.ISessionClientCache
            public void clearLaunchRequest() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISessionClientCache.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return ISessionClientCache.DESCRIPTOR;
            }

            @Override // com.amazon.tarazed.sessionclient.sessioncache.ISessionClientCache
            public String getLaunchRequest() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISessionClientCache.DESCRIPTOR);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.tarazed.sessionclient.sessioncache.ISessionClientCache
            public String getSessionCredentials(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISessionClientCache.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.tarazed.sessionclient.sessioncache.ISessionClientCache
            public void putLaunchRequest(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISessionClientCache.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.tarazed.sessionclient.sessioncache.ISessionClientCache
            public void putSessionCredentials(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISessionClientCache.DESCRIPTOR);
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
            attachInterface(this, ISessionClientCache.DESCRIPTOR);
        }

        public static ISessionClientCache asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ISessionClientCache.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ISessionClientCache)) ? new Proxy(iBinder) : (ISessionClientCache) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ISessionClientCache.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ISessionClientCache.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                String sessionCredentials = getSessionCredentials(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(sessionCredentials);
            } else if (i == 2) {
                putSessionCredentials(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 3) {
                clearLaunchRequest();
                parcel2.writeNoException();
            } else if (i == 4) {
                String launchRequest = getLaunchRequest();
                parcel2.writeNoException();
                parcel2.writeString(launchRequest);
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                putLaunchRequest(parcel.readString());
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
