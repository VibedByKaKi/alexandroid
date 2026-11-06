package com.amazon.alexa.accessory.transport.codecs.V3;

import android.util.SparseArray;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.AccessoryTransport;
import com.amazon.alexa.accessory.internal.util.IOUtils;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.io.ByteArraySource;
import com.amazon.alexa.accessory.io.DataSource;
import com.amazon.alexa.accessory.io.SizedSource;
import com.amazon.alexa.accessory.transport.TransportData;
import com.amazon.alexa.accessory.transport.TransportFeature;
import com.amazon.alexa.accessory.transport.TransportPriority;
import com.amazon.alexa.accessory.transport.TransportTransaction;
import com.amazon.alexa.accessory.transport.codecs.TransportCodec;
import com.amazon.alexa.accessory.transport.operations.FlushTransportOperation;
import com.amazon.alexa.accessory.transport.operations.LinearTransportOperationSequence;
import com.amazon.alexa.accessory.transport.operations.SingleTransportOperationSequence;
import com.amazon.alexa.accessory.transport.operations.TransportOperation;
import com.amazon.alexa.accessory.transport.operations.TransportOperationSequence;
import com.google.common.collect.Sets;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class V3TransportCodec implements TransportCodec {
    public static final int ENCRYPTED_TRANSACTION_BIT_MASK = 1;
    private static final int MAXIMUM_SEQUENCE = 15;
    private static final int MAXIMUM_TRANSACTION_ID = 15;
    private static final int MINIMUM_SEQUENCE = 0;
    private static final Set<TransportFeature> SUPPORTED = Sets.immutableEnumSet(TransportFeature.AUTHENTICATION, TransportFeature.ENCRYPTION, TransportFeature.REQUIRE_RESPONSE);
    private final Set<TransportFeature> enabledFeatures;
    private final int maxTransactionSizeBytes;
    private final int packetFragmentSizeBytes;
    private final V3TransactionDataDecryptor payloadDecryptor;
    private int transactionId;
    private final SparseArray<V3Transaction> transactions;
    private final AccessoryTransport transport;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.transport.codecs.V3.V3TransportCodec$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$transport$codecs$V3$V3TransactionType;

        static {
            int[] iArr = new int[V3TransactionType.values().length];
            $SwitchMap$com$amazon$alexa$accessory$transport$codecs$V3$V3TransactionType = iArr;
            try {
                iArr[V3TransactionType.CONTROL_PACKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$transport$codecs$V3$V3TransactionType[V3TransactionType.FIRST_PACKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$transport$codecs$V3$V3TransactionType[V3TransactionType.NORMAL_PACKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$transport$codecs$V3$V3TransactionType[V3TransactionType.FINAL_PACKET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InvalidControlPacketLengthException extends V3TransportException {
        private final int length;

        public InvalidControlPacketLengthException(int i) {
            super(a$$ExternalSyntheticOutline0.m(i, "Invalid length of a packet "));
            this.length = i;
        }

        public int getLength() {
            return this.length;
        }

        @Override // com.amazon.alexa.accessory.transport.codecs.V3.V3TransportCodec.V3TransportException
        public /* bridge */ /* synthetic */ int getTransportVersion() {
            return super.getTransportVersion();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InvalidTransactionTypeException extends V3TransportException {
        private final int transactionType;

        public InvalidTransactionTypeException(int i) {
            super(a$$ExternalSyntheticOutline0.m(i, "Invalid transaction type "));
            this.transactionType = i;
        }

        public int getTransactionType() {
            return this.transactionType;
        }

        @Override // com.amazon.alexa.accessory.transport.codecs.V3.V3TransportCodec.V3TransportException
        public /* bridge */ /* synthetic */ int getTransportVersion() {
            return super.getTransportVersion();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TransactionCollisionException extends V3TransportException {
        private final int stream;
        private final int transactionId;

        public TransactionCollisionException(int i, int i2) {
            super(ErrorUtils$$ExternalSyntheticOutline0.m(i, i2, "Detected a transaction collision. Transaction with id ", " on a stream ", " already exists!"));
            this.transactionId = i;
            this.stream = i2;
        }

        public int getStream() {
            return this.stream;
        }

        public int getTransactionId() {
            return this.transactionId;
        }

        @Override // com.amazon.alexa.accessory.transport.codecs.V3.V3TransportCodec.V3TransportException
        public /* bridge */ /* synthetic */ int getTransportVersion() {
            return super.getTransportVersion();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TransactionLengthMismatchException extends V3TransportException {
        private final int actualLengthBytes;
        private final int expectedLengthBytes;

        public TransactionLengthMismatchException(int i, int i2) {
            super(a$$ExternalSyntheticOutline0.m("The sum of transaction packet-lengths does not add up to the transaction's total length; expected (bytes): ", i, "; actual (bytes): ", i2));
            this.expectedLengthBytes = i;
            this.actualLengthBytes = i2;
        }

        public int getActualLengthBytes() {
            return this.actualLengthBytes;
        }

        public int getExpectedLengthBytes() {
            return this.expectedLengthBytes;
        }

        @Override // com.amazon.alexa.accessory.transport.codecs.V3.V3TransportCodec.V3TransportException
        public /* bridge */ /* synthetic */ int getTransportVersion() {
            return super.getTransportVersion();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class UnexpectedTransactionException extends V3TransportException {
        private final int stream;
        private final int transactionId;

        public UnexpectedTransactionException(int i, int i2) {
            super(a$$ExternalSyntheticOutline0.m("Invalid packet. There is no active transaction with id ", i, " on a stream ", i2));
            this.transactionId = i;
            this.stream = i2;
        }

        public int getStream() {
            return this.stream;
        }

        public int getTransactionId() {
            return this.transactionId;
        }

        @Override // com.amazon.alexa.accessory.transport.codecs.V3.V3TransportCodec.V3TransportException
        public /* bridge */ /* synthetic */ int getTransportVersion() {
            return super.getTransportVersion();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class V3Transaction {
        public final byte[] bytes;
        public final int id;
        public final boolean isEncrypted;
        public final int key;
        public int length;
        public final boolean requireAck;
        public int sequence;
        public final int stream;
        public final int totalLength;

        public V3Transaction(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
            this.key = i;
            this.id = i2;
            this.stream = i3;
            this.totalLength = i4;
            this.sequence = i5;
            this.requireAck = z;
            this.isEncrypted = z2;
            this.bytes = new byte[i4];
        }

        public void append(DataSource dataSource, int i) throws IOException {
            dataSource.get(this.bytes, this.length, i);
            this.length += i;
        }

        public boolean isCompleted() {
            return this.length == this.totalLength;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class V3TransportException extends IOException {
        public V3TransportException(String str) {
            super(str);
        }

        public int getTransportVersion() {
            return 3;
        }
    }

    public V3TransportCodec(AccessoryTransport accessoryTransport, int i, int i2, Set<TransportFeature> set, V3TransactionDataDecryptor v3TransactionDataDecryptor) {
        Preconditions.notNull(accessoryTransport, "transport");
        Preconditions.notNull(set, "requiredToSupport");
        Preconditions.notNull(v3TransactionDataDecryptor, "payloadDecryptor");
        Preconditions.precondition(i > 0, "maxTransactionSizeBytes");
        Preconditions.precondition(i2 > 0, "packetFragmentSizeBytes");
        Preconditions.precondition(i >= i2, "packetFragmentSizeBytes");
        Preconditions.precondition(TransportFeature.isSufficient(set, SUPPORTED), "requiredToSupport");
        this.transport = accessoryTransport;
        this.maxTransactionSizeBytes = i;
        this.packetFragmentSizeBytes = i2;
        this.payloadDecryptor = v3TransactionDataDecryptor;
        this.transactions = new SparseArray<>();
        this.enabledFeatures = set;
    }

    private static boolean addFinalPacketSourceToTransaction(DataSource dataSource, V3Transaction v3Transaction, int i) throws IOException {
        int min = Math.min(i, v3Transaction.totalLength - v3Transaction.length);
        int i2 = i - min;
        if (i2 > 0) {
            i = min;
        }
        addSourceToTransaction(dataSource, v3Transaction, i);
        if (i2 <= 0) {
            return v3Transaction.isCompleted();
        }
        byte[] bArr = new byte[i2];
        dataSource.get(bArr);
        Logger.v("Discarding excess bytes for transaction in the final packet: %s", bArr);
        return false;
    }

    private static void addSourceToTransaction(DataSource dataSource, V3Transaction v3Transaction, int i) throws IOException {
        int i2 = v3Transaction.length;
        int i3 = i2 + i;
        int i4 = v3Transaction.totalLength;
        if (i3 > i4) {
            throw new TransactionLengthMismatchException(i4, i2 + i);
        }
        if (!Logger.shouldLog(Logger.Level.VERBOSE)) {
            v3Transaction.append(dataSource, i);
            return;
        }
        byte[] bArr = new byte[i];
        dataSource.get(bArr, 0, i);
        Logger.v(" - payload", bArr, 0, i);
        v3Transaction.append(new DataSource(new ByteArraySource(bArr)), i);
    }

    private V3Transaction decodeTransaction(DataSource dataSource, TransportCodec.OperationSequenceEncoder operationSequenceEncoder) throws IOException {
        Logger.v("Waiting to decode transaction v3 (%s)", this.transport.getAccessory());
        int bits = dataSource.getBits(4);
        Logger.v("Decoding v3 transport transaction {");
        Logger.v(" - stream=%d", Integer.valueOf(bits));
        int bits2 = dataSource.getBits(4);
        Logger.v(" - transactionId=%d", Integer.valueOf(bits2));
        int bits3 = dataSource.getBits(4);
        Logger.v(" - sequence=%d", Integer.valueOf(bits3));
        int bits4 = dataSource.getBits(2);
        Logger.v(" - transactionType=%d", Integer.valueOf(bits4));
        V3TransactionType fromValue = V3TransactionType.fromValue(bits4);
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$transport$codecs$V3$V3TransactionType[fromValue.ordinal()];
        if (i == 1) {
            handleControlPacket(dataSource, bits, bits2);
            return decodeTransaction(dataSource, operationSequenceEncoder);
        }
        if (i == 2) {
            return handleFirstPacket(dataSource, bits, bits2, bits3);
        }
        if (i != 3 && i != 4) {
            throw new InvalidTransactionTypeException(bits4);
        }
        V3Transaction handleContinuousPacket = handleContinuousPacket(dataSource, bits, bits2, bits3, fromValue, operationSequenceEncoder);
        return handleContinuousPacket == null ? decodeTransaction(dataSource, operationSequenceEncoder) : handleContinuousPacket;
    }

    private static int divideWithRemainder(int i, int i2) {
        int i3 = i / i2;
        return i % i2 != 0 ? i3 + 1 : i3;
    }

    private V3Transaction handleContinuousPacket(DataSource dataSource, int i, int i2, int i3, V3TransactionType v3TransactionType, TransportCodec.OperationSequenceEncoder operationSequenceEncoder) throws IOException {
        int makeIdentifier = makeIdentifier(i, i2);
        V3Transaction v3Transaction = this.transactions.get(makeIdentifier);
        if (v3Transaction == null) {
            throw new UnexpectedTransactionException(i2, i);
        }
        Logger.v(" - acknowledgement=%d", Integer.valueOf(dataSource.getBit()));
        boolean z = dataSource.getBit() != 0;
        Logger.v(" - extendedLength=%b", Boolean.valueOf(z));
        int bits = dataSource.getBits(z ? 16 : 8);
        Logger.v(" - length=%d", Integer.valueOf(bits));
        if (bits < 0) {
            Single$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m(bits, "A negative int was parsed from at most 16 bits: "));
            return null;
        }
        if (V3TransactionType.FINAL_PACKET == v3TransactionType) {
            int i4 = v3Transaction.length;
            if (!addFinalPacketSourceToTransaction(dataSource, v3Transaction, bits)) {
                Logger.d("Aborting transaction %d on stream %d. Transaction length mismatch. Expected: %d, Actual: %d", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(v3Transaction.totalLength), Integer.valueOf(i4 + bits));
                this.transactions.remove(makeIdentifier);
                operationSequenceEncoder.encoded(makeTransactionAbort(v3Transaction, 4));
                return null;
            }
        } else {
            addSourceToTransaction(dataSource, v3Transaction, bits);
        }
        Logger.v(StringSubstitutor.DEFAULT_VAR_END);
        int i5 = v3Transaction.sequence + 1;
        v3Transaction.sequence = i5;
        if (i5 > 15) {
            v3Transaction.sequence = 0;
        }
        if (v3Transaction.sequence == i3) {
            return v3Transaction;
        }
        StringBuilder m29m = ErrorUtils$$ExternalSyntheticOutline0.m29m(i2, i, "Aborting transaction ", " on a stream ", ". Invalid sequence number ");
        m29m.append(i3);
        Logger.d(m29m.toString());
        this.transactions.remove(makeIdentifier);
        operationSequenceEncoder.encoded(makeTransactionAbort(v3Transaction, 3));
        return null;
    }

    private void handleControlPacket(DataSource dataSource, int i, int i2) throws IOException {
        Logger.v(" - Transaction is a control packet.... continuing decoding");
        Logger.v(" - acknowledgement=%d", Integer.valueOf(dataSource.getBit()));
        boolean z = dataSource.getBit() != 0;
        Logger.v(" - extendedLength=%b", Boolean.valueOf(z));
        Logger.v(" - encrypted=%b", Boolean.valueOf((dataSource.get() & 1) != 0));
        int bits = dataSource.getBits(z ? 16 : 8);
        Logger.v(" - length=%b", Integer.valueOf(bits));
        if (bits < 2) {
            throw new InvalidControlPacketLengthException(bits);
        }
        int i3 = dataSource.get();
        Logger.v(" - controlType=%d", Integer.valueOf(i3));
        int i4 = dataSource.get();
        Logger.v(" - errorCode=%d", Integer.valueOf(i4));
        if (bits > 2) {
            byte[] bArr = new byte[bits - 2];
            dataSource.get(bArr);
            Logger.v("Discarding extra bytes in control packet: %s", bArr);
        }
        if (i3 == 2) {
            StringBuilder m29m = ErrorUtils$$ExternalSyntheticOutline0.m29m(i2, i, "Aborting transaction ", " on a stream ", " with code ");
            m29m.append(i4);
            Logger.d(m29m.toString());
            this.transactions.remove(makeIdentifier(i, i2));
        }
        Logger.v(StringSubstitutor.DEFAULT_VAR_END);
    }

    private V3Transaction handleFirstPacket(DataSource dataSource, int i, int i2, int i3) throws IOException {
        Logger.v(" - Transaction is a first packet.... continuing decoding");
        int makeIdentifier = makeIdentifier(i, i2);
        if (this.transactions.get(makeIdentifier) != null) {
            throw new TransactionCollisionException(i2, i);
        }
        boolean z = dataSource.getBit() != 0;
        Logger.v(" - requireAck=%b", Boolean.valueOf(z));
        boolean z2 = dataSource.getBit() != 0;
        Logger.v(" - extendedLength=%b", Boolean.valueOf(z2));
        boolean z3 = (dataSource.get() & 1) == 1;
        Logger.v(" - encrypted=%b", Boolean.valueOf(z3));
        int word = dataSource.getWord();
        Logger.v(" - totalLength=%d", Integer.valueOf(word));
        if (word < 0) {
            Single$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m(word, "A negative int was parsed from 8 bits: "));
            return null;
        }
        int bits = dataSource.getBits(z2 ? 16 : 8);
        Logger.v(" - length=%d", Integer.valueOf(bits));
        if (bits < 0) {
            Single$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m(bits, "A negative int was parsed from at most 16 bits: "));
            return null;
        }
        V3Transaction v3Transaction = new V3Transaction(makeIdentifier, i2, i, word, i3, z, z3);
        addSourceToTransaction(dataSource, v3Transaction, bits);
        this.transactions.put(makeIdentifier, v3Transaction);
        Logger.v(StringSubstitutor.DEFAULT_VAR_END);
        return v3Transaction;
    }

    private static int makeIdentifier(int i, int i2) {
        return ((i << 4) & 240) | (i2 & 15);
    }

    private TransportOperationSequence makeTransactionAbort(V3Transaction v3Transaction, int i) {
        return makeTransactionControlResponse(v3Transaction, false, i);
    }

    private TransportOperationSequence makeTransactionAck(V3Transaction v3Transaction) {
        return makeTransactionControlResponse(v3Transaction, true, 0);
    }

    private TransportOperationSequence makeTransactionControlResponse(V3Transaction v3Transaction, boolean z, int i) {
        return new SingleTransportOperationSequence(V3ControlPacketTransportOperation.newBuilder().key(UUID.randomUUID().toString()).transport(this.transport).stream(v3Transaction.stream).transactionId(v3Transaction.id).controlType(z ? 1 : 2).errorCode(i).priority(TransportPriority.HIGH).build());
    }

    @Override // com.amazon.alexa.accessory.transport.codecs.TransportCodec
    public TransportData decode(TransportCodec.OperationSequenceEncoder operationSequenceEncoder) throws IOException {
        V3Transaction decodeTransaction;
        ByteArraySource byteArraySource;
        DataSource dataSource = new DataSource(this.transport.source());
        do {
            decodeTransaction = decodeTransaction(dataSource, operationSequenceEncoder);
            Logger.d("Decoded a transaction v3. transactionId=%d, stream=%d, sequence=%d, length=%d, totalLength=%d", Integer.valueOf(decodeTransaction.id), Integer.valueOf(decodeTransaction.stream), Integer.valueOf(decodeTransaction.sequence), Integer.valueOf(decodeTransaction.length), Integer.valueOf(decodeTransaction.totalLength));
        } while (!decodeTransaction.isCompleted());
        if (decodeTransaction.isEncrypted) {
            try {
                byteArraySource = new ByteArraySource(this.payloadDecryptor.decryptDataBlob(decodeTransaction.bytes));
                Logger.d("Received a complete transport data v3 (%d encrypted bytes, %d bytes) stream %d (%s)", Integer.valueOf(decodeTransaction.length), Integer.valueOf(byteArraySource.size()), Integer.valueOf(decodeTransaction.stream), this.transport.getAccessory());
            } catch (V3TransportException e) {
                operationSequenceEncoder.encoded(makeTransactionAbort(decodeTransaction, 2));
                Logger.e("Failed to decrypt v3 transport data. transactionId=%d, stream=%d, sequence=%d, length=%d, totalLength=%d", e, Integer.valueOf(decodeTransaction.id), Integer.valueOf(decodeTransaction.stream), Integer.valueOf(decodeTransaction.sequence), Integer.valueOf(decodeTransaction.length), Integer.valueOf(decodeTransaction.totalLength));
                throw e;
            }
        } else {
            byteArraySource = new ByteArraySource(decodeTransaction.bytes, 0, decodeTransaction.length);
            Logger.d("Received a complete transport data v3 (%d bytes) stream %d (%s)", Integer.valueOf(decodeTransaction.length), Integer.valueOf(decodeTransaction.stream), this.transport.getAccessory());
        }
        if (decodeTransaction.requireAck) {
            operationSequenceEncoder.encoded(makeTransactionAck(decodeTransaction));
        }
        this.transactions.remove(decodeTransaction.key);
        return new TransportData(byteArraySource, decodeTransaction.stream);
    }

    @Override // com.amazon.alexa.accessory.transport.codecs.TransportCodec
    public TransportOperationSequence encode(TransportTransaction transportTransaction) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (transportTransaction.hasData()) {
            SizedSource data = transportTransaction.getData();
            data.reset();
            byte[] sourceToByteArray = IOUtils.sourceToByteArray(data);
            IOUtils.closeQuietly(data);
            int length = sourceToByteArray.length;
            while (length > 0) {
                int min = Math.min(length, this.maxTransactionSizeBytes);
                V3TransportCodec v3TransportCodec = this;
                arrayList.addAll(v3TransportCodec.encode(transportTransaction.getKey(), sourceToByteArray, sourceToByteArray.length - length, min, transportTransaction.getStream(), divideWithRemainder(min, this.packetFragmentSizeBytes), false, transportTransaction.getPriority()));
                length -= min;
                int i = v3TransportCodec.transactionId + 1;
                v3TransportCodec.transactionId = i;
                if (i > 15) {
                    v3TransportCodec.transactionId = 0;
                }
                this = v3TransportCodec;
            }
        }
        V3TransportCodec v3TransportCodec2 = this;
        if (transportTransaction.isCommit()) {
            arrayList.add(new FlushTransportOperation(transportTransaction.getKey(), v3TransportCodec2.transport, transportTransaction.getPriority()));
        }
        return new LinearTransportOperationSequence(transportTransaction.getKey(), transportTransaction.getPriority(), arrayList);
    }

    private List<? extends TransportOperation> encode(String str, byte[] bArr, int i, int i2, int i3, int i4, boolean z, TransportPriority transportPriority) {
        ArrayList arrayList = new ArrayList(i4);
        V3TransactionType v3TransactionType = V3TransactionType.FIRST_PACKET;
        int i5 = i2;
        int i6 = 0;
        while (i5 > 0) {
            int min = Math.min(i5, this.packetFragmentSizeBytes);
            arrayList.add(V3PacketTransportOperation.newBuilder().key(str).transport(this.transport).data(new ByteArraySource(bArr, (i + i2) - i5, min)).stream(i3).transactionId(this.transactionId).sequence(i6).transactionType(v3TransactionType).totalPackets(i4).totalSize(i2).authenticated(z).priority(transportPriority).build());
            i5 -= min;
            i6++;
            if (i6 > 15) {
                i6 = 0;
            }
            v3TransactionType = i5 <= this.packetFragmentSizeBytes ? V3TransactionType.FINAL_PACKET : V3TransactionType.NORMAL_PACKET;
        }
        return arrayList;
    }
}
