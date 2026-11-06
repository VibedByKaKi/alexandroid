package com.amazon.alexa.accessory.protocol;

import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.accessory.protocol.Speech;
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
public final class Lcrc {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.Lcrc$1, reason: invalid class name */
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
    public interface NotifyReserveResponseOrBuilder extends MessageLiteOrBuilder {
        String getDecisionTimestampEpoch();

        ByteString getDecisionTimestampEpochBytes();

        Speech.Dialog getDialog();

        CoordinationPolicy getSenderCoordinationPolicy();

        int getSenderCoordinationPolicyValue();

        boolean hasDialog();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NotifyReserveResponseResultOrBuilder extends MessageLiteOrBuilder {
        String getDecisionTimestampEpoch();

        ByteString getDecisionTimestampEpochBytes();

        Speech.Dialog getDialog();

        CoordinationResult getResult();

        int getResultValue();

        boolean hasDialog();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NotifyResponseStartStatusOrBuilder extends MessageLiteOrBuilder {
        String getDecisionTimestampEpoch();

        ByteString getDecisionTimestampEpochBytes();

        Speech.Dialog getDialog();

        Common.ErrorCode getErrorCode();

        int getErrorCodeValue();

        boolean hasDialog();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ReserveResponseOrBuilder extends MessageLiteOrBuilder {
        String getDecisionTimestampEpoch();

        ByteString getDecisionTimestampEpochBytes();

        Speech.Dialog getDialog();

        CoordinationPolicy getSenderCoordinationPolicy();

        int getSenderCoordinationPolicyValue();

        boolean hasDialog();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ReserveResponseResultOrBuilder extends MessageLiteOrBuilder {
        String getDecisionTimestampEpoch();

        ByteString getDecisionTimestampEpochBytes();

        Speech.Dialog getDialog();

        CoordinationResult getResult();

        int getResultValue();

        boolean hasDialog();
    }

    private Lcrc() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotifyReserveResponse extends GeneratedMessageLite<NotifyReserveResponse, Builder> implements NotifyReserveResponseOrBuilder {
        public static final int DECISION_TIMESTAMP_EPOCH_FIELD_NUMBER = 2;
        private static final NotifyReserveResponse DEFAULT_INSTANCE;
        public static final int DIALOG_FIELD_NUMBER = 1;
        private static volatile Parser<NotifyReserveResponse> PARSER = null;
        public static final int SENDER_COORDINATION_POLICY_FIELD_NUMBER = 3;
        private String decisionTimestampEpoch_ = "";
        private Speech.Dialog dialog_;
        private int senderCoordinationPolicy_;

        static {
            NotifyReserveResponse notifyReserveResponse = new NotifyReserveResponse();
            DEFAULT_INSTANCE = notifyReserveResponse;
            notifyReserveResponse.makeImmutable();
        }

        private NotifyReserveResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDecisionTimestampEpoch() {
            this.decisionTimestampEpoch_ = getDefaultInstance().getDecisionTimestampEpoch();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialog() {
            this.dialog_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSenderCoordinationPolicy() {
            this.senderCoordinationPolicy_ = 0;
        }

        public static NotifyReserveResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDialog(Speech.Dialog dialog) {
            Speech.Dialog dialog2 = this.dialog_;
            if (dialog2 == null || dialog2 == Speech.Dialog.getDefaultInstance()) {
                this.dialog_ = dialog;
            } else {
                this.dialog_ = Speech.Dialog.newBuilder(this.dialog_).mergeFrom((Speech.Dialog.Builder) dialog).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyReserveResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NotifyReserveResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyReserveResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NotifyReserveResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NotifyReserveResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDecisionTimestampEpoch(String str) {
            str.getClass();
            this.decisionTimestampEpoch_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDecisionTimestampEpochBytes(ByteString byteString) {
            this.decisionTimestampEpoch_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialog(Speech.Dialog.Builder builder) {
            this.dialog_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSenderCoordinationPolicy(CoordinationPolicy coordinationPolicy) {
            coordinationPolicy.getClass();
            this.senderCoordinationPolicy_ = coordinationPolicy.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSenderCoordinationPolicyValue(int i) {
            this.senderCoordinationPolicy_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NotifyReserveResponse();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    NotifyReserveResponse notifyReserveResponse = (NotifyReserveResponse) obj2;
                    this.dialog_ = (Speech.Dialog) visitor.visitMessage(this.dialog_, notifyReserveResponse.dialog_);
                    this.decisionTimestampEpoch_ = visitor.visitString(!this.decisionTimestampEpoch_.isEmpty(), this.decisionTimestampEpoch_, !notifyReserveResponse.decisionTimestampEpoch_.isEmpty(), notifyReserveResponse.decisionTimestampEpoch_);
                    int i = this.senderCoordinationPolicy_;
                    boolean z = i != 0;
                    int i2 = notifyReserveResponse.senderCoordinationPolicy_;
                    this.senderCoordinationPolicy_ = visitor.visitInt(z, i, i2 != 0, i2);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    extensionRegistryLite.getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    Speech.Dialog dialog = this.dialog_;
                                    Speech.Dialog.Builder builder = dialog != null ? dialog.toBuilder() : null;
                                    Speech.Dialog dialog2 = (Speech.Dialog) codedInputStream.readMessage(Speech.Dialog.parser(), extensionRegistryLite);
                                    this.dialog_ = dialog2;
                                    if (builder != null) {
                                        builder.mergeFrom((Speech.Dialog.Builder) dialog2);
                                        this.dialog_ = builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    this.decisionTimestampEpoch_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 24) {
                                    this.senderCoordinationPolicy_ = codedInputStream.readEnum();
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
                        synchronized (NotifyReserveResponse.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseOrBuilder
        public String getDecisionTimestampEpoch() {
            return this.decisionTimestampEpoch_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseOrBuilder
        public ByteString getDecisionTimestampEpochBytes() {
            return ByteString.copyFromUtf8(this.decisionTimestampEpoch_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseOrBuilder
        public Speech.Dialog getDialog() {
            Speech.Dialog dialog = this.dialog_;
            return dialog == null ? Speech.Dialog.getDefaultInstance() : dialog;
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseOrBuilder
        public CoordinationPolicy getSenderCoordinationPolicy() {
            CoordinationPolicy forNumber = CoordinationPolicy.forNumber(this.senderCoordinationPolicy_);
            return forNumber == null ? CoordinationPolicy.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseOrBuilder
        public int getSenderCoordinationPolicyValue() {
            return this.senderCoordinationPolicy_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.dialog_ != null ? CodedOutputStream.computeMessageSize(1, getDialog()) : 0;
            if (!this.decisionTimestampEpoch_.isEmpty()) {
                computeMessageSize += CodedOutputStream.computeStringSize(2, getDecisionTimestampEpoch());
            }
            if (this.senderCoordinationPolicy_ != CoordinationPolicy.COORDINATION_POLICY_SHALLOW.getNumber()) {
                computeMessageSize += CodedOutputStream.computeEnumSize(3, this.senderCoordinationPolicy_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseOrBuilder
        public boolean hasDialog() {
            return this.dialog_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.dialog_ != null) {
                codedOutputStream.writeMessage(1, getDialog());
            }
            if (!this.decisionTimestampEpoch_.isEmpty()) {
                codedOutputStream.writeString(2, getDecisionTimestampEpoch());
            }
            if (this.senderCoordinationPolicy_ != CoordinationPolicy.COORDINATION_POLICY_SHALLOW.getNumber()) {
                codedOutputStream.writeEnum(3, this.senderCoordinationPolicy_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NotifyReserveResponse, Builder> implements NotifyReserveResponseOrBuilder {
            private Builder() {
                super(NotifyReserveResponse.DEFAULT_INSTANCE);
            }

            public Builder clearDecisionTimestampEpoch() {
                copyOnWrite();
                ((NotifyReserveResponse) this.instance).clearDecisionTimestampEpoch();
                return this;
            }

            public Builder clearDialog() {
                copyOnWrite();
                ((NotifyReserveResponse) this.instance).clearDialog();
                return this;
            }

            public Builder clearSenderCoordinationPolicy() {
                copyOnWrite();
                ((NotifyReserveResponse) this.instance).clearSenderCoordinationPolicy();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseOrBuilder
            public String getDecisionTimestampEpoch() {
                return ((NotifyReserveResponse) this.instance).getDecisionTimestampEpoch();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseOrBuilder
            public ByteString getDecisionTimestampEpochBytes() {
                return ((NotifyReserveResponse) this.instance).getDecisionTimestampEpochBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseOrBuilder
            public Speech.Dialog getDialog() {
                return ((NotifyReserveResponse) this.instance).getDialog();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseOrBuilder
            public CoordinationPolicy getSenderCoordinationPolicy() {
                return ((NotifyReserveResponse) this.instance).getSenderCoordinationPolicy();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseOrBuilder
            public int getSenderCoordinationPolicyValue() {
                return ((NotifyReserveResponse) this.instance).getSenderCoordinationPolicyValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseOrBuilder
            public boolean hasDialog() {
                return ((NotifyReserveResponse) this.instance).hasDialog();
            }

            public Builder mergeDialog(Speech.Dialog dialog) {
                copyOnWrite();
                ((NotifyReserveResponse) this.instance).mergeDialog(dialog);
                return this;
            }

            public Builder setDecisionTimestampEpoch(String str) {
                copyOnWrite();
                ((NotifyReserveResponse) this.instance).setDecisionTimestampEpoch(str);
                return this;
            }

            public Builder setDecisionTimestampEpochBytes(ByteString byteString) {
                copyOnWrite();
                ((NotifyReserveResponse) this.instance).setDecisionTimestampEpochBytes(byteString);
                return this;
            }

            public Builder setDialog(Speech.Dialog dialog) {
                copyOnWrite();
                ((NotifyReserveResponse) this.instance).setDialog(dialog);
                return this;
            }

            public Builder setSenderCoordinationPolicy(CoordinationPolicy coordinationPolicy) {
                copyOnWrite();
                ((NotifyReserveResponse) this.instance).setSenderCoordinationPolicy(coordinationPolicy);
                return this;
            }

            public Builder setSenderCoordinationPolicyValue(int i) {
                copyOnWrite();
                ((NotifyReserveResponse) this.instance).setSenderCoordinationPolicyValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setDialog(Speech.Dialog.Builder builder) {
                copyOnWrite();
                ((NotifyReserveResponse) this.instance).setDialog(builder);
                return this;
            }
        }

        public static Builder newBuilder(NotifyReserveResponse notifyReserveResponse) {
            return DEFAULT_INSTANCE.createBuilder(notifyReserveResponse);
        }

        public static NotifyReserveResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyReserveResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyReserveResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyReserveResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialog(Speech.Dialog dialog) {
            dialog.getClass();
            this.dialog_ = dialog;
        }

        public static NotifyReserveResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NotifyReserveResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NotifyReserveResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyReserveResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NotifyReserveResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NotifyReserveResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotifyReserveResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyReserveResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NotifyReserveResponse parseFrom(InputStream inputStream) throws IOException {
            return (NotifyReserveResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyReserveResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyReserveResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyReserveResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NotifyReserveResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NotifyReserveResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyReserveResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotifyReserveResponseResult extends GeneratedMessageLite<NotifyReserveResponseResult, Builder> implements NotifyReserveResponseResultOrBuilder {
        public static final int DECISION_TIMESTAMP_EPOCH_FIELD_NUMBER = 2;
        private static final NotifyReserveResponseResult DEFAULT_INSTANCE;
        public static final int DIALOG_FIELD_NUMBER = 1;
        private static volatile Parser<NotifyReserveResponseResult> PARSER = null;
        public static final int RESULT_FIELD_NUMBER = 3;
        private String decisionTimestampEpoch_ = "";
        private Speech.Dialog dialog_;
        private int result_;

        static {
            NotifyReserveResponseResult notifyReserveResponseResult = new NotifyReserveResponseResult();
            DEFAULT_INSTANCE = notifyReserveResponseResult;
            notifyReserveResponseResult.makeImmutable();
        }

        private NotifyReserveResponseResult() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDecisionTimestampEpoch() {
            this.decisionTimestampEpoch_ = getDefaultInstance().getDecisionTimestampEpoch();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialog() {
            this.dialog_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResult() {
            this.result_ = 0;
        }

        public static NotifyReserveResponseResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDialog(Speech.Dialog dialog) {
            Speech.Dialog dialog2 = this.dialog_;
            if (dialog2 == null || dialog2 == Speech.Dialog.getDefaultInstance()) {
                this.dialog_ = dialog;
            } else {
                this.dialog_ = Speech.Dialog.newBuilder(this.dialog_).mergeFrom((Speech.Dialog.Builder) dialog).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyReserveResponseResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NotifyReserveResponseResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyReserveResponseResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NotifyReserveResponseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NotifyReserveResponseResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDecisionTimestampEpoch(String str) {
            str.getClass();
            this.decisionTimestampEpoch_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDecisionTimestampEpochBytes(ByteString byteString) {
            this.decisionTimestampEpoch_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialog(Speech.Dialog.Builder builder) {
            this.dialog_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResult(CoordinationResult coordinationResult) {
            coordinationResult.getClass();
            this.result_ = coordinationResult.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResultValue(int i) {
            this.result_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NotifyReserveResponseResult();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    NotifyReserveResponseResult notifyReserveResponseResult = (NotifyReserveResponseResult) obj2;
                    this.dialog_ = (Speech.Dialog) visitor.visitMessage(this.dialog_, notifyReserveResponseResult.dialog_);
                    this.decisionTimestampEpoch_ = visitor.visitString(!this.decisionTimestampEpoch_.isEmpty(), this.decisionTimestampEpoch_, !notifyReserveResponseResult.decisionTimestampEpoch_.isEmpty(), notifyReserveResponseResult.decisionTimestampEpoch_);
                    int i = this.result_;
                    boolean z = i != 0;
                    int i2 = notifyReserveResponseResult.result_;
                    this.result_ = visitor.visitInt(z, i, i2 != 0, i2);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    extensionRegistryLite.getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    Speech.Dialog dialog = this.dialog_;
                                    Speech.Dialog.Builder builder = dialog != null ? dialog.toBuilder() : null;
                                    Speech.Dialog dialog2 = (Speech.Dialog) codedInputStream.readMessage(Speech.Dialog.parser(), extensionRegistryLite);
                                    this.dialog_ = dialog2;
                                    if (builder != null) {
                                        builder.mergeFrom((Speech.Dialog.Builder) dialog2);
                                        this.dialog_ = builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    this.decisionTimestampEpoch_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 24) {
                                    this.result_ = codedInputStream.readEnum();
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
                        synchronized (NotifyReserveResponseResult.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseResultOrBuilder
        public String getDecisionTimestampEpoch() {
            return this.decisionTimestampEpoch_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseResultOrBuilder
        public ByteString getDecisionTimestampEpochBytes() {
            return ByteString.copyFromUtf8(this.decisionTimestampEpoch_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseResultOrBuilder
        public Speech.Dialog getDialog() {
            Speech.Dialog dialog = this.dialog_;
            return dialog == null ? Speech.Dialog.getDefaultInstance() : dialog;
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseResultOrBuilder
        public CoordinationResult getResult() {
            CoordinationResult forNumber = CoordinationResult.forNumber(this.result_);
            return forNumber == null ? CoordinationResult.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseResultOrBuilder
        public int getResultValue() {
            return this.result_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.dialog_ != null ? CodedOutputStream.computeMessageSize(1, getDialog()) : 0;
            if (!this.decisionTimestampEpoch_.isEmpty()) {
                computeMessageSize += CodedOutputStream.computeStringSize(2, getDecisionTimestampEpoch());
            }
            if (this.result_ != CoordinationResult.COORDINATION_RESULT_AGREED.getNumber()) {
                computeMessageSize += CodedOutputStream.computeEnumSize(3, this.result_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseResultOrBuilder
        public boolean hasDialog() {
            return this.dialog_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.dialog_ != null) {
                codedOutputStream.writeMessage(1, getDialog());
            }
            if (!this.decisionTimestampEpoch_.isEmpty()) {
                codedOutputStream.writeString(2, getDecisionTimestampEpoch());
            }
            if (this.result_ != CoordinationResult.COORDINATION_RESULT_AGREED.getNumber()) {
                codedOutputStream.writeEnum(3, this.result_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NotifyReserveResponseResult, Builder> implements NotifyReserveResponseResultOrBuilder {
            private Builder() {
                super(NotifyReserveResponseResult.DEFAULT_INSTANCE);
            }

            public Builder clearDecisionTimestampEpoch() {
                copyOnWrite();
                ((NotifyReserveResponseResult) this.instance).clearDecisionTimestampEpoch();
                return this;
            }

            public Builder clearDialog() {
                copyOnWrite();
                ((NotifyReserveResponseResult) this.instance).clearDialog();
                return this;
            }

            public Builder clearResult() {
                copyOnWrite();
                ((NotifyReserveResponseResult) this.instance).clearResult();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseResultOrBuilder
            public String getDecisionTimestampEpoch() {
                return ((NotifyReserveResponseResult) this.instance).getDecisionTimestampEpoch();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseResultOrBuilder
            public ByteString getDecisionTimestampEpochBytes() {
                return ((NotifyReserveResponseResult) this.instance).getDecisionTimestampEpochBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseResultOrBuilder
            public Speech.Dialog getDialog() {
                return ((NotifyReserveResponseResult) this.instance).getDialog();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseResultOrBuilder
            public CoordinationResult getResult() {
                return ((NotifyReserveResponseResult) this.instance).getResult();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseResultOrBuilder
            public int getResultValue() {
                return ((NotifyReserveResponseResult) this.instance).getResultValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyReserveResponseResultOrBuilder
            public boolean hasDialog() {
                return ((NotifyReserveResponseResult) this.instance).hasDialog();
            }

            public Builder mergeDialog(Speech.Dialog dialog) {
                copyOnWrite();
                ((NotifyReserveResponseResult) this.instance).mergeDialog(dialog);
                return this;
            }

            public Builder setDecisionTimestampEpoch(String str) {
                copyOnWrite();
                ((NotifyReserveResponseResult) this.instance).setDecisionTimestampEpoch(str);
                return this;
            }

            public Builder setDecisionTimestampEpochBytes(ByteString byteString) {
                copyOnWrite();
                ((NotifyReserveResponseResult) this.instance).setDecisionTimestampEpochBytes(byteString);
                return this;
            }

            public Builder setDialog(Speech.Dialog dialog) {
                copyOnWrite();
                ((NotifyReserveResponseResult) this.instance).setDialog(dialog);
                return this;
            }

            public Builder setResult(CoordinationResult coordinationResult) {
                copyOnWrite();
                ((NotifyReserveResponseResult) this.instance).setResult(coordinationResult);
                return this;
            }

            public Builder setResultValue(int i) {
                copyOnWrite();
                ((NotifyReserveResponseResult) this.instance).setResultValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setDialog(Speech.Dialog.Builder builder) {
                copyOnWrite();
                ((NotifyReserveResponseResult) this.instance).setDialog(builder);
                return this;
            }
        }

        public static Builder newBuilder(NotifyReserveResponseResult notifyReserveResponseResult) {
            return DEFAULT_INSTANCE.createBuilder(notifyReserveResponseResult);
        }

        public static NotifyReserveResponseResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyReserveResponseResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyReserveResponseResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyReserveResponseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialog(Speech.Dialog dialog) {
            dialog.getClass();
            this.dialog_ = dialog;
        }

        public static NotifyReserveResponseResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NotifyReserveResponseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NotifyReserveResponseResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyReserveResponseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NotifyReserveResponseResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NotifyReserveResponseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotifyReserveResponseResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyReserveResponseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NotifyReserveResponseResult parseFrom(InputStream inputStream) throws IOException {
            return (NotifyReserveResponseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyReserveResponseResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyReserveResponseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyReserveResponseResult parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NotifyReserveResponseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NotifyReserveResponseResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyReserveResponseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotifyResponseStartStatus extends GeneratedMessageLite<NotifyResponseStartStatus, Builder> implements NotifyResponseStartStatusOrBuilder {
        public static final int DECISION_TIMESTAMP_EPOCH_FIELD_NUMBER = 2;
        private static final NotifyResponseStartStatus DEFAULT_INSTANCE;
        public static final int DIALOG_FIELD_NUMBER = 1;
        public static final int ERROR_CODE_FIELD_NUMBER = 3;
        private static volatile Parser<NotifyResponseStartStatus> PARSER;
        private String decisionTimestampEpoch_ = "";
        private Speech.Dialog dialog_;
        private int errorCode_;

        static {
            NotifyResponseStartStatus notifyResponseStartStatus = new NotifyResponseStartStatus();
            DEFAULT_INSTANCE = notifyResponseStartStatus;
            notifyResponseStartStatus.makeImmutable();
        }

        private NotifyResponseStartStatus() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDecisionTimestampEpoch() {
            this.decisionTimestampEpoch_ = getDefaultInstance().getDecisionTimestampEpoch();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialog() {
            this.dialog_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorCode() {
            this.errorCode_ = 0;
        }

        public static NotifyResponseStartStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDialog(Speech.Dialog dialog) {
            Speech.Dialog dialog2 = this.dialog_;
            if (dialog2 == null || dialog2 == Speech.Dialog.getDefaultInstance()) {
                this.dialog_ = dialog;
            } else {
                this.dialog_ = Speech.Dialog.newBuilder(this.dialog_).mergeFrom((Speech.Dialog.Builder) dialog).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyResponseStartStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NotifyResponseStartStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyResponseStartStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NotifyResponseStartStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NotifyResponseStartStatus> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDecisionTimestampEpoch(String str) {
            str.getClass();
            this.decisionTimestampEpoch_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDecisionTimestampEpochBytes(ByteString byteString) {
            this.decisionTimestampEpoch_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialog(Speech.Dialog.Builder builder) {
            this.dialog_ = builder.build();
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NotifyResponseStartStatus();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    NotifyResponseStartStatus notifyResponseStartStatus = (NotifyResponseStartStatus) obj2;
                    this.dialog_ = (Speech.Dialog) visitor.visitMessage(this.dialog_, notifyResponseStartStatus.dialog_);
                    this.decisionTimestampEpoch_ = visitor.visitString(!this.decisionTimestampEpoch_.isEmpty(), this.decisionTimestampEpoch_, !notifyResponseStartStatus.decisionTimestampEpoch_.isEmpty(), notifyResponseStartStatus.decisionTimestampEpoch_);
                    int i = this.errorCode_;
                    boolean z = i != 0;
                    int i2 = notifyResponseStartStatus.errorCode_;
                    this.errorCode_ = visitor.visitInt(z, i, i2 != 0, i2);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    extensionRegistryLite.getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    Speech.Dialog dialog = this.dialog_;
                                    Speech.Dialog.Builder builder = dialog != null ? dialog.toBuilder() : null;
                                    Speech.Dialog dialog2 = (Speech.Dialog) codedInputStream.readMessage(Speech.Dialog.parser(), extensionRegistryLite);
                                    this.dialog_ = dialog2;
                                    if (builder != null) {
                                        builder.mergeFrom((Speech.Dialog.Builder) dialog2);
                                        this.dialog_ = builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    this.decisionTimestampEpoch_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 24) {
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
                        synchronized (NotifyResponseStartStatus.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyResponseStartStatusOrBuilder
        public String getDecisionTimestampEpoch() {
            return this.decisionTimestampEpoch_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyResponseStartStatusOrBuilder
        public ByteString getDecisionTimestampEpochBytes() {
            return ByteString.copyFromUtf8(this.decisionTimestampEpoch_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyResponseStartStatusOrBuilder
        public Speech.Dialog getDialog() {
            Speech.Dialog dialog = this.dialog_;
            return dialog == null ? Speech.Dialog.getDefaultInstance() : dialog;
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyResponseStartStatusOrBuilder
        public Common.ErrorCode getErrorCode() {
            Common.ErrorCode forNumber = Common.ErrorCode.forNumber(this.errorCode_);
            return forNumber == null ? Common.ErrorCode.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyResponseStartStatusOrBuilder
        public int getErrorCodeValue() {
            return this.errorCode_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.dialog_ != null ? CodedOutputStream.computeMessageSize(1, getDialog()) : 0;
            if (!this.decisionTimestampEpoch_.isEmpty()) {
                computeMessageSize += CodedOutputStream.computeStringSize(2, getDecisionTimestampEpoch());
            }
            if (this.errorCode_ != Common.ErrorCode.SUCCESS.getNumber()) {
                computeMessageSize += CodedOutputStream.computeEnumSize(3, this.errorCode_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyResponseStartStatusOrBuilder
        public boolean hasDialog() {
            return this.dialog_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.dialog_ != null) {
                codedOutputStream.writeMessage(1, getDialog());
            }
            if (!this.decisionTimestampEpoch_.isEmpty()) {
                codedOutputStream.writeString(2, getDecisionTimestampEpoch());
            }
            if (this.errorCode_ != Common.ErrorCode.SUCCESS.getNumber()) {
                codedOutputStream.writeEnum(3, this.errorCode_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NotifyResponseStartStatus, Builder> implements NotifyResponseStartStatusOrBuilder {
            private Builder() {
                super(NotifyResponseStartStatus.DEFAULT_INSTANCE);
            }

            public Builder clearDecisionTimestampEpoch() {
                copyOnWrite();
                ((NotifyResponseStartStatus) this.instance).clearDecisionTimestampEpoch();
                return this;
            }

            public Builder clearDialog() {
                copyOnWrite();
                ((NotifyResponseStartStatus) this.instance).clearDialog();
                return this;
            }

            public Builder clearErrorCode() {
                copyOnWrite();
                ((NotifyResponseStartStatus) this.instance).clearErrorCode();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyResponseStartStatusOrBuilder
            public String getDecisionTimestampEpoch() {
                return ((NotifyResponseStartStatus) this.instance).getDecisionTimestampEpoch();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyResponseStartStatusOrBuilder
            public ByteString getDecisionTimestampEpochBytes() {
                return ((NotifyResponseStartStatus) this.instance).getDecisionTimestampEpochBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyResponseStartStatusOrBuilder
            public Speech.Dialog getDialog() {
                return ((NotifyResponseStartStatus) this.instance).getDialog();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyResponseStartStatusOrBuilder
            public Common.ErrorCode getErrorCode() {
                return ((NotifyResponseStartStatus) this.instance).getErrorCode();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyResponseStartStatusOrBuilder
            public int getErrorCodeValue() {
                return ((NotifyResponseStartStatus) this.instance).getErrorCodeValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.NotifyResponseStartStatusOrBuilder
            public boolean hasDialog() {
                return ((NotifyResponseStartStatus) this.instance).hasDialog();
            }

            public Builder mergeDialog(Speech.Dialog dialog) {
                copyOnWrite();
                ((NotifyResponseStartStatus) this.instance).mergeDialog(dialog);
                return this;
            }

            public Builder setDecisionTimestampEpoch(String str) {
                copyOnWrite();
                ((NotifyResponseStartStatus) this.instance).setDecisionTimestampEpoch(str);
                return this;
            }

            public Builder setDecisionTimestampEpochBytes(ByteString byteString) {
                copyOnWrite();
                ((NotifyResponseStartStatus) this.instance).setDecisionTimestampEpochBytes(byteString);
                return this;
            }

            public Builder setDialog(Speech.Dialog dialog) {
                copyOnWrite();
                ((NotifyResponseStartStatus) this.instance).setDialog(dialog);
                return this;
            }

            public Builder setErrorCode(Common.ErrorCode errorCode) {
                copyOnWrite();
                ((NotifyResponseStartStatus) this.instance).setErrorCode(errorCode);
                return this;
            }

            public Builder setErrorCodeValue(int i) {
                copyOnWrite();
                ((NotifyResponseStartStatus) this.instance).setErrorCodeValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setDialog(Speech.Dialog.Builder builder) {
                copyOnWrite();
                ((NotifyResponseStartStatus) this.instance).setDialog(builder);
                return this;
            }
        }

        public static Builder newBuilder(NotifyResponseStartStatus notifyResponseStartStatus) {
            return DEFAULT_INSTANCE.createBuilder(notifyResponseStartStatus);
        }

        public static NotifyResponseStartStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyResponseStartStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyResponseStartStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyResponseStartStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialog(Speech.Dialog dialog) {
            dialog.getClass();
            this.dialog_ = dialog;
        }

        public static NotifyResponseStartStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NotifyResponseStartStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NotifyResponseStartStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyResponseStartStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NotifyResponseStartStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NotifyResponseStartStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotifyResponseStartStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyResponseStartStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NotifyResponseStartStatus parseFrom(InputStream inputStream) throws IOException {
            return (NotifyResponseStartStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyResponseStartStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyResponseStartStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyResponseStartStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NotifyResponseStartStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NotifyResponseStartStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyResponseStartStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ReserveResponse extends GeneratedMessageLite<ReserveResponse, Builder> implements ReserveResponseOrBuilder {
        public static final int DECISION_TIMESTAMP_EPOCH_FIELD_NUMBER = 2;
        private static final ReserveResponse DEFAULT_INSTANCE;
        public static final int DIALOG_FIELD_NUMBER = 1;
        private static volatile Parser<ReserveResponse> PARSER = null;
        public static final int SENDER_COORDINATION_POLICY_FIELD_NUMBER = 3;
        private String decisionTimestampEpoch_ = "";
        private Speech.Dialog dialog_;
        private int senderCoordinationPolicy_;

        static {
            ReserveResponse reserveResponse = new ReserveResponse();
            DEFAULT_INSTANCE = reserveResponse;
            reserveResponse.makeImmutable();
        }

        private ReserveResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDecisionTimestampEpoch() {
            this.decisionTimestampEpoch_ = getDefaultInstance().getDecisionTimestampEpoch();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialog() {
            this.dialog_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSenderCoordinationPolicy() {
            this.senderCoordinationPolicy_ = 0;
        }

        public static ReserveResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDialog(Speech.Dialog dialog) {
            Speech.Dialog dialog2 = this.dialog_;
            if (dialog2 == null || dialog2 == Speech.Dialog.getDefaultInstance()) {
                this.dialog_ = dialog;
            } else {
                this.dialog_ = Speech.Dialog.newBuilder(this.dialog_).mergeFrom((Speech.Dialog.Builder) dialog).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ReserveResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ReserveResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReserveResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ReserveResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ReserveResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDecisionTimestampEpoch(String str) {
            str.getClass();
            this.decisionTimestampEpoch_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDecisionTimestampEpochBytes(ByteString byteString) {
            this.decisionTimestampEpoch_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialog(Speech.Dialog.Builder builder) {
            this.dialog_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSenderCoordinationPolicy(CoordinationPolicy coordinationPolicy) {
            coordinationPolicy.getClass();
            this.senderCoordinationPolicy_ = coordinationPolicy.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSenderCoordinationPolicyValue(int i) {
            this.senderCoordinationPolicy_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ReserveResponse();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    ReserveResponse reserveResponse = (ReserveResponse) obj2;
                    this.dialog_ = (Speech.Dialog) visitor.visitMessage(this.dialog_, reserveResponse.dialog_);
                    this.decisionTimestampEpoch_ = visitor.visitString(!this.decisionTimestampEpoch_.isEmpty(), this.decisionTimestampEpoch_, !reserveResponse.decisionTimestampEpoch_.isEmpty(), reserveResponse.decisionTimestampEpoch_);
                    int i = this.senderCoordinationPolicy_;
                    boolean z = i != 0;
                    int i2 = reserveResponse.senderCoordinationPolicy_;
                    this.senderCoordinationPolicy_ = visitor.visitInt(z, i, i2 != 0, i2);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    extensionRegistryLite.getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    Speech.Dialog dialog = this.dialog_;
                                    Speech.Dialog.Builder builder = dialog != null ? dialog.toBuilder() : null;
                                    Speech.Dialog dialog2 = (Speech.Dialog) codedInputStream.readMessage(Speech.Dialog.parser(), extensionRegistryLite);
                                    this.dialog_ = dialog2;
                                    if (builder != null) {
                                        builder.mergeFrom((Speech.Dialog.Builder) dialog2);
                                        this.dialog_ = builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    this.decisionTimestampEpoch_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 24) {
                                    this.senderCoordinationPolicy_ = codedInputStream.readEnum();
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
                        synchronized (ReserveResponse.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseOrBuilder
        public String getDecisionTimestampEpoch() {
            return this.decisionTimestampEpoch_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseOrBuilder
        public ByteString getDecisionTimestampEpochBytes() {
            return ByteString.copyFromUtf8(this.decisionTimestampEpoch_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseOrBuilder
        public Speech.Dialog getDialog() {
            Speech.Dialog dialog = this.dialog_;
            return dialog == null ? Speech.Dialog.getDefaultInstance() : dialog;
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseOrBuilder
        public CoordinationPolicy getSenderCoordinationPolicy() {
            CoordinationPolicy forNumber = CoordinationPolicy.forNumber(this.senderCoordinationPolicy_);
            return forNumber == null ? CoordinationPolicy.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseOrBuilder
        public int getSenderCoordinationPolicyValue() {
            return this.senderCoordinationPolicy_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.dialog_ != null ? CodedOutputStream.computeMessageSize(1, getDialog()) : 0;
            if (!this.decisionTimestampEpoch_.isEmpty()) {
                computeMessageSize += CodedOutputStream.computeStringSize(2, getDecisionTimestampEpoch());
            }
            if (this.senderCoordinationPolicy_ != CoordinationPolicy.COORDINATION_POLICY_SHALLOW.getNumber()) {
                computeMessageSize += CodedOutputStream.computeEnumSize(3, this.senderCoordinationPolicy_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseOrBuilder
        public boolean hasDialog() {
            return this.dialog_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.dialog_ != null) {
                codedOutputStream.writeMessage(1, getDialog());
            }
            if (!this.decisionTimestampEpoch_.isEmpty()) {
                codedOutputStream.writeString(2, getDecisionTimestampEpoch());
            }
            if (this.senderCoordinationPolicy_ != CoordinationPolicy.COORDINATION_POLICY_SHALLOW.getNumber()) {
                codedOutputStream.writeEnum(3, this.senderCoordinationPolicy_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<ReserveResponse, Builder> implements ReserveResponseOrBuilder {
            private Builder() {
                super(ReserveResponse.DEFAULT_INSTANCE);
            }

            public Builder clearDecisionTimestampEpoch() {
                copyOnWrite();
                ((ReserveResponse) this.instance).clearDecisionTimestampEpoch();
                return this;
            }

            public Builder clearDialog() {
                copyOnWrite();
                ((ReserveResponse) this.instance).clearDialog();
                return this;
            }

            public Builder clearSenderCoordinationPolicy() {
                copyOnWrite();
                ((ReserveResponse) this.instance).clearSenderCoordinationPolicy();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseOrBuilder
            public String getDecisionTimestampEpoch() {
                return ((ReserveResponse) this.instance).getDecisionTimestampEpoch();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseOrBuilder
            public ByteString getDecisionTimestampEpochBytes() {
                return ((ReserveResponse) this.instance).getDecisionTimestampEpochBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseOrBuilder
            public Speech.Dialog getDialog() {
                return ((ReserveResponse) this.instance).getDialog();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseOrBuilder
            public CoordinationPolicy getSenderCoordinationPolicy() {
                return ((ReserveResponse) this.instance).getSenderCoordinationPolicy();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseOrBuilder
            public int getSenderCoordinationPolicyValue() {
                return ((ReserveResponse) this.instance).getSenderCoordinationPolicyValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseOrBuilder
            public boolean hasDialog() {
                return ((ReserveResponse) this.instance).hasDialog();
            }

            public Builder mergeDialog(Speech.Dialog dialog) {
                copyOnWrite();
                ((ReserveResponse) this.instance).mergeDialog(dialog);
                return this;
            }

            public Builder setDecisionTimestampEpoch(String str) {
                copyOnWrite();
                ((ReserveResponse) this.instance).setDecisionTimestampEpoch(str);
                return this;
            }

            public Builder setDecisionTimestampEpochBytes(ByteString byteString) {
                copyOnWrite();
                ((ReserveResponse) this.instance).setDecisionTimestampEpochBytes(byteString);
                return this;
            }

            public Builder setDialog(Speech.Dialog dialog) {
                copyOnWrite();
                ((ReserveResponse) this.instance).setDialog(dialog);
                return this;
            }

            public Builder setSenderCoordinationPolicy(CoordinationPolicy coordinationPolicy) {
                copyOnWrite();
                ((ReserveResponse) this.instance).setSenderCoordinationPolicy(coordinationPolicy);
                return this;
            }

            public Builder setSenderCoordinationPolicyValue(int i) {
                copyOnWrite();
                ((ReserveResponse) this.instance).setSenderCoordinationPolicyValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setDialog(Speech.Dialog.Builder builder) {
                copyOnWrite();
                ((ReserveResponse) this.instance).setDialog(builder);
                return this;
            }
        }

        public static Builder newBuilder(ReserveResponse reserveResponse) {
            return DEFAULT_INSTANCE.createBuilder(reserveResponse);
        }

        public static ReserveResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReserveResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ReserveResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReserveResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialog(Speech.Dialog dialog) {
            dialog.getClass();
            this.dialog_ = dialog;
        }

        public static ReserveResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ReserveResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ReserveResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReserveResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ReserveResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ReserveResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ReserveResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReserveResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ReserveResponse parseFrom(InputStream inputStream) throws IOException {
            return (ReserveResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReserveResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReserveResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ReserveResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ReserveResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ReserveResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReserveResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ReserveResponseResult extends GeneratedMessageLite<ReserveResponseResult, Builder> implements ReserveResponseResultOrBuilder {
        public static final int DECISION_TIMESTAMP_EPOCH_FIELD_NUMBER = 2;
        private static final ReserveResponseResult DEFAULT_INSTANCE;
        public static final int DIALOG_FIELD_NUMBER = 1;
        private static volatile Parser<ReserveResponseResult> PARSER = null;
        public static final int RESULT_FIELD_NUMBER = 3;
        private String decisionTimestampEpoch_ = "";
        private Speech.Dialog dialog_;
        private int result_;

        static {
            ReserveResponseResult reserveResponseResult = new ReserveResponseResult();
            DEFAULT_INSTANCE = reserveResponseResult;
            reserveResponseResult.makeImmutable();
        }

        private ReserveResponseResult() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDecisionTimestampEpoch() {
            this.decisionTimestampEpoch_ = getDefaultInstance().getDecisionTimestampEpoch();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialog() {
            this.dialog_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResult() {
            this.result_ = 0;
        }

        public static ReserveResponseResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDialog(Speech.Dialog dialog) {
            Speech.Dialog dialog2 = this.dialog_;
            if (dialog2 == null || dialog2 == Speech.Dialog.getDefaultInstance()) {
                this.dialog_ = dialog;
            } else {
                this.dialog_ = Speech.Dialog.newBuilder(this.dialog_).mergeFrom((Speech.Dialog.Builder) dialog).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ReserveResponseResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ReserveResponseResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReserveResponseResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ReserveResponseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ReserveResponseResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDecisionTimestampEpoch(String str) {
            str.getClass();
            this.decisionTimestampEpoch_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDecisionTimestampEpochBytes(ByteString byteString) {
            this.decisionTimestampEpoch_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialog(Speech.Dialog.Builder builder) {
            this.dialog_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResult(CoordinationResult coordinationResult) {
            coordinationResult.getClass();
            this.result_ = coordinationResult.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResultValue(int i) {
            this.result_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ReserveResponseResult();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    ReserveResponseResult reserveResponseResult = (ReserveResponseResult) obj2;
                    this.dialog_ = (Speech.Dialog) visitor.visitMessage(this.dialog_, reserveResponseResult.dialog_);
                    this.decisionTimestampEpoch_ = visitor.visitString(!this.decisionTimestampEpoch_.isEmpty(), this.decisionTimestampEpoch_, !reserveResponseResult.decisionTimestampEpoch_.isEmpty(), reserveResponseResult.decisionTimestampEpoch_);
                    int i = this.result_;
                    boolean z = i != 0;
                    int i2 = reserveResponseResult.result_;
                    this.result_ = visitor.visitInt(z, i, i2 != 0, i2);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    extensionRegistryLite.getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    Speech.Dialog dialog = this.dialog_;
                                    Speech.Dialog.Builder builder = dialog != null ? dialog.toBuilder() : null;
                                    Speech.Dialog dialog2 = (Speech.Dialog) codedInputStream.readMessage(Speech.Dialog.parser(), extensionRegistryLite);
                                    this.dialog_ = dialog2;
                                    if (builder != null) {
                                        builder.mergeFrom((Speech.Dialog.Builder) dialog2);
                                        this.dialog_ = builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    this.decisionTimestampEpoch_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 24) {
                                    this.result_ = codedInputStream.readEnum();
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
                        synchronized (ReserveResponseResult.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseResultOrBuilder
        public String getDecisionTimestampEpoch() {
            return this.decisionTimestampEpoch_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseResultOrBuilder
        public ByteString getDecisionTimestampEpochBytes() {
            return ByteString.copyFromUtf8(this.decisionTimestampEpoch_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseResultOrBuilder
        public Speech.Dialog getDialog() {
            Speech.Dialog dialog = this.dialog_;
            return dialog == null ? Speech.Dialog.getDefaultInstance() : dialog;
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseResultOrBuilder
        public CoordinationResult getResult() {
            CoordinationResult forNumber = CoordinationResult.forNumber(this.result_);
            return forNumber == null ? CoordinationResult.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseResultOrBuilder
        public int getResultValue() {
            return this.result_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.dialog_ != null ? CodedOutputStream.computeMessageSize(1, getDialog()) : 0;
            if (!this.decisionTimestampEpoch_.isEmpty()) {
                computeMessageSize += CodedOutputStream.computeStringSize(2, getDecisionTimestampEpoch());
            }
            if (this.result_ != CoordinationResult.COORDINATION_RESULT_AGREED.getNumber()) {
                computeMessageSize += CodedOutputStream.computeEnumSize(3, this.result_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseResultOrBuilder
        public boolean hasDialog() {
            return this.dialog_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.dialog_ != null) {
                codedOutputStream.writeMessage(1, getDialog());
            }
            if (!this.decisionTimestampEpoch_.isEmpty()) {
                codedOutputStream.writeString(2, getDecisionTimestampEpoch());
            }
            if (this.result_ != CoordinationResult.COORDINATION_RESULT_AGREED.getNumber()) {
                codedOutputStream.writeEnum(3, this.result_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<ReserveResponseResult, Builder> implements ReserveResponseResultOrBuilder {
            private Builder() {
                super(ReserveResponseResult.DEFAULT_INSTANCE);
            }

            public Builder clearDecisionTimestampEpoch() {
                copyOnWrite();
                ((ReserveResponseResult) this.instance).clearDecisionTimestampEpoch();
                return this;
            }

            public Builder clearDialog() {
                copyOnWrite();
                ((ReserveResponseResult) this.instance).clearDialog();
                return this;
            }

            public Builder clearResult() {
                copyOnWrite();
                ((ReserveResponseResult) this.instance).clearResult();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseResultOrBuilder
            public String getDecisionTimestampEpoch() {
                return ((ReserveResponseResult) this.instance).getDecisionTimestampEpoch();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseResultOrBuilder
            public ByteString getDecisionTimestampEpochBytes() {
                return ((ReserveResponseResult) this.instance).getDecisionTimestampEpochBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseResultOrBuilder
            public Speech.Dialog getDialog() {
                return ((ReserveResponseResult) this.instance).getDialog();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseResultOrBuilder
            public CoordinationResult getResult() {
                return ((ReserveResponseResult) this.instance).getResult();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseResultOrBuilder
            public int getResultValue() {
                return ((ReserveResponseResult) this.instance).getResultValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Lcrc.ReserveResponseResultOrBuilder
            public boolean hasDialog() {
                return ((ReserveResponseResult) this.instance).hasDialog();
            }

            public Builder mergeDialog(Speech.Dialog dialog) {
                copyOnWrite();
                ((ReserveResponseResult) this.instance).mergeDialog(dialog);
                return this;
            }

            public Builder setDecisionTimestampEpoch(String str) {
                copyOnWrite();
                ((ReserveResponseResult) this.instance).setDecisionTimestampEpoch(str);
                return this;
            }

            public Builder setDecisionTimestampEpochBytes(ByteString byteString) {
                copyOnWrite();
                ((ReserveResponseResult) this.instance).setDecisionTimestampEpochBytes(byteString);
                return this;
            }

            public Builder setDialog(Speech.Dialog dialog) {
                copyOnWrite();
                ((ReserveResponseResult) this.instance).setDialog(dialog);
                return this;
            }

            public Builder setResult(CoordinationResult coordinationResult) {
                copyOnWrite();
                ((ReserveResponseResult) this.instance).setResult(coordinationResult);
                return this;
            }

            public Builder setResultValue(int i) {
                copyOnWrite();
                ((ReserveResponseResult) this.instance).setResultValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setDialog(Speech.Dialog.Builder builder) {
                copyOnWrite();
                ((ReserveResponseResult) this.instance).setDialog(builder);
                return this;
            }
        }

        public static Builder newBuilder(ReserveResponseResult reserveResponseResult) {
            return DEFAULT_INSTANCE.createBuilder(reserveResponseResult);
        }

        public static ReserveResponseResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReserveResponseResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ReserveResponseResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReserveResponseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialog(Speech.Dialog dialog) {
            dialog.getClass();
            this.dialog_ = dialog;
        }

        public static ReserveResponseResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ReserveResponseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ReserveResponseResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReserveResponseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ReserveResponseResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ReserveResponseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ReserveResponseResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReserveResponseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ReserveResponseResult parseFrom(InputStream inputStream) throws IOException {
            return (ReserveResponseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReserveResponseResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReserveResponseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ReserveResponseResult parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ReserveResponseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ReserveResponseResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReserveResponseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum CoordinationPolicy implements Internal.EnumLite {
        COORDINATION_POLICY_SHALLOW(0),
        COORDINATION_POLICY_DEEP(1),
        UNRECOGNIZED(-1);

        public static final int COORDINATION_POLICY_DEEP_VALUE = 1;
        public static final int COORDINATION_POLICY_SHALLOW_VALUE = 0;
        private static final Internal.EnumLiteMap<CoordinationPolicy> internalValueMap = new Internal.EnumLiteMap<CoordinationPolicy>() { // from class: com.amazon.alexa.accessory.protocol.Lcrc.CoordinationPolicy.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public CoordinationPolicy findValueByNumber(int i) {
                return CoordinationPolicy.forNumber(i);
            }
        };
        private final int value;

        CoordinationPolicy(int i) {
            this.value = i;
        }

        public static CoordinationPolicy forNumber(int i) {
            if (i == 0) {
                return COORDINATION_POLICY_SHALLOW;
            }
            if (i != 1) {
                return null;
            }
            return COORDINATION_POLICY_DEEP;
        }

        public static Internal.EnumLiteMap<CoordinationPolicy> internalGetValueMap() {
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
        public static CoordinationPolicy valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum CoordinationResult implements Internal.EnumLite {
        COORDINATION_RESULT_AGREED(0),
        COORDINATION_RESULT_DISPUTED(1),
        UNRECOGNIZED(-1);

        public static final int COORDINATION_RESULT_AGREED_VALUE = 0;
        public static final int COORDINATION_RESULT_DISPUTED_VALUE = 1;
        private static final Internal.EnumLiteMap<CoordinationResult> internalValueMap = new Internal.EnumLiteMap<CoordinationResult>() { // from class: com.amazon.alexa.accessory.protocol.Lcrc.CoordinationResult.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public CoordinationResult findValueByNumber(int i) {
                return CoordinationResult.forNumber(i);
            }
        };
        private final int value;

        CoordinationResult(int i) {
            this.value = i;
        }

        public static CoordinationResult forNumber(int i) {
            if (i == 0) {
                return COORDINATION_RESULT_AGREED;
            }
            if (i != 1) {
                return null;
            }
            return COORDINATION_RESULT_DISPUTED;
        }

        public static Internal.EnumLiteMap<CoordinationResult> internalGetValueMap() {
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
        public static CoordinationResult valueOf(int i) {
            return forNumber(i);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
