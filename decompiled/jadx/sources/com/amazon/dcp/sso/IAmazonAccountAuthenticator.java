package com.amazon.dcp.sso;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.dcp.sso.IWebserviceCallback;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface IAmazonAccountAuthenticator extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.dcp.sso.IAmazonAccountAuthenticator";

    void callGetCredentialsWebservice(Uri uri, String str, Map map, byte[] bArr, IWebserviceCallback iWebserviceCallback) throws RemoteException;

    void invalidateAuthToken(String str) throws RemoteException;

    void invalidateAuthTokenByTokenType(String str) throws RemoteException;

    String peekAuthToken(String str) throws RemoteException;

    void storeToken(String str, String str2) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IAmazonAccountAuthenticator {
        static final int TRANSACTION_callGetCredentialsWebservice = 1;
        static final int TRANSACTION_invalidateAuthToken = 4;
        static final int TRANSACTION_invalidateAuthTokenByTokenType = 5;
        static final int TRANSACTION_peekAuthToken = 3;
        static final int TRANSACTION_storeToken = 2;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IAmazonAccountAuthenticator {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.amazon.dcp.sso.IAmazonAccountAuthenticator
            public void callGetCredentialsWebservice(Uri uri, String str, Map map, byte[] bArr, IWebserviceCallback iWebserviceCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAmazonAccountAuthenticator.DESCRIPTOR);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeMap(map);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongInterface(iWebserviceCallback);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public String getInterfaceDescriptor() {
                return IAmazonAccountAuthenticator.DESCRIPTOR;
            }

            @Override // com.amazon.dcp.sso.IAmazonAccountAuthenticator
            public void invalidateAuthToken(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAmazonAccountAuthenticator.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.dcp.sso.IAmazonAccountAuthenticator
            public void invalidateAuthTokenByTokenType(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAmazonAccountAuthenticator.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.dcp.sso.IAmazonAccountAuthenticator
            public String peekAuthToken(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAmazonAccountAuthenticator.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.dcp.sso.IAmazonAccountAuthenticator
            public void storeToken(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAmazonAccountAuthenticator.DESCRIPTOR);
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
            attachInterface(this, IAmazonAccountAuthenticator.DESCRIPTOR);
        }

        public static IAmazonAccountAuthenticator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IAmazonAccountAuthenticator.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IAmazonAccountAuthenticator)) ? new Proxy(iBinder) : (IAmazonAccountAuthenticator) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IAmazonAccountAuthenticator.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IAmazonAccountAuthenticator.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                callGetCredentialsWebservice((Uri) (parcel.readInt() != 0 ? Uri.CREATOR.createFromParcel(parcel) : null), parcel.readString(), parcel.readHashMap(getClass().getClassLoader()), parcel.createByteArray(), IWebserviceCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 2) {
                storeToken(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 3) {
                String peekAuthToken = peekAuthToken(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(peekAuthToken);
            } else if (i == 4) {
                invalidateAuthToken(parcel.readString());
                parcel2.writeNoException();
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                invalidateAuthTokenByTokenType(parcel.readString());
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
