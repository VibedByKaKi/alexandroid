package com.amazon.rtcsc.interfaces;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IRtcscDataChannelListener extends IInterface {
    public static final int API_VERSION = 1;
    public static final String DESCRIPTOR = "com.amazon.rtcsc.interfaces.IRtcscDataChannelListener";

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

    void onMessageReceived(String str, String str2, byte[] bArr, boolean z) throws RemoteException;

    void onStateChange(String str, String str2, RtcscDataChannelState rtcscDataChannelState) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IRtcscDataChannelListener {
        static final int TRANSACTION_getAPIVersion = 3;
        static final int TRANSACTION_onMessageReceived = 2;
        static final int TRANSACTION_onStateChange = 1;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IRtcscDataChannelListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscDataChannelListener
            public int getAPIVersion() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscDataChannelListener.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IRtcscDataChannelListener.DESCRIPTOR;
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscDataChannelListener
            public void onMessageReceived(String str, String str2, byte[] bArr, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscDataChannelListener.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscDataChannelListener
            public void onStateChange(String str, String str2, RtcscDataChannelState rtcscDataChannelState) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscDataChannelListener.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    _Parcel.writeTypedObject(obtain, rtcscDataChannelState, 0);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IRtcscDataChannelListener.DESCRIPTOR);
        }

        public static IRtcscDataChannelListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IRtcscDataChannelListener.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IRtcscDataChannelListener)) ? new Proxy(iBinder) : (IRtcscDataChannelListener) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IRtcscDataChannelListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IRtcscDataChannelListener.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onStateChange(parcel.readString(), parcel.readString(), (RtcscDataChannelState) _Parcel.readTypedObject(parcel, RtcscDataChannelState.CREATOR));
                return true;
            }
            if (i == 2) {
                onMessageReceived(parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.readInt() != 0);
                return true;
            }
            if (i != 3) {
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
    public static class Default implements IRtcscDataChannelListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscDataChannelListener
        public int getAPIVersion() throws RemoteException {
            return 0;
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscDataChannelListener
        public void onStateChange(String str, String str2, RtcscDataChannelState rtcscDataChannelState) throws RemoteException {
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscDataChannelListener
        public void onMessageReceived(String str, String str2, byte[] bArr, boolean z) throws RemoteException {
        }
    }
}
