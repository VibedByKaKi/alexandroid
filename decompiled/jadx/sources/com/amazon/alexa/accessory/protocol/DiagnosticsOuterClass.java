package com.amazon.alexa.accessory.protocol;

import com.amazon.alexa.accessory.protocol.Common;
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
public final class DiagnosticsOuterClass {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass$1, reason: invalid class name */
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
    public interface DiagnosticsOrBuilder extends MessageLiteOrBuilder {
        int getSize();

        DiagnosticsType getType();

        int getTypeValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetDiagnosticsOrBuilder extends MessageLiteOrBuilder {
        DiagnosticsType getType();

        int getTypeValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NotifyDiagnosticsAvailableOrBuilder extends MessageLiteOrBuilder {
        DiagnosticsType getType();

        int getTypeValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StopDiagnosticsOrBuilder extends MessageLiteOrBuilder {
        Common.ErrorCode getErrorCode();

        int getErrorCodeValue();

        DiagnosticsType getType();

        int getTypeValue();
    }

    private DiagnosticsOuterClass() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Diagnostics extends GeneratedMessageLite<Diagnostics, Builder> implements DiagnosticsOrBuilder {
        private static final Diagnostics DEFAULT_INSTANCE;
        private static volatile Parser<Diagnostics> PARSER = null;
        public static final int SIZE_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 2;
        private int size_;
        private int type_;

        static {
            Diagnostics diagnostics = new Diagnostics();
            DEFAULT_INSTANCE = diagnostics;
            diagnostics.makeImmutable();
        }

        private Diagnostics() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSize() {
            this.size_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static Diagnostics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Diagnostics parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Diagnostics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Diagnostics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Diagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Diagnostics> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSize(int i) {
            this.size_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(DiagnosticsType diagnosticsType) {
            diagnosticsType.getClass();
            this.type_ = diagnosticsType.getNumber();
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
                    return new Diagnostics();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    Diagnostics diagnostics = (Diagnostics) obj2;
                    int i = this.size_;
                    boolean z = i != 0;
                    int i2 = diagnostics.size_;
                    this.size_ = visitor.visitInt(z, i, i2 != 0, i2);
                    int i3 = this.type_;
                    boolean z2 = i3 != 0;
                    int i4 = diagnostics.type_;
                    this.type_ = visitor.visitInt(z2, i3, i4 != 0, i4);
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
                                    this.size_ = codedInputStream.readUInt32();
                                } else if (readTag == 16) {
                                    this.type_ = codedInputStream.readEnum();
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
                        synchronized (Diagnostics.class) {
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

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.size_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            if (this.type_ != DiagnosticsType.LOG.getNumber()) {
                computeUInt32Size += CodedOutputStream.computeEnumSize(2, this.type_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass.DiagnosticsOrBuilder
        public int getSize() {
            return this.size_;
        }

        @Override // com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass.DiagnosticsOrBuilder
        public DiagnosticsType getType() {
            DiagnosticsType forNumber = DiagnosticsType.forNumber(this.type_);
            return forNumber == null ? DiagnosticsType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass.DiagnosticsOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.size_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            if (this.type_ != DiagnosticsType.LOG.getNumber()) {
                codedOutputStream.writeEnum(2, this.type_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<Diagnostics, Builder> implements DiagnosticsOrBuilder {
            private Builder() {
                super(Diagnostics.DEFAULT_INSTANCE);
            }

            public Builder clearSize() {
                copyOnWrite();
                ((Diagnostics) this.instance).clearSize();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((Diagnostics) this.instance).clearType();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass.DiagnosticsOrBuilder
            public int getSize() {
                return ((Diagnostics) this.instance).getSize();
            }

            @Override // com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass.DiagnosticsOrBuilder
            public DiagnosticsType getType() {
                return ((Diagnostics) this.instance).getType();
            }

            @Override // com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass.DiagnosticsOrBuilder
            public int getTypeValue() {
                return ((Diagnostics) this.instance).getTypeValue();
            }

            public Builder setSize(int i) {
                copyOnWrite();
                ((Diagnostics) this.instance).setSize(i);
                return this;
            }

            public Builder setType(DiagnosticsType diagnosticsType) {
                copyOnWrite();
                ((Diagnostics) this.instance).setType(diagnosticsType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((Diagnostics) this.instance).setTypeValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(Diagnostics diagnostics) {
            return DEFAULT_INSTANCE.createBuilder(diagnostics);
        }

        public static Diagnostics parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Diagnostics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Diagnostics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Diagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Diagnostics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Diagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Diagnostics parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Diagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Diagnostics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Diagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Diagnostics parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Diagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Diagnostics parseFrom(InputStream inputStream) throws IOException {
            return (Diagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Diagnostics parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Diagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Diagnostics parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Diagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Diagnostics parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Diagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetDiagnostics extends GeneratedMessageLite<GetDiagnostics, Builder> implements GetDiagnosticsOrBuilder {
        private static final GetDiagnostics DEFAULT_INSTANCE;
        private static volatile Parser<GetDiagnostics> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int type_;

        static {
            GetDiagnostics getDiagnostics = new GetDiagnostics();
            DEFAULT_INSTANCE = getDiagnostics;
            getDiagnostics.makeImmutable();
        }

        private GetDiagnostics() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static GetDiagnostics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetDiagnostics parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetDiagnostics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetDiagnostics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetDiagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetDiagnostics> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(DiagnosticsType diagnosticsType) {
            diagnosticsType.getClass();
            this.type_ = diagnosticsType.getNumber();
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
                    return new GetDiagnostics();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    GetDiagnostics getDiagnostics = (GetDiagnostics) obj2;
                    int i = this.type_;
                    boolean z = i != 0;
                    int i2 = getDiagnostics.type_;
                    this.type_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                        synchronized (GetDiagnostics.class) {
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

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.type_ != DiagnosticsType.LOG.getNumber() ? CodedOutputStream.computeEnumSize(1, this.type_) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass.GetDiagnosticsOrBuilder
        public DiagnosticsType getType() {
            DiagnosticsType forNumber = DiagnosticsType.forNumber(this.type_);
            return forNumber == null ? DiagnosticsType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass.GetDiagnosticsOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != DiagnosticsType.LOG.getNumber()) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<GetDiagnostics, Builder> implements GetDiagnosticsOrBuilder {
            private Builder() {
                super(GetDiagnostics.DEFAULT_INSTANCE);
            }

            public Builder clearType() {
                copyOnWrite();
                ((GetDiagnostics) this.instance).clearType();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass.GetDiagnosticsOrBuilder
            public DiagnosticsType getType() {
                return ((GetDiagnostics) this.instance).getType();
            }

            @Override // com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass.GetDiagnosticsOrBuilder
            public int getTypeValue() {
                return ((GetDiagnostics) this.instance).getTypeValue();
            }

            public Builder setType(DiagnosticsType diagnosticsType) {
                copyOnWrite();
                ((GetDiagnostics) this.instance).setType(diagnosticsType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((GetDiagnostics) this.instance).setTypeValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(GetDiagnostics getDiagnostics) {
            return DEFAULT_INSTANCE.createBuilder(getDiagnostics);
        }

        public static GetDiagnostics parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetDiagnostics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetDiagnostics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetDiagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetDiagnostics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetDiagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetDiagnostics parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetDiagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetDiagnostics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetDiagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetDiagnostics parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetDiagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetDiagnostics parseFrom(InputStream inputStream) throws IOException {
            return (GetDiagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetDiagnostics parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetDiagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetDiagnostics parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetDiagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetDiagnostics parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetDiagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotifyDiagnosticsAvailable extends GeneratedMessageLite<NotifyDiagnosticsAvailable, Builder> implements NotifyDiagnosticsAvailableOrBuilder {
        private static final NotifyDiagnosticsAvailable DEFAULT_INSTANCE;
        private static volatile Parser<NotifyDiagnosticsAvailable> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int type_;

        static {
            NotifyDiagnosticsAvailable notifyDiagnosticsAvailable = new NotifyDiagnosticsAvailable();
            DEFAULT_INSTANCE = notifyDiagnosticsAvailable;
            notifyDiagnosticsAvailable.makeImmutable();
        }

        private NotifyDiagnosticsAvailable() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static NotifyDiagnosticsAvailable getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyDiagnosticsAvailable parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NotifyDiagnosticsAvailable) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyDiagnosticsAvailable parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NotifyDiagnosticsAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NotifyDiagnosticsAvailable> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(DiagnosticsType diagnosticsType) {
            diagnosticsType.getClass();
            this.type_ = diagnosticsType.getNumber();
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
                    return new NotifyDiagnosticsAvailable();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    NotifyDiagnosticsAvailable notifyDiagnosticsAvailable = (NotifyDiagnosticsAvailable) obj2;
                    int i = this.type_;
                    boolean z = i != 0;
                    int i2 = notifyDiagnosticsAvailable.type_;
                    this.type_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                        synchronized (NotifyDiagnosticsAvailable.class) {
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

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.type_ != DiagnosticsType.LOG.getNumber() ? CodedOutputStream.computeEnumSize(1, this.type_) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass.NotifyDiagnosticsAvailableOrBuilder
        public DiagnosticsType getType() {
            DiagnosticsType forNumber = DiagnosticsType.forNumber(this.type_);
            return forNumber == null ? DiagnosticsType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass.NotifyDiagnosticsAvailableOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != DiagnosticsType.LOG.getNumber()) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NotifyDiagnosticsAvailable, Builder> implements NotifyDiagnosticsAvailableOrBuilder {
            private Builder() {
                super(NotifyDiagnosticsAvailable.DEFAULT_INSTANCE);
            }

            public Builder clearType() {
                copyOnWrite();
                ((NotifyDiagnosticsAvailable) this.instance).clearType();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass.NotifyDiagnosticsAvailableOrBuilder
            public DiagnosticsType getType() {
                return ((NotifyDiagnosticsAvailable) this.instance).getType();
            }

            @Override // com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass.NotifyDiagnosticsAvailableOrBuilder
            public int getTypeValue() {
                return ((NotifyDiagnosticsAvailable) this.instance).getTypeValue();
            }

            public Builder setType(DiagnosticsType diagnosticsType) {
                copyOnWrite();
                ((NotifyDiagnosticsAvailable) this.instance).setType(diagnosticsType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((NotifyDiagnosticsAvailable) this.instance).setTypeValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(NotifyDiagnosticsAvailable notifyDiagnosticsAvailable) {
            return DEFAULT_INSTANCE.createBuilder(notifyDiagnosticsAvailable);
        }

        public static NotifyDiagnosticsAvailable parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyDiagnosticsAvailable) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyDiagnosticsAvailable parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyDiagnosticsAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NotifyDiagnosticsAvailable parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NotifyDiagnosticsAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NotifyDiagnosticsAvailable parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyDiagnosticsAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NotifyDiagnosticsAvailable parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NotifyDiagnosticsAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotifyDiagnosticsAvailable parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyDiagnosticsAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NotifyDiagnosticsAvailable parseFrom(InputStream inputStream) throws IOException {
            return (NotifyDiagnosticsAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyDiagnosticsAvailable parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyDiagnosticsAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyDiagnosticsAvailable parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NotifyDiagnosticsAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NotifyDiagnosticsAvailable parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyDiagnosticsAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StopDiagnostics extends GeneratedMessageLite<StopDiagnostics, Builder> implements StopDiagnosticsOrBuilder {
        private static final StopDiagnostics DEFAULT_INSTANCE;
        public static final int ERROR_CODE_FIELD_NUMBER = 2;
        private static volatile Parser<StopDiagnostics> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int errorCode_;
        private int type_;

        static {
            StopDiagnostics stopDiagnostics = new StopDiagnostics();
            DEFAULT_INSTANCE = stopDiagnostics;
            stopDiagnostics.makeImmutable();
        }

        private StopDiagnostics() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorCode() {
            this.errorCode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static StopDiagnostics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StopDiagnostics parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StopDiagnostics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StopDiagnostics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StopDiagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StopDiagnostics> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCode(Common.ErrorCode errorCode) {
            errorCode.getClass();
            this.errorCode_ = errorCode.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCodeValue(int i) {
            this.errorCode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(DiagnosticsType diagnosticsType) {
            diagnosticsType.getClass();
            this.type_ = diagnosticsType.getNumber();
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
                    return new StopDiagnostics();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    StopDiagnostics stopDiagnostics = (StopDiagnostics) obj2;
                    int i = this.type_;
                    boolean z = i != 0;
                    int i2 = stopDiagnostics.type_;
                    this.type_ = visitor.visitInt(z, i, i2 != 0, i2);
                    int i3 = this.errorCode_;
                    boolean z2 = i3 != 0;
                    int i4 = stopDiagnostics.errorCode_;
                    this.errorCode_ = visitor.visitInt(z2, i3, i4 != 0, i4);
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
                                } else if (readTag == 16) {
                                    this.errorCode_ = codedInputStream.readEnum();
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
                        synchronized (StopDiagnostics.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass.StopDiagnosticsOrBuilder
        public Common.ErrorCode getErrorCode() {
            Common.ErrorCode forNumber = Common.ErrorCode.forNumber(this.errorCode_);
            return forNumber == null ? Common.ErrorCode.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass.StopDiagnosticsOrBuilder
        public int getErrorCodeValue() {
            return this.errorCode_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.type_ != DiagnosticsType.LOG.getNumber() ? CodedOutputStream.computeEnumSize(1, this.type_) : 0;
            if (this.errorCode_ != Common.ErrorCode.SUCCESS.getNumber()) {
                computeEnumSize += CodedOutputStream.computeEnumSize(2, this.errorCode_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass.StopDiagnosticsOrBuilder
        public DiagnosticsType getType() {
            DiagnosticsType forNumber = DiagnosticsType.forNumber(this.type_);
            return forNumber == null ? DiagnosticsType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass.StopDiagnosticsOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != DiagnosticsType.LOG.getNumber()) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            if (this.errorCode_ != Common.ErrorCode.SUCCESS.getNumber()) {
                codedOutputStream.writeEnum(2, this.errorCode_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<StopDiagnostics, Builder> implements StopDiagnosticsOrBuilder {
            private Builder() {
                super(StopDiagnostics.DEFAULT_INSTANCE);
            }

            public Builder clearErrorCode() {
                copyOnWrite();
                ((StopDiagnostics) this.instance).clearErrorCode();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((StopDiagnostics) this.instance).clearType();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass.StopDiagnosticsOrBuilder
            public Common.ErrorCode getErrorCode() {
                return ((StopDiagnostics) this.instance).getErrorCode();
            }

            @Override // com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass.StopDiagnosticsOrBuilder
            public int getErrorCodeValue() {
                return ((StopDiagnostics) this.instance).getErrorCodeValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass.StopDiagnosticsOrBuilder
            public DiagnosticsType getType() {
                return ((StopDiagnostics) this.instance).getType();
            }

            @Override // com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass.StopDiagnosticsOrBuilder
            public int getTypeValue() {
                return ((StopDiagnostics) this.instance).getTypeValue();
            }

            public Builder setErrorCode(Common.ErrorCode errorCode) {
                copyOnWrite();
                ((StopDiagnostics) this.instance).setErrorCode(errorCode);
                return this;
            }

            public Builder setErrorCodeValue(int i) {
                copyOnWrite();
                ((StopDiagnostics) this.instance).setErrorCodeValue(i);
                return this;
            }

            public Builder setType(DiagnosticsType diagnosticsType) {
                copyOnWrite();
                ((StopDiagnostics) this.instance).setType(diagnosticsType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((StopDiagnostics) this.instance).setTypeValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(StopDiagnostics stopDiagnostics) {
            return DEFAULT_INSTANCE.createBuilder(stopDiagnostics);
        }

        public static StopDiagnostics parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopDiagnostics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StopDiagnostics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopDiagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StopDiagnostics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StopDiagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StopDiagnostics parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopDiagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StopDiagnostics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StopDiagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StopDiagnostics parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopDiagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StopDiagnostics parseFrom(InputStream inputStream) throws IOException {
            return (StopDiagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StopDiagnostics parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopDiagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StopDiagnostics parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StopDiagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StopDiagnostics parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopDiagnostics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DiagnosticsType implements Internal.EnumLite {
        LOG(0),
        CRASH_REPORT(1),
        SENSOR_DATA(2),
        METRICS(3),
        UNRECOGNIZED(-1);

        public static final int CRASH_REPORT_VALUE = 1;
        public static final int LOG_VALUE = 0;
        public static final int METRICS_VALUE = 3;
        public static final int SENSOR_DATA_VALUE = 2;
        private static final Internal.EnumLiteMap<DiagnosticsType> internalValueMap = new Internal.EnumLiteMap<DiagnosticsType>() { // from class: com.amazon.alexa.accessory.protocol.DiagnosticsOuterClass.DiagnosticsType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public DiagnosticsType findValueByNumber(int i) {
                return DiagnosticsType.forNumber(i);
            }
        };
        private final int value;

        DiagnosticsType(int i) {
            this.value = i;
        }

        public static DiagnosticsType forNumber(int i) {
            if (i == 0) {
                return LOG;
            }
            if (i == 1) {
                return CRASH_REPORT;
            }
            if (i == 2) {
                return SENSOR_DATA;
            }
            if (i != 3) {
                return null;
            }
            return METRICS;
        }

        public static Internal.EnumLiteMap<DiagnosticsType> internalGetValueMap() {
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
        public static DiagnosticsType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
