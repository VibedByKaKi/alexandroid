package org.chromium.android_webview.js_sandbox.common;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import java.util.List;
import org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolate;
import org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolateClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes11.dex */
public interface IJsSandboxService extends IInterface {
    public static final String CONSOLE_MESSAGING = "CONSOLE_MESSAGING";
    public static final String DESCRIPTOR = "org$chromium$android_webview$js_sandbox$common$IJsSandboxService".replace('$', '.');
    public static final String EVALUATE_FROM_FD = "EVALUATE_FROM_FD";
    public static final String EVALUATE_WITHOUT_TRANSACTION_LIMIT = "EVALUATE_WITHOUT_TRANSACTION_LIMIT";
    public static final String ISOLATE_CLIENT = "ISOLATE_CLIENT";
    public static final String ISOLATE_MAX_HEAP_SIZE_LIMIT = "ISOLATE_MAX_HEAP_SIZE_LIMIT";
    public static final String ISOLATE_TERMINATION = "ISOLATE_TERMINATION";
    public static final String MESSAGE_PORTS = "MESSAGE_PORTS";
    public static final int VERSION = 1;
    public static final String WASM_FROM_ARRAY_BUFFER = "WASM_FROM_ARRAY_BUFFER";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements IJsSandboxService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxService
        public IJsSandboxIsolate createIsolate() throws RemoteException {
            return null;
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxService
        public IJsSandboxIsolate createIsolate2(long j, IJsSandboxIsolateClient iJsSandboxIsolateClient) throws RemoteException {
            return null;
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxService
        public IJsSandboxIsolate createIsolateWithMaxHeapSizeBytes(long j) throws RemoteException {
            return null;
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxService
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxService
        public List<String> getSupportedFeatures() throws RemoteException {
            return null;
        }
    }

    IJsSandboxIsolate createIsolate() throws RemoteException;

    IJsSandboxIsolate createIsolate2(long j, IJsSandboxIsolateClient iJsSandboxIsolateClient) throws RemoteException;

    IJsSandboxIsolate createIsolateWithMaxHeapSizeBytes(long j) throws RemoteException;

    int getInterfaceVersion() throws RemoteException;

    List<String> getSupportedFeatures() throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IJsSandboxService {
        static final int TRANSACTION_createIsolate = 1;
        static final int TRANSACTION_createIsolate2 = 4;
        static final int TRANSACTION_createIsolateWithMaxHeapSizeBytes = 3;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getSupportedFeatures = 2;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IJsSandboxService {
            private int mCachedVersion = -1;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxService
            public IJsSandboxIsolate createIsolate() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IJsSandboxService.DESCRIPTOR);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0)) {
                        throw new RemoteException("Method createIsolate is unimplemented.");
                    }
                    obtain2.readException();
                    return IJsSandboxIsolate.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxService
            public IJsSandboxIsolate createIsolate2(long j, IJsSandboxIsolateClient iJsSandboxIsolateClient) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IJsSandboxService.DESCRIPTOR);
                    obtain.writeLong(j);
                    obtain.writeStrongInterface(iJsSandboxIsolateClient);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0)) {
                        throw new RemoteException("Method createIsolate2 is unimplemented.");
                    }
                    obtain2.readException();
                    return IJsSandboxIsolate.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxService
            public IJsSandboxIsolate createIsolateWithMaxHeapSizeBytes(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IJsSandboxService.DESCRIPTOR);
                    obtain.writeLong(j);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0)) {
                        throw new RemoteException("Method createIsolateWithMaxHeapSizeBytes is unimplemented.");
                    }
                    obtain2.readException();
                    return IJsSandboxIsolate.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IJsSandboxService.DESCRIPTOR;
            }

            @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxService
            public int getInterfaceVersion() throws RemoteException {
                if (this.mCachedVersion == -1) {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(IJsSandboxService.DESCRIPTOR);
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

            @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxService
            public List<String> getSupportedFeatures() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IJsSandboxService.DESCRIPTOR);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0)) {
                        throw new RemoteException("Method getSupportedFeatures is unimplemented.");
                    }
                    obtain2.readException();
                    return obtain2.createStringArrayList();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IJsSandboxService.DESCRIPTOR);
        }

        public static IJsSandboxService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IJsSandboxService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IJsSandboxService)) ? new Proxy(iBinder) : (IJsSandboxService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = IJsSandboxService.DESCRIPTOR;
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
                IJsSandboxIsolate createIsolate = createIsolate();
                parcel2.writeNoException();
                parcel2.writeStrongInterface(createIsolate);
            } else if (i == 2) {
                List<String> supportedFeatures = getSupportedFeatures();
                parcel2.writeNoException();
                parcel2.writeStringList(supportedFeatures);
            } else if (i == 3) {
                IJsSandboxIsolate createIsolateWithMaxHeapSizeBytes = createIsolateWithMaxHeapSizeBytes(parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeStrongInterface(createIsolateWithMaxHeapSizeBytes);
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                IJsSandboxIsolate createIsolate2 = createIsolate2(parcel.readLong(), IJsSandboxIsolateClient.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeStrongInterface(createIsolate2);
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
