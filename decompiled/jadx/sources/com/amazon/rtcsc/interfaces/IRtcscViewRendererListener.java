package com.amazon.rtcsc.interfaces;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IRtcscViewRendererListener extends IInterface {
    public static final int API_VERSION = 1;
    public static final String DESCRIPTOR = "com.amazon.rtcsc.interfaces.IRtcscViewRendererListener";

    int getAPIVersion() throws RemoteException;

    int onGetHeight() throws RemoteException;

    int onGetWidth() throws RemoteException;

    void onHolderSetFixedSize(int i, int i2) throws RemoteException;

    void onHolderSetSizeFromLayout() throws RemoteException;

    void onMeasuredDimension(int i, int i2) throws RemoteException;

    void onRequestLayout() throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements IRtcscViewRendererListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscViewRendererListener
        public int getAPIVersion() throws RemoteException {
            return 0;
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscViewRendererListener
        public int onGetHeight() throws RemoteException {
            return 0;
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscViewRendererListener
        public int onGetWidth() throws RemoteException {
            return 0;
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscViewRendererListener
        public void onHolderSetSizeFromLayout() throws RemoteException {
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscViewRendererListener
        public void onRequestLayout() throws RemoteException {
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscViewRendererListener
        public void onHolderSetFixedSize(int i, int i2) throws RemoteException {
        }

        @Override // com.amazon.rtcsc.interfaces.IRtcscViewRendererListener
        public void onMeasuredDimension(int i, int i2) throws RemoteException {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IRtcscViewRendererListener {
        static final int TRANSACTION_getAPIVersion = 7;
        static final int TRANSACTION_onGetHeight = 6;
        static final int TRANSACTION_onGetWidth = 5;
        static final int TRANSACTION_onHolderSetFixedSize = 2;
        static final int TRANSACTION_onHolderSetSizeFromLayout = 1;
        static final int TRANSACTION_onMeasuredDimension = 4;
        static final int TRANSACTION_onRequestLayout = 3;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IRtcscViewRendererListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscViewRendererListener
            public int getAPIVersion() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscViewRendererListener.DESCRIPTOR);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IRtcscViewRendererListener.DESCRIPTOR;
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscViewRendererListener
            public int onGetHeight() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscViewRendererListener.DESCRIPTOR);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscViewRendererListener
            public int onGetWidth() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscViewRendererListener.DESCRIPTOR);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscViewRendererListener
            public void onHolderSetFixedSize(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscViewRendererListener.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscViewRendererListener
            public void onHolderSetSizeFromLayout() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscViewRendererListener.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscViewRendererListener
            public void onMeasuredDimension(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscViewRendererListener.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtcsc.interfaces.IRtcscViewRendererListener
            public void onRequestLayout() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRtcscViewRendererListener.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IRtcscViewRendererListener.DESCRIPTOR);
        }

        public static IRtcscViewRendererListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IRtcscViewRendererListener.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IRtcscViewRendererListener)) ? new Proxy(iBinder) : (IRtcscViewRendererListener) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IRtcscViewRendererListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IRtcscViewRendererListener.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    onHolderSetSizeFromLayout();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    onHolderSetFixedSize(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    onRequestLayout();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    onMeasuredDimension(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    int onGetWidth = onGetWidth();
                    parcel2.writeNoException();
                    parcel2.writeInt(onGetWidth);
                    return true;
                case 6:
                    int onGetHeight = onGetHeight();
                    parcel2.writeNoException();
                    parcel2.writeInt(onGetHeight);
                    return true;
                case 7:
                    int aPIVersion = getAPIVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(aPIVersion);
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
