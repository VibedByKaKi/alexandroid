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
import java.util.List;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class Cloudpairing {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.Cloudpairing$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$Cloudpairing$Capability$CapabilityTypesCase;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$Cloudpairing$CloudPairingKeys$KeysCase;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$Cloudpairing$Seed$SeedTypesCase;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[CloudPairingKeys.KeysCase.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$Cloudpairing$CloudPairingKeys$KeysCase = iArr;
            try {
                iArr[CloudPairingKeys.KeysCase.BLUETOOTH_KEYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Cloudpairing$CloudPairingKeys$KeysCase[CloudPairingKeys.KeysCase.KEYS_NOT_SET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Seed.SeedTypesCase.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$Cloudpairing$Seed$SeedTypesCase = iArr2;
            try {
                iArr2[Seed.SeedTypesCase.BLUETOOTH_SEED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Cloudpairing$Seed$SeedTypesCase[Seed.SeedTypesCase.SEEDTYPES_NOT_SET.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr3;
            try {
                iArr3[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr4 = new int[Capability.CapabilityTypesCase.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$Cloudpairing$Capability$CapabilityTypesCase = iArr4;
            try {
                iArr4[Capability.CapabilityTypesCase.BLUETOOTH_SERVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Cloudpairing$Capability$CapabilityTypesCase[Capability.CapabilityTypesCase.BLUETOOTH_TRANSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Cloudpairing$Capability$CapabilityTypesCase[Capability.CapabilityTypesCase.ACCESSORY_FEATURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Cloudpairing$Capability$CapabilityTypesCase[Capability.CapabilityTypesCase.ACCESSORY_CATEGORY.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Cloudpairing$Capability$CapabilityTypesCase[Capability.CapabilityTypesCase.CAPABILITYTYPES_NOT_SET.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface BluetoothKeysOrBuilder extends MessageLiteOrBuilder {
        Seed getSeed();

        ByteString getSymmetricKey();

        boolean hasSeed();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CapabilityOrBuilder extends MessageLiteOrBuilder {
        Capability.AccessoryCategory getAccessoryCategory();

        int getAccessoryCategoryValue();

        Capability.AccessoryFeature getAccessoryFeature();

        int getAccessoryFeatureValue();

        Capability.BluetoothService getBluetoothService();

        int getBluetoothServiceValue();

        Capability.BluetoothTransport getBluetoothTransport();

        int getBluetoothTransportValue();

        Capability.CapabilityTypesCase getCapabilityTypesCase();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CloudPairingAttributesOrBuilder extends MessageLiteOrBuilder {
        Capability getCapabilities(int i);

        int getCapabilitiesCount();

        List<Capability> getCapabilitiesList();

        ByteString getIdentifier();

        int getVersion();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CloudPairingKeysOrBuilder extends MessageLiteOrBuilder {
        BluetoothKeys getBluetoothKeys();

        CloudPairingKeys.KeysCase getKeysCase();

        boolean hasBluetoothKeys();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CloudPairingMsgOrBuilder extends MessageLiteOrBuilder {
        ByteString getMsg();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CloudPairingStatusOrBuilder extends MessageLiteOrBuilder {
        boolean getPairingStatus();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetCloudPairingAttributesOrBuilder extends MessageLiteOrBuilder {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetCloudPairingStatusOrBuilder extends MessageLiteOrBuilder {
        Seed getSeed();

        boolean hasSeed();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface RemoveCloudPairingKeysOrBuilder extends MessageLiteOrBuilder {
        Seed getSeed();

        boolean hasSeed();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ReplaceCloudPairingKeysOrBuilder extends MessageLiteOrBuilder {
        Seed getCurrentSeed();

        CloudPairingKeys getNewKeys();

        boolean hasCurrentSeed();

        boolean hasNewKeys();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SeedOrBuilder extends MessageLiteOrBuilder {
        ByteString getBluetoothSeed();

        Seed.SeedTypesCase getSeedTypesCase();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SetCloudPairingKeysOrBuilder extends MessageLiteOrBuilder {
        CloudPairingKeys getKeys();

        boolean hasKeys();
    }

    private Cloudpairing() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class BluetoothKeys extends GeneratedMessageLite<BluetoothKeys, Builder> implements BluetoothKeysOrBuilder {
        private static final BluetoothKeys DEFAULT_INSTANCE;
        private static volatile Parser<BluetoothKeys> PARSER = null;
        public static final int SEED_FIELD_NUMBER = 1;
        public static final int SYMMETRIC_KEY_FIELD_NUMBER = 2;
        private Seed seed_;
        private ByteString symmetricKey_ = ByteString.EMPTY;

        static {
            BluetoothKeys bluetoothKeys = new BluetoothKeys();
            DEFAULT_INSTANCE = bluetoothKeys;
            bluetoothKeys.makeImmutable();
        }

        private BluetoothKeys() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSeed() {
            this.seed_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSymmetricKey() {
            this.symmetricKey_ = getDefaultInstance().getSymmetricKey();
        }

        public static BluetoothKeys getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSeed(Seed seed) {
            Seed seed2 = this.seed_;
            if (seed2 == null || seed2 == Seed.getDefaultInstance()) {
                this.seed_ = seed;
            } else {
                this.seed_ = Seed.newBuilder(this.seed_).mergeFrom((Seed.Builder) seed).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BluetoothKeys parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BluetoothKeys) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BluetoothKeys parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BluetoothKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<BluetoothKeys> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeed(Seed.Builder builder) {
            this.seed_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSymmetricKey(ByteString byteString) {
            byteString.getClass();
            this.symmetricKey_ = byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new BluetoothKeys();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    BluetoothKeys bluetoothKeys = (BluetoothKeys) obj2;
                    this.seed_ = (Seed) visitor.visitMessage(this.seed_, bluetoothKeys.seed_);
                    ByteString byteString = this.symmetricKey_;
                    ByteString byteString2 = ByteString.EMPTY;
                    boolean z = byteString != byteString2;
                    ByteString byteString3 = bluetoothKeys.symmetricKey_;
                    this.symmetricKey_ = visitor.visitByteString(z, byteString, byteString3 != byteString2, byteString3);
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
                                    Seed seed = this.seed_;
                                    Seed.Builder builder = seed != null ? seed.toBuilder() : null;
                                    Seed seed2 = (Seed) codedInputStream.readMessage(Seed.parser(), extensionRegistryLite);
                                    this.seed_ = seed2;
                                    if (builder != null) {
                                        builder.mergeFrom((Seed.Builder) seed2);
                                        this.seed_ = builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    this.symmetricKey_ = codedInputStream.readBytes();
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
                        synchronized (BluetoothKeys.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.BluetoothKeysOrBuilder
        public Seed getSeed() {
            Seed seed = this.seed_;
            return seed == null ? Seed.getDefaultInstance() : seed;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.seed_ != null ? CodedOutputStream.computeMessageSize(1, getSeed()) : 0;
            if (!this.symmetricKey_.isEmpty()) {
                computeMessageSize += CodedOutputStream.computeBytesSize(2, this.symmetricKey_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.BluetoothKeysOrBuilder
        public ByteString getSymmetricKey() {
            return this.symmetricKey_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.BluetoothKeysOrBuilder
        public boolean hasSeed() {
            return this.seed_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.seed_ != null) {
                codedOutputStream.writeMessage(1, getSeed());
            }
            if (!this.symmetricKey_.isEmpty()) {
                codedOutputStream.writeBytes(2, this.symmetricKey_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<BluetoothKeys, Builder> implements BluetoothKeysOrBuilder {
            private Builder() {
                super(BluetoothKeys.DEFAULT_INSTANCE);
            }

            public Builder clearSeed() {
                copyOnWrite();
                ((BluetoothKeys) this.instance).clearSeed();
                return this;
            }

            public Builder clearSymmetricKey() {
                copyOnWrite();
                ((BluetoothKeys) this.instance).clearSymmetricKey();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.BluetoothKeysOrBuilder
            public Seed getSeed() {
                return ((BluetoothKeys) this.instance).getSeed();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.BluetoothKeysOrBuilder
            public ByteString getSymmetricKey() {
                return ((BluetoothKeys) this.instance).getSymmetricKey();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.BluetoothKeysOrBuilder
            public boolean hasSeed() {
                return ((BluetoothKeys) this.instance).hasSeed();
            }

            public Builder mergeSeed(Seed seed) {
                copyOnWrite();
                ((BluetoothKeys) this.instance).mergeSeed(seed);
                return this;
            }

            public Builder setSeed(Seed seed) {
                copyOnWrite();
                ((BluetoothKeys) this.instance).setSeed(seed);
                return this;
            }

            public Builder setSymmetricKey(ByteString byteString) {
                copyOnWrite();
                ((BluetoothKeys) this.instance).setSymmetricKey(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setSeed(Seed.Builder builder) {
                copyOnWrite();
                ((BluetoothKeys) this.instance).setSeed(builder);
                return this;
            }
        }

        public static Builder newBuilder(BluetoothKeys bluetoothKeys) {
            return DEFAULT_INSTANCE.createBuilder(bluetoothKeys);
        }

        public static BluetoothKeys parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BluetoothKeys) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BluetoothKeys parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BluetoothKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeed(Seed seed) {
            seed.getClass();
            this.seed_ = seed;
        }

        public static BluetoothKeys parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BluetoothKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BluetoothKeys parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BluetoothKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BluetoothKeys parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BluetoothKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BluetoothKeys parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BluetoothKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BluetoothKeys parseFrom(InputStream inputStream) throws IOException {
            return (BluetoothKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BluetoothKeys parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BluetoothKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BluetoothKeys parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BluetoothKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BluetoothKeys parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BluetoothKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CloudPairingAttributes extends GeneratedMessageLite<CloudPairingAttributes, Builder> implements CloudPairingAttributesOrBuilder {
        public static final int CAPABILITIES_FIELD_NUMBER = 3;
        private static final CloudPairingAttributes DEFAULT_INSTANCE;
        public static final int IDENTIFIER_FIELD_NUMBER = 2;
        private static volatile Parser<CloudPairingAttributes> PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 1;
        private int bitField0_;
        private int version_;
        private ByteString identifier_ = ByteString.EMPTY;
        private Internal.ProtobufList<Capability> capabilities_ = GeneratedMessageLite.emptyProtobufList();

        static {
            CloudPairingAttributes cloudPairingAttributes = new CloudPairingAttributes();
            DEFAULT_INSTANCE = cloudPairingAttributes;
            cloudPairingAttributes.makeImmutable();
        }

        private CloudPairingAttributes() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCapabilities(Iterable<? extends Capability> iterable) {
            ensureCapabilitiesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.capabilities_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCapabilities(Capability.Builder builder) {
            ensureCapabilitiesIsMutable();
            this.capabilities_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCapabilities() {
            this.capabilities_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdentifier() {
            this.identifier_ = getDefaultInstance().getIdentifier();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0;
        }

        private void ensureCapabilitiesIsMutable() {
            if (this.capabilities_.isModifiable()) {
                return;
            }
            this.capabilities_ = GeneratedMessageLite.mutableCopy(this.capabilities_);
        }

        public static CloudPairingAttributes getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CloudPairingAttributes parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CloudPairingAttributes) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CloudPairingAttributes parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CloudPairingAttributes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CloudPairingAttributes> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCapabilities(int i) {
            ensureCapabilitiesIsMutable();
            this.capabilities_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCapabilities(int i, Capability.Builder builder) {
            ensureCapabilitiesIsMutable();
            this.capabilities_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentifier(ByteString byteString) {
            byteString.getClass();
            this.identifier_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(int i) {
            this.version_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CloudPairingAttributes();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.capabilities_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    CloudPairingAttributes cloudPairingAttributes = (CloudPairingAttributes) obj2;
                    int i = this.version_;
                    boolean z = i != 0;
                    int i2 = cloudPairingAttributes.version_;
                    this.version_ = visitor.visitInt(z, i, i2 != 0, i2);
                    ByteString byteString = this.identifier_;
                    ByteString byteString2 = ByteString.EMPTY;
                    boolean z2 = byteString != byteString2;
                    ByteString byteString3 = cloudPairingAttributes.identifier_;
                    this.identifier_ = visitor.visitByteString(z2, byteString, byteString3 != byteString2, byteString3);
                    this.capabilities_ = visitor.visitList(this.capabilities_, cloudPairingAttributes.capabilities_);
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                        this.bitField0_ |= cloudPairingAttributes.bitField0_;
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
                                    this.version_ = codedInputStream.readUInt32();
                                } else if (readTag == 18) {
                                    this.identifier_ = codedInputStream.readBytes();
                                } else if (readTag == 26) {
                                    if (!this.capabilities_.isModifiable()) {
                                        this.capabilities_ = GeneratedMessageLite.mutableCopy(this.capabilities_);
                                    }
                                    this.capabilities_.add((Capability) codedInputStream.readMessage(Capability.parser(), extensionRegistryLite));
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
                        synchronized (CloudPairingAttributes.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CloudPairingAttributesOrBuilder
        public Capability getCapabilities(int i) {
            return this.capabilities_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CloudPairingAttributesOrBuilder
        public int getCapabilitiesCount() {
            return this.capabilities_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CloudPairingAttributesOrBuilder
        public List<Capability> getCapabilitiesList() {
            return this.capabilities_;
        }

        public CapabilityOrBuilder getCapabilitiesOrBuilder(int i) {
            return this.capabilities_.get(i);
        }

        public List<? extends CapabilityOrBuilder> getCapabilitiesOrBuilderList() {
            return this.capabilities_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CloudPairingAttributesOrBuilder
        public ByteString getIdentifier() {
            return this.identifier_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.version_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            if (!this.identifier_.isEmpty()) {
                computeUInt32Size += CodedOutputStream.computeBytesSize(2, this.identifier_);
            }
            for (int i3 = 0; i3 < this.capabilities_.size(); i3++) {
                computeUInt32Size += CodedOutputStream.computeMessageSize(3, this.capabilities_.get(i3));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CloudPairingAttributesOrBuilder
        public int getVersion() {
            return this.version_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.version_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            if (!this.identifier_.isEmpty()) {
                codedOutputStream.writeBytes(2, this.identifier_);
            }
            for (int i2 = 0; i2 < this.capabilities_.size(); i2++) {
                codedOutputStream.writeMessage(3, this.capabilities_.get(i2));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<CloudPairingAttributes, Builder> implements CloudPairingAttributesOrBuilder {
            private Builder() {
                super(CloudPairingAttributes.DEFAULT_INSTANCE);
            }

            public Builder addAllCapabilities(Iterable<? extends Capability> iterable) {
                copyOnWrite();
                ((CloudPairingAttributes) this.instance).addAllCapabilities(iterable);
                return this;
            }

            public Builder addCapabilities(Capability capability) {
                copyOnWrite();
                ((CloudPairingAttributes) this.instance).addCapabilities(capability);
                return this;
            }

            public Builder clearCapabilities() {
                copyOnWrite();
                ((CloudPairingAttributes) this.instance).clearCapabilities();
                return this;
            }

            public Builder clearIdentifier() {
                copyOnWrite();
                ((CloudPairingAttributes) this.instance).clearIdentifier();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((CloudPairingAttributes) this.instance).clearVersion();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CloudPairingAttributesOrBuilder
            public Capability getCapabilities(int i) {
                return ((CloudPairingAttributes) this.instance).getCapabilities(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CloudPairingAttributesOrBuilder
            public int getCapabilitiesCount() {
                return ((CloudPairingAttributes) this.instance).getCapabilitiesCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CloudPairingAttributesOrBuilder
            public List<Capability> getCapabilitiesList() {
                return Collections.unmodifiableList(((CloudPairingAttributes) this.instance).getCapabilitiesList());
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CloudPairingAttributesOrBuilder
            public ByteString getIdentifier() {
                return ((CloudPairingAttributes) this.instance).getIdentifier();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CloudPairingAttributesOrBuilder
            public int getVersion() {
                return ((CloudPairingAttributes) this.instance).getVersion();
            }

            public Builder removeCapabilities(int i) {
                copyOnWrite();
                ((CloudPairingAttributes) this.instance).removeCapabilities(i);
                return this;
            }

            public Builder setCapabilities(int i, Capability capability) {
                copyOnWrite();
                ((CloudPairingAttributes) this.instance).setCapabilities(i, capability);
                return this;
            }

            public Builder setIdentifier(ByteString byteString) {
                copyOnWrite();
                ((CloudPairingAttributes) this.instance).setIdentifier(byteString);
                return this;
            }

            public Builder setVersion(int i) {
                copyOnWrite();
                ((CloudPairingAttributes) this.instance).setVersion(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addCapabilities(int i, Capability capability) {
                copyOnWrite();
                ((CloudPairingAttributes) this.instance).addCapabilities(i, capability);
                return this;
            }

            public Builder setCapabilities(int i, Capability.Builder builder) {
                copyOnWrite();
                ((CloudPairingAttributes) this.instance).setCapabilities(i, builder);
                return this;
            }

            public Builder addCapabilities(Capability.Builder builder) {
                copyOnWrite();
                ((CloudPairingAttributes) this.instance).addCapabilities(builder);
                return this;
            }

            public Builder addCapabilities(int i, Capability.Builder builder) {
                copyOnWrite();
                ((CloudPairingAttributes) this.instance).addCapabilities(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(CloudPairingAttributes cloudPairingAttributes) {
            return DEFAULT_INSTANCE.createBuilder(cloudPairingAttributes);
        }

        public static CloudPairingAttributes parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CloudPairingAttributes) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CloudPairingAttributes parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CloudPairingAttributes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CloudPairingAttributes parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CloudPairingAttributes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CloudPairingAttributes parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CloudPairingAttributes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CloudPairingAttributes parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CloudPairingAttributes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CloudPairingAttributes parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CloudPairingAttributes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CloudPairingAttributes parseFrom(InputStream inputStream) throws IOException {
            return (CloudPairingAttributes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCapabilities(int i, Capability capability) {
            capability.getClass();
            ensureCapabilitiesIsMutable();
            this.capabilities_.add(i, capability);
        }

        public static CloudPairingAttributes parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CloudPairingAttributes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCapabilities(int i, Capability capability) {
            capability.getClass();
            ensureCapabilitiesIsMutable();
            this.capabilities_.set(i, capability);
        }

        public static CloudPairingAttributes parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CloudPairingAttributes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CloudPairingAttributes parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CloudPairingAttributes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCapabilities(Capability capability) {
            capability.getClass();
            ensureCapabilitiesIsMutable();
            this.capabilities_.add(capability);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCapabilities(int i, Capability.Builder builder) {
            ensureCapabilitiesIsMutable();
            this.capabilities_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CloudPairingKeys extends GeneratedMessageLite<CloudPairingKeys, Builder> implements CloudPairingKeysOrBuilder {
        public static final int BLUETOOTH_KEYS_FIELD_NUMBER = 1;
        private static final CloudPairingKeys DEFAULT_INSTANCE;
        private static volatile Parser<CloudPairingKeys> PARSER;
        private int keysCase_ = 0;
        private Object keys_;

        static {
            CloudPairingKeys cloudPairingKeys = new CloudPairingKeys();
            DEFAULT_INSTANCE = cloudPairingKeys;
            cloudPairingKeys.makeImmutable();
        }

        private CloudPairingKeys() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBluetoothKeys() {
            if (this.keysCase_ == 1) {
                this.keysCase_ = 0;
                this.keys_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeys() {
            this.keysCase_ = 0;
            this.keys_ = null;
        }

        public static CloudPairingKeys getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBluetoothKeys(BluetoothKeys bluetoothKeys) {
            if (this.keysCase_ != 1 || this.keys_ == BluetoothKeys.getDefaultInstance()) {
                this.keys_ = bluetoothKeys;
            } else {
                this.keys_ = BluetoothKeys.newBuilder((BluetoothKeys) this.keys_).mergeFrom((BluetoothKeys.Builder) bluetoothKeys).buildPartial();
            }
            this.keysCase_ = 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CloudPairingKeys parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CloudPairingKeys) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CloudPairingKeys parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CloudPairingKeys> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBluetoothKeys(BluetoothKeys.Builder builder) {
            this.keys_ = builder.build();
            this.keysCase_ = 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CloudPairingKeys();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    CloudPairingKeys cloudPairingKeys = (CloudPairingKeys) obj2;
                    int i2 = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Cloudpairing$CloudPairingKeys$KeysCase[cloudPairingKeys.getKeysCase().ordinal()];
                    if (i2 == 1) {
                        this.keys_ = visitor.visitOneofMessage(this.keysCase_ == 1, this.keys_, cloudPairingKeys.keys_);
                    } else if (i2 == 2) {
                        visitor.visitOneofNotSet(this.keysCase_ != 0);
                    }
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE && (i = cloudPairingKeys.keysCase_) != 0) {
                        this.keysCase_ = i;
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
                                    BluetoothKeys.Builder builder = this.keysCase_ == 1 ? ((BluetoothKeys) this.keys_).toBuilder() : null;
                                    MessageLite readMessage = codedInputStream.readMessage(BluetoothKeys.parser(), extensionRegistryLite);
                                    this.keys_ = readMessage;
                                    if (builder != null) {
                                        builder.mergeFrom((BluetoothKeys.Builder) readMessage);
                                        this.keys_ = builder.buildPartial();
                                    }
                                    this.keysCase_ = 1;
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
                        synchronized (CloudPairingKeys.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CloudPairingKeysOrBuilder
        public BluetoothKeys getBluetoothKeys() {
            return this.keysCase_ == 1 ? (BluetoothKeys) this.keys_ : BluetoothKeys.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CloudPairingKeysOrBuilder
        public KeysCase getKeysCase() {
            return KeysCase.forNumber(this.keysCase_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.keysCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (BluetoothKeys) this.keys_) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CloudPairingKeysOrBuilder
        public boolean hasBluetoothKeys() {
            return this.keysCase_ == 1;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.keysCase_ == 1) {
                codedOutputStream.writeMessage(1, (BluetoothKeys) this.keys_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<CloudPairingKeys, Builder> implements CloudPairingKeysOrBuilder {
            private Builder() {
                super(CloudPairingKeys.DEFAULT_INSTANCE);
            }

            public Builder clearBluetoothKeys() {
                copyOnWrite();
                ((CloudPairingKeys) this.instance).clearBluetoothKeys();
                return this;
            }

            public Builder clearKeys() {
                copyOnWrite();
                ((CloudPairingKeys) this.instance).clearKeys();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CloudPairingKeysOrBuilder
            public BluetoothKeys getBluetoothKeys() {
                return ((CloudPairingKeys) this.instance).getBluetoothKeys();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CloudPairingKeysOrBuilder
            public KeysCase getKeysCase() {
                return ((CloudPairingKeys) this.instance).getKeysCase();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CloudPairingKeysOrBuilder
            public boolean hasBluetoothKeys() {
                return ((CloudPairingKeys) this.instance).hasBluetoothKeys();
            }

            public Builder mergeBluetoothKeys(BluetoothKeys bluetoothKeys) {
                copyOnWrite();
                ((CloudPairingKeys) this.instance).mergeBluetoothKeys(bluetoothKeys);
                return this;
            }

            public Builder setBluetoothKeys(BluetoothKeys bluetoothKeys) {
                copyOnWrite();
                ((CloudPairingKeys) this.instance).setBluetoothKeys(bluetoothKeys);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setBluetoothKeys(BluetoothKeys.Builder builder) {
                copyOnWrite();
                ((CloudPairingKeys) this.instance).setBluetoothKeys(builder);
                return this;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum KeysCase implements Internal.EnumLite {
            BLUETOOTH_KEYS(1),
            KEYS_NOT_SET(0);

            private final int value;

            KeysCase(int i) {
                this.value = i;
            }

            public static KeysCase forNumber(int i) {
                if (i == 0) {
                    return KEYS_NOT_SET;
                }
                if (i != 1) {
                    return null;
                }
                return BLUETOOTH_KEYS;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static KeysCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(CloudPairingKeys cloudPairingKeys) {
            return DEFAULT_INSTANCE.createBuilder(cloudPairingKeys);
        }

        public static CloudPairingKeys parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CloudPairingKeys) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CloudPairingKeys parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CloudPairingKeys parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBluetoothKeys(BluetoothKeys bluetoothKeys) {
            bluetoothKeys.getClass();
            this.keys_ = bluetoothKeys;
            this.keysCase_ = 1;
        }

        public static CloudPairingKeys parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CloudPairingKeys parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CloudPairingKeys parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CloudPairingKeys parseFrom(InputStream inputStream) throws IOException {
            return (CloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CloudPairingKeys parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CloudPairingKeys parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CloudPairingKeys parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetCloudPairingStatus extends GeneratedMessageLite<GetCloudPairingStatus, Builder> implements GetCloudPairingStatusOrBuilder {
        private static final GetCloudPairingStatus DEFAULT_INSTANCE;
        private static volatile Parser<GetCloudPairingStatus> PARSER = null;
        public static final int SEED_FIELD_NUMBER = 1;
        private Seed seed_;

        static {
            GetCloudPairingStatus getCloudPairingStatus = new GetCloudPairingStatus();
            DEFAULT_INSTANCE = getCloudPairingStatus;
            getCloudPairingStatus.makeImmutable();
        }

        private GetCloudPairingStatus() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSeed() {
            this.seed_ = null;
        }

        public static GetCloudPairingStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSeed(Seed seed) {
            Seed seed2 = this.seed_;
            if (seed2 == null || seed2 == Seed.getDefaultInstance()) {
                this.seed_ = seed;
            } else {
                this.seed_ = Seed.newBuilder(this.seed_).mergeFrom((Seed.Builder) seed).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetCloudPairingStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetCloudPairingStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetCloudPairingStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetCloudPairingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetCloudPairingStatus> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeed(Seed.Builder builder) {
            this.seed_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetCloudPairingStatus();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.seed_ = (Seed) ((GeneratedMessageLite.Visitor) obj).visitMessage(this.seed_, ((GetCloudPairingStatus) obj2).seed_);
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
                                    Seed seed = this.seed_;
                                    Seed.Builder builder = seed != null ? seed.toBuilder() : null;
                                    Seed seed2 = (Seed) codedInputStream.readMessage(Seed.parser(), extensionRegistryLite);
                                    this.seed_ = seed2;
                                    if (builder != null) {
                                        builder.mergeFrom((Seed.Builder) seed2);
                                        this.seed_ = builder.buildPartial();
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
                        synchronized (GetCloudPairingStatus.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.GetCloudPairingStatusOrBuilder
        public Seed getSeed() {
            Seed seed = this.seed_;
            return seed == null ? Seed.getDefaultInstance() : seed;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.seed_ != null ? CodedOutputStream.computeMessageSize(1, getSeed()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.GetCloudPairingStatusOrBuilder
        public boolean hasSeed() {
            return this.seed_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.seed_ != null) {
                codedOutputStream.writeMessage(1, getSeed());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<GetCloudPairingStatus, Builder> implements GetCloudPairingStatusOrBuilder {
            private Builder() {
                super(GetCloudPairingStatus.DEFAULT_INSTANCE);
            }

            public Builder clearSeed() {
                copyOnWrite();
                ((GetCloudPairingStatus) this.instance).clearSeed();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.GetCloudPairingStatusOrBuilder
            public Seed getSeed() {
                return ((GetCloudPairingStatus) this.instance).getSeed();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.GetCloudPairingStatusOrBuilder
            public boolean hasSeed() {
                return ((GetCloudPairingStatus) this.instance).hasSeed();
            }

            public Builder mergeSeed(Seed seed) {
                copyOnWrite();
                ((GetCloudPairingStatus) this.instance).mergeSeed(seed);
                return this;
            }

            public Builder setSeed(Seed seed) {
                copyOnWrite();
                ((GetCloudPairingStatus) this.instance).setSeed(seed);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setSeed(Seed.Builder builder) {
                copyOnWrite();
                ((GetCloudPairingStatus) this.instance).setSeed(builder);
                return this;
            }
        }

        public static Builder newBuilder(GetCloudPairingStatus getCloudPairingStatus) {
            return DEFAULT_INSTANCE.createBuilder(getCloudPairingStatus);
        }

        public static GetCloudPairingStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCloudPairingStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetCloudPairingStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCloudPairingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeed(Seed seed) {
            seed.getClass();
            this.seed_ = seed;
        }

        public static GetCloudPairingStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetCloudPairingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetCloudPairingStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCloudPairingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetCloudPairingStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetCloudPairingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetCloudPairingStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCloudPairingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetCloudPairingStatus parseFrom(InputStream inputStream) throws IOException {
            return (GetCloudPairingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetCloudPairingStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCloudPairingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetCloudPairingStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetCloudPairingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetCloudPairingStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCloudPairingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class RemoveCloudPairingKeys extends GeneratedMessageLite<RemoveCloudPairingKeys, Builder> implements RemoveCloudPairingKeysOrBuilder {
        private static final RemoveCloudPairingKeys DEFAULT_INSTANCE;
        private static volatile Parser<RemoveCloudPairingKeys> PARSER = null;
        public static final int SEED_FIELD_NUMBER = 1;
        private Seed seed_;

        static {
            RemoveCloudPairingKeys removeCloudPairingKeys = new RemoveCloudPairingKeys();
            DEFAULT_INSTANCE = removeCloudPairingKeys;
            removeCloudPairingKeys.makeImmutable();
        }

        private RemoveCloudPairingKeys() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSeed() {
            this.seed_ = null;
        }

        public static RemoveCloudPairingKeys getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSeed(Seed seed) {
            Seed seed2 = this.seed_;
            if (seed2 == null || seed2 == Seed.getDefaultInstance()) {
                this.seed_ = seed;
            } else {
                this.seed_ = Seed.newBuilder(this.seed_).mergeFrom((Seed.Builder) seed).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RemoveCloudPairingKeys parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RemoveCloudPairingKeys) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RemoveCloudPairingKeys parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RemoveCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RemoveCloudPairingKeys> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeed(Seed.Builder builder) {
            this.seed_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RemoveCloudPairingKeys();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.seed_ = (Seed) ((GeneratedMessageLite.Visitor) obj).visitMessage(this.seed_, ((RemoveCloudPairingKeys) obj2).seed_);
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
                                    Seed seed = this.seed_;
                                    Seed.Builder builder = seed != null ? seed.toBuilder() : null;
                                    Seed seed2 = (Seed) codedInputStream.readMessage(Seed.parser(), extensionRegistryLite);
                                    this.seed_ = seed2;
                                    if (builder != null) {
                                        builder.mergeFrom((Seed.Builder) seed2);
                                        this.seed_ = builder.buildPartial();
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
                        synchronized (RemoveCloudPairingKeys.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.RemoveCloudPairingKeysOrBuilder
        public Seed getSeed() {
            Seed seed = this.seed_;
            return seed == null ? Seed.getDefaultInstance() : seed;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.seed_ != null ? CodedOutputStream.computeMessageSize(1, getSeed()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.RemoveCloudPairingKeysOrBuilder
        public boolean hasSeed() {
            return this.seed_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.seed_ != null) {
                codedOutputStream.writeMessage(1, getSeed());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<RemoveCloudPairingKeys, Builder> implements RemoveCloudPairingKeysOrBuilder {
            private Builder() {
                super(RemoveCloudPairingKeys.DEFAULT_INSTANCE);
            }

            public Builder clearSeed() {
                copyOnWrite();
                ((RemoveCloudPairingKeys) this.instance).clearSeed();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.RemoveCloudPairingKeysOrBuilder
            public Seed getSeed() {
                return ((RemoveCloudPairingKeys) this.instance).getSeed();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.RemoveCloudPairingKeysOrBuilder
            public boolean hasSeed() {
                return ((RemoveCloudPairingKeys) this.instance).hasSeed();
            }

            public Builder mergeSeed(Seed seed) {
                copyOnWrite();
                ((RemoveCloudPairingKeys) this.instance).mergeSeed(seed);
                return this;
            }

            public Builder setSeed(Seed seed) {
                copyOnWrite();
                ((RemoveCloudPairingKeys) this.instance).setSeed(seed);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setSeed(Seed.Builder builder) {
                copyOnWrite();
                ((RemoveCloudPairingKeys) this.instance).setSeed(builder);
                return this;
            }
        }

        public static Builder newBuilder(RemoveCloudPairingKeys removeCloudPairingKeys) {
            return DEFAULT_INSTANCE.createBuilder(removeCloudPairingKeys);
        }

        public static RemoveCloudPairingKeys parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RemoveCloudPairingKeys) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RemoveCloudPairingKeys parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RemoveCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeed(Seed seed) {
            seed.getClass();
            this.seed_ = seed;
        }

        public static RemoveCloudPairingKeys parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RemoveCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RemoveCloudPairingKeys parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RemoveCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RemoveCloudPairingKeys parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RemoveCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RemoveCloudPairingKeys parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RemoveCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RemoveCloudPairingKeys parseFrom(InputStream inputStream) throws IOException {
            return (RemoveCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RemoveCloudPairingKeys parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RemoveCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RemoveCloudPairingKeys parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RemoveCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RemoveCloudPairingKeys parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RemoveCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ReplaceCloudPairingKeys extends GeneratedMessageLite<ReplaceCloudPairingKeys, Builder> implements ReplaceCloudPairingKeysOrBuilder {
        public static final int CURRENT_SEED_FIELD_NUMBER = 1;
        private static final ReplaceCloudPairingKeys DEFAULT_INSTANCE;
        public static final int NEW_KEYS_FIELD_NUMBER = 2;
        private static volatile Parser<ReplaceCloudPairingKeys> PARSER;
        private Seed currentSeed_;
        private CloudPairingKeys newKeys_;

        static {
            ReplaceCloudPairingKeys replaceCloudPairingKeys = new ReplaceCloudPairingKeys();
            DEFAULT_INSTANCE = replaceCloudPairingKeys;
            replaceCloudPairingKeys.makeImmutable();
        }

        private ReplaceCloudPairingKeys() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentSeed() {
            this.currentSeed_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNewKeys() {
            this.newKeys_ = null;
        }

        public static ReplaceCloudPairingKeys getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCurrentSeed(Seed seed) {
            Seed seed2 = this.currentSeed_;
            if (seed2 == null || seed2 == Seed.getDefaultInstance()) {
                this.currentSeed_ = seed;
            } else {
                this.currentSeed_ = Seed.newBuilder(this.currentSeed_).mergeFrom((Seed.Builder) seed).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNewKeys(CloudPairingKeys cloudPairingKeys) {
            CloudPairingKeys cloudPairingKeys2 = this.newKeys_;
            if (cloudPairingKeys2 == null || cloudPairingKeys2 == CloudPairingKeys.getDefaultInstance()) {
                this.newKeys_ = cloudPairingKeys;
            } else {
                this.newKeys_ = CloudPairingKeys.newBuilder(this.newKeys_).mergeFrom((CloudPairingKeys.Builder) cloudPairingKeys).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ReplaceCloudPairingKeys parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ReplaceCloudPairingKeys) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReplaceCloudPairingKeys parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ReplaceCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ReplaceCloudPairingKeys> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentSeed(Seed.Builder builder) {
            this.currentSeed_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNewKeys(CloudPairingKeys.Builder builder) {
            this.newKeys_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ReplaceCloudPairingKeys();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    ReplaceCloudPairingKeys replaceCloudPairingKeys = (ReplaceCloudPairingKeys) obj2;
                    this.currentSeed_ = (Seed) visitor.visitMessage(this.currentSeed_, replaceCloudPairingKeys.currentSeed_);
                    this.newKeys_ = (CloudPairingKeys) visitor.visitMessage(this.newKeys_, replaceCloudPairingKeys.newKeys_);
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
                                    Seed seed = this.currentSeed_;
                                    Seed.Builder builder = seed != null ? seed.toBuilder() : null;
                                    Seed seed2 = (Seed) codedInputStream.readMessage(Seed.parser(), extensionRegistryLite);
                                    this.currentSeed_ = seed2;
                                    if (builder != null) {
                                        builder.mergeFrom((Seed.Builder) seed2);
                                        this.currentSeed_ = builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    CloudPairingKeys cloudPairingKeys = this.newKeys_;
                                    CloudPairingKeys.Builder builder2 = cloudPairingKeys != null ? cloudPairingKeys.toBuilder() : null;
                                    CloudPairingKeys cloudPairingKeys2 = (CloudPairingKeys) codedInputStream.readMessage(CloudPairingKeys.parser(), extensionRegistryLite);
                                    this.newKeys_ = cloudPairingKeys2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((CloudPairingKeys.Builder) cloudPairingKeys2);
                                        this.newKeys_ = builder2.buildPartial();
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
                        synchronized (ReplaceCloudPairingKeys.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.ReplaceCloudPairingKeysOrBuilder
        public Seed getCurrentSeed() {
            Seed seed = this.currentSeed_;
            return seed == null ? Seed.getDefaultInstance() : seed;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.ReplaceCloudPairingKeysOrBuilder
        public CloudPairingKeys getNewKeys() {
            CloudPairingKeys cloudPairingKeys = this.newKeys_;
            return cloudPairingKeys == null ? CloudPairingKeys.getDefaultInstance() : cloudPairingKeys;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.currentSeed_ != null ? CodedOutputStream.computeMessageSize(1, getCurrentSeed()) : 0;
            if (this.newKeys_ != null) {
                computeMessageSize += CodedOutputStream.computeMessageSize(2, getNewKeys());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.ReplaceCloudPairingKeysOrBuilder
        public boolean hasCurrentSeed() {
            return this.currentSeed_ != null;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.ReplaceCloudPairingKeysOrBuilder
        public boolean hasNewKeys() {
            return this.newKeys_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.currentSeed_ != null) {
                codedOutputStream.writeMessage(1, getCurrentSeed());
            }
            if (this.newKeys_ != null) {
                codedOutputStream.writeMessage(2, getNewKeys());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<ReplaceCloudPairingKeys, Builder> implements ReplaceCloudPairingKeysOrBuilder {
            private Builder() {
                super(ReplaceCloudPairingKeys.DEFAULT_INSTANCE);
            }

            public Builder clearCurrentSeed() {
                copyOnWrite();
                ((ReplaceCloudPairingKeys) this.instance).clearCurrentSeed();
                return this;
            }

            public Builder clearNewKeys() {
                copyOnWrite();
                ((ReplaceCloudPairingKeys) this.instance).clearNewKeys();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.ReplaceCloudPairingKeysOrBuilder
            public Seed getCurrentSeed() {
                return ((ReplaceCloudPairingKeys) this.instance).getCurrentSeed();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.ReplaceCloudPairingKeysOrBuilder
            public CloudPairingKeys getNewKeys() {
                return ((ReplaceCloudPairingKeys) this.instance).getNewKeys();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.ReplaceCloudPairingKeysOrBuilder
            public boolean hasCurrentSeed() {
                return ((ReplaceCloudPairingKeys) this.instance).hasCurrentSeed();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.ReplaceCloudPairingKeysOrBuilder
            public boolean hasNewKeys() {
                return ((ReplaceCloudPairingKeys) this.instance).hasNewKeys();
            }

            public Builder mergeCurrentSeed(Seed seed) {
                copyOnWrite();
                ((ReplaceCloudPairingKeys) this.instance).mergeCurrentSeed(seed);
                return this;
            }

            public Builder mergeNewKeys(CloudPairingKeys cloudPairingKeys) {
                copyOnWrite();
                ((ReplaceCloudPairingKeys) this.instance).mergeNewKeys(cloudPairingKeys);
                return this;
            }

            public Builder setCurrentSeed(Seed seed) {
                copyOnWrite();
                ((ReplaceCloudPairingKeys) this.instance).setCurrentSeed(seed);
                return this;
            }

            public Builder setNewKeys(CloudPairingKeys cloudPairingKeys) {
                copyOnWrite();
                ((ReplaceCloudPairingKeys) this.instance).setNewKeys(cloudPairingKeys);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setCurrentSeed(Seed.Builder builder) {
                copyOnWrite();
                ((ReplaceCloudPairingKeys) this.instance).setCurrentSeed(builder);
                return this;
            }

            public Builder setNewKeys(CloudPairingKeys.Builder builder) {
                copyOnWrite();
                ((ReplaceCloudPairingKeys) this.instance).setNewKeys(builder);
                return this;
            }
        }

        public static Builder newBuilder(ReplaceCloudPairingKeys replaceCloudPairingKeys) {
            return DEFAULT_INSTANCE.createBuilder(replaceCloudPairingKeys);
        }

        public static ReplaceCloudPairingKeys parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReplaceCloudPairingKeys) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ReplaceCloudPairingKeys parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReplaceCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentSeed(Seed seed) {
            seed.getClass();
            this.currentSeed_ = seed;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNewKeys(CloudPairingKeys cloudPairingKeys) {
            cloudPairingKeys.getClass();
            this.newKeys_ = cloudPairingKeys;
        }

        public static ReplaceCloudPairingKeys parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ReplaceCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ReplaceCloudPairingKeys parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReplaceCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ReplaceCloudPairingKeys parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ReplaceCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ReplaceCloudPairingKeys parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReplaceCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ReplaceCloudPairingKeys parseFrom(InputStream inputStream) throws IOException {
            return (ReplaceCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReplaceCloudPairingKeys parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReplaceCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ReplaceCloudPairingKeys parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ReplaceCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ReplaceCloudPairingKeys parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReplaceCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SetCloudPairingKeys extends GeneratedMessageLite<SetCloudPairingKeys, Builder> implements SetCloudPairingKeysOrBuilder {
        private static final SetCloudPairingKeys DEFAULT_INSTANCE;
        public static final int KEYS_FIELD_NUMBER = 1;
        private static volatile Parser<SetCloudPairingKeys> PARSER;
        private CloudPairingKeys keys_;

        static {
            SetCloudPairingKeys setCloudPairingKeys = new SetCloudPairingKeys();
            DEFAULT_INSTANCE = setCloudPairingKeys;
            setCloudPairingKeys.makeImmutable();
        }

        private SetCloudPairingKeys() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeys() {
            this.keys_ = null;
        }

        public static SetCloudPairingKeys getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeKeys(CloudPairingKeys cloudPairingKeys) {
            CloudPairingKeys cloudPairingKeys2 = this.keys_;
            if (cloudPairingKeys2 == null || cloudPairingKeys2 == CloudPairingKeys.getDefaultInstance()) {
                this.keys_ = cloudPairingKeys;
            } else {
                this.keys_ = CloudPairingKeys.newBuilder(this.keys_).mergeFrom((CloudPairingKeys.Builder) cloudPairingKeys).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SetCloudPairingKeys parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SetCloudPairingKeys) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SetCloudPairingKeys parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SetCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SetCloudPairingKeys> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeys(CloudPairingKeys.Builder builder) {
            this.keys_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SetCloudPairingKeys();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.keys_ = (CloudPairingKeys) ((GeneratedMessageLite.Visitor) obj).visitMessage(this.keys_, ((SetCloudPairingKeys) obj2).keys_);
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
                                    CloudPairingKeys cloudPairingKeys = this.keys_;
                                    CloudPairingKeys.Builder builder = cloudPairingKeys != null ? cloudPairingKeys.toBuilder() : null;
                                    CloudPairingKeys cloudPairingKeys2 = (CloudPairingKeys) codedInputStream.readMessage(CloudPairingKeys.parser(), extensionRegistryLite);
                                    this.keys_ = cloudPairingKeys2;
                                    if (builder != null) {
                                        builder.mergeFrom((CloudPairingKeys.Builder) cloudPairingKeys2);
                                        this.keys_ = builder.buildPartial();
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
                        synchronized (SetCloudPairingKeys.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.SetCloudPairingKeysOrBuilder
        public CloudPairingKeys getKeys() {
            CloudPairingKeys cloudPairingKeys = this.keys_;
            return cloudPairingKeys == null ? CloudPairingKeys.getDefaultInstance() : cloudPairingKeys;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.keys_ != null ? CodedOutputStream.computeMessageSize(1, getKeys()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.SetCloudPairingKeysOrBuilder
        public boolean hasKeys() {
            return this.keys_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.keys_ != null) {
                codedOutputStream.writeMessage(1, getKeys());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SetCloudPairingKeys, Builder> implements SetCloudPairingKeysOrBuilder {
            private Builder() {
                super(SetCloudPairingKeys.DEFAULT_INSTANCE);
            }

            public Builder clearKeys() {
                copyOnWrite();
                ((SetCloudPairingKeys) this.instance).clearKeys();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.SetCloudPairingKeysOrBuilder
            public CloudPairingKeys getKeys() {
                return ((SetCloudPairingKeys) this.instance).getKeys();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.SetCloudPairingKeysOrBuilder
            public boolean hasKeys() {
                return ((SetCloudPairingKeys) this.instance).hasKeys();
            }

            public Builder mergeKeys(CloudPairingKeys cloudPairingKeys) {
                copyOnWrite();
                ((SetCloudPairingKeys) this.instance).mergeKeys(cloudPairingKeys);
                return this;
            }

            public Builder setKeys(CloudPairingKeys cloudPairingKeys) {
                copyOnWrite();
                ((SetCloudPairingKeys) this.instance).setKeys(cloudPairingKeys);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setKeys(CloudPairingKeys.Builder builder) {
                copyOnWrite();
                ((SetCloudPairingKeys) this.instance).setKeys(builder);
                return this;
            }
        }

        public static Builder newBuilder(SetCloudPairingKeys setCloudPairingKeys) {
            return DEFAULT_INSTANCE.createBuilder(setCloudPairingKeys);
        }

        public static SetCloudPairingKeys parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetCloudPairingKeys) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SetCloudPairingKeys parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeys(CloudPairingKeys cloudPairingKeys) {
            cloudPairingKeys.getClass();
            this.keys_ = cloudPairingKeys;
        }

        public static SetCloudPairingKeys parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SetCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SetCloudPairingKeys parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SetCloudPairingKeys parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SetCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SetCloudPairingKeys parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SetCloudPairingKeys parseFrom(InputStream inputStream) throws IOException {
            return (SetCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SetCloudPairingKeys parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SetCloudPairingKeys parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SetCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SetCloudPairingKeys parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetCloudPairingKeys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Capability extends GeneratedMessageLite<Capability, Builder> implements CapabilityOrBuilder {
        public static final int ACCESSORY_CATEGORY_FIELD_NUMBER = 4;
        public static final int ACCESSORY_FEATURE_FIELD_NUMBER = 3;
        public static final int BLUETOOTH_SERVICE_FIELD_NUMBER = 1;
        public static final int BLUETOOTH_TRANSPORT_FIELD_NUMBER = 2;
        private static final Capability DEFAULT_INSTANCE;
        private static volatile Parser<Capability> PARSER;
        private int capabilityTypesCase_ = 0;
        private Object capabilityTypes_;

        static {
            Capability capability = new Capability();
            DEFAULT_INSTANCE = capability;
            capability.makeImmutable();
        }

        private Capability() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAccessoryCategory() {
            if (this.capabilityTypesCase_ == 4) {
                this.capabilityTypesCase_ = 0;
                this.capabilityTypes_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAccessoryFeature() {
            if (this.capabilityTypesCase_ == 3) {
                this.capabilityTypesCase_ = 0;
                this.capabilityTypes_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBluetoothService() {
            if (this.capabilityTypesCase_ == 1) {
                this.capabilityTypesCase_ = 0;
                this.capabilityTypes_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBluetoothTransport() {
            if (this.capabilityTypesCase_ == 2) {
                this.capabilityTypesCase_ = 0;
                this.capabilityTypes_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCapabilityTypes() {
            this.capabilityTypesCase_ = 0;
            this.capabilityTypes_ = null;
        }

        public static Capability getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Capability parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Capability) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Capability parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Capability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Capability> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccessoryCategory(AccessoryCategory accessoryCategory) {
            accessoryCategory.getClass();
            this.capabilityTypesCase_ = 4;
            this.capabilityTypes_ = Integer.valueOf(accessoryCategory.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccessoryCategoryValue(int i) {
            this.capabilityTypesCase_ = 4;
            this.capabilityTypes_ = Integer.valueOf(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccessoryFeature(AccessoryFeature accessoryFeature) {
            accessoryFeature.getClass();
            this.capabilityTypesCase_ = 3;
            this.capabilityTypes_ = Integer.valueOf(accessoryFeature.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccessoryFeatureValue(int i) {
            this.capabilityTypesCase_ = 3;
            this.capabilityTypes_ = Integer.valueOf(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBluetoothService(BluetoothService bluetoothService) {
            bluetoothService.getClass();
            this.capabilityTypesCase_ = 1;
            this.capabilityTypes_ = Integer.valueOf(bluetoothService.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBluetoothServiceValue(int i) {
            this.capabilityTypesCase_ = 1;
            this.capabilityTypes_ = Integer.valueOf(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBluetoothTransport(BluetoothTransport bluetoothTransport) {
            bluetoothTransport.getClass();
            this.capabilityTypesCase_ = 2;
            this.capabilityTypes_ = Integer.valueOf(bluetoothTransport.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBluetoothTransportValue(int i) {
            this.capabilityTypesCase_ = 2;
            this.capabilityTypes_ = Integer.valueOf(i);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Capability();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    Capability capability = (Capability) obj2;
                    int i2 = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Cloudpairing$Capability$CapabilityTypesCase[capability.getCapabilityTypesCase().ordinal()];
                    if (i2 == 1) {
                        this.capabilityTypes_ = visitor.visitOneofInt(this.capabilityTypesCase_ == 1, this.capabilityTypes_, capability.capabilityTypes_);
                    } else if (i2 == 2) {
                        this.capabilityTypes_ = visitor.visitOneofInt(this.capabilityTypesCase_ == 2, this.capabilityTypes_, capability.capabilityTypes_);
                    } else if (i2 == 3) {
                        this.capabilityTypes_ = visitor.visitOneofInt(this.capabilityTypesCase_ == 3, this.capabilityTypes_, capability.capabilityTypes_);
                    } else if (i2 == 4) {
                        this.capabilityTypes_ = visitor.visitOneofInt(this.capabilityTypesCase_ == 4, this.capabilityTypes_, capability.capabilityTypes_);
                    } else if (i2 == 5) {
                        visitor.visitOneofNotSet(this.capabilityTypesCase_ != 0);
                    }
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE && (i = capability.capabilityTypesCase_) != 0) {
                        this.capabilityTypesCase_ = i;
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
                                    int readEnum = codedInputStream.readEnum();
                                    this.capabilityTypesCase_ = 1;
                                    this.capabilityTypes_ = Integer.valueOf(readEnum);
                                } else if (readTag == 16) {
                                    int readEnum2 = codedInputStream.readEnum();
                                    this.capabilityTypesCase_ = 2;
                                    this.capabilityTypes_ = Integer.valueOf(readEnum2);
                                } else if (readTag == 24) {
                                    int readEnum3 = codedInputStream.readEnum();
                                    this.capabilityTypesCase_ = 3;
                                    this.capabilityTypes_ = Integer.valueOf(readEnum3);
                                } else if (readTag == 32) {
                                    int readEnum4 = codedInputStream.readEnum();
                                    this.capabilityTypesCase_ = 4;
                                    this.capabilityTypes_ = Integer.valueOf(readEnum4);
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
                        synchronized (Capability.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CapabilityOrBuilder
        public AccessoryCategory getAccessoryCategory() {
            if (this.capabilityTypesCase_ != 4) {
                return AccessoryCategory.HEARABLE;
            }
            AccessoryCategory forNumber = AccessoryCategory.forNumber(((Integer) this.capabilityTypes_).intValue());
            return forNumber == null ? AccessoryCategory.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CapabilityOrBuilder
        public int getAccessoryCategoryValue() {
            if (this.capabilityTypesCase_ == 4) {
                return ((Integer) this.capabilityTypes_).intValue();
            }
            return 0;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CapabilityOrBuilder
        public AccessoryFeature getAccessoryFeature() {
            if (this.capabilityTypesCase_ != 3) {
                return AccessoryFeature.FIND_MY;
            }
            AccessoryFeature forNumber = AccessoryFeature.forNumber(((Integer) this.capabilityTypes_).intValue());
            return forNumber == null ? AccessoryFeature.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CapabilityOrBuilder
        public int getAccessoryFeatureValue() {
            if (this.capabilityTypesCase_ == 3) {
                return ((Integer) this.capabilityTypes_).intValue();
            }
            return 0;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CapabilityOrBuilder
        public BluetoothService getBluetoothService() {
            if (this.capabilityTypesCase_ != 1) {
                return BluetoothService.HFP;
            }
            BluetoothService forNumber = BluetoothService.forNumber(((Integer) this.capabilityTypes_).intValue());
            return forNumber == null ? BluetoothService.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CapabilityOrBuilder
        public int getBluetoothServiceValue() {
            if (this.capabilityTypesCase_ == 1) {
                return ((Integer) this.capabilityTypes_).intValue();
            }
            return 0;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CapabilityOrBuilder
        public BluetoothTransport getBluetoothTransport() {
            if (this.capabilityTypesCase_ != 2) {
                return BluetoothTransport.BT_CLASSIC;
            }
            BluetoothTransport forNumber = BluetoothTransport.forNumber(((Integer) this.capabilityTypes_).intValue());
            return forNumber == null ? BluetoothTransport.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CapabilityOrBuilder
        public int getBluetoothTransportValue() {
            if (this.capabilityTypesCase_ == 2) {
                return ((Integer) this.capabilityTypes_).intValue();
            }
            return 0;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CapabilityOrBuilder
        public CapabilityTypesCase getCapabilityTypesCase() {
            return CapabilityTypesCase.forNumber(this.capabilityTypesCase_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.capabilityTypesCase_ == 1 ? CodedOutputStream.computeEnumSize(1, ((Integer) this.capabilityTypes_).intValue()) : 0;
            if (this.capabilityTypesCase_ == 2) {
                computeEnumSize += CodedOutputStream.computeEnumSize(2, ((Integer) this.capabilityTypes_).intValue());
            }
            if (this.capabilityTypesCase_ == 3) {
                computeEnumSize += CodedOutputStream.computeEnumSize(3, ((Integer) this.capabilityTypes_).intValue());
            }
            if (this.capabilityTypesCase_ == 4) {
                computeEnumSize += CodedOutputStream.computeEnumSize(4, ((Integer) this.capabilityTypes_).intValue());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.capabilityTypesCase_ == 1) {
                codedOutputStream.writeEnum(1, ((Integer) this.capabilityTypes_).intValue());
            }
            if (this.capabilityTypesCase_ == 2) {
                codedOutputStream.writeEnum(2, ((Integer) this.capabilityTypes_).intValue());
            }
            if (this.capabilityTypesCase_ == 3) {
                codedOutputStream.writeEnum(3, ((Integer) this.capabilityTypes_).intValue());
            }
            if (this.capabilityTypesCase_ == 4) {
                codedOutputStream.writeEnum(4, ((Integer) this.capabilityTypes_).intValue());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<Capability, Builder> implements CapabilityOrBuilder {
            private Builder() {
                super(Capability.DEFAULT_INSTANCE);
            }

            public Builder clearAccessoryCategory() {
                copyOnWrite();
                ((Capability) this.instance).clearAccessoryCategory();
                return this;
            }

            public Builder clearAccessoryFeature() {
                copyOnWrite();
                ((Capability) this.instance).clearAccessoryFeature();
                return this;
            }

            public Builder clearBluetoothService() {
                copyOnWrite();
                ((Capability) this.instance).clearBluetoothService();
                return this;
            }

            public Builder clearBluetoothTransport() {
                copyOnWrite();
                ((Capability) this.instance).clearBluetoothTransport();
                return this;
            }

            public Builder clearCapabilityTypes() {
                copyOnWrite();
                ((Capability) this.instance).clearCapabilityTypes();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CapabilityOrBuilder
            public AccessoryCategory getAccessoryCategory() {
                return ((Capability) this.instance).getAccessoryCategory();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CapabilityOrBuilder
            public int getAccessoryCategoryValue() {
                return ((Capability) this.instance).getAccessoryCategoryValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CapabilityOrBuilder
            public AccessoryFeature getAccessoryFeature() {
                return ((Capability) this.instance).getAccessoryFeature();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CapabilityOrBuilder
            public int getAccessoryFeatureValue() {
                return ((Capability) this.instance).getAccessoryFeatureValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CapabilityOrBuilder
            public BluetoothService getBluetoothService() {
                return ((Capability) this.instance).getBluetoothService();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CapabilityOrBuilder
            public int getBluetoothServiceValue() {
                return ((Capability) this.instance).getBluetoothServiceValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CapabilityOrBuilder
            public BluetoothTransport getBluetoothTransport() {
                return ((Capability) this.instance).getBluetoothTransport();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CapabilityOrBuilder
            public int getBluetoothTransportValue() {
                return ((Capability) this.instance).getBluetoothTransportValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CapabilityOrBuilder
            public CapabilityTypesCase getCapabilityTypesCase() {
                return ((Capability) this.instance).getCapabilityTypesCase();
            }

            public Builder setAccessoryCategory(AccessoryCategory accessoryCategory) {
                copyOnWrite();
                ((Capability) this.instance).setAccessoryCategory(accessoryCategory);
                return this;
            }

            public Builder setAccessoryCategoryValue(int i) {
                copyOnWrite();
                ((Capability) this.instance).setAccessoryCategoryValue(i);
                return this;
            }

            public Builder setAccessoryFeature(AccessoryFeature accessoryFeature) {
                copyOnWrite();
                ((Capability) this.instance).setAccessoryFeature(accessoryFeature);
                return this;
            }

            public Builder setAccessoryFeatureValue(int i) {
                copyOnWrite();
                ((Capability) this.instance).setAccessoryFeatureValue(i);
                return this;
            }

            public Builder setBluetoothService(BluetoothService bluetoothService) {
                copyOnWrite();
                ((Capability) this.instance).setBluetoothService(bluetoothService);
                return this;
            }

            public Builder setBluetoothServiceValue(int i) {
                copyOnWrite();
                ((Capability) this.instance).setBluetoothServiceValue(i);
                return this;
            }

            public Builder setBluetoothTransport(BluetoothTransport bluetoothTransport) {
                copyOnWrite();
                ((Capability) this.instance).setBluetoothTransport(bluetoothTransport);
                return this;
            }

            public Builder setBluetoothTransportValue(int i) {
                copyOnWrite();
                ((Capability) this.instance).setBluetoothTransportValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum AccessoryCategory implements Internal.EnumLite {
            HEARABLE(0),
            WEARABLE(1),
            UNRECOGNIZED(-1);

            public static final int HEARABLE_VALUE = 0;
            public static final int WEARABLE_VALUE = 1;
            private static final Internal.EnumLiteMap<AccessoryCategory> internalValueMap = new Internal.EnumLiteMap<AccessoryCategory>() { // from class: com.amazon.alexa.accessory.protocol.Cloudpairing.Capability.AccessoryCategory.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public AccessoryCategory findValueByNumber(int i) {
                    return AccessoryCategory.forNumber(i);
                }
            };
            private final int value;

            AccessoryCategory(int i) {
                this.value = i;
            }

            public static AccessoryCategory forNumber(int i) {
                if (i == 0) {
                    return HEARABLE;
                }
                if (i != 1) {
                    return null;
                }
                return WEARABLE;
            }

            public static Internal.EnumLiteMap<AccessoryCategory> internalGetValueMap() {
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
            public static AccessoryCategory valueOf(int i) {
                return forNumber(i);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum AccessoryFeature implements Internal.EnumLite {
            FIND_MY(0),
            SEAMLESS_SWITCHING(1),
            UNRECOGNIZED(-1);

            public static final int FIND_MY_VALUE = 0;
            public static final int SEAMLESS_SWITCHING_VALUE = 1;
            private static final Internal.EnumLiteMap<AccessoryFeature> internalValueMap = new Internal.EnumLiteMap<AccessoryFeature>() { // from class: com.amazon.alexa.accessory.protocol.Cloudpairing.Capability.AccessoryFeature.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public AccessoryFeature findValueByNumber(int i) {
                    return AccessoryFeature.forNumber(i);
                }
            };
            private final int value;

            AccessoryFeature(int i) {
                this.value = i;
            }

            public static AccessoryFeature forNumber(int i) {
                if (i == 0) {
                    return FIND_MY;
                }
                if (i != 1) {
                    return null;
                }
                return SEAMLESS_SWITCHING;
            }

            public static Internal.EnumLiteMap<AccessoryFeature> internalGetValueMap() {
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
            public static AccessoryFeature valueOf(int i) {
                return forNumber(i);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum BluetoothService implements Internal.EnumLite {
            HFP(0),
            A2DP(1),
            AVRCP(2),
            UNRECOGNIZED(-1);

            public static final int A2DP_VALUE = 1;
            public static final int AVRCP_VALUE = 2;
            public static final int HFP_VALUE = 0;
            private static final Internal.EnumLiteMap<BluetoothService> internalValueMap = new Internal.EnumLiteMap<BluetoothService>() { // from class: com.amazon.alexa.accessory.protocol.Cloudpairing.Capability.BluetoothService.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public BluetoothService findValueByNumber(int i) {
                    return BluetoothService.forNumber(i);
                }
            };
            private final int value;

            BluetoothService(int i) {
                this.value = i;
            }

            public static BluetoothService forNumber(int i) {
                if (i == 0) {
                    return HFP;
                }
                if (i == 1) {
                    return A2DP;
                }
                if (i != 2) {
                    return null;
                }
                return AVRCP;
            }

            public static Internal.EnumLiteMap<BluetoothService> internalGetValueMap() {
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
            public static BluetoothService valueOf(int i) {
                return forNumber(i);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum BluetoothTransport implements Internal.EnumLite {
            BT_CLASSIC(0),
            BLE(1),
            UNRECOGNIZED(-1);

            public static final int BLE_VALUE = 1;
            public static final int BT_CLASSIC_VALUE = 0;
            private static final Internal.EnumLiteMap<BluetoothTransport> internalValueMap = new Internal.EnumLiteMap<BluetoothTransport>() { // from class: com.amazon.alexa.accessory.protocol.Cloudpairing.Capability.BluetoothTransport.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public BluetoothTransport findValueByNumber(int i) {
                    return BluetoothTransport.forNumber(i);
                }
            };
            private final int value;

            BluetoothTransport(int i) {
                this.value = i;
            }

            public static BluetoothTransport forNumber(int i) {
                if (i == 0) {
                    return BT_CLASSIC;
                }
                if (i != 1) {
                    return null;
                }
                return BLE;
            }

            public static Internal.EnumLiteMap<BluetoothTransport> internalGetValueMap() {
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
            public static BluetoothTransport valueOf(int i) {
                return forNumber(i);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum CapabilityTypesCase implements Internal.EnumLite {
            BLUETOOTH_SERVICE(1),
            BLUETOOTH_TRANSPORT(2),
            ACCESSORY_FEATURE(3),
            ACCESSORY_CATEGORY(4),
            CAPABILITYTYPES_NOT_SET(0);

            private final int value;

            CapabilityTypesCase(int i) {
                this.value = i;
            }

            public static CapabilityTypesCase forNumber(int i) {
                if (i == 0) {
                    return CAPABILITYTYPES_NOT_SET;
                }
                if (i == 1) {
                    return BLUETOOTH_SERVICE;
                }
                if (i == 2) {
                    return BLUETOOTH_TRANSPORT;
                }
                if (i == 3) {
                    return ACCESSORY_FEATURE;
                }
                if (i != 4) {
                    return null;
                }
                return ACCESSORY_CATEGORY;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static CapabilityTypesCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(Capability capability) {
            return DEFAULT_INSTANCE.createBuilder(capability);
        }

        public static Capability parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Capability) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Capability parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Capability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Capability parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Capability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Capability parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Capability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Capability parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Capability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Capability parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Capability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Capability parseFrom(InputStream inputStream) throws IOException {
            return (Capability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Capability parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Capability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Capability parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Capability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Capability parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Capability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CloudPairingMsg extends GeneratedMessageLite<CloudPairingMsg, Builder> implements CloudPairingMsgOrBuilder {
        private static final CloudPairingMsg DEFAULT_INSTANCE;
        public static final int MSG_FIELD_NUMBER = 1;
        private static volatile Parser<CloudPairingMsg> PARSER;
        private ByteString msg_ = ByteString.EMPTY;

        static {
            CloudPairingMsg cloudPairingMsg = new CloudPairingMsg();
            DEFAULT_INSTANCE = cloudPairingMsg;
            cloudPairingMsg.makeImmutable();
        }

        private CloudPairingMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsg() {
            this.msg_ = getDefaultInstance().getMsg();
        }

        public static CloudPairingMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CloudPairingMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CloudPairingMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CloudPairingMsg parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CloudPairingMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CloudPairingMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsg(ByteString byteString) {
            byteString.getClass();
            this.msg_ = byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CloudPairingMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    CloudPairingMsg cloudPairingMsg = (CloudPairingMsg) obj2;
                    ByteString byteString = this.msg_;
                    ByteString byteString2 = ByteString.EMPTY;
                    boolean z = byteString != byteString2;
                    ByteString byteString3 = cloudPairingMsg.msg_;
                    this.msg_ = visitor.visitByteString(z, byteString, byteString3 != byteString2, byteString3);
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
                                    this.msg_ = codedInputStream.readBytes();
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
                        synchronized (CloudPairingMsg.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CloudPairingMsgOrBuilder
        public ByteString getMsg() {
            return this.msg_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (!this.msg_.isEmpty() ? CodedOutputStream.computeBytesSize(1, this.msg_) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.msg_.isEmpty()) {
                codedOutputStream.writeBytes(1, this.msg_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<CloudPairingMsg, Builder> implements CloudPairingMsgOrBuilder {
            private Builder() {
                super(CloudPairingMsg.DEFAULT_INSTANCE);
            }

            public Builder clearMsg() {
                copyOnWrite();
                ((CloudPairingMsg) this.instance).clearMsg();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CloudPairingMsgOrBuilder
            public ByteString getMsg() {
                return ((CloudPairingMsg) this.instance).getMsg();
            }

            public Builder setMsg(ByteString byteString) {
                copyOnWrite();
                ((CloudPairingMsg) this.instance).setMsg(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(CloudPairingMsg cloudPairingMsg) {
            return DEFAULT_INSTANCE.createBuilder(cloudPairingMsg);
        }

        public static CloudPairingMsg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CloudPairingMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CloudPairingMsg parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CloudPairingMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CloudPairingMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CloudPairingMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CloudPairingMsg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CloudPairingMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CloudPairingMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CloudPairingMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CloudPairingMsg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CloudPairingMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CloudPairingMsg parseFrom(InputStream inputStream) throws IOException {
            return (CloudPairingMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CloudPairingMsg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CloudPairingMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CloudPairingMsg parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CloudPairingMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CloudPairingMsg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CloudPairingMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CloudPairingStatus extends GeneratedMessageLite<CloudPairingStatus, Builder> implements CloudPairingStatusOrBuilder {
        private static final CloudPairingStatus DEFAULT_INSTANCE;
        public static final int PAIRING_STATUS_FIELD_NUMBER = 1;
        private static volatile Parser<CloudPairingStatus> PARSER;
        private boolean pairingStatus_;

        static {
            CloudPairingStatus cloudPairingStatus = new CloudPairingStatus();
            DEFAULT_INSTANCE = cloudPairingStatus;
            cloudPairingStatus.makeImmutable();
        }

        private CloudPairingStatus() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPairingStatus() {
            this.pairingStatus_ = false;
        }

        public static CloudPairingStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CloudPairingStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CloudPairingStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CloudPairingStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CloudPairingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CloudPairingStatus> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPairingStatus(boolean z) {
            this.pairingStatus_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CloudPairingStatus();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    boolean z = this.pairingStatus_;
                    boolean z2 = ((CloudPairingStatus) obj2).pairingStatus_;
                    this.pairingStatus_ = ((GeneratedMessageLite.Visitor) obj).visitBoolean(z, z, z2, z2);
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
                                    this.pairingStatus_ = codedInputStream.readBool();
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
                        synchronized (CloudPairingStatus.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CloudPairingStatusOrBuilder
        public boolean getPairingStatus() {
            return this.pairingStatus_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            boolean z = this.pairingStatus_;
            int serializedSize = this.unknownFields.getSerializedSize() + (z ? CodedOutputStream.computeBoolSize(1, z) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            boolean z = this.pairingStatus_;
            if (z) {
                codedOutputStream.writeBool(1, z);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<CloudPairingStatus, Builder> implements CloudPairingStatusOrBuilder {
            private Builder() {
                super(CloudPairingStatus.DEFAULT_INSTANCE);
            }

            public Builder clearPairingStatus() {
                copyOnWrite();
                ((CloudPairingStatus) this.instance).clearPairingStatus();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.CloudPairingStatusOrBuilder
            public boolean getPairingStatus() {
                return ((CloudPairingStatus) this.instance).getPairingStatus();
            }

            public Builder setPairingStatus(boolean z) {
                copyOnWrite();
                ((CloudPairingStatus) this.instance).setPairingStatus(z);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(CloudPairingStatus cloudPairingStatus) {
            return DEFAULT_INSTANCE.createBuilder(cloudPairingStatus);
        }

        public static CloudPairingStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CloudPairingStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CloudPairingStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CloudPairingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CloudPairingStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CloudPairingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CloudPairingStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CloudPairingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CloudPairingStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CloudPairingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CloudPairingStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CloudPairingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CloudPairingStatus parseFrom(InputStream inputStream) throws IOException {
            return (CloudPairingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CloudPairingStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CloudPairingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CloudPairingStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CloudPairingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CloudPairingStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CloudPairingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetCloudPairingAttributes extends GeneratedMessageLite<GetCloudPairingAttributes, Builder> implements GetCloudPairingAttributesOrBuilder {
        private static final GetCloudPairingAttributes DEFAULT_INSTANCE;
        private static volatile Parser<GetCloudPairingAttributes> PARSER;

        static {
            GetCloudPairingAttributes getCloudPairingAttributes = new GetCloudPairingAttributes();
            DEFAULT_INSTANCE = getCloudPairingAttributes;
            getCloudPairingAttributes.makeImmutable();
        }

        private GetCloudPairingAttributes() {
        }

        public static GetCloudPairingAttributes getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetCloudPairingAttributes parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetCloudPairingAttributes) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetCloudPairingAttributes parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetCloudPairingAttributes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetCloudPairingAttributes> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetCloudPairingAttributes();
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
                        synchronized (GetCloudPairingAttributes.class) {
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
        public static final class Builder extends GeneratedMessageLite.Builder<GetCloudPairingAttributes, Builder> implements GetCloudPairingAttributesOrBuilder {
            private Builder() {
                super(GetCloudPairingAttributes.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(GetCloudPairingAttributes getCloudPairingAttributes) {
            return DEFAULT_INSTANCE.createBuilder(getCloudPairingAttributes);
        }

        public static GetCloudPairingAttributes parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCloudPairingAttributes) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetCloudPairingAttributes parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCloudPairingAttributes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetCloudPairingAttributes parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetCloudPairingAttributes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetCloudPairingAttributes parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCloudPairingAttributes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetCloudPairingAttributes parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetCloudPairingAttributes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetCloudPairingAttributes parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCloudPairingAttributes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetCloudPairingAttributes parseFrom(InputStream inputStream) throws IOException {
            return (GetCloudPairingAttributes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetCloudPairingAttributes parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCloudPairingAttributes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetCloudPairingAttributes parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetCloudPairingAttributes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetCloudPairingAttributes parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCloudPairingAttributes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Seed extends GeneratedMessageLite<Seed, Builder> implements SeedOrBuilder {
        public static final int BLUETOOTH_SEED_FIELD_NUMBER = 1;
        private static final Seed DEFAULT_INSTANCE;
        private static volatile Parser<Seed> PARSER;
        private int seedTypesCase_ = 0;
        private Object seedTypes_;

        static {
            Seed seed = new Seed();
            DEFAULT_INSTANCE = seed;
            seed.makeImmutable();
        }

        private Seed() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBluetoothSeed() {
            if (this.seedTypesCase_ == 1) {
                this.seedTypesCase_ = 0;
                this.seedTypes_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSeedTypes() {
            this.seedTypesCase_ = 0;
            this.seedTypes_ = null;
        }

        public static Seed getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Seed parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Seed) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Seed parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Seed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Seed> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBluetoothSeed(ByteString byteString) {
            byteString.getClass();
            this.seedTypesCase_ = 1;
            this.seedTypes_ = byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Seed();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    Seed seed = (Seed) obj2;
                    int i2 = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Cloudpairing$Seed$SeedTypesCase[seed.getSeedTypesCase().ordinal()];
                    if (i2 == 1) {
                        this.seedTypes_ = visitor.visitOneofByteString(this.seedTypesCase_ == 1, this.seedTypes_, seed.seedTypes_);
                    } else if (i2 == 2) {
                        visitor.visitOneofNotSet(this.seedTypesCase_ != 0);
                    }
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE && (i = seed.seedTypesCase_) != 0) {
                        this.seedTypesCase_ = i;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.seedTypesCase_ = 1;
                                    this.seedTypes_ = codedInputStream.readBytes();
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
                        synchronized (Seed.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.SeedOrBuilder
        public ByteString getBluetoothSeed() {
            return this.seedTypesCase_ == 1 ? (ByteString) this.seedTypes_ : ByteString.EMPTY;
        }

        @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.SeedOrBuilder
        public SeedTypesCase getSeedTypesCase() {
            return SeedTypesCase.forNumber(this.seedTypesCase_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.seedTypesCase_ == 1 ? CodedOutputStream.computeBytesSize(1, (ByteString) this.seedTypes_) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.seedTypesCase_ == 1) {
                codedOutputStream.writeBytes(1, (ByteString) this.seedTypes_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<Seed, Builder> implements SeedOrBuilder {
            private Builder() {
                super(Seed.DEFAULT_INSTANCE);
            }

            public Builder clearBluetoothSeed() {
                copyOnWrite();
                ((Seed) this.instance).clearBluetoothSeed();
                return this;
            }

            public Builder clearSeedTypes() {
                copyOnWrite();
                ((Seed) this.instance).clearSeedTypes();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.SeedOrBuilder
            public ByteString getBluetoothSeed() {
                return ((Seed) this.instance).getBluetoothSeed();
            }

            @Override // com.amazon.alexa.accessory.protocol.Cloudpairing.SeedOrBuilder
            public SeedTypesCase getSeedTypesCase() {
                return ((Seed) this.instance).getSeedTypesCase();
            }

            public Builder setBluetoothSeed(ByteString byteString) {
                copyOnWrite();
                ((Seed) this.instance).setBluetoothSeed(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum SeedTypesCase implements Internal.EnumLite {
            BLUETOOTH_SEED(1),
            SEEDTYPES_NOT_SET(0);

            private final int value;

            SeedTypesCase(int i) {
                this.value = i;
            }

            public static SeedTypesCase forNumber(int i) {
                if (i == 0) {
                    return SEEDTYPES_NOT_SET;
                }
                if (i != 1) {
                    return null;
                }
                return BLUETOOTH_SEED;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static SeedTypesCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(Seed seed) {
            return DEFAULT_INSTANCE.createBuilder(seed);
        }

        public static Seed parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Seed) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Seed parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Seed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Seed parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Seed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Seed parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Seed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Seed parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Seed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Seed parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Seed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Seed parseFrom(InputStream inputStream) throws IOException {
            return (Seed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Seed parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Seed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Seed parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Seed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Seed parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Seed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
