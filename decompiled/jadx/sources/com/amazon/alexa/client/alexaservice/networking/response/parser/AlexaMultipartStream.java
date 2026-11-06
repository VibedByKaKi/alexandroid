package com.amazon.alexa.client.alexaservice.networking.response.parser;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.SocketTimeoutException;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.MultipartStream;
import org.apache.commons.fileupload.ProgressListener;
import org.apache.commons.fileupload.util.Closeable;
import org.apache.commons.fileupload.util.Streams;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlexaMultipartStream {
    public static final byte CR = 13;
    public static final byte DASH = 45;
    protected static final int DEFAULT_BUFSIZE = 4096;
    public static final int HEADER_PART_SIZE_MAX = 10240;
    public static final byte LF = 10;
    private final byte[] boundary;
    private int boundaryLength;
    private final int[] boundaryTable;
    private final int bufSize;
    private final byte[] buffer;
    private int head;
    private String headerEncoding;
    private final InputStream input;
    private final int keepRegion;
    private final ProgressNotifier notifier;
    private int tail;
    protected static final byte[] HEADER_SEPARATOR = {13, 10, 13, 10};
    protected static final byte[] FIELD_SEPARATOR = {13, 10};
    protected static final byte[] STREAM_TERMINATOR = {45, 45};
    protected static final byte[] BOUNDARY_PREFIX = {13, 10, 45, 45};
    private static final String TAG = "AlexaMultipartStream";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ProgressNotifier {
        private long bytesRead;
        private final long contentLength;
        private int items;
        private final ProgressListener listener;

        public ProgressNotifier(ProgressListener progressListener, long j) {
            this.listener = progressListener;
            this.contentLength = j;
        }

        private void notifyListener() {
            ProgressListener progressListener = this.listener;
            if (progressListener != null) {
                progressListener.update(this.bytesRead, this.contentLength, this.items);
            }
        }

        public void noteBytesRead(int i) {
            this.bytesRead += i;
            notifyListener();
        }

        public void noteItem() {
            this.items++;
            notifyListener();
        }
    }

    public AlexaMultipartStream(InputStream inputStream, byte[] bArr, int i, ProgressNotifier progressNotifier) {
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("boundary may not be null");
            throw null;
        }
        int length = bArr.length;
        byte[] bArr2 = BOUNDARY_PREFIX;
        int length2 = length + bArr2.length;
        this.boundaryLength = length2;
        if (i < length2 + 1) {
            Single$$ExternalSyntheticBUOutline0.m$3("The buffer size specified for the AlexaMultipartStream is too small");
            throw null;
        }
        this.input = inputStream;
        int max = Math.max(i, length2 * 2);
        this.bufSize = max;
        this.buffer = new byte[max];
        this.notifier = progressNotifier;
        int i2 = this.boundaryLength;
        byte[] bArr3 = new byte[i2];
        this.boundary = bArr3;
        this.boundaryTable = new int[i2 + 1];
        this.keepRegion = bArr3.length;
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, 0, bArr3, bArr2.length, bArr.length);
        computeBoundaryTable();
        this.head = 0;
        this.tail = 0;
    }

    public static boolean arrayequals(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private void computeBoundaryTable() {
        int[] iArr = this.boundaryTable;
        iArr[0] = -1;
        iArr[1] = 0;
        int i = 2;
        int i2 = 0;
        while (i <= this.boundaryLength) {
            byte[] bArr = this.boundary;
            if (bArr[i - 1] == bArr[i2]) {
                i2++;
                this.boundaryTable[i] = i2;
            } else {
                int[] iArr2 = this.boundaryTable;
                if (i2 > 0) {
                    i2 = iArr2[i2];
                } else {
                    iArr2[i] = 0;
                }
            }
            i++;
        }
    }

    public int discardBodyData() throws MalformedStreamException, IOException {
        return readBodyData(null);
    }

    public int findByte(byte b, int i) {
        while (i < this.tail) {
            if (this.buffer[i] == b) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int findSeparator() {
        int i = this.head;
        int i2 = 0;
        while (i < this.tail) {
            while (i2 >= 0 && this.buffer[i] != this.boundary[i2]) {
                i2 = this.boundaryTable[i2];
            }
            i++;
            i2++;
            int i3 = this.boundaryLength;
            if (i2 == i3) {
                return i - i3;
            }
        }
        return -1;
    }

    public String getHeaderEncoding() {
        return this.headerEncoding;
    }

    public ItemInputStream newInputStream() {
        return new ItemInputStream();
    }

    public int readBodyData(OutputStream outputStream) throws MalformedStreamException, IOException {
        return (int) Streams.copy(newInputStream(), outputStream, false);
    }

    public boolean readBoundary() throws FileUploadBase.FileUploadIOException, SocketTimeoutException, MultipartStream.MalformedStreamException {
        byte[] bArr = new byte[2];
        this.head += this.boundaryLength;
        try {
            byte readByte = readByte();
            bArr[0] = readByte;
            if (readByte == 10) {
                return true;
            }
            bArr[1] = readByte();
            if (arrayequals(bArr, STREAM_TERMINATOR, 2)) {
                return false;
            }
            if (arrayequals(bArr, FIELD_SEPARATOR, 2)) {
                return true;
            }
            throw new MalformedStreamException("Unexpected characters follow a boundary");
        } catch (SocketTimeoutException unused) {
            throw new SocketTimeoutException("Stream read timed out");
        } catch (FileUploadBase.FileUploadIOException e) {
            throw e;
        } catch (IOException unused2) {
            throw new MultipartStream.MalformedStreamException("Stream ended unexpectedly");
        }
    }

    public byte readByte() throws IOException {
        if (this.head == this.tail) {
            this.head = 0;
            int read = this.input.read(this.buffer, 0, this.bufSize);
            this.tail = read;
            if (read == -1) {
                Buffer$$ExternalSyntheticBUOutline0.m$2("No more data is available");
                return (byte) 0;
            }
            ProgressNotifier progressNotifier = this.notifier;
            if (progressNotifier != null) {
                progressNotifier.noteBytesRead(read);
            }
        }
        byte[] bArr = this.buffer;
        int i = this.head;
        this.head = i + 1;
        return bArr[i];
    }

    public String readHeaders() throws FileUploadBase.FileUploadIOException, MalformedStreamException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = HEADER_SEPARATOR;
            if (i >= bArr.length) {
                String str = this.headerEncoding;
                if (str == null) {
                    return byteArrayOutputStream.toString();
                }
                try {
                    return byteArrayOutputStream.toString(str);
                } catch (UnsupportedEncodingException unused) {
                    return byteArrayOutputStream.toString();
                }
            }
            try {
                byte readByte = readByte();
                i2++;
                if (i2 > 10240) {
                    throw new MalformedStreamException("Header section has more than 10240 bytes (maybe it is not properly terminated)");
                }
                i = readByte == bArr[i] ? i + 1 : 0;
                byteArrayOutputStream.write(readByte);
            } catch (FileUploadBase.FileUploadIOException e) {
                throw e;
            } catch (IOException unused2) {
                throw new MalformedStreamException("Stream ended unexpectedly");
            }
        }
    }

    public void setBoundary(byte[] bArr) throws IllegalBoundaryException {
        int length = bArr.length;
        int i = this.boundaryLength;
        byte[] bArr2 = BOUNDARY_PREFIX;
        if (length != i - bArr2.length) {
            throw new IllegalBoundaryException("The length of a boundary token cannot be changed");
        }
        System.arraycopy(bArr, 0, this.boundary, bArr2.length, bArr.length);
        computeBoundaryTable();
    }

    public void setHeaderEncoding(String str) {
        this.headerEncoding = str;
    }

    public boolean skipPreamble() throws IOException {
        byte[] bArr = this.boundary;
        System.arraycopy(bArr, 2, bArr, 0, bArr.length - 2);
        this.boundaryLength = this.boundary.length - 2;
        computeBoundaryTable();
        try {
            discardBodyData();
            return readBoundary();
        } catch (MalformedStreamException unused) {
            return false;
        } finally {
            byte[] bArr2 = this.boundary;
            System.arraycopy(bArr2, 0, bArr2, 2, bArr2.length - 2);
            byte[] bArr3 = this.boundary;
            this.boundaryLength = bArr3.length;
            bArr3[0] = 13;
            bArr3[1] = 10;
            computeBoundaryTable();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class IllegalBoundaryException extends IOException {
        private static final long serialVersionUID = -161533165102632918L;

        public IllegalBoundaryException() {
        }

        public IllegalBoundaryException(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MalformedStreamException extends IOException {
        private static final long serialVersionUID = 6466926458059796677L;

        public MalformedStreamException() {
        }

        public MalformedStreamException(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class ItemInputStream extends InputStream implements Closeable {
        private static final int BYTE_POSITIVE_OFFSET = 256;
        private boolean closed;
        private int pad;
        private int pos;
        private long total;

        public ItemInputStream() {
            findSeparator();
        }

        private void findSeparator() {
            int findSeparator = AlexaMultipartStream.this.findSeparator();
            this.pos = findSeparator;
            if (findSeparator == -1) {
                int i = AlexaMultipartStream.this.tail - AlexaMultipartStream.this.head;
                int i2 = AlexaMultipartStream.this.keepRegion;
                AlexaMultipartStream alexaMultipartStream = AlexaMultipartStream.this;
                if (i > i2) {
                    this.pad = alexaMultipartStream.keepRegion;
                } else {
                    this.pad = alexaMultipartStream.tail - AlexaMultipartStream.this.head;
                }
            }
        }

        private int makeAvailable() throws IOException {
            int available;
            if (this.pos != -1) {
                return 0;
            }
            this.total += (AlexaMultipartStream.this.tail - AlexaMultipartStream.this.head) - this.pad;
            System.arraycopy(AlexaMultipartStream.this.buffer, AlexaMultipartStream.this.tail - this.pad, AlexaMultipartStream.this.buffer, 0, this.pad);
            AlexaMultipartStream.this.head = 0;
            AlexaMultipartStream.this.tail = this.pad;
            do {
                int read = AlexaMultipartStream.this.input.read(AlexaMultipartStream.this.buffer, AlexaMultipartStream.this.tail, AlexaMultipartStream.this.bufSize - AlexaMultipartStream.this.tail);
                if (read == -1) {
                    throw new MalformedStreamException("Stream ended unexpectedly");
                }
                if (AlexaMultipartStream.this.notifier != null) {
                    AlexaMultipartStream.this.notifier.noteBytesRead(read);
                }
                AlexaMultipartStream.this.tail += read;
                findSeparator();
                available = available();
                if (available > 0) {
                    break;
                }
            } while (this.pos == -1);
            return available;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            int i;
            int i2 = this.pos;
            AlexaMultipartStream alexaMultipartStream = AlexaMultipartStream.this;
            if (i2 == -1) {
                i2 = alexaMultipartStream.tail - AlexaMultipartStream.this.head;
                i = this.pad;
            } else {
                i = alexaMultipartStream.head;
            }
            return i2 - i;
        }

        public void close(boolean z) throws IOException {
            if (this.closed) {
                return;
            }
            if (!z) {
                while (true) {
                    int available = available();
                    if (available == 0 && (available = makeAvailable()) == 0) {
                        break;
                    } else {
                        skip(available);
                    }
                }
            } else {
                this.closed = true;
                AlexaMultipartStream.this.input.close();
            }
            this.closed = true;
        }

        public long getBytesRead() {
            return this.total;
        }

        @Override // org.apache.commons.fileupload.util.Closeable
        public boolean isClosed() {
            return this.closed;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (this.closed) {
                throw new FileItemStream.ItemSkippedException();
            }
            if (i2 == 0) {
                return 0;
            }
            int available = available();
            if (available == 0 && (available = makeAvailable()) == 0) {
                return -1;
            }
            int min = Math.min(available, i2);
            System.arraycopy(AlexaMultipartStream.this.buffer, AlexaMultipartStream.this.head, bArr, i, min);
            AlexaMultipartStream.this.head += min;
            this.total += min;
            return min;
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            if (this.closed) {
                throw new FileItemStream.ItemSkippedException();
            }
            int available = available();
            if (available == 0 && (available = makeAvailable()) == 0) {
                return 0L;
            }
            long min = Math.min(available, j);
            AlexaMultipartStream.this.head = (int) (r2.head + min);
            return min;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable, org.apache.commons.fileupload.util.Closeable
        public void close() throws IOException {
            close(false);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (!this.closed) {
                if (available() == 0 && makeAvailable() == 0) {
                    return -1;
                }
                this.total++;
                byte[] bArr = AlexaMultipartStream.this.buffer;
                AlexaMultipartStream alexaMultipartStream = AlexaMultipartStream.this;
                int i = alexaMultipartStream.head;
                alexaMultipartStream.head = i + 1;
                byte b = bArr[i];
                return b >= 0 ? b : b + 256;
            }
            throw new FileItemStream.ItemSkippedException();
        }
    }

    @Deprecated
    public AlexaMultipartStream(InputStream inputStream, byte[] bArr, int i) {
        this(inputStream, bArr, i, null);
    }

    @Deprecated
    public AlexaMultipartStream() {
        this((InputStream) null, (byte[]) null, (ProgressNotifier) null);
    }

    public AlexaMultipartStream(InputStream inputStream, byte[] bArr, ProgressNotifier progressNotifier) {
        this(inputStream, bArr, 4096, progressNotifier);
    }

    @Deprecated
    public AlexaMultipartStream(InputStream inputStream, byte[] bArr) {
        this(inputStream, bArr, 4096, null);
    }
}
