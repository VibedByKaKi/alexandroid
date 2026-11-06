package com.amazon.alexa.accessory.protocol;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class Accessproof {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.Accessproof$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$Accessproof$NextAction$ActionCase;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[NextAction.ActionCase.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$Accessproof$NextAction$ActionCase = iArr;
            try {
                iArr[NextAction.ActionCase.COLLECT_CONSENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Accessproof$NextAction$ActionCase[NextAction.ActionCase.REATTEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Accessproof$NextAction$ActionCase[NextAction.ActionCase.ACTION_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr2;
            try {
                iArr2[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CollectConsentActionOrBuilder extends MessageLiteOrBuilder {
        String getRequiredScope(int i);

        ByteString getRequiredScopeBytes(int i);

        int getRequiredScopeCount();

        List<String> getRequiredScopeList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NextActionOrBuilder extends MessageLiteOrBuilder {
        NextAction.ActionCase getActionCase();

        CollectConsentAction getCollectConsent();

        ReattestAction getReattest();

        boolean hasCollectConsent();

        boolean hasReattest();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ReattestActionOrBuilder extends MessageLiteOrBuilder {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface VerifyAccessProofOrBuilder extends MessageLiteOrBuilder {
        ByteString getAssertion();

        ByteString getAttestationObjectChecksum();

        ByteString getAttestationObjectChunk();

        int getAttestationObjectSize();

        ByteString getChallenge();

        int getChunkCount();

        int getChunkIndex();

        ByteString getKeyId();

        String getRequestedScope(int i);

        ByteString getRequestedScopeBytes(int i);

        int getRequestedScopeCount();

        List<String> getRequestedScopeList();

        String getTxnId();

        ByteString getTxnIdBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface VerifyAccessProofResultOrBuilder extends MessageLiteOrBuilder {
        NextAction getNextAction();

        VerifyRejectReason getReason();

        int getReasonValue();

        String getTxnId();

        ByteString getTxnIdBytes();

        ProofVerdict getVerdict();

        int getVerdictValue();

        boolean hasNextAction();
    }

    private Accessproof() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NextAction extends GeneratedMessageLite<NextAction, Builder> implements NextActionOrBuilder {
        public static final int COLLECT_CONSENT_FIELD_NUMBER = 1;
        private static final NextAction DEFAULT_INSTANCE;
        private static volatile Parser<NextAction> PARSER = null;
        public static final int REATTEST_FIELD_NUMBER = 2;
        private int actionCase_ = 0;
        private Object action_;

        static {
            NextAction nextAction = new NextAction();
            DEFAULT_INSTANCE = nextAction;
            nextAction.makeImmutable();
        }

        private NextAction() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.actionCase_ = 0;
            this.action_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCollectConsent() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReattest() {
            if (this.actionCase_ == 2) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static NextAction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCollectConsent(CollectConsentAction collectConsentAction) {
            if (this.actionCase_ != 1 || this.action_ == CollectConsentAction.getDefaultInstance()) {
                this.action_ = collectConsentAction;
            } else {
                this.action_ = CollectConsentAction.newBuilder((CollectConsentAction) this.action_).mergeFrom((CollectConsentAction.Builder) collectConsentAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeReattest(ReattestAction reattestAction) {
            if (this.actionCase_ != 2 || this.action_ == ReattestAction.getDefaultInstance()) {
                this.action_ = reattestAction;
            } else {
                this.action_ = ReattestAction.newBuilder((ReattestAction) this.action_).mergeFrom((ReattestAction.Builder) reattestAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NextAction parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NextAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NextAction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NextAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NextAction> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCollectConsent(CollectConsentAction.Builder builder) {
            this.action_ = builder.build();
            this.actionCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReattest(ReattestAction.Builder builder) {
            this.action_ = builder.build();
            this.actionCase_ = 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NextAction();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    NextAction nextAction = (NextAction) obj2;
                    int i2 = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Accessproof$NextAction$ActionCase[nextAction.getActionCase().ordinal()];
                    if (i2 == 1) {
                        this.action_ = visitor.visitOneofMessage(this.actionCase_ == 1, this.action_, nextAction.action_);
                    } else if (i2 == 2) {
                        this.action_ = visitor.visitOneofMessage(this.actionCase_ == 2, this.action_, nextAction.action_);
                    } else if (i2 == 3) {
                        visitor.visitOneofNotSet(this.actionCase_ != 0);
                    }
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE && (i = nextAction.actionCase_) != 0) {
                        this.actionCase_ = i;
                    }
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
                                    CollectConsentAction.Builder builder = this.actionCase_ == 1 ? ((CollectConsentAction) this.action_).toBuilder() : null;
                                    MessageLite readMessage = codedInputStream.readMessage(CollectConsentAction.parser(), extensionRegistryLite);
                                    this.action_ = readMessage;
                                    if (builder != null) {
                                        builder.mergeFrom((CollectConsentAction.Builder) readMessage);
                                        this.action_ = builder.buildPartial();
                                    }
                                    this.actionCase_ = 1;
                                } else if (readTag == 18) {
                                    ReattestAction.Builder builder2 = this.actionCase_ == 2 ? ((ReattestAction) this.action_).toBuilder() : null;
                                    MessageLite readMessage2 = codedInputStream.readMessage(ReattestAction.parser(), extensionRegistryLite);
                                    this.action_ = readMessage2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((ReattestAction.Builder) readMessage2);
                                        this.action_ = builder2.buildPartial();
                                    }
                                    this.actionCase_ = 2;
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
                        synchronized (NextAction.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.NextActionOrBuilder
        public ActionCase getActionCase() {
            return ActionCase.forNumber(this.actionCase_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.NextActionOrBuilder
        public CollectConsentAction getCollectConsent() {
            return this.actionCase_ == 1 ? (CollectConsentAction) this.action_ : CollectConsentAction.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.NextActionOrBuilder
        public ReattestAction getReattest() {
            return this.actionCase_ == 2 ? (ReattestAction) this.action_ : ReattestAction.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.actionCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (CollectConsentAction) this.action_) : 0;
            if (this.actionCase_ == 2) {
                computeMessageSize += CodedOutputStream.computeMessageSize(2, (ReattestAction) this.action_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.NextActionOrBuilder
        public boolean hasCollectConsent() {
            return this.actionCase_ == 1;
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.NextActionOrBuilder
        public boolean hasReattest() {
            return this.actionCase_ == 2;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.actionCase_ == 1) {
                codedOutputStream.writeMessage(1, (CollectConsentAction) this.action_);
            }
            if (this.actionCase_ == 2) {
                codedOutputStream.writeMessage(2, (ReattestAction) this.action_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NextAction, Builder> implements NextActionOrBuilder {
            private Builder() {
                super(NextAction.DEFAULT_INSTANCE);
            }

            public Builder clearAction() {
                copyOnWrite();
                ((NextAction) this.instance).clearAction();
                return this;
            }

            public Builder clearCollectConsent() {
                copyOnWrite();
                ((NextAction) this.instance).clearCollectConsent();
                return this;
            }

            public Builder clearReattest() {
                copyOnWrite();
                ((NextAction) this.instance).clearReattest();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.NextActionOrBuilder
            public ActionCase getActionCase() {
                return ((NextAction) this.instance).getActionCase();
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.NextActionOrBuilder
            public CollectConsentAction getCollectConsent() {
                return ((NextAction) this.instance).getCollectConsent();
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.NextActionOrBuilder
            public ReattestAction getReattest() {
                return ((NextAction) this.instance).getReattest();
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.NextActionOrBuilder
            public boolean hasCollectConsent() {
                return ((NextAction) this.instance).hasCollectConsent();
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.NextActionOrBuilder
            public boolean hasReattest() {
                return ((NextAction) this.instance).hasReattest();
            }

            public Builder mergeCollectConsent(CollectConsentAction collectConsentAction) {
                copyOnWrite();
                ((NextAction) this.instance).mergeCollectConsent(collectConsentAction);
                return this;
            }

            public Builder mergeReattest(ReattestAction reattestAction) {
                copyOnWrite();
                ((NextAction) this.instance).mergeReattest(reattestAction);
                return this;
            }

            public Builder setCollectConsent(CollectConsentAction collectConsentAction) {
                copyOnWrite();
                ((NextAction) this.instance).setCollectConsent(collectConsentAction);
                return this;
            }

            public Builder setReattest(ReattestAction reattestAction) {
                copyOnWrite();
                ((NextAction) this.instance).setReattest(reattestAction);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setCollectConsent(CollectConsentAction.Builder builder) {
                copyOnWrite();
                ((NextAction) this.instance).setCollectConsent(builder);
                return this;
            }

            public Builder setReattest(ReattestAction.Builder builder) {
                copyOnWrite();
                ((NextAction) this.instance).setReattest(builder);
                return this;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum ActionCase implements Internal.EnumLite {
            COLLECT_CONSENT(1),
            REATTEST(2),
            ACTION_NOT_SET(0);

            private final int value;

            ActionCase(int i) {
                this.value = i;
            }

            public static ActionCase forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i == 1) {
                    return COLLECT_CONSENT;
                }
                if (i != 2) {
                    return null;
                }
                return REATTEST;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ActionCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(NextAction nextAction) {
            return DEFAULT_INSTANCE.createBuilder(nextAction);
        }

        public static NextAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NextAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NextAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NextAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NextAction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NextAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCollectConsent(CollectConsentAction collectConsentAction) {
            collectConsentAction.getClass();
            this.action_ = collectConsentAction;
            this.actionCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReattest(ReattestAction reattestAction) {
            reattestAction.getClass();
            this.action_ = reattestAction;
            this.actionCase_ = 2;
        }

        public static NextAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NextAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NextAction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NextAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NextAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NextAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NextAction parseFrom(InputStream inputStream) throws IOException {
            return (NextAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NextAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NextAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NextAction parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NextAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NextAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NextAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class VerifyAccessProofResult extends GeneratedMessageLite<VerifyAccessProofResult, Builder> implements VerifyAccessProofResultOrBuilder {
        private static final VerifyAccessProofResult DEFAULT_INSTANCE;
        public static final int NEXT_ACTION_FIELD_NUMBER = 4;
        private static volatile Parser<VerifyAccessProofResult> PARSER = null;
        public static final int REASON_FIELD_NUMBER = 3;
        public static final int TXN_ID_FIELD_NUMBER = 1;
        public static final int VERDICT_FIELD_NUMBER = 2;
        private NextAction nextAction_;
        private int reason_;
        private String txnId_ = "";
        private int verdict_;

        static {
            VerifyAccessProofResult verifyAccessProofResult = new VerifyAccessProofResult();
            DEFAULT_INSTANCE = verifyAccessProofResult;
            verifyAccessProofResult.makeImmutable();
        }

        private VerifyAccessProofResult() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNextAction() {
            this.nextAction_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReason() {
            this.reason_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTxnId() {
            this.txnId_ = getDefaultInstance().getTxnId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVerdict() {
            this.verdict_ = 0;
        }

        public static VerifyAccessProofResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNextAction(NextAction nextAction) {
            NextAction nextAction2 = this.nextAction_;
            if (nextAction2 == null || nextAction2 == NextAction.getDefaultInstance()) {
                this.nextAction_ = nextAction;
            } else {
                this.nextAction_ = NextAction.newBuilder(this.nextAction_).mergeFrom((NextAction.Builder) nextAction).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VerifyAccessProofResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VerifyAccessProofResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VerifyAccessProofResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VerifyAccessProofResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VerifyAccessProofResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNextAction(NextAction.Builder builder) {
            this.nextAction_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReason(VerifyRejectReason verifyRejectReason) {
            verifyRejectReason.getClass();
            this.reason_ = verifyRejectReason.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReasonValue(int i) {
            this.reason_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTxnId(String str) {
            str.getClass();
            this.txnId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTxnIdBytes(ByteString byteString) {
            this.txnId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVerdict(ProofVerdict proofVerdict) {
            proofVerdict.getClass();
            this.verdict_ = proofVerdict.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVerdictValue(int i) {
            this.verdict_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new VerifyAccessProofResult();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    VerifyAccessProofResult verifyAccessProofResult = (VerifyAccessProofResult) obj2;
                    this.txnId_ = visitor.visitString(!this.txnId_.isEmpty(), this.txnId_, !verifyAccessProofResult.txnId_.isEmpty(), verifyAccessProofResult.txnId_);
                    int i = this.verdict_;
                    boolean z = i != 0;
                    int i2 = verifyAccessProofResult.verdict_;
                    this.verdict_ = visitor.visitInt(z, i, i2 != 0, i2);
                    int i3 = this.reason_;
                    boolean z2 = i3 != 0;
                    int i4 = verifyAccessProofResult.reason_;
                    this.reason_ = visitor.visitInt(z2, i3, i4 != 0, i4);
                    this.nextAction_ = (NextAction) visitor.visitMessage(this.nextAction_, verifyAccessProofResult.nextAction_);
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
                                    this.txnId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 16) {
                                    this.verdict_ = codedInputStream.readEnum();
                                } else if (readTag == 24) {
                                    this.reason_ = codedInputStream.readEnum();
                                } else if (readTag == 34) {
                                    NextAction nextAction = this.nextAction_;
                                    NextAction.Builder builder = nextAction != null ? nextAction.toBuilder() : null;
                                    NextAction nextAction2 = (NextAction) codedInputStream.readMessage(NextAction.parser(), extensionRegistryLite);
                                    this.nextAction_ = nextAction2;
                                    if (builder != null) {
                                        builder.mergeFrom((NextAction.Builder) nextAction2);
                                        this.nextAction_ = builder.buildPartial();
                                    }
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
                        synchronized (VerifyAccessProofResult.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofResultOrBuilder
        public NextAction getNextAction() {
            NextAction nextAction = this.nextAction_;
            return nextAction == null ? NextAction.getDefaultInstance() : nextAction;
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofResultOrBuilder
        public VerifyRejectReason getReason() {
            VerifyRejectReason forNumber = VerifyRejectReason.forNumber(this.reason_);
            return forNumber == null ? VerifyRejectReason.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofResultOrBuilder
        public int getReasonValue() {
            return this.reason_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.txnId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getTxnId()) : 0;
            if (this.verdict_ != ProofVerdict.PROOF_VERDICT_UNSPECIFIED.getNumber()) {
                computeStringSize += CodedOutputStream.computeEnumSize(2, this.verdict_);
            }
            if (this.reason_ != VerifyRejectReason.VERIFY_REJECT_UNSPECIFIED.getNumber()) {
                computeStringSize += CodedOutputStream.computeEnumSize(3, this.reason_);
            }
            if (this.nextAction_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(4, getNextAction());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofResultOrBuilder
        public String getTxnId() {
            return this.txnId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofResultOrBuilder
        public ByteString getTxnIdBytes() {
            return ByteString.copyFromUtf8(this.txnId_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofResultOrBuilder
        public ProofVerdict getVerdict() {
            ProofVerdict forNumber = ProofVerdict.forNumber(this.verdict_);
            return forNumber == null ? ProofVerdict.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofResultOrBuilder
        public int getVerdictValue() {
            return this.verdict_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofResultOrBuilder
        public boolean hasNextAction() {
            return this.nextAction_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.txnId_.isEmpty()) {
                codedOutputStream.writeString(1, getTxnId());
            }
            if (this.verdict_ != ProofVerdict.PROOF_VERDICT_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(2, this.verdict_);
            }
            if (this.reason_ != VerifyRejectReason.VERIFY_REJECT_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(3, this.reason_);
            }
            if (this.nextAction_ != null) {
                codedOutputStream.writeMessage(4, getNextAction());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<VerifyAccessProofResult, Builder> implements VerifyAccessProofResultOrBuilder {
            private Builder() {
                super(VerifyAccessProofResult.DEFAULT_INSTANCE);
            }

            public Builder clearNextAction() {
                copyOnWrite();
                ((VerifyAccessProofResult) this.instance).clearNextAction();
                return this;
            }

            public Builder clearReason() {
                copyOnWrite();
                ((VerifyAccessProofResult) this.instance).clearReason();
                return this;
            }

            public Builder clearTxnId() {
                copyOnWrite();
                ((VerifyAccessProofResult) this.instance).clearTxnId();
                return this;
            }

            public Builder clearVerdict() {
                copyOnWrite();
                ((VerifyAccessProofResult) this.instance).clearVerdict();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofResultOrBuilder
            public NextAction getNextAction() {
                return ((VerifyAccessProofResult) this.instance).getNextAction();
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofResultOrBuilder
            public VerifyRejectReason getReason() {
                return ((VerifyAccessProofResult) this.instance).getReason();
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofResultOrBuilder
            public int getReasonValue() {
                return ((VerifyAccessProofResult) this.instance).getReasonValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofResultOrBuilder
            public String getTxnId() {
                return ((VerifyAccessProofResult) this.instance).getTxnId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofResultOrBuilder
            public ByteString getTxnIdBytes() {
                return ((VerifyAccessProofResult) this.instance).getTxnIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofResultOrBuilder
            public ProofVerdict getVerdict() {
                return ((VerifyAccessProofResult) this.instance).getVerdict();
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofResultOrBuilder
            public int getVerdictValue() {
                return ((VerifyAccessProofResult) this.instance).getVerdictValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofResultOrBuilder
            public boolean hasNextAction() {
                return ((VerifyAccessProofResult) this.instance).hasNextAction();
            }

            public Builder mergeNextAction(NextAction nextAction) {
                copyOnWrite();
                ((VerifyAccessProofResult) this.instance).mergeNextAction(nextAction);
                return this;
            }

            public Builder setNextAction(NextAction nextAction) {
                copyOnWrite();
                ((VerifyAccessProofResult) this.instance).setNextAction(nextAction);
                return this;
            }

            public Builder setReason(VerifyRejectReason verifyRejectReason) {
                copyOnWrite();
                ((VerifyAccessProofResult) this.instance).setReason(verifyRejectReason);
                return this;
            }

            public Builder setReasonValue(int i) {
                copyOnWrite();
                ((VerifyAccessProofResult) this.instance).setReasonValue(i);
                return this;
            }

            public Builder setTxnId(String str) {
                copyOnWrite();
                ((VerifyAccessProofResult) this.instance).setTxnId(str);
                return this;
            }

            public Builder setTxnIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VerifyAccessProofResult) this.instance).setTxnIdBytes(byteString);
                return this;
            }

            public Builder setVerdict(ProofVerdict proofVerdict) {
                copyOnWrite();
                ((VerifyAccessProofResult) this.instance).setVerdict(proofVerdict);
                return this;
            }

            public Builder setVerdictValue(int i) {
                copyOnWrite();
                ((VerifyAccessProofResult) this.instance).setVerdictValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setNextAction(NextAction.Builder builder) {
                copyOnWrite();
                ((VerifyAccessProofResult) this.instance).setNextAction(builder);
                return this;
            }
        }

        public static Builder newBuilder(VerifyAccessProofResult verifyAccessProofResult) {
            return DEFAULT_INSTANCE.createBuilder(verifyAccessProofResult);
        }

        public static VerifyAccessProofResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VerifyAccessProofResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VerifyAccessProofResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VerifyAccessProofResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNextAction(NextAction nextAction) {
            nextAction.getClass();
            this.nextAction_ = nextAction;
        }

        public static VerifyAccessProofResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VerifyAccessProofResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VerifyAccessProofResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VerifyAccessProofResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VerifyAccessProofResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VerifyAccessProofResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VerifyAccessProofResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VerifyAccessProofResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VerifyAccessProofResult parseFrom(InputStream inputStream) throws IOException {
            return (VerifyAccessProofResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VerifyAccessProofResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VerifyAccessProofResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VerifyAccessProofResult parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VerifyAccessProofResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VerifyAccessProofResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VerifyAccessProofResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CollectConsentAction extends GeneratedMessageLite<CollectConsentAction, Builder> implements CollectConsentActionOrBuilder {
        private static final CollectConsentAction DEFAULT_INSTANCE;
        private static volatile Parser<CollectConsentAction> PARSER = null;
        public static final int REQUIRED_SCOPE_FIELD_NUMBER = 1;
        private Internal.ProtobufList<String> requiredScope_ = GeneratedMessageLite.emptyProtobufList();

        static {
            CollectConsentAction collectConsentAction = new CollectConsentAction();
            DEFAULT_INSTANCE = collectConsentAction;
            collectConsentAction.makeImmutable();
        }

        private CollectConsentAction() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRequiredScope(Iterable<String> iterable) {
            ensureRequiredScopeIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.requiredScope_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRequiredScope(String str) {
            str.getClass();
            ensureRequiredScopeIsMutable();
            this.requiredScope_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRequiredScopeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureRequiredScopeIsMutable();
            this.requiredScope_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequiredScope() {
            this.requiredScope_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureRequiredScopeIsMutable() {
            if (this.requiredScope_.isModifiable()) {
                return;
            }
            this.requiredScope_ = GeneratedMessageLite.mutableCopy(this.requiredScope_);
        }

        public static CollectConsentAction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CollectConsentAction parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CollectConsentAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CollectConsentAction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CollectConsentAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CollectConsentAction> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequiredScope(int i, String str) {
            str.getClass();
            ensureRequiredScopeIsMutable();
            this.requiredScope_.set(i, str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CollectConsentAction();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.requiredScope_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.requiredScope_ = ((GeneratedMessageLite.Visitor) obj).visitList(this.requiredScope_, ((CollectConsentAction) obj2).requiredScope_);
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
                                    String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                    if (!this.requiredScope_.isModifiable()) {
                                        this.requiredScope_ = GeneratedMessageLite.mutableCopy(this.requiredScope_);
                                    }
                                    this.requiredScope_.add(readStringRequireUtf8);
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
                        synchronized (CollectConsentAction.class) {
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
                case 10:
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.CollectConsentActionOrBuilder
        public String getRequiredScope(int i) {
            return this.requiredScope_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.CollectConsentActionOrBuilder
        public ByteString getRequiredScopeBytes(int i) {
            return ByteString.copyFromUtf8(this.requiredScope_.get(i));
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.CollectConsentActionOrBuilder
        public int getRequiredScopeCount() {
            return this.requiredScope_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.CollectConsentActionOrBuilder
        public List<String> getRequiredScopeList() {
            return this.requiredScope_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.requiredScope_.size(); i3++) {
                i2 += CodedOutputStream.computeStringSizeNoTag(this.requiredScope_.get(i3));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + getRequiredScopeList().size() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.requiredScope_.size(); i++) {
                codedOutputStream.writeString(1, this.requiredScope_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<CollectConsentAction, Builder> implements CollectConsentActionOrBuilder {
            private Builder() {
                super(CollectConsentAction.DEFAULT_INSTANCE);
            }

            public Builder addAllRequiredScope(Iterable<String> iterable) {
                copyOnWrite();
                ((CollectConsentAction) this.instance).addAllRequiredScope(iterable);
                return this;
            }

            public Builder addRequiredScope(String str) {
                copyOnWrite();
                ((CollectConsentAction) this.instance).addRequiredScope(str);
                return this;
            }

            public Builder addRequiredScopeBytes(ByteString byteString) {
                copyOnWrite();
                ((CollectConsentAction) this.instance).addRequiredScopeBytes(byteString);
                return this;
            }

            public Builder clearRequiredScope() {
                copyOnWrite();
                ((CollectConsentAction) this.instance).clearRequiredScope();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.CollectConsentActionOrBuilder
            public String getRequiredScope(int i) {
                return ((CollectConsentAction) this.instance).getRequiredScope(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.CollectConsentActionOrBuilder
            public ByteString getRequiredScopeBytes(int i) {
                return ((CollectConsentAction) this.instance).getRequiredScopeBytes(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.CollectConsentActionOrBuilder
            public int getRequiredScopeCount() {
                return ((CollectConsentAction) this.instance).getRequiredScopeCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.CollectConsentActionOrBuilder
            public List<String> getRequiredScopeList() {
                return Collections.unmodifiableList(((CollectConsentAction) this.instance).getRequiredScopeList());
            }

            public Builder setRequiredScope(int i, String str) {
                copyOnWrite();
                ((CollectConsentAction) this.instance).setRequiredScope(i, str);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(CollectConsentAction collectConsentAction) {
            return DEFAULT_INSTANCE.createBuilder(collectConsentAction);
        }

        public static CollectConsentAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CollectConsentAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CollectConsentAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CollectConsentAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CollectConsentAction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CollectConsentAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CollectConsentAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CollectConsentAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CollectConsentAction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CollectConsentAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CollectConsentAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CollectConsentAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CollectConsentAction parseFrom(InputStream inputStream) throws IOException {
            return (CollectConsentAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CollectConsentAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CollectConsentAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CollectConsentAction parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CollectConsentAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CollectConsentAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CollectConsentAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ReattestAction extends GeneratedMessageLite<ReattestAction, Builder> implements ReattestActionOrBuilder {
        private static final ReattestAction DEFAULT_INSTANCE;
        private static volatile Parser<ReattestAction> PARSER;

        static {
            ReattestAction reattestAction = new ReattestAction();
            DEFAULT_INSTANCE = reattestAction;
            reattestAction.makeImmutable();
        }

        private ReattestAction() {
        }

        public static ReattestAction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ReattestAction parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ReattestAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReattestAction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ReattestAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ReattestAction> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ReattestAction();
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
                        synchronized (ReattestAction.class) {
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
        public static final class Builder extends GeneratedMessageLite.Builder<ReattestAction, Builder> implements ReattestActionOrBuilder {
            private Builder() {
                super(ReattestAction.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(ReattestAction reattestAction) {
            return DEFAULT_INSTANCE.createBuilder(reattestAction);
        }

        public static ReattestAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReattestAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ReattestAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReattestAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ReattestAction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ReattestAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ReattestAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReattestAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ReattestAction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ReattestAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ReattestAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReattestAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ReattestAction parseFrom(InputStream inputStream) throws IOException {
            return (ReattestAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReattestAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReattestAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ReattestAction parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ReattestAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ReattestAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReattestAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class VerifyAccessProof extends GeneratedMessageLite<VerifyAccessProof, Builder> implements VerifyAccessProofOrBuilder {
        public static final int ASSERTION_FIELD_NUMBER = 2;
        public static final int ATTESTATION_OBJECT_CHECKSUM_FIELD_NUMBER = 9;
        public static final int ATTESTATION_OBJECT_CHUNK_FIELD_NUMBER = 10;
        public static final int ATTESTATION_OBJECT_SIZE_FIELD_NUMBER = 8;
        public static final int CHALLENGE_FIELD_NUMBER = 5;
        public static final int CHUNK_COUNT_FIELD_NUMBER = 6;
        public static final int CHUNK_INDEX_FIELD_NUMBER = 7;
        private static final VerifyAccessProof DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        private static volatile Parser<VerifyAccessProof> PARSER = null;
        public static final int REQUESTED_SCOPE_FIELD_NUMBER = 4;
        public static final int TXN_ID_FIELD_NUMBER = 1;
        private ByteString assertion_;
        private ByteString attestationObjectChecksum_;
        private ByteString attestationObjectChunk_;
        private int attestationObjectSize_;
        private int bitField0_;
        private ByteString challenge_;
        private int chunkCount_;
        private int chunkIndex_;
        private ByteString keyId_;
        private Internal.ProtobufList<String> requestedScope_;
        private String txnId_ = "";

        static {
            VerifyAccessProof verifyAccessProof = new VerifyAccessProof();
            DEFAULT_INSTANCE = verifyAccessProof;
            verifyAccessProof.makeImmutable();
        }

        private VerifyAccessProof() {
            ByteString byteString = ByteString.EMPTY;
            this.assertion_ = byteString;
            this.keyId_ = byteString;
            this.requestedScope_ = GeneratedMessageLite.emptyProtobufList();
            this.challenge_ = byteString;
            this.attestationObjectChecksum_ = byteString;
            this.attestationObjectChunk_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRequestedScope(Iterable<String> iterable) {
            ensureRequestedScopeIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.requestedScope_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRequestedScope(String str) {
            str.getClass();
            ensureRequestedScopeIsMutable();
            this.requestedScope_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRequestedScopeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureRequestedScopeIsMutable();
            this.requestedScope_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssertion() {
            this.assertion_ = getDefaultInstance().getAssertion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAttestationObjectChecksum() {
            this.attestationObjectChecksum_ = getDefaultInstance().getAttestationObjectChecksum();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAttestationObjectChunk() {
            this.attestationObjectChunk_ = getDefaultInstance().getAttestationObjectChunk();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAttestationObjectSize() {
            this.attestationObjectSize_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChallenge() {
            this.challenge_ = getDefaultInstance().getChallenge();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChunkCount() {
            this.chunkCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChunkIndex() {
            this.chunkIndex_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeyId() {
            this.keyId_ = getDefaultInstance().getKeyId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequestedScope() {
            this.requestedScope_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTxnId() {
            this.txnId_ = getDefaultInstance().getTxnId();
        }

        private void ensureRequestedScopeIsMutable() {
            if (this.requestedScope_.isModifiable()) {
                return;
            }
            this.requestedScope_ = GeneratedMessageLite.mutableCopy(this.requestedScope_);
        }

        public static VerifyAccessProof getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VerifyAccessProof parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VerifyAccessProof) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VerifyAccessProof parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VerifyAccessProof) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VerifyAccessProof> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssertion(ByteString byteString) {
            byteString.getClass();
            this.assertion_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAttestationObjectChecksum(ByteString byteString) {
            byteString.getClass();
            this.attestationObjectChecksum_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAttestationObjectChunk(ByteString byteString) {
            byteString.getClass();
            this.attestationObjectChunk_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAttestationObjectSize(int i) {
            this.attestationObjectSize_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChallenge(ByteString byteString) {
            byteString.getClass();
            this.challenge_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChunkCount(int i) {
            this.chunkCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChunkIndex(int i) {
            this.chunkIndex_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyId(ByteString byteString) {
            byteString.getClass();
            this.keyId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestedScope(int i, String str) {
            str.getClass();
            ensureRequestedScopeIsMutable();
            this.requestedScope_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTxnId(String str) {
            str.getClass();
            this.txnId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTxnIdBytes(ByteString byteString) {
            this.txnId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new VerifyAccessProof();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.requestedScope_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    VerifyAccessProof verifyAccessProof = (VerifyAccessProof) obj2;
                    this.txnId_ = visitor.visitString(!this.txnId_.isEmpty(), this.txnId_, !verifyAccessProof.txnId_.isEmpty(), verifyAccessProof.txnId_);
                    ByteString byteString = this.assertion_;
                    ByteString byteString2 = ByteString.EMPTY;
                    boolean z = byteString != byteString2;
                    ByteString byteString3 = verifyAccessProof.assertion_;
                    this.assertion_ = visitor.visitByteString(z, byteString, byteString3 != byteString2, byteString3);
                    ByteString byteString4 = this.keyId_;
                    boolean z2 = byteString4 != byteString2;
                    ByteString byteString5 = verifyAccessProof.keyId_;
                    this.keyId_ = visitor.visitByteString(z2, byteString4, byteString5 != byteString2, byteString5);
                    this.requestedScope_ = visitor.visitList(this.requestedScope_, verifyAccessProof.requestedScope_);
                    ByteString byteString6 = this.challenge_;
                    boolean z3 = byteString6 != byteString2;
                    ByteString byteString7 = verifyAccessProof.challenge_;
                    this.challenge_ = visitor.visitByteString(z3, byteString6, byteString7 != byteString2, byteString7);
                    int i = this.chunkCount_;
                    boolean z4 = i != 0;
                    int i2 = verifyAccessProof.chunkCount_;
                    this.chunkCount_ = visitor.visitInt(z4, i, i2 != 0, i2);
                    int i3 = this.chunkIndex_;
                    boolean z5 = i3 != 0;
                    int i4 = verifyAccessProof.chunkIndex_;
                    this.chunkIndex_ = visitor.visitInt(z5, i3, i4 != 0, i4);
                    int i5 = this.attestationObjectSize_;
                    boolean z6 = i5 != 0;
                    int i6 = verifyAccessProof.attestationObjectSize_;
                    this.attestationObjectSize_ = visitor.visitInt(z6, i5, i6 != 0, i6);
                    ByteString byteString8 = this.attestationObjectChecksum_;
                    boolean z7 = byteString8 != byteString2;
                    ByteString byteString9 = verifyAccessProof.attestationObjectChecksum_;
                    this.attestationObjectChecksum_ = visitor.visitByteString(z7, byteString8, byteString9 != byteString2, byteString9);
                    ByteString byteString10 = this.attestationObjectChunk_;
                    boolean z8 = byteString10 != byteString2;
                    ByteString byteString11 = verifyAccessProof.attestationObjectChunk_;
                    this.attestationObjectChunk_ = visitor.visitByteString(z8, byteString10, byteString11 != byteString2, byteString11);
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                        this.bitField0_ |= verifyAccessProof.bitField0_;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            switch (readTag) {
                                case 0:
                                    objArr = 1;
                                case 10:
                                    this.txnId_ = codedInputStream.readStringRequireUtf8();
                                case 18:
                                    this.assertion_ = codedInputStream.readBytes();
                                case 26:
                                    this.keyId_ = codedInputStream.readBytes();
                                case 34:
                                    String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                    if (!this.requestedScope_.isModifiable()) {
                                        this.requestedScope_ = GeneratedMessageLite.mutableCopy(this.requestedScope_);
                                    }
                                    this.requestedScope_.add(readStringRequireUtf8);
                                case 42:
                                    this.challenge_ = codedInputStream.readBytes();
                                case 48:
                                    this.chunkCount_ = codedInputStream.readUInt32();
                                case 56:
                                    this.chunkIndex_ = codedInputStream.readUInt32();
                                case 64:
                                    this.attestationObjectSize_ = codedInputStream.readUInt32();
                                case 74:
                                    this.attestationObjectChecksum_ = codedInputStream.readBytes();
                                case 82:
                                    this.attestationObjectChunk_ = codedInputStream.readBytes();
                                default:
                                    if (!parseUnknownField(readTag, codedInputStream)) {
                                        objArr = 1;
                                    }
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
                        synchronized (VerifyAccessProof.class) {
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
                case 10:
                    return null;
                default:
                    Duration$$ExternalSyntheticBUOutline0.m();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
        public ByteString getAssertion() {
            return this.assertion_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
        public ByteString getAttestationObjectChecksum() {
            return this.attestationObjectChecksum_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
        public ByteString getAttestationObjectChunk() {
            return this.attestationObjectChunk_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
        public int getAttestationObjectSize() {
            return this.attestationObjectSize_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
        public ByteString getChallenge() {
            return this.challenge_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
        public int getChunkCount() {
            return this.chunkCount_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
        public int getChunkIndex() {
            return this.chunkIndex_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
        public ByteString getKeyId() {
            return this.keyId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
        public String getRequestedScope(int i) {
            return this.requestedScope_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
        public ByteString getRequestedScopeBytes(int i) {
            return ByteString.copyFromUtf8(this.requestedScope_.get(i));
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
        public int getRequestedScopeCount() {
            return this.requestedScope_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
        public List<String> getRequestedScopeList() {
            return this.requestedScope_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.txnId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getTxnId()) : 0;
            if (!this.assertion_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeBytesSize(2, this.assertion_);
            }
            if (!this.keyId_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeBytesSize(3, this.keyId_);
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.requestedScope_.size(); i3++) {
                i2 += CodedOutputStream.computeStringSizeNoTag(this.requestedScope_.get(i3));
            }
            int size = getRequestedScopeList().size() + computeStringSize + i2;
            if (!this.challenge_.isEmpty()) {
                size += CodedOutputStream.computeBytesSize(5, this.challenge_);
            }
            int i4 = this.chunkCount_;
            if (i4 != 0) {
                size += CodedOutputStream.computeUInt32Size(6, i4);
            }
            int i5 = this.chunkIndex_;
            if (i5 != 0) {
                size += CodedOutputStream.computeUInt32Size(7, i5);
            }
            int i6 = this.attestationObjectSize_;
            if (i6 != 0) {
                size += CodedOutputStream.computeUInt32Size(8, i6);
            }
            if (!this.attestationObjectChecksum_.isEmpty()) {
                size += CodedOutputStream.computeBytesSize(9, this.attestationObjectChecksum_);
            }
            if (!this.attestationObjectChunk_.isEmpty()) {
                size += CodedOutputStream.computeBytesSize(10, this.attestationObjectChunk_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
        public String getTxnId() {
            return this.txnId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
        public ByteString getTxnIdBytes() {
            return ByteString.copyFromUtf8(this.txnId_);
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.txnId_.isEmpty()) {
                codedOutputStream.writeString(1, getTxnId());
            }
            if (!this.assertion_.isEmpty()) {
                codedOutputStream.writeBytes(2, this.assertion_);
            }
            if (!this.keyId_.isEmpty()) {
                codedOutputStream.writeBytes(3, this.keyId_);
            }
            for (int i = 0; i < this.requestedScope_.size(); i++) {
                codedOutputStream.writeString(4, this.requestedScope_.get(i));
            }
            if (!this.challenge_.isEmpty()) {
                codedOutputStream.writeBytes(5, this.challenge_);
            }
            int i2 = this.chunkCount_;
            if (i2 != 0) {
                codedOutputStream.writeUInt32(6, i2);
            }
            int i3 = this.chunkIndex_;
            if (i3 != 0) {
                codedOutputStream.writeUInt32(7, i3);
            }
            int i4 = this.attestationObjectSize_;
            if (i4 != 0) {
                codedOutputStream.writeUInt32(8, i4);
            }
            if (!this.attestationObjectChecksum_.isEmpty()) {
                codedOutputStream.writeBytes(9, this.attestationObjectChecksum_);
            }
            if (!this.attestationObjectChunk_.isEmpty()) {
                codedOutputStream.writeBytes(10, this.attestationObjectChunk_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<VerifyAccessProof, Builder> implements VerifyAccessProofOrBuilder {
            private Builder() {
                super(VerifyAccessProof.DEFAULT_INSTANCE);
            }

            public Builder addAllRequestedScope(Iterable<String> iterable) {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).addAllRequestedScope(iterable);
                return this;
            }

            public Builder addRequestedScope(String str) {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).addRequestedScope(str);
                return this;
            }

            public Builder addRequestedScopeBytes(ByteString byteString) {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).addRequestedScopeBytes(byteString);
                return this;
            }

            public Builder clearAssertion() {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).clearAssertion();
                return this;
            }

            public Builder clearAttestationObjectChecksum() {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).clearAttestationObjectChecksum();
                return this;
            }

            public Builder clearAttestationObjectChunk() {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).clearAttestationObjectChunk();
                return this;
            }

            public Builder clearAttestationObjectSize() {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).clearAttestationObjectSize();
                return this;
            }

            public Builder clearChallenge() {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).clearChallenge();
                return this;
            }

            public Builder clearChunkCount() {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).clearChunkCount();
                return this;
            }

            public Builder clearChunkIndex() {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).clearChunkIndex();
                return this;
            }

            public Builder clearKeyId() {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).clearKeyId();
                return this;
            }

            public Builder clearRequestedScope() {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).clearRequestedScope();
                return this;
            }

            public Builder clearTxnId() {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).clearTxnId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
            public ByteString getAssertion() {
                return ((VerifyAccessProof) this.instance).getAssertion();
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
            public ByteString getAttestationObjectChecksum() {
                return ((VerifyAccessProof) this.instance).getAttestationObjectChecksum();
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
            public ByteString getAttestationObjectChunk() {
                return ((VerifyAccessProof) this.instance).getAttestationObjectChunk();
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
            public int getAttestationObjectSize() {
                return ((VerifyAccessProof) this.instance).getAttestationObjectSize();
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
            public ByteString getChallenge() {
                return ((VerifyAccessProof) this.instance).getChallenge();
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
            public int getChunkCount() {
                return ((VerifyAccessProof) this.instance).getChunkCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
            public int getChunkIndex() {
                return ((VerifyAccessProof) this.instance).getChunkIndex();
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
            public ByteString getKeyId() {
                return ((VerifyAccessProof) this.instance).getKeyId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
            public String getRequestedScope(int i) {
                return ((VerifyAccessProof) this.instance).getRequestedScope(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
            public ByteString getRequestedScopeBytes(int i) {
                return ((VerifyAccessProof) this.instance).getRequestedScopeBytes(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
            public int getRequestedScopeCount() {
                return ((VerifyAccessProof) this.instance).getRequestedScopeCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
            public List<String> getRequestedScopeList() {
                return Collections.unmodifiableList(((VerifyAccessProof) this.instance).getRequestedScopeList());
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
            public String getTxnId() {
                return ((VerifyAccessProof) this.instance).getTxnId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Accessproof.VerifyAccessProofOrBuilder
            public ByteString getTxnIdBytes() {
                return ((VerifyAccessProof) this.instance).getTxnIdBytes();
            }

            public Builder setAssertion(ByteString byteString) {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).setAssertion(byteString);
                return this;
            }

            public Builder setAttestationObjectChecksum(ByteString byteString) {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).setAttestationObjectChecksum(byteString);
                return this;
            }

            public Builder setAttestationObjectChunk(ByteString byteString) {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).setAttestationObjectChunk(byteString);
                return this;
            }

            public Builder setAttestationObjectSize(int i) {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).setAttestationObjectSize(i);
                return this;
            }

            public Builder setChallenge(ByteString byteString) {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).setChallenge(byteString);
                return this;
            }

            public Builder setChunkCount(int i) {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).setChunkCount(i);
                return this;
            }

            public Builder setChunkIndex(int i) {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).setChunkIndex(i);
                return this;
            }

            public Builder setKeyId(ByteString byteString) {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).setKeyId(byteString);
                return this;
            }

            public Builder setRequestedScope(int i, String str) {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).setRequestedScope(i, str);
                return this;
            }

            public Builder setTxnId(String str) {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).setTxnId(str);
                return this;
            }

            public Builder setTxnIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VerifyAccessProof) this.instance).setTxnIdBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(VerifyAccessProof verifyAccessProof) {
            return DEFAULT_INSTANCE.createBuilder(verifyAccessProof);
        }

        public static VerifyAccessProof parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VerifyAccessProof) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VerifyAccessProof parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VerifyAccessProof) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static VerifyAccessProof parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VerifyAccessProof) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VerifyAccessProof parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VerifyAccessProof) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VerifyAccessProof parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VerifyAccessProof) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VerifyAccessProof parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VerifyAccessProof) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VerifyAccessProof parseFrom(InputStream inputStream) throws IOException {
            return (VerifyAccessProof) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VerifyAccessProof parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VerifyAccessProof) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VerifyAccessProof parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VerifyAccessProof) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VerifyAccessProof parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VerifyAccessProof) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ProofVerdict implements Internal.EnumLite {
        PROOF_VERDICT_UNSPECIFIED(0),
        PROOF_VERDICT_AFFIRMATIVE(1),
        PROOF_VERDICT_DENIED(2),
        UNRECOGNIZED(-1);

        public static final int PROOF_VERDICT_AFFIRMATIVE_VALUE = 1;
        public static final int PROOF_VERDICT_DENIED_VALUE = 2;
        public static final int PROOF_VERDICT_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<ProofVerdict> internalValueMap = new Internal.EnumLiteMap<ProofVerdict>() { // from class: com.amazon.alexa.accessory.protocol.Accessproof.ProofVerdict.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ProofVerdict findValueByNumber(int i) {
                return ProofVerdict.forNumber(i);
            }
        };
        private final int value;

        ProofVerdict(int i) {
            this.value = i;
        }

        public static ProofVerdict forNumber(int i) {
            if (i == 0) {
                return PROOF_VERDICT_UNSPECIFIED;
            }
            if (i == 1) {
                return PROOF_VERDICT_AFFIRMATIVE;
            }
            if (i != 2) {
                return null;
            }
            return PROOF_VERDICT_DENIED;
        }

        public static Internal.EnumLiteMap<ProofVerdict> internalGetValueMap() {
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
        public static ProofVerdict valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum VerifyRejectReason implements Internal.EnumLite {
        VERIFY_REJECT_UNSPECIFIED(0),
        VERIFY_REJECT_VERIFIER_UNAVAILABLE(1),
        VERIFY_REJECT_VERIFIER_INTERNAL_ERROR(2),
        VERIFY_REJECT_PROOF_INVALID(3),
        VERIFY_REJECT_SCOPE_DENIED(4),
        VERIFY_REJECT_ACCOUNT_SIGNED_OUT(5),
        VERIFY_REJECT_NEEDS_ATTESTATION(6),
        VERIFY_REJECT_CONSENT_REQUIRED(7),
        VERIFY_REJECT_CONSENT_DENIED(8),
        VERIFY_REJECT_NOT_ALLOWLISTED(9),
        UNRECOGNIZED(-1);

        public static final int VERIFY_REJECT_ACCOUNT_SIGNED_OUT_VALUE = 5;
        public static final int VERIFY_REJECT_CONSENT_DENIED_VALUE = 8;
        public static final int VERIFY_REJECT_CONSENT_REQUIRED_VALUE = 7;
        public static final int VERIFY_REJECT_NEEDS_ATTESTATION_VALUE = 6;
        public static final int VERIFY_REJECT_NOT_ALLOWLISTED_VALUE = 9;
        public static final int VERIFY_REJECT_PROOF_INVALID_VALUE = 3;
        public static final int VERIFY_REJECT_SCOPE_DENIED_VALUE = 4;
        public static final int VERIFY_REJECT_UNSPECIFIED_VALUE = 0;
        public static final int VERIFY_REJECT_VERIFIER_INTERNAL_ERROR_VALUE = 2;
        public static final int VERIFY_REJECT_VERIFIER_UNAVAILABLE_VALUE = 1;
        private static final Internal.EnumLiteMap<VerifyRejectReason> internalValueMap = new Internal.EnumLiteMap<VerifyRejectReason>() { // from class: com.amazon.alexa.accessory.protocol.Accessproof.VerifyRejectReason.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public VerifyRejectReason findValueByNumber(int i) {
                return VerifyRejectReason.forNumber(i);
            }
        };
        private final int value;

        VerifyRejectReason(int i) {
            this.value = i;
        }

        public static VerifyRejectReason forNumber(int i) {
            switch (i) {
                case 0:
                    return VERIFY_REJECT_UNSPECIFIED;
                case 1:
                    return VERIFY_REJECT_VERIFIER_UNAVAILABLE;
                case 2:
                    return VERIFY_REJECT_VERIFIER_INTERNAL_ERROR;
                case 3:
                    return VERIFY_REJECT_PROOF_INVALID;
                case 4:
                    return VERIFY_REJECT_SCOPE_DENIED;
                case 5:
                    return VERIFY_REJECT_ACCOUNT_SIGNED_OUT;
                case 6:
                    return VERIFY_REJECT_NEEDS_ATTESTATION;
                case 7:
                    return VERIFY_REJECT_CONSENT_REQUIRED;
                case 8:
                    return VERIFY_REJECT_CONSENT_DENIED;
                case 9:
                    return VERIFY_REJECT_NOT_ALLOWLISTED;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<VerifyRejectReason> internalGetValueMap() {
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
        public static VerifyRejectReason valueOf(int i) {
            return forNumber(i);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
