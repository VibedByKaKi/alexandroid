package com.amazon.dcp.sso;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.dcp.sso.IAmazonAccountAuthenticator;
import com.amazon.dcp.sso.ISubAuthenticatorResponse;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface ISubAuthenticator extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.dcp.sso.ISubAuthenticator";

    void getAccountRemovalAllowed(ISubAuthenticatorResponse iSubAuthenticatorResponse, String str, String str2) throws RemoteException;

    void getAuthToken(ISubAuthenticatorResponse iSubAuthenticatorResponse, String str, String str2, String str3, Bundle bundle, IAmazonAccountAuthenticator iAmazonAccountAuthenticator) throws RemoteException;

    void updateAuthToken(ISubAuthenticatorResponse iSubAuthenticatorResponse, String str, String str2, String str3, Bundle bundle, IAmazonAccountAuthenticator iAmazonAccountAuthenticator) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements ISubAuthenticator {
        static final int TRANSACTION_getAccountRemovalAllowed = 2;
        static final int TRANSACTION_getAuthToken = 1;
        static final int TRANSACTION_updateAuthToken = 3;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements ISubAuthenticator {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.amazon.dcp.sso.ISubAuthenticator
            public void getAccountRemovalAllowed(ISubAuthenticatorResponse iSubAuthenticatorResponse, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISubAuthenticator.DESCRIPTOR);
                    obtain.writeStrongInterface(iSubAuthenticatorResponse);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.dcp.sso.ISubAuthenticator
            public void getAuthToken(ISubAuthenticatorResponse iSubAuthenticatorResponse, String str, String str2, String str3, Bundle bundle, IAmazonAccountAuthenticator iAmazonAccountAuthenticator) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISubAuthenticator.DESCRIPTOR);
                    obtain.writeStrongInterface(iSubAuthenticatorResponse);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongInterface(iAmazonAccountAuthenticator);
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
                return ISubAuthenticator.DESCRIPTOR;
            }

            @Override // com.amazon.dcp.sso.ISubAuthenticator
            public void updateAuthToken(ISubAuthenticatorResponse iSubAuthenticatorResponse, String str, String str2, String str3, Bundle bundle, IAmazonAccountAuthenticator iAmazonAccountAuthenticator) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISubAuthenticator.DESCRIPTOR);
                    obtain.writeStrongInterface(iSubAuthenticatorResponse);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongInterface(iAmazonAccountAuthenticator);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, ISubAuthenticator.DESCRIPTOR);
        }

        public static ISubAuthenticator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ISubAuthenticator.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ISubAuthenticator)) ? new Proxy(iBinder) : (ISubAuthenticator) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ISubAuthenticator.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ISubAuthenticator.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                getAuthToken(ISubAuthenticatorResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null), IAmazonAccountAuthenticator.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 2) {
                getAccountRemovalAllowed(ISubAuthenticatorResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                updateAuthToken(ISubAuthenticatorResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null), IAmazonAccountAuthenticator.Stub.asInterface(parcel.readStrongBinder()));
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
