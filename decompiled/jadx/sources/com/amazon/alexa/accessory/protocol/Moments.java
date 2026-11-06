package com.amazon.alexa.accessory.protocol;

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
import java.util.Iterator;
import java.util.List;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class Moments {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.Moments$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$Moments$AccessoryContextDataPoint$ValueCase;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[AccessoryContextDataPoint.ValueCase.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$Moments$AccessoryContextDataPoint$ValueCase = iArr;
            try {
                iArr[AccessoryContextDataPoint.ValueCase.PERSON_SPEAKING_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Moments$AccessoryContextDataPoint$ValueCase[AccessoryContextDataPoint.ValueCase.VALUE_NOT_SET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr2;
            try {
                iArr2[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AccessoryContextDataPointOrBuilder extends MessageLiteOrBuilder {
        PersonSpeakingState getPersonSpeakingState();

        int getTimestampMillisecondsHi();

        int getTimestampMillisecondsLo();

        AccessoryContextDataPoint.ValueCase getValueCase();

        boolean hasPersonSpeakingState();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CurrentAccessoryContextDataOrBuilder extends MessageLiteOrBuilder {
        AccessoryContextDataPoint getAccessoryContextData(int i);

        int getAccessoryContextDataCount();

        List<AccessoryContextDataPoint> getAccessoryContextDataList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetCurrentAccessoryContextDataOrBuilder extends MessageLiteOrBuilder {
        AccessoryContextCategory getCategory(int i);

        int getCategoryCount();

        List<AccessoryContextCategory> getCategoryList();

        int getCategoryValue(int i);

        List<Integer> getCategoryValueList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetTimeIntervalSinceLastUserSpokeOrBuilder extends MessageLiteOrBuilder {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface PersonSpeakingStateOrBuilder extends MessageLiteOrBuilder {
        SpeakingState getSpeakingState();

        int getSpeakingStateValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StartLiveAccessoryContextDataOrBuilder extends MessageLiteOrBuilder {
        AccessoryContextCategory getCategory(int i);

        int getCategoryCount();

        List<AccessoryContextCategory> getCategoryList();

        int getCategoryValue(int i);

        List<Integer> getCategoryValueList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StartLiveAccessoryContextDataResponseOrBuilder extends MessageLiteOrBuilder {
        AccessoryContextDataPoint getAccessoryContextData(int i);

        int getAccessoryContextDataCount();

        List<AccessoryContextDataPoint> getAccessoryContextDataList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StopLiveAccessoryContextDataOrBuilder extends MessageLiteOrBuilder {
        AccessoryContextCategory getCategory(int i);

        int getCategoryCount();

        List<AccessoryContextCategory> getCategoryList();

        int getCategoryValue(int i);

        List<Integer> getCategoryValueList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface TimeIntervalSinceLastUserSpokeOrBuilder extends MessageLiteOrBuilder {
        int getTimeIntervalInMilliseconds();
    }

    private Moments() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AccessoryContextDataPoint extends GeneratedMessageLite<AccessoryContextDataPoint, Builder> implements AccessoryContextDataPointOrBuilder {
        private static final AccessoryContextDataPoint DEFAULT_INSTANCE;
        private static volatile Parser<AccessoryContextDataPoint> PARSER = null;
        public static final int PERSON_SPEAKING_STATE_FIELD_NUMBER = 3;
        public static final int TIMESTAMP_MILLISECONDS_HI_FIELD_NUMBER = 1;
        public static final int TIMESTAMP_MILLISECONDS_LO_FIELD_NUMBER = 2;
        private int timestampMillisecondsHi_;
        private int timestampMillisecondsLo_;
        private int valueCase_ = 0;
        private Object value_;

        static {
            AccessoryContextDataPoint accessoryContextDataPoint = new AccessoryContextDataPoint();
            DEFAULT_INSTANCE = accessoryContextDataPoint;
            accessoryContextDataPoint.makeImmutable();
        }

        private AccessoryContextDataPoint() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPersonSpeakingState() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestampMillisecondsHi() {
            this.timestampMillisecondsHi_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestampMillisecondsLo() {
            this.timestampMillisecondsLo_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        public static AccessoryContextDataPoint getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePersonSpeakingState(PersonSpeakingState personSpeakingState) {
            if (this.valueCase_ != 3 || this.value_ == PersonSpeakingState.getDefaultInstance()) {
                this.value_ = personSpeakingState;
            } else {
                this.value_ = PersonSpeakingState.newBuilder((PersonSpeakingState) this.value_).mergeFrom((PersonSpeakingState.Builder) personSpeakingState).buildPartial();
            }
            this.valueCase_ = 3;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AccessoryContextDataPoint parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AccessoryContextDataPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AccessoryContextDataPoint parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AccessoryContextDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AccessoryContextDataPoint> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPersonSpeakingState(PersonSpeakingState.Builder builder) {
            this.value_ = builder.build();
            this.valueCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestampMillisecondsHi(int i) {
            this.timestampMillisecondsHi_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestampMillisecondsLo(int i) {
            this.timestampMillisecondsLo_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AccessoryContextDataPoint();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    AccessoryContextDataPoint accessoryContextDataPoint = (AccessoryContextDataPoint) obj2;
                    int i2 = this.timestampMillisecondsHi_;
                    boolean z = i2 != 0;
                    int i3 = accessoryContextDataPoint.timestampMillisecondsHi_;
                    this.timestampMillisecondsHi_ = visitor.visitInt(z, i2, i3 != 0, i3);
                    int i4 = this.timestampMillisecondsLo_;
                    boolean z2 = i4 != 0;
                    int i5 = accessoryContextDataPoint.timestampMillisecondsLo_;
                    this.timestampMillisecondsLo_ = visitor.visitInt(z2, i4, i5 != 0, i5);
                    int i6 = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Moments$AccessoryContextDataPoint$ValueCase[accessoryContextDataPoint.getValueCase().ordinal()];
                    if (i6 == 1) {
                        this.value_ = visitor.visitOneofMessage(this.valueCase_ == 3, this.value_, accessoryContextDataPoint.value_);
                    } else if (i6 == 2) {
                        visitor.visitOneofNotSet(this.valueCase_ != 0);
                    }
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE && (i = accessoryContextDataPoint.valueCase_) != 0) {
                        this.valueCase_ = i;
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
                                if (readTag == 8) {
                                    this.timestampMillisecondsHi_ = codedInputStream.readUInt32();
                                } else if (readTag == 16) {
                                    this.timestampMillisecondsLo_ = codedInputStream.readUInt32();
                                } else if (readTag == 26) {
                                    PersonSpeakingState.Builder builder = this.valueCase_ == 3 ? ((PersonSpeakingState) this.value_).toBuilder() : null;
                                    MessageLite readMessage = codedInputStream.readMessage(PersonSpeakingState.parser(), extensionRegistryLite);
                                    this.value_ = readMessage;
                                    if (builder != null) {
                                        builder.mergeFrom((PersonSpeakingState.Builder) readMessage);
                                        this.value_ = builder.buildPartial();
                                    }
                                    this.valueCase_ = 3;
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
                        synchronized (AccessoryContextDataPoint.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Moments.AccessoryContextDataPointOrBuilder
        public PersonSpeakingState getPersonSpeakingState() {
            return this.valueCase_ == 3 ? (PersonSpeakingState) this.value_ : PersonSpeakingState.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.timestampMillisecondsHi_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            int i3 = this.timestampMillisecondsLo_;
            if (i3 != 0) {
                computeUInt32Size += CodedOutputStream.computeUInt32Size(2, i3);
            }
            if (this.valueCase_ == 3) {
                computeUInt32Size += CodedOutputStream.computeMessageSize(3, (PersonSpeakingState) this.value_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Moments.AccessoryContextDataPointOrBuilder
        public int getTimestampMillisecondsHi() {
            return this.timestampMillisecondsHi_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Moments.AccessoryContextDataPointOrBuilder
        public int getTimestampMillisecondsLo() {
            return this.timestampMillisecondsLo_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Moments.AccessoryContextDataPointOrBuilder
        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Moments.AccessoryContextDataPointOrBuilder
        public boolean hasPersonSpeakingState() {
            return this.valueCase_ == 3;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.timestampMillisecondsHi_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            int i2 = this.timestampMillisecondsLo_;
            if (i2 != 0) {
                codedOutputStream.writeUInt32(2, i2);
            }
            if (this.valueCase_ == 3) {
                codedOutputStream.writeMessage(3, (PersonSpeakingState) this.value_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<AccessoryContextDataPoint, Builder> implements AccessoryContextDataPointOrBuilder {
            private Builder() {
                super(AccessoryContextDataPoint.DEFAULT_INSTANCE);
            }

            public Builder clearPersonSpeakingState() {
                copyOnWrite();
                ((AccessoryContextDataPoint) this.instance).clearPersonSpeakingState();
                return this;
            }

            public Builder clearTimestampMillisecondsHi() {
                copyOnWrite();
                ((AccessoryContextDataPoint) this.instance).clearTimestampMillisecondsHi();
                return this;
            }

            public Builder clearTimestampMillisecondsLo() {
                copyOnWrite();
                ((AccessoryContextDataPoint) this.instance).clearTimestampMillisecondsLo();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((AccessoryContextDataPoint) this.instance).clearValue();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.AccessoryContextDataPointOrBuilder
            public PersonSpeakingState getPersonSpeakingState() {
                return ((AccessoryContextDataPoint) this.instance).getPersonSpeakingState();
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.AccessoryContextDataPointOrBuilder
            public int getTimestampMillisecondsHi() {
                return ((AccessoryContextDataPoint) this.instance).getTimestampMillisecondsHi();
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.AccessoryContextDataPointOrBuilder
            public int getTimestampMillisecondsLo() {
                return ((AccessoryContextDataPoint) this.instance).getTimestampMillisecondsLo();
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.AccessoryContextDataPointOrBuilder
            public ValueCase getValueCase() {
                return ((AccessoryContextDataPoint) this.instance).getValueCase();
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.AccessoryContextDataPointOrBuilder
            public boolean hasPersonSpeakingState() {
                return ((AccessoryContextDataPoint) this.instance).hasPersonSpeakingState();
            }

            public Builder mergePersonSpeakingState(PersonSpeakingState personSpeakingState) {
                copyOnWrite();
                ((AccessoryContextDataPoint) this.instance).mergePersonSpeakingState(personSpeakingState);
                return this;
            }

            public Builder setPersonSpeakingState(PersonSpeakingState personSpeakingState) {
                copyOnWrite();
                ((AccessoryContextDataPoint) this.instance).setPersonSpeakingState(personSpeakingState);
                return this;
            }

            public Builder setTimestampMillisecondsHi(int i) {
                copyOnWrite();
                ((AccessoryContextDataPoint) this.instance).setTimestampMillisecondsHi(i);
                return this;
            }

            public Builder setTimestampMillisecondsLo(int i) {
                copyOnWrite();
                ((AccessoryContextDataPoint) this.instance).setTimestampMillisecondsLo(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setPersonSpeakingState(PersonSpeakingState.Builder builder) {
                copyOnWrite();
                ((AccessoryContextDataPoint) this.instance).setPersonSpeakingState(builder);
                return this;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum ValueCase implements Internal.EnumLite {
            PERSON_SPEAKING_STATE(3),
            VALUE_NOT_SET(0);

            private final int value;

            ValueCase(int i) {
                this.value = i;
            }

            public static ValueCase forNumber(int i) {
                if (i == 0) {
                    return VALUE_NOT_SET;
                }
                if (i != 3) {
                    return null;
                }
                return PERSON_SPEAKING_STATE;
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

        public static Builder newBuilder(AccessoryContextDataPoint accessoryContextDataPoint) {
            return DEFAULT_INSTANCE.createBuilder(accessoryContextDataPoint);
        }

        public static AccessoryContextDataPoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AccessoryContextDataPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AccessoryContextDataPoint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AccessoryContextDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AccessoryContextDataPoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AccessoryContextDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPersonSpeakingState(PersonSpeakingState personSpeakingState) {
            personSpeakingState.getClass();
            this.value_ = personSpeakingState;
            this.valueCase_ = 3;
        }

        public static AccessoryContextDataPoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AccessoryContextDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AccessoryContextDataPoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AccessoryContextDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AccessoryContextDataPoint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AccessoryContextDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AccessoryContextDataPoint parseFrom(InputStream inputStream) throws IOException {
            return (AccessoryContextDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AccessoryContextDataPoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AccessoryContextDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AccessoryContextDataPoint parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AccessoryContextDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AccessoryContextDataPoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AccessoryContextDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CurrentAccessoryContextData extends GeneratedMessageLite<CurrentAccessoryContextData, Builder> implements CurrentAccessoryContextDataOrBuilder {
        public static final int ACCESSORY_CONTEXT_DATA_FIELD_NUMBER = 1;
        private static final CurrentAccessoryContextData DEFAULT_INSTANCE;
        private static volatile Parser<CurrentAccessoryContextData> PARSER;
        private Internal.ProtobufList<AccessoryContextDataPoint> accessoryContextData_ = GeneratedMessageLite.emptyProtobufList();

        static {
            CurrentAccessoryContextData currentAccessoryContextData = new CurrentAccessoryContextData();
            DEFAULT_INSTANCE = currentAccessoryContextData;
            currentAccessoryContextData.makeImmutable();
        }

        private CurrentAccessoryContextData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAccessoryContextData(AccessoryContextDataPoint.Builder builder) {
            ensureAccessoryContextDataIsMutable();
            this.accessoryContextData_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAccessoryContextData(Iterable<? extends AccessoryContextDataPoint> iterable) {
            ensureAccessoryContextDataIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.accessoryContextData_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAccessoryContextData() {
            this.accessoryContextData_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureAccessoryContextDataIsMutable() {
            if (this.accessoryContextData_.isModifiable()) {
                return;
            }
            this.accessoryContextData_ = GeneratedMessageLite.mutableCopy(this.accessoryContextData_);
        }

        public static CurrentAccessoryContextData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CurrentAccessoryContextData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CurrentAccessoryContextData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CurrentAccessoryContextData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CurrentAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CurrentAccessoryContextData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAccessoryContextData(int i) {
            ensureAccessoryContextDataIsMutable();
            this.accessoryContextData_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccessoryContextData(int i, AccessoryContextDataPoint.Builder builder) {
            ensureAccessoryContextDataIsMutable();
            this.accessoryContextData_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CurrentAccessoryContextData();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.accessoryContextData_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.accessoryContextData_ = ((GeneratedMessageLite.Visitor) obj).visitList(this.accessoryContextData_, ((CurrentAccessoryContextData) obj2).accessoryContextData_);
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
                                    if (!this.accessoryContextData_.isModifiable()) {
                                        this.accessoryContextData_ = GeneratedMessageLite.mutableCopy(this.accessoryContextData_);
                                    }
                                    this.accessoryContextData_.add((AccessoryContextDataPoint) codedInputStream.readMessage(AccessoryContextDataPoint.parser(), extensionRegistryLite));
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
                        synchronized (CurrentAccessoryContextData.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Moments.CurrentAccessoryContextDataOrBuilder
        public AccessoryContextDataPoint getAccessoryContextData(int i) {
            return this.accessoryContextData_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Moments.CurrentAccessoryContextDataOrBuilder
        public int getAccessoryContextDataCount() {
            return this.accessoryContextData_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Moments.CurrentAccessoryContextDataOrBuilder
        public List<AccessoryContextDataPoint> getAccessoryContextDataList() {
            return this.accessoryContextData_;
        }

        public AccessoryContextDataPointOrBuilder getAccessoryContextDataOrBuilder(int i) {
            return this.accessoryContextData_.get(i);
        }

        public List<? extends AccessoryContextDataPointOrBuilder> getAccessoryContextDataOrBuilderList() {
            return this.accessoryContextData_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.accessoryContextData_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.accessoryContextData_.get(i3));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.accessoryContextData_.size(); i++) {
                codedOutputStream.writeMessage(1, this.accessoryContextData_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<CurrentAccessoryContextData, Builder> implements CurrentAccessoryContextDataOrBuilder {
            private Builder() {
                super(CurrentAccessoryContextData.DEFAULT_INSTANCE);
            }

            public Builder addAccessoryContextData(AccessoryContextDataPoint accessoryContextDataPoint) {
                copyOnWrite();
                ((CurrentAccessoryContextData) this.instance).addAccessoryContextData(accessoryContextDataPoint);
                return this;
            }

            public Builder addAllAccessoryContextData(Iterable<? extends AccessoryContextDataPoint> iterable) {
                copyOnWrite();
                ((CurrentAccessoryContextData) this.instance).addAllAccessoryContextData(iterable);
                return this;
            }

            public Builder clearAccessoryContextData() {
                copyOnWrite();
                ((CurrentAccessoryContextData) this.instance).clearAccessoryContextData();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.CurrentAccessoryContextDataOrBuilder
            public AccessoryContextDataPoint getAccessoryContextData(int i) {
                return ((CurrentAccessoryContextData) this.instance).getAccessoryContextData(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.CurrentAccessoryContextDataOrBuilder
            public int getAccessoryContextDataCount() {
                return ((CurrentAccessoryContextData) this.instance).getAccessoryContextDataCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.CurrentAccessoryContextDataOrBuilder
            public List<AccessoryContextDataPoint> getAccessoryContextDataList() {
                return Collections.unmodifiableList(((CurrentAccessoryContextData) this.instance).getAccessoryContextDataList());
            }

            public Builder removeAccessoryContextData(int i) {
                copyOnWrite();
                ((CurrentAccessoryContextData) this.instance).removeAccessoryContextData(i);
                return this;
            }

            public Builder setAccessoryContextData(int i, AccessoryContextDataPoint accessoryContextDataPoint) {
                copyOnWrite();
                ((CurrentAccessoryContextData) this.instance).setAccessoryContextData(i, accessoryContextDataPoint);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addAccessoryContextData(int i, AccessoryContextDataPoint accessoryContextDataPoint) {
                copyOnWrite();
                ((CurrentAccessoryContextData) this.instance).addAccessoryContextData(i, accessoryContextDataPoint);
                return this;
            }

            public Builder setAccessoryContextData(int i, AccessoryContextDataPoint.Builder builder) {
                copyOnWrite();
                ((CurrentAccessoryContextData) this.instance).setAccessoryContextData(i, builder);
                return this;
            }

            public Builder addAccessoryContextData(AccessoryContextDataPoint.Builder builder) {
                copyOnWrite();
                ((CurrentAccessoryContextData) this.instance).addAccessoryContextData(builder);
                return this;
            }

            public Builder addAccessoryContextData(int i, AccessoryContextDataPoint.Builder builder) {
                copyOnWrite();
                ((CurrentAccessoryContextData) this.instance).addAccessoryContextData(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(CurrentAccessoryContextData currentAccessoryContextData) {
            return DEFAULT_INSTANCE.createBuilder(currentAccessoryContextData);
        }

        public static CurrentAccessoryContextData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CurrentAccessoryContextData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CurrentAccessoryContextData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CurrentAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CurrentAccessoryContextData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CurrentAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CurrentAccessoryContextData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CurrentAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CurrentAccessoryContextData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CurrentAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CurrentAccessoryContextData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CurrentAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CurrentAccessoryContextData parseFrom(InputStream inputStream) throws IOException {
            return (CurrentAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAccessoryContextData(int i, AccessoryContextDataPoint accessoryContextDataPoint) {
            accessoryContextDataPoint.getClass();
            ensureAccessoryContextDataIsMutable();
            this.accessoryContextData_.add(i, accessoryContextDataPoint);
        }

        public static CurrentAccessoryContextData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CurrentAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccessoryContextData(int i, AccessoryContextDataPoint accessoryContextDataPoint) {
            accessoryContextDataPoint.getClass();
            ensureAccessoryContextDataIsMutable();
            this.accessoryContextData_.set(i, accessoryContextDataPoint);
        }

        public static CurrentAccessoryContextData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CurrentAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CurrentAccessoryContextData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CurrentAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAccessoryContextData(AccessoryContextDataPoint accessoryContextDataPoint) {
            accessoryContextDataPoint.getClass();
            ensureAccessoryContextDataIsMutable();
            this.accessoryContextData_.add(accessoryContextDataPoint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAccessoryContextData(int i, AccessoryContextDataPoint.Builder builder) {
            ensureAccessoryContextDataIsMutable();
            this.accessoryContextData_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StartLiveAccessoryContextDataResponse extends GeneratedMessageLite<StartLiveAccessoryContextDataResponse, Builder> implements StartLiveAccessoryContextDataResponseOrBuilder {
        public static final int ACCESSORY_CONTEXT_DATA_FIELD_NUMBER = 1;
        private static final StartLiveAccessoryContextDataResponse DEFAULT_INSTANCE;
        private static volatile Parser<StartLiveAccessoryContextDataResponse> PARSER;
        private Internal.ProtobufList<AccessoryContextDataPoint> accessoryContextData_ = GeneratedMessageLite.emptyProtobufList();

        static {
            StartLiveAccessoryContextDataResponse startLiveAccessoryContextDataResponse = new StartLiveAccessoryContextDataResponse();
            DEFAULT_INSTANCE = startLiveAccessoryContextDataResponse;
            startLiveAccessoryContextDataResponse.makeImmutable();
        }

        private StartLiveAccessoryContextDataResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAccessoryContextData(AccessoryContextDataPoint.Builder builder) {
            ensureAccessoryContextDataIsMutable();
            this.accessoryContextData_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAccessoryContextData(Iterable<? extends AccessoryContextDataPoint> iterable) {
            ensureAccessoryContextDataIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.accessoryContextData_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAccessoryContextData() {
            this.accessoryContextData_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureAccessoryContextDataIsMutable() {
            if (this.accessoryContextData_.isModifiable()) {
                return;
            }
            this.accessoryContextData_ = GeneratedMessageLite.mutableCopy(this.accessoryContextData_);
        }

        public static StartLiveAccessoryContextDataResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StartLiveAccessoryContextDataResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StartLiveAccessoryContextDataResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartLiveAccessoryContextDataResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StartLiveAccessoryContextDataResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StartLiveAccessoryContextDataResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAccessoryContextData(int i) {
            ensureAccessoryContextDataIsMutable();
            this.accessoryContextData_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccessoryContextData(int i, AccessoryContextDataPoint.Builder builder) {
            ensureAccessoryContextDataIsMutable();
            this.accessoryContextData_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StartLiveAccessoryContextDataResponse();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.accessoryContextData_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.accessoryContextData_ = ((GeneratedMessageLite.Visitor) obj).visitList(this.accessoryContextData_, ((StartLiveAccessoryContextDataResponse) obj2).accessoryContextData_);
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
                                    if (!this.accessoryContextData_.isModifiable()) {
                                        this.accessoryContextData_ = GeneratedMessageLite.mutableCopy(this.accessoryContextData_);
                                    }
                                    this.accessoryContextData_.add((AccessoryContextDataPoint) codedInputStream.readMessage(AccessoryContextDataPoint.parser(), extensionRegistryLite));
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
                        synchronized (StartLiveAccessoryContextDataResponse.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Moments.StartLiveAccessoryContextDataResponseOrBuilder
        public AccessoryContextDataPoint getAccessoryContextData(int i) {
            return this.accessoryContextData_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Moments.StartLiveAccessoryContextDataResponseOrBuilder
        public int getAccessoryContextDataCount() {
            return this.accessoryContextData_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Moments.StartLiveAccessoryContextDataResponseOrBuilder
        public List<AccessoryContextDataPoint> getAccessoryContextDataList() {
            return this.accessoryContextData_;
        }

        public AccessoryContextDataPointOrBuilder getAccessoryContextDataOrBuilder(int i) {
            return this.accessoryContextData_.get(i);
        }

        public List<? extends AccessoryContextDataPointOrBuilder> getAccessoryContextDataOrBuilderList() {
            return this.accessoryContextData_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.accessoryContextData_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.accessoryContextData_.get(i3));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.accessoryContextData_.size(); i++) {
                codedOutputStream.writeMessage(1, this.accessoryContextData_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<StartLiveAccessoryContextDataResponse, Builder> implements StartLiveAccessoryContextDataResponseOrBuilder {
            private Builder() {
                super(StartLiveAccessoryContextDataResponse.DEFAULT_INSTANCE);
            }

            public Builder addAccessoryContextData(AccessoryContextDataPoint accessoryContextDataPoint) {
                copyOnWrite();
                ((StartLiveAccessoryContextDataResponse) this.instance).addAccessoryContextData(accessoryContextDataPoint);
                return this;
            }

            public Builder addAllAccessoryContextData(Iterable<? extends AccessoryContextDataPoint> iterable) {
                copyOnWrite();
                ((StartLiveAccessoryContextDataResponse) this.instance).addAllAccessoryContextData(iterable);
                return this;
            }

            public Builder clearAccessoryContextData() {
                copyOnWrite();
                ((StartLiveAccessoryContextDataResponse) this.instance).clearAccessoryContextData();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.StartLiveAccessoryContextDataResponseOrBuilder
            public AccessoryContextDataPoint getAccessoryContextData(int i) {
                return ((StartLiveAccessoryContextDataResponse) this.instance).getAccessoryContextData(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.StartLiveAccessoryContextDataResponseOrBuilder
            public int getAccessoryContextDataCount() {
                return ((StartLiveAccessoryContextDataResponse) this.instance).getAccessoryContextDataCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.StartLiveAccessoryContextDataResponseOrBuilder
            public List<AccessoryContextDataPoint> getAccessoryContextDataList() {
                return Collections.unmodifiableList(((StartLiveAccessoryContextDataResponse) this.instance).getAccessoryContextDataList());
            }

            public Builder removeAccessoryContextData(int i) {
                copyOnWrite();
                ((StartLiveAccessoryContextDataResponse) this.instance).removeAccessoryContextData(i);
                return this;
            }

            public Builder setAccessoryContextData(int i, AccessoryContextDataPoint accessoryContextDataPoint) {
                copyOnWrite();
                ((StartLiveAccessoryContextDataResponse) this.instance).setAccessoryContextData(i, accessoryContextDataPoint);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addAccessoryContextData(int i, AccessoryContextDataPoint accessoryContextDataPoint) {
                copyOnWrite();
                ((StartLiveAccessoryContextDataResponse) this.instance).addAccessoryContextData(i, accessoryContextDataPoint);
                return this;
            }

            public Builder setAccessoryContextData(int i, AccessoryContextDataPoint.Builder builder) {
                copyOnWrite();
                ((StartLiveAccessoryContextDataResponse) this.instance).setAccessoryContextData(i, builder);
                return this;
            }

            public Builder addAccessoryContextData(AccessoryContextDataPoint.Builder builder) {
                copyOnWrite();
                ((StartLiveAccessoryContextDataResponse) this.instance).addAccessoryContextData(builder);
                return this;
            }

            public Builder addAccessoryContextData(int i, AccessoryContextDataPoint.Builder builder) {
                copyOnWrite();
                ((StartLiveAccessoryContextDataResponse) this.instance).addAccessoryContextData(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(StartLiveAccessoryContextDataResponse startLiveAccessoryContextDataResponse) {
            return DEFAULT_INSTANCE.createBuilder(startLiveAccessoryContextDataResponse);
        }

        public static StartLiveAccessoryContextDataResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartLiveAccessoryContextDataResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartLiveAccessoryContextDataResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartLiveAccessoryContextDataResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StartLiveAccessoryContextDataResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StartLiveAccessoryContextDataResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StartLiveAccessoryContextDataResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartLiveAccessoryContextDataResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StartLiveAccessoryContextDataResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StartLiveAccessoryContextDataResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StartLiveAccessoryContextDataResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartLiveAccessoryContextDataResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StartLiveAccessoryContextDataResponse parseFrom(InputStream inputStream) throws IOException {
            return (StartLiveAccessoryContextDataResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAccessoryContextData(int i, AccessoryContextDataPoint accessoryContextDataPoint) {
            accessoryContextDataPoint.getClass();
            ensureAccessoryContextDataIsMutable();
            this.accessoryContextData_.add(i, accessoryContextDataPoint);
        }

        public static StartLiveAccessoryContextDataResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartLiveAccessoryContextDataResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccessoryContextData(int i, AccessoryContextDataPoint accessoryContextDataPoint) {
            accessoryContextDataPoint.getClass();
            ensureAccessoryContextDataIsMutable();
            this.accessoryContextData_.set(i, accessoryContextDataPoint);
        }

        public static StartLiveAccessoryContextDataResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StartLiveAccessoryContextDataResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StartLiveAccessoryContextDataResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartLiveAccessoryContextDataResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAccessoryContextData(AccessoryContextDataPoint accessoryContextDataPoint) {
            accessoryContextDataPoint.getClass();
            ensureAccessoryContextDataIsMutable();
            this.accessoryContextData_.add(accessoryContextDataPoint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAccessoryContextData(int i, AccessoryContextDataPoint.Builder builder) {
            ensureAccessoryContextDataIsMutable();
            this.accessoryContextData_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetCurrentAccessoryContextData extends GeneratedMessageLite<GetCurrentAccessoryContextData, Builder> implements GetCurrentAccessoryContextDataOrBuilder {
        public static final int CATEGORY_FIELD_NUMBER = 1;
        private static final GetCurrentAccessoryContextData DEFAULT_INSTANCE;
        private static volatile Parser<GetCurrentAccessoryContextData> PARSER;
        private static final Internal.ListAdapter.Converter<Integer, AccessoryContextCategory> category_converter_ = new Internal.ListAdapter.Converter<Integer, AccessoryContextCategory>() { // from class: com.amazon.alexa.accessory.protocol.Moments.GetCurrentAccessoryContextData.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public AccessoryContextCategory convert(Integer num) {
                AccessoryContextCategory forNumber = AccessoryContextCategory.forNumber(num.intValue());
                return forNumber == null ? AccessoryContextCategory.UNRECOGNIZED : forNumber;
            }
        };
        private int categoryMemoizedSerializedSize;
        private Internal.IntList category_ = GeneratedMessageLite.emptyIntList();

        static {
            GetCurrentAccessoryContextData getCurrentAccessoryContextData = new GetCurrentAccessoryContextData();
            DEFAULT_INSTANCE = getCurrentAccessoryContextData;
            getCurrentAccessoryContextData.makeImmutable();
        }

        private GetCurrentAccessoryContextData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCategory(Iterable<? extends AccessoryContextCategory> iterable) {
            ensureCategoryIsMutable();
            Iterator<? extends AccessoryContextCategory> it2 = iterable.iterator();
            while (it2.hasNext()) {
                this.category_.addInt(it2.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCategoryValue(Iterable<Integer> iterable) {
            ensureCategoryIsMutable();
            Iterator<Integer> it2 = iterable.iterator();
            while (it2.hasNext()) {
                this.category_.addInt(it2.next().intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCategory(AccessoryContextCategory accessoryContextCategory) {
            accessoryContextCategory.getClass();
            ensureCategoryIsMutable();
            this.category_.addInt(accessoryContextCategory.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCategoryValue(int i) {
            ensureCategoryIsMutable();
            this.category_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCategory() {
            this.category_ = GeneratedMessageLite.emptyIntList();
        }

        private void ensureCategoryIsMutable() {
            if (this.category_.isModifiable()) {
                return;
            }
            this.category_ = GeneratedMessageLite.mutableCopy(this.category_);
        }

        public static GetCurrentAccessoryContextData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetCurrentAccessoryContextData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetCurrentAccessoryContextData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetCurrentAccessoryContextData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetCurrentAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetCurrentAccessoryContextData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCategory(int i, AccessoryContextCategory accessoryContextCategory) {
            accessoryContextCategory.getClass();
            ensureCategoryIsMutable();
            this.category_.setInt(i, accessoryContextCategory.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCategoryValue(int i, int i2) {
            ensureCategoryIsMutable();
            this.category_.setInt(i, i2);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetCurrentAccessoryContextData();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.category_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.category_ = ((GeneratedMessageLite.Visitor) obj).visitIntList(this.category_, ((GetCurrentAccessoryContextData) obj2).category_);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (i == 0) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    if (!this.category_.isModifiable()) {
                                        this.category_ = GeneratedMessageLite.mutableCopy(this.category_);
                                    }
                                    this.category_.addInt(codedInputStream.readEnum());
                                } else if (readTag == 10) {
                                    if (!this.category_.isModifiable()) {
                                        this.category_ = GeneratedMessageLite.mutableCopy(this.category_);
                                    }
                                    int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.category_.addInt(codedInputStream.readEnum());
                                    }
                                    codedInputStream.popLimit(pushLimit);
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
                        synchronized (GetCurrentAccessoryContextData.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Moments.GetCurrentAccessoryContextDataOrBuilder
        public AccessoryContextCategory getCategory(int i) {
            return category_converter_.convert(Integer.valueOf(this.category_.getInt(i)));
        }

        @Override // com.amazon.alexa.accessory.protocol.Moments.GetCurrentAccessoryContextDataOrBuilder
        public int getCategoryCount() {
            return this.category_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Moments.GetCurrentAccessoryContextDataOrBuilder
        public List<AccessoryContextCategory> getCategoryList() {
            return new Internal.ListAdapter(this.category_, category_converter_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Moments.GetCurrentAccessoryContextDataOrBuilder
        public int getCategoryValue(int i) {
            return this.category_.getInt(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Moments.GetCurrentAccessoryContextDataOrBuilder
        public List<Integer> getCategoryValueList() {
            return this.category_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.category_.size(); i3++) {
                i2 += CodedOutputStream.computeEnumSizeNoTag(this.category_.getInt(i3));
            }
            int computeUInt32SizeNoTag = getCategoryList().isEmpty() ? i2 : CodedOutputStream.computeUInt32SizeNoTag(i2) + i2 + 1;
            this.categoryMemoizedSerializedSize = i2;
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32SizeNoTag;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if (getCategoryList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(10);
                codedOutputStream.writeUInt32NoTag(this.categoryMemoizedSerializedSize);
            }
            for (int i = 0; i < this.category_.size(); i++) {
                codedOutputStream.writeEnumNoTag(this.category_.getInt(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<GetCurrentAccessoryContextData, Builder> implements GetCurrentAccessoryContextDataOrBuilder {
            private Builder() {
                super(GetCurrentAccessoryContextData.DEFAULT_INSTANCE);
            }

            public Builder addAllCategory(Iterable<? extends AccessoryContextCategory> iterable) {
                copyOnWrite();
                ((GetCurrentAccessoryContextData) this.instance).addAllCategory(iterable);
                return this;
            }

            public Builder addAllCategoryValue(Iterable<Integer> iterable) {
                copyOnWrite();
                ((GetCurrentAccessoryContextData) this.instance).addAllCategoryValue(iterable);
                return this;
            }

            public Builder addCategory(AccessoryContextCategory accessoryContextCategory) {
                copyOnWrite();
                ((GetCurrentAccessoryContextData) this.instance).addCategory(accessoryContextCategory);
                return this;
            }

            public Builder addCategoryValue(int i) {
                ((GetCurrentAccessoryContextData) this.instance).addCategoryValue(i);
                return this;
            }

            public Builder clearCategory() {
                copyOnWrite();
                ((GetCurrentAccessoryContextData) this.instance).clearCategory();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.GetCurrentAccessoryContextDataOrBuilder
            public AccessoryContextCategory getCategory(int i) {
                return ((GetCurrentAccessoryContextData) this.instance).getCategory(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.GetCurrentAccessoryContextDataOrBuilder
            public int getCategoryCount() {
                return ((GetCurrentAccessoryContextData) this.instance).getCategoryCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.GetCurrentAccessoryContextDataOrBuilder
            public List<AccessoryContextCategory> getCategoryList() {
                return ((GetCurrentAccessoryContextData) this.instance).getCategoryList();
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.GetCurrentAccessoryContextDataOrBuilder
            public int getCategoryValue(int i) {
                return ((GetCurrentAccessoryContextData) this.instance).getCategoryValue(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.GetCurrentAccessoryContextDataOrBuilder
            public List<Integer> getCategoryValueList() {
                return Collections.unmodifiableList(((GetCurrentAccessoryContextData) this.instance).getCategoryValueList());
            }

            public Builder setCategory(int i, AccessoryContextCategory accessoryContextCategory) {
                copyOnWrite();
                ((GetCurrentAccessoryContextData) this.instance).setCategory(i, accessoryContextCategory);
                return this;
            }

            public Builder setCategoryValue(int i, int i2) {
                copyOnWrite();
                ((GetCurrentAccessoryContextData) this.instance).setCategoryValue(i, i2);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(GetCurrentAccessoryContextData getCurrentAccessoryContextData) {
            return DEFAULT_INSTANCE.createBuilder(getCurrentAccessoryContextData);
        }

        public static GetCurrentAccessoryContextData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCurrentAccessoryContextData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetCurrentAccessoryContextData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCurrentAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetCurrentAccessoryContextData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetCurrentAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetCurrentAccessoryContextData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCurrentAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetCurrentAccessoryContextData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetCurrentAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetCurrentAccessoryContextData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCurrentAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetCurrentAccessoryContextData parseFrom(InputStream inputStream) throws IOException {
            return (GetCurrentAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetCurrentAccessoryContextData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCurrentAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetCurrentAccessoryContextData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetCurrentAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetCurrentAccessoryContextData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCurrentAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetTimeIntervalSinceLastUserSpoke extends GeneratedMessageLite<GetTimeIntervalSinceLastUserSpoke, Builder> implements GetTimeIntervalSinceLastUserSpokeOrBuilder {
        private static final GetTimeIntervalSinceLastUserSpoke DEFAULT_INSTANCE;
        private static volatile Parser<GetTimeIntervalSinceLastUserSpoke> PARSER;

        static {
            GetTimeIntervalSinceLastUserSpoke getTimeIntervalSinceLastUserSpoke = new GetTimeIntervalSinceLastUserSpoke();
            DEFAULT_INSTANCE = getTimeIntervalSinceLastUserSpoke;
            getTimeIntervalSinceLastUserSpoke.makeImmutable();
        }

        private GetTimeIntervalSinceLastUserSpoke() {
        }

        public static GetTimeIntervalSinceLastUserSpoke getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetTimeIntervalSinceLastUserSpoke parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetTimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetTimeIntervalSinceLastUserSpoke parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetTimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetTimeIntervalSinceLastUserSpoke> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetTimeIntervalSinceLastUserSpoke();
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
                        synchronized (GetTimeIntervalSinceLastUserSpoke.class) {
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
        public static final class Builder extends GeneratedMessageLite.Builder<GetTimeIntervalSinceLastUserSpoke, Builder> implements GetTimeIntervalSinceLastUserSpokeOrBuilder {
            private Builder() {
                super(GetTimeIntervalSinceLastUserSpoke.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(GetTimeIntervalSinceLastUserSpoke getTimeIntervalSinceLastUserSpoke) {
            return DEFAULT_INSTANCE.createBuilder(getTimeIntervalSinceLastUserSpoke);
        }

        public static GetTimeIntervalSinceLastUserSpoke parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetTimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetTimeIntervalSinceLastUserSpoke parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetTimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetTimeIntervalSinceLastUserSpoke parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetTimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetTimeIntervalSinceLastUserSpoke parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetTimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetTimeIntervalSinceLastUserSpoke parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetTimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetTimeIntervalSinceLastUserSpoke parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetTimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetTimeIntervalSinceLastUserSpoke parseFrom(InputStream inputStream) throws IOException {
            return (GetTimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetTimeIntervalSinceLastUserSpoke parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetTimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetTimeIntervalSinceLastUserSpoke parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetTimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetTimeIntervalSinceLastUserSpoke parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetTimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class PersonSpeakingState extends GeneratedMessageLite<PersonSpeakingState, Builder> implements PersonSpeakingStateOrBuilder {
        private static final PersonSpeakingState DEFAULT_INSTANCE;
        private static volatile Parser<PersonSpeakingState> PARSER = null;
        public static final int SPEAKING_STATE_FIELD_NUMBER = 1;
        private int speakingState_;

        static {
            PersonSpeakingState personSpeakingState = new PersonSpeakingState();
            DEFAULT_INSTANCE = personSpeakingState;
            personSpeakingState.makeImmutable();
        }

        private PersonSpeakingState() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpeakingState() {
            this.speakingState_ = 0;
        }

        public static PersonSpeakingState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PersonSpeakingState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PersonSpeakingState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PersonSpeakingState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PersonSpeakingState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PersonSpeakingState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpeakingState(SpeakingState speakingState) {
            speakingState.getClass();
            this.speakingState_ = speakingState.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpeakingStateValue(int i) {
            this.speakingState_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new PersonSpeakingState();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    PersonSpeakingState personSpeakingState = (PersonSpeakingState) obj2;
                    int i = this.speakingState_;
                    boolean z = i != 0;
                    int i2 = personSpeakingState.speakingState_;
                    this.speakingState_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    this.speakingState_ = codedInputStream.readEnum();
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
                        synchronized (PersonSpeakingState.class) {
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
            int serializedSize = this.unknownFields.getSerializedSize() + (this.speakingState_ != SpeakingState.SPEAKING_STATE_UNKNOWN.getNumber() ? CodedOutputStream.computeEnumSize(1, this.speakingState_) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Moments.PersonSpeakingStateOrBuilder
        public SpeakingState getSpeakingState() {
            SpeakingState forNumber = SpeakingState.forNumber(this.speakingState_);
            return forNumber == null ? SpeakingState.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Moments.PersonSpeakingStateOrBuilder
        public int getSpeakingStateValue() {
            return this.speakingState_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.speakingState_ != SpeakingState.SPEAKING_STATE_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.speakingState_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<PersonSpeakingState, Builder> implements PersonSpeakingStateOrBuilder {
            private Builder() {
                super(PersonSpeakingState.DEFAULT_INSTANCE);
            }

            public Builder clearSpeakingState() {
                copyOnWrite();
                ((PersonSpeakingState) this.instance).clearSpeakingState();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.PersonSpeakingStateOrBuilder
            public SpeakingState getSpeakingState() {
                return ((PersonSpeakingState) this.instance).getSpeakingState();
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.PersonSpeakingStateOrBuilder
            public int getSpeakingStateValue() {
                return ((PersonSpeakingState) this.instance).getSpeakingStateValue();
            }

            public Builder setSpeakingState(SpeakingState speakingState) {
                copyOnWrite();
                ((PersonSpeakingState) this.instance).setSpeakingState(speakingState);
                return this;
            }

            public Builder setSpeakingStateValue(int i) {
                copyOnWrite();
                ((PersonSpeakingState) this.instance).setSpeakingStateValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(PersonSpeakingState personSpeakingState) {
            return DEFAULT_INSTANCE.createBuilder(personSpeakingState);
        }

        public static PersonSpeakingState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PersonSpeakingState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PersonSpeakingState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PersonSpeakingState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PersonSpeakingState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PersonSpeakingState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PersonSpeakingState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PersonSpeakingState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PersonSpeakingState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PersonSpeakingState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PersonSpeakingState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PersonSpeakingState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PersonSpeakingState parseFrom(InputStream inputStream) throws IOException {
            return (PersonSpeakingState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PersonSpeakingState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PersonSpeakingState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PersonSpeakingState parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PersonSpeakingState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PersonSpeakingState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PersonSpeakingState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StartLiveAccessoryContextData extends GeneratedMessageLite<StartLiveAccessoryContextData, Builder> implements StartLiveAccessoryContextDataOrBuilder {
        public static final int CATEGORY_FIELD_NUMBER = 1;
        private static final StartLiveAccessoryContextData DEFAULT_INSTANCE;
        private static volatile Parser<StartLiveAccessoryContextData> PARSER;
        private static final Internal.ListAdapter.Converter<Integer, AccessoryContextCategory> category_converter_ = new Internal.ListAdapter.Converter<Integer, AccessoryContextCategory>() { // from class: com.amazon.alexa.accessory.protocol.Moments.StartLiveAccessoryContextData.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public AccessoryContextCategory convert(Integer num) {
                AccessoryContextCategory forNumber = AccessoryContextCategory.forNumber(num.intValue());
                return forNumber == null ? AccessoryContextCategory.UNRECOGNIZED : forNumber;
            }
        };
        private int categoryMemoizedSerializedSize;
        private Internal.IntList category_ = GeneratedMessageLite.emptyIntList();

        static {
            StartLiveAccessoryContextData startLiveAccessoryContextData = new StartLiveAccessoryContextData();
            DEFAULT_INSTANCE = startLiveAccessoryContextData;
            startLiveAccessoryContextData.makeImmutable();
        }

        private StartLiveAccessoryContextData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCategory(Iterable<? extends AccessoryContextCategory> iterable) {
            ensureCategoryIsMutable();
            Iterator<? extends AccessoryContextCategory> it2 = iterable.iterator();
            while (it2.hasNext()) {
                this.category_.addInt(it2.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCategoryValue(Iterable<Integer> iterable) {
            ensureCategoryIsMutable();
            Iterator<Integer> it2 = iterable.iterator();
            while (it2.hasNext()) {
                this.category_.addInt(it2.next().intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCategory(AccessoryContextCategory accessoryContextCategory) {
            accessoryContextCategory.getClass();
            ensureCategoryIsMutable();
            this.category_.addInt(accessoryContextCategory.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCategoryValue(int i) {
            ensureCategoryIsMutable();
            this.category_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCategory() {
            this.category_ = GeneratedMessageLite.emptyIntList();
        }

        private void ensureCategoryIsMutable() {
            if (this.category_.isModifiable()) {
                return;
            }
            this.category_ = GeneratedMessageLite.mutableCopy(this.category_);
        }

        public static StartLiveAccessoryContextData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StartLiveAccessoryContextData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StartLiveAccessoryContextData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartLiveAccessoryContextData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StartLiveAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StartLiveAccessoryContextData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCategory(int i, AccessoryContextCategory accessoryContextCategory) {
            accessoryContextCategory.getClass();
            ensureCategoryIsMutable();
            this.category_.setInt(i, accessoryContextCategory.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCategoryValue(int i, int i2) {
            ensureCategoryIsMutable();
            this.category_.setInt(i, i2);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StartLiveAccessoryContextData();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.category_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.category_ = ((GeneratedMessageLite.Visitor) obj).visitIntList(this.category_, ((StartLiveAccessoryContextData) obj2).category_);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (i == 0) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    if (!this.category_.isModifiable()) {
                                        this.category_ = GeneratedMessageLite.mutableCopy(this.category_);
                                    }
                                    this.category_.addInt(codedInputStream.readEnum());
                                } else if (readTag == 10) {
                                    if (!this.category_.isModifiable()) {
                                        this.category_ = GeneratedMessageLite.mutableCopy(this.category_);
                                    }
                                    int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.category_.addInt(codedInputStream.readEnum());
                                    }
                                    codedInputStream.popLimit(pushLimit);
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
                        synchronized (StartLiveAccessoryContextData.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Moments.StartLiveAccessoryContextDataOrBuilder
        public AccessoryContextCategory getCategory(int i) {
            return category_converter_.convert(Integer.valueOf(this.category_.getInt(i)));
        }

        @Override // com.amazon.alexa.accessory.protocol.Moments.StartLiveAccessoryContextDataOrBuilder
        public int getCategoryCount() {
            return this.category_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Moments.StartLiveAccessoryContextDataOrBuilder
        public List<AccessoryContextCategory> getCategoryList() {
            return new Internal.ListAdapter(this.category_, category_converter_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Moments.StartLiveAccessoryContextDataOrBuilder
        public int getCategoryValue(int i) {
            return this.category_.getInt(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Moments.StartLiveAccessoryContextDataOrBuilder
        public List<Integer> getCategoryValueList() {
            return this.category_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.category_.size(); i3++) {
                i2 += CodedOutputStream.computeEnumSizeNoTag(this.category_.getInt(i3));
            }
            int computeUInt32SizeNoTag = getCategoryList().isEmpty() ? i2 : CodedOutputStream.computeUInt32SizeNoTag(i2) + i2 + 1;
            this.categoryMemoizedSerializedSize = i2;
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32SizeNoTag;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if (getCategoryList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(10);
                codedOutputStream.writeUInt32NoTag(this.categoryMemoizedSerializedSize);
            }
            for (int i = 0; i < this.category_.size(); i++) {
                codedOutputStream.writeEnumNoTag(this.category_.getInt(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<StartLiveAccessoryContextData, Builder> implements StartLiveAccessoryContextDataOrBuilder {
            private Builder() {
                super(StartLiveAccessoryContextData.DEFAULT_INSTANCE);
            }

            public Builder addAllCategory(Iterable<? extends AccessoryContextCategory> iterable) {
                copyOnWrite();
                ((StartLiveAccessoryContextData) this.instance).addAllCategory(iterable);
                return this;
            }

            public Builder addAllCategoryValue(Iterable<Integer> iterable) {
                copyOnWrite();
                ((StartLiveAccessoryContextData) this.instance).addAllCategoryValue(iterable);
                return this;
            }

            public Builder addCategory(AccessoryContextCategory accessoryContextCategory) {
                copyOnWrite();
                ((StartLiveAccessoryContextData) this.instance).addCategory(accessoryContextCategory);
                return this;
            }

            public Builder addCategoryValue(int i) {
                ((StartLiveAccessoryContextData) this.instance).addCategoryValue(i);
                return this;
            }

            public Builder clearCategory() {
                copyOnWrite();
                ((StartLiveAccessoryContextData) this.instance).clearCategory();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.StartLiveAccessoryContextDataOrBuilder
            public AccessoryContextCategory getCategory(int i) {
                return ((StartLiveAccessoryContextData) this.instance).getCategory(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.StartLiveAccessoryContextDataOrBuilder
            public int getCategoryCount() {
                return ((StartLiveAccessoryContextData) this.instance).getCategoryCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.StartLiveAccessoryContextDataOrBuilder
            public List<AccessoryContextCategory> getCategoryList() {
                return ((StartLiveAccessoryContextData) this.instance).getCategoryList();
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.StartLiveAccessoryContextDataOrBuilder
            public int getCategoryValue(int i) {
                return ((StartLiveAccessoryContextData) this.instance).getCategoryValue(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.StartLiveAccessoryContextDataOrBuilder
            public List<Integer> getCategoryValueList() {
                return Collections.unmodifiableList(((StartLiveAccessoryContextData) this.instance).getCategoryValueList());
            }

            public Builder setCategory(int i, AccessoryContextCategory accessoryContextCategory) {
                copyOnWrite();
                ((StartLiveAccessoryContextData) this.instance).setCategory(i, accessoryContextCategory);
                return this;
            }

            public Builder setCategoryValue(int i, int i2) {
                copyOnWrite();
                ((StartLiveAccessoryContextData) this.instance).setCategoryValue(i, i2);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(StartLiveAccessoryContextData startLiveAccessoryContextData) {
            return DEFAULT_INSTANCE.createBuilder(startLiveAccessoryContextData);
        }

        public static StartLiveAccessoryContextData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartLiveAccessoryContextData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartLiveAccessoryContextData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartLiveAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StartLiveAccessoryContextData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StartLiveAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StartLiveAccessoryContextData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartLiveAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StartLiveAccessoryContextData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StartLiveAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StartLiveAccessoryContextData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartLiveAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StartLiveAccessoryContextData parseFrom(InputStream inputStream) throws IOException {
            return (StartLiveAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartLiveAccessoryContextData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartLiveAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartLiveAccessoryContextData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StartLiveAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StartLiveAccessoryContextData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartLiveAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StopLiveAccessoryContextData extends GeneratedMessageLite<StopLiveAccessoryContextData, Builder> implements StopLiveAccessoryContextDataOrBuilder {
        public static final int CATEGORY_FIELD_NUMBER = 1;
        private static final StopLiveAccessoryContextData DEFAULT_INSTANCE;
        private static volatile Parser<StopLiveAccessoryContextData> PARSER;
        private static final Internal.ListAdapter.Converter<Integer, AccessoryContextCategory> category_converter_ = new Internal.ListAdapter.Converter<Integer, AccessoryContextCategory>() { // from class: com.amazon.alexa.accessory.protocol.Moments.StopLiveAccessoryContextData.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public AccessoryContextCategory convert(Integer num) {
                AccessoryContextCategory forNumber = AccessoryContextCategory.forNumber(num.intValue());
                return forNumber == null ? AccessoryContextCategory.UNRECOGNIZED : forNumber;
            }
        };
        private int categoryMemoizedSerializedSize;
        private Internal.IntList category_ = GeneratedMessageLite.emptyIntList();

        static {
            StopLiveAccessoryContextData stopLiveAccessoryContextData = new StopLiveAccessoryContextData();
            DEFAULT_INSTANCE = stopLiveAccessoryContextData;
            stopLiveAccessoryContextData.makeImmutable();
        }

        private StopLiveAccessoryContextData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCategory(Iterable<? extends AccessoryContextCategory> iterable) {
            ensureCategoryIsMutable();
            Iterator<? extends AccessoryContextCategory> it2 = iterable.iterator();
            while (it2.hasNext()) {
                this.category_.addInt(it2.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCategoryValue(Iterable<Integer> iterable) {
            ensureCategoryIsMutable();
            Iterator<Integer> it2 = iterable.iterator();
            while (it2.hasNext()) {
                this.category_.addInt(it2.next().intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCategory(AccessoryContextCategory accessoryContextCategory) {
            accessoryContextCategory.getClass();
            ensureCategoryIsMutable();
            this.category_.addInt(accessoryContextCategory.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCategoryValue(int i) {
            ensureCategoryIsMutable();
            this.category_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCategory() {
            this.category_ = GeneratedMessageLite.emptyIntList();
        }

        private void ensureCategoryIsMutable() {
            if (this.category_.isModifiable()) {
                return;
            }
            this.category_ = GeneratedMessageLite.mutableCopy(this.category_);
        }

        public static StopLiveAccessoryContextData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StopLiveAccessoryContextData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StopLiveAccessoryContextData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StopLiveAccessoryContextData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StopLiveAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StopLiveAccessoryContextData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCategory(int i, AccessoryContextCategory accessoryContextCategory) {
            accessoryContextCategory.getClass();
            ensureCategoryIsMutable();
            this.category_.setInt(i, accessoryContextCategory.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCategoryValue(int i, int i2) {
            ensureCategoryIsMutable();
            this.category_.setInt(i, i2);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StopLiveAccessoryContextData();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.category_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.category_ = ((GeneratedMessageLite.Visitor) obj).visitIntList(this.category_, ((StopLiveAccessoryContextData) obj2).category_);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (i == 0) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    if (!this.category_.isModifiable()) {
                                        this.category_ = GeneratedMessageLite.mutableCopy(this.category_);
                                    }
                                    this.category_.addInt(codedInputStream.readEnum());
                                } else if (readTag == 10) {
                                    if (!this.category_.isModifiable()) {
                                        this.category_ = GeneratedMessageLite.mutableCopy(this.category_);
                                    }
                                    int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.category_.addInt(codedInputStream.readEnum());
                                    }
                                    codedInputStream.popLimit(pushLimit);
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
                        synchronized (StopLiveAccessoryContextData.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Moments.StopLiveAccessoryContextDataOrBuilder
        public AccessoryContextCategory getCategory(int i) {
            return category_converter_.convert(Integer.valueOf(this.category_.getInt(i)));
        }

        @Override // com.amazon.alexa.accessory.protocol.Moments.StopLiveAccessoryContextDataOrBuilder
        public int getCategoryCount() {
            return this.category_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Moments.StopLiveAccessoryContextDataOrBuilder
        public List<AccessoryContextCategory> getCategoryList() {
            return new Internal.ListAdapter(this.category_, category_converter_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Moments.StopLiveAccessoryContextDataOrBuilder
        public int getCategoryValue(int i) {
            return this.category_.getInt(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Moments.StopLiveAccessoryContextDataOrBuilder
        public List<Integer> getCategoryValueList() {
            return this.category_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.category_.size(); i3++) {
                i2 += CodedOutputStream.computeEnumSizeNoTag(this.category_.getInt(i3));
            }
            int computeUInt32SizeNoTag = getCategoryList().isEmpty() ? i2 : CodedOutputStream.computeUInt32SizeNoTag(i2) + i2 + 1;
            this.categoryMemoizedSerializedSize = i2;
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32SizeNoTag;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if (getCategoryList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(10);
                codedOutputStream.writeUInt32NoTag(this.categoryMemoizedSerializedSize);
            }
            for (int i = 0; i < this.category_.size(); i++) {
                codedOutputStream.writeEnumNoTag(this.category_.getInt(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<StopLiveAccessoryContextData, Builder> implements StopLiveAccessoryContextDataOrBuilder {
            private Builder() {
                super(StopLiveAccessoryContextData.DEFAULT_INSTANCE);
            }

            public Builder addAllCategory(Iterable<? extends AccessoryContextCategory> iterable) {
                copyOnWrite();
                ((StopLiveAccessoryContextData) this.instance).addAllCategory(iterable);
                return this;
            }

            public Builder addAllCategoryValue(Iterable<Integer> iterable) {
                copyOnWrite();
                ((StopLiveAccessoryContextData) this.instance).addAllCategoryValue(iterable);
                return this;
            }

            public Builder addCategory(AccessoryContextCategory accessoryContextCategory) {
                copyOnWrite();
                ((StopLiveAccessoryContextData) this.instance).addCategory(accessoryContextCategory);
                return this;
            }

            public Builder addCategoryValue(int i) {
                ((StopLiveAccessoryContextData) this.instance).addCategoryValue(i);
                return this;
            }

            public Builder clearCategory() {
                copyOnWrite();
                ((StopLiveAccessoryContextData) this.instance).clearCategory();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.StopLiveAccessoryContextDataOrBuilder
            public AccessoryContextCategory getCategory(int i) {
                return ((StopLiveAccessoryContextData) this.instance).getCategory(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.StopLiveAccessoryContextDataOrBuilder
            public int getCategoryCount() {
                return ((StopLiveAccessoryContextData) this.instance).getCategoryCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.StopLiveAccessoryContextDataOrBuilder
            public List<AccessoryContextCategory> getCategoryList() {
                return ((StopLiveAccessoryContextData) this.instance).getCategoryList();
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.StopLiveAccessoryContextDataOrBuilder
            public int getCategoryValue(int i) {
                return ((StopLiveAccessoryContextData) this.instance).getCategoryValue(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.StopLiveAccessoryContextDataOrBuilder
            public List<Integer> getCategoryValueList() {
                return Collections.unmodifiableList(((StopLiveAccessoryContextData) this.instance).getCategoryValueList());
            }

            public Builder setCategory(int i, AccessoryContextCategory accessoryContextCategory) {
                copyOnWrite();
                ((StopLiveAccessoryContextData) this.instance).setCategory(i, accessoryContextCategory);
                return this;
            }

            public Builder setCategoryValue(int i, int i2) {
                copyOnWrite();
                ((StopLiveAccessoryContextData) this.instance).setCategoryValue(i, i2);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(StopLiveAccessoryContextData stopLiveAccessoryContextData) {
            return DEFAULT_INSTANCE.createBuilder(stopLiveAccessoryContextData);
        }

        public static StopLiveAccessoryContextData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopLiveAccessoryContextData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StopLiveAccessoryContextData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopLiveAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StopLiveAccessoryContextData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StopLiveAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StopLiveAccessoryContextData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopLiveAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StopLiveAccessoryContextData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StopLiveAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StopLiveAccessoryContextData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopLiveAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StopLiveAccessoryContextData parseFrom(InputStream inputStream) throws IOException {
            return (StopLiveAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StopLiveAccessoryContextData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopLiveAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StopLiveAccessoryContextData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StopLiveAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StopLiveAccessoryContextData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopLiveAccessoryContextData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TimeIntervalSinceLastUserSpoke extends GeneratedMessageLite<TimeIntervalSinceLastUserSpoke, Builder> implements TimeIntervalSinceLastUserSpokeOrBuilder {
        private static final TimeIntervalSinceLastUserSpoke DEFAULT_INSTANCE;
        private static volatile Parser<TimeIntervalSinceLastUserSpoke> PARSER = null;
        public static final int TIME_INTERVAL_IN_MILLISECONDS_FIELD_NUMBER = 1;
        private int timeIntervalInMilliseconds_;

        static {
            TimeIntervalSinceLastUserSpoke timeIntervalSinceLastUserSpoke = new TimeIntervalSinceLastUserSpoke();
            DEFAULT_INSTANCE = timeIntervalSinceLastUserSpoke;
            timeIntervalSinceLastUserSpoke.makeImmutable();
        }

        private TimeIntervalSinceLastUserSpoke() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeIntervalInMilliseconds() {
            this.timeIntervalInMilliseconds_ = 0;
        }

        public static TimeIntervalSinceLastUserSpoke getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TimeIntervalSinceLastUserSpoke parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TimeIntervalSinceLastUserSpoke parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<TimeIntervalSinceLastUserSpoke> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeIntervalInMilliseconds(int i) {
            this.timeIntervalInMilliseconds_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new TimeIntervalSinceLastUserSpoke();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    TimeIntervalSinceLastUserSpoke timeIntervalSinceLastUserSpoke = (TimeIntervalSinceLastUserSpoke) obj2;
                    int i = this.timeIntervalInMilliseconds_;
                    boolean z = i != 0;
                    int i2 = timeIntervalSinceLastUserSpoke.timeIntervalInMilliseconds_;
                    this.timeIntervalInMilliseconds_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    this.timeIntervalInMilliseconds_ = codedInputStream.readUInt32();
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
                        synchronized (TimeIntervalSinceLastUserSpoke.class) {
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
            int i2 = this.timeIntervalInMilliseconds_;
            int serializedSize = this.unknownFields.getSerializedSize() + (i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Moments.TimeIntervalSinceLastUserSpokeOrBuilder
        public int getTimeIntervalInMilliseconds() {
            return this.timeIntervalInMilliseconds_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.timeIntervalInMilliseconds_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<TimeIntervalSinceLastUserSpoke, Builder> implements TimeIntervalSinceLastUserSpokeOrBuilder {
            private Builder() {
                super(TimeIntervalSinceLastUserSpoke.DEFAULT_INSTANCE);
            }

            public Builder clearTimeIntervalInMilliseconds() {
                copyOnWrite();
                ((TimeIntervalSinceLastUserSpoke) this.instance).clearTimeIntervalInMilliseconds();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Moments.TimeIntervalSinceLastUserSpokeOrBuilder
            public int getTimeIntervalInMilliseconds() {
                return ((TimeIntervalSinceLastUserSpoke) this.instance).getTimeIntervalInMilliseconds();
            }

            public Builder setTimeIntervalInMilliseconds(int i) {
                copyOnWrite();
                ((TimeIntervalSinceLastUserSpoke) this.instance).setTimeIntervalInMilliseconds(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(TimeIntervalSinceLastUserSpoke timeIntervalSinceLastUserSpoke) {
            return DEFAULT_INSTANCE.createBuilder(timeIntervalSinceLastUserSpoke);
        }

        public static TimeIntervalSinceLastUserSpoke parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TimeIntervalSinceLastUserSpoke parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TimeIntervalSinceLastUserSpoke parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TimeIntervalSinceLastUserSpoke parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TimeIntervalSinceLastUserSpoke parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TimeIntervalSinceLastUserSpoke parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TimeIntervalSinceLastUserSpoke parseFrom(InputStream inputStream) throws IOException {
            return (TimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TimeIntervalSinceLastUserSpoke parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TimeIntervalSinceLastUserSpoke parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TimeIntervalSinceLastUserSpoke parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TimeIntervalSinceLastUserSpoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AccessoryContextCategory implements Internal.EnumLite {
        ACCESSORY_CONTEXT_UNKNOWN(0),
        ACCESSORY_CONTEXT_PERSON_SPEAKING_STATE(1),
        UNRECOGNIZED(-1);

        public static final int ACCESSORY_CONTEXT_PERSON_SPEAKING_STATE_VALUE = 1;
        public static final int ACCESSORY_CONTEXT_UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<AccessoryContextCategory> internalValueMap = new Internal.EnumLiteMap<AccessoryContextCategory>() { // from class: com.amazon.alexa.accessory.protocol.Moments.AccessoryContextCategory.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public AccessoryContextCategory findValueByNumber(int i) {
                return AccessoryContextCategory.forNumber(i);
            }
        };
        private final int value;

        AccessoryContextCategory(int i) {
            this.value = i;
        }

        public static AccessoryContextCategory forNumber(int i) {
            if (i == 0) {
                return ACCESSORY_CONTEXT_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return ACCESSORY_CONTEXT_PERSON_SPEAKING_STATE;
        }

        public static Internal.EnumLiteMap<AccessoryContextCategory> internalGetValueMap() {
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
        public static AccessoryContextCategory valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SpeakingState implements Internal.EnumLite {
        SPEAKING_STATE_UNKNOWN(0),
        SPEAKING_STATE_SILENT(1),
        SPEAKING_STATE_TALKING(2),
        UNRECOGNIZED(-1);

        public static final int SPEAKING_STATE_SILENT_VALUE = 1;
        public static final int SPEAKING_STATE_TALKING_VALUE = 2;
        public static final int SPEAKING_STATE_UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<SpeakingState> internalValueMap = new Internal.EnumLiteMap<SpeakingState>() { // from class: com.amazon.alexa.accessory.protocol.Moments.SpeakingState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SpeakingState findValueByNumber(int i) {
                return SpeakingState.forNumber(i);
            }
        };
        private final int value;

        SpeakingState(int i) {
            this.value = i;
        }

        public static SpeakingState forNumber(int i) {
            if (i == 0) {
                return SPEAKING_STATE_UNKNOWN;
            }
            if (i == 1) {
                return SPEAKING_STATE_SILENT;
            }
            if (i != 2) {
                return null;
            }
            return SPEAKING_STATE_TALKING;
        }

        public static Internal.EnumLiteMap<SpeakingState> internalGetValueMap() {
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
        public static SpeakingState valueOf(int i) {
            return forNumber(i);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
