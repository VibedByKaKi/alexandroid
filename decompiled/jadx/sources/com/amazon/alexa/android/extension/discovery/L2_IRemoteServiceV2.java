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
import com.amazon.alexaext.ActivityDescriptor;
import com.amazon.alexaext.SessionDescriptor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface L2_IRemoteServiceV2 extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2";
    public static final int TRANSACT_VERSION = 2;

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

    void L2_onBackground(int i, int i2, ActivityDescriptor activityDescriptor) throws RemoteException;

    void L2_onForeground(int i, int i2, ActivityDescriptor activityDescriptor) throws RemoteException;

    void L2_onHidden(int i, int i2, ActivityDescriptor activityDescriptor) throws RemoteException;

    void L2_onRegistered(int i, int i2, ActivityDescriptor activityDescriptor) throws RemoteException;

    void L2_onResourceAvailable(int i, int i2, ActivityDescriptor activityDescriptor, Surface surface, Rect rect, String str) throws RemoteException;

    void L2_onResourceUnavailable(int i, int i2, ActivityDescriptor activityDescriptor, String str) throws RemoteException;

    void L2_onSessionEnded(int i, int i2, SessionDescriptor sessionDescriptor) throws RemoteException;

    void L2_onSessionStarted(int i, int i2, SessionDescriptor sessionDescriptor) throws RemoteException;

    void L2_onUnregistered(int i, int i2, ActivityDescriptor activityDescriptor) throws RemoteException;

    void L2_receive(int i, int i2, ActivityDescriptor activityDescriptor, String str) throws RemoteException;

    void L2_send(L2_IRemoteClient l2_IRemoteClient, int i, ActivityDescriptor activityDescriptor, String str) throws RemoteException;

    void L2_sendFailure(L2_IRemoteClient l2_IRemoteClient, int i, ActivityDescriptor activityDescriptor, int i2, String str, String str2) throws RemoteException;

    boolean L2_supportsTransactVersion(int i) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements L2_IRemoteServiceV2 {
        static final int TRANSACTION_L2_connect = 21;
        static final int TRANSACTION_L2_connectionClosed = 31;
        static final int TRANSACTION_L2_onBackground = 142;
        static final int TRANSACTION_L2_onForeground = 141;
        static final int TRANSACTION_L2_onHidden = 143;
        static final int TRANSACTION_L2_onRegistered = 121;
        static final int TRANSACTION_L2_onResourceAvailable = 111;
        static final int TRANSACTION_L2_onResourceUnavailable = 112;
        static final int TRANSACTION_L2_onSessionEnded = 132;
        static final int TRANSACTION_L2_onSessionStarted = 131;
        static final int TRANSACTION_L2_onUnregistered = 122;
        static final int TRANSACTION_L2_receive = 71;
        static final int TRANSACTION_L2_send = 91;
        static final int TRANSACTION_L2_sendFailure = 101;
        static final int TRANSACTION_L2_supportsTransactVersion = 11;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements L2_IRemoteServiceV2 {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
            public void L2_connect(L2_IRemoteClient l2_IRemoteClient, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteServiceV2.DESCRIPTOR);
                    obtain.writeStrongInterface(l2_IRemoteClient);
                    obtain.writeString(str);
                    this.mRemote.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
            public void L2_connectionClosed(L2_IRemoteClient l2_IRemoteClient, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteServiceV2.DESCRIPTOR);
                    obtain.writeStrongInterface(l2_IRemoteClient);
                    obtain.writeString(str);
                    this.mRemote.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
            public void L2_onBackground(int i, int i2, ActivityDescriptor activityDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteServiceV2.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    _Parcel.writeTypedObject(obtain, activityDescriptor, 0);
                    this.mRemote.transact(142, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
            public void L2_onForeground(int i, int i2, ActivityDescriptor activityDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteServiceV2.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    _Parcel.writeTypedObject(obtain, activityDescriptor, 0);
                    this.mRemote.transact(141, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
            public void L2_onHidden(int i, int i2, ActivityDescriptor activityDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteServiceV2.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    _Parcel.writeTypedObject(obtain, activityDescriptor, 0);
                    this.mRemote.transact(143, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
            public void L2_onRegistered(int i, int i2, ActivityDescriptor activityDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteServiceV2.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    _Parcel.writeTypedObject(obtain, activityDescriptor, 0);
                    this.mRemote.transact(121, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
            public void L2_onResourceAvailable(int i, int i2, ActivityDescriptor activityDescriptor, Surface surface, Rect rect, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteServiceV2.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    _Parcel.writeTypedObject(obtain, activityDescriptor, 0);
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

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
            public void L2_onResourceUnavailable(int i, int i2, ActivityDescriptor activityDescriptor, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteServiceV2.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    _Parcel.writeTypedObject(obtain, activityDescriptor, 0);
                    obtain.writeString(str);
                    this.mRemote.transact(112, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
            public void L2_onSessionEnded(int i, int i2, SessionDescriptor sessionDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteServiceV2.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    _Parcel.writeTypedObject(obtain, sessionDescriptor, 0);
                    this.mRemote.transact(132, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
            public void L2_onSessionStarted(int i, int i2, SessionDescriptor sessionDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteServiceV2.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    _Parcel.writeTypedObject(obtain, sessionDescriptor, 0);
                    this.mRemote.transact(131, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
            public void L2_onUnregistered(int i, int i2, ActivityDescriptor activityDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteServiceV2.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    _Parcel.writeTypedObject(obtain, activityDescriptor, 0);
                    this.mRemote.transact(122, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
            public void L2_receive(int i, int i2, ActivityDescriptor activityDescriptor, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteServiceV2.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    _Parcel.writeTypedObject(obtain, activityDescriptor, 0);
                    obtain.writeString(str);
                    this.mRemote.transact(71, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
            public void L2_send(L2_IRemoteClient l2_IRemoteClient, int i, ActivityDescriptor activityDescriptor, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteServiceV2.DESCRIPTOR);
                    obtain.writeStrongInterface(l2_IRemoteClient);
                    obtain.writeInt(i);
                    _Parcel.writeTypedObject(obtain, activityDescriptor, 0);
                    obtain.writeString(str);
                    this.mRemote.transact(91, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
            public void L2_sendFailure(L2_IRemoteClient l2_IRemoteClient, int i, ActivityDescriptor activityDescriptor, int i2, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteServiceV2.DESCRIPTOR);
                    obtain.writeStrongInterface(l2_IRemoteClient);
                    obtain.writeInt(i);
                    _Parcel.writeTypedObject(obtain, activityDescriptor, 0);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(101, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
            public boolean L2_supportsTransactVersion(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteServiceV2.DESCRIPTOR);
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
                return L2_IRemoteServiceV2.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, L2_IRemoteServiceV2.DESCRIPTOR);
        }

        public static L2_IRemoteServiceV2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(L2_IRemoteServiceV2.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof L2_IRemoteServiceV2)) ? new Proxy(iBinder) : (L2_IRemoteServiceV2) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(L2_IRemoteServiceV2.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(L2_IRemoteServiceV2.DESCRIPTOR);
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
            } else if (i == 71) {
                L2_receive(parcel.readInt(), parcel.readInt(), (ActivityDescriptor) _Parcel.readTypedObject(parcel, ActivityDescriptor.CREATOR), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 91) {
                L2_send(L2_IRemoteClient.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (ActivityDescriptor) _Parcel.readTypedObject(parcel, ActivityDescriptor.CREATOR), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 101) {
                L2_sendFailure(L2_IRemoteClient.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (ActivityDescriptor) _Parcel.readTypedObject(parcel, ActivityDescriptor.CREATOR), parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 111) {
                L2_onResourceAvailable(parcel.readInt(), parcel.readInt(), (ActivityDescriptor) _Parcel.readTypedObject(parcel, ActivityDescriptor.CREATOR), (Surface) _Parcel.readTypedObject(parcel, Surface.CREATOR), (Rect) _Parcel.readTypedObject(parcel, Rect.CREATOR), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 112) {
                L2_onResourceUnavailable(parcel.readInt(), parcel.readInt(), (ActivityDescriptor) _Parcel.readTypedObject(parcel, ActivityDescriptor.CREATOR), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 121) {
                L2_onRegistered(parcel.readInt(), parcel.readInt(), (ActivityDescriptor) _Parcel.readTypedObject(parcel, ActivityDescriptor.CREATOR));
                parcel2.writeNoException();
            } else if (i == 122) {
                L2_onUnregistered(parcel.readInt(), parcel.readInt(), (ActivityDescriptor) _Parcel.readTypedObject(parcel, ActivityDescriptor.CREATOR));
                parcel2.writeNoException();
            } else if (i == 131) {
                L2_onSessionStarted(parcel.readInt(), parcel.readInt(), (SessionDescriptor) _Parcel.readTypedObject(parcel, SessionDescriptor.CREATOR));
                parcel2.writeNoException();
            } else if (i != 132) {
                switch (i) {
                    case 141:
                        L2_onForeground(parcel.readInt(), parcel.readInt(), (ActivityDescriptor) _Parcel.readTypedObject(parcel, ActivityDescriptor.CREATOR));
                        parcel2.writeNoException();
                        break;
                    case 142:
                        L2_onBackground(parcel.readInt(), parcel.readInt(), (ActivityDescriptor) _Parcel.readTypedObject(parcel, ActivityDescriptor.CREATOR));
                        parcel2.writeNoException();
                        break;
                    case 143:
                        L2_onHidden(parcel.readInt(), parcel.readInt(), (ActivityDescriptor) _Parcel.readTypedObject(parcel, ActivityDescriptor.CREATOR));
                        parcel2.writeNoException();
                        break;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                L2_onSessionEnded(parcel.readInt(), parcel.readInt(), (SessionDescriptor) _Parcel.readTypedObject(parcel, SessionDescriptor.CREATOR));
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
    public static class Default implements L2_IRemoteServiceV2 {
        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
        public boolean L2_supportsTransactVersion(int i) throws RemoteException {
            return false;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
        public void L2_connect(L2_IRemoteClient l2_IRemoteClient, String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
        public void L2_connectionClosed(L2_IRemoteClient l2_IRemoteClient, String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
        public void L2_onBackground(int i, int i2, ActivityDescriptor activityDescriptor) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
        public void L2_onForeground(int i, int i2, ActivityDescriptor activityDescriptor) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
        public void L2_onHidden(int i, int i2, ActivityDescriptor activityDescriptor) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
        public void L2_onRegistered(int i, int i2, ActivityDescriptor activityDescriptor) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
        public void L2_onSessionEnded(int i, int i2, SessionDescriptor sessionDescriptor) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
        public void L2_onSessionStarted(int i, int i2, SessionDescriptor sessionDescriptor) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
        public void L2_onUnregistered(int i, int i2, ActivityDescriptor activityDescriptor) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
        public void L2_onResourceUnavailable(int i, int i2, ActivityDescriptor activityDescriptor, String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
        public void L2_receive(int i, int i2, ActivityDescriptor activityDescriptor, String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
        public void L2_send(L2_IRemoteClient l2_IRemoteClient, int i, ActivityDescriptor activityDescriptor, String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
        public void L2_onResourceAvailable(int i, int i2, ActivityDescriptor activityDescriptor, Surface surface, Rect rect, String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2
        public void L2_sendFailure(L2_IRemoteClient l2_IRemoteClient, int i, ActivityDescriptor activityDescriptor, int i2, String str, String str2) throws RemoteException {
        }
    }
}
