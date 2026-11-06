package com.amazon.alexa.assistant.transport.multipart.util;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.assistant.foundation.logging.Logger;
import com.amazon.alexa.biloba.membership.MembershipConstants;
import com.dee.app.contacts.common.constants.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 *2\u00020\u0001:\u0002*+B7\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rB/\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u000eB%\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u000fJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010 \u001a\u00020\u001fH\u0002J\u0006\u0010!\u001a\u00020\u0018J\u0010\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010$J\n\u0010%\u001a\u00060&R\u00020\u0000J\u0006\u0010'\u001a\u00020\u0007J\u0006\u0010(\u001a\u00020\u001dJ\b\u0010)\u001a\u00020\u0007H\u0004R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/amazon/alexa/assistant/transport/multipart/util/AlexaMultipartStream;", "", "input", "Ljava/io/InputStream;", "boundary", "", "bufSize", "", "pNotifier", "Lcom/amazon/alexa/assistant/transport/multipart/util/ProgressNotifier;", "logger", "Lcom/amazon/alexa/assistant/foundation/logging/Logger;", "<init>", "(Ljava/io/InputStream;[BILcom/amazon/alexa/assistant/transport/multipart/util/ProgressNotifier;Lcom/amazon/alexa/assistant/foundation/logging/Logger;)V", "(Ljava/io/InputStream;[BLcom/amazon/alexa/assistant/transport/multipart/util/ProgressNotifier;Lcom/amazon/alexa/assistant/foundation/logging/Logger;)V", "(Ljava/io/InputStream;[BLcom/amazon/alexa/assistant/foundation/logging/Logger;)V", "boundaryLength", "keepRegion", "boundaryTable", "", "buffer", "head", "tail", "headerEncoding", "", "notifier", "readByte", "", "readBoundary", "", "setBoundary", "", "computeBoundaryTable", "readHeaders", "readBodyData", ContactsModuleConstants.OUTPUT, "Ljava/io/OutputStream;", "newInputStream", "Lcom/amazon/alexa/assistant/transport/multipart/util/AlexaMultipartStream$ItemInputStream;", "discardBodyData", "skipPreamble", "findSeparator", "Companion", "ItemInputStream", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlexaMultipartStream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaMultipartStream.kt\ncom/amazon/alexa/assistant/transport/multipart/util/AlexaMultipartStream\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,436:1\n1#2:437\n*E\n"})
/* loaded from: classes17.dex */
public class AlexaMultipartStream {
    private static final int BYTE_POSITIVE_OFFSET = 256;
    public static final byte CR = 13;
    public static final int DEFAULT_BUFSIZE = 4096;
    public static final int HEADER_PART_SIZE_MAX = 10240;
    public static final byte LF = 10;

    @NotNull
    private final byte[] boundary;
    private int boundaryLength;

    @NotNull
    private final int[] boundaryTable;
    private final int bufSize;

    @NotNull
    private final byte[] buffer;
    private int head;

    @Nullable
    private String headerEncoding;

    @Nullable
    private final InputStream input;
    private final int keepRegion;

    @NotNull
    private Logger logger;

    @Nullable
    private final ProgressNotifier notifier;
    private int tail;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final byte[] HEADER_SEPARATOR = {13, 10, 13, 10};

    @NotNull
    private static final byte[] FIELD_SEPARATOR = {13, 10};

    @NotNull
    private static final byte[] STREAM_TERMINATOR = {45, 45};

    @NotNull
    private static final byte[] BOUNDARY_PREFIX = {13, 10, 45, 45};
    private static final String TAG = "AlexaMultipartStream";

    public AlexaMultipartStream(@Nullable InputStream inputStream, @Nullable byte[] bArr, int i, @Nullable ProgressNotifier progressNotifier, @NotNull Logger logger) {
        logger.getClass();
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
        this.logger = logger;
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, 0, bArr3, bArr2.length, bArr.length);
        computeBoundaryTable();
        this.head = 0;
        this.tail = 0;
    }

    private final void computeBoundaryTable() {
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

    public final int discardBodyData() throws MalformedStreamException, IOException {
        return readBodyData(null);
    }

    public final int findSeparator() {
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

    @NotNull
    public final ItemInputStream newInputStream() {
        return new ItemInputStream();
    }

    public final int readBodyData(@Nullable OutputStream output) throws MalformedStreamException, IOException {
        return (int) Streams.INSTANCE.copy(newInputStream(), output, false);
    }

    public final boolean readBoundary() throws FileUploadIOException, SocketTimeoutException, MalformedStreamException {
        byte[] bArr = new byte[2];
        this.head += this.boundaryLength;
        try {
            byte readByte = readByte();
            bArr[0] = readByte;
            if (readByte == 10) {
                return true;
            }
            bArr[1] = readByte();
            Companion companion = INSTANCE;
            if (companion.arrayequals(bArr, STREAM_TERMINATOR, 2)) {
                return false;
            }
            if (companion.arrayequals(bArr, FIELD_SEPARATOR, 2)) {
                return true;
            }
            throw new MalformedStreamException("Unexpected characters follow a boundary");
        } catch (EndOfInputException unused) {
            Logger logger = this.logger;
            String str = TAG;
            str.getClass();
            Logger.DefaultImpls.debug$default(logger, str, "Stream ended cleanly after a boundary without a terminator", null, 4, null);
            return false;
        } catch (FileUploadIOException e) {
            Logger logger2 = this.logger;
            String str2 = TAG;
            str2.getClass();
            Logger.DefaultImpls.debug$default(logger2, str2, "File Upload exception!", null, 4, null);
            throw e;
        } catch (SocketTimeoutException unused2) {
            Logger logger3 = this.logger;
            String str3 = TAG;
            str3.getClass();
            Logger.DefaultImpls.debug$default(logger3, str3, "Socket timed out exception!", null, 4, null);
            throw new SocketTimeoutException("Stream read timed out");
        } catch (IOException unused3) {
            Logger logger4 = this.logger;
            String str4 = TAG;
            str4.getClass();
            Logger.DefaultImpls.debug$default(logger4, str4, "IOException!", null, 4, null);
            throw new MalformedStreamException("Stream ended unexpectedly");
        }
    }

    public final byte readByte() throws IOException {
        if (this.head == this.tail) {
            this.head = 0;
            InputStream inputStream = this.input;
            int read = inputStream != null ? inputStream.read(this.buffer, 0, this.bufSize) : -1;
            this.tail = read;
            if (read == -1) {
                throw new EndOfInputException();
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

    @NotNull
    public final String readHeaders() throws FileUploadIOException, MalformedStreamException {
        String byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = HEADER_SEPARATOR;
            if (i >= bArr.length) {
                try {
                    String str = this.headerEncoding;
                    if (str != null && (byteArrayOutputStream = byteArrayOutputStream2.toString(str)) != null) {
                        return byteArrayOutputStream;
                    }
                    String byteArrayOutputStream3 = byteArrayOutputStream2.toString();
                    byteArrayOutputStream3.getClass();
                    return byteArrayOutputStream3;
                } catch (UnsupportedEncodingException unused) {
                    String byteArrayOutputStream4 = byteArrayOutputStream2.toString();
                    byteArrayOutputStream4.getClass();
                    return byteArrayOutputStream4;
                }
            }
            try {
                byte readByte = readByte();
                i2++;
                if (i2 > 10240) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    throw new MalformedStreamException(String.format("Header section has more than %s bytes (maybe it is not properly terminated)", Arrays.copyOf(new Object[]{10240}, 1)));
                }
                i = readByte == bArr[i] ? i + 1 : 0;
                byteArrayOutputStream2.write(readByte);
            } catch (EndOfInputException unused2) {
                Logger logger = this.logger;
                if (i2 == 0) {
                    String str2 = TAG;
                    str2.getClass();
                    Logger.DefaultImpls.debug$default(logger, str2, "Stream ended cleanly at a part boundary before any header bytes", null, 4, null);
                    throw new EndOfStreamAtPartBoundaryException();
                }
                String str3 = TAG;
                str3.getClass();
                Logger.DefaultImpls.debug$default(logger, str3, ParcelCompat$$ExternalSyntheticOutline0.m(", tail=", this.head, this.tail, ErrorUtils$$ExternalSyntheticOutline0.m29m(i, i2, "Stream ended while reading headers at position ", ", bytes read so far: ", ", buffer state: head=")), null, 4, null);
                throw new MalformedStreamException(ErrorUtils$$ExternalSyntheticOutline0.m(i, i2, "Stream ended unexpectedly while reading headers at position ", " after ", " bytes"));
            } catch (FileUploadIOException e) {
                throw e;
            } catch (IOException unused3) {
                Logger logger2 = this.logger;
                String str4 = TAG;
                str4.getClass();
                Logger.DefaultImpls.debug$default(logger2, str4, ParcelCompat$$ExternalSyntheticOutline0.m(", tail=", this.head, this.tail, ErrorUtils$$ExternalSyntheticOutline0.m29m(i, i2, "IOException while reading headers at position ", ", bytes read so far: ", ", buffer state: head=")), null, 4, null);
                throw new MalformedStreamException(ErrorUtils$$ExternalSyntheticOutline0.m(i, i2, "Stream ended unexpectedly while reading headers at position ", " after ", " bytes"));
            }
        }
    }

    public final void setBoundary(@NotNull byte[] boundary) throws IllegalBoundaryException {
        boundary.getClass();
        int length = boundary.length;
        int i = this.boundaryLength;
        byte[] bArr = BOUNDARY_PREFIX;
        if (length != i - bArr.length) {
            throw new IllegalBoundaryException("The length of a boundary token cannot be changed");
        }
        System.arraycopy(boundary, 0, this.boundary, bArr.length, boundary.length);
        computeBoundaryTable();
    }

    public final boolean skipPreamble() throws IOException {
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
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/assistant/transport/multipart/util/AlexaMultipartStream$Companion;", "", "<init>", "()V", MembershipConstants.CR, "", "LF", "HEADER_PART_SIZE_MAX", "", "DEFAULT_BUFSIZE", "BYTE_POSITIVE_OFFSET", "HEADER_SEPARATOR", "", "getHEADER_SEPARATOR", "()[B", "FIELD_SEPARATOR", "getFIELD_SEPARATOR", "STREAM_TERMINATOR", "getSTREAM_TERMINATOR", "BOUNDARY_PREFIX", "getBOUNDARY_PREFIX", Constants.LOG_TAG, "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "arrayequals", "", "a", "b", "count", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean arrayequals(@NotNull byte[] a2, @NotNull byte[] b, int count) {
            a2.getClass();
            b.getClass();
            for (int i = 0; i < count; i++) {
                if (a2[i] != b[i]) {
                    return false;
                }
            }
            return true;
        }

        @NotNull
        public final byte[] getBOUNDARY_PREFIX() {
            return AlexaMultipartStream.BOUNDARY_PREFIX;
        }

        @NotNull
        public final byte[] getFIELD_SEPARATOR() {
            return AlexaMultipartStream.FIELD_SEPARATOR;
        }

        @NotNull
        public final byte[] getHEADER_SEPARATOR() {
            return AlexaMultipartStream.HEADER_SEPARATOR;
        }

        @NotNull
        public final byte[] getSTREAM_TERMINATOR() {
            return AlexaMultipartStream.STREAM_TERMINATOR;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J \u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016J\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000bJ\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\bH\u0002J\b\u0010\u0019\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/assistant/transport/multipart/util/AlexaMultipartStream$ItemInputStream;", "Ljava/io/InputStream;", "Lcom/amazon/alexa/assistant/transport/multipart/util/Closeable;", "<init>", "(Lcom/amazon/alexa/assistant/transport/multipart/util/AlexaMultipartStream;)V", "total", "", "pad", "", "pos", "closed", "", "findSeparator", "", "available", "read", "b", "", "off", "len", "close", "pCloseUnderlying", "skip", "bytes", "makeAvailable", "isClosed", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ItemInputStream extends InputStream implements Closeable {
        private boolean closed;
        private int pad;
        private int pos;
        private long total;

        public ItemInputStream() {
            findSeparator();
        }

        private final void findSeparator() {
            int findSeparator = AlexaMultipartStream.this.findSeparator();
            this.pos = findSeparator;
            if (findSeparator == -1) {
                int i = AlexaMultipartStream.this.tail - AlexaMultipartStream.this.head;
                int i2 = AlexaMultipartStream.this.keepRegion;
                AlexaMultipartStream alexaMultipartStream = AlexaMultipartStream.this;
                this.pad = i > i2 ? alexaMultipartStream.keepRegion : alexaMultipartStream.tail - AlexaMultipartStream.this.head;
            }
        }

        private final int makeAvailable() throws IOException {
            int available;
            if (this.pos != -1) {
                return 0;
            }
            this.total += (AlexaMultipartStream.this.tail - AlexaMultipartStream.this.head) - this.pad;
            System.arraycopy(AlexaMultipartStream.this.buffer, AlexaMultipartStream.this.tail - this.pad, AlexaMultipartStream.this.buffer, 0, this.pad);
            AlexaMultipartStream.this.head = 0;
            AlexaMultipartStream.this.tail = this.pad;
            do {
                InputStream inputStream = AlexaMultipartStream.this.input;
                int read = inputStream != null ? inputStream.read(AlexaMultipartStream.this.buffer, AlexaMultipartStream.this.tail, AlexaMultipartStream.this.bufSize - AlexaMultipartStream.this.tail) : -1;
                AlexaMultipartStream alexaMultipartStream = AlexaMultipartStream.this;
                if (read == -1) {
                    Logger logger = alexaMultipartStream.logger;
                    String str = AlexaMultipartStream.TAG;
                    str.getClass();
                    Logger.DefaultImpls.debug$default(logger, str, "Stream ended while reading body data. Total bytes read: " + this.total + ", buffer state: head=" + AlexaMultipartStream.this.head + ", tail=" + AlexaMultipartStream.this.tail + ", pad=" + this.pad, null, 4, null);
                    throw new MalformedStreamException(AppLaunchChecker$$ExternalSyntheticOutline0.m("Stream ended unexpectedly while reading body data after ", this.total, " bytes"));
                }
                ProgressNotifier progressNotifier = alexaMultipartStream.notifier;
                if (progressNotifier != null) {
                    progressNotifier.noteBytesRead(read);
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

        public final void close(boolean pCloseUnderlying) throws IOException {
            if (this.closed) {
                return;
            }
            if (!pCloseUnderlying) {
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
                InputStream inputStream = AlexaMultipartStream.this.input;
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            this.closed = true;
        }

        @Override // com.amazon.alexa.assistant.transport.multipart.util.Closeable
        /* renamed from: isClosed, reason: from getter */
        public boolean getClosed() {
            return this.closed;
        }

        @Override // java.io.InputStream
        public int read(@NotNull byte[] b, int off, int len) throws IOException {
            b.getClass();
            if (this.closed) {
                throw new ItemSkippedException();
            }
            if (len == 0) {
                return 0;
            }
            int available = available();
            if (available == 0 && (available = makeAvailable()) == 0) {
                return -1;
            }
            int min = Math.min(available, len);
            System.arraycopy(AlexaMultipartStream.this.buffer, AlexaMultipartStream.this.head, b, off, min);
            AlexaMultipartStream.this.head += min;
            this.total += min;
            return min;
        }

        @Override // java.io.InputStream
        public long skip(long bytes) throws IOException {
            if (this.closed) {
                throw new ItemSkippedException();
            }
            int available = available();
            if (available == 0 && (available = makeAvailable()) == 0) {
                return 0L;
            }
            long min = Math.min(available, bytes);
            AlexaMultipartStream.this.head += (int) min;
            return min;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable, com.amazon.alexa.assistant.transport.multipart.util.Closeable
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
                int i = AlexaMultipartStream.this.head;
                AlexaMultipartStream.this.head = i + 1;
                byte b = bArr[i];
                return b >= 0 ? b : b + 256;
            }
            throw new ItemSkippedException();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AlexaMultipartStream(@Nullable InputStream inputStream, @Nullable byte[] bArr, @Nullable ProgressNotifier progressNotifier, @NotNull Logger logger) {
        this(inputStream, bArr, 4096, progressNotifier, logger);
        logger.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AlexaMultipartStream(@Nullable InputStream inputStream, @Nullable byte[] bArr, @NotNull Logger logger) {
        this(inputStream, bArr, 4096, null, logger);
        logger.getClass();
    }
}
