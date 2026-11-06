package com.amazon.alexa.accessory.protocol;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
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
public final class Translation {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.Translation$1, reason: invalid class name */
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
    public interface PauseTranslationOrBuilder extends MessageLiteOrBuilder {
        String getSessionId();

        ByteString getSessionIdBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ProvideTranslationOrBuilder extends MessageLiteOrBuilder {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ResumeTranslationOrBuilder extends MessageLiteOrBuilder {
        String getSessionId();

        ByteString getSessionIdBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StartTranslationOrBuilder extends MessageLiteOrBuilder {
        String getSessionId();

        ByteString getSessionIdBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StopTranslationOrBuilder extends MessageLiteOrBuilder {
        TranslationErrorCode getErrorCode();

        int getErrorCodeValue();

        String getSessionId();

        ByteString getSessionIdBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface TranslationResultOrBuilder extends MessageLiteOrBuilder {
        TranslationAction getAction();

        int getActionValue();

        TranslationErrorCode getErrorCode();

        int getErrorCodeValue();

        String getSessionId();

        ByteString getSessionIdBytes();
    }

    private Translation() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class PauseTranslation extends GeneratedMessageLite<PauseTranslation, Builder> implements PauseTranslationOrBuilder {
        private static final PauseTranslation DEFAULT_INSTANCE;
        private static volatile Parser<PauseTranslation> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private String sessionId_ = "";

        static {
            PauseTranslation pauseTranslation = new PauseTranslation();
            DEFAULT_INSTANCE = pauseTranslation;
            pauseTranslation.makeImmutable();
        }

        private PauseTranslation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        public static PauseTranslation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PauseTranslation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PauseTranslation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PauseTranslation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PauseTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PauseTranslation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionIdBytes(ByteString byteString) {
            this.sessionId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new PauseTranslation();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.sessionId_ = ((GeneratedMessageLite.Visitor) obj).visitString(!this.sessionId_.isEmpty(), this.sessionId_, !r6.sessionId_.isEmpty(), ((PauseTranslation) obj2).sessionId_);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (i == 0) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.sessionId_ = codedInputStream.readStringRequireUtf8();
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            i = 1;
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
                        synchronized (PauseTranslation.class) {
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
            int serializedSize = this.unknownFields.getSerializedSize() + (!this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Translation.PauseTranslationOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Translation.PauseTranslationOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<PauseTranslation, Builder> implements PauseTranslationOrBuilder {
            private Builder() {
                super(PauseTranslation.DEFAULT_INSTANCE);
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((PauseTranslation) this.instance).clearSessionId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Translation.PauseTranslationOrBuilder
            public String getSessionId() {
                return ((PauseTranslation) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Translation.PauseTranslationOrBuilder
            public ByteString getSessionIdBytes() {
                return ((PauseTranslation) this.instance).getSessionIdBytes();
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((PauseTranslation) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((PauseTranslation) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(PauseTranslation pauseTranslation) {
            return DEFAULT_INSTANCE.createBuilder(pauseTranslation);
        }

        public static PauseTranslation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PauseTranslation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PauseTranslation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PauseTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PauseTranslation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PauseTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PauseTranslation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PauseTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PauseTranslation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PauseTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PauseTranslation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PauseTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PauseTranslation parseFrom(InputStream inputStream) throws IOException {
            return (PauseTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PauseTranslation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PauseTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PauseTranslation parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PauseTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PauseTranslation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PauseTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ProvideTranslation extends GeneratedMessageLite<ProvideTranslation, Builder> implements ProvideTranslationOrBuilder {
        private static final ProvideTranslation DEFAULT_INSTANCE;
        private static volatile Parser<ProvideTranslation> PARSER;

        static {
            ProvideTranslation provideTranslation = new ProvideTranslation();
            DEFAULT_INSTANCE = provideTranslation;
            provideTranslation.makeImmutable();
        }

        private ProvideTranslation() {
        }

        public static ProvideTranslation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ProvideTranslation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ProvideTranslation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProvideTranslation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ProvideTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ProvideTranslation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ProvideTranslation();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (i == 0) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag == 0 || !parseUnknownField(readTag, codedInputStream)) {
                                i = 1;
                            }
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
                        synchronized (ProvideTranslation.class) {
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
            int serializedSize = this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<ProvideTranslation, Builder> implements ProvideTranslationOrBuilder {
            private Builder() {
                super(ProvideTranslation.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(ProvideTranslation provideTranslation) {
            return DEFAULT_INSTANCE.createBuilder(provideTranslation);
        }

        public static ProvideTranslation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ProvideTranslation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProvideTranslation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ProvideTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ProvideTranslation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ProvideTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ProvideTranslation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ProvideTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ProvideTranslation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ProvideTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ProvideTranslation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ProvideTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ProvideTranslation parseFrom(InputStream inputStream) throws IOException {
            return (ProvideTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProvideTranslation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ProvideTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProvideTranslation parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ProvideTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ProvideTranslation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ProvideTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ResumeTranslation extends GeneratedMessageLite<ResumeTranslation, Builder> implements ResumeTranslationOrBuilder {
        private static final ResumeTranslation DEFAULT_INSTANCE;
        private static volatile Parser<ResumeTranslation> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private String sessionId_ = "";

        static {
            ResumeTranslation resumeTranslation = new ResumeTranslation();
            DEFAULT_INSTANCE = resumeTranslation;
            resumeTranslation.makeImmutable();
        }

        private ResumeTranslation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        public static ResumeTranslation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ResumeTranslation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ResumeTranslation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResumeTranslation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ResumeTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ResumeTranslation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionIdBytes(ByteString byteString) {
            this.sessionId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ResumeTranslation();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.sessionId_ = ((GeneratedMessageLite.Visitor) obj).visitString(!this.sessionId_.isEmpty(), this.sessionId_, !r6.sessionId_.isEmpty(), ((ResumeTranslation) obj2).sessionId_);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (i == 0) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.sessionId_ = codedInputStream.readStringRequireUtf8();
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            i = 1;
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
                        synchronized (ResumeTranslation.class) {
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
            int serializedSize = this.unknownFields.getSerializedSize() + (!this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Translation.ResumeTranslationOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Translation.ResumeTranslationOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<ResumeTranslation, Builder> implements ResumeTranslationOrBuilder {
            private Builder() {
                super(ResumeTranslation.DEFAULT_INSTANCE);
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((ResumeTranslation) this.instance).clearSessionId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Translation.ResumeTranslationOrBuilder
            public String getSessionId() {
                return ((ResumeTranslation) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Translation.ResumeTranslationOrBuilder
            public ByteString getSessionIdBytes() {
                return ((ResumeTranslation) this.instance).getSessionIdBytes();
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((ResumeTranslation) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((ResumeTranslation) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(ResumeTranslation resumeTranslation) {
            return DEFAULT_INSTANCE.createBuilder(resumeTranslation);
        }

        public static ResumeTranslation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResumeTranslation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ResumeTranslation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResumeTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ResumeTranslation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ResumeTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ResumeTranslation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResumeTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ResumeTranslation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ResumeTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ResumeTranslation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResumeTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ResumeTranslation parseFrom(InputStream inputStream) throws IOException {
            return (ResumeTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResumeTranslation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResumeTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ResumeTranslation parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ResumeTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ResumeTranslation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResumeTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StartTranslation extends GeneratedMessageLite<StartTranslation, Builder> implements StartTranslationOrBuilder {
        private static final StartTranslation DEFAULT_INSTANCE;
        private static volatile Parser<StartTranslation> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private String sessionId_ = "";

        static {
            StartTranslation startTranslation = new StartTranslation();
            DEFAULT_INSTANCE = startTranslation;
            startTranslation.makeImmutable();
        }

        private StartTranslation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        public static StartTranslation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StartTranslation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StartTranslation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartTranslation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StartTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StartTranslation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionIdBytes(ByteString byteString) {
            this.sessionId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StartTranslation();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.sessionId_ = ((GeneratedMessageLite.Visitor) obj).visitString(!this.sessionId_.isEmpty(), this.sessionId_, !r6.sessionId_.isEmpty(), ((StartTranslation) obj2).sessionId_);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (i == 0) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.sessionId_ = codedInputStream.readStringRequireUtf8();
                                } else if (!parseUnknownField(readTag, codedInputStream)) {
                                }
                            }
                            i = 1;
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
                        synchronized (StartTranslation.class) {
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
            int serializedSize = this.unknownFields.getSerializedSize() + (!this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Translation.StartTranslationOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Translation.StartTranslationOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<StartTranslation, Builder> implements StartTranslationOrBuilder {
            private Builder() {
                super(StartTranslation.DEFAULT_INSTANCE);
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((StartTranslation) this.instance).clearSessionId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Translation.StartTranslationOrBuilder
            public String getSessionId() {
                return ((StartTranslation) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Translation.StartTranslationOrBuilder
            public ByteString getSessionIdBytes() {
                return ((StartTranslation) this.instance).getSessionIdBytes();
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((StartTranslation) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((StartTranslation) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(StartTranslation startTranslation) {
            return DEFAULT_INSTANCE.createBuilder(startTranslation);
        }

        public static StartTranslation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartTranslation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartTranslation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StartTranslation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StartTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StartTranslation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StartTranslation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StartTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StartTranslation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StartTranslation parseFrom(InputStream inputStream) throws IOException {
            return (StartTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartTranslation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartTranslation parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StartTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StartTranslation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StopTranslation extends GeneratedMessageLite<StopTranslation, Builder> implements StopTranslationOrBuilder {
        private static final StopTranslation DEFAULT_INSTANCE;
        public static final int ERROR_CODE_FIELD_NUMBER = 2;
        private static volatile Parser<StopTranslation> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private int errorCode_;
        private String sessionId_ = "";

        static {
            StopTranslation stopTranslation = new StopTranslation();
            DEFAULT_INSTANCE = stopTranslation;
            stopTranslation.makeImmutable();
        }

        private StopTranslation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorCode() {
            this.errorCode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        public static StopTranslation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StopTranslation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StopTranslation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StopTranslation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StopTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StopTranslation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCode(TranslationErrorCode translationErrorCode) {
            translationErrorCode.getClass();
            this.errorCode_ = translationErrorCode.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCodeValue(int i) {
            this.errorCode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionIdBytes(ByteString byteString) {
            this.sessionId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StopTranslation();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    StopTranslation stopTranslation = (StopTranslation) obj2;
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, !stopTranslation.sessionId_.isEmpty(), stopTranslation.sessionId_);
                    int i = this.errorCode_;
                    boolean z = i != 0;
                    int i2 = stopTranslation.errorCode_;
                    this.errorCode_ = visitor.visitInt(z, i, i2 != 0, i2);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.sessionId_ = codedInputStream.readStringRequireUtf8();
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
                        synchronized (StopTranslation.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Translation.StopTranslationOrBuilder
        public TranslationErrorCode getErrorCode() {
            TranslationErrorCode forNumber = TranslationErrorCode.forNumber(this.errorCode_);
            return forNumber == null ? TranslationErrorCode.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Translation.StopTranslationOrBuilder
        public int getErrorCodeValue() {
            return this.errorCode_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0;
            if (this.errorCode_ != TranslationErrorCode.TRANSLATION_ERROR_UNKNOWN.getNumber()) {
                computeStringSize += CodedOutputStream.computeEnumSize(2, this.errorCode_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Translation.StopTranslationOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Translation.StopTranslationOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            if (this.errorCode_ != TranslationErrorCode.TRANSLATION_ERROR_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(2, this.errorCode_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<StopTranslation, Builder> implements StopTranslationOrBuilder {
            private Builder() {
                super(StopTranslation.DEFAULT_INSTANCE);
            }

            public Builder clearErrorCode() {
                copyOnWrite();
                ((StopTranslation) this.instance).clearErrorCode();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((StopTranslation) this.instance).clearSessionId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Translation.StopTranslationOrBuilder
            public TranslationErrorCode getErrorCode() {
                return ((StopTranslation) this.instance).getErrorCode();
            }

            @Override // com.amazon.alexa.accessory.protocol.Translation.StopTranslationOrBuilder
            public int getErrorCodeValue() {
                return ((StopTranslation) this.instance).getErrorCodeValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Translation.StopTranslationOrBuilder
            public String getSessionId() {
                return ((StopTranslation) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Translation.StopTranslationOrBuilder
            public ByteString getSessionIdBytes() {
                return ((StopTranslation) this.instance).getSessionIdBytes();
            }

            public Builder setErrorCode(TranslationErrorCode translationErrorCode) {
                copyOnWrite();
                ((StopTranslation) this.instance).setErrorCode(translationErrorCode);
                return this;
            }

            public Builder setErrorCodeValue(int i) {
                copyOnWrite();
                ((StopTranslation) this.instance).setErrorCodeValue(i);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((StopTranslation) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((StopTranslation) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(StopTranslation stopTranslation) {
            return DEFAULT_INSTANCE.createBuilder(stopTranslation);
        }

        public static StopTranslation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopTranslation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StopTranslation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StopTranslation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StopTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StopTranslation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StopTranslation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StopTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StopTranslation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StopTranslation parseFrom(InputStream inputStream) throws IOException {
            return (StopTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StopTranslation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StopTranslation parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StopTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StopTranslation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopTranslation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TranslationResult extends GeneratedMessageLite<TranslationResult, Builder> implements TranslationResultOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 3;
        private static final TranslationResult DEFAULT_INSTANCE;
        public static final int ERROR_CODE_FIELD_NUMBER = 2;
        private static volatile Parser<TranslationResult> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private int action_;
        private int errorCode_;
        private String sessionId_ = "";

        static {
            TranslationResult translationResult = new TranslationResult();
            DEFAULT_INSTANCE = translationResult;
            translationResult.makeImmutable();
        }

        private TranslationResult() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorCode() {
            this.errorCode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        public static TranslationResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TranslationResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TranslationResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TranslationResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TranslationResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<TranslationResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(TranslationAction translationAction) {
            translationAction.getClass();
            this.action_ = translationAction.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionValue(int i) {
            this.action_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCode(TranslationErrorCode translationErrorCode) {
            translationErrorCode.getClass();
            this.errorCode_ = translationErrorCode.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCodeValue(int i) {
            this.errorCode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionIdBytes(ByteString byteString) {
            this.sessionId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new TranslationResult();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    TranslationResult translationResult = (TranslationResult) obj2;
                    this.sessionId_ = visitor.visitString(!this.sessionId_.isEmpty(), this.sessionId_, !translationResult.sessionId_.isEmpty(), translationResult.sessionId_);
                    int i = this.errorCode_;
                    boolean z = i != 0;
                    int i2 = translationResult.errorCode_;
                    this.errorCode_ = visitor.visitInt(z, i, i2 != 0, i2);
                    int i3 = this.action_;
                    boolean z2 = i3 != 0;
                    int i4 = translationResult.action_;
                    this.action_ = visitor.visitInt(z2, i3, i4 != 0, i4);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.sessionId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 16) {
                                    this.errorCode_ = codedInputStream.readEnum();
                                } else if (readTag == 24) {
                                    this.action_ = codedInputStream.readEnum();
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
                        synchronized (TranslationResult.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Translation.TranslationResultOrBuilder
        public TranslationAction getAction() {
            TranslationAction forNumber = TranslationAction.forNumber(this.action_);
            return forNumber == null ? TranslationAction.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Translation.TranslationResultOrBuilder
        public int getActionValue() {
            return this.action_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Translation.TranslationResultOrBuilder
        public TranslationErrorCode getErrorCode() {
            TranslationErrorCode forNumber = TranslationErrorCode.forNumber(this.errorCode_);
            return forNumber == null ? TranslationErrorCode.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Translation.TranslationResultOrBuilder
        public int getErrorCodeValue() {
            return this.errorCode_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.sessionId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getSessionId()) : 0;
            if (this.errorCode_ != TranslationErrorCode.TRANSLATION_ERROR_UNKNOWN.getNumber()) {
                computeStringSize += CodedOutputStream.computeEnumSize(2, this.errorCode_);
            }
            if (this.action_ != TranslationAction.TRANSLATION_ACTION_UNKNOWN.getNumber()) {
                computeStringSize += CodedOutputStream.computeEnumSize(3, this.action_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Translation.TranslationResultOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Translation.TranslationResultOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.sessionId_.isEmpty()) {
                codedOutputStream.writeString(1, getSessionId());
            }
            if (this.errorCode_ != TranslationErrorCode.TRANSLATION_ERROR_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(2, this.errorCode_);
            }
            if (this.action_ != TranslationAction.TRANSLATION_ACTION_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(3, this.action_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<TranslationResult, Builder> implements TranslationResultOrBuilder {
            private Builder() {
                super(TranslationResult.DEFAULT_INSTANCE);
            }

            public Builder clearAction() {
                copyOnWrite();
                ((TranslationResult) this.instance).clearAction();
                return this;
            }

            public Builder clearErrorCode() {
                copyOnWrite();
                ((TranslationResult) this.instance).clearErrorCode();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((TranslationResult) this.instance).clearSessionId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Translation.TranslationResultOrBuilder
            public TranslationAction getAction() {
                return ((TranslationResult) this.instance).getAction();
            }

            @Override // com.amazon.alexa.accessory.protocol.Translation.TranslationResultOrBuilder
            public int getActionValue() {
                return ((TranslationResult) this.instance).getActionValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Translation.TranslationResultOrBuilder
            public TranslationErrorCode getErrorCode() {
                return ((TranslationResult) this.instance).getErrorCode();
            }

            @Override // com.amazon.alexa.accessory.protocol.Translation.TranslationResultOrBuilder
            public int getErrorCodeValue() {
                return ((TranslationResult) this.instance).getErrorCodeValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Translation.TranslationResultOrBuilder
            public String getSessionId() {
                return ((TranslationResult) this.instance).getSessionId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Translation.TranslationResultOrBuilder
            public ByteString getSessionIdBytes() {
                return ((TranslationResult) this.instance).getSessionIdBytes();
            }

            public Builder setAction(TranslationAction translationAction) {
                copyOnWrite();
                ((TranslationResult) this.instance).setAction(translationAction);
                return this;
            }

            public Builder setActionValue(int i) {
                copyOnWrite();
                ((TranslationResult) this.instance).setActionValue(i);
                return this;
            }

            public Builder setErrorCode(TranslationErrorCode translationErrorCode) {
                copyOnWrite();
                ((TranslationResult) this.instance).setErrorCode(translationErrorCode);
                return this;
            }

            public Builder setErrorCodeValue(int i) {
                copyOnWrite();
                ((TranslationResult) this.instance).setErrorCodeValue(i);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((TranslationResult) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((TranslationResult) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(TranslationResult translationResult) {
            return DEFAULT_INSTANCE.createBuilder(translationResult);
        }

        public static TranslationResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TranslationResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TranslationResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TranslationResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TranslationResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TranslationResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TranslationResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TranslationResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TranslationResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TranslationResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TranslationResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TranslationResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TranslationResult parseFrom(InputStream inputStream) throws IOException {
            return (TranslationResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TranslationResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TranslationResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TranslationResult parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TranslationResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TranslationResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TranslationResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TranslationAction implements Internal.EnumLite {
        TRANSLATION_ACTION_UNKNOWN(0),
        TRANSLATION_ACTION_START(1),
        TRANSLATION_ACTION_STOP(2),
        TRANSLATION_ACTION_PAUSE(3),
        TRANSLATION_ACTION_RESUME(4),
        UNRECOGNIZED(-1);

        public static final int TRANSLATION_ACTION_PAUSE_VALUE = 3;
        public static final int TRANSLATION_ACTION_RESUME_VALUE = 4;
        public static final int TRANSLATION_ACTION_START_VALUE = 1;
        public static final int TRANSLATION_ACTION_STOP_VALUE = 2;
        public static final int TRANSLATION_ACTION_UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<TranslationAction> internalValueMap = new Internal.EnumLiteMap<TranslationAction>() { // from class: com.amazon.alexa.accessory.protocol.Translation.TranslationAction.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public TranslationAction findValueByNumber(int i) {
                return TranslationAction.forNumber(i);
            }
        };
        private final int value;

        TranslationAction(int i) {
            this.value = i;
        }

        public static TranslationAction forNumber(int i) {
            if (i == 0) {
                return TRANSLATION_ACTION_UNKNOWN;
            }
            if (i == 1) {
                return TRANSLATION_ACTION_START;
            }
            if (i == 2) {
                return TRANSLATION_ACTION_STOP;
            }
            if (i == 3) {
                return TRANSLATION_ACTION_PAUSE;
            }
            if (i != 4) {
                return null;
            }
            return TRANSLATION_ACTION_RESUME;
        }

        public static Internal.EnumLiteMap<TranslationAction> internalGetValueMap() {
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
        public static TranslationAction valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TranslationErrorCode implements Internal.EnumLite {
        TRANSLATION_ERROR_UNKNOWN(0),
        TRANSLATION_SUCCESS(1),
        TRANSLATION_ERROR_USER_CANCELLED(2),
        TRANSLATION_ERROR_INTERNAL(3),
        TRANSLATION_CONNECTION_LOST(4),
        TRANSLATION_CONNECTION_REFUSED(5),
        UNRECOGNIZED(-1);

        public static final int TRANSLATION_CONNECTION_LOST_VALUE = 4;
        public static final int TRANSLATION_CONNECTION_REFUSED_VALUE = 5;
        public static final int TRANSLATION_ERROR_INTERNAL_VALUE = 3;
        public static final int TRANSLATION_ERROR_UNKNOWN_VALUE = 0;
        public static final int TRANSLATION_ERROR_USER_CANCELLED_VALUE = 2;
        public static final int TRANSLATION_SUCCESS_VALUE = 1;
        private static final Internal.EnumLiteMap<TranslationErrorCode> internalValueMap = new Internal.EnumLiteMap<TranslationErrorCode>() { // from class: com.amazon.alexa.accessory.protocol.Translation.TranslationErrorCode.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public TranslationErrorCode findValueByNumber(int i) {
                return TranslationErrorCode.forNumber(i);
            }
        };
        private final int value;

        TranslationErrorCode(int i) {
            this.value = i;
        }

        public static TranslationErrorCode forNumber(int i) {
            if (i == 0) {
                return TRANSLATION_ERROR_UNKNOWN;
            }
            if (i == 1) {
                return TRANSLATION_SUCCESS;
            }
            if (i == 2) {
                return TRANSLATION_ERROR_USER_CANCELLED;
            }
            if (i == 3) {
                return TRANSLATION_ERROR_INTERNAL;
            }
            if (i == 4) {
                return TRANSLATION_CONNECTION_LOST;
            }
            if (i != 5) {
                return null;
            }
            return TRANSLATION_CONNECTION_REFUSED;
        }

        public static Internal.EnumLiteMap<TranslationErrorCode> internalGetValueMap() {
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
        public static TranslationErrorCode valueOf(int i) {
            return forNumber(i);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
