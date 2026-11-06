package com.amazon.dcp.sso;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface ISessionUserChanger extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.dcp.sso.ISessionUserChanger";

    String[] addSessionUserDirectedIds(String[] strArr) throws RemoteException;

    ParcelableAccount[] addSessionUsers(ParcelableAccount[] parcelableAccountArr) throws RemoteException;

    String[] changeSessionUserDirectedIds(String[] strArr) throws RemoteException;

    ParcelableAccount[] changeSessionUsers(ParcelableAccount[] parcelableAccountArr) throws RemoteException;

    String[] removeSessionUserDirectedIds(String[] strArr) throws RemoteException;

    ParcelableAccount[] removeSessionUsers(ParcelableAccount[] parcelableAccountArr) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements ISessionUserChanger {
        static final int TRANSACTION_addSessionUserDirectedIds = 4;
        static final int TRANSACTION_addSessionUsers = 1;
        static final int TRANSACTION_changeSessionUserDirectedIds = 6;
        static final int TRANSACTION_changeSessionUsers = 3;
        static final int TRANSACTION_removeSessionUserDirectedIds = 5;
        static final int TRANSACTION_removeSessionUsers = 2;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements ISessionUserChanger {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.amazon.dcp.sso.ISessionUserChanger
            public String[] addSessionUserDirectedIds(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISessionUserChanger.DESCRIPTOR);
                    obtain.writeStringArray(strArr);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.dcp.sso.ISessionUserChanger
            public ParcelableAccount[] addSessionUsers(ParcelableAccount[] parcelableAccountArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISessionUserChanger.DESCRIPTOR);
                    obtain.writeTypedArray(parcelableAccountArr, 0);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ParcelableAccount[]) obtain2.createTypedArray(ParcelableAccount.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.amazon.dcp.sso.ISessionUserChanger
            public String[] changeSessionUserDirectedIds(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISessionUserChanger.DESCRIPTOR);
                    obtain.writeStringArray(strArr);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.dcp.sso.ISessionUserChanger
            public ParcelableAccount[] changeSessionUsers(ParcelableAccount[] parcelableAccountArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISessionUserChanger.DESCRIPTOR);
                    obtain.writeTypedArray(parcelableAccountArr, 0);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ParcelableAccount[]) obtain2.createTypedArray(ParcelableAccount.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return ISessionUserChanger.DESCRIPTOR;
            }

            @Override // com.amazon.dcp.sso.ISessionUserChanger
            public String[] removeSessionUserDirectedIds(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISessionUserChanger.DESCRIPTOR);
                    obtain.writeStringArray(strArr);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.dcp.sso.ISessionUserChanger
            public ParcelableAccount[] removeSessionUsers(ParcelableAccount[] parcelableAccountArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISessionUserChanger.DESCRIPTOR);
                    obtain.writeTypedArray(parcelableAccountArr, 0);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ParcelableAccount[]) obtain2.createTypedArray(ParcelableAccount.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ISessionUserChanger.DESCRIPTOR);
        }

        public static ISessionUserChanger asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ISessionUserChanger.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ISessionUserChanger)) ? new Proxy(iBinder) : (ISessionUserChanger) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ISessionUserChanger.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ISessionUserChanger.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    ParcelableAccount[] addSessionUsers = addSessionUsers((ParcelableAccount[]) parcel.createTypedArray(ParcelableAccount.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(addSessionUsers, 1);
                    return true;
                case 2:
                    ParcelableAccount[] removeSessionUsers = removeSessionUsers((ParcelableAccount[]) parcel.createTypedArray(ParcelableAccount.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(removeSessionUsers, 1);
                    return true;
                case 3:
                    ParcelableAccount[] changeSessionUsers = changeSessionUsers((ParcelableAccount[]) parcel.createTypedArray(ParcelableAccount.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(changeSessionUsers, 1);
                    return true;
                case 4:
                    String[] addSessionUserDirectedIds = addSessionUserDirectedIds(parcel.createStringArray());
                    parcel2.writeNoException();
                    parcel2.writeStringArray(addSessionUserDirectedIds);
                    return true;
                case 5:
                    String[] removeSessionUserDirectedIds = removeSessionUserDirectedIds(parcel.createStringArray());
                    parcel2.writeNoException();
                    parcel2.writeStringArray(removeSessionUserDirectedIds);
                    return true;
                case 6:
                    String[] changeSessionUserDirectedIds = changeSessionUserDirectedIds(parcel.createStringArray());
                    parcel2.writeNoException();
                    parcel2.writeStringArray(changeSessionUserDirectedIds);
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
