package org.chromium.android_webview.js_sandbox.common;

import android.content.res.AssetFileDescriptor;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import org.chromium.android_webview.js_sandbox.common.IJsSandboxConsoleCallback;
import org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolateCallback;
import org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolateSyncCallback;
import org.chromium.android_webview.js_sandbox.common.IMessagePort;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes11.dex */
public interface IJsSandboxIsolate extends IInterface {
    public static final String DESCRIPTOR = "org$chromium$android_webview$js_sandbox$common$IJsSandboxIsolate".replace('$', '.');
    public static final int VERSION = 1;

    void close() throws RemoteException;

    void evaluateJavascript(String str, IJsSandboxIsolateCallback iJsSandboxIsolateCallback) throws RemoteException;

    void evaluateJavascriptWithFd(AssetFileDescriptor assetFileDescriptor, IJsSandboxIsolateSyncCallback iJsSandboxIsolateSyncCallback) throws RemoteException;

    int getInterfaceVersion() throws RemoteException;

    IMessagePort provideMessagePort(String str, IMessagePort iMessagePort) throws RemoteException;

    boolean provideNamedData(String str, AssetFileDescriptor assetFileDescriptor) throws RemoteException;

    void setConsoleCallback(IJsSandboxConsoleCallback iJsSandboxConsoleCallback) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements IJsSandboxIsolate {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolate
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolate
        public IMessagePort provideMessagePort(String str, IMessagePort iMessagePort) throws RemoteException {
            return null;
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolate
        public boolean provideNamedData(String str, AssetFileDescriptor assetFileDescriptor) throws RemoteException {
            return false;
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolate
        public void close() throws RemoteException {
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolate
        public void setConsoleCallback(IJsSandboxConsoleCallback iJsSandboxConsoleCallback) throws RemoteException {
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolate
        public void evaluateJavascript(String str, IJsSandboxIsolateCallback iJsSandboxIsolateCallback) throws RemoteException {
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolate
        public void evaluateJavascriptWithFd(AssetFileDescriptor assetFileDescriptor, IJsSandboxIsolateSyncCallback iJsSandboxIsolateSyncCallback) throws RemoteException {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IJsSandboxIsolate {
        static final int TRANSACTION_close = 2;
        static final int TRANSACTION_evaluateJavascript = 1;
        static final int TRANSACTION_evaluateJavascriptWithFd = 4;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_provideMessagePort = 6;
        static final int TRANSACTION_provideNamedData = 3;
        static final int TRANSACTION_setConsoleCallback = 5;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IJsSandboxIsolate {
            private int mCachedVersion = -1;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolate
            public void close() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IJsSandboxIsolate.DESCRIPTOR);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0)) {
                        throw new RemoteException("Method close is unimplemented.");
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolate
            public void evaluateJavascript(String str, IJsSandboxIsolateCallback iJsSandboxIsolateCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IJsSandboxIsolate.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(iJsSandboxIsolateCallback);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0)) {
                        throw new RemoteException("Method evaluateJavascript is unimplemented.");
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolate
            public void evaluateJavascriptWithFd(AssetFileDescriptor assetFileDescriptor, IJsSandboxIsolateSyncCallback iJsSandboxIsolateSyncCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IJsSandboxIsolate.DESCRIPTOR);
                    obtain.writeTypedObject(assetFileDescriptor, 0);
                    obtain.writeStrongInterface(iJsSandboxIsolateSyncCallback);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0)) {
                        throw new RemoteException("Method evaluateJavascriptWithFd is unimplemented.");
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IJsSandboxIsolate.DESCRIPTOR;
            }

            @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolate
            public int getInterfaceVersion() throws RemoteException {
                if (this.mCachedVersion == -1) {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(IJsSandboxIsolate.DESCRIPTOR);
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

            @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolate
            public IMessagePort provideMessagePort(String str, IMessagePort iMessagePort) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IJsSandboxIsolate.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(iMessagePort);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0)) {
                        throw new RemoteException("Method provideMessagePort is unimplemented.");
                    }
                    obtain2.readException();
                    return IMessagePort.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolate
            public boolean provideNamedData(String str, AssetFileDescriptor assetFileDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IJsSandboxIsolate.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeTypedObject(assetFileDescriptor, 0);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0)) {
                        throw new RemoteException("Method provideNamedData is unimplemented.");
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolate
            public void setConsoleCallback(IJsSandboxConsoleCallback iJsSandboxConsoleCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IJsSandboxIsolate.DESCRIPTOR);
                    obtain.writeStrongInterface(iJsSandboxConsoleCallback);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0)) {
                        throw new RemoteException("Method setConsoleCallback is unimplemented.");
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IJsSandboxIsolate.DESCRIPTOR);
        }

        public static IJsSandboxIsolate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IJsSandboxIsolate.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IJsSandboxIsolate)) ? new Proxy(iBinder) : (IJsSandboxIsolate) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = IJsSandboxIsolate.DESCRIPTOR;
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
            switch (i) {
                case 1:
                    evaluateJavascript(parcel.readString(), IJsSandboxIsolateCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    close();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    boolean provideNamedData = provideNamedData(parcel.readString(), (AssetFileDescriptor) parcel.readTypedObject(AssetFileDescriptor.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(provideNamedData ? 1 : 0);
                    return true;
                case 4:
                    evaluateJavascriptWithFd((AssetFileDescriptor) parcel.readTypedObject(AssetFileDescriptor.CREATOR), IJsSandboxIsolateSyncCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    setConsoleCallback(IJsSandboxConsoleCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    IMessagePort provideMessagePort = provideMessagePort(parcel.readString(), IMessagePort.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongInterface(provideMessagePort);
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
