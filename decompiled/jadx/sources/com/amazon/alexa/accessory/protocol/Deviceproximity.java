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
import java.util.Iterator;
import java.util.List;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class Deviceproximity {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.Deviceproximity$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$Deviceproximity$DeviceProximitySecurityMaterial$SecurityMaterialCase;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[DeviceProximitySecurityMaterial.SecurityMaterialCase.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$Deviceproximity$DeviceProximitySecurityMaterial$SecurityMaterialCase = iArr;
            try {
                iArr[DeviceProximitySecurityMaterial.SecurityMaterialCase.KEY_AND_ID_MATERIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Deviceproximity$DeviceProximitySecurityMaterial$SecurityMaterialCase[DeviceProximitySecurityMaterial.SecurityMaterialCase.SECURITYMATERIAL_NOT_SET.ordinal()] = 2;
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
    public interface BroadcasterPolicyOrBuilder extends MessageLiteOrBuilder {
        String getBroadcastingDurationMs();

        ByteString getBroadcastingDurationMsBytes();

        String getBroadcastingIntervalMs();

        ByteString getBroadcastingIntervalMsBytes();

        String getBroadcastingPeriodMs();

        ByteString getBroadcastingPeriodMsBytes();

        BroadcastingTriggerType getTriggerType();

        int getTriggerTypeValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DeviceProximityPolicyConfigurationOrBuilder extends MessageLiteOrBuilder {
        BroadcasterPolicy getBroadcasterPolicies(int i);

        int getBroadcasterPoliciesCount();

        List<BroadcasterPolicy> getBroadcasterPoliciesList();

        String getEndTime();

        ByteString getEndTimeBytes();

        String getStartTime();

        ByteString getStartTimeBytes();

        WirelessTechnology getTechnology();

        int getTechnologyValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DeviceProximitySecurityMaterialKeyAndIDOrBuilder extends MessageLiteOrBuilder {
        String getId();

        ByteString getIdBytes();

        String getIdRotationIntervalMs();

        ByteString getIdRotationIntervalMsBytes();

        String getKey();

        ByteString getKeyBytes();

        String getSecret();

        ByteString getSecretBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DeviceProximitySecurityMaterialOrBuilder extends MessageLiteOrBuilder {
        String getEndTime();

        ByteString getEndTimeBytes();

        DeviceProximitySecurityMaterialKeyAndID getKeyAndIdMaterial();

        DeviceProximitySecurityMaterial.SecurityMaterialCase getSecurityMaterialCase();

        String getStartTime();

        ByteString getStartTimeBytes();

        WirelessTechnology getTechnology();

        int getTechnologyValue();

        boolean hasKeyAndIdMaterial();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NotifyDeviceProximityPolicyConfigurationRequestOrBuilder extends MessageLiteOrBuilder {
        DeviceProximityPolicyRole getRoles(int i);

        int getRolesCount();

        List<DeviceProximityPolicyRole> getRolesList();

        int getRolesValue(int i);

        List<Integer> getRolesValueList();

        WirelessTechnology getTechnology();

        int getTechnologyValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NotifyDeviceProximitySecurityMaterialRequestOrBuilder extends MessageLiteOrBuilder {
        WirelessTechnology getTechnology();

        int getTechnologyValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SendDeviceProximityPolicyConfigurationOrBuilder extends MessageLiteOrBuilder {
        DeviceProximityPolicyConfiguration getConfiguration();

        boolean hasConfiguration();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SendDeviceProximitySecurityMaterialOrBuilder extends MessageLiteOrBuilder {
        DeviceProximitySecurityMaterial getMaterial();

        boolean hasMaterial();
    }

    private Deviceproximity() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DeviceProximityPolicyConfiguration extends GeneratedMessageLite<DeviceProximityPolicyConfiguration, Builder> implements DeviceProximityPolicyConfigurationOrBuilder {
        public static final int BROADCASTER_POLICIES_FIELD_NUMBER = 4;
        private static final DeviceProximityPolicyConfiguration DEFAULT_INSTANCE;
        public static final int END_TIME_FIELD_NUMBER = 3;
        private static volatile Parser<DeviceProximityPolicyConfiguration> PARSER = null;
        public static final int START_TIME_FIELD_NUMBER = 2;
        public static final int TECHNOLOGY_FIELD_NUMBER = 1;
        private int bitField0_;
        private int technology_;
        private String startTime_ = "";
        private String endTime_ = "";
        private Internal.ProtobufList<BroadcasterPolicy> broadcasterPolicies_ = GeneratedMessageLite.emptyProtobufList();

        static {
            DeviceProximityPolicyConfiguration deviceProximityPolicyConfiguration = new DeviceProximityPolicyConfiguration();
            DEFAULT_INSTANCE = deviceProximityPolicyConfiguration;
            deviceProximityPolicyConfiguration.makeImmutable();
        }

        private DeviceProximityPolicyConfiguration() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBroadcasterPolicies(Iterable<? extends BroadcasterPolicy> iterable) {
            ensureBroadcasterPoliciesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.broadcasterPolicies_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBroadcasterPolicies(BroadcasterPolicy.Builder builder) {
            ensureBroadcasterPoliciesIsMutable();
            this.broadcasterPolicies_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBroadcasterPolicies() {
            this.broadcasterPolicies_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndTime() {
            this.endTime_ = getDefaultInstance().getEndTime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartTime() {
            this.startTime_ = getDefaultInstance().getStartTime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTechnology() {
            this.technology_ = 0;
        }

        private void ensureBroadcasterPoliciesIsMutable() {
            if (this.broadcasterPolicies_.isModifiable()) {
                return;
            }
            this.broadcasterPolicies_ = GeneratedMessageLite.mutableCopy(this.broadcasterPolicies_);
        }

        public static DeviceProximityPolicyConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DeviceProximityPolicyConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeviceProximityPolicyConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeviceProximityPolicyConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DeviceProximityPolicyConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DeviceProximityPolicyConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeBroadcasterPolicies(int i) {
            ensureBroadcasterPoliciesIsMutable();
            this.broadcasterPolicies_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBroadcasterPolicies(int i, BroadcasterPolicy.Builder builder) {
            ensureBroadcasterPoliciesIsMutable();
            this.broadcasterPolicies_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndTime(String str) {
            str.getClass();
            this.endTime_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndTimeBytes(ByteString byteString) {
            this.endTime_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTime(String str) {
            str.getClass();
            this.startTime_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTimeBytes(ByteString byteString) {
            this.startTime_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTechnology(WirelessTechnology wirelessTechnology) {
            wirelessTechnology.getClass();
            this.technology_ = wirelessTechnology.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTechnologyValue(int i) {
            this.technology_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new DeviceProximityPolicyConfiguration();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.broadcasterPolicies_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    DeviceProximityPolicyConfiguration deviceProximityPolicyConfiguration = (DeviceProximityPolicyConfiguration) obj2;
                    int i = this.technology_;
                    boolean z = i != 0;
                    int i2 = deviceProximityPolicyConfiguration.technology_;
                    this.technology_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.startTime_ = visitor.visitString(!this.startTime_.isEmpty(), this.startTime_, !deviceProximityPolicyConfiguration.startTime_.isEmpty(), deviceProximityPolicyConfiguration.startTime_);
                    this.endTime_ = visitor.visitString(!this.endTime_.isEmpty(), this.endTime_, !deviceProximityPolicyConfiguration.endTime_.isEmpty(), deviceProximityPolicyConfiguration.endTime_);
                    this.broadcasterPolicies_ = visitor.visitList(this.broadcasterPolicies_, deviceProximityPolicyConfiguration.broadcasterPolicies_);
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                        this.bitField0_ |= deviceProximityPolicyConfiguration.bitField0_;
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
                                    this.technology_ = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    this.startTime_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    this.endTime_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 34) {
                                    if (!this.broadcasterPolicies_.isModifiable()) {
                                        this.broadcasterPolicies_ = GeneratedMessageLite.mutableCopy(this.broadcasterPolicies_);
                                    }
                                    this.broadcasterPolicies_.add((BroadcasterPolicy) codedInputStream.readMessage(BroadcasterPolicy.parser(), extensionRegistryLite));
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
                        synchronized (DeviceProximityPolicyConfiguration.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximityPolicyConfigurationOrBuilder
        public BroadcasterPolicy getBroadcasterPolicies(int i) {
            return this.broadcasterPolicies_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximityPolicyConfigurationOrBuilder
        public int getBroadcasterPoliciesCount() {
            return this.broadcasterPolicies_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximityPolicyConfigurationOrBuilder
        public List<BroadcasterPolicy> getBroadcasterPoliciesList() {
            return this.broadcasterPolicies_;
        }

        public BroadcasterPolicyOrBuilder getBroadcasterPoliciesOrBuilder(int i) {
            return this.broadcasterPolicies_.get(i);
        }

        public List<? extends BroadcasterPolicyOrBuilder> getBroadcasterPoliciesOrBuilderList() {
            return this.broadcasterPolicies_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximityPolicyConfigurationOrBuilder
        public String getEndTime() {
            return this.endTime_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximityPolicyConfigurationOrBuilder
        public ByteString getEndTimeBytes() {
            return ByteString.copyFromUtf8(this.endTime_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.technology_ != WirelessTechnology.WIRELESS_TECHNOLOGY_UNSPECIFIED.getNumber() ? CodedOutputStream.computeEnumSize(1, this.technology_) : 0;
            if (!this.startTime_.isEmpty()) {
                computeEnumSize += CodedOutputStream.computeStringSize(2, getStartTime());
            }
            if (!this.endTime_.isEmpty()) {
                computeEnumSize += CodedOutputStream.computeStringSize(3, getEndTime());
            }
            for (int i2 = 0; i2 < this.broadcasterPolicies_.size(); i2++) {
                computeEnumSize += CodedOutputStream.computeMessageSize(4, this.broadcasterPolicies_.get(i2));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximityPolicyConfigurationOrBuilder
        public String getStartTime() {
            return this.startTime_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximityPolicyConfigurationOrBuilder
        public ByteString getStartTimeBytes() {
            return ByteString.copyFromUtf8(this.startTime_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximityPolicyConfigurationOrBuilder
        public WirelessTechnology getTechnology() {
            WirelessTechnology forNumber = WirelessTechnology.forNumber(this.technology_);
            return forNumber == null ? WirelessTechnology.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximityPolicyConfigurationOrBuilder
        public int getTechnologyValue() {
            return this.technology_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.technology_ != WirelessTechnology.WIRELESS_TECHNOLOGY_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(1, this.technology_);
            }
            if (!this.startTime_.isEmpty()) {
                codedOutputStream.writeString(2, getStartTime());
            }
            if (!this.endTime_.isEmpty()) {
                codedOutputStream.writeString(3, getEndTime());
            }
            for (int i = 0; i < this.broadcasterPolicies_.size(); i++) {
                codedOutputStream.writeMessage(4, this.broadcasterPolicies_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<DeviceProximityPolicyConfiguration, Builder> implements DeviceProximityPolicyConfigurationOrBuilder {
            private Builder() {
                super(DeviceProximityPolicyConfiguration.DEFAULT_INSTANCE);
            }

            public Builder addAllBroadcasterPolicies(Iterable<? extends BroadcasterPolicy> iterable) {
                copyOnWrite();
                ((DeviceProximityPolicyConfiguration) this.instance).addAllBroadcasterPolicies(iterable);
                return this;
            }

            public Builder addBroadcasterPolicies(BroadcasterPolicy broadcasterPolicy) {
                copyOnWrite();
                ((DeviceProximityPolicyConfiguration) this.instance).addBroadcasterPolicies(broadcasterPolicy);
                return this;
            }

            public Builder clearBroadcasterPolicies() {
                copyOnWrite();
                ((DeviceProximityPolicyConfiguration) this.instance).clearBroadcasterPolicies();
                return this;
            }

            public Builder clearEndTime() {
                copyOnWrite();
                ((DeviceProximityPolicyConfiguration) this.instance).clearEndTime();
                return this;
            }

            public Builder clearStartTime() {
                copyOnWrite();
                ((DeviceProximityPolicyConfiguration) this.instance).clearStartTime();
                return this;
            }

            public Builder clearTechnology() {
                copyOnWrite();
                ((DeviceProximityPolicyConfiguration) this.instance).clearTechnology();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximityPolicyConfigurationOrBuilder
            public BroadcasterPolicy getBroadcasterPolicies(int i) {
                return ((DeviceProximityPolicyConfiguration) this.instance).getBroadcasterPolicies(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximityPolicyConfigurationOrBuilder
            public int getBroadcasterPoliciesCount() {
                return ((DeviceProximityPolicyConfiguration) this.instance).getBroadcasterPoliciesCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximityPolicyConfigurationOrBuilder
            public List<BroadcasterPolicy> getBroadcasterPoliciesList() {
                return Collections.unmodifiableList(((DeviceProximityPolicyConfiguration) this.instance).getBroadcasterPoliciesList());
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximityPolicyConfigurationOrBuilder
            public String getEndTime() {
                return ((DeviceProximityPolicyConfiguration) this.instance).getEndTime();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximityPolicyConfigurationOrBuilder
            public ByteString getEndTimeBytes() {
                return ((DeviceProximityPolicyConfiguration) this.instance).getEndTimeBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximityPolicyConfigurationOrBuilder
            public String getStartTime() {
                return ((DeviceProximityPolicyConfiguration) this.instance).getStartTime();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximityPolicyConfigurationOrBuilder
            public ByteString getStartTimeBytes() {
                return ((DeviceProximityPolicyConfiguration) this.instance).getStartTimeBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximityPolicyConfigurationOrBuilder
            public WirelessTechnology getTechnology() {
                return ((DeviceProximityPolicyConfiguration) this.instance).getTechnology();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximityPolicyConfigurationOrBuilder
            public int getTechnologyValue() {
                return ((DeviceProximityPolicyConfiguration) this.instance).getTechnologyValue();
            }

            public Builder removeBroadcasterPolicies(int i) {
                copyOnWrite();
                ((DeviceProximityPolicyConfiguration) this.instance).removeBroadcasterPolicies(i);
                return this;
            }

            public Builder setBroadcasterPolicies(int i, BroadcasterPolicy broadcasterPolicy) {
                copyOnWrite();
                ((DeviceProximityPolicyConfiguration) this.instance).setBroadcasterPolicies(i, broadcasterPolicy);
                return this;
            }

            public Builder setEndTime(String str) {
                copyOnWrite();
                ((DeviceProximityPolicyConfiguration) this.instance).setEndTime(str);
                return this;
            }

            public Builder setEndTimeBytes(ByteString byteString) {
                copyOnWrite();
                ((DeviceProximityPolicyConfiguration) this.instance).setEndTimeBytes(byteString);
                return this;
            }

            public Builder setStartTime(String str) {
                copyOnWrite();
                ((DeviceProximityPolicyConfiguration) this.instance).setStartTime(str);
                return this;
            }

            public Builder setStartTimeBytes(ByteString byteString) {
                copyOnWrite();
                ((DeviceProximityPolicyConfiguration) this.instance).setStartTimeBytes(byteString);
                return this;
            }

            public Builder setTechnology(WirelessTechnology wirelessTechnology) {
                copyOnWrite();
                ((DeviceProximityPolicyConfiguration) this.instance).setTechnology(wirelessTechnology);
                return this;
            }

            public Builder setTechnologyValue(int i) {
                copyOnWrite();
                ((DeviceProximityPolicyConfiguration) this.instance).setTechnologyValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addBroadcasterPolicies(int i, BroadcasterPolicy broadcasterPolicy) {
                copyOnWrite();
                ((DeviceProximityPolicyConfiguration) this.instance).addBroadcasterPolicies(i, broadcasterPolicy);
                return this;
            }

            public Builder setBroadcasterPolicies(int i, BroadcasterPolicy.Builder builder) {
                copyOnWrite();
                ((DeviceProximityPolicyConfiguration) this.instance).setBroadcasterPolicies(i, builder);
                return this;
            }

            public Builder addBroadcasterPolicies(BroadcasterPolicy.Builder builder) {
                copyOnWrite();
                ((DeviceProximityPolicyConfiguration) this.instance).addBroadcasterPolicies(builder);
                return this;
            }

            public Builder addBroadcasterPolicies(int i, BroadcasterPolicy.Builder builder) {
                copyOnWrite();
                ((DeviceProximityPolicyConfiguration) this.instance).addBroadcasterPolicies(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(DeviceProximityPolicyConfiguration deviceProximityPolicyConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(deviceProximityPolicyConfiguration);
        }

        public static DeviceProximityPolicyConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceProximityPolicyConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DeviceProximityPolicyConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeviceProximityPolicyConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DeviceProximityPolicyConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DeviceProximityPolicyConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DeviceProximityPolicyConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeviceProximityPolicyConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DeviceProximityPolicyConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DeviceProximityPolicyConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeviceProximityPolicyConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeviceProximityPolicyConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DeviceProximityPolicyConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (DeviceProximityPolicyConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBroadcasterPolicies(int i, BroadcasterPolicy broadcasterPolicy) {
            broadcasterPolicy.getClass();
            ensureBroadcasterPoliciesIsMutable();
            this.broadcasterPolicies_.add(i, broadcasterPolicy);
        }

        public static DeviceProximityPolicyConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceProximityPolicyConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBroadcasterPolicies(int i, BroadcasterPolicy broadcasterPolicy) {
            broadcasterPolicy.getClass();
            ensureBroadcasterPoliciesIsMutable();
            this.broadcasterPolicies_.set(i, broadcasterPolicy);
        }

        public static DeviceProximityPolicyConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DeviceProximityPolicyConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DeviceProximityPolicyConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceProximityPolicyConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBroadcasterPolicies(BroadcasterPolicy broadcasterPolicy) {
            broadcasterPolicy.getClass();
            ensureBroadcasterPoliciesIsMutable();
            this.broadcasterPolicies_.add(broadcasterPolicy);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBroadcasterPolicies(int i, BroadcasterPolicy.Builder builder) {
            ensureBroadcasterPoliciesIsMutable();
            this.broadcasterPolicies_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DeviceProximitySecurityMaterial extends GeneratedMessageLite<DeviceProximitySecurityMaterial, Builder> implements DeviceProximitySecurityMaterialOrBuilder {
        private static final DeviceProximitySecurityMaterial DEFAULT_INSTANCE;
        public static final int END_TIME_FIELD_NUMBER = 3;
        public static final int KEY_AND_ID_MATERIAL_FIELD_NUMBER = 4;
        private static volatile Parser<DeviceProximitySecurityMaterial> PARSER = null;
        public static final int START_TIME_FIELD_NUMBER = 2;
        public static final int TECHNOLOGY_FIELD_NUMBER = 1;
        private Object securityMaterial_;
        private int technology_;
        private int securityMaterialCase_ = 0;
        private String startTime_ = "";
        private String endTime_ = "";

        static {
            DeviceProximitySecurityMaterial deviceProximitySecurityMaterial = new DeviceProximitySecurityMaterial();
            DEFAULT_INSTANCE = deviceProximitySecurityMaterial;
            deviceProximitySecurityMaterial.makeImmutable();
        }

        private DeviceProximitySecurityMaterial() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndTime() {
            this.endTime_ = getDefaultInstance().getEndTime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeyAndIdMaterial() {
            if (this.securityMaterialCase_ == 4) {
                this.securityMaterialCase_ = 0;
                this.securityMaterial_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSecurityMaterial() {
            this.securityMaterialCase_ = 0;
            this.securityMaterial_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartTime() {
            this.startTime_ = getDefaultInstance().getStartTime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTechnology() {
            this.technology_ = 0;
        }

        public static DeviceProximitySecurityMaterial getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeKeyAndIdMaterial(DeviceProximitySecurityMaterialKeyAndID deviceProximitySecurityMaterialKeyAndID) {
            if (this.securityMaterialCase_ != 4 || this.securityMaterial_ == DeviceProximitySecurityMaterialKeyAndID.getDefaultInstance()) {
                this.securityMaterial_ = deviceProximitySecurityMaterialKeyAndID;
            } else {
                this.securityMaterial_ = DeviceProximitySecurityMaterialKeyAndID.newBuilder((DeviceProximitySecurityMaterialKeyAndID) this.securityMaterial_).mergeFrom((DeviceProximitySecurityMaterialKeyAndID.Builder) deviceProximitySecurityMaterialKeyAndID).buildPartial();
            }
            this.securityMaterialCase_ = 4;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DeviceProximitySecurityMaterial parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeviceProximitySecurityMaterial) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeviceProximitySecurityMaterial parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DeviceProximitySecurityMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DeviceProximitySecurityMaterial> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndTime(String str) {
            str.getClass();
            this.endTime_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndTimeBytes(ByteString byteString) {
            this.endTime_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyAndIdMaterial(DeviceProximitySecurityMaterialKeyAndID.Builder builder) {
            this.securityMaterial_ = builder.build();
            this.securityMaterialCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTime(String str) {
            str.getClass();
            this.startTime_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTimeBytes(ByteString byteString) {
            this.startTime_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTechnology(WirelessTechnology wirelessTechnology) {
            wirelessTechnology.getClass();
            this.technology_ = wirelessTechnology.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTechnologyValue(int i) {
            this.technology_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new DeviceProximitySecurityMaterial();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    DeviceProximitySecurityMaterial deviceProximitySecurityMaterial = (DeviceProximitySecurityMaterial) obj2;
                    int i2 = this.technology_;
                    boolean z = i2 != 0;
                    int i3 = deviceProximitySecurityMaterial.technology_;
                    this.technology_ = visitor.visitInt(z, i2, i3 != 0, i3);
                    this.startTime_ = visitor.visitString(!this.startTime_.isEmpty(), this.startTime_, !deviceProximitySecurityMaterial.startTime_.isEmpty(), deviceProximitySecurityMaterial.startTime_);
                    this.endTime_ = visitor.visitString(!this.endTime_.isEmpty(), this.endTime_, !deviceProximitySecurityMaterial.endTime_.isEmpty(), deviceProximitySecurityMaterial.endTime_);
                    int i4 = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Deviceproximity$DeviceProximitySecurityMaterial$SecurityMaterialCase[deviceProximitySecurityMaterial.getSecurityMaterialCase().ordinal()];
                    if (i4 == 1) {
                        this.securityMaterial_ = visitor.visitOneofMessage(this.securityMaterialCase_ == 4, this.securityMaterial_, deviceProximitySecurityMaterial.securityMaterial_);
                    } else if (i4 == 2) {
                        visitor.visitOneofNotSet(this.securityMaterialCase_ != 0);
                    }
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE && (i = deviceProximitySecurityMaterial.securityMaterialCase_) != 0) {
                        this.securityMaterialCase_ = i;
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
                                    this.technology_ = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    this.startTime_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    this.endTime_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 34) {
                                    DeviceProximitySecurityMaterialKeyAndID.Builder builder = this.securityMaterialCase_ == 4 ? ((DeviceProximitySecurityMaterialKeyAndID) this.securityMaterial_).toBuilder() : null;
                                    MessageLite readMessage = codedInputStream.readMessage(DeviceProximitySecurityMaterialKeyAndID.parser(), extensionRegistryLite);
                                    this.securityMaterial_ = readMessage;
                                    if (builder != null) {
                                        builder.mergeFrom((DeviceProximitySecurityMaterialKeyAndID.Builder) readMessage);
                                        this.securityMaterial_ = builder.buildPartial();
                                    }
                                    this.securityMaterialCase_ = 4;
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
                        synchronized (DeviceProximitySecurityMaterial.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialOrBuilder
        public String getEndTime() {
            return this.endTime_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialOrBuilder
        public ByteString getEndTimeBytes() {
            return ByteString.copyFromUtf8(this.endTime_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialOrBuilder
        public DeviceProximitySecurityMaterialKeyAndID getKeyAndIdMaterial() {
            return this.securityMaterialCase_ == 4 ? (DeviceProximitySecurityMaterialKeyAndID) this.securityMaterial_ : DeviceProximitySecurityMaterialKeyAndID.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialOrBuilder
        public SecurityMaterialCase getSecurityMaterialCase() {
            return SecurityMaterialCase.forNumber(this.securityMaterialCase_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.technology_ != WirelessTechnology.WIRELESS_TECHNOLOGY_UNSPECIFIED.getNumber() ? CodedOutputStream.computeEnumSize(1, this.technology_) : 0;
            if (!this.startTime_.isEmpty()) {
                computeEnumSize += CodedOutputStream.computeStringSize(2, getStartTime());
            }
            if (!this.endTime_.isEmpty()) {
                computeEnumSize += CodedOutputStream.computeStringSize(3, getEndTime());
            }
            if (this.securityMaterialCase_ == 4) {
                computeEnumSize += CodedOutputStream.computeMessageSize(4, (DeviceProximitySecurityMaterialKeyAndID) this.securityMaterial_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialOrBuilder
        public String getStartTime() {
            return this.startTime_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialOrBuilder
        public ByteString getStartTimeBytes() {
            return ByteString.copyFromUtf8(this.startTime_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialOrBuilder
        public WirelessTechnology getTechnology() {
            WirelessTechnology forNumber = WirelessTechnology.forNumber(this.technology_);
            return forNumber == null ? WirelessTechnology.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialOrBuilder
        public int getTechnologyValue() {
            return this.technology_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialOrBuilder
        public boolean hasKeyAndIdMaterial() {
            return this.securityMaterialCase_ == 4;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.technology_ != WirelessTechnology.WIRELESS_TECHNOLOGY_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(1, this.technology_);
            }
            if (!this.startTime_.isEmpty()) {
                codedOutputStream.writeString(2, getStartTime());
            }
            if (!this.endTime_.isEmpty()) {
                codedOutputStream.writeString(3, getEndTime());
            }
            if (this.securityMaterialCase_ == 4) {
                codedOutputStream.writeMessage(4, (DeviceProximitySecurityMaterialKeyAndID) this.securityMaterial_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<DeviceProximitySecurityMaterial, Builder> implements DeviceProximitySecurityMaterialOrBuilder {
            private Builder() {
                super(DeviceProximitySecurityMaterial.DEFAULT_INSTANCE);
            }

            public Builder clearEndTime() {
                copyOnWrite();
                ((DeviceProximitySecurityMaterial) this.instance).clearEndTime();
                return this;
            }

            public Builder clearKeyAndIdMaterial() {
                copyOnWrite();
                ((DeviceProximitySecurityMaterial) this.instance).clearKeyAndIdMaterial();
                return this;
            }

            public Builder clearSecurityMaterial() {
                copyOnWrite();
                ((DeviceProximitySecurityMaterial) this.instance).clearSecurityMaterial();
                return this;
            }

            public Builder clearStartTime() {
                copyOnWrite();
                ((DeviceProximitySecurityMaterial) this.instance).clearStartTime();
                return this;
            }

            public Builder clearTechnology() {
                copyOnWrite();
                ((DeviceProximitySecurityMaterial) this.instance).clearTechnology();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialOrBuilder
            public String getEndTime() {
                return ((DeviceProximitySecurityMaterial) this.instance).getEndTime();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialOrBuilder
            public ByteString getEndTimeBytes() {
                return ((DeviceProximitySecurityMaterial) this.instance).getEndTimeBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialOrBuilder
            public DeviceProximitySecurityMaterialKeyAndID getKeyAndIdMaterial() {
                return ((DeviceProximitySecurityMaterial) this.instance).getKeyAndIdMaterial();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialOrBuilder
            public SecurityMaterialCase getSecurityMaterialCase() {
                return ((DeviceProximitySecurityMaterial) this.instance).getSecurityMaterialCase();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialOrBuilder
            public String getStartTime() {
                return ((DeviceProximitySecurityMaterial) this.instance).getStartTime();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialOrBuilder
            public ByteString getStartTimeBytes() {
                return ((DeviceProximitySecurityMaterial) this.instance).getStartTimeBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialOrBuilder
            public WirelessTechnology getTechnology() {
                return ((DeviceProximitySecurityMaterial) this.instance).getTechnology();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialOrBuilder
            public int getTechnologyValue() {
                return ((DeviceProximitySecurityMaterial) this.instance).getTechnologyValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialOrBuilder
            public boolean hasKeyAndIdMaterial() {
                return ((DeviceProximitySecurityMaterial) this.instance).hasKeyAndIdMaterial();
            }

            public Builder mergeKeyAndIdMaterial(DeviceProximitySecurityMaterialKeyAndID deviceProximitySecurityMaterialKeyAndID) {
                copyOnWrite();
                ((DeviceProximitySecurityMaterial) this.instance).mergeKeyAndIdMaterial(deviceProximitySecurityMaterialKeyAndID);
                return this;
            }

            public Builder setEndTime(String str) {
                copyOnWrite();
                ((DeviceProximitySecurityMaterial) this.instance).setEndTime(str);
                return this;
            }

            public Builder setEndTimeBytes(ByteString byteString) {
                copyOnWrite();
                ((DeviceProximitySecurityMaterial) this.instance).setEndTimeBytes(byteString);
                return this;
            }

            public Builder setKeyAndIdMaterial(DeviceProximitySecurityMaterialKeyAndID deviceProximitySecurityMaterialKeyAndID) {
                copyOnWrite();
                ((DeviceProximitySecurityMaterial) this.instance).setKeyAndIdMaterial(deviceProximitySecurityMaterialKeyAndID);
                return this;
            }

            public Builder setStartTime(String str) {
                copyOnWrite();
                ((DeviceProximitySecurityMaterial) this.instance).setStartTime(str);
                return this;
            }

            public Builder setStartTimeBytes(ByteString byteString) {
                copyOnWrite();
                ((DeviceProximitySecurityMaterial) this.instance).setStartTimeBytes(byteString);
                return this;
            }

            public Builder setTechnology(WirelessTechnology wirelessTechnology) {
                copyOnWrite();
                ((DeviceProximitySecurityMaterial) this.instance).setTechnology(wirelessTechnology);
                return this;
            }

            public Builder setTechnologyValue(int i) {
                copyOnWrite();
                ((DeviceProximitySecurityMaterial) this.instance).setTechnologyValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setKeyAndIdMaterial(DeviceProximitySecurityMaterialKeyAndID.Builder builder) {
                copyOnWrite();
                ((DeviceProximitySecurityMaterial) this.instance).setKeyAndIdMaterial(builder);
                return this;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum SecurityMaterialCase implements Internal.EnumLite {
            KEY_AND_ID_MATERIAL(4),
            SECURITYMATERIAL_NOT_SET(0);

            private final int value;

            SecurityMaterialCase(int i) {
                this.value = i;
            }

            public static SecurityMaterialCase forNumber(int i) {
                if (i == 0) {
                    return SECURITYMATERIAL_NOT_SET;
                }
                if (i != 4) {
                    return null;
                }
                return KEY_AND_ID_MATERIAL;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static SecurityMaterialCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(DeviceProximitySecurityMaterial deviceProximitySecurityMaterial) {
            return DEFAULT_INSTANCE.createBuilder(deviceProximitySecurityMaterial);
        }

        public static DeviceProximitySecurityMaterial parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceProximitySecurityMaterial) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DeviceProximitySecurityMaterial parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeviceProximitySecurityMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DeviceProximitySecurityMaterial parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DeviceProximitySecurityMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyAndIdMaterial(DeviceProximitySecurityMaterialKeyAndID deviceProximitySecurityMaterialKeyAndID) {
            deviceProximitySecurityMaterialKeyAndID.getClass();
            this.securityMaterial_ = deviceProximitySecurityMaterialKeyAndID;
            this.securityMaterialCase_ = 4;
        }

        public static DeviceProximitySecurityMaterial parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeviceProximitySecurityMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DeviceProximitySecurityMaterial parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DeviceProximitySecurityMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeviceProximitySecurityMaterial parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeviceProximitySecurityMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DeviceProximitySecurityMaterial parseFrom(InputStream inputStream) throws IOException {
            return (DeviceProximitySecurityMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeviceProximitySecurityMaterial parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceProximitySecurityMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DeviceProximitySecurityMaterial parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DeviceProximitySecurityMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DeviceProximitySecurityMaterial parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceProximitySecurityMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SendDeviceProximityPolicyConfiguration extends GeneratedMessageLite<SendDeviceProximityPolicyConfiguration, Builder> implements SendDeviceProximityPolicyConfigurationOrBuilder {
        public static final int CONFIGURATION_FIELD_NUMBER = 1;
        private static final SendDeviceProximityPolicyConfiguration DEFAULT_INSTANCE;
        private static volatile Parser<SendDeviceProximityPolicyConfiguration> PARSER;
        private DeviceProximityPolicyConfiguration configuration_;

        static {
            SendDeviceProximityPolicyConfiguration sendDeviceProximityPolicyConfiguration = new SendDeviceProximityPolicyConfiguration();
            DEFAULT_INSTANCE = sendDeviceProximityPolicyConfiguration;
            sendDeviceProximityPolicyConfiguration.makeImmutable();
        }

        private SendDeviceProximityPolicyConfiguration() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfiguration() {
            this.configuration_ = null;
        }

        public static SendDeviceProximityPolicyConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeConfiguration(DeviceProximityPolicyConfiguration deviceProximityPolicyConfiguration) {
            DeviceProximityPolicyConfiguration deviceProximityPolicyConfiguration2 = this.configuration_;
            if (deviceProximityPolicyConfiguration2 == null || deviceProximityPolicyConfiguration2 == DeviceProximityPolicyConfiguration.getDefaultInstance()) {
                this.configuration_ = deviceProximityPolicyConfiguration;
            } else {
                this.configuration_ = DeviceProximityPolicyConfiguration.newBuilder(this.configuration_).mergeFrom((DeviceProximityPolicyConfiguration.Builder) deviceProximityPolicyConfiguration).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SendDeviceProximityPolicyConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SendDeviceProximityPolicyConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SendDeviceProximityPolicyConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SendDeviceProximityPolicyConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SendDeviceProximityPolicyConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfiguration(DeviceProximityPolicyConfiguration.Builder builder) {
            this.configuration_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SendDeviceProximityPolicyConfiguration();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.configuration_ = (DeviceProximityPolicyConfiguration) ((GeneratedMessageLite.Visitor) obj).visitMessage(this.configuration_, ((SendDeviceProximityPolicyConfiguration) obj2).configuration_);
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
                                    DeviceProximityPolicyConfiguration deviceProximityPolicyConfiguration = this.configuration_;
                                    DeviceProximityPolicyConfiguration.Builder builder = deviceProximityPolicyConfiguration != null ? deviceProximityPolicyConfiguration.toBuilder() : null;
                                    DeviceProximityPolicyConfiguration deviceProximityPolicyConfiguration2 = (DeviceProximityPolicyConfiguration) codedInputStream.readMessage(DeviceProximityPolicyConfiguration.parser(), extensionRegistryLite);
                                    this.configuration_ = deviceProximityPolicyConfiguration2;
                                    if (builder != null) {
                                        builder.mergeFrom((DeviceProximityPolicyConfiguration.Builder) deviceProximityPolicyConfiguration2);
                                        this.configuration_ = builder.buildPartial();
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
                        synchronized (SendDeviceProximityPolicyConfiguration.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.SendDeviceProximityPolicyConfigurationOrBuilder
        public DeviceProximityPolicyConfiguration getConfiguration() {
            DeviceProximityPolicyConfiguration deviceProximityPolicyConfiguration = this.configuration_;
            return deviceProximityPolicyConfiguration == null ? DeviceProximityPolicyConfiguration.getDefaultInstance() : deviceProximityPolicyConfiguration;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.configuration_ != null ? CodedOutputStream.computeMessageSize(1, getConfiguration()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.SendDeviceProximityPolicyConfigurationOrBuilder
        public boolean hasConfiguration() {
            return this.configuration_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.configuration_ != null) {
                codedOutputStream.writeMessage(1, getConfiguration());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SendDeviceProximityPolicyConfiguration, Builder> implements SendDeviceProximityPolicyConfigurationOrBuilder {
            private Builder() {
                super(SendDeviceProximityPolicyConfiguration.DEFAULT_INSTANCE);
            }

            public Builder clearConfiguration() {
                copyOnWrite();
                ((SendDeviceProximityPolicyConfiguration) this.instance).clearConfiguration();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.SendDeviceProximityPolicyConfigurationOrBuilder
            public DeviceProximityPolicyConfiguration getConfiguration() {
                return ((SendDeviceProximityPolicyConfiguration) this.instance).getConfiguration();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.SendDeviceProximityPolicyConfigurationOrBuilder
            public boolean hasConfiguration() {
                return ((SendDeviceProximityPolicyConfiguration) this.instance).hasConfiguration();
            }

            public Builder mergeConfiguration(DeviceProximityPolicyConfiguration deviceProximityPolicyConfiguration) {
                copyOnWrite();
                ((SendDeviceProximityPolicyConfiguration) this.instance).mergeConfiguration(deviceProximityPolicyConfiguration);
                return this;
            }

            public Builder setConfiguration(DeviceProximityPolicyConfiguration deviceProximityPolicyConfiguration) {
                copyOnWrite();
                ((SendDeviceProximityPolicyConfiguration) this.instance).setConfiguration(deviceProximityPolicyConfiguration);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setConfiguration(DeviceProximityPolicyConfiguration.Builder builder) {
                copyOnWrite();
                ((SendDeviceProximityPolicyConfiguration) this.instance).setConfiguration(builder);
                return this;
            }
        }

        public static Builder newBuilder(SendDeviceProximityPolicyConfiguration sendDeviceProximityPolicyConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(sendDeviceProximityPolicyConfiguration);
        }

        public static SendDeviceProximityPolicyConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SendDeviceProximityPolicyConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SendDeviceProximityPolicyConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SendDeviceProximityPolicyConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfiguration(DeviceProximityPolicyConfiguration deviceProximityPolicyConfiguration) {
            deviceProximityPolicyConfiguration.getClass();
            this.configuration_ = deviceProximityPolicyConfiguration;
        }

        public static SendDeviceProximityPolicyConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SendDeviceProximityPolicyConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SendDeviceProximityPolicyConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SendDeviceProximityPolicyConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SendDeviceProximityPolicyConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SendDeviceProximityPolicyConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SendDeviceProximityPolicyConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SendDeviceProximityPolicyConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SendDeviceProximityPolicyConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (SendDeviceProximityPolicyConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SendDeviceProximityPolicyConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SendDeviceProximityPolicyConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SendDeviceProximityPolicyConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SendDeviceProximityPolicyConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SendDeviceProximityPolicyConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SendDeviceProximityPolicyConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SendDeviceProximitySecurityMaterial extends GeneratedMessageLite<SendDeviceProximitySecurityMaterial, Builder> implements SendDeviceProximitySecurityMaterialOrBuilder {
        private static final SendDeviceProximitySecurityMaterial DEFAULT_INSTANCE;
        public static final int MATERIAL_FIELD_NUMBER = 1;
        private static volatile Parser<SendDeviceProximitySecurityMaterial> PARSER;
        private DeviceProximitySecurityMaterial material_;

        static {
            SendDeviceProximitySecurityMaterial sendDeviceProximitySecurityMaterial = new SendDeviceProximitySecurityMaterial();
            DEFAULT_INSTANCE = sendDeviceProximitySecurityMaterial;
            sendDeviceProximitySecurityMaterial.makeImmutable();
        }

        private SendDeviceProximitySecurityMaterial() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaterial() {
            this.material_ = null;
        }

        public static SendDeviceProximitySecurityMaterial getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMaterial(DeviceProximitySecurityMaterial deviceProximitySecurityMaterial) {
            DeviceProximitySecurityMaterial deviceProximitySecurityMaterial2 = this.material_;
            if (deviceProximitySecurityMaterial2 == null || deviceProximitySecurityMaterial2 == DeviceProximitySecurityMaterial.getDefaultInstance()) {
                this.material_ = deviceProximitySecurityMaterial;
            } else {
                this.material_ = DeviceProximitySecurityMaterial.newBuilder(this.material_).mergeFrom((DeviceProximitySecurityMaterial.Builder) deviceProximitySecurityMaterial).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SendDeviceProximitySecurityMaterial parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SendDeviceProximitySecurityMaterial) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SendDeviceProximitySecurityMaterial parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SendDeviceProximitySecurityMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SendDeviceProximitySecurityMaterial> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaterial(DeviceProximitySecurityMaterial.Builder builder) {
            this.material_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SendDeviceProximitySecurityMaterial();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.material_ = (DeviceProximitySecurityMaterial) ((GeneratedMessageLite.Visitor) obj).visitMessage(this.material_, ((SendDeviceProximitySecurityMaterial) obj2).material_);
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
                                    DeviceProximitySecurityMaterial deviceProximitySecurityMaterial = this.material_;
                                    DeviceProximitySecurityMaterial.Builder builder = deviceProximitySecurityMaterial != null ? deviceProximitySecurityMaterial.toBuilder() : null;
                                    DeviceProximitySecurityMaterial deviceProximitySecurityMaterial2 = (DeviceProximitySecurityMaterial) codedInputStream.readMessage(DeviceProximitySecurityMaterial.parser(), extensionRegistryLite);
                                    this.material_ = deviceProximitySecurityMaterial2;
                                    if (builder != null) {
                                        builder.mergeFrom((DeviceProximitySecurityMaterial.Builder) deviceProximitySecurityMaterial2);
                                        this.material_ = builder.buildPartial();
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
                        synchronized (SendDeviceProximitySecurityMaterial.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.SendDeviceProximitySecurityMaterialOrBuilder
        public DeviceProximitySecurityMaterial getMaterial() {
            DeviceProximitySecurityMaterial deviceProximitySecurityMaterial = this.material_;
            return deviceProximitySecurityMaterial == null ? DeviceProximitySecurityMaterial.getDefaultInstance() : deviceProximitySecurityMaterial;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.material_ != null ? CodedOutputStream.computeMessageSize(1, getMaterial()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.SendDeviceProximitySecurityMaterialOrBuilder
        public boolean hasMaterial() {
            return this.material_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.material_ != null) {
                codedOutputStream.writeMessage(1, getMaterial());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SendDeviceProximitySecurityMaterial, Builder> implements SendDeviceProximitySecurityMaterialOrBuilder {
            private Builder() {
                super(SendDeviceProximitySecurityMaterial.DEFAULT_INSTANCE);
            }

            public Builder clearMaterial() {
                copyOnWrite();
                ((SendDeviceProximitySecurityMaterial) this.instance).clearMaterial();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.SendDeviceProximitySecurityMaterialOrBuilder
            public DeviceProximitySecurityMaterial getMaterial() {
                return ((SendDeviceProximitySecurityMaterial) this.instance).getMaterial();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.SendDeviceProximitySecurityMaterialOrBuilder
            public boolean hasMaterial() {
                return ((SendDeviceProximitySecurityMaterial) this.instance).hasMaterial();
            }

            public Builder mergeMaterial(DeviceProximitySecurityMaterial deviceProximitySecurityMaterial) {
                copyOnWrite();
                ((SendDeviceProximitySecurityMaterial) this.instance).mergeMaterial(deviceProximitySecurityMaterial);
                return this;
            }

            public Builder setMaterial(DeviceProximitySecurityMaterial deviceProximitySecurityMaterial) {
                copyOnWrite();
                ((SendDeviceProximitySecurityMaterial) this.instance).setMaterial(deviceProximitySecurityMaterial);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setMaterial(DeviceProximitySecurityMaterial.Builder builder) {
                copyOnWrite();
                ((SendDeviceProximitySecurityMaterial) this.instance).setMaterial(builder);
                return this;
            }
        }

        public static Builder newBuilder(SendDeviceProximitySecurityMaterial sendDeviceProximitySecurityMaterial) {
            return DEFAULT_INSTANCE.createBuilder(sendDeviceProximitySecurityMaterial);
        }

        public static SendDeviceProximitySecurityMaterial parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SendDeviceProximitySecurityMaterial) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SendDeviceProximitySecurityMaterial parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SendDeviceProximitySecurityMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaterial(DeviceProximitySecurityMaterial deviceProximitySecurityMaterial) {
            deviceProximitySecurityMaterial.getClass();
            this.material_ = deviceProximitySecurityMaterial;
        }

        public static SendDeviceProximitySecurityMaterial parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SendDeviceProximitySecurityMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SendDeviceProximitySecurityMaterial parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SendDeviceProximitySecurityMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SendDeviceProximitySecurityMaterial parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SendDeviceProximitySecurityMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SendDeviceProximitySecurityMaterial parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SendDeviceProximitySecurityMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SendDeviceProximitySecurityMaterial parseFrom(InputStream inputStream) throws IOException {
            return (SendDeviceProximitySecurityMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SendDeviceProximitySecurityMaterial parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SendDeviceProximitySecurityMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SendDeviceProximitySecurityMaterial parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SendDeviceProximitySecurityMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SendDeviceProximitySecurityMaterial parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SendDeviceProximitySecurityMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class BroadcasterPolicy extends GeneratedMessageLite<BroadcasterPolicy, Builder> implements BroadcasterPolicyOrBuilder {
        public static final int BROADCASTING_DURATION_MS_FIELD_NUMBER = 3;
        public static final int BROADCASTING_INTERVAL_MS_FIELD_NUMBER = 2;
        public static final int BROADCASTING_PERIOD_MS_FIELD_NUMBER = 4;
        private static final BroadcasterPolicy DEFAULT_INSTANCE;
        private static volatile Parser<BroadcasterPolicy> PARSER = null;
        public static final int TRIGGER_TYPE_FIELD_NUMBER = 1;
        private int triggerType_;
        private String broadcastingIntervalMs_ = "";
        private String broadcastingDurationMs_ = "";
        private String broadcastingPeriodMs_ = "";

        static {
            BroadcasterPolicy broadcasterPolicy = new BroadcasterPolicy();
            DEFAULT_INSTANCE = broadcasterPolicy;
            broadcasterPolicy.makeImmutable();
        }

        private BroadcasterPolicy() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBroadcastingDurationMs() {
            this.broadcastingDurationMs_ = getDefaultInstance().getBroadcastingDurationMs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBroadcastingIntervalMs() {
            this.broadcastingIntervalMs_ = getDefaultInstance().getBroadcastingIntervalMs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBroadcastingPeriodMs() {
            this.broadcastingPeriodMs_ = getDefaultInstance().getBroadcastingPeriodMs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTriggerType() {
            this.triggerType_ = 0;
        }

        public static BroadcasterPolicy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BroadcasterPolicy parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BroadcasterPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BroadcasterPolicy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BroadcasterPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<BroadcasterPolicy> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBroadcastingDurationMs(String str) {
            str.getClass();
            this.broadcastingDurationMs_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBroadcastingDurationMsBytes(ByteString byteString) {
            this.broadcastingDurationMs_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBroadcastingIntervalMs(String str) {
            str.getClass();
            this.broadcastingIntervalMs_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBroadcastingIntervalMsBytes(ByteString byteString) {
            this.broadcastingIntervalMs_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBroadcastingPeriodMs(String str) {
            str.getClass();
            this.broadcastingPeriodMs_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBroadcastingPeriodMsBytes(ByteString byteString) {
            this.broadcastingPeriodMs_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTriggerType(BroadcastingTriggerType broadcastingTriggerType) {
            broadcastingTriggerType.getClass();
            this.triggerType_ = broadcastingTriggerType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTriggerTypeValue(int i) {
            this.triggerType_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new BroadcasterPolicy();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    BroadcasterPolicy broadcasterPolicy = (BroadcasterPolicy) obj2;
                    int i = this.triggerType_;
                    boolean z = i != 0;
                    int i2 = broadcasterPolicy.triggerType_;
                    this.triggerType_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.broadcastingIntervalMs_ = visitor.visitString(!this.broadcastingIntervalMs_.isEmpty(), this.broadcastingIntervalMs_, !broadcasterPolicy.broadcastingIntervalMs_.isEmpty(), broadcasterPolicy.broadcastingIntervalMs_);
                    this.broadcastingDurationMs_ = visitor.visitString(!this.broadcastingDurationMs_.isEmpty(), this.broadcastingDurationMs_, !broadcasterPolicy.broadcastingDurationMs_.isEmpty(), broadcasterPolicy.broadcastingDurationMs_);
                    this.broadcastingPeriodMs_ = visitor.visitString(!this.broadcastingPeriodMs_.isEmpty(), this.broadcastingPeriodMs_, !broadcasterPolicy.broadcastingPeriodMs_.isEmpty(), broadcasterPolicy.broadcastingPeriodMs_);
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
                                    this.triggerType_ = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    this.broadcastingIntervalMs_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    this.broadcastingDurationMs_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 34) {
                                    this.broadcastingPeriodMs_ = codedInputStream.readStringRequireUtf8();
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
                        synchronized (BroadcasterPolicy.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.BroadcasterPolicyOrBuilder
        public String getBroadcastingDurationMs() {
            return this.broadcastingDurationMs_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.BroadcasterPolicyOrBuilder
        public ByteString getBroadcastingDurationMsBytes() {
            return ByteString.copyFromUtf8(this.broadcastingDurationMs_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.BroadcasterPolicyOrBuilder
        public String getBroadcastingIntervalMs() {
            return this.broadcastingIntervalMs_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.BroadcasterPolicyOrBuilder
        public ByteString getBroadcastingIntervalMsBytes() {
            return ByteString.copyFromUtf8(this.broadcastingIntervalMs_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.BroadcasterPolicyOrBuilder
        public String getBroadcastingPeriodMs() {
            return this.broadcastingPeriodMs_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.BroadcasterPolicyOrBuilder
        public ByteString getBroadcastingPeriodMsBytes() {
            return ByteString.copyFromUtf8(this.broadcastingPeriodMs_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.triggerType_ != BroadcastingTriggerType.BROADCASTING_TRIGGER_TYPE_UNSPECIFIED.getNumber() ? CodedOutputStream.computeEnumSize(1, this.triggerType_) : 0;
            if (!this.broadcastingIntervalMs_.isEmpty()) {
                computeEnumSize += CodedOutputStream.computeStringSize(2, getBroadcastingIntervalMs());
            }
            if (!this.broadcastingDurationMs_.isEmpty()) {
                computeEnumSize += CodedOutputStream.computeStringSize(3, getBroadcastingDurationMs());
            }
            if (!this.broadcastingPeriodMs_.isEmpty()) {
                computeEnumSize += CodedOutputStream.computeStringSize(4, getBroadcastingPeriodMs());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.BroadcasterPolicyOrBuilder
        public BroadcastingTriggerType getTriggerType() {
            BroadcastingTriggerType forNumber = BroadcastingTriggerType.forNumber(this.triggerType_);
            return forNumber == null ? BroadcastingTriggerType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.BroadcasterPolicyOrBuilder
        public int getTriggerTypeValue() {
            return this.triggerType_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.triggerType_ != BroadcastingTriggerType.BROADCASTING_TRIGGER_TYPE_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(1, this.triggerType_);
            }
            if (!this.broadcastingIntervalMs_.isEmpty()) {
                codedOutputStream.writeString(2, getBroadcastingIntervalMs());
            }
            if (!this.broadcastingDurationMs_.isEmpty()) {
                codedOutputStream.writeString(3, getBroadcastingDurationMs());
            }
            if (!this.broadcastingPeriodMs_.isEmpty()) {
                codedOutputStream.writeString(4, getBroadcastingPeriodMs());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<BroadcasterPolicy, Builder> implements BroadcasterPolicyOrBuilder {
            private Builder() {
                super(BroadcasterPolicy.DEFAULT_INSTANCE);
            }

            public Builder clearBroadcastingDurationMs() {
                copyOnWrite();
                ((BroadcasterPolicy) this.instance).clearBroadcastingDurationMs();
                return this;
            }

            public Builder clearBroadcastingIntervalMs() {
                copyOnWrite();
                ((BroadcasterPolicy) this.instance).clearBroadcastingIntervalMs();
                return this;
            }

            public Builder clearBroadcastingPeriodMs() {
                copyOnWrite();
                ((BroadcasterPolicy) this.instance).clearBroadcastingPeriodMs();
                return this;
            }

            public Builder clearTriggerType() {
                copyOnWrite();
                ((BroadcasterPolicy) this.instance).clearTriggerType();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.BroadcasterPolicyOrBuilder
            public String getBroadcastingDurationMs() {
                return ((BroadcasterPolicy) this.instance).getBroadcastingDurationMs();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.BroadcasterPolicyOrBuilder
            public ByteString getBroadcastingDurationMsBytes() {
                return ((BroadcasterPolicy) this.instance).getBroadcastingDurationMsBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.BroadcasterPolicyOrBuilder
            public String getBroadcastingIntervalMs() {
                return ((BroadcasterPolicy) this.instance).getBroadcastingIntervalMs();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.BroadcasterPolicyOrBuilder
            public ByteString getBroadcastingIntervalMsBytes() {
                return ((BroadcasterPolicy) this.instance).getBroadcastingIntervalMsBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.BroadcasterPolicyOrBuilder
            public String getBroadcastingPeriodMs() {
                return ((BroadcasterPolicy) this.instance).getBroadcastingPeriodMs();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.BroadcasterPolicyOrBuilder
            public ByteString getBroadcastingPeriodMsBytes() {
                return ((BroadcasterPolicy) this.instance).getBroadcastingPeriodMsBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.BroadcasterPolicyOrBuilder
            public BroadcastingTriggerType getTriggerType() {
                return ((BroadcasterPolicy) this.instance).getTriggerType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.BroadcasterPolicyOrBuilder
            public int getTriggerTypeValue() {
                return ((BroadcasterPolicy) this.instance).getTriggerTypeValue();
            }

            public Builder setBroadcastingDurationMs(String str) {
                copyOnWrite();
                ((BroadcasterPolicy) this.instance).setBroadcastingDurationMs(str);
                return this;
            }

            public Builder setBroadcastingDurationMsBytes(ByteString byteString) {
                copyOnWrite();
                ((BroadcasterPolicy) this.instance).setBroadcastingDurationMsBytes(byteString);
                return this;
            }

            public Builder setBroadcastingIntervalMs(String str) {
                copyOnWrite();
                ((BroadcasterPolicy) this.instance).setBroadcastingIntervalMs(str);
                return this;
            }

            public Builder setBroadcastingIntervalMsBytes(ByteString byteString) {
                copyOnWrite();
                ((BroadcasterPolicy) this.instance).setBroadcastingIntervalMsBytes(byteString);
                return this;
            }

            public Builder setBroadcastingPeriodMs(String str) {
                copyOnWrite();
                ((BroadcasterPolicy) this.instance).setBroadcastingPeriodMs(str);
                return this;
            }

            public Builder setBroadcastingPeriodMsBytes(ByteString byteString) {
                copyOnWrite();
                ((BroadcasterPolicy) this.instance).setBroadcastingPeriodMsBytes(byteString);
                return this;
            }

            public Builder setTriggerType(BroadcastingTriggerType broadcastingTriggerType) {
                copyOnWrite();
                ((BroadcasterPolicy) this.instance).setTriggerType(broadcastingTriggerType);
                return this;
            }

            public Builder setTriggerTypeValue(int i) {
                copyOnWrite();
                ((BroadcasterPolicy) this.instance).setTriggerTypeValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(BroadcasterPolicy broadcasterPolicy) {
            return DEFAULT_INSTANCE.createBuilder(broadcasterPolicy);
        }

        public static BroadcasterPolicy parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BroadcasterPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BroadcasterPolicy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BroadcasterPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BroadcasterPolicy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BroadcasterPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BroadcasterPolicy parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BroadcasterPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BroadcasterPolicy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BroadcasterPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BroadcasterPolicy parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BroadcasterPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BroadcasterPolicy parseFrom(InputStream inputStream) throws IOException {
            return (BroadcasterPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BroadcasterPolicy parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BroadcasterPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BroadcasterPolicy parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BroadcasterPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BroadcasterPolicy parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BroadcasterPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DeviceProximitySecurityMaterialKeyAndID extends GeneratedMessageLite<DeviceProximitySecurityMaterialKeyAndID, Builder> implements DeviceProximitySecurityMaterialKeyAndIDOrBuilder {
        private static final DeviceProximitySecurityMaterialKeyAndID DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 3;
        public static final int ID_ROTATION_INTERVAL_MS_FIELD_NUMBER = 4;
        public static final int KEY_FIELD_NUMBER = 1;
        private static volatile Parser<DeviceProximitySecurityMaterialKeyAndID> PARSER = null;
        public static final int SECRET_FIELD_NUMBER = 2;
        private String key_ = "";
        private String secret_ = "";
        private String id_ = "";
        private String idRotationIntervalMs_ = "";

        static {
            DeviceProximitySecurityMaterialKeyAndID deviceProximitySecurityMaterialKeyAndID = new DeviceProximitySecurityMaterialKeyAndID();
            DEFAULT_INSTANCE = deviceProximitySecurityMaterialKeyAndID;
            deviceProximitySecurityMaterialKeyAndID.makeImmutable();
        }

        private DeviceProximitySecurityMaterialKeyAndID() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdRotationIntervalMs() {
            this.idRotationIntervalMs_ = getDefaultInstance().getIdRotationIntervalMs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKey() {
            this.key_ = getDefaultInstance().getKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSecret() {
            this.secret_ = getDefaultInstance().getSecret();
        }

        public static DeviceProximitySecurityMaterialKeyAndID getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DeviceProximitySecurityMaterialKeyAndID parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeviceProximitySecurityMaterialKeyAndID) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeviceProximitySecurityMaterialKeyAndID parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DeviceProximitySecurityMaterialKeyAndID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DeviceProximitySecurityMaterialKeyAndID> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            this.id_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdRotationIntervalMs(String str) {
            str.getClass();
            this.idRotationIntervalMs_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdRotationIntervalMsBytes(ByteString byteString) {
            this.idRotationIntervalMs_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKey(String str) {
            str.getClass();
            this.key_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyBytes(ByteString byteString) {
            this.key_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSecret(String str) {
            str.getClass();
            this.secret_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSecretBytes(ByteString byteString) {
            this.secret_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new DeviceProximitySecurityMaterialKeyAndID();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    DeviceProximitySecurityMaterialKeyAndID deviceProximitySecurityMaterialKeyAndID = (DeviceProximitySecurityMaterialKeyAndID) obj2;
                    this.key_ = visitor.visitString(!this.key_.isEmpty(), this.key_, !deviceProximitySecurityMaterialKeyAndID.key_.isEmpty(), deviceProximitySecurityMaterialKeyAndID.key_);
                    this.secret_ = visitor.visitString(!this.secret_.isEmpty(), this.secret_, !deviceProximitySecurityMaterialKeyAndID.secret_.isEmpty(), deviceProximitySecurityMaterialKeyAndID.secret_);
                    this.id_ = visitor.visitString(!this.id_.isEmpty(), this.id_, !deviceProximitySecurityMaterialKeyAndID.id_.isEmpty(), deviceProximitySecurityMaterialKeyAndID.id_);
                    this.idRotationIntervalMs_ = visitor.visitString(!this.idRotationIntervalMs_.isEmpty(), this.idRotationIntervalMs_, !deviceProximitySecurityMaterialKeyAndID.idRotationIntervalMs_.isEmpty(), deviceProximitySecurityMaterialKeyAndID.idRotationIntervalMs_);
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
                                    this.key_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.secret_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    this.id_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 34) {
                                    this.idRotationIntervalMs_ = codedInputStream.readStringRequireUtf8();
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
                        synchronized (DeviceProximitySecurityMaterialKeyAndID.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialKeyAndIDOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialKeyAndIDOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialKeyAndIDOrBuilder
        public String getIdRotationIntervalMs() {
            return this.idRotationIntervalMs_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialKeyAndIDOrBuilder
        public ByteString getIdRotationIntervalMsBytes() {
            return ByteString.copyFromUtf8(this.idRotationIntervalMs_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialKeyAndIDOrBuilder
        public String getKey() {
            return this.key_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialKeyAndIDOrBuilder
        public ByteString getKeyBytes() {
            return ByteString.copyFromUtf8(this.key_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialKeyAndIDOrBuilder
        public String getSecret() {
            return this.secret_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialKeyAndIDOrBuilder
        public ByteString getSecretBytes() {
            return ByteString.copyFromUtf8(this.secret_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.key_.isEmpty() ? CodedOutputStream.computeStringSize(1, getKey()) : 0;
            if (!this.secret_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(2, getSecret());
            }
            if (!this.id_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(3, getId());
            }
            if (!this.idRotationIntervalMs_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(4, getIdRotationIntervalMs());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.key_.isEmpty()) {
                codedOutputStream.writeString(1, getKey());
            }
            if (!this.secret_.isEmpty()) {
                codedOutputStream.writeString(2, getSecret());
            }
            if (!this.id_.isEmpty()) {
                codedOutputStream.writeString(3, getId());
            }
            if (!this.idRotationIntervalMs_.isEmpty()) {
                codedOutputStream.writeString(4, getIdRotationIntervalMs());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<DeviceProximitySecurityMaterialKeyAndID, Builder> implements DeviceProximitySecurityMaterialKeyAndIDOrBuilder {
            private Builder() {
                super(DeviceProximitySecurityMaterialKeyAndID.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((DeviceProximitySecurityMaterialKeyAndID) this.instance).clearId();
                return this;
            }

            public Builder clearIdRotationIntervalMs() {
                copyOnWrite();
                ((DeviceProximitySecurityMaterialKeyAndID) this.instance).clearIdRotationIntervalMs();
                return this;
            }

            public Builder clearKey() {
                copyOnWrite();
                ((DeviceProximitySecurityMaterialKeyAndID) this.instance).clearKey();
                return this;
            }

            public Builder clearSecret() {
                copyOnWrite();
                ((DeviceProximitySecurityMaterialKeyAndID) this.instance).clearSecret();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialKeyAndIDOrBuilder
            public String getId() {
                return ((DeviceProximitySecurityMaterialKeyAndID) this.instance).getId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialKeyAndIDOrBuilder
            public ByteString getIdBytes() {
                return ((DeviceProximitySecurityMaterialKeyAndID) this.instance).getIdBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialKeyAndIDOrBuilder
            public String getIdRotationIntervalMs() {
                return ((DeviceProximitySecurityMaterialKeyAndID) this.instance).getIdRotationIntervalMs();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialKeyAndIDOrBuilder
            public ByteString getIdRotationIntervalMsBytes() {
                return ((DeviceProximitySecurityMaterialKeyAndID) this.instance).getIdRotationIntervalMsBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialKeyAndIDOrBuilder
            public String getKey() {
                return ((DeviceProximitySecurityMaterialKeyAndID) this.instance).getKey();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialKeyAndIDOrBuilder
            public ByteString getKeyBytes() {
                return ((DeviceProximitySecurityMaterialKeyAndID) this.instance).getKeyBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialKeyAndIDOrBuilder
            public String getSecret() {
                return ((DeviceProximitySecurityMaterialKeyAndID) this.instance).getSecret();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximitySecurityMaterialKeyAndIDOrBuilder
            public ByteString getSecretBytes() {
                return ((DeviceProximitySecurityMaterialKeyAndID) this.instance).getSecretBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((DeviceProximitySecurityMaterialKeyAndID) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((DeviceProximitySecurityMaterialKeyAndID) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setIdRotationIntervalMs(String str) {
                copyOnWrite();
                ((DeviceProximitySecurityMaterialKeyAndID) this.instance).setIdRotationIntervalMs(str);
                return this;
            }

            public Builder setIdRotationIntervalMsBytes(ByteString byteString) {
                copyOnWrite();
                ((DeviceProximitySecurityMaterialKeyAndID) this.instance).setIdRotationIntervalMsBytes(byteString);
                return this;
            }

            public Builder setKey(String str) {
                copyOnWrite();
                ((DeviceProximitySecurityMaterialKeyAndID) this.instance).setKey(str);
                return this;
            }

            public Builder setKeyBytes(ByteString byteString) {
                copyOnWrite();
                ((DeviceProximitySecurityMaterialKeyAndID) this.instance).setKeyBytes(byteString);
                return this;
            }

            public Builder setSecret(String str) {
                copyOnWrite();
                ((DeviceProximitySecurityMaterialKeyAndID) this.instance).setSecret(str);
                return this;
            }

            public Builder setSecretBytes(ByteString byteString) {
                copyOnWrite();
                ((DeviceProximitySecurityMaterialKeyAndID) this.instance).setSecretBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(DeviceProximitySecurityMaterialKeyAndID deviceProximitySecurityMaterialKeyAndID) {
            return DEFAULT_INSTANCE.createBuilder(deviceProximitySecurityMaterialKeyAndID);
        }

        public static DeviceProximitySecurityMaterialKeyAndID parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceProximitySecurityMaterialKeyAndID) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DeviceProximitySecurityMaterialKeyAndID parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeviceProximitySecurityMaterialKeyAndID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DeviceProximitySecurityMaterialKeyAndID parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DeviceProximitySecurityMaterialKeyAndID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DeviceProximitySecurityMaterialKeyAndID parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeviceProximitySecurityMaterialKeyAndID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DeviceProximitySecurityMaterialKeyAndID parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DeviceProximitySecurityMaterialKeyAndID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeviceProximitySecurityMaterialKeyAndID parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeviceProximitySecurityMaterialKeyAndID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DeviceProximitySecurityMaterialKeyAndID parseFrom(InputStream inputStream) throws IOException {
            return (DeviceProximitySecurityMaterialKeyAndID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeviceProximitySecurityMaterialKeyAndID parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceProximitySecurityMaterialKeyAndID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DeviceProximitySecurityMaterialKeyAndID parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DeviceProximitySecurityMaterialKeyAndID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DeviceProximitySecurityMaterialKeyAndID parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceProximitySecurityMaterialKeyAndID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotifyDeviceProximityPolicyConfigurationRequest extends GeneratedMessageLite<NotifyDeviceProximityPolicyConfigurationRequest, Builder> implements NotifyDeviceProximityPolicyConfigurationRequestOrBuilder {
        private static final NotifyDeviceProximityPolicyConfigurationRequest DEFAULT_INSTANCE;
        private static volatile Parser<NotifyDeviceProximityPolicyConfigurationRequest> PARSER = null;
        public static final int ROLES_FIELD_NUMBER = 2;
        public static final int TECHNOLOGY_FIELD_NUMBER = 1;
        private static final Internal.ListAdapter.Converter<Integer, DeviceProximityPolicyRole> roles_converter_ = new Internal.ListAdapter.Converter<Integer, DeviceProximityPolicyRole>() { // from class: com.amazon.alexa.accessory.protocol.Deviceproximity.NotifyDeviceProximityPolicyConfigurationRequest.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public DeviceProximityPolicyRole convert(Integer num) {
                DeviceProximityPolicyRole forNumber = DeviceProximityPolicyRole.forNumber(num.intValue());
                return forNumber == null ? DeviceProximityPolicyRole.UNRECOGNIZED : forNumber;
            }
        };
        private int bitField0_;
        private int rolesMemoizedSerializedSize;
        private Internal.IntList roles_ = GeneratedMessageLite.emptyIntList();
        private int technology_;

        static {
            NotifyDeviceProximityPolicyConfigurationRequest notifyDeviceProximityPolicyConfigurationRequest = new NotifyDeviceProximityPolicyConfigurationRequest();
            DEFAULT_INSTANCE = notifyDeviceProximityPolicyConfigurationRequest;
            notifyDeviceProximityPolicyConfigurationRequest.makeImmutable();
        }

        private NotifyDeviceProximityPolicyConfigurationRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRoles(Iterable<? extends DeviceProximityPolicyRole> iterable) {
            ensureRolesIsMutable();
            Iterator<? extends DeviceProximityPolicyRole> it2 = iterable.iterator();
            while (it2.hasNext()) {
                this.roles_.addInt(it2.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRolesValue(Iterable<Integer> iterable) {
            ensureRolesIsMutable();
            Iterator<Integer> it2 = iterable.iterator();
            while (it2.hasNext()) {
                this.roles_.addInt(it2.next().intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRoles(DeviceProximityPolicyRole deviceProximityPolicyRole) {
            deviceProximityPolicyRole.getClass();
            ensureRolesIsMutable();
            this.roles_.addInt(deviceProximityPolicyRole.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRolesValue(int i) {
            ensureRolesIsMutable();
            this.roles_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoles() {
            this.roles_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTechnology() {
            this.technology_ = 0;
        }

        private void ensureRolesIsMutable() {
            if (this.roles_.isModifiable()) {
                return;
            }
            this.roles_ = GeneratedMessageLite.mutableCopy(this.roles_);
        }

        public static NotifyDeviceProximityPolicyConfigurationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyDeviceProximityPolicyConfigurationRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NotifyDeviceProximityPolicyConfigurationRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyDeviceProximityPolicyConfigurationRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NotifyDeviceProximityPolicyConfigurationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NotifyDeviceProximityPolicyConfigurationRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoles(int i, DeviceProximityPolicyRole deviceProximityPolicyRole) {
            deviceProximityPolicyRole.getClass();
            ensureRolesIsMutable();
            this.roles_.setInt(i, deviceProximityPolicyRole.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRolesValue(int i, int i2) {
            ensureRolesIsMutable();
            this.roles_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTechnology(WirelessTechnology wirelessTechnology) {
            wirelessTechnology.getClass();
            this.technology_ = wirelessTechnology.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTechnologyValue(int i) {
            this.technology_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NotifyDeviceProximityPolicyConfigurationRequest();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.roles_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    NotifyDeviceProximityPolicyConfigurationRequest notifyDeviceProximityPolicyConfigurationRequest = (NotifyDeviceProximityPolicyConfigurationRequest) obj2;
                    int i = this.technology_;
                    boolean z = i != 0;
                    int i2 = notifyDeviceProximityPolicyConfigurationRequest.technology_;
                    this.technology_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.roles_ = visitor.visitIntList(this.roles_, notifyDeviceProximityPolicyConfigurationRequest.roles_);
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                        this.bitField0_ |= notifyDeviceProximityPolicyConfigurationRequest.bitField0_;
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
                                    this.technology_ = codedInputStream.readEnum();
                                } else if (readTag == 16) {
                                    if (!this.roles_.isModifiable()) {
                                        this.roles_ = GeneratedMessageLite.mutableCopy(this.roles_);
                                    }
                                    this.roles_.addInt(codedInputStream.readEnum());
                                } else if (readTag == 18) {
                                    if (!this.roles_.isModifiable()) {
                                        this.roles_ = GeneratedMessageLite.mutableCopy(this.roles_);
                                    }
                                    int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.roles_.addInt(codedInputStream.readEnum());
                                    }
                                    codedInputStream.popLimit(pushLimit);
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
                        synchronized (NotifyDeviceProximityPolicyConfigurationRequest.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.NotifyDeviceProximityPolicyConfigurationRequestOrBuilder
        public DeviceProximityPolicyRole getRoles(int i) {
            return roles_converter_.convert(Integer.valueOf(this.roles_.getInt(i)));
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.NotifyDeviceProximityPolicyConfigurationRequestOrBuilder
        public int getRolesCount() {
            return this.roles_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.NotifyDeviceProximityPolicyConfigurationRequestOrBuilder
        public List<DeviceProximityPolicyRole> getRolesList() {
            return new Internal.ListAdapter(this.roles_, roles_converter_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.NotifyDeviceProximityPolicyConfigurationRequestOrBuilder
        public int getRolesValue(int i) {
            return this.roles_.getInt(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.NotifyDeviceProximityPolicyConfigurationRequestOrBuilder
        public List<Integer> getRolesValueList() {
            return this.roles_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.technology_ != WirelessTechnology.WIRELESS_TECHNOLOGY_UNSPECIFIED.getNumber() ? CodedOutputStream.computeEnumSize(1, this.technology_) : 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.roles_.size(); i3++) {
                i2 += CodedOutputStream.computeEnumSizeNoTag(this.roles_.getInt(i3));
            }
            int i4 = computeEnumSize + i2;
            if (!getRolesList().isEmpty()) {
                i4 = i4 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i2);
            }
            this.rolesMemoizedSerializedSize = i2;
            int serializedSize = this.unknownFields.getSerializedSize() + i4;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.NotifyDeviceProximityPolicyConfigurationRequestOrBuilder
        public WirelessTechnology getTechnology() {
            WirelessTechnology forNumber = WirelessTechnology.forNumber(this.technology_);
            return forNumber == null ? WirelessTechnology.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.NotifyDeviceProximityPolicyConfigurationRequestOrBuilder
        public int getTechnologyValue() {
            return this.technology_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if (this.technology_ != WirelessTechnology.WIRELESS_TECHNOLOGY_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(1, this.technology_);
            }
            if (getRolesList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(18);
                codedOutputStream.writeUInt32NoTag(this.rolesMemoizedSerializedSize);
            }
            for (int i = 0; i < this.roles_.size(); i++) {
                codedOutputStream.writeEnumNoTag(this.roles_.getInt(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NotifyDeviceProximityPolicyConfigurationRequest, Builder> implements NotifyDeviceProximityPolicyConfigurationRequestOrBuilder {
            private Builder() {
                super(NotifyDeviceProximityPolicyConfigurationRequest.DEFAULT_INSTANCE);
            }

            public Builder addAllRoles(Iterable<? extends DeviceProximityPolicyRole> iterable) {
                copyOnWrite();
                ((NotifyDeviceProximityPolicyConfigurationRequest) this.instance).addAllRoles(iterable);
                return this;
            }

            public Builder addAllRolesValue(Iterable<Integer> iterable) {
                copyOnWrite();
                ((NotifyDeviceProximityPolicyConfigurationRequest) this.instance).addAllRolesValue(iterable);
                return this;
            }

            public Builder addRoles(DeviceProximityPolicyRole deviceProximityPolicyRole) {
                copyOnWrite();
                ((NotifyDeviceProximityPolicyConfigurationRequest) this.instance).addRoles(deviceProximityPolicyRole);
                return this;
            }

            public Builder addRolesValue(int i) {
                ((NotifyDeviceProximityPolicyConfigurationRequest) this.instance).addRolesValue(i);
                return this;
            }

            public Builder clearRoles() {
                copyOnWrite();
                ((NotifyDeviceProximityPolicyConfigurationRequest) this.instance).clearRoles();
                return this;
            }

            public Builder clearTechnology() {
                copyOnWrite();
                ((NotifyDeviceProximityPolicyConfigurationRequest) this.instance).clearTechnology();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.NotifyDeviceProximityPolicyConfigurationRequestOrBuilder
            public DeviceProximityPolicyRole getRoles(int i) {
                return ((NotifyDeviceProximityPolicyConfigurationRequest) this.instance).getRoles(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.NotifyDeviceProximityPolicyConfigurationRequestOrBuilder
            public int getRolesCount() {
                return ((NotifyDeviceProximityPolicyConfigurationRequest) this.instance).getRolesCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.NotifyDeviceProximityPolicyConfigurationRequestOrBuilder
            public List<DeviceProximityPolicyRole> getRolesList() {
                return ((NotifyDeviceProximityPolicyConfigurationRequest) this.instance).getRolesList();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.NotifyDeviceProximityPolicyConfigurationRequestOrBuilder
            public int getRolesValue(int i) {
                return ((NotifyDeviceProximityPolicyConfigurationRequest) this.instance).getRolesValue(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.NotifyDeviceProximityPolicyConfigurationRequestOrBuilder
            public List<Integer> getRolesValueList() {
                return Collections.unmodifiableList(((NotifyDeviceProximityPolicyConfigurationRequest) this.instance).getRolesValueList());
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.NotifyDeviceProximityPolicyConfigurationRequestOrBuilder
            public WirelessTechnology getTechnology() {
                return ((NotifyDeviceProximityPolicyConfigurationRequest) this.instance).getTechnology();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.NotifyDeviceProximityPolicyConfigurationRequestOrBuilder
            public int getTechnologyValue() {
                return ((NotifyDeviceProximityPolicyConfigurationRequest) this.instance).getTechnologyValue();
            }

            public Builder setRoles(int i, DeviceProximityPolicyRole deviceProximityPolicyRole) {
                copyOnWrite();
                ((NotifyDeviceProximityPolicyConfigurationRequest) this.instance).setRoles(i, deviceProximityPolicyRole);
                return this;
            }

            public Builder setRolesValue(int i, int i2) {
                copyOnWrite();
                ((NotifyDeviceProximityPolicyConfigurationRequest) this.instance).setRolesValue(i, i2);
                return this;
            }

            public Builder setTechnology(WirelessTechnology wirelessTechnology) {
                copyOnWrite();
                ((NotifyDeviceProximityPolicyConfigurationRequest) this.instance).setTechnology(wirelessTechnology);
                return this;
            }

            public Builder setTechnologyValue(int i) {
                copyOnWrite();
                ((NotifyDeviceProximityPolicyConfigurationRequest) this.instance).setTechnologyValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(NotifyDeviceProximityPolicyConfigurationRequest notifyDeviceProximityPolicyConfigurationRequest) {
            return DEFAULT_INSTANCE.createBuilder(notifyDeviceProximityPolicyConfigurationRequest);
        }

        public static NotifyDeviceProximityPolicyConfigurationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyDeviceProximityPolicyConfigurationRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyDeviceProximityPolicyConfigurationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyDeviceProximityPolicyConfigurationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NotifyDeviceProximityPolicyConfigurationRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NotifyDeviceProximityPolicyConfigurationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NotifyDeviceProximityPolicyConfigurationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyDeviceProximityPolicyConfigurationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NotifyDeviceProximityPolicyConfigurationRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NotifyDeviceProximityPolicyConfigurationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotifyDeviceProximityPolicyConfigurationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyDeviceProximityPolicyConfigurationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NotifyDeviceProximityPolicyConfigurationRequest parseFrom(InputStream inputStream) throws IOException {
            return (NotifyDeviceProximityPolicyConfigurationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyDeviceProximityPolicyConfigurationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyDeviceProximityPolicyConfigurationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyDeviceProximityPolicyConfigurationRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NotifyDeviceProximityPolicyConfigurationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NotifyDeviceProximityPolicyConfigurationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyDeviceProximityPolicyConfigurationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotifyDeviceProximitySecurityMaterialRequest extends GeneratedMessageLite<NotifyDeviceProximitySecurityMaterialRequest, Builder> implements NotifyDeviceProximitySecurityMaterialRequestOrBuilder {
        private static final NotifyDeviceProximitySecurityMaterialRequest DEFAULT_INSTANCE;
        private static volatile Parser<NotifyDeviceProximitySecurityMaterialRequest> PARSER = null;
        public static final int TECHNOLOGY_FIELD_NUMBER = 1;
        private int technology_;

        static {
            NotifyDeviceProximitySecurityMaterialRequest notifyDeviceProximitySecurityMaterialRequest = new NotifyDeviceProximitySecurityMaterialRequest();
            DEFAULT_INSTANCE = notifyDeviceProximitySecurityMaterialRequest;
            notifyDeviceProximitySecurityMaterialRequest.makeImmutable();
        }

        private NotifyDeviceProximitySecurityMaterialRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTechnology() {
            this.technology_ = 0;
        }

        public static NotifyDeviceProximitySecurityMaterialRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyDeviceProximitySecurityMaterialRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NotifyDeviceProximitySecurityMaterialRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyDeviceProximitySecurityMaterialRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NotifyDeviceProximitySecurityMaterialRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NotifyDeviceProximitySecurityMaterialRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTechnology(WirelessTechnology wirelessTechnology) {
            wirelessTechnology.getClass();
            this.technology_ = wirelessTechnology.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTechnologyValue(int i) {
            this.technology_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NotifyDeviceProximitySecurityMaterialRequest();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    NotifyDeviceProximitySecurityMaterialRequest notifyDeviceProximitySecurityMaterialRequest = (NotifyDeviceProximitySecurityMaterialRequest) obj2;
                    int i = this.technology_;
                    boolean z = i != 0;
                    int i2 = notifyDeviceProximitySecurityMaterialRequest.technology_;
                    this.technology_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    this.technology_ = codedInputStream.readEnum();
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
                        synchronized (NotifyDeviceProximitySecurityMaterialRequest.class) {
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
            int serializedSize = this.unknownFields.getSerializedSize() + (this.technology_ != WirelessTechnology.WIRELESS_TECHNOLOGY_UNSPECIFIED.getNumber() ? CodedOutputStream.computeEnumSize(1, this.technology_) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.NotifyDeviceProximitySecurityMaterialRequestOrBuilder
        public WirelessTechnology getTechnology() {
            WirelessTechnology forNumber = WirelessTechnology.forNumber(this.technology_);
            return forNumber == null ? WirelessTechnology.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.NotifyDeviceProximitySecurityMaterialRequestOrBuilder
        public int getTechnologyValue() {
            return this.technology_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.technology_ != WirelessTechnology.WIRELESS_TECHNOLOGY_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(1, this.technology_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NotifyDeviceProximitySecurityMaterialRequest, Builder> implements NotifyDeviceProximitySecurityMaterialRequestOrBuilder {
            private Builder() {
                super(NotifyDeviceProximitySecurityMaterialRequest.DEFAULT_INSTANCE);
            }

            public Builder clearTechnology() {
                copyOnWrite();
                ((NotifyDeviceProximitySecurityMaterialRequest) this.instance).clearTechnology();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.NotifyDeviceProximitySecurityMaterialRequestOrBuilder
            public WirelessTechnology getTechnology() {
                return ((NotifyDeviceProximitySecurityMaterialRequest) this.instance).getTechnology();
            }

            @Override // com.amazon.alexa.accessory.protocol.Deviceproximity.NotifyDeviceProximitySecurityMaterialRequestOrBuilder
            public int getTechnologyValue() {
                return ((NotifyDeviceProximitySecurityMaterialRequest) this.instance).getTechnologyValue();
            }

            public Builder setTechnology(WirelessTechnology wirelessTechnology) {
                copyOnWrite();
                ((NotifyDeviceProximitySecurityMaterialRequest) this.instance).setTechnology(wirelessTechnology);
                return this;
            }

            public Builder setTechnologyValue(int i) {
                copyOnWrite();
                ((NotifyDeviceProximitySecurityMaterialRequest) this.instance).setTechnologyValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(NotifyDeviceProximitySecurityMaterialRequest notifyDeviceProximitySecurityMaterialRequest) {
            return DEFAULT_INSTANCE.createBuilder(notifyDeviceProximitySecurityMaterialRequest);
        }

        public static NotifyDeviceProximitySecurityMaterialRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyDeviceProximitySecurityMaterialRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyDeviceProximitySecurityMaterialRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyDeviceProximitySecurityMaterialRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NotifyDeviceProximitySecurityMaterialRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NotifyDeviceProximitySecurityMaterialRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NotifyDeviceProximitySecurityMaterialRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyDeviceProximitySecurityMaterialRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NotifyDeviceProximitySecurityMaterialRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NotifyDeviceProximitySecurityMaterialRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotifyDeviceProximitySecurityMaterialRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifyDeviceProximitySecurityMaterialRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NotifyDeviceProximitySecurityMaterialRequest parseFrom(InputStream inputStream) throws IOException {
            return (NotifyDeviceProximitySecurityMaterialRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyDeviceProximitySecurityMaterialRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyDeviceProximitySecurityMaterialRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifyDeviceProximitySecurityMaterialRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NotifyDeviceProximitySecurityMaterialRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NotifyDeviceProximitySecurityMaterialRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifyDeviceProximitySecurityMaterialRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum BroadcastingTriggerType implements Internal.EnumLite {
        BROADCASTING_TRIGGER_TYPE_UNSPECIFIED(0),
        BROADCASTING_TRIGGER_TYPE_BOOTUP(1),
        BROADCASTING_TRIGGER_TYPE_PERIODIC(2),
        BROADCASTING_TRIGGER_TYPE_ON_TAP(3),
        BROADCASTING_TRIGGER_TYPE_ON_WAKEWORD(4),
        BROADCASTING_TRIGGER_TYPE_ON_MOVEMENT_DETECTED(5),
        UNRECOGNIZED(-1);

        public static final int BROADCASTING_TRIGGER_TYPE_BOOTUP_VALUE = 1;
        public static final int BROADCASTING_TRIGGER_TYPE_ON_MOVEMENT_DETECTED_VALUE = 5;
        public static final int BROADCASTING_TRIGGER_TYPE_ON_TAP_VALUE = 3;
        public static final int BROADCASTING_TRIGGER_TYPE_ON_WAKEWORD_VALUE = 4;
        public static final int BROADCASTING_TRIGGER_TYPE_PERIODIC_VALUE = 2;
        public static final int BROADCASTING_TRIGGER_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<BroadcastingTriggerType> internalValueMap = new Internal.EnumLiteMap<BroadcastingTriggerType>() { // from class: com.amazon.alexa.accessory.protocol.Deviceproximity.BroadcastingTriggerType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public BroadcastingTriggerType findValueByNumber(int i) {
                return BroadcastingTriggerType.forNumber(i);
            }
        };
        private final int value;

        BroadcastingTriggerType(int i) {
            this.value = i;
        }

        public static BroadcastingTriggerType forNumber(int i) {
            if (i == 0) {
                return BROADCASTING_TRIGGER_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return BROADCASTING_TRIGGER_TYPE_BOOTUP;
            }
            if (i == 2) {
                return BROADCASTING_TRIGGER_TYPE_PERIODIC;
            }
            if (i == 3) {
                return BROADCASTING_TRIGGER_TYPE_ON_TAP;
            }
            if (i == 4) {
                return BROADCASTING_TRIGGER_TYPE_ON_WAKEWORD;
            }
            if (i != 5) {
                return null;
            }
            return BROADCASTING_TRIGGER_TYPE_ON_MOVEMENT_DETECTED;
        }

        public static Internal.EnumLiteMap<BroadcastingTriggerType> internalGetValueMap() {
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
        public static BroadcastingTriggerType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DeviceProximityPolicyRole implements Internal.EnumLite {
        DEVICE_PROXIMITY_POLICY_ROLE_UNSPECIFIED(0),
        DEVICE_PROXIMITY_POLICY_ROLE_BROADCASTER(1),
        DEVICE_PROXIMITY_POLICY_ROLE_OBSERVER(2),
        UNRECOGNIZED(-1);

        public static final int DEVICE_PROXIMITY_POLICY_ROLE_BROADCASTER_VALUE = 1;
        public static final int DEVICE_PROXIMITY_POLICY_ROLE_OBSERVER_VALUE = 2;
        public static final int DEVICE_PROXIMITY_POLICY_ROLE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<DeviceProximityPolicyRole> internalValueMap = new Internal.EnumLiteMap<DeviceProximityPolicyRole>() { // from class: com.amazon.alexa.accessory.protocol.Deviceproximity.DeviceProximityPolicyRole.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public DeviceProximityPolicyRole findValueByNumber(int i) {
                return DeviceProximityPolicyRole.forNumber(i);
            }
        };
        private final int value;

        DeviceProximityPolicyRole(int i) {
            this.value = i;
        }

        public static DeviceProximityPolicyRole forNumber(int i) {
            if (i == 0) {
                return DEVICE_PROXIMITY_POLICY_ROLE_UNSPECIFIED;
            }
            if (i == 1) {
                return DEVICE_PROXIMITY_POLICY_ROLE_BROADCASTER;
            }
            if (i != 2) {
                return null;
            }
            return DEVICE_PROXIMITY_POLICY_ROLE_OBSERVER;
        }

        public static Internal.EnumLiteMap<DeviceProximityPolicyRole> internalGetValueMap() {
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
        public static DeviceProximityPolicyRole valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum WirelessTechnology implements Internal.EnumLite {
        WIRELESS_TECHNOLOGY_UNSPECIFIED(0),
        WIRELESS_TECHNOLOGY_BLUETOOTH(1),
        WIRELESS_TECHNOLOGY_WIFI(2),
        WIRELESS_TECHNOLOGY_UWB(3),
        UNRECOGNIZED(-1);

        public static final int WIRELESS_TECHNOLOGY_BLUETOOTH_VALUE = 1;
        public static final int WIRELESS_TECHNOLOGY_UNSPECIFIED_VALUE = 0;
        public static final int WIRELESS_TECHNOLOGY_UWB_VALUE = 3;
        public static final int WIRELESS_TECHNOLOGY_WIFI_VALUE = 2;
        private static final Internal.EnumLiteMap<WirelessTechnology> internalValueMap = new Internal.EnumLiteMap<WirelessTechnology>() { // from class: com.amazon.alexa.accessory.protocol.Deviceproximity.WirelessTechnology.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public WirelessTechnology findValueByNumber(int i) {
                return WirelessTechnology.forNumber(i);
            }
        };
        private final int value;

        WirelessTechnology(int i) {
            this.value = i;
        }

        public static WirelessTechnology forNumber(int i) {
            if (i == 0) {
                return WIRELESS_TECHNOLOGY_UNSPECIFIED;
            }
            if (i == 1) {
                return WIRELESS_TECHNOLOGY_BLUETOOTH;
            }
            if (i == 2) {
                return WIRELESS_TECHNOLOGY_WIFI;
            }
            if (i != 3) {
                return null;
            }
            return WIRELESS_TECHNOLOGY_UWB;
        }

        public static Internal.EnumLiteMap<WirelessTechnology> internalGetValueMap() {
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
        public static WirelessTechnology valueOf(int i) {
            return forNumber(i);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
