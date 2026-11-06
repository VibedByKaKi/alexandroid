package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@CheckReturnValue
/* loaded from: classes14.dex */
public interface MessageLite extends MessageLiteOrBuilder {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Builder extends MessageLiteOrBuilder, Cloneable {
        MessageLite build();

        MessageLite buildPartial();

        @CanIgnoreReturnValue
        Builder clear();

        /* renamed from: clone */
        Builder mo7713clone();

        boolean mergeDelimitedFrom(InputStream inputStream) throws IOException;

        boolean mergeDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(ByteString byteString) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(CodedInputStream codedInputStream) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(MessageLite messageLite);

        @CanIgnoreReturnValue
        Builder mergeFrom(InputStream inputStream) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] bArr) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;
    }

    Parser<? extends MessageLite> getParserForType();

    int getSerializedSize();

    Builder newBuilderForType();

    Builder toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeDelimitedTo(OutputStream outputStream) throws IOException;

    void writeTo(CodedOutputStream codedOutputStream) throws IOException;

    void writeTo(OutputStream outputStream) throws IOException;
}
