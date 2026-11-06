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

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class StateOuterClass {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.StateOuterClass$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$StateOuterClass$State$ValueCase;
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
            int[] iArr2 = new int[State.ValueCase.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$StateOuterClass$State$ValueCase = iArr2;
            try {
                iArr2[State.ValueCase.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$StateOuterClass$State$ValueCase[State.ValueCase.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$StateOuterClass$State$ValueCase[State.ValueCase.VALUE_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetStateOrBuilder extends MessageLiteOrBuilder {
        int getFeature();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SetStateOrBuilder extends MessageLiteOrBuilder {
        State getState();

        boolean hasState();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StateOrBuilder extends MessageLiteOrBuilder {
        boolean getBoolean();

        int getFeature();

        int getInteger();

        State.ValueCase getValueCase();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SynchronizeStateOrBuilder extends MessageLiteOrBuilder {
        State getState();

        boolean hasState();
    }

    private StateOuterClass() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SetState extends GeneratedMessageLite<SetState, Builder> implements SetStateOrBuilder {
        private static final SetState DEFAULT_INSTANCE;
        private static volatile Parser<SetState> PARSER = null;
        public static final int STATE_FIELD_NUMBER = 1;
        private State state_;

        static {
            SetState setState = new SetState();
            DEFAULT_INSTANCE = setState;
            setState.makeImmutable();
        }

        private SetState() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearState() {
            this.state_ = null;
        }

        public static SetState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeState(State state) {
            State state2 = this.state_;
            if (state2 == null || state2 == State.getDefaultInstance()) {
                this.state_ = state;
            } else {
                this.state_ = State.newBuilder(this.state_).mergeFrom((State.Builder) state).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SetState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SetState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SetState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SetState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setState(State.Builder builder) {
            this.state_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SetState();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.state_ = (State) ((GeneratedMessageLite.Visitor) obj).visitMessage(this.state_, ((SetState) obj2).state_);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    extensionRegistryLite.getClass();
                    while (i == 0) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    State state = this.state_;
                                    State.Builder builder = state != null ? state.toBuilder() : null;
                                    State state2 = (State) codedInputStream.readMessage(State.parser(), extensionRegistryLite);
                                    this.state_ = state2;
                                    if (builder != null) {
                                        builder.mergeFrom((State.Builder) state2);
                                        this.state_ = builder.buildPartial();
                                    }
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
                        synchronized (SetState.class) {
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
            int serializedSize = this.unknownFields.getSerializedSize() + (this.state_ != null ? CodedOutputStream.computeMessageSize(1, getState()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.StateOuterClass.SetStateOrBuilder
        public State getState() {
            State state = this.state_;
            return state == null ? State.getDefaultInstance() : state;
        }

        @Override // com.amazon.alexa.accessory.protocol.StateOuterClass.SetStateOrBuilder
        public boolean hasState() {
            return this.state_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.state_ != null) {
                codedOutputStream.writeMessage(1, getState());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SetState, Builder> implements SetStateOrBuilder {
            private Builder() {
                super(SetState.DEFAULT_INSTANCE);
            }

            public Builder clearState() {
                copyOnWrite();
                ((SetState) this.instance).clearState();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.StateOuterClass.SetStateOrBuilder
            public State getState() {
                return ((SetState) this.instance).getState();
            }

            @Override // com.amazon.alexa.accessory.protocol.StateOuterClass.SetStateOrBuilder
            public boolean hasState() {
                return ((SetState) this.instance).hasState();
            }

            public Builder mergeState(State state) {
                copyOnWrite();
                ((SetState) this.instance).mergeState(state);
                return this;
            }

            public Builder setState(State state) {
                copyOnWrite();
                ((SetState) this.instance).setState(state);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setState(State.Builder builder) {
                copyOnWrite();
                ((SetState) this.instance).setState(builder);
                return this;
            }
        }

        public static Builder newBuilder(SetState setState) {
            return DEFAULT_INSTANCE.createBuilder(setState);
        }

        public static SetState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SetState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setState(State state) {
            state.getClass();
            this.state_ = state;
        }

        public static SetState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SetState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SetState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SetState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SetState parseFrom(InputStream inputStream) throws IOException {
            return (SetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SetState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SetState parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SetState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SynchronizeState extends GeneratedMessageLite<SynchronizeState, Builder> implements SynchronizeStateOrBuilder {
        private static final SynchronizeState DEFAULT_INSTANCE;
        private static volatile Parser<SynchronizeState> PARSER = null;
        public static final int STATE_FIELD_NUMBER = 1;
        private State state_;

        static {
            SynchronizeState synchronizeState = new SynchronizeState();
            DEFAULT_INSTANCE = synchronizeState;
            synchronizeState.makeImmutable();
        }

        private SynchronizeState() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearState() {
            this.state_ = null;
        }

        public static SynchronizeState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeState(State state) {
            State state2 = this.state_;
            if (state2 == null || state2 == State.getDefaultInstance()) {
                this.state_ = state;
            } else {
                this.state_ = State.newBuilder(this.state_).mergeFrom((State.Builder) state).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SynchronizeState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SynchronizeState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SynchronizeState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SynchronizeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SynchronizeState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setState(State.Builder builder) {
            this.state_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SynchronizeState();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.state_ = (State) ((GeneratedMessageLite.Visitor) obj).visitMessage(this.state_, ((SynchronizeState) obj2).state_);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    extensionRegistryLite.getClass();
                    while (i == 0) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    State state = this.state_;
                                    State.Builder builder = state != null ? state.toBuilder() : null;
                                    State state2 = (State) codedInputStream.readMessage(State.parser(), extensionRegistryLite);
                                    this.state_ = state2;
                                    if (builder != null) {
                                        builder.mergeFrom((State.Builder) state2);
                                        this.state_ = builder.buildPartial();
                                    }
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
                        synchronized (SynchronizeState.class) {
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
            int serializedSize = this.unknownFields.getSerializedSize() + (this.state_ != null ? CodedOutputStream.computeMessageSize(1, getState()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.StateOuterClass.SynchronizeStateOrBuilder
        public State getState() {
            State state = this.state_;
            return state == null ? State.getDefaultInstance() : state;
        }

        @Override // com.amazon.alexa.accessory.protocol.StateOuterClass.SynchronizeStateOrBuilder
        public boolean hasState() {
            return this.state_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.state_ != null) {
                codedOutputStream.writeMessage(1, getState());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SynchronizeState, Builder> implements SynchronizeStateOrBuilder {
            private Builder() {
                super(SynchronizeState.DEFAULT_INSTANCE);
            }

            public Builder clearState() {
                copyOnWrite();
                ((SynchronizeState) this.instance).clearState();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.StateOuterClass.SynchronizeStateOrBuilder
            public State getState() {
                return ((SynchronizeState) this.instance).getState();
            }

            @Override // com.amazon.alexa.accessory.protocol.StateOuterClass.SynchronizeStateOrBuilder
            public boolean hasState() {
                return ((SynchronizeState) this.instance).hasState();
            }

            public Builder mergeState(State state) {
                copyOnWrite();
                ((SynchronizeState) this.instance).mergeState(state);
                return this;
            }

            public Builder setState(State state) {
                copyOnWrite();
                ((SynchronizeState) this.instance).setState(state);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setState(State.Builder builder) {
                copyOnWrite();
                ((SynchronizeState) this.instance).setState(builder);
                return this;
            }
        }

        public static Builder newBuilder(SynchronizeState synchronizeState) {
            return DEFAULT_INSTANCE.createBuilder(synchronizeState);
        }

        public static SynchronizeState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SynchronizeState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SynchronizeState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SynchronizeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setState(State state) {
            state.getClass();
            this.state_ = state;
        }

        public static SynchronizeState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SynchronizeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SynchronizeState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SynchronizeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SynchronizeState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SynchronizeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SynchronizeState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SynchronizeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SynchronizeState parseFrom(InputStream inputStream) throws IOException {
            return (SynchronizeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SynchronizeState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SynchronizeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SynchronizeState parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SynchronizeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SynchronizeState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SynchronizeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetState extends GeneratedMessageLite<GetState, Builder> implements GetStateOrBuilder {
        private static final GetState DEFAULT_INSTANCE;
        public static final int FEATURE_FIELD_NUMBER = 1;
        private static volatile Parser<GetState> PARSER;
        private int feature_;

        static {
            GetState getState = new GetState();
            DEFAULT_INSTANCE = getState;
            getState.makeImmutable();
        }

        private GetState() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeature() {
            this.feature_ = 0;
        }

        public static GetState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeature(int i) {
            this.feature_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetState();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    GetState getState = (GetState) obj2;
                    int i = this.feature_;
                    boolean z = i != 0;
                    int i2 = getState.feature_;
                    this.feature_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    this.feature_ = codedInputStream.readUInt32();
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
                        synchronized (GetState.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.StateOuterClass.GetStateOrBuilder
        public int getFeature() {
            return this.feature_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.feature_;
            int serializedSize = this.unknownFields.getSerializedSize() + (i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.feature_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<GetState, Builder> implements GetStateOrBuilder {
            private Builder() {
                super(GetState.DEFAULT_INSTANCE);
            }

            public Builder clearFeature() {
                copyOnWrite();
                ((GetState) this.instance).clearFeature();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.StateOuterClass.GetStateOrBuilder
            public int getFeature() {
                return ((GetState) this.instance).getFeature();
            }

            public Builder setFeature(int i) {
                copyOnWrite();
                ((GetState) this.instance).setFeature(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(GetState getState) {
            return DEFAULT_INSTANCE.createBuilder(getState);
        }

        public static GetState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetState parseFrom(InputStream inputStream) throws IOException {
            return (GetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetState parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class State extends GeneratedMessageLite<State, Builder> implements StateOrBuilder {
        public static final int BOOLEAN_FIELD_NUMBER = 2;
        private static final State DEFAULT_INSTANCE;
        public static final int FEATURE_FIELD_NUMBER = 1;
        public static final int INTEGER_FIELD_NUMBER = 3;
        private static volatile Parser<State> PARSER;
        private int feature_;
        private int valueCase_ = 0;
        private Object value_;

        static {
            State state = new State();
            DEFAULT_INSTANCE = state;
            state.makeImmutable();
        }

        private State() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBoolean() {
            if (this.valueCase_ == 2) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeature() {
            this.feature_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInteger() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        public static State getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static State parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (State) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static State parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (State) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<State> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBoolean(boolean z) {
            this.valueCase_ = 2;
            this.value_ = Boolean.valueOf(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeature(int i) {
            this.feature_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInteger(int i) {
            this.valueCase_ = 3;
            this.value_ = Integer.valueOf(i);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new State();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    State state = (State) obj2;
                    int i2 = this.feature_;
                    boolean z = i2 != 0;
                    int i3 = state.feature_;
                    this.feature_ = visitor.visitInt(z, i2, i3 != 0, i3);
                    int i4 = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$StateOuterClass$State$ValueCase[state.getValueCase().ordinal()];
                    if (i4 == 1) {
                        this.value_ = visitor.visitOneofBoolean(this.valueCase_ == 2, this.value_, state.value_);
                    } else if (i4 == 2) {
                        this.value_ = visitor.visitOneofInt(this.valueCase_ == 3, this.value_, state.value_);
                    } else if (i4 == 3) {
                        visitor.visitOneofNotSet(this.valueCase_ != 0);
                    }
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE && (i = state.valueCase_) != 0) {
                        this.valueCase_ = i;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.feature_ = codedInputStream.readUInt32();
                                } else if (readTag == 16) {
                                    this.valueCase_ = 2;
                                    this.value_ = Boolean.valueOf(codedInputStream.readBool());
                                } else if (readTag == 24) {
                                    this.valueCase_ = 3;
                                    this.value_ = Integer.valueOf(codedInputStream.readUInt32());
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
                        synchronized (State.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.StateOuterClass.StateOrBuilder
        public boolean getBoolean() {
            if (this.valueCase_ == 2) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        @Override // com.amazon.alexa.accessory.protocol.StateOuterClass.StateOrBuilder
        public int getFeature() {
            return this.feature_;
        }

        @Override // com.amazon.alexa.accessory.protocol.StateOuterClass.StateOrBuilder
        public int getInteger() {
            if (this.valueCase_ == 3) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.feature_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            if (this.valueCase_ == 2) {
                computeUInt32Size += CodedOutputStream.computeBoolSize(2, ((Boolean) this.value_).booleanValue());
            }
            if (this.valueCase_ == 3) {
                computeUInt32Size += CodedOutputStream.computeUInt32Size(3, ((Integer) this.value_).intValue());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.StateOuterClass.StateOrBuilder
        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.feature_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            if (this.valueCase_ == 2) {
                codedOutputStream.writeBool(2, ((Boolean) this.value_).booleanValue());
            }
            if (this.valueCase_ == 3) {
                codedOutputStream.writeUInt32(3, ((Integer) this.value_).intValue());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<State, Builder> implements StateOrBuilder {
            private Builder() {
                super(State.DEFAULT_INSTANCE);
            }

            public Builder clearBoolean() {
                copyOnWrite();
                ((State) this.instance).clearBoolean();
                return this;
            }

            public Builder clearFeature() {
                copyOnWrite();
                ((State) this.instance).clearFeature();
                return this;
            }

            public Builder clearInteger() {
                copyOnWrite();
                ((State) this.instance).clearInteger();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((State) this.instance).clearValue();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.StateOuterClass.StateOrBuilder
            public boolean getBoolean() {
                return ((State) this.instance).getBoolean();
            }

            @Override // com.amazon.alexa.accessory.protocol.StateOuterClass.StateOrBuilder
            public int getFeature() {
                return ((State) this.instance).getFeature();
            }

            @Override // com.amazon.alexa.accessory.protocol.StateOuterClass.StateOrBuilder
            public int getInteger() {
                return ((State) this.instance).getInteger();
            }

            @Override // com.amazon.alexa.accessory.protocol.StateOuterClass.StateOrBuilder
            public ValueCase getValueCase() {
                return ((State) this.instance).getValueCase();
            }

            public Builder setBoolean(boolean z) {
                copyOnWrite();
                ((State) this.instance).setBoolean(z);
                return this;
            }

            public Builder setFeature(int i) {
                copyOnWrite();
                ((State) this.instance).setFeature(i);
                return this;
            }

            public Builder setInteger(int i) {
                copyOnWrite();
                ((State) this.instance).setInteger(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum ValueCase implements Internal.EnumLite {
            BOOLEAN(2),
            INTEGER(3),
            VALUE_NOT_SET(0);

            private final int value;

            ValueCase(int i) {
                this.value = i;
            }

            public static ValueCase forNumber(int i) {
                if (i == 0) {
                    return VALUE_NOT_SET;
                }
                if (i == 2) {
                    return BOOLEAN;
                }
                if (i != 3) {
                    return null;
                }
                return INTEGER;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ValueCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(State state) {
            return DEFAULT_INSTANCE.createBuilder(state);
        }

        public static State parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (State) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static State parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (State) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static State parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (State) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static State parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (State) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static State parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (State) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static State parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (State) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static State parseFrom(InputStream inputStream) throws IOException {
            return (State) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static State parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (State) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static State parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (State) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static State parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (State) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
