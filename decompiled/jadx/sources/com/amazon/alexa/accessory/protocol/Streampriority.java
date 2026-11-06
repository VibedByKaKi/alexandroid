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
public final class Streampriority {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.Streampriority$1, reason: invalid class name */
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
    public interface ResetStreamPriorityOrBuilder extends MessageLiteOrBuilder {
        Common.StreamIdentifier getId();

        int getIdValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SetStreamPriorityOrBuilder extends MessageLiteOrBuilder {
        Common.StreamIdentifier getId();

        int getIdValue();

        StreamPriority getPriority();

        int getPriorityValue();
    }

    private Streampriority() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ResetStreamPriority extends GeneratedMessageLite<ResetStreamPriority, Builder> implements ResetStreamPriorityOrBuilder {
        private static final ResetStreamPriority DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile Parser<ResetStreamPriority> PARSER;
        private int id_;

        static {
            ResetStreamPriority resetStreamPriority = new ResetStreamPriority();
            DEFAULT_INSTANCE = resetStreamPriority;
            resetStreamPriority.makeImmutable();
        }

        private ResetStreamPriority() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0;
        }

        public static ResetStreamPriority getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ResetStreamPriority parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ResetStreamPriority) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResetStreamPriority parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ResetStreamPriority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ResetStreamPriority> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(Common.StreamIdentifier streamIdentifier) {
            streamIdentifier.getClass();
            this.id_ = streamIdentifier.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdValue(int i) {
            this.id_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ResetStreamPriority();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    ResetStreamPriority resetStreamPriority = (ResetStreamPriority) obj2;
                    int i = this.id_;
                    boolean z = i != 0;
                    int i2 = resetStreamPriority.id_;
                    this.id_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    this.id_ = codedInputStream.readEnum();
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
                        synchronized (ResetStreamPriority.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Streampriority.ResetStreamPriorityOrBuilder
        public Common.StreamIdentifier getId() {
            Common.StreamIdentifier forNumber = Common.StreamIdentifier.forNumber(this.id_);
            return forNumber == null ? Common.StreamIdentifier.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Streampriority.ResetStreamPriorityOrBuilder
        public int getIdValue() {
            return this.id_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.id_ != Common.StreamIdentifier.CONTROL.getNumber() ? CodedOutputStream.computeEnumSize(1, this.id_) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.id_ != Common.StreamIdentifier.CONTROL.getNumber()) {
                codedOutputStream.writeEnum(1, this.id_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<ResetStreamPriority, Builder> implements ResetStreamPriorityOrBuilder {
            private Builder() {
                super(ResetStreamPriority.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((ResetStreamPriority) this.instance).clearId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Streampriority.ResetStreamPriorityOrBuilder
            public Common.StreamIdentifier getId() {
                return ((ResetStreamPriority) this.instance).getId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Streampriority.ResetStreamPriorityOrBuilder
            public int getIdValue() {
                return ((ResetStreamPriority) this.instance).getIdValue();
            }

            public Builder setId(Common.StreamIdentifier streamIdentifier) {
                copyOnWrite();
                ((ResetStreamPriority) this.instance).setId(streamIdentifier);
                return this;
            }

            public Builder setIdValue(int i) {
                copyOnWrite();
                ((ResetStreamPriority) this.instance).setIdValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(ResetStreamPriority resetStreamPriority) {
            return DEFAULT_INSTANCE.createBuilder(resetStreamPriority);
        }

        public static ResetStreamPriority parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResetStreamPriority) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ResetStreamPriority parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResetStreamPriority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ResetStreamPriority parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ResetStreamPriority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ResetStreamPriority parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResetStreamPriority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ResetStreamPriority parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ResetStreamPriority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ResetStreamPriority parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResetStreamPriority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ResetStreamPriority parseFrom(InputStream inputStream) throws IOException {
            return (ResetStreamPriority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResetStreamPriority parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResetStreamPriority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ResetStreamPriority parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ResetStreamPriority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ResetStreamPriority parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResetStreamPriority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SetStreamPriority extends GeneratedMessageLite<SetStreamPriority, Builder> implements SetStreamPriorityOrBuilder {
        private static final SetStreamPriority DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile Parser<SetStreamPriority> PARSER = null;
        public static final int PRIORITY_FIELD_NUMBER = 2;
        private int id_;
        private int priority_;

        static {
            SetStreamPriority setStreamPriority = new SetStreamPriority();
            DEFAULT_INSTANCE = setStreamPriority;
            setStreamPriority.makeImmutable();
        }

        private SetStreamPriority() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPriority() {
            this.priority_ = 0;
        }

        public static SetStreamPriority getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SetStreamPriority parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SetStreamPriority) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SetStreamPriority parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SetStreamPriority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SetStreamPriority> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(Common.StreamIdentifier streamIdentifier) {
            streamIdentifier.getClass();
            this.id_ = streamIdentifier.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdValue(int i) {
            this.id_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPriority(StreamPriority streamPriority) {
            streamPriority.getClass();
            this.priority_ = streamPriority.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPriorityValue(int i) {
            this.priority_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SetStreamPriority();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    SetStreamPriority setStreamPriority = (SetStreamPriority) obj2;
                    int i = this.id_;
                    boolean z = i != 0;
                    int i2 = setStreamPriority.id_;
                    this.id_ = visitor.visitInt(z, i, i2 != 0, i2);
                    int i3 = this.priority_;
                    boolean z2 = i3 != 0;
                    int i4 = setStreamPriority.priority_;
                    this.priority_ = visitor.visitInt(z2, i3, i4 != 0, i4);
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
                                    this.id_ = codedInputStream.readEnum();
                                } else if (readTag == 16) {
                                    this.priority_ = codedInputStream.readEnum();
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
                        synchronized (SetStreamPriority.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Streampriority.SetStreamPriorityOrBuilder
        public Common.StreamIdentifier getId() {
            Common.StreamIdentifier forNumber = Common.StreamIdentifier.forNumber(this.id_);
            return forNumber == null ? Common.StreamIdentifier.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Streampriority.SetStreamPriorityOrBuilder
        public int getIdValue() {
            return this.id_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Streampriority.SetStreamPriorityOrBuilder
        public StreamPriority getPriority() {
            StreamPriority forNumber = StreamPriority.forNumber(this.priority_);
            return forNumber == null ? StreamPriority.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Streampriority.SetStreamPriorityOrBuilder
        public int getPriorityValue() {
            return this.priority_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.id_ != Common.StreamIdentifier.CONTROL.getNumber() ? CodedOutputStream.computeEnumSize(1, this.id_) : 0;
            if (this.priority_ != StreamPriority.URGENT.getNumber()) {
                computeEnumSize += CodedOutputStream.computeEnumSize(2, this.priority_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.id_ != Common.StreamIdentifier.CONTROL.getNumber()) {
                codedOutputStream.writeEnum(1, this.id_);
            }
            if (this.priority_ != StreamPriority.URGENT.getNumber()) {
                codedOutputStream.writeEnum(2, this.priority_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SetStreamPriority, Builder> implements SetStreamPriorityOrBuilder {
            private Builder() {
                super(SetStreamPriority.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((SetStreamPriority) this.instance).clearId();
                return this;
            }

            public Builder clearPriority() {
                copyOnWrite();
                ((SetStreamPriority) this.instance).clearPriority();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Streampriority.SetStreamPriorityOrBuilder
            public Common.StreamIdentifier getId() {
                return ((SetStreamPriority) this.instance).getId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Streampriority.SetStreamPriorityOrBuilder
            public int getIdValue() {
                return ((SetStreamPriority) this.instance).getIdValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Streampriority.SetStreamPriorityOrBuilder
            public StreamPriority getPriority() {
                return ((SetStreamPriority) this.instance).getPriority();
            }

            @Override // com.amazon.alexa.accessory.protocol.Streampriority.SetStreamPriorityOrBuilder
            public int getPriorityValue() {
                return ((SetStreamPriority) this.instance).getPriorityValue();
            }

            public Builder setId(Common.StreamIdentifier streamIdentifier) {
                copyOnWrite();
                ((SetStreamPriority) this.instance).setId(streamIdentifier);
                return this;
            }

            public Builder setIdValue(int i) {
                copyOnWrite();
                ((SetStreamPriority) this.instance).setIdValue(i);
                return this;
            }

            public Builder setPriority(StreamPriority streamPriority) {
                copyOnWrite();
                ((SetStreamPriority) this.instance).setPriority(streamPriority);
                return this;
            }

            public Builder setPriorityValue(int i) {
                copyOnWrite();
                ((SetStreamPriority) this.instance).setPriorityValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(SetStreamPriority setStreamPriority) {
            return DEFAULT_INSTANCE.createBuilder(setStreamPriority);
        }

        public static SetStreamPriority parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetStreamPriority) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SetStreamPriority parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetStreamPriority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SetStreamPriority parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SetStreamPriority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SetStreamPriority parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetStreamPriority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SetStreamPriority parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SetStreamPriority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SetStreamPriority parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetStreamPriority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SetStreamPriority parseFrom(InputStream inputStream) throws IOException {
            return (SetStreamPriority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SetStreamPriority parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetStreamPriority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SetStreamPriority parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SetStreamPriority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SetStreamPriority parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetStreamPriority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum StreamPriority implements Internal.EnumLite {
        URGENT(0),
        AUDIO(1),
        FOREGROUND(2),
        BACKGROUND(3),
        NONE_PRIORITY(4),
        UNRECOGNIZED(-1);

        public static final int AUDIO_VALUE = 1;
        public static final int BACKGROUND_VALUE = 3;
        public static final int FOREGROUND_VALUE = 2;
        public static final int NONE_PRIORITY_VALUE = 4;
        public static final int URGENT_VALUE = 0;
        private static final Internal.EnumLiteMap<StreamPriority> internalValueMap = new Internal.EnumLiteMap<StreamPriority>() { // from class: com.amazon.alexa.accessory.protocol.Streampriority.StreamPriority.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public StreamPriority findValueByNumber(int i) {
                return StreamPriority.forNumber(i);
            }
        };
        private final int value;

        StreamPriority(int i) {
            this.value = i;
        }

        public static StreamPriority forNumber(int i) {
            if (i == 0) {
                return URGENT;
            }
            if (i == 1) {
                return AUDIO;
            }
            if (i == 2) {
                return FOREGROUND;
            }
            if (i == 3) {
                return BACKGROUND;
            }
            if (i != 4) {
                return null;
            }
            return NONE_PRIORITY;
        }

        public static Internal.EnumLiteMap<StreamPriority> internalGetValueMap() {
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
        public static StreamPriority valueOf(int i) {
            return forNumber(i);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
