package com.amazon.alexa.accessory.protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class Cardrendering {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.Cardrendering$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DisplayContentOrBuilder extends MessageLiteOrBuilder {
        int getIndex();

        ByteString getPayload();

        int getSequenceId();

        int getSubsequenceId();

        int getTotalChunks();

        DisplayContentType getType();

        int getTypeValue();
    }

    private Cardrendering() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DisplayContent extends GeneratedMessageLite<DisplayContent, Builder> implements DisplayContentOrBuilder {
        private static final DisplayContent DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 6;
        private static volatile Parser<DisplayContent> PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 2;
        public static final int SEQUENCE_ID_FIELD_NUMBER = 3;
        public static final int SUBSEQUENCE_ID_FIELD_NUMBER = 4;
        public static final int TOTAL_CHUNKS_FIELD_NUMBER = 5;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int index_;
        private ByteString payload_ = ByteString.EMPTY;
        private int sequenceId_;
        private int subsequenceId_;
        private int totalChunks_;
        private int type_;

        static {
            DisplayContent displayContent = new DisplayContent();
            DEFAULT_INSTANCE = displayContent;
            displayContent.makeImmutable();
        }

        private DisplayContent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndex() {
            this.index_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPayload() {
            this.payload_ = getDefaultInstance().getPayload();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSequenceId() {
            this.sequenceId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubsequenceId() {
            this.subsequenceId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalChunks() {
            this.totalChunks_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static DisplayContent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DisplayContent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DisplayContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DisplayContent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DisplayContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DisplayContent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndex(int i) {
            this.index_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPayload(ByteString byteString) {
            byteString.getClass();
            this.payload_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSequenceId(int i) {
            this.sequenceId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubsequenceId(int i) {
            this.subsequenceId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalChunks(int i) {
            this.totalChunks_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(DisplayContentType displayContentType) {
            displayContentType.getClass();
            this.type_ = displayContentType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new DisplayContent();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    DisplayContent displayContent = (DisplayContent) obj2;
                    int i = this.type_;
                    boolean z = i != 0;
                    int i2 = displayContent.type_;
                    this.type_ = visitor.visitInt(z, i, i2 != 0, i2);
                    ByteString byteString = this.payload_;
                    ByteString byteString2 = ByteString.EMPTY;
                    boolean z2 = byteString != byteString2;
                    ByteString byteString3 = displayContent.payload_;
                    this.payload_ = visitor.visitByteString(z2, byteString, byteString3 != byteString2, byteString3);
                    int i3 = this.sequenceId_;
                    boolean z3 = i3 != 0;
                    int i4 = displayContent.sequenceId_;
                    this.sequenceId_ = visitor.visitInt(z3, i3, i4 != 0, i4);
                    int i5 = this.subsequenceId_;
                    boolean z4 = i5 != 0;
                    int i6 = displayContent.subsequenceId_;
                    this.subsequenceId_ = visitor.visitInt(z4, i5, i6 != 0, i6);
                    int i7 = this.totalChunks_;
                    boolean z5 = i7 != 0;
                    int i8 = displayContent.totalChunks_;
                    this.totalChunks_ = visitor.visitInt(z5, i7, i8 != 0, i8);
                    int i9 = this.index_;
                    boolean z6 = i9 != 0;
                    int i10 = displayContent.index_;
                    this.index_ = visitor.visitInt(z6, i9, i10 != 0, i10);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.type_ = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    this.payload_ = codedInputStream.readBytes();
                                } else if (readTag == 24) {
                                    this.sequenceId_ = codedInputStream.readUInt32();
                                } else if (readTag == 32) {
                                    this.subsequenceId_ = codedInputStream.readUInt32();
                                } else if (readTag == 40) {
                                    this.totalChunks_ = codedInputStream.readUInt32();
                                } else if (readTag == 48) {
                                    this.index_ = codedInputStream.readUInt32();
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            objArr = 1;
                        } catch (InvalidProtocolBufferException e) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (DisplayContent.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                }
                            } finally {
                            }
                        }
                    }
                    return PARSER;
                case 9:
                    return (byte) 1;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cardrendering.DisplayContentOrBuilder
        public int getIndex() {
            return this.index_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cardrendering.DisplayContentOrBuilder
        public ByteString getPayload() {
            return this.payload_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cardrendering.DisplayContentOrBuilder
        public int getSequenceId() {
            return this.sequenceId_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.type_ != DisplayContentType.TYPE_UNKNOWN.getNumber() ? CodedOutputStream.computeEnumSize(1, this.type_) : 0;
            if (!this.payload_.isEmpty()) {
                computeEnumSize += CodedOutputStream.computeBytesSize(2, this.payload_);
            }
            int i2 = this.sequenceId_;
            if (i2 != 0) {
                computeEnumSize += CodedOutputStream.computeUInt32Size(3, i2);
            }
            int i3 = this.subsequenceId_;
            if (i3 != 0) {
                computeEnumSize += CodedOutputStream.computeUInt32Size(4, i3);
            }
            int i4 = this.totalChunks_;
            if (i4 != 0) {
                computeEnumSize += CodedOutputStream.computeUInt32Size(5, i4);
            }
            int i5 = this.index_;
            if (i5 != 0) {
                computeEnumSize += CodedOutputStream.computeUInt32Size(6, i5);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cardrendering.DisplayContentOrBuilder
        public int getSubsequenceId() {
            return this.subsequenceId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cardrendering.DisplayContentOrBuilder
        public int getTotalChunks() {
            return this.totalChunks_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cardrendering.DisplayContentOrBuilder
        public DisplayContentType getType() {
            DisplayContentType forNumber = DisplayContentType.forNumber(this.type_);
            return forNumber == null ? DisplayContentType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cardrendering.DisplayContentOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != DisplayContentType.TYPE_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            if (!this.payload_.isEmpty()) {
                codedOutputStream.writeBytes(2, this.payload_);
            }
            int i = this.sequenceId_;
            if (i != 0) {
                codedOutputStream.writeUInt32(3, i);
            }
            int i2 = this.subsequenceId_;
            if (i2 != 0) {
                codedOutputStream.writeUInt32(4, i2);
            }
            int i3 = this.totalChunks_;
            if (i3 != 0) {
                codedOutputStream.writeUInt32(5, i3);
            }
            int i4 = this.index_;
            if (i4 != 0) {
                codedOutputStream.writeUInt32(6, i4);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<DisplayContent, Builder> implements DisplayContentOrBuilder {
            private Builder() {
                super(DisplayContent.DEFAULT_INSTANCE);
            }

            public Builder clearIndex() {
                copyOnWrite();
                ((DisplayContent) this.instance).clearIndex();
                return this;
            }

            public Builder clearPayload() {
                copyOnWrite();
                ((DisplayContent) this.instance).clearPayload();
                return this;
            }

            public Builder clearSequenceId() {
                copyOnWrite();
                ((DisplayContent) this.instance).clearSequenceId();
                return this;
            }

            public Builder clearSubsequenceId() {
                copyOnWrite();
                ((DisplayContent) this.instance).clearSubsequenceId();
                return this;
            }

            public Builder clearTotalChunks() {
                copyOnWrite();
                ((DisplayContent) this.instance).clearTotalChunks();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((DisplayContent) this.instance).clearType();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Cardrendering.DisplayContentOrBuilder
            public int getIndex() {
                return ((DisplayContent) this.instance).getIndex();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cardrendering.DisplayContentOrBuilder
            public ByteString getPayload() {
                return ((DisplayContent) this.instance).getPayload();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cardrendering.DisplayContentOrBuilder
            public int getSequenceId() {
                return ((DisplayContent) this.instance).getSequenceId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cardrendering.DisplayContentOrBuilder
            public int getSubsequenceId() {
                return ((DisplayContent) this.instance).getSubsequenceId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cardrendering.DisplayContentOrBuilder
            public int getTotalChunks() {
                return ((DisplayContent) this.instance).getTotalChunks();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cardrendering.DisplayContentOrBuilder
            public DisplayContentType getType() {
                return ((DisplayContent) this.instance).getType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cardrendering.DisplayContentOrBuilder
            public int getTypeValue() {
                return ((DisplayContent) this.instance).getTypeValue();
            }

            public Builder setIndex(int i) {
                copyOnWrite();
                ((DisplayContent) this.instance).setIndex(i);
                return this;
            }

            public Builder setPayload(ByteString byteString) {
                copyOnWrite();
                ((DisplayContent) this.instance).setPayload(byteString);
                return this;
            }

            public Builder setSequenceId(int i) {
                copyOnWrite();
                ((DisplayContent) this.instance).setSequenceId(i);
                return this;
            }

            public Builder setSubsequenceId(int i) {
                copyOnWrite();
                ((DisplayContent) this.instance).setSubsequenceId(i);
                return this;
            }

            public Builder setTotalChunks(int i) {
                copyOnWrite();
                ((DisplayContent) this.instance).setTotalChunks(i);
                return this;
            }

            public Builder setType(DisplayContentType displayContentType) {
                copyOnWrite();
                ((DisplayContent) this.instance).setType(displayContentType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((DisplayContent) this.instance).setTypeValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(DisplayContent displayContent) {
            return DEFAULT_INSTANCE.createBuilder(displayContent);
        }

        public static DisplayContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DisplayContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DisplayContent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DisplayContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DisplayContent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DisplayContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DisplayContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DisplayContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DisplayContent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DisplayContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DisplayContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DisplayContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DisplayContent parseFrom(InputStream inputStream) throws IOException {
            return (DisplayContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DisplayContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DisplayContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DisplayContent parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DisplayContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DisplayContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DisplayContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DisplayContentType implements Internal.EnumLite {
        TYPE_UNKNOWN(0),
        TYPE_CARD(1),
        TYPE_CAPTION(2),
        TYPE_ASR(3),
        UNRECOGNIZED(-1);

        public static final int TYPE_ASR_VALUE = 3;
        public static final int TYPE_CAPTION_VALUE = 2;
        public static final int TYPE_CARD_VALUE = 1;
        public static final int TYPE_UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<DisplayContentType> internalValueMap = new Internal.EnumLiteMap<DisplayContentType>() { // from class: com.amazon.alexa.accessory.protocol.Cardrendering.DisplayContentType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public DisplayContentType findValueByNumber(int i) {
                return DisplayContentType.forNumber(i);
            }
        };
        private final int value;

        DisplayContentType(int i) {
            this.value = i;
        }

        public static DisplayContentType forNumber(int i) {
            if (i == 0) {
                return TYPE_UNKNOWN;
            }
            if (i == 1) {
                return TYPE_CARD;
            }
            if (i == 2) {
                return TYPE_CAPTION;
            }
            if (i != 3) {
                return null;
            }
            return TYPE_ASR;
        }

        public static Internal.EnumLiteMap<DisplayContentType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
            return 0;
        }

        @Deprecated
        public static DisplayContentType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
