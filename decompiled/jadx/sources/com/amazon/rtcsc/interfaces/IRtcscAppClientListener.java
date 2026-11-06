package com.amazon.rtcsc.interfaces;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IRtcscAppClientListener extends IInterface {
    public static final int API_VERSION = 6;
    public static final String DESCRIPTOR = "com.amazon.rtcsc.interfaces.IRtcscAppClientListener";

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

    int getAPIVersion() throws RemoteException;

    void onError(RtcscErrorCode rtcscErrorCode, String str) throws RemoteException;

    void onFirstFrameReceived(String str, RtcscMediaType rtcscMediaType) throws RemoteException;

    void onFirstFrameRendered(String str, RtcscSide rtcscSide) throws RemoteException;

    void onFrameResolutionChanged(String str, RtcscSide rtcscSide, int i, int i2, int i3) throws RemoteException;

    void onMediaCapabilityChanged(String str, RtcscSide rtcscSide, RtcscMediaType rtcscMediaType, boolean z) throws RemoteException;

    void onMediaConnectionStateChanged(String str, RtcscMediaConnectionState rtcscMediaConnectionState) throws RemoteException;

    void onMediaStatusChanged(String str, RtcscSide rtcscSide, RtcscMediaType rtcscMediaType, boolean z) throws RemoteException;

    void onSessionAvailable(String str) throws RemoteException;

    void onSessionError(String str, RtcscErrorCode rtcscErrorCode, String str2) throws RemoteException;

    void onSessionRemoved(String str) throws RemoteException;

    void onSessionStateChanged(String str, RtcscSessionState rtcscSessionState) throws RemoteException;

    void onVideoEffectChanged(String str, RtcscVideoEffect rtcscVideoEffect, int i) throws RemoteException;

    void onVideoFrameTimestampInfoReceived(String str, RtcscVideoFrameTimestampInfo rtcscVideoFrameTimestampInfo) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IRtcscAppClientListener {
        static final int TRANSACTION_getAPIVersion = 8;
        static final int TRANSACTION_onError = 3;
        static final int TRANSACTION_onFirstFrameReceived = 11;
        static final int TRANSACTION_onFirstFrameRendered = 10;
        static final int TRANSACTION_onFrameResolutionChanged = 12;
        static final int TRANSACTION_onMediaCapabilityChanged = 13;
        static final int TRANSACTION_onMediaConnectionStateChanged = 9;
        static final int TRANSACTION_onMediaStatusChanged = 6;
        static final int TRANSACTION_onSessionAvailable = 1;
        static final int TRANSACTION_onSessionError = 4;
        static final int TRANSACTION_onSessionRemoved = 2;
        static final int TRANSACTION_onSessionStateChanged = 5;
        static final int TRANSACTION_onVideoEffectChanged = 7;
        static final int TRANSACTION_onVideoFrameTimestampInfoReceived = 14;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IRtcscAppClientListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
            public int getAPIVersion() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscAppClientListener.DESCRIPTOR);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IRtcscAppClientListener.DESCRIPTOR;
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
            public void onError(RtcscErrorCode rtcscErrorCode, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscAppClientListener.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, rtcscErrorCode, 0);
                    obtain.writeString(str);
                    this.mRemote.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
            public void onFirstFrameReceived(String str, RtcscMediaType rtcscMediaType) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscAppClientListener.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, rtcscMediaType, 0);
                    this.mRemote.transact(11, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
            public void onFirstFrameRendered(String str, RtcscSide rtcscSide) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscAppClientListener.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, rtcscSide, 0);
                    this.mRemote.transact(10, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
            public void onFrameResolutionChanged(String str, RtcscSide rtcscSide, int i, int i2, int i3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscAppClientListener.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, rtcscSide, 0);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.mRemote.transact(12, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
            public void onMediaCapabilityChanged(String str, RtcscSide rtcscSide, RtcscMediaType rtcscMediaType, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscAppClientListener.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, rtcscSide, 0);
                    _Parcel.writeTypedObject(obtain, rtcscMediaType, 0);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(13, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
            public void onMediaConnectionStateChanged(String str, RtcscMediaConnectionState rtcscMediaConnectionState) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscAppClientListener.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, rtcscMediaConnectionState, 0);
                    this.mRemote.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
            public void onMediaStatusChanged(String str, RtcscSide rtcscSide, RtcscMediaType rtcscMediaType, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscAppClientListener.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, rtcscSide, 0);
                    _Parcel.writeTypedObject(obtain, rtcscMediaType, 0);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
            public void onSessionAvailable(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscAppClientListener.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
            public void onSessionError(String str, RtcscErrorCode rtcscErrorCode, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscAppClientListener.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, rtcscErrorCode, 0);
                    obtain.writeString(str2);
                    this.mRemote.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
            public void onSessionRemoved(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscAppClientListener.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
            public void onSessionStateChanged(String str, RtcscSessionState rtcscSessionState) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscAppClientListener.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, rtcscSessionState, 0);
                    this.mRemote.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
            public void onVideoEffectChanged(String str, RtcscVideoEffect rtcscVideoEffect, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscAppClientListener.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, rtcscVideoEffect, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
            public void onVideoFrameTimestampInfoReceived(String str, RtcscVideoFrameTimestampInfo rtcscVideoFrameTimestampInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscAppClientListener.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, rtcscVideoFrameTimestampInfo, 0);
                    this.mRemote.transact(14, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IRtcscAppClientListener.DESCRIPTOR);
        }

        public static IRtcscAppClientListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IRtcscAppClientListener.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IRtcscAppClientListener)) ? new Proxy(iBinder) : (IRtcscAppClientListener) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IRtcscAppClientListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IRtcscAppClientListener.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    onSessionAvailable(parcel.readString());
                    return true;
                case 2:
                    onSessionRemoved(parcel.readString());
                    return true;
                case 3:
                    onError((RtcscErrorCode) _Parcel.readTypedObject(parcel, RtcscErrorCode.CREATOR), parcel.readString());
                    return true;
                case 4:
                    onSessionError(parcel.readString(), (RtcscErrorCode) _Parcel.readTypedObject(parcel, RtcscErrorCode.CREATOR), parcel.readString());
                    return true;
                case 5:
                    onSessionStateChanged(parcel.readString(), (RtcscSessionState) _Parcel.readTypedObject(parcel, RtcscSessionState.CREATOR));
                    return true;
                case 6:
                    onMediaStatusChanged(parcel.readString(), (RtcscSide) _Parcel.readTypedObject(parcel, RtcscSide.CREATOR), (RtcscMediaType) _Parcel.readTypedObject(parcel, RtcscMediaType.CREATOR), parcel.readInt() != 0);
                    return true;
                case 7:
                    onVideoEffectChanged(parcel.readString(), (RtcscVideoEffect) _Parcel.readTypedObject(parcel, RtcscVideoEffect.CREATOR), parcel.readInt());
                    return true;
                case 8:
                    int aPIVersion = getAPIVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(aPIVersion);
                    return true;
                case 9:
                    onMediaConnectionStateChanged(parcel.readString(), (RtcscMediaConnectionState) _Parcel.readTypedObject(parcel, RtcscMediaConnectionState.CREATOR));
                    return true;
                case 10:
                    onFirstFrameRendered(parcel.readString(), (RtcscSide) _Parcel.readTypedObject(parcel, RtcscSide.CREATOR));
                    return true;
                case 11:
                    onFirstFrameReceived(parcel.readString(), (RtcscMediaType) _Parcel.readTypedObject(parcel, RtcscMediaType.CREATOR));
                    return true;
                case 12:
                    onFrameResolutionChanged(parcel.readString(), (RtcscSide) _Parcel.readTypedObject(parcel, RtcscSide.CREATOR), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 13:
                    onMediaCapabilityChanged(parcel.readString(), (RtcscSide) _Parcel.readTypedObject(parcel, RtcscSide.CREATOR), (RtcscMediaType) _Parcel.readTypedObject(parcel, RtcscMediaType.CREATOR), parcel.readInt() != 0);
                    return true;
                case 14:
                    onVideoFrameTimestampInfoReceived(parcel.readString(), (RtcscVideoFrameTimestampInfo) _Parcel.readTypedObject(parcel, RtcscVideoFrameTimestampInfo.CREATOR));
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

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements IRtcscAppClientListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
        public int getAPIVersion() throws RemoteException {
            return 0;
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
        public void onSessionAvailable(String str) throws RemoteException {
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
        public void onSessionRemoved(String str) throws RemoteException {
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
        public void onError(RtcscErrorCode rtcscErrorCode, String str) throws RemoteException {
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
        public void onFirstFrameReceived(String str, RtcscMediaType rtcscMediaType) throws RemoteException {
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
        public void onFirstFrameRendered(String str, RtcscSide rtcscSide) throws RemoteException {
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
        public void onMediaConnectionStateChanged(String str, RtcscMediaConnectionState rtcscMediaConnectionState) throws RemoteException {
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
        public void onSessionStateChanged(String str, RtcscSessionState rtcscSessionState) throws RemoteException {
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
        public void onVideoFrameTimestampInfoReceived(String str, RtcscVideoFrameTimestampInfo rtcscVideoFrameTimestampInfo) throws RemoteException {
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
        public void onSessionError(String str, RtcscErrorCode rtcscErrorCode, String str2) throws RemoteException {
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
        public void onVideoEffectChanged(String str, RtcscVideoEffect rtcscVideoEffect, int i) throws RemoteException {
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
        public void onMediaCapabilityChanged(String str, RtcscSide rtcscSide, RtcscMediaType rtcscMediaType, boolean z) throws RemoteException {
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
        public void onMediaStatusChanged(String str, RtcscSide rtcscSide, RtcscMediaType rtcscMediaType, boolean z) throws RemoteException {
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscAppClientListener
        public void onFrameResolutionChanged(String str, RtcscSide rtcscSide, int i, int i2, int i3) throws RemoteException {
        }
    }
}
