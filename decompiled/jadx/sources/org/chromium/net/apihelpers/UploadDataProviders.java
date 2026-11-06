package org.chromium.net.apihelpers;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class UploadDataProviders {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface FileChannelProvider {
        FileChannel getChannel() throws IOException;
    }

    private UploadDataProviders() {
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new ByteBufferUploadProvider(ByteBuffer.wrap(bArr, i, i2).slice(), 0);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ByteBufferUploadProvider extends UploadDataProvider {
        private final ByteBuffer mUploadBuffer;

        private ByteBufferUploadProvider(ByteBuffer byteBuffer) {
            this.mUploadBuffer = byteBuffer;
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return this.mUploadBuffer.limit();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (!byteBuffer.hasRemaining()) {
                Single$$ExternalSyntheticBUOutline0.m$2("Cronet passed a buffer with no bytes remaining");
                return;
            }
            int remaining = byteBuffer.remaining();
            int remaining2 = this.mUploadBuffer.remaining();
            ByteBuffer byteBuffer2 = this.mUploadBuffer;
            if (remaining >= remaining2) {
                byteBuffer.put(byteBuffer2);
            } else {
                int limit = byteBuffer2.limit();
                ByteBuffer byteBuffer3 = this.mUploadBuffer;
                byteBuffer3.limit(byteBuffer.remaining() + byteBuffer3.position());
                byteBuffer.put(this.mUploadBuffer);
                this.mUploadBuffer.limit(limit);
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            this.mUploadBuffer.position(0);
            uploadDataSink.onRewindSucceeded();
        }

        public /* synthetic */ ByteBufferUploadProvider(ByteBuffer byteBuffer, int i) {
            this(byteBuffer);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class FileUploadProvider extends UploadDataProvider {
        private volatile FileChannel mChannel;
        private final Object mLock;
        private final FileChannelProvider mProvider;

        private FileUploadProvider(FileChannelProvider fileChannelProvider) {
            this.mLock = new Object();
            this.mProvider = fileChannelProvider;
        }

        private FileChannel getChannel() throws IOException {
            if (this.mChannel == null) {
                synchronized (this.mLock) {
                    try {
                        if (this.mChannel == null) {
                            this.mChannel = this.mProvider.getChannel();
                        }
                    } finally {
                    }
                }
            }
            return this.mChannel;
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            FileChannel fileChannel = this.mChannel;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() throws IOException {
            return getChannel().size();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
            if (!byteBuffer.hasRemaining()) {
                Single$$ExternalSyntheticBUOutline0.m$2("Cronet passed a buffer with no bytes remaining");
                return;
            }
            FileChannel channel = getChannel();
            int i = 0;
            while (i == 0) {
                int read = channel.read(byteBuffer);
                if (read == -1) {
                    break;
                } else {
                    i += read;
                }
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) throws IOException {
            getChannel().position(0L);
            uploadDataSink.onRewindSucceeded();
        }

        public /* synthetic */ FileUploadProvider(FileChannelProvider fileChannelProvider, int i) {
            this(fileChannelProvider);
        }
    }

    public static UploadDataProvider create(final ParcelFileDescriptor parcelFileDescriptor) {
        return new FileUploadProvider(new FileChannelProvider() { // from class: org.chromium.net.apihelpers.UploadDataProviders.2
            @Override // org.chromium.net.apihelpers.UploadDataProviders.FileChannelProvider
            public FileChannel getChannel() throws IOException {
                if (parcelFileDescriptor.getStatSize() != -1) {
                    return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
                }
                parcelFileDescriptor.close();
                Buffer$$ExternalSyntheticBUOutline0.m$3(parcelFileDescriptor, "Not a file: ");
                return null;
            }
        }, 0);
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new ByteBufferUploadProvider(byteBuffer.slice(), 0);
    }

    public static UploadDataProvider create(final File file) {
        return new FileUploadProvider(new FileChannelProvider() { // from class: org.chromium.net.apihelpers.UploadDataProviders.1
            @Override // org.chromium.net.apihelpers.UploadDataProviders.FileChannelProvider
            public FileChannel getChannel() throws IOException {
                return new FileInputStream(file).getChannel();
            }
        }, 0);
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }
}
