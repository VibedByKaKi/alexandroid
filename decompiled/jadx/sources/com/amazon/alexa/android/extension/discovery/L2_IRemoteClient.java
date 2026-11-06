package com.amazon.alexa.android.extension.discovery;

import android.graphics.Rect;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.Surface;
import com.amazon.alexaext.ActivityDescriptor;
import com.amazon.alexaext.SessionDescriptor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface L2_IRemoteClient extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.alexa.android.extension.discovery.L2_IRemoteClient";
    public static final int TRANASCT_INCOMPATIBLE = -100;
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

    void L2_connectionAccept() throws RemoteException;

    void L2_connectionClosed(String str) throws RemoteException;

    int L2_connectionID() throws RemoteException;

    void L2_connectionReject(int i, String str) throws RemoteException;

    void L2_messageFailure(int i, int i2, String str, String str2) throws RemoteException;

    void L2_messageFailureV2(int i, ActivityDescriptor activityDescriptor, int i2, String str, String str2) throws RemoteException;

    void L2_onBackgroundV2(int i, ActivityDescriptor activityDescriptor) throws RemoteException;

    void L2_onForegroundV2(int i, ActivityDescriptor activityDescriptor) throws RemoteException;

    void L2_onHiddenV2(int i, ActivityDescriptor activityDescriptor) throws RemoteException;

    void L2_onRegisteredV2(int i, ActivityDescriptor activityDescriptor) throws RemoteException;

    void L2_onRequestResource(int i, String str) throws RemoteException;

    void L2_onSessionEndedV2(int i, SessionDescriptor sessionDescriptor) throws RemoteException;

    void L2_onSessionStartedV2(int i, SessionDescriptor sessionDescriptor) throws RemoteException;

    void L2_onUnregisteredV2(int i, ActivityDescriptor activityDescriptor) throws RemoteException;

    void L2_pause(int i) throws RemoteException;

    void L2_receive(int i, String str) throws RemoteException;

    void L2_receiveBroadcast(String str) throws RemoteException;

    void L2_receiveV2(int i, ActivityDescriptor activityDescriptor, String str) throws RemoteException;

    void L2_resourceAvailable(int i, Surface surface, Rect rect, String str) throws RemoteException;

    void L2_resourceAvailableV2(int i, ActivityDescriptor activityDescriptor, Surface surface, Rect rect, String str) throws RemoteException;

    void L2_resourceUnavailable(int i, String str) throws RemoteException;

    void L2_resourceUnavailableV2(int i, ActivityDescriptor activityDescriptor, String str) throws RemoteException;

    void L2_resume(int i) throws RemoteException;

    void L2_send(int i, String str) throws RemoteException;

    void L2_sendV2(int i, ActivityDescriptor activityDescriptor, String str) throws RemoteException;

    void L2_setFocusGained(int i) throws RemoteException;

    void L2_setFocusLost(int i) throws RemoteException;

    boolean L2_supportsTransactVersion(int i) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements L2_IRemoteClient {
        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public int L2_connectionID() throws RemoteException {
            return 0;
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public boolean L2_supportsTransactVersion(int i) throws RemoteException {
            return false;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_connectionAccept() throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_connectionClosed(String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_pause(int i) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_receiveBroadcast(String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_resume(int i) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_setFocusGained(int i) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_setFocusLost(int i) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_connectionReject(int i, String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_onBackgroundV2(int i, ActivityDescriptor activityDescriptor) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_onForegroundV2(int i, ActivityDescriptor activityDescriptor) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_onHiddenV2(int i, ActivityDescriptor activityDescriptor) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_onRegisteredV2(int i, ActivityDescriptor activityDescriptor) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_onRequestResource(int i, String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_onSessionEndedV2(int i, SessionDescriptor sessionDescriptor) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_onSessionStartedV2(int i, SessionDescriptor sessionDescriptor) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_onUnregisteredV2(int i, ActivityDescriptor activityDescriptor) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_receive(int i, String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_resourceUnavailable(int i, String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_send(int i, String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_receiveV2(int i, ActivityDescriptor activityDescriptor, String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_resourceUnavailableV2(int i, ActivityDescriptor activityDescriptor, String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_sendV2(int i, ActivityDescriptor activityDescriptor, String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_messageFailure(int i, int i2, String str, String str2) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_resourceAvailable(int i, Surface surface, Rect rect, String str) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_messageFailureV2(int i, ActivityDescriptor activityDescriptor, int i2, String str, String str2) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_resourceAvailableV2(int i, ActivityDescriptor activityDescriptor, Surface surface, Rect rect, String str) throws RemoteException {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements L2_IRemoteClient {
        static final int TRANSACTION_L2_connectionAccept = 31;
        static final int TRANSACTION_L2_connectionClosed = 51;
        static final int TRANSACTION_L2_connectionID = 21;
        static final int TRANSACTION_L2_connectionReject = 41;
        static final int TRANSACTION_L2_messageFailure = 101;
        static final int TRANSACTION_L2_messageFailureV2 = 201;
        static final int TRANSACTION_L2_onBackgroundV2 = 242;
        static final int TRANSACTION_L2_onForegroundV2 = 241;
        static final int TRANSACTION_L2_onHiddenV2 = 243;
        static final int TRANSACTION_L2_onRegisteredV2 = 221;
        static final int TRANSACTION_L2_onRequestResource = 102;
        static final int TRANSACTION_L2_onSessionEndedV2 = 232;
        static final int TRANSACTION_L2_onSessionStartedV2 = 231;
        static final int TRANSACTION_L2_onUnregisteredV2 = 222;
        static final int TRANSACTION_L2_pause = 94;
        static final int TRANSACTION_L2_receive = 71;
        static final int TRANSACTION_L2_receiveBroadcast = 81;
        static final int TRANSACTION_L2_receiveV2 = 271;
        static final int TRANSACTION_L2_resourceAvailable = 103;
        static final int TRANSACTION_L2_resourceAvailableV2 = 203;
        static final int TRANSACTION_L2_resourceUnavailable = 104;
        static final int TRANSACTION_L2_resourceUnavailableV2 = 204;
        static final int TRANSACTION_L2_resume = 95;
        static final int TRANSACTION_L2_send = 91;
        static final int TRANSACTION_L2_sendV2 = 291;
        static final int TRANSACTION_L2_setFocusGained = 93;
        static final int TRANSACTION_L2_setFocusLost = 92;
        static final int TRANSACTION_L2_supportsTransactVersion = 11;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements L2_IRemoteClient {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_connectionAccept() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    this.mRemote.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_connectionClosed(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(51, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public int L2_connectionID() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    this.mRemote.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_connectionReject(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.mRemote.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_messageFailure(int i, int i2, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeInt(i);
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

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_messageFailureV2(int i, ActivityDescriptor activityDescriptor, int i2, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeInt(i);
                    _Parcel.writeTypedObject(obtain, activityDescriptor, 0);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(201, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_onBackgroundV2(int i, ActivityDescriptor activityDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeInt(i);
                    _Parcel.writeTypedObject(obtain, activityDescriptor, 0);
                    this.mRemote.transact(242, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_onForegroundV2(int i, ActivityDescriptor activityDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeInt(i);
                    _Parcel.writeTypedObject(obtain, activityDescriptor, 0);
                    this.mRemote.transact(241, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_onHiddenV2(int i, ActivityDescriptor activityDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeInt(i);
                    _Parcel.writeTypedObject(obtain, activityDescriptor, 0);
                    this.mRemote.transact(243, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_onRegisteredV2(int i, ActivityDescriptor activityDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeInt(i);
                    _Parcel.writeTypedObject(obtain, activityDescriptor, 0);
                    this.mRemote.transact(221, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_onRequestResource(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.mRemote.transact(102, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_onSessionEndedV2(int i, SessionDescriptor sessionDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeInt(i);
                    _Parcel.writeTypedObject(obtain, sessionDescriptor, 0);
                    this.mRemote.transact(232, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_onSessionStartedV2(int i, SessionDescriptor sessionDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeInt(i);
                    _Parcel.writeTypedObject(obtain, sessionDescriptor, 0);
                    this.mRemote.transact(231, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_onUnregisteredV2(int i, ActivityDescriptor activityDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeInt(i);
                    _Parcel.writeTypedObject(obtain, activityDescriptor, 0);
                    this.mRemote.transact(222, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_pause(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(94, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_receive(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.mRemote.transact(71, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_receiveBroadcast(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(81, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_receiveV2(int i, ActivityDescriptor activityDescriptor, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeInt(i);
                    _Parcel.writeTypedObject(obtain, activityDescriptor, 0);
                    obtain.writeString(str);
                    this.mRemote.transact(271, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_resourceAvailable(int i, Surface surface, Rect rect, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeInt(i);
                    _Parcel.writeTypedObject(obtain, surface, 0);
                    _Parcel.writeTypedObject(obtain, rect, 0);
                    obtain.writeString(str);
                    this.mRemote.transact(103, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_resourceAvailableV2(int i, ActivityDescriptor activityDescriptor, Surface surface, Rect rect, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeInt(i);
                    _Parcel.writeTypedObject(obtain, activityDescriptor, 0);
                    _Parcel.writeTypedObject(obtain, surface, 0);
                    _Parcel.writeTypedObject(obtain, rect, 0);
                    obtain.writeString(str);
                    this.mRemote.transact(203, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_resourceUnavailable(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.mRemote.transact(104, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_resourceUnavailableV2(int i, ActivityDescriptor activityDescriptor, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeInt(i);
                    _Parcel.writeTypedObject(obtain, activityDescriptor, 0);
                    obtain.writeString(str);
                    this.mRemote.transact(204, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_resume(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(95, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_send(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.mRemote.transact(91, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_sendV2(int i, ActivityDescriptor activityDescriptor, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeInt(i);
                    _Parcel.writeTypedObject(obtain, activityDescriptor, 0);
                    obtain.writeString(str);
                    this.mRemote.transact(Stub.TRANSACTION_L2_sendV2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_setFocusGained(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(93, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public void L2_setFocusLost(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(92, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
            public boolean L2_supportsTransactVersion(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(L2_IRemoteClient.DESCRIPTOR);
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
                return L2_IRemoteClient.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, L2_IRemoteClient.DESCRIPTOR);
        }

        public static L2_IRemoteClient asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(L2_IRemoteClient.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof L2_IRemoteClient)) ? new Proxy(iBinder) : (L2_IRemoteClient) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(L2_IRemoteClient.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(L2_IRemoteClient.DESCRIPTOR);
                return true;
            }
            if (i == 11) {
                boolean L2_supportsTransactVersion = L2_supportsTransactVersion(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(L2_supportsTransactVersion ? 1 : 0);
            } else if (i == 21) {
                int L2_connectionID = L2_connectionID();
                parcel2.writeNoException();
                parcel2.writeInt(L2_connectionID);
            } else if (i == 31) {
                L2_connectionAccept();
                parcel2.writeNoException();
            } else if (i == 41) {
                L2_connectionReject(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 51) {
                L2_connectionClosed(parcel.readString());
                parcel2.writeNoException();
            } else if (i == 71) {
                L2_receive(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 81) {
                L2_receiveBroadcast(parcel.readString());
                parcel2.writeNoException();
            } else if (i == 201) {
                L2_messageFailureV2(parcel.readInt(), (ActivityDescriptor) _Parcel.readTypedObject(parcel, ActivityDescriptor.CREATOR), parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 271) {
                L2_receiveV2(parcel.readInt(), (ActivityDescriptor) _Parcel.readTypedObject(parcel, ActivityDescriptor.CREATOR), parcel.readString());
                parcel2.writeNoException();
            } else if (i == TRANSACTION_L2_sendV2) {
                L2_sendV2(parcel.readInt(), (ActivityDescriptor) _Parcel.readTypedObject(parcel, ActivityDescriptor.CREATOR), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 203) {
                L2_resourceAvailableV2(parcel.readInt(), (ActivityDescriptor) _Parcel.readTypedObject(parcel, ActivityDescriptor.CREATOR), (Surface) _Parcel.readTypedObject(parcel, Surface.CREATOR), (Rect) _Parcel.readTypedObject(parcel, Rect.CREATOR), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 204) {
                L2_resourceUnavailableV2(parcel.readInt(), (ActivityDescriptor) _Parcel.readTypedObject(parcel, ActivityDescriptor.CREATOR), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 221) {
                L2_onRegisteredV2(parcel.readInt(), (ActivityDescriptor) _Parcel.readTypedObject(parcel, ActivityDescriptor.CREATOR));
                parcel2.writeNoException();
            } else if (i == 222) {
                L2_onUnregisteredV2(parcel.readInt(), (ActivityDescriptor) _Parcel.readTypedObject(parcel, ActivityDescriptor.CREATOR));
                parcel2.writeNoException();
            } else if (i == 231) {
                L2_onSessionStartedV2(parcel.readInt(), (SessionDescriptor) _Parcel.readTypedObject(parcel, SessionDescriptor.CREATOR));
                parcel2.writeNoException();
            } else if (i != 232) {
                switch (i) {
                    case 91:
                        L2_send(parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 92:
                        L2_setFocusLost(parcel.readInt());
                        parcel2.writeNoException();
                        break;
                    case 93:
                        L2_setFocusGained(parcel.readInt());
                        parcel2.writeNoException();
                        break;
                    case 94:
                        L2_pause(parcel.readInt());
                        parcel2.writeNoException();
                        break;
                    case 95:
                        L2_resume(parcel.readInt());
                        parcel2.writeNoException();
                        break;
                    default:
                        switch (i) {
                            case 101:
                                L2_messageFailure(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                                parcel2.writeNoException();
                                break;
                            case 102:
                                L2_onRequestResource(parcel.readInt(), parcel.readString());
                                parcel2.writeNoException();
                                break;
                            case 103:
                                L2_resourceAvailable(parcel.readInt(), (Surface) _Parcel.readTypedObject(parcel, Surface.CREATOR), (Rect) _Parcel.readTypedObject(parcel, Rect.CREATOR), parcel.readString());
                                parcel2.writeNoException();
                                break;
                            case 104:
                                L2_resourceUnavailable(parcel.readInt(), parcel.readString());
                                parcel2.writeNoException();
                                break;
                            default:
                                switch (i) {
                                    case 241:
                                        L2_onForegroundV2(parcel.readInt(), (ActivityDescriptor) _Parcel.readTypedObject(parcel, ActivityDescriptor.CREATOR));
                                        parcel2.writeNoException();
                                        break;
                                    case 242:
                                        L2_onBackgroundV2(parcel.readInt(), (ActivityDescriptor) _Parcel.readTypedObject(parcel, ActivityDescriptor.CREATOR));
                                        parcel2.writeNoException();
                                        break;
                                    case 243:
                                        L2_onHiddenV2(parcel.readInt(), (ActivityDescriptor) _Parcel.readTypedObject(parcel, ActivityDescriptor.CREATOR));
                                        parcel2.writeNoException();
                                        break;
                                    default:
                                        return super.onTransact(i, parcel, parcel2, i2);
                                }
                        }
                }
            } else {
                L2_onSessionEndedV2(parcel.readInt(), (SessionDescriptor) _Parcel.readTypedObject(parcel, SessionDescriptor.CREATOR));
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
