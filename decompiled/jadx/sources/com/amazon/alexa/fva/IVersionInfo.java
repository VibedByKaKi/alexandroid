package com.amazon.alexa.fva;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.alexa.fva.IResultCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface IVersionInfo extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.alexa.fva.IVersionInfo";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements IVersionInfo {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.alexa.fva.IVersionInfo
        public int getApiVersion(IResultCallback iResultCallback) throws RemoteException {
            return 0;
        }

        @Override // com.amazon.alexa.fva.IVersionInfo
        public boolean isUvrSupported(int i, String str) throws RemoteException {
            return false;
        }
    }

    int getApiVersion(IResultCallback iResultCallback) throws RemoteException;

    boolean isUvrSupported(int i, String str) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IVersionInfo {
        static final int TRANSACTION_getApiVersion = 1;
        static final int TRANSACTION_isUvrSupported = 2;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IVersionInfo {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.amazon.alexa.fva.IVersionInfo
            public int getApiVersion(IResultCallback iResultCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IVersionInfo.DESCRIPTOR);
                    obtain.writeStrongInterface(iResultCallback);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IVersionInfo.DESCRIPTOR;
            }

            @Override // com.amazon.alexa.fva.IVersionInfo
            public boolean isUvrSupported(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IVersionInfo.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
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
            attachInterface(this, IVersionInfo.DESCRIPTOR);
        }

        public static IVersionInfo asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IVersionInfo.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IVersionInfo)) ? new Proxy(iBinder) : (IVersionInfo) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IVersionInfo.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IVersionInfo.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                int apiVersion = getApiVersion(IResultCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(apiVersion);
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                boolean isUvrSupported = isUvrSupported(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(isUvrSupported ? 1 : 0);
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
