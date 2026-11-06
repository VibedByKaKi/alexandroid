package org.apache.thrift.orig.protocol;

import com.imagepicker.Options$$ExternalSyntheticLambda1;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.IntFunction;
import kotlinx.coroutines.rx3.RxConvertKt$$ExternalSyntheticLambda0;
import org.apache.thrift.orig.TException;
import org.apache.thrift.orig.partial.TFieldData;
import org.apache.thrift.orig.scheme.IScheme;
import org.apache.thrift.orig.scheme.StandardScheme;
import org.apache.thrift.orig.transport.TTransport;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class TProtocol implements TWriteProtocol, TReadProtocol {
    static final int MAX_SKIPPED_BYTES = 256;
    protected byte[] skippedBytes;
    protected TTransport trans_;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ReadCallback<T, R> {
        R accept(T t) throws TException;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ReadCollectionCallback<R> {
        R call() throws TException;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ReadMapEntryCallback<K, V> {
        K getKey() throws TException;

        V getValue() throws TException;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface WriteCallback<T> {
        void call(T t) throws TException;
    }

    public TProtocol(TTransport tTransport) {
        this.skippedBytes = new byte[256];
        this.trans_ = tTransport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$readList$1(IntFunction intFunction, ReadCollectionCallback readCollectionCallback, TList tList) throws TException {
        List list = (List) intFunction.apply(tList.size);
        for (int i = 0; i < tList.size; i++) {
            list.add(readCollectionCallback.call());
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$readMap$0(IntFunction intFunction, ReadMapEntryCallback readMapEntryCallback, TMap tMap) throws TException {
        Map map = (Map) intFunction.apply(tMap.size);
        for (int i = 0; i < tMap.size; i++) {
            map.put(readMapEntryCallback.getKey(), readMapEntryCallback.getValue());
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Set lambda$readSet$2(IntFunction intFunction, ReadCollectionCallback readCollectionCallback, TSet tSet) throws TException {
        Set set = (Set) intFunction.apply(tSet.size);
        for (int i = 0; i < tSet.size; i++) {
            set.add(readCollectionCallback.call());
        }
        return set;
    }

    public void checkReadBytesAvailable(TMap tMap) throws TException {
        this.trans_.checkReadBytesAvailable(tMap.size * (getMinSerializedSize(tMap.valueType) + getMinSerializedSize(tMap.keyType)));
    }

    public abstract int getMinSerializedSize(byte b) throws TException;

    public Class<? extends IScheme> getScheme() {
        return StandardScheme.class;
    }

    public TTransport getTransport() {
        return this.trans_;
    }

    public final <T> boolean readField(ReadCallback<TField, T> readCallback) throws Exception {
        TField readFieldBegin = readFieldBegin();
        if (readFieldBegin.type == 0) {
            return true;
        }
        readCallback.accept(readFieldBegin);
        readFieldEnd();
        return false;
    }

    public int readFieldBeginData() throws TException {
        TField readFieldBegin = readFieldBegin();
        return TFieldData.encode(readFieldBegin.type, readFieldBegin.id);
    }

    public final <T extends List<?>> T readList(ReadCallback<TList, T> readCallback) throws TException {
        T accept = readCallback.accept(readListBegin());
        readListEnd();
        return accept;
    }

    public final <T extends Map<?, ?>> T readMap(ReadCallback<TMap, T> readCallback) throws TException {
        T accept = readCallback.accept(readMapBegin());
        readMapEnd();
        return accept;
    }

    public final <T> T readMessage(ReadCallback<TMessage, T> readCallback) throws TException {
        T accept = readCallback.accept(readMessageBegin());
        readMessageEnd();
        return accept;
    }

    public final <T extends Set<?>> T readSet(ReadCallback<TSet, T> readCallback) throws TException {
        T accept = readCallback.accept(readSetBegin());
        readSetEnd();
        return accept;
    }

    public final <T> T readStruct(ReadCallback<TStruct, T> readCallback) throws TException {
        T accept = readCallback.accept(readStructBegin());
        readStructEnd();
        return accept;
    }

    public void skip(byte b, int i) throws TException {
        if (i <= 0) {
            throw new TException("Maximum skip depth exceeded");
        }
        int i2 = 0;
        switch (b) {
            case 2:
                skipBool();
                return;
            case 3:
                skipByte();
                return;
            case 4:
                skipDouble();
                return;
            case 5:
            case 7:
            case 9:
            default:
                throw new TProtocolException(1, a$$ExternalSyntheticOutline0.m(b, "Unrecognized type "));
            case 6:
                skipI16();
                return;
            case 8:
                skipI32();
                return;
            case 10:
                skipI64();
                return;
            case 11:
                skipBinary();
                return;
            case 12:
                readStructBegin();
                while (true) {
                    byte type = TFieldData.getType(readFieldBeginData());
                    if (type == 0) {
                        readStructEnd();
                        return;
                    } else {
                        skip(type, i - 1);
                        readFieldEnd();
                    }
                }
            case 13:
                TMap readMapBegin = readMapBegin();
                while (i2 < readMapBegin.size) {
                    int i3 = i - 1;
                    skip(readMapBegin.keyType, i3);
                    skip(readMapBegin.valueType, i3);
                    i2++;
                }
                readMapEnd();
                return;
            case 14:
                TSet readSetBegin = readSetBegin();
                while (i2 < readSetBegin.size) {
                    skip(readSetBegin.elemType, i - 1);
                    i2++;
                }
                readSetEnd();
                return;
            case 15:
                TList readListBegin = readListBegin();
                while (i2 < readListBegin.size) {
                    skip(readListBegin.elemType, i - 1);
                    i2++;
                }
                readListEnd();
                return;
        }
    }

    public void skipBinary() throws TException {
        readBinary();
    }

    public void skipBool() throws TException {
        readBool();
    }

    public void skipByte() throws TException {
        readByte();
    }

    public void skipBytes(int i) throws TException {
        if (i > 256) {
            while (i > 0) {
                skipBytes(Math.min(i, 256));
                i -= 256;
            }
        } else if (getTransport().getBytesRemainingInBuffer() >= i) {
            getTransport().consumeBuffer(i);
        } else {
            getTransport().readAll(this.skippedBytes, 0, i);
        }
    }

    public void skipDouble() throws TException {
        readDouble();
    }

    public void skipI16() throws TException {
        readI16();
    }

    public void skipI32() throws TException {
        readI32();
    }

    public void skipI64() throws TException {
        readI64();
    }

    public final void writeField(TField tField, WriteCallback<Void> writeCallback) throws TException {
        writeFieldBegin(tField);
        writeCallback.call(null);
        writeFieldEnd();
    }

    public final <T> void writeList(byte b, List<T> list, WriteCallback<T> writeCallback) throws TException {
        writeListBegin(new TList(b, list.size()));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            writeCallback.call(it2.next());
        }
        writeListEnd();
    }

    public final <K, V> void writeMap(byte b, byte b2, Map<K, V> map, WriteCallback<Map.Entry<K, V>> writeCallback) throws TException {
        writeMapBegin(new TMap(b, b2, map.size()));
        Iterator<Map.Entry<K, V>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            writeCallback.call(it2.next());
        }
        writeMapEnd();
    }

    public final void writeMessage(TMessage tMessage, WriteCallback<Void> writeCallback) throws TException {
        writeMessageBegin(tMessage);
        writeCallback.call(null);
        writeMessageEnd();
    }

    public final <T> void writeSet(byte b, Set<T> set, WriteCallback<T> writeCallback) throws TException {
        writeSetBegin(new TSet(b, set.size()));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            writeCallback.call(it2.next());
        }
        writeSetEnd();
    }

    public final void writeStruct(TStruct tStruct, WriteCallback<Void> writeCallback) throws TException {
        writeStructBegin(tStruct);
        writeCallback.call(null);
        writeStructEnd();
    }

    private TProtocol() {
        this.skippedBytes = new byte[256];
    }

    public final <T> List<T> readList(ReadCollectionCallback<T> readCollectionCallback) throws TException {
        return readList(readCollectionCallback, new Options$$ExternalSyntheticLambda1(6));
    }

    public final <K, V> Map<K, V> readMap(ReadMapEntryCallback<K, V> readMapEntryCallback) throws TException {
        return readMap(readMapEntryCallback, new Options$$ExternalSyntheticLambda1(5));
    }

    public final <T> Set<T> readSet(ReadCollectionCallback<T> readCollectionCallback) throws TException {
        return readSet(readCollectionCallback, new Options$$ExternalSyntheticLambda1(4));
    }

    public final <T> List<T> readList(ReadCollectionCallback<T> readCollectionCallback, IntFunction<List<T>> intFunction) throws TException {
        return readList(new TProtocol$$ExternalSyntheticLambda1(intFunction, readCollectionCallback, 1));
    }

    public final <K, V> Map<K, V> readMap(ReadMapEntryCallback<K, V> readMapEntryCallback, IntFunction<Map<K, V>> intFunction) throws TException {
        return readMap(new RxConvertKt$$ExternalSyntheticLambda0(intFunction, readMapEntryCallback, 16));
    }

    public final <T> Set<T> readSet(ReadCollectionCallback<T> readCollectionCallback, IntFunction<Set<T>> intFunction) throws TException {
        return readSet(new TProtocol$$ExternalSyntheticLambda1(intFunction, readCollectionCallback, 0));
    }

    public void reset() {
    }

    public void checkReadBytesAvailable(TList tList) throws TException {
        this.trans_.checkReadBytesAvailable(tList.getSize() * getMinSerializedSize(tList.elemType));
    }

    public void checkReadBytesAvailable(TSet tSet) throws TException {
        this.trans_.checkReadBytesAvailable(tSet.getSize() * getMinSerializedSize(tSet.elemType));
    }

    public void skip(byte b) throws TException {
        skip(b, Integer.MAX_VALUE);
    }
}
