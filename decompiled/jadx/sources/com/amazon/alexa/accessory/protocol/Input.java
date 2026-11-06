package com.amazon.alexa.accessory.protocol;

import com.google.protobuf.AbstractMessageLite;
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
import java.util.Collections;
import java.util.List;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class Input {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.Input$1, reason: invalid class name */
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
    public interface GetInputBehaviorOrBuilder extends MessageLiteOrBuilder {
        int getDeviceId();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface InputBehaviorConfigurationOrBuilder extends MessageLiteOrBuilder {
        InputAction getAction();

        int getActionValue();

        InputBehavior getBehavior();

        int getBehaviorValue();

        InputSource getSource();

        int getSourceValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface InputBehaviorConfigurationSetOrBuilder extends MessageLiteOrBuilder {
        InputBehaviorConfiguration getConfigurations(int i);

        int getConfigurationsCount();

        List<InputBehaviorConfiguration> getConfigurationsList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface IssueInputEventOrBuilder extends MessageLiteOrBuilder {
        InputAction getAction();

        int getActionValue();

        InputBehavior getBehavior();

        int getBehaviorValue();

        int getDeviceId();

        InputSource getSource();

        int getSourceValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ResetInputBehaviorOrBuilder extends MessageLiteOrBuilder {
        int getDeviceId();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SetInputBehaviorOrBuilder extends MessageLiteOrBuilder {
        InputBehaviorConfiguration getConfiguration();

        int getDeviceId();

        boolean hasConfiguration();
    }

    private Input() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InputBehaviorConfigurationSet extends GeneratedMessageLite<InputBehaviorConfigurationSet, Builder> implements InputBehaviorConfigurationSetOrBuilder {
        public static final int CONFIGURATIONS_FIELD_NUMBER = 1;
        private static final InputBehaviorConfigurationSet DEFAULT_INSTANCE;
        private static volatile Parser<InputBehaviorConfigurationSet> PARSER;
        private Internal.ProtobufList<InputBehaviorConfiguration> configurations_ = GeneratedMessageLite.emptyProtobufList();

        static {
            InputBehaviorConfigurationSet inputBehaviorConfigurationSet = new InputBehaviorConfigurationSet();
            DEFAULT_INSTANCE = inputBehaviorConfigurationSet;
            inputBehaviorConfigurationSet.makeImmutable();
        }

        private InputBehaviorConfigurationSet() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllConfigurations(Iterable<? extends InputBehaviorConfiguration> iterable) {
            ensureConfigurationsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.configurations_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addConfigurations(InputBehaviorConfiguration.Builder builder) {
            ensureConfigurationsIsMutable();
            this.configurations_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfigurations() {
            this.configurations_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureConfigurationsIsMutable() {
            if (this.configurations_.isModifiable()) {
                return;
            }
            this.configurations_ = GeneratedMessageLite.mutableCopy(this.configurations_);
        }

        public static InputBehaviorConfigurationSet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static InputBehaviorConfigurationSet parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (InputBehaviorConfigurationSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InputBehaviorConfigurationSet parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (InputBehaviorConfigurationSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<InputBehaviorConfigurationSet> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeConfigurations(int i) {
            ensureConfigurationsIsMutable();
            this.configurations_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfigurations(int i, InputBehaviorConfiguration.Builder builder) {
            ensureConfigurationsIsMutable();
            this.configurations_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new InputBehaviorConfigurationSet();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.configurations_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.configurations_ = ((GeneratedMessageLite.Visitor) obj).visitList(this.configurations_, ((InputBehaviorConfigurationSet) obj2).configurations_);
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
                                    if (!this.configurations_.isModifiable()) {
                                        this.configurations_ = GeneratedMessageLite.mutableCopy(this.configurations_);
                                    }
                                    this.configurations_.add((InputBehaviorConfiguration) codedInputStream.readMessage(InputBehaviorConfiguration.parser(), extensionRegistryLite));
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
                        synchronized (InputBehaviorConfigurationSet.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Input.InputBehaviorConfigurationSetOrBuilder
        public InputBehaviorConfiguration getConfigurations(int i) {
            return this.configurations_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Input.InputBehaviorConfigurationSetOrBuilder
        public int getConfigurationsCount() {
            return this.configurations_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Input.InputBehaviorConfigurationSetOrBuilder
        public List<InputBehaviorConfiguration> getConfigurationsList() {
            return this.configurations_;
        }

        public InputBehaviorConfigurationOrBuilder getConfigurationsOrBuilder(int i) {
            return this.configurations_.get(i);
        }

        public List<? extends InputBehaviorConfigurationOrBuilder> getConfigurationsOrBuilderList() {
            return this.configurations_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.configurations_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.configurations_.get(i3));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.configurations_.size(); i++) {
                codedOutputStream.writeMessage(1, this.configurations_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<InputBehaviorConfigurationSet, Builder> implements InputBehaviorConfigurationSetOrBuilder {
            private Builder() {
                super(InputBehaviorConfigurationSet.DEFAULT_INSTANCE);
            }

            public Builder addAllConfigurations(Iterable<? extends InputBehaviorConfiguration> iterable) {
                copyOnWrite();
                ((InputBehaviorConfigurationSet) this.instance).addAllConfigurations(iterable);
                return this;
            }

            public Builder addConfigurations(InputBehaviorConfiguration inputBehaviorConfiguration) {
                copyOnWrite();
                ((InputBehaviorConfigurationSet) this.instance).addConfigurations(inputBehaviorConfiguration);
                return this;
            }

            public Builder clearConfigurations() {
                copyOnWrite();
                ((InputBehaviorConfigurationSet) this.instance).clearConfigurations();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Input.InputBehaviorConfigurationSetOrBuilder
            public InputBehaviorConfiguration getConfigurations(int i) {
                return ((InputBehaviorConfigurationSet) this.instance).getConfigurations(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Input.InputBehaviorConfigurationSetOrBuilder
            public int getConfigurationsCount() {
                return ((InputBehaviorConfigurationSet) this.instance).getConfigurationsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Input.InputBehaviorConfigurationSetOrBuilder
            public List<InputBehaviorConfiguration> getConfigurationsList() {
                return Collections.unmodifiableList(((InputBehaviorConfigurationSet) this.instance).getConfigurationsList());
            }

            public Builder removeConfigurations(int i) {
                copyOnWrite();
                ((InputBehaviorConfigurationSet) this.instance).removeConfigurations(i);
                return this;
            }

            public Builder setConfigurations(int i, InputBehaviorConfiguration inputBehaviorConfiguration) {
                copyOnWrite();
                ((InputBehaviorConfigurationSet) this.instance).setConfigurations(i, inputBehaviorConfiguration);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addConfigurations(int i, InputBehaviorConfiguration inputBehaviorConfiguration) {
                copyOnWrite();
                ((InputBehaviorConfigurationSet) this.instance).addConfigurations(i, inputBehaviorConfiguration);
                return this;
            }

            public Builder setConfigurations(int i, InputBehaviorConfiguration.Builder builder) {
                copyOnWrite();
                ((InputBehaviorConfigurationSet) this.instance).setConfigurations(i, builder);
                return this;
            }

            public Builder addConfigurations(InputBehaviorConfiguration.Builder builder) {
                copyOnWrite();
                ((InputBehaviorConfigurationSet) this.instance).addConfigurations(builder);
                return this;
            }

            public Builder addConfigurations(int i, InputBehaviorConfiguration.Builder builder) {
                copyOnWrite();
                ((InputBehaviorConfigurationSet) this.instance).addConfigurations(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(InputBehaviorConfigurationSet inputBehaviorConfigurationSet) {
            return DEFAULT_INSTANCE.createBuilder(inputBehaviorConfigurationSet);
        }

        public static InputBehaviorConfigurationSet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InputBehaviorConfigurationSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InputBehaviorConfigurationSet parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InputBehaviorConfigurationSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static InputBehaviorConfigurationSet parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (InputBehaviorConfigurationSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static InputBehaviorConfigurationSet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InputBehaviorConfigurationSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static InputBehaviorConfigurationSet parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (InputBehaviorConfigurationSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static InputBehaviorConfigurationSet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InputBehaviorConfigurationSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static InputBehaviorConfigurationSet parseFrom(InputStream inputStream) throws IOException {
            return (InputBehaviorConfigurationSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addConfigurations(int i, InputBehaviorConfiguration inputBehaviorConfiguration) {
            inputBehaviorConfiguration.getClass();
            ensureConfigurationsIsMutable();
            this.configurations_.add(i, inputBehaviorConfiguration);
        }

        public static InputBehaviorConfigurationSet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InputBehaviorConfigurationSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfigurations(int i, InputBehaviorConfiguration inputBehaviorConfiguration) {
            inputBehaviorConfiguration.getClass();
            ensureConfigurationsIsMutable();
            this.configurations_.set(i, inputBehaviorConfiguration);
        }

        public static InputBehaviorConfigurationSet parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (InputBehaviorConfigurationSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static InputBehaviorConfigurationSet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InputBehaviorConfigurationSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addConfigurations(InputBehaviorConfiguration inputBehaviorConfiguration) {
            inputBehaviorConfiguration.getClass();
            ensureConfigurationsIsMutable();
            this.configurations_.add(inputBehaviorConfiguration);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addConfigurations(int i, InputBehaviorConfiguration.Builder builder) {
            ensureConfigurationsIsMutable();
            this.configurations_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SetInputBehavior extends GeneratedMessageLite<SetInputBehavior, Builder> implements SetInputBehaviorOrBuilder {
        public static final int CONFIGURATION_FIELD_NUMBER = 2;
        private static final SetInputBehavior DEFAULT_INSTANCE;
        public static final int DEVICE_ID_FIELD_NUMBER = 1;
        private static volatile Parser<SetInputBehavior> PARSER;
        private InputBehaviorConfiguration configuration_;
        private int deviceId_;

        static {
            SetInputBehavior setInputBehavior = new SetInputBehavior();
            DEFAULT_INSTANCE = setInputBehavior;
            setInputBehavior.makeImmutable();
        }

        private SetInputBehavior() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfiguration() {
            this.configuration_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceId() {
            this.deviceId_ = 0;
        }

        public static SetInputBehavior getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeConfiguration(InputBehaviorConfiguration inputBehaviorConfiguration) {
            InputBehaviorConfiguration inputBehaviorConfiguration2 = this.configuration_;
            if (inputBehaviorConfiguration2 == null || inputBehaviorConfiguration2 == InputBehaviorConfiguration.getDefaultInstance()) {
                this.configuration_ = inputBehaviorConfiguration;
            } else {
                this.configuration_ = InputBehaviorConfiguration.newBuilder(this.configuration_).mergeFrom((InputBehaviorConfiguration.Builder) inputBehaviorConfiguration).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SetInputBehavior parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SetInputBehavior) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SetInputBehavior parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SetInputBehavior> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfiguration(InputBehaviorConfiguration.Builder builder) {
            this.configuration_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceId(int i) {
            this.deviceId_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SetInputBehavior();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    SetInputBehavior setInputBehavior = (SetInputBehavior) obj2;
                    int i = this.deviceId_;
                    boolean z = i != 0;
                    int i2 = setInputBehavior.deviceId_;
                    this.deviceId_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.configuration_ = (InputBehaviorConfiguration) visitor.visitMessage(this.configuration_, setInputBehavior.configuration_);
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
                                if (readTag == 8) {
                                    this.deviceId_ = codedInputStream.readUInt32();
                                } else if (readTag == 18) {
                                    InputBehaviorConfiguration inputBehaviorConfiguration = this.configuration_;
                                    InputBehaviorConfiguration.Builder builder = inputBehaviorConfiguration != null ? inputBehaviorConfiguration.toBuilder() : null;
                                    InputBehaviorConfiguration inputBehaviorConfiguration2 = (InputBehaviorConfiguration) codedInputStream.readMessage(InputBehaviorConfiguration.parser(), extensionRegistryLite);
                                    this.configuration_ = inputBehaviorConfiguration2;
                                    if (builder != null) {
                                        builder.mergeFrom((InputBehaviorConfiguration.Builder) inputBehaviorConfiguration2);
                                        this.configuration_ = builder.buildPartial();
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
                        synchronized (SetInputBehavior.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Input.SetInputBehaviorOrBuilder
        public InputBehaviorConfiguration getConfiguration() {
            InputBehaviorConfiguration inputBehaviorConfiguration = this.configuration_;
            return inputBehaviorConfiguration == null ? InputBehaviorConfiguration.getDefaultInstance() : inputBehaviorConfiguration;
        }

        @Override // com.amazon.alexa.accessory.protocol.Input.SetInputBehaviorOrBuilder
        public int getDeviceId() {
            return this.deviceId_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.deviceId_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            if (this.configuration_ != null) {
                computeUInt32Size += CodedOutputStream.computeMessageSize(2, getConfiguration());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Input.SetInputBehaviorOrBuilder
        public boolean hasConfiguration() {
            return this.configuration_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.deviceId_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            if (this.configuration_ != null) {
                codedOutputStream.writeMessage(2, getConfiguration());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SetInputBehavior, Builder> implements SetInputBehaviorOrBuilder {
            private Builder() {
                super(SetInputBehavior.DEFAULT_INSTANCE);
            }

            public Builder clearConfiguration() {
                copyOnWrite();
                ((SetInputBehavior) this.instance).clearConfiguration();
                return this;
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((SetInputBehavior) this.instance).clearDeviceId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Input.SetInputBehaviorOrBuilder
            public InputBehaviorConfiguration getConfiguration() {
                return ((SetInputBehavior) this.instance).getConfiguration();
            }

            @Override // com.amazon.alexa.accessory.protocol.Input.SetInputBehaviorOrBuilder
            public int getDeviceId() {
                return ((SetInputBehavior) this.instance).getDeviceId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Input.SetInputBehaviorOrBuilder
            public boolean hasConfiguration() {
                return ((SetInputBehavior) this.instance).hasConfiguration();
            }

            public Builder mergeConfiguration(InputBehaviorConfiguration inputBehaviorConfiguration) {
                copyOnWrite();
                ((SetInputBehavior) this.instance).mergeConfiguration(inputBehaviorConfiguration);
                return this;
            }

            public Builder setConfiguration(InputBehaviorConfiguration inputBehaviorConfiguration) {
                copyOnWrite();
                ((SetInputBehavior) this.instance).setConfiguration(inputBehaviorConfiguration);
                return this;
            }

            public Builder setDeviceId(int i) {
                copyOnWrite();
                ((SetInputBehavior) this.instance).setDeviceId(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setConfiguration(InputBehaviorConfiguration.Builder builder) {
                copyOnWrite();
                ((SetInputBehavior) this.instance).setConfiguration(builder);
                return this;
            }
        }

        public static Builder newBuilder(SetInputBehavior setInputBehavior) {
            return DEFAULT_INSTANCE.createBuilder(setInputBehavior);
        }

        public static SetInputBehavior parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetInputBehavior) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SetInputBehavior parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfiguration(InputBehaviorConfiguration inputBehaviorConfiguration) {
            inputBehaviorConfiguration.getClass();
            this.configuration_ = inputBehaviorConfiguration;
        }

        public static SetInputBehavior parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SetInputBehavior parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SetInputBehavior parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SetInputBehavior parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SetInputBehavior parseFrom(InputStream inputStream) throws IOException {
            return (SetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SetInputBehavior parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SetInputBehavior parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SetInputBehavior parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetInputBehavior extends GeneratedMessageLite<GetInputBehavior, Builder> implements GetInputBehaviorOrBuilder {
        private static final GetInputBehavior DEFAULT_INSTANCE;
        public static final int DEVICE_ID_FIELD_NUMBER = 1;
        private static volatile Parser<GetInputBehavior> PARSER;
        private int deviceId_;

        static {
            GetInputBehavior getInputBehavior = new GetInputBehavior();
            DEFAULT_INSTANCE = getInputBehavior;
            getInputBehavior.makeImmutable();
        }

        private GetInputBehavior() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceId() {
            this.deviceId_ = 0;
        }

        public static GetInputBehavior getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetInputBehavior parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetInputBehavior) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetInputBehavior parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetInputBehavior> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceId(int i) {
            this.deviceId_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetInputBehavior();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    GetInputBehavior getInputBehavior = (GetInputBehavior) obj2;
                    int i = this.deviceId_;
                    boolean z = i != 0;
                    int i2 = getInputBehavior.deviceId_;
                    this.deviceId_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    this.deviceId_ = codedInputStream.readUInt32();
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
                        synchronized (GetInputBehavior.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Input.GetInputBehaviorOrBuilder
        public int getDeviceId() {
            return this.deviceId_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.deviceId_;
            int serializedSize = this.unknownFields.getSerializedSize() + (i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.deviceId_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<GetInputBehavior, Builder> implements GetInputBehaviorOrBuilder {
            private Builder() {
                super(GetInputBehavior.DEFAULT_INSTANCE);
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((GetInputBehavior) this.instance).clearDeviceId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Input.GetInputBehaviorOrBuilder
            public int getDeviceId() {
                return ((GetInputBehavior) this.instance).getDeviceId();
            }

            public Builder setDeviceId(int i) {
                copyOnWrite();
                ((GetInputBehavior) this.instance).setDeviceId(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(GetInputBehavior getInputBehavior) {
            return DEFAULT_INSTANCE.createBuilder(getInputBehavior);
        }

        public static GetInputBehavior parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetInputBehavior) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetInputBehavior parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetInputBehavior parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetInputBehavior parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetInputBehavior parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetInputBehavior parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetInputBehavior parseFrom(InputStream inputStream) throws IOException {
            return (GetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetInputBehavior parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetInputBehavior parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetInputBehavior parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InputBehaviorConfiguration extends GeneratedMessageLite<InputBehaviorConfiguration, Builder> implements InputBehaviorConfigurationOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 1;
        public static final int BEHAVIOR_FIELD_NUMBER = 3;
        private static final InputBehaviorConfiguration DEFAULT_INSTANCE;
        private static volatile Parser<InputBehaviorConfiguration> PARSER = null;
        public static final int SOURCE_FIELD_NUMBER = 2;
        private int action_;
        private int behavior_;
        private int source_;

        static {
            InputBehaviorConfiguration inputBehaviorConfiguration = new InputBehaviorConfiguration();
            DEFAULT_INSTANCE = inputBehaviorConfiguration;
            inputBehaviorConfiguration.makeImmutable();
        }

        private InputBehaviorConfiguration() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBehavior() {
            this.behavior_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSource() {
            this.source_ = 0;
        }

        public static InputBehaviorConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static InputBehaviorConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (InputBehaviorConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InputBehaviorConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (InputBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<InputBehaviorConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(InputAction inputAction) {
            inputAction.getClass();
            this.action_ = inputAction.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionValue(int i) {
            this.action_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBehavior(InputBehavior inputBehavior) {
            inputBehavior.getClass();
            this.behavior_ = inputBehavior.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBehaviorValue(int i) {
            this.behavior_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSource(InputSource inputSource) {
            inputSource.getClass();
            this.source_ = inputSource.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceValue(int i) {
            this.source_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new InputBehaviorConfiguration();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    InputBehaviorConfiguration inputBehaviorConfiguration = (InputBehaviorConfiguration) obj2;
                    int i = this.action_;
                    boolean z = i != 0;
                    int i2 = inputBehaviorConfiguration.action_;
                    this.action_ = visitor.visitInt(z, i, i2 != 0, i2);
                    int i3 = this.source_;
                    boolean z2 = i3 != 0;
                    int i4 = inputBehaviorConfiguration.source_;
                    this.source_ = visitor.visitInt(z2, i3, i4 != 0, i4);
                    int i5 = this.behavior_;
                    boolean z3 = i5 != 0;
                    int i6 = inputBehaviorConfiguration.behavior_;
                    this.behavior_ = visitor.visitInt(z3, i5, i6 != 0, i6);
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
                                    this.action_ = codedInputStream.readEnum();
                                } else if (readTag == 16) {
                                    this.source_ = codedInputStream.readEnum();
                                } else if (readTag == 24) {
                                    this.behavior_ = codedInputStream.readEnum();
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
                        synchronized (InputBehaviorConfiguration.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Input.InputBehaviorConfigurationOrBuilder
        public InputAction getAction() {
            InputAction forNumber = InputAction.forNumber(this.action_);
            return forNumber == null ? InputAction.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Input.InputBehaviorConfigurationOrBuilder
        public int getActionValue() {
            return this.action_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Input.InputBehaviorConfigurationOrBuilder
        public InputBehavior getBehavior() {
            InputBehavior forNumber = InputBehavior.forNumber(this.behavior_);
            return forNumber == null ? InputBehavior.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Input.InputBehaviorConfigurationOrBuilder
        public int getBehaviorValue() {
            return this.behavior_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.action_ != InputAction.INPUT_ACTION_OTHER.getNumber() ? CodedOutputStream.computeEnumSize(1, this.action_) : 0;
            if (this.source_ != InputSource.INPUT_SOURCE_OTHER.getNumber()) {
                computeEnumSize += CodedOutputStream.computeEnumSize(2, this.source_);
            }
            if (this.behavior_ != InputBehavior.INPUT_BEHAVIOR_UNDEFINED.getNumber()) {
                computeEnumSize += CodedOutputStream.computeEnumSize(3, this.behavior_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Input.InputBehaviorConfigurationOrBuilder
        public InputSource getSource() {
            InputSource forNumber = InputSource.forNumber(this.source_);
            return forNumber == null ? InputSource.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Input.InputBehaviorConfigurationOrBuilder
        public int getSourceValue() {
            return this.source_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.action_ != InputAction.INPUT_ACTION_OTHER.getNumber()) {
                codedOutputStream.writeEnum(1, this.action_);
            }
            if (this.source_ != InputSource.INPUT_SOURCE_OTHER.getNumber()) {
                codedOutputStream.writeEnum(2, this.source_);
            }
            if (this.behavior_ != InputBehavior.INPUT_BEHAVIOR_UNDEFINED.getNumber()) {
                codedOutputStream.writeEnum(3, this.behavior_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<InputBehaviorConfiguration, Builder> implements InputBehaviorConfigurationOrBuilder {
            private Builder() {
                super(InputBehaviorConfiguration.DEFAULT_INSTANCE);
            }

            public Builder clearAction() {
                copyOnWrite();
                ((InputBehaviorConfiguration) this.instance).clearAction();
                return this;
            }

            public Builder clearBehavior() {
                copyOnWrite();
                ((InputBehaviorConfiguration) this.instance).clearBehavior();
                return this;
            }

            public Builder clearSource() {
                copyOnWrite();
                ((InputBehaviorConfiguration) this.instance).clearSource();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Input.InputBehaviorConfigurationOrBuilder
            public InputAction getAction() {
                return ((InputBehaviorConfiguration) this.instance).getAction();
            }

            @Override // com.amazon.alexa.accessory.protocol.Input.InputBehaviorConfigurationOrBuilder
            public int getActionValue() {
                return ((InputBehaviorConfiguration) this.instance).getActionValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Input.InputBehaviorConfigurationOrBuilder
            public InputBehavior getBehavior() {
                return ((InputBehaviorConfiguration) this.instance).getBehavior();
            }

            @Override // com.amazon.alexa.accessory.protocol.Input.InputBehaviorConfigurationOrBuilder
            public int getBehaviorValue() {
                return ((InputBehaviorConfiguration) this.instance).getBehaviorValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Input.InputBehaviorConfigurationOrBuilder
            public InputSource getSource() {
                return ((InputBehaviorConfiguration) this.instance).getSource();
            }

            @Override // com.amazon.alexa.accessory.protocol.Input.InputBehaviorConfigurationOrBuilder
            public int getSourceValue() {
                return ((InputBehaviorConfiguration) this.instance).getSourceValue();
            }

            public Builder setAction(InputAction inputAction) {
                copyOnWrite();
                ((InputBehaviorConfiguration) this.instance).setAction(inputAction);
                return this;
            }

            public Builder setActionValue(int i) {
                copyOnWrite();
                ((InputBehaviorConfiguration) this.instance).setActionValue(i);
                return this;
            }

            public Builder setBehavior(InputBehavior inputBehavior) {
                copyOnWrite();
                ((InputBehaviorConfiguration) this.instance).setBehavior(inputBehavior);
                return this;
            }

            public Builder setBehaviorValue(int i) {
                copyOnWrite();
                ((InputBehaviorConfiguration) this.instance).setBehaviorValue(i);
                return this;
            }

            public Builder setSource(InputSource inputSource) {
                copyOnWrite();
                ((InputBehaviorConfiguration) this.instance).setSource(inputSource);
                return this;
            }

            public Builder setSourceValue(int i) {
                copyOnWrite();
                ((InputBehaviorConfiguration) this.instance).setSourceValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(InputBehaviorConfiguration inputBehaviorConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(inputBehaviorConfiguration);
        }

        public static InputBehaviorConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InputBehaviorConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InputBehaviorConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InputBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static InputBehaviorConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (InputBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static InputBehaviorConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InputBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static InputBehaviorConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (InputBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static InputBehaviorConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InputBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static InputBehaviorConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (InputBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InputBehaviorConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InputBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InputBehaviorConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (InputBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static InputBehaviorConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InputBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class IssueInputEvent extends GeneratedMessageLite<IssueInputEvent, Builder> implements IssueInputEventOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 2;
        public static final int BEHAVIOR_FIELD_NUMBER = 4;
        private static final IssueInputEvent DEFAULT_INSTANCE;
        public static final int DEVICE_ID_FIELD_NUMBER = 1;
        private static volatile Parser<IssueInputEvent> PARSER = null;
        public static final int SOURCE_FIELD_NUMBER = 3;
        private int action_;
        private int behavior_;
        private int deviceId_;
        private int source_;

        static {
            IssueInputEvent issueInputEvent = new IssueInputEvent();
            DEFAULT_INSTANCE = issueInputEvent;
            issueInputEvent.makeImmutable();
        }

        private IssueInputEvent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBehavior() {
            this.behavior_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceId() {
            this.deviceId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSource() {
            this.source_ = 0;
        }

        public static IssueInputEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IssueInputEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (IssueInputEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IssueInputEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (IssueInputEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<IssueInputEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(InputAction inputAction) {
            inputAction.getClass();
            this.action_ = inputAction.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionValue(int i) {
            this.action_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBehavior(InputBehavior inputBehavior) {
            inputBehavior.getClass();
            this.behavior_ = inputBehavior.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBehaviorValue(int i) {
            this.behavior_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceId(int i) {
            this.deviceId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSource(InputSource inputSource) {
            inputSource.getClass();
            this.source_ = inputSource.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceValue(int i) {
            this.source_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new IssueInputEvent();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    IssueInputEvent issueInputEvent = (IssueInputEvent) obj2;
                    int i = this.deviceId_;
                    boolean z = i != 0;
                    int i2 = issueInputEvent.deviceId_;
                    this.deviceId_ = visitor.visitInt(z, i, i2 != 0, i2);
                    int i3 = this.action_;
                    boolean z2 = i3 != 0;
                    int i4 = issueInputEvent.action_;
                    this.action_ = visitor.visitInt(z2, i3, i4 != 0, i4);
                    int i5 = this.source_;
                    boolean z3 = i5 != 0;
                    int i6 = issueInputEvent.source_;
                    this.source_ = visitor.visitInt(z3, i5, i6 != 0, i6);
                    int i7 = this.behavior_;
                    boolean z4 = i7 != 0;
                    int i8 = issueInputEvent.behavior_;
                    this.behavior_ = visitor.visitInt(z4, i7, i8 != 0, i8);
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
                                    this.deviceId_ = codedInputStream.readUInt32();
                                } else if (readTag == 16) {
                                    this.action_ = codedInputStream.readEnum();
                                } else if (readTag == 24) {
                                    this.source_ = codedInputStream.readEnum();
                                } else if (readTag == 32) {
                                    this.behavior_ = codedInputStream.readEnum();
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
                        synchronized (IssueInputEvent.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Input.IssueInputEventOrBuilder
        public InputAction getAction() {
            InputAction forNumber = InputAction.forNumber(this.action_);
            return forNumber == null ? InputAction.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Input.IssueInputEventOrBuilder
        public int getActionValue() {
            return this.action_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Input.IssueInputEventOrBuilder
        public InputBehavior getBehavior() {
            InputBehavior forNumber = InputBehavior.forNumber(this.behavior_);
            return forNumber == null ? InputBehavior.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Input.IssueInputEventOrBuilder
        public int getBehaviorValue() {
            return this.behavior_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Input.IssueInputEventOrBuilder
        public int getDeviceId() {
            return this.deviceId_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.deviceId_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            if (this.action_ != InputAction.INPUT_ACTION_OTHER.getNumber()) {
                computeUInt32Size += CodedOutputStream.computeEnumSize(2, this.action_);
            }
            if (this.source_ != InputSource.INPUT_SOURCE_OTHER.getNumber()) {
                computeUInt32Size += CodedOutputStream.computeEnumSize(3, this.source_);
            }
            if (this.behavior_ != InputBehavior.INPUT_BEHAVIOR_UNDEFINED.getNumber()) {
                computeUInt32Size += CodedOutputStream.computeEnumSize(4, this.behavior_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Input.IssueInputEventOrBuilder
        public InputSource getSource() {
            InputSource forNumber = InputSource.forNumber(this.source_);
            return forNumber == null ? InputSource.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Input.IssueInputEventOrBuilder
        public int getSourceValue() {
            return this.source_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.deviceId_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            if (this.action_ != InputAction.INPUT_ACTION_OTHER.getNumber()) {
                codedOutputStream.writeEnum(2, this.action_);
            }
            if (this.source_ != InputSource.INPUT_SOURCE_OTHER.getNumber()) {
                codedOutputStream.writeEnum(3, this.source_);
            }
            if (this.behavior_ != InputBehavior.INPUT_BEHAVIOR_UNDEFINED.getNumber()) {
                codedOutputStream.writeEnum(4, this.behavior_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<IssueInputEvent, Builder> implements IssueInputEventOrBuilder {
            private Builder() {
                super(IssueInputEvent.DEFAULT_INSTANCE);
            }

            public Builder clearAction() {
                copyOnWrite();
                ((IssueInputEvent) this.instance).clearAction();
                return this;
            }

            public Builder clearBehavior() {
                copyOnWrite();
                ((IssueInputEvent) this.instance).clearBehavior();
                return this;
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((IssueInputEvent) this.instance).clearDeviceId();
                return this;
            }

            public Builder clearSource() {
                copyOnWrite();
                ((IssueInputEvent) this.instance).clearSource();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Input.IssueInputEventOrBuilder
            public InputAction getAction() {
                return ((IssueInputEvent) this.instance).getAction();
            }

            @Override // com.amazon.alexa.accessory.protocol.Input.IssueInputEventOrBuilder
            public int getActionValue() {
                return ((IssueInputEvent) this.instance).getActionValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Input.IssueInputEventOrBuilder
            public InputBehavior getBehavior() {
                return ((IssueInputEvent) this.instance).getBehavior();
            }

            @Override // com.amazon.alexa.accessory.protocol.Input.IssueInputEventOrBuilder
            public int getBehaviorValue() {
                return ((IssueInputEvent) this.instance).getBehaviorValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Input.IssueInputEventOrBuilder
            public int getDeviceId() {
                return ((IssueInputEvent) this.instance).getDeviceId();
            }

            @Override // com.amazon.alexa.accessory.protocol.Input.IssueInputEventOrBuilder
            public InputSource getSource() {
                return ((IssueInputEvent) this.instance).getSource();
            }

            @Override // com.amazon.alexa.accessory.protocol.Input.IssueInputEventOrBuilder
            public int getSourceValue() {
                return ((IssueInputEvent) this.instance).getSourceValue();
            }

            public Builder setAction(InputAction inputAction) {
                copyOnWrite();
                ((IssueInputEvent) this.instance).setAction(inputAction);
                return this;
            }

            public Builder setActionValue(int i) {
                copyOnWrite();
                ((IssueInputEvent) this.instance).setActionValue(i);
                return this;
            }

            public Builder setBehavior(InputBehavior inputBehavior) {
                copyOnWrite();
                ((IssueInputEvent) this.instance).setBehavior(inputBehavior);
                return this;
            }

            public Builder setBehaviorValue(int i) {
                copyOnWrite();
                ((IssueInputEvent) this.instance).setBehaviorValue(i);
                return this;
            }

            public Builder setDeviceId(int i) {
                copyOnWrite();
                ((IssueInputEvent) this.instance).setDeviceId(i);
                return this;
            }

            public Builder setSource(InputSource inputSource) {
                copyOnWrite();
                ((IssueInputEvent) this.instance).setSource(inputSource);
                return this;
            }

            public Builder setSourceValue(int i) {
                copyOnWrite();
                ((IssueInputEvent) this.instance).setSourceValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(IssueInputEvent issueInputEvent) {
            return DEFAULT_INSTANCE.createBuilder(issueInputEvent);
        }

        public static IssueInputEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (IssueInputEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static IssueInputEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (IssueInputEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static IssueInputEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (IssueInputEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static IssueInputEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (IssueInputEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static IssueInputEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (IssueInputEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IssueInputEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (IssueInputEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static IssueInputEvent parseFrom(InputStream inputStream) throws IOException {
            return (IssueInputEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IssueInputEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (IssueInputEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static IssueInputEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (IssueInputEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static IssueInputEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (IssueInputEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ResetInputBehavior extends GeneratedMessageLite<ResetInputBehavior, Builder> implements ResetInputBehaviorOrBuilder {
        private static final ResetInputBehavior DEFAULT_INSTANCE;
        public static final int DEVICE_ID_FIELD_NUMBER = 1;
        private static volatile Parser<ResetInputBehavior> PARSER;
        private int deviceId_;

        static {
            ResetInputBehavior resetInputBehavior = new ResetInputBehavior();
            DEFAULT_INSTANCE = resetInputBehavior;
            resetInputBehavior.makeImmutable();
        }

        private ResetInputBehavior() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceId() {
            this.deviceId_ = 0;
        }

        public static ResetInputBehavior getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ResetInputBehavior parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ResetInputBehavior) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResetInputBehavior parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ResetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ResetInputBehavior> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceId(int i) {
            this.deviceId_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ResetInputBehavior();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    ResetInputBehavior resetInputBehavior = (ResetInputBehavior) obj2;
                    int i = this.deviceId_;
                    boolean z = i != 0;
                    int i2 = resetInputBehavior.deviceId_;
                    this.deviceId_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    this.deviceId_ = codedInputStream.readUInt32();
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
                        synchronized (ResetInputBehavior.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Input.ResetInputBehaviorOrBuilder
        public int getDeviceId() {
            return this.deviceId_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.deviceId_;
            int serializedSize = this.unknownFields.getSerializedSize() + (i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.deviceId_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<ResetInputBehavior, Builder> implements ResetInputBehaviorOrBuilder {
            private Builder() {
                super(ResetInputBehavior.DEFAULT_INSTANCE);
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((ResetInputBehavior) this.instance).clearDeviceId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Input.ResetInputBehaviorOrBuilder
            public int getDeviceId() {
                return ((ResetInputBehavior) this.instance).getDeviceId();
            }

            public Builder setDeviceId(int i) {
                copyOnWrite();
                ((ResetInputBehavior) this.instance).setDeviceId(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(ResetInputBehavior resetInputBehavior) {
            return DEFAULT_INSTANCE.createBuilder(resetInputBehavior);
        }

        public static ResetInputBehavior parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResetInputBehavior) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ResetInputBehavior parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ResetInputBehavior parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ResetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ResetInputBehavior parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ResetInputBehavior parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ResetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ResetInputBehavior parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ResetInputBehavior parseFrom(InputStream inputStream) throws IOException {
            return (ResetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResetInputBehavior parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ResetInputBehavior parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ResetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ResetInputBehavior parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResetInputBehavior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum InputAction implements Internal.EnumLite {
        INPUT_ACTION_OTHER(0),
        INPUT_ACTION_TAP(1),
        INPUT_ACTION_DOUBLE_TAP(2),
        INPUT_ACTION_TAP_HOLD(3),
        INPUT_ACTION_PRESS(4),
        INPUT_ACTION_LONG_PRESS(5),
        INPUT_ACTION_RELEASE(6),
        INPUT_ACTION_SWIPE_FORWARD(7),
        INPUT_ACTION_SWIPE_BACK(8),
        INPUT_ACTION_SWIPE_UP(9),
        INPUT_ACTION_SWIPE_DOWN(10),
        INPUT_ACTION_SWIPE_LEFT(11),
        INPUT_ACTION_SWIPE_RIGHT(12),
        INPUT_ACTION_TRIPLE_TAP(13),
        UNRECOGNIZED(-1);

        public static final int INPUT_ACTION_DOUBLE_TAP_VALUE = 2;
        public static final int INPUT_ACTION_LONG_PRESS_VALUE = 5;
        public static final int INPUT_ACTION_OTHER_VALUE = 0;
        public static final int INPUT_ACTION_PRESS_VALUE = 4;
        public static final int INPUT_ACTION_RELEASE_VALUE = 6;
        public static final int INPUT_ACTION_SWIPE_BACK_VALUE = 8;
        public static final int INPUT_ACTION_SWIPE_DOWN_VALUE = 10;
        public static final int INPUT_ACTION_SWIPE_FORWARD_VALUE = 7;
        public static final int INPUT_ACTION_SWIPE_LEFT_VALUE = 11;
        public static final int INPUT_ACTION_SWIPE_RIGHT_VALUE = 12;
        public static final int INPUT_ACTION_SWIPE_UP_VALUE = 9;
        public static final int INPUT_ACTION_TAP_HOLD_VALUE = 3;
        public static final int INPUT_ACTION_TAP_VALUE = 1;
        public static final int INPUT_ACTION_TRIPLE_TAP_VALUE = 13;
        private static final Internal.EnumLiteMap<InputAction> internalValueMap = new Internal.EnumLiteMap<InputAction>() { // from class: com.amazon.alexa.accessory.protocol.Input.InputAction.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public InputAction findValueByNumber(int i) {
                return InputAction.forNumber(i);
            }
        };
        private final int value;

        InputAction(int i) {
            this.value = i;
        }

        public static InputAction forNumber(int i) {
            switch (i) {
                case 0:
                    return INPUT_ACTION_OTHER;
                case 1:
                    return INPUT_ACTION_TAP;
                case 2:
                    return INPUT_ACTION_DOUBLE_TAP;
                case 3:
                    return INPUT_ACTION_TAP_HOLD;
                case 4:
                    return INPUT_ACTION_PRESS;
                case 5:
                    return INPUT_ACTION_LONG_PRESS;
                case 6:
                    return INPUT_ACTION_RELEASE;
                case 7:
                    return INPUT_ACTION_SWIPE_FORWARD;
                case 8:
                    return INPUT_ACTION_SWIPE_BACK;
                case 9:
                    return INPUT_ACTION_SWIPE_UP;
                case 10:
                    return INPUT_ACTION_SWIPE_DOWN;
                case 11:
                    return INPUT_ACTION_SWIPE_LEFT;
                case 12:
                    return INPUT_ACTION_SWIPE_RIGHT;
                case 13:
                    return INPUT_ACTION_TRIPLE_TAP;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<InputAction> internalGetValueMap() {
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
        public static InputAction valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum InputBehavior implements Internal.EnumLite {
        INPUT_BEHAVIOR_UNDEFINED(0),
        INPUT_BEHAVIOR_MEDIA_PLAY_PAUSE(1),
        INPUT_BEHAVIOR_MEDIA_NEXT(2),
        INPUT_BEHAVIOR_MEDIA_PREVIOUS(3),
        INPUT_BEHAVIOR_MEDIA_SMART_PLAY_PAUSE(4),
        INPUT_BEHAVIOR_VOICE_ALEXA(10),
        INPUT_BEHAVIOR_VOICE_PLATFORM(11),
        INPUT_BEHAVIOR_PASSTHROUGH_MODE(15),
        INPUT_BEHAVIOR_ANC(16),
        INPUT_BEHAVIOR_MICROPHONE_MUTE(17),
        INPUT_BEHAVIOR_PASSTHROUGH_ANC(18),
        INPUT_BEHAVIOR_VOLUME_UP(19),
        INPUT_BEHAVIOR_VOLUME_DOWN(20),
        INPUT_BEHAVIOR_TRIGGER_ROUTINE(21),
        INPUT_BEHAVIOR_VIP_FILTER_POSITIVE_RESPONSE(22),
        INPUT_BEHAVIOR_VIP_FILTER_NEGATIVE_RESPONSE(23),
        INPUT_BEHAVIOR_VIP_FILTER_DISTRACTION_MODE(24),
        INPUT_BEHAVIOR_VIP_FILTER_PHONE_NOTIFICATION_MODE(25),
        INPUT_BEHAVIOR_VIP_FILTER_READ_LAST_NOTIFICATION(26),
        INPUT_BEHAVIOR_TOP_CONTACT_CALLING(27),
        INPUT_BEHAVIOR_SELECT_AND_PLAY(28),
        INPUT_BEHAVIOR_VIP_FILTER_MUTE_NOTIFICATIONS(29),
        INPUT_BEHAVIOR_POWER_OFF(30),
        INPUT_BEHAVIOR_LIVE_TRANSLATION(31),
        INPUT_BEHAVIOR_LIVE_MODE(32),
        INPUT_BEHAVIOR_AUTO_CAPTURE(33),
        UNRECOGNIZED(-1);

        public static final int INPUT_BEHAVIOR_ANC_VALUE = 16;
        public static final int INPUT_BEHAVIOR_AUTO_CAPTURE_VALUE = 33;
        public static final int INPUT_BEHAVIOR_LIVE_MODE_VALUE = 32;
        public static final int INPUT_BEHAVIOR_LIVE_TRANSLATION_VALUE = 31;
        public static final int INPUT_BEHAVIOR_MEDIA_NEXT_VALUE = 2;
        public static final int INPUT_BEHAVIOR_MEDIA_PLAY_PAUSE_VALUE = 1;
        public static final int INPUT_BEHAVIOR_MEDIA_PREVIOUS_VALUE = 3;
        public static final int INPUT_BEHAVIOR_MEDIA_SMART_PLAY_PAUSE_VALUE = 4;
        public static final int INPUT_BEHAVIOR_MICROPHONE_MUTE_VALUE = 17;
        public static final int INPUT_BEHAVIOR_PASSTHROUGH_ANC_VALUE = 18;
        public static final int INPUT_BEHAVIOR_PASSTHROUGH_MODE_VALUE = 15;
        public static final int INPUT_BEHAVIOR_POWER_OFF_VALUE = 30;
        public static final int INPUT_BEHAVIOR_SELECT_AND_PLAY_VALUE = 28;
        public static final int INPUT_BEHAVIOR_TOP_CONTACT_CALLING_VALUE = 27;
        public static final int INPUT_BEHAVIOR_TRIGGER_ROUTINE_VALUE = 21;
        public static final int INPUT_BEHAVIOR_UNDEFINED_VALUE = 0;
        public static final int INPUT_BEHAVIOR_VIP_FILTER_DISTRACTION_MODE_VALUE = 24;
        public static final int INPUT_BEHAVIOR_VIP_FILTER_MUTE_NOTIFICATIONS_VALUE = 29;
        public static final int INPUT_BEHAVIOR_VIP_FILTER_NEGATIVE_RESPONSE_VALUE = 23;
        public static final int INPUT_BEHAVIOR_VIP_FILTER_PHONE_NOTIFICATION_MODE_VALUE = 25;
        public static final int INPUT_BEHAVIOR_VIP_FILTER_POSITIVE_RESPONSE_VALUE = 22;
        public static final int INPUT_BEHAVIOR_VIP_FILTER_READ_LAST_NOTIFICATION_VALUE = 26;
        public static final int INPUT_BEHAVIOR_VOICE_ALEXA_VALUE = 10;
        public static final int INPUT_BEHAVIOR_VOICE_PLATFORM_VALUE = 11;
        public static final int INPUT_BEHAVIOR_VOLUME_DOWN_VALUE = 20;
        public static final int INPUT_BEHAVIOR_VOLUME_UP_VALUE = 19;
        private static final Internal.EnumLiteMap<InputBehavior> internalValueMap = new Internal.EnumLiteMap<InputBehavior>() { // from class: com.amazon.alexa.accessory.protocol.Input.InputBehavior.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public InputBehavior findValueByNumber(int i) {
                return InputBehavior.forNumber(i);
            }
        };
        private final int value;

        InputBehavior(int i) {
            this.value = i;
        }

        public static InputBehavior forNumber(int i) {
            if (i == 0) {
                return INPUT_BEHAVIOR_UNDEFINED;
            }
            if (i == 1) {
                return INPUT_BEHAVIOR_MEDIA_PLAY_PAUSE;
            }
            if (i == 2) {
                return INPUT_BEHAVIOR_MEDIA_NEXT;
            }
            if (i == 3) {
                return INPUT_BEHAVIOR_MEDIA_PREVIOUS;
            }
            if (i == 4) {
                return INPUT_BEHAVIOR_MEDIA_SMART_PLAY_PAUSE;
            }
            if (i == 10) {
                return INPUT_BEHAVIOR_VOICE_ALEXA;
            }
            if (i == 11) {
                return INPUT_BEHAVIOR_VOICE_PLATFORM;
            }
            switch (i) {
                case 15:
                    return INPUT_BEHAVIOR_PASSTHROUGH_MODE;
                case 16:
                    return INPUT_BEHAVIOR_ANC;
                case 17:
                    return INPUT_BEHAVIOR_MICROPHONE_MUTE;
                case 18:
                    return INPUT_BEHAVIOR_PASSTHROUGH_ANC;
                case 19:
                    return INPUT_BEHAVIOR_VOLUME_UP;
                case 20:
                    return INPUT_BEHAVIOR_VOLUME_DOWN;
                case 21:
                    return INPUT_BEHAVIOR_TRIGGER_ROUTINE;
                case 22:
                    return INPUT_BEHAVIOR_VIP_FILTER_POSITIVE_RESPONSE;
                case 23:
                    return INPUT_BEHAVIOR_VIP_FILTER_NEGATIVE_RESPONSE;
                case 24:
                    return INPUT_BEHAVIOR_VIP_FILTER_DISTRACTION_MODE;
                case 25:
                    return INPUT_BEHAVIOR_VIP_FILTER_PHONE_NOTIFICATION_MODE;
                case 26:
                    return INPUT_BEHAVIOR_VIP_FILTER_READ_LAST_NOTIFICATION;
                case 27:
                    return INPUT_BEHAVIOR_TOP_CONTACT_CALLING;
                case 28:
                    return INPUT_BEHAVIOR_SELECT_AND_PLAY;
                case 29:
                    return INPUT_BEHAVIOR_VIP_FILTER_MUTE_NOTIFICATIONS;
                case 30:
                    return INPUT_BEHAVIOR_POWER_OFF;
                case 31:
                    return INPUT_BEHAVIOR_LIVE_TRANSLATION;
                case 32:
                    return INPUT_BEHAVIOR_LIVE_MODE;
                case 33:
                    return INPUT_BEHAVIOR_AUTO_CAPTURE;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<InputBehavior> internalGetValueMap() {
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
        public static InputBehavior valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum InputSource implements Internal.EnumLite {
        INPUT_SOURCE_OTHER(0),
        INPUT_SOURCE_TOUCHPAD(1),
        INPUT_SOURCE_VOLUME_UP(2),
        INPUT_SOURCE_VOLUME_DOWN(3),
        INPUT_SOURCE_ACTION(4),
        INPUT_SOURCE_FRONT_RIGHT(5),
        INPUT_SOURCE_BACK_RIGHT(6),
        UNRECOGNIZED(-1);

        public static final int INPUT_SOURCE_ACTION_VALUE = 4;
        public static final int INPUT_SOURCE_BACK_RIGHT_VALUE = 6;
        public static final int INPUT_SOURCE_FRONT_RIGHT_VALUE = 5;
        public static final int INPUT_SOURCE_OTHER_VALUE = 0;
        public static final int INPUT_SOURCE_TOUCHPAD_VALUE = 1;
        public static final int INPUT_SOURCE_VOLUME_DOWN_VALUE = 3;
        public static final int INPUT_SOURCE_VOLUME_UP_VALUE = 2;
        private static final Internal.EnumLiteMap<InputSource> internalValueMap = new Internal.EnumLiteMap<InputSource>() { // from class: com.amazon.alexa.accessory.protocol.Input.InputSource.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public InputSource findValueByNumber(int i) {
                return InputSource.forNumber(i);
            }
        };
        private final int value;

        InputSource(int i) {
            this.value = i;
        }

        public static InputSource forNumber(int i) {
            switch (i) {
                case 0:
                    return INPUT_SOURCE_OTHER;
                case 1:
                    return INPUT_SOURCE_TOUCHPAD;
                case 2:
                    return INPUT_SOURCE_VOLUME_UP;
                case 3:
                    return INPUT_SOURCE_VOLUME_DOWN;
                case 4:
                    return INPUT_SOURCE_ACTION;
                case 5:
                    return INPUT_SOURCE_FRONT_RIGHT;
                case 6:
                    return INPUT_SOURCE_BACK_RIGHT;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<InputSource> internalGetValueMap() {
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
        public static InputSource valueOf(int i) {
            return forNumber(i);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
