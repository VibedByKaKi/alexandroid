package org.chromium.android_webview.js_sandbox.common;

import android.content.res.AssetFileDescriptor;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes11.dex */
public interface IMessagePort extends IInterface {
    public static final String DESCRIPTOR = "org$chromium$android_webview$js_sandbox$common$IMessagePort".replace('$', '.');
    public static final int VERSION = 1;

    void close() throws RemoteException;

    int getInterfaceVersion() throws RemoteException;

    void sendArrayBuffer(byte[] bArr) throws RemoteException;

    void sendArrayBufferOverFd(AssetFileDescriptor assetFileDescriptor) throws RemoteException;

    void sendString(String str) throws RemoteException;

    void sendStringOverFd(AssetFileDescriptor assetFileDescriptor) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements IMessagePort {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IMessagePort
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IMessagePort
        public void close() throws RemoteException {
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IMessagePort
        public void sendArrayBuffer(byte[] bArr) throws RemoteException {
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IMessagePort
        public void sendArrayBufferOverFd(AssetFileDescriptor assetFileDescriptor) throws RemoteException {
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IMessagePort
        public void sendString(String str) throws RemoteException {
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IMessagePort
        public void sendStringOverFd(AssetFileDescriptor assetFileDescriptor) throws RemoteException {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IMessagePort {
        static final int TRANSACTION_close = 6;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_sendArrayBuffer = 4;
        static final int TRANSACTION_sendArrayBufferOverFd = 5;
        static final int TRANSACTION_sendString = 2;
        static final int TRANSACTION_sendStringOverFd = 3;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IMessagePort {
            private int mCachedVersion = -1;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // org.chromium.android_webview.js_sandbox.common.IMessagePort
            public void close() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMessagePort.DESCRIPTOR);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0)) {
                        throw new RemoteException("Method close is unimplemented.");
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IMessagePort.DESCRIPTOR;
            }

            @Override // org.chromium.android_webview.js_sandbox.common.IMessagePort
            public int getInterfaceVersion() throws RemoteException {
                if (this.mCachedVersion == -1) {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(IMessagePort.DESCRIPTOR);
                        this.mRemote.transact(16777215, obtain, obtain2, 0);
                        obtain2.readException();
                        this.mCachedVersion = obtain2.readInt();
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }
                return this.mCachedVersion;
            }

            @Override // org.chromium.android_webview.js_sandbox.common.IMessagePort
            public void sendArrayBuffer(byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMessagePort.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0)) {
                        throw new RemoteException("Method sendArrayBuffer is unimplemented.");
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.chromium.android_webview.js_sandbox.common.IMessagePort
            public void sendArrayBufferOverFd(AssetFileDescriptor assetFileDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMessagePort.DESCRIPTOR);
                    obtain.writeTypedObject(assetFileDescriptor, 0);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0)) {
                        throw new RemoteException("Method sendArrayBufferOverFd is unimplemented.");
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.chromium.android_webview.js_sandbox.common.IMessagePort
            public void sendString(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMessagePort.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0)) {
                        throw new RemoteException("Method sendString is unimplemented.");
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.chromium.android_webview.js_sandbox.common.IMessagePort
            public void sendStringOverFd(AssetFileDescriptor assetFileDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMessagePort.DESCRIPTOR);
                    obtain.writeTypedObject(assetFileDescriptor, 0);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0)) {
                        throw new RemoteException("Method sendStringOverFd is unimplemented.");
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IMessagePort.DESCRIPTOR);
        }

        public static IMessagePort asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IMessagePort.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IMessagePort)) ? new Proxy(iBinder) : (IMessagePort) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = IMessagePort.DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 16777215) {
                parcel2.writeNoException();
                parcel2.writeInt(getInterfaceVersion());
                return true;
            }
            if (i == 2) {
                sendString(parcel.readString());
                parcel2.writeNoException();
            } else if (i == 3) {
                sendStringOverFd((AssetFileDescriptor) parcel.readTypedObject(AssetFileDescriptor.CREATOR));
                parcel2.writeNoException();
            } else if (i == 4) {
                sendArrayBuffer(parcel.createByteArray());
                parcel2.writeNoException();
            } else if (i == 5) {
                sendArrayBufferOverFd((AssetFileDescriptor) parcel.readTypedObject(AssetFileDescriptor.CREATOR));
                parcel2.writeNoException();
            } else {
                if (i != 6) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                close();
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
