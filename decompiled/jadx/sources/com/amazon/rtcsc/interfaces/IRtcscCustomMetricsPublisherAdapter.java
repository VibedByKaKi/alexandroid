package com.amazon.rtcsc.interfaces;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IRtcscCustomMetricsPublisherAdapter extends IInterface {
    public static final int API_VERSION = 1;
    public static final String DESCRIPTOR = "com.amazon.rtcsc.interfaces.IRtcscCustomMetricsPublisherAdapter";

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

    void recordMetric(RtcscCustomMetric rtcscCustomMetric) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IRtcscCustomMetricsPublisherAdapter {
        static final int TRANSACTION_getAPIVersion = 3;
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_recordMetric = 1;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IRtcscCustomMetricsPublisherAdapter {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscCustomMetricsPublisherAdapter
            public int getAPIVersion() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscCustomMetricsPublisherAdapter.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IRtcscCustomMetricsPublisherAdapter.DESCRIPTOR;
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscCustomMetricsPublisherAdapter
            public void onError(RtcscErrorCode rtcscErrorCode) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscCustomMetricsPublisherAdapter.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, rtcscErrorCode, 0);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscCustomMetricsPublisherAdapter
            public void recordMetric(RtcscCustomMetric rtcscCustomMetric) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscCustomMetricsPublisherAdapter.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, rtcscCustomMetric, 0);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IRtcscCustomMetricsPublisherAdapter.DESCRIPTOR);
        }

        public static IRtcscCustomMetricsPublisherAdapter asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IRtcscCustomMetricsPublisherAdapter.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IRtcscCustomMetricsPublisherAdapter)) ? new Proxy(iBinder) : (IRtcscCustomMetricsPublisherAdapter) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IRtcscCustomMetricsPublisherAdapter.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IRtcscCustomMetricsPublisherAdapter.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                recordMetric((RtcscCustomMetric) _Parcel.readTypedObject(parcel, RtcscCustomMetric.CREATOR));
            } else if (i == 2) {
                onError((RtcscErrorCode) _Parcel.readTypedObject(parcel, RtcscErrorCode.CREATOR));
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                int aPIVersion = getAPIVersion();
                parcel2.writeNoException();
                parcel2.writeInt(aPIVersion);
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements IRtcscCustomMetricsPublisherAdapter {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscCustomMetricsPublisherAdapter
        public int getAPIVersion() throws RemoteException {
            return 0;
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscCustomMetricsPublisherAdapter
        public void onError(RtcscErrorCode rtcscErrorCode) throws RemoteException {
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscCustomMetricsPublisherAdapter
        public void recordMetric(RtcscCustomMetric rtcscCustomMetric) throws RemoteException {
        }
    }
}
