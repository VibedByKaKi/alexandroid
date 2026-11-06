package com.amazon.rtcsc.interfaces;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IRtcscEventListener extends IInterface {
    public static final int API_VERSION = 1;
    public static final String DESCRIPTOR = "com.amazon.rtcsc.interfaces.IRtcscEventListener";

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

    void onError(RtcscErrorCode rtcscErrorCode) throws RemoteException;

    void onRTCSessionContextUpdated(String str) throws RemoteException;

    void onSendEvent(String str, String str2, String str3, String str4) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IRtcscEventListener {
        static final int TRANSACTION_getAPIVersion = 4;
        static final int TRANSACTION_onError = 3;
        static final int TRANSACTION_onRTCSessionContextUpdated = 2;
        static final int TRANSACTION_onSendEvent = 1;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IRtcscEventListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscEventListener
            public int getAPIVersion() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscEventListener.DESCRIPTOR);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IRtcscEventListener.DESCRIPTOR;
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscEventListener
            public void onError(RtcscErrorCode rtcscErrorCode) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscEventListener.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, rtcscErrorCode, 0);
                    this.mRemote.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscEventListener
            public void onRTCSessionContextUpdated(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscEventListener.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscEventListener
            public void onSendEvent(String str, String str2, String str3, String str4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscEventListener.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IRtcscEventListener.DESCRIPTOR);
        }

        public static IRtcscEventListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IRtcscEventListener.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IRtcscEventListener)) ? new Proxy(iBinder) : (IRtcscEventListener) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IRtcscEventListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IRtcscEventListener.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onSendEvent(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                return true;
            }
            if (i == 2) {
                onRTCSessionContextUpdated(parcel.readString());
                return true;
            }
            if (i == 3) {
                onError((RtcscErrorCode) _Parcel.readTypedObject(parcel, RtcscErrorCode.CREATOR));
                return true;
            }
            if (i != 4) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int aPIVersion = getAPIVersion();
            parcel2.writeNoException();
            parcel2.writeInt(aPIVersion);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements IRtcscEventListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscEventListener
        public int getAPIVersion() throws RemoteException {
            return 0;
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscEventListener
        public void onError(RtcscErrorCode rtcscErrorCode) throws RemoteException {
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscEventListener
        public void onRTCSessionContextUpdated(String str) throws RemoteException {
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscEventListener
        public void onSendEvent(String str, String str2, String str3, String str4) throws RemoteException {
        }
    }
}
