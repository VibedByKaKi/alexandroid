package com.amazon.leaderselection;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface LeaderSelectionServiceInterface extends IInterface {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements LeaderSelectionServiceInterface {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.leaderselection.LeaderSelectionServiceInterface
        public Leader select(String str) throws RemoteException {
            return null;
        }

        @Override // com.amazon.leaderselection.LeaderSelectionServiceInterface
        public Message send(Message message) throws RemoteException {
            return null;
        }
    }

    Leader select(String str) throws RemoteException;

    Message send(Message message) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements LeaderSelectionServiceInterface {
        private static final String DESCRIPTOR = "com.amazon.leaderselection.LeaderSelectionServiceInterface";
        static final int TRANSACTION_select = 1;
        static final int TRANSACTION_send = 2;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements LeaderSelectionServiceInterface {
            public static LeaderSelectionServiceInterface sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.amazon.leaderselection.LeaderSelectionServiceInterface
            public Leader select(String str) throws RemoteException {
                Leader createFromParcel;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        createFromParcel = obtain2.readInt() != 0 ? Leader.CREATOR.createFromParcel(obtain2) : null;
                    } else {
                        createFromParcel = Stub.getDefaultImpl().select(str);
                    }
                    return createFromParcel;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.leaderselection.LeaderSelectionServiceInterface
            public Message send(Message message) throws RemoteException {
                Message message2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (message != null) {
                        obtain.writeInt(1);
                        message.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        message2 = obtain2.readInt() != 0 ? (Message) Message.CREATOR.createFromParcel(obtain2) : null;
                    } else {
                        message2 = Stub.getDefaultImpl().send(message);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return message2;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static LeaderSelectionServiceInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof LeaderSelectionServiceInterface)) ? new Proxy(iBinder) : (LeaderSelectionServiceInterface) queryLocalInterface;
        }

        public static LeaderSelectionServiceInterface getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(LeaderSelectionServiceInterface leaderSelectionServiceInterface) {
            if (Proxy.sDefaultImpl != null) {
                Single$$ExternalSyntheticBUOutline0.m$2("setDefaultImpl() called twice");
                return false;
            }
            if (leaderSelectionServiceInterface == null) {
                return false;
            }
            Proxy.sDefaultImpl = leaderSelectionServiceInterface;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                Leader select = select(parcel.readString());
                parcel2.writeNoException();
                if (select != null) {
                    parcel2.writeInt(1);
                    select.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            Message send = send(parcel.readInt() != 0 ? (Message) Message.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            if (send != null) {
                parcel2.writeInt(1);
                send.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
