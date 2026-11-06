package com.amazon.alexa.android.extension.discovery;

import android.graphics.Rect;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.Surface;
import com.amazon.alexa.android.extension.discovery.L2_IRemoteClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface L2_IRemoteService extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.alexa.android.extension.discovery.L2_IRemoteService";
    public static final int TRANSACT_VERSION = 1;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void L2_connect(L2_IRemoteClient l2_IRemoteClient, String str) throws RemoteException;

    void L2_connectionClosed(L2_IRemoteClient l2_IRemoteClient, String str) throws RemoteException;

    void L2_onExit(int i, int i2) throws RemoteException;

    void L2_onFocusGained(int i, int i2) throws RemoteException;

    void L2_onFocusLost(int i, int i2) throws RemoteException;

    void L2_onPause(int i, int i2) throws RemoteException;

    void L2_onResourceAvailable(int i, int i2, Surface surface, Rect rect, String str) throws RemoteException;

    void L2_onResourceUnavailable(int i, int i2, String str) throws RemoteException;

    void L2_onResume(int i, int i2) throws RemoteException;

    void L2_receive(int i, int i2, String str) throws RemoteException;

    void L2_requestResource(L2_IRemoteClient l2_IRemoteClient, int i, String str) throws RemoteException;

    void L2_send(L2_IRemoteClient l2_IRemoteClient, int i, String str) throws RemoteException;

    void L2_sendBroadcast(String str) throws RemoteException;

    void L2_sendFailure(L2_IRemoteClient l2_IRemoteClient, int i, int i2, String str, String str2) throws RemoteException;

    boolean L2_supportsTransactVersion(int i) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements L2_IRemoteService {
        static final int TRANSACTION_L2_connect = 21;
        static final int TRANSACTION_L2_connectionClosed = 31;
        static final int TRANSACTION_L2_onExit = 91;
        static final int TRANSACTION_L2_onFocusGained = 53;
        static final int TRANSACTION_L2_onFocusLost = 52;
        static final int TRANSACTION_L2_onPause = 54;
        static final int TRANSACTION_L2_onResourceAvailable = 111;
        static final int TRANSACTION_L2_onResourceUnavailable = 121;
        static final int TRANSACTION_L2_onResume = 55;
        static final int TRANSACTION_L2_receive = 51;
        static final int TRANSACTION_L2_requestResource = 101;
        static final int TRANSACTION_L2_send = 61;
        static final int TRANSACTION_L2_sendBroadcast = 71;
        static final int TRANSACTION_L2_sendFailure = 81;
        static final int TRANSACTION_L2_supportsTransactVersion = 11;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements L2_IRemoteService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
            public void L2_connect(L2_IRemoteClient l2_IRemoteClient, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteService.DESCRIPTOR);
                    obtain.writeStrongInterface(l2_IRemoteClient);
                    obtain.writeString(str);
                    this.mRemote.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
            public void L2_connectionClosed(L2_IRemoteClient l2_IRemoteClient, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteService.DESCRIPTOR);
                    obtain.writeStrongInterface(l2_IRemoteClient);
                    obtain.writeString(str);
                    this.mRemote.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
            public void L2_onExit(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(91, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
            public void L2_onFocusGained(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(53, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
            public void L2_onFocusLost(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(52, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
            public void L2_onPause(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(54, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
            public void L2_onResourceAvailable(int i, int i2, Surface surface, Rect rect, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    _Parcel.writeTypedObject(obtain, surface, 0);
                    _Parcel.writeTypedObject(obtain, rect, 0);
                    obtain.writeString(str);
                    this.mRemote.transact(111, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
            public void L2_onResourceUnavailable(int i, int i2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.mRemote.transact(121, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
            public void L2_onResume(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(55, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
            public void L2_receive(int i, int i2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.mRemote.transact(51, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
            public void L2_requestResource(L2_IRemoteClient l2_IRemoteClient, int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteService.DESCRIPTOR);
                    obtain.writeStrongInterface(l2_IRemoteClient);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.mRemote.transact(101, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
            public void L2_send(L2_IRemoteClient l2_IRemoteClient, int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteService.DESCRIPTOR);
                    obtain.writeStrongInterface(l2_IRemoteClient);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.mRemote.transact(61, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
            public void L2_sendBroadcast(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteService.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(71, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
            public void L2_sendFailure(L2_IRemoteClient l2_IRemoteClient, int i, int i2, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteService.DESCRIPTOR);
                    obtain.writeStrongInterface(l2_IRemoteClient);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(81, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
            public boolean L2_supportsTransactVersion(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteService.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return L2_IRemoteService.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, L2_IRemoteService.DESCRIPTOR);
        }

        public static L2_IRemoteService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(L2_IRemoteService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof L2_IRemoteService)) ? new Proxy(iBinder) : (L2_IRemoteService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(L2_IRemoteService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(L2_IRemoteService.DESCRIPTOR);
                return true;
            }
            if (i == 11) {
                boolean L2_supportsTransactVersion = L2_supportsTransactVersion(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(L2_supportsTransactVersion ? 1 : 0);
            } else if (i == 21) {
                L2_connect(L2_IRemoteClient.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 31) {
                L2_connectionClosed(L2_IRemoteClient.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 61) {
                L2_send(L2_IRemoteClient.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 71) {
                L2_sendBroadcast(parcel.readString());
                parcel2.writeNoException();
            } else if (i == 81) {
                L2_sendFailure(L2_IRemoteClient.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 91) {
                L2_onExit(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
            } else if (i == 101) {
                L2_requestResource(L2_IRemoteClient.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 111) {
                L2_onResourceAvailable(parcel.readInt(), parcel.readInt(), (Surface) _Parcel.readTypedObject(parcel, Surface.CREATOR), (Rect) _Parcel.readTypedObject(parcel, Rect.CREATOR), parcel.readString());
                parcel2.writeNoException();
            } else if (i != 121) {
                switch (i) {
                    case 51:
                        L2_receive(parcel.readInt(), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 52:
                        L2_onFocusLost(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        break;
                    case 53:
                        L2_onFocusGained(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        break;
                    case 54:
                        L2_onPause(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        break;
                    case 55:
                        L2_onResume(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        break;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                L2_onResourceUnavailable(parcel.readInt(), parcel.readInt(), parcel.readString());
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
    public static class Default implements L2_IRemoteService {
        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public boolean L2_supportsTransactVersion(int i) throws RemoteException {
            return false;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public void L2_sendBroadcast(String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public void L2_connect(L2_IRemoteClient l2_IRemoteClient, String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public void L2_connectionClosed(L2_IRemoteClient l2_IRemoteClient, String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public void L2_onExit(int i, int i2) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public void L2_onFocusGained(int i, int i2) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public void L2_onFocusLost(int i, int i2) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public void L2_onPause(int i, int i2) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public void L2_onResume(int i, int i2) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public void L2_onResourceUnavailable(int i, int i2, String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public void L2_receive(int i, int i2, String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public void L2_requestResource(L2_IRemoteClient l2_IRemoteClient, int i, String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public void L2_send(L2_IRemoteClient l2_IRemoteClient, int i, String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public void L2_onResourceAvailable(int i, int i2, Surface surface, Rect rect, String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public void L2_sendFailure(L2_IRemoteClient l2_IRemoteClient, int i, int i2, String str, String str2) throws RemoteException {
        }
    }
}
