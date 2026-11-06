package androidx.javascriptengine.common;

import android.content.res.AssetFileDescriptor;
import android.os.Binder;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.chromium.android_webview.js_sandbox.common.IMessagePort;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class MessagePortInternal {
    private static final int MAX_BINDER_ARRAY_BUFFER_SIZE = 65535;
    private static final int MAX_BINDER_STRING_LENGTH = 32767;
    public IBinder.DeathRecipient mDeathRecipient;
    public final ExecutorService mIoExecutor;
    public final MessagePortIpcClient mLocalIMessagePort;
    private final int mMaxMessageSize;
    public MessagePortClient mMessagePortClient;
    public final AtomicReference<IMessagePort> mRemoteIMessagePort;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface MessagePortClient {
        void onArrayBuffer(byte[] bArr);

        void onString(String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class MessagePortIpcClient extends IMessagePort.Stub {
        public MessagePortIpcClient() {
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IMessagePort
        public void close() {
            MessagePortInternal.this.closeLocally();
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IMessagePort
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IMessagePort
        public void sendArrayBuffer(byte[] bArr) {
            Objects.requireNonNull(bArr);
            if (MessagePortInternal.this.mRemoteIMessagePort.get() == null) {
                return;
            }
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                MessagePortInternal.this.mMessagePortClient.onArrayBuffer(bArr);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IMessagePort
        public void sendArrayBufferOverFd(AssetFileDescriptor assetFileDescriptor) {
            Objects.requireNonNull(assetFileDescriptor);
            try {
                long length = assetFileDescriptor.getLength();
                if (length < 0) {
                    throw new IllegalArgumentException("arrayBuffer has invalid length: " + length);
                }
                if (length > MessagePortInternal.this.mMaxMessageSize) {
                    throw new IllegalArgumentException("arrayBuffer is too large: " + length);
                }
                if (MessagePortInternal.this.mRemoteIMessagePort.get() == null) {
                    return;
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        FileInputStream createInputStream = assetFileDescriptor.createInputStream();
                        int i = (int) length;
                        try {
                            byte[] bArr = new byte[i];
                            int readNBytes = Utils.readNBytes(createInputStream, bArr, 0, i);
                            if (readNBytes == i) {
                                MessagePortInternal.this.mMessagePortClient.onArrayBuffer(bArr);
                                if (createInputStream != null) {
                                    createInputStream.close();
                                }
                            } else {
                                throw new EOFException("Incomplete data read from file descriptor. Expected " + i + " bytes, but got " + readNBytes);
                            }
                        } catch (Throwable th) {
                            if (createInputStream != null) {
                                try {
                                    createInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            } finally {
                Utils.closeQuietly(assetFileDescriptor);
            }
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IMessagePort
        public void sendString(String str) {
            Objects.requireNonNull(str);
            if (MessagePortInternal.this.mRemoteIMessagePort.get() == null) {
                return;
            }
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                MessagePortInternal.this.mMessagePortClient.onString(str);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IMessagePort
        public void sendStringOverFd(AssetFileDescriptor assetFileDescriptor) {
            Objects.requireNonNull(assetFileDescriptor);
            try {
                long length = assetFileDescriptor.getLength();
                if (length < 0) {
                    throw new IllegalArgumentException("string has invalid length: " + length);
                }
                if (length > MessagePortInternal.this.mMaxMessageSize) {
                    throw new IllegalArgumentException("string is too large: " + length);
                }
                if (MessagePortInternal.this.mRemoteIMessagePort.get() == null) {
                    return;
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        FileInputStream createInputStream = assetFileDescriptor.createInputStream();
                        int i = (int) length;
                        try {
                            byte[] bArr = new byte[i];
                            int readNBytes = Utils.readNBytes(createInputStream, bArr, 0, i);
                            if (readNBytes == i) {
                                MessagePortInternal.this.mMessagePortClient.onString(new String(bArr, StandardCharsets.UTF_8));
                                if (createInputStream != null) {
                                    createInputStream.close();
                                }
                                return;
                            }
                            throw new EOFException("Incomplete data read from file descriptor. Expected " + i + " bytes, but got " + readNBytes);
                        } catch (Throwable th) {
                            if (createInputStream != null) {
                                try {
                                    createInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            } finally {
                Utils.closeQuietly(assetFileDescriptor);
            }
        }
    }

    public MessagePortInternal() {
        this.mRemoteIMessagePort = new AtomicReference<>(null);
        this.mLocalIMessagePort = new MessagePortIpcClient();
        this.mIoExecutor = MoreExecutors.newDirectExecutorService();
        this.mMessagePortClient = new MessagePortClient() { // from class: androidx.javascriptengine.common.MessagePortInternal.2
            @Override // androidx.javascriptengine.common.MessagePortInternal.MessagePortClient
            public void onArrayBuffer(byte[] bArr) {
            }

            @Override // androidx.javascriptengine.common.MessagePortInternal.MessagePortClient
            public void onString(String str) {
            }
        };
        this.mMaxMessageSize = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeLocally() {
        this.mRemoteIMessagePort.set(null);
    }

    public void close() {
        IMessagePort andSet = this.mRemoteIMessagePort.getAndSet(null);
        if (andSet == null) {
            return;
        }
        closeLocally();
        try {
            andSet.close();
        } catch (DeadObjectException unused) {
        } catch (RemoteException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
        }
    }

    public IMessagePort getLocalIMessagePort() {
        return this.mLocalIMessagePort;
    }

    public void postArrayBuffer(byte[] bArr) {
        IMessagePort iMessagePort = this.mRemoteIMessagePort.get();
        if (iMessagePort == null) {
            return;
        }
        try {
            if (bArr.length <= 65535) {
                iMessagePort.sendArrayBuffer(bArr);
                return;
            }
            try {
                AssetFileDescriptor writeBytesIntoPipeAsync = Utils.writeBytesIntoPipeAsync(bArr, this.mIoExecutor);
                try {
                    iMessagePort.sendArrayBufferOverFd(writeBytesIntoPipeAsync);
                    if (writeBytesIntoPipeAsync != null) {
                        writeBytesIntoPipeAsync.close();
                    }
                } catch (Throwable th) {
                    if (writeBytesIntoPipeAsync != null) {
                        try {
                            writeBytesIntoPipeAsync.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (DeadObjectException unused) {
        } catch (RemoteException e2) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e2);
        } catch (RejectedExecutionException unused2) {
            closeLocally();
        }
    }

    public void postString(String str) {
        IMessagePort iMessagePort = this.mRemoteIMessagePort.get();
        if (iMessagePort == null) {
            return;
        }
        try {
            if (str.length() <= 32767) {
                iMessagePort.sendString(str);
                return;
            }
            try {
                AssetFileDescriptor writeBytesIntoPipeAsync = Utils.writeBytesIntoPipeAsync(str.getBytes(StandardCharsets.UTF_8), this.mIoExecutor);
                try {
                    iMessagePort.sendStringOverFd(writeBytesIntoPipeAsync);
                    if (writeBytesIntoPipeAsync != null) {
                        writeBytesIntoPipeAsync.close();
                    }
                } catch (Throwable th) {
                    if (writeBytesIntoPipeAsync != null) {
                        try {
                            writeBytesIntoPipeAsync.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (DeadObjectException unused) {
        } catch (RemoteException e2) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e2);
        } catch (RejectedExecutionException unused2) {
            closeLocally();
        }
    }

    public void setClient(MessagePortClient messagePortClient) {
        this.mMessagePortClient = messagePortClient;
    }

    public void setRemoteIMessagePort(IMessagePort iMessagePort) {
        this.mRemoteIMessagePort.set(iMessagePort);
        this.mDeathRecipient = new IBinder.DeathRecipient() { // from class: androidx.javascriptengine.common.MessagePortInternal.3
            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                MessagePortInternal.this.closeLocally();
            }
        };
        try {
            iMessagePort.asBinder().linkToDeath(this.mDeathRecipient, 0);
        } catch (RemoteException unused) {
            closeLocally();
        }
    }

    public MessagePortInternal(ExecutorService executorService, int i) {
        this.mRemoteIMessagePort = new AtomicReference<>(null);
        this.mLocalIMessagePort = new MessagePortIpcClient();
        this.mIoExecutor = executorService;
        this.mMessagePortClient = new MessagePortClient() { // from class: androidx.javascriptengine.common.MessagePortInternal.1
            @Override // androidx.javascriptengine.common.MessagePortInternal.MessagePortClient
            public void onArrayBuffer(byte[] bArr) {
            }

            @Override // androidx.javascriptengine.common.MessagePortInternal.MessagePortClient
            public void onString(String str) {
            }
        };
        this.mMaxMessageSize = i;
    }
}
