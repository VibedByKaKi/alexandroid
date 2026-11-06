package org.chromium.android_webview.js_sandbox.common;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes11.dex */
public interface IJsSandboxIsolateCallback extends IInterface {
    public static final String DESCRIPTOR = "org$chromium$android_webview$js_sandbox$common$IJsSandboxIsolateCallback".replace('$', '.');
    public static final int JS_EVALUATION_ERROR = 0;
    public static final int MEMORY_LIMIT_EXCEEDED = 1;
    public static final int VERSION = 1;

    int getInterfaceVersion() throws RemoteException;

    void reportError(int i, String str) throws RemoteException;

    void reportResult(String str) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IJsSandboxIsolateCallback {
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_reportError = 2;
        static final int TRANSACTION_reportResult = 1;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IJsSandboxIsolateCallback {
            private int mCachedVersion = -1;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IJsSandboxIsolateCallback.DESCRIPTOR;
            }

            @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolateCallback
            public int getInterfaceVersion() throws RemoteException {
                if (this.mCachedVersion == -1) {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(IJsSandboxIsolateCallback.DESCRIPTOR);
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

            @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolateCallback
            public void reportError(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IJsSandboxIsolateCallback.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (this.mRemote.transact(2, obtain, null, 1)) {
                    } else {
                        throw new RemoteException("Method reportError is unimplemented.");
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolateCallback
            public void reportResult(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IJsSandboxIsolateCallback.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.mRemote.transact(1, obtain, null, 1)) {
                    } else {
                        throw new RemoteException("Method reportResult is unimplemented.");
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IJsSandboxIsolateCallback.DESCRIPTOR);
        }

        public static IJsSandboxIsolateCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IJsSandboxIsolateCallback.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IJsSandboxIsolateCallback)) ? new Proxy(iBinder) : (IJsSandboxIsolateCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = IJsSandboxIsolateCallback.DESCRIPTOR;
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
            if (i == 1) {
                reportResult(parcel.readString());
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                reportError(parcel.readInt(), parcel.readString());
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements IJsSandboxIsolateCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolateCallback
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolateCallback
        public void reportResult(String str) throws RemoteException {
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolateCallback
        public void reportError(int i, String str) throws RemoteException {
        }
    }
}
