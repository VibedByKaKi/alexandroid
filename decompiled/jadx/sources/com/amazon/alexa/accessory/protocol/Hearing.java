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
public final class Hearing {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.Hearing$1, reason: invalid class name */
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
    public interface AudioBandOrBuilder extends MessageLiteOrBuilder {
        float getFc();

        float getValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AudioChannelOrBuilder extends MessageLiteOrBuilder {
        AudioBand getBands(int i);

        int getBandsCount();

        List<AudioBand> getBandsList();

        AudioChannelType getType();

        int getTypeValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AudiogramOrBuilder extends MessageLiteOrBuilder {
        AudioChannel getAudiogram(int i);

        int getAudiogramCount();

        List<AudioChannel> getAudiogramList();

        int getDeviceId();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetAudiogramOrBuilder extends MessageLiteOrBuilder {
        int getDeviceId();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetMediaEnhancementCorrectionAmountOrBuilder extends MessageLiteOrBuilder {
        int getDeviceId();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface MediaEnhancementCorrectionAmountOrBuilder extends MessageLiteOrBuilder {
        int getCorrectionAmount();

        int getDeviceId();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SetAudiogramOrBuilder extends MessageLiteOrBuilder {
        Audiogram getAudiogram();

        boolean hasAudiogram();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SetMediaEnhancementCorrectionAmountOrBuilder extends MessageLiteOrBuilder {
        MediaEnhancementCorrectionAmount getCorrectionAmount();

        boolean hasCorrectionAmount();
    }

    private Hearing() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AudioChannel extends GeneratedMessageLite<AudioChannel, Builder> implements AudioChannelOrBuilder {
        public static final int BANDS_FIELD_NUMBER = 2;
        private static final AudioChannel DEFAULT_INSTANCE;
        private static volatile Parser<AudioChannel> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private Internal.ProtobufList<AudioBand> bands_ = GeneratedMessageLite.emptyProtobufList();
        private int bitField0_;
        private int type_;

        static {
            AudioChannel audioChannel = new AudioChannel();
            DEFAULT_INSTANCE = audioChannel;
            audioChannel.makeImmutable();
        }

        private AudioChannel() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBands(Iterable<? extends AudioBand> iterable) {
            ensureBandsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.bands_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBands(AudioBand.Builder builder) {
            ensureBandsIsMutable();
            this.bands_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBands() {
            this.bands_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        private void ensureBandsIsMutable() {
            if (this.bands_.isModifiable()) {
                return;
            }
            this.bands_ = GeneratedMessageLite.mutableCopy(this.bands_);
        }

        public static AudioChannel getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AudioChannel parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AudioChannel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AudioChannel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AudioChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AudioChannel> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeBands(int i) {
            ensureBandsIsMutable();
            this.bands_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBands(int i, AudioBand.Builder builder) {
            ensureBandsIsMutable();
            this.bands_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(AudioChannelType audioChannelType) {
            audioChannelType.getClass();
            this.type_ = audioChannelType.getNumber();
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
                    return new AudioChannel();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.bands_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    AudioChannel audioChannel = (AudioChannel) obj2;
                    int i = this.type_;
                    boolean z = i != 0;
                    int i2 = audioChannel.type_;
                    this.type_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.bands_ = visitor.visitList(this.bands_, audioChannel.bands_);
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                        this.bitField0_ |= audioChannel.bitField0_;
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
                                    this.type_ = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    if (!this.bands_.isModifiable()) {
                                        this.bands_ = GeneratedMessageLite.mutableCopy(this.bands_);
                                    }
                                    this.bands_.add((AudioBand) codedInputStream.readMessage(AudioBand.parser(), extensionRegistryLite));
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
                        synchronized (AudioChannel.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Hearing.AudioChannelOrBuilder
        public AudioBand getBands(int i) {
            return this.bands_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Hearing.AudioChannelOrBuilder
        public int getBandsCount() {
            return this.bands_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Hearing.AudioChannelOrBuilder
        public List<AudioBand> getBandsList() {
            return this.bands_;
        }

        public AudioBandOrBuilder getBandsOrBuilder(int i) {
            return this.bands_.get(i);
        }

        public List<? extends AudioBandOrBuilder> getBandsOrBuilderList() {
            return this.bands_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.type_ != AudioChannelType.ALL.getNumber() ? CodedOutputStream.computeEnumSize(1, this.type_) : 0;
            for (int i2 = 0; i2 < this.bands_.size(); i2++) {
                computeEnumSize += CodedOutputStream.computeMessageSize(2, this.bands_.get(i2));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Hearing.AudioChannelOrBuilder
        public AudioChannelType getType() {
            AudioChannelType forNumber = AudioChannelType.forNumber(this.type_);
            return forNumber == null ? AudioChannelType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Hearing.AudioChannelOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != AudioChannelType.ALL.getNumber()) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            for (int i = 0; i < this.bands_.size(); i++) {
                codedOutputStream.writeMessage(2, this.bands_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<AudioChannel, Builder> implements AudioChannelOrBuilder {
            private Builder() {
                super(AudioChannel.DEFAULT_INSTANCE);
            }

            public Builder addAllBands(Iterable<? extends AudioBand> iterable) {
                copyOnWrite();
                ((AudioChannel) this.instance).addAllBands(iterable);
                return this;
            }

            public Builder addBands(AudioBand audioBand) {
                copyOnWrite();
                ((AudioChannel) this.instance).addBands(audioBand);
                return this;
            }

            public Builder clearBands() {
                copyOnWrite();
                ((AudioChannel) this.instance).clearBands();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((AudioChannel) this.instance).clearType();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Hearing.AudioChannelOrBuilder
            public AudioBand getBands(int i) {
                return ((AudioChannel) this.instance).getBands(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Hearing.AudioChannelOrBuilder
            public int getBandsCount() {
                return ((AudioChannel) this.instance).getBandsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Hearing.AudioChannelOrBuilder
            public List<AudioBand> getBandsList() {
                return Collections.unmodifiableList(((AudioChannel) this.instance).getBandsList());
            }

            @Override // com.amazon.alexa.accessory.protocol.Hearing.AudioChannelOrBuilder
            public AudioChannelType getType() {
                return ((AudioChannel) this.instance).getType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Hearing.AudioChannelOrBuilder
            public int getTypeValue() {
                return ((AudioChannel) this.instance).getTypeValue();
            }

            public Builder removeBands(int i) {
                copyOnWrite();
                ((AudioChannel) this.instance).removeBands(i);
                return this;
            }

            public Builder setBands(int i, AudioBand audioBand) {
                copyOnWrite();
                ((AudioChannel) this.instance).setBands(i, audioBand);
                return this;
            }

            public Builder setType(AudioChannelType audioChannelType) {
                copyOnWrite();
                ((AudioChannel) this.instance).setType(audioChannelType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((AudioChannel) this.instance).setTypeValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addBands(int i, AudioBand audioBand) {
                copyOnWrite();
                ((AudioChannel) this.instance).addBands(i, audioBand);
                return this;
            }

            public Builder setBands(int i, AudioBand.Builder builder) {
                copyOnWrite();
                ((AudioChannel) this.instance).setBands(i, builder);
                return this;
            }

            public Builder addBands(AudioBand.Builder builder) {
                copyOnWrite();
                ((AudioChannel) this.instance).addBands(builder);
                return this;
            }

            public Builder addBands(int i, AudioBand.Builder builder) {
                copyOnWrite();
                ((AudioChannel) this.instance).addBands(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(AudioChannel audioChannel) {
            return DEFAULT_INSTANCE.createBuilder(audioChannel);
        }

        public static AudioChannel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AudioChannel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AudioChannel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AudioChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AudioChannel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AudioChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AudioChannel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AudioChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AudioChannel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AudioChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AudioChannel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AudioChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AudioChannel parseFrom(InputStream inputStream) throws IOException {
            return (AudioChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBands(int i, AudioBand audioBand) {
            audioBand.getClass();
            ensureBandsIsMutable();
            this.bands_.add(i, audioBand);
        }

        public static AudioChannel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AudioChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBands(int i, AudioBand audioBand) {
            audioBand.getClass();
            ensureBandsIsMutable();
            this.bands_.set(i, audioBand);
        }

        public static AudioChannel parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AudioChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AudioChannel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AudioChannel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBands(AudioBand audioBand) {
            audioBand.getClass();
            ensureBandsIsMutable();
            this.bands_.add(audioBand);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBands(int i, AudioBand.Builder builder) {
            ensureBandsIsMutable();
            this.bands_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Audiogram extends GeneratedMessageLite<Audiogram, Builder> implements AudiogramOrBuilder {
        public static final int AUDIOGRAM_FIELD_NUMBER = 2;
        private static final Audiogram DEFAULT_INSTANCE;
        public static final int DEVICE_ID_FIELD_NUMBER = 1;
        private static volatile Parser<Audiogram> PARSER;
        private Internal.ProtobufList<AudioChannel> audiogram_ = GeneratedMessageLite.emptyProtobufList();
        private int bitField0_;
        private int deviceId_;

        static {
            Audiogram audiogram = new Audiogram();
            DEFAULT_INSTANCE = audiogram;
            audiogram.makeImmutable();
        }

        private Audiogram() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAudiogram(Iterable<? extends AudioChannel> iterable) {
            ensureAudiogramIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.audiogram_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAudiogram(AudioChannel.Builder builder) {
            ensureAudiogramIsMutable();
            this.audiogram_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAudiogram() {
            this.audiogram_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceId() {
            this.deviceId_ = 0;
        }

        private void ensureAudiogramIsMutable() {
            if (this.audiogram_.isModifiable()) {
                return;
            }
            this.audiogram_ = GeneratedMessageLite.mutableCopy(this.audiogram_);
        }

        public static Audiogram getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Audiogram parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Audiogram) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Audiogram parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Audiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Audiogram> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAudiogram(int i) {
            ensureAudiogramIsMutable();
            this.audiogram_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudiogram(int i, AudioChannel.Builder builder) {
            ensureAudiogramIsMutable();
            this.audiogram_.set(i, builder.build());
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
                    return new Audiogram();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.audiogram_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    Audiogram audiogram = (Audiogram) obj2;
                    int i = this.deviceId_;
                    boolean z = i != 0;
                    int i2 = audiogram.deviceId_;
                    this.deviceId_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.audiogram_ = visitor.visitList(this.audiogram_, audiogram.audiogram_);
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                        this.bitField0_ |= audiogram.bitField0_;
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
                                    this.deviceId_ = codedInputStream.readUInt32();
                                } else if (readTag == 18) {
                                    if (!this.audiogram_.isModifiable()) {
                                        this.audiogram_ = GeneratedMessageLite.mutableCopy(this.audiogram_);
                                    }
                                    this.audiogram_.add((AudioChannel) codedInputStream.readMessage(AudioChannel.parser(), extensionRegistryLite));
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
                        synchronized (Audiogram.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Hearing.AudiogramOrBuilder
        public AudioChannel getAudiogram(int i) {
            return this.audiogram_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.Hearing.AudiogramOrBuilder
        public int getAudiogramCount() {
            return this.audiogram_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.Hearing.AudiogramOrBuilder
        public List<AudioChannel> getAudiogramList() {
            return this.audiogram_;
        }

        public AudioChannelOrBuilder getAudiogramOrBuilder(int i) {
            return this.audiogram_.get(i);
        }

        public List<? extends AudioChannelOrBuilder> getAudiogramOrBuilderList() {
            return this.audiogram_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Hearing.AudiogramOrBuilder
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
            for (int i3 = 0; i3 < this.audiogram_.size(); i3++) {
                computeUInt32Size += CodedOutputStream.computeMessageSize(2, this.audiogram_.get(i3));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.deviceId_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            for (int i2 = 0; i2 < this.audiogram_.size(); i2++) {
                codedOutputStream.writeMessage(2, this.audiogram_.get(i2));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<Audiogram, Builder> implements AudiogramOrBuilder {
            private Builder() {
                super(Audiogram.DEFAULT_INSTANCE);
            }

            public Builder addAllAudiogram(Iterable<? extends AudioChannel> iterable) {
                copyOnWrite();
                ((Audiogram) this.instance).addAllAudiogram(iterable);
                return this;
            }

            public Builder addAudiogram(AudioChannel audioChannel) {
                copyOnWrite();
                ((Audiogram) this.instance).addAudiogram(audioChannel);
                return this;
            }

            public Builder clearAudiogram() {
                copyOnWrite();
                ((Audiogram) this.instance).clearAudiogram();
                return this;
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((Audiogram) this.instance).clearDeviceId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Hearing.AudiogramOrBuilder
            public AudioChannel getAudiogram(int i) {
                return ((Audiogram) this.instance).getAudiogram(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.Hearing.AudiogramOrBuilder
            public int getAudiogramCount() {
                return ((Audiogram) this.instance).getAudiogramCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Hearing.AudiogramOrBuilder
            public List<AudioChannel> getAudiogramList() {
                return Collections.unmodifiableList(((Audiogram) this.instance).getAudiogramList());
            }

            @Override // com.amazon.alexa.accessory.protocol.Hearing.AudiogramOrBuilder
            public int getDeviceId() {
                return ((Audiogram) this.instance).getDeviceId();
            }

            public Builder removeAudiogram(int i) {
                copyOnWrite();
                ((Audiogram) this.instance).removeAudiogram(i);
                return this;
            }

            public Builder setAudiogram(int i, AudioChannel audioChannel) {
                copyOnWrite();
                ((Audiogram) this.instance).setAudiogram(i, audioChannel);
                return this;
            }

            public Builder setDeviceId(int i) {
                copyOnWrite();
                ((Audiogram) this.instance).setDeviceId(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addAudiogram(int i, AudioChannel audioChannel) {
                copyOnWrite();
                ((Audiogram) this.instance).addAudiogram(i, audioChannel);
                return this;
            }

            public Builder setAudiogram(int i, AudioChannel.Builder builder) {
                copyOnWrite();
                ((Audiogram) this.instance).setAudiogram(i, builder);
                return this;
            }

            public Builder addAudiogram(AudioChannel.Builder builder) {
                copyOnWrite();
                ((Audiogram) this.instance).addAudiogram(builder);
                return this;
            }

            public Builder addAudiogram(int i, AudioChannel.Builder builder) {
                copyOnWrite();
                ((Audiogram) this.instance).addAudiogram(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(Audiogram audiogram) {
            return DEFAULT_INSTANCE.createBuilder(audiogram);
        }

        public static Audiogram parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Audiogram) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Audiogram parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Audiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Audiogram parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Audiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Audiogram parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Audiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Audiogram parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Audiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Audiogram parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Audiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Audiogram parseFrom(InputStream inputStream) throws IOException {
            return (Audiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAudiogram(int i, AudioChannel audioChannel) {
            audioChannel.getClass();
            ensureAudiogramIsMutable();
            this.audiogram_.add(i, audioChannel);
        }

        public static Audiogram parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Audiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudiogram(int i, AudioChannel audioChannel) {
            audioChannel.getClass();
            ensureAudiogramIsMutable();
            this.audiogram_.set(i, audioChannel);
        }

        public static Audiogram parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Audiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Audiogram parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Audiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAudiogram(AudioChannel audioChannel) {
            audioChannel.getClass();
            ensureAudiogramIsMutable();
            this.audiogram_.add(audioChannel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAudiogram(int i, AudioChannel.Builder builder) {
            ensureAudiogramIsMutable();
            this.audiogram_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SetAudiogram extends GeneratedMessageLite<SetAudiogram, Builder> implements SetAudiogramOrBuilder {
        public static final int AUDIOGRAM_FIELD_NUMBER = 1;
        private static final SetAudiogram DEFAULT_INSTANCE;
        private static volatile Parser<SetAudiogram> PARSER;
        private Audiogram audiogram_;

        static {
            SetAudiogram setAudiogram = new SetAudiogram();
            DEFAULT_INSTANCE = setAudiogram;
            setAudiogram.makeImmutable();
        }

        private SetAudiogram() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAudiogram() {
            this.audiogram_ = null;
        }

        public static SetAudiogram getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAudiogram(Audiogram audiogram) {
            Audiogram audiogram2 = this.audiogram_;
            if (audiogram2 == null || audiogram2 == Audiogram.getDefaultInstance()) {
                this.audiogram_ = audiogram;
            } else {
                this.audiogram_ = Audiogram.newBuilder(this.audiogram_).mergeFrom((Audiogram.Builder) audiogram).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SetAudiogram parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SetAudiogram) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SetAudiogram parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SetAudiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SetAudiogram> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudiogram(Audiogram.Builder builder) {
            this.audiogram_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SetAudiogram();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.audiogram_ = (Audiogram) ((GeneratedMessageLite.Visitor) obj).visitMessage(this.audiogram_, ((SetAudiogram) obj2).audiogram_);
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
                                    Audiogram audiogram = this.audiogram_;
                                    Audiogram.Builder builder = audiogram != null ? audiogram.toBuilder() : null;
                                    Audiogram audiogram2 = (Audiogram) codedInputStream.readMessage(Audiogram.parser(), extensionRegistryLite);
                                    this.audiogram_ = audiogram2;
                                    if (builder != null) {
                                        builder.mergeFrom((Audiogram.Builder) audiogram2);
                                        this.audiogram_ = builder.buildPartial();
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
                        synchronized (SetAudiogram.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Hearing.SetAudiogramOrBuilder
        public Audiogram getAudiogram() {
            Audiogram audiogram = this.audiogram_;
            return audiogram == null ? Audiogram.getDefaultInstance() : audiogram;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.audiogram_ != null ? CodedOutputStream.computeMessageSize(1, getAudiogram()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Hearing.SetAudiogramOrBuilder
        public boolean hasAudiogram() {
            return this.audiogram_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.audiogram_ != null) {
                codedOutputStream.writeMessage(1, getAudiogram());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SetAudiogram, Builder> implements SetAudiogramOrBuilder {
            private Builder() {
                super(SetAudiogram.DEFAULT_INSTANCE);
            }

            public Builder clearAudiogram() {
                copyOnWrite();
                ((SetAudiogram) this.instance).clearAudiogram();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Hearing.SetAudiogramOrBuilder
            public Audiogram getAudiogram() {
                return ((SetAudiogram) this.instance).getAudiogram();
            }

            @Override // com.amazon.alexa.accessory.protocol.Hearing.SetAudiogramOrBuilder
            public boolean hasAudiogram() {
                return ((SetAudiogram) this.instance).hasAudiogram();
            }

            public Builder mergeAudiogram(Audiogram audiogram) {
                copyOnWrite();
                ((SetAudiogram) this.instance).mergeAudiogram(audiogram);
                return this;
            }

            public Builder setAudiogram(Audiogram audiogram) {
                copyOnWrite();
                ((SetAudiogram) this.instance).setAudiogram(audiogram);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setAudiogram(Audiogram.Builder builder) {
                copyOnWrite();
                ((SetAudiogram) this.instance).setAudiogram(builder);
                return this;
            }
        }

        public static Builder newBuilder(SetAudiogram setAudiogram) {
            return DEFAULT_INSTANCE.createBuilder(setAudiogram);
        }

        public static SetAudiogram parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetAudiogram) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SetAudiogram parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetAudiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudiogram(Audiogram audiogram) {
            audiogram.getClass();
            this.audiogram_ = audiogram;
        }

        public static SetAudiogram parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SetAudiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SetAudiogram parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetAudiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SetAudiogram parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SetAudiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SetAudiogram parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetAudiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SetAudiogram parseFrom(InputStream inputStream) throws IOException {
            return (SetAudiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SetAudiogram parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetAudiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SetAudiogram parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SetAudiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SetAudiogram parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetAudiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SetMediaEnhancementCorrectionAmount extends GeneratedMessageLite<SetMediaEnhancementCorrectionAmount, Builder> implements SetMediaEnhancementCorrectionAmountOrBuilder {
        public static final int CORRECTION_AMOUNT_FIELD_NUMBER = 1;
        private static final SetMediaEnhancementCorrectionAmount DEFAULT_INSTANCE;
        private static volatile Parser<SetMediaEnhancementCorrectionAmount> PARSER;
        private MediaEnhancementCorrectionAmount correctionAmount_;

        static {
            SetMediaEnhancementCorrectionAmount setMediaEnhancementCorrectionAmount = new SetMediaEnhancementCorrectionAmount();
            DEFAULT_INSTANCE = setMediaEnhancementCorrectionAmount;
            setMediaEnhancementCorrectionAmount.makeImmutable();
        }

        private SetMediaEnhancementCorrectionAmount() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCorrectionAmount() {
            this.correctionAmount_ = null;
        }

        public static SetMediaEnhancementCorrectionAmount getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCorrectionAmount(MediaEnhancementCorrectionAmount mediaEnhancementCorrectionAmount) {
            MediaEnhancementCorrectionAmount mediaEnhancementCorrectionAmount2 = this.correctionAmount_;
            if (mediaEnhancementCorrectionAmount2 == null || mediaEnhancementCorrectionAmount2 == MediaEnhancementCorrectionAmount.getDefaultInstance()) {
                this.correctionAmount_ = mediaEnhancementCorrectionAmount;
            } else {
                this.correctionAmount_ = MediaEnhancementCorrectionAmount.newBuilder(this.correctionAmount_).mergeFrom((MediaEnhancementCorrectionAmount.Builder) mediaEnhancementCorrectionAmount).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SetMediaEnhancementCorrectionAmount parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SetMediaEnhancementCorrectionAmount parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SetMediaEnhancementCorrectionAmount> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCorrectionAmount(MediaEnhancementCorrectionAmount.Builder builder) {
            this.correctionAmount_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SetMediaEnhancementCorrectionAmount();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.correctionAmount_ = (MediaEnhancementCorrectionAmount) ((GeneratedMessageLite.Visitor) obj).visitMessage(this.correctionAmount_, ((SetMediaEnhancementCorrectionAmount) obj2).correctionAmount_);
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
                                    MediaEnhancementCorrectionAmount mediaEnhancementCorrectionAmount = this.correctionAmount_;
                                    MediaEnhancementCorrectionAmount.Builder builder = mediaEnhancementCorrectionAmount != null ? mediaEnhancementCorrectionAmount.toBuilder() : null;
                                    MediaEnhancementCorrectionAmount mediaEnhancementCorrectionAmount2 = (MediaEnhancementCorrectionAmount) codedInputStream.readMessage(MediaEnhancementCorrectionAmount.parser(), extensionRegistryLite);
                                    this.correctionAmount_ = mediaEnhancementCorrectionAmount2;
                                    if (builder != null) {
                                        builder.mergeFrom((MediaEnhancementCorrectionAmount.Builder) mediaEnhancementCorrectionAmount2);
                                        this.correctionAmount_ = builder.buildPartial();
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
                        synchronized (SetMediaEnhancementCorrectionAmount.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Hearing.SetMediaEnhancementCorrectionAmountOrBuilder
        public MediaEnhancementCorrectionAmount getCorrectionAmount() {
            MediaEnhancementCorrectionAmount mediaEnhancementCorrectionAmount = this.correctionAmount_;
            return mediaEnhancementCorrectionAmount == null ? MediaEnhancementCorrectionAmount.getDefaultInstance() : mediaEnhancementCorrectionAmount;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.correctionAmount_ != null ? CodedOutputStream.computeMessageSize(1, getCorrectionAmount()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Hearing.SetMediaEnhancementCorrectionAmountOrBuilder
        public boolean hasCorrectionAmount() {
            return this.correctionAmount_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.correctionAmount_ != null) {
                codedOutputStream.writeMessage(1, getCorrectionAmount());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SetMediaEnhancementCorrectionAmount, Builder> implements SetMediaEnhancementCorrectionAmountOrBuilder {
            private Builder() {
                super(SetMediaEnhancementCorrectionAmount.DEFAULT_INSTANCE);
            }

            public Builder clearCorrectionAmount() {
                copyOnWrite();
                ((SetMediaEnhancementCorrectionAmount) this.instance).clearCorrectionAmount();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Hearing.SetMediaEnhancementCorrectionAmountOrBuilder
            public MediaEnhancementCorrectionAmount getCorrectionAmount() {
                return ((SetMediaEnhancementCorrectionAmount) this.instance).getCorrectionAmount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Hearing.SetMediaEnhancementCorrectionAmountOrBuilder
            public boolean hasCorrectionAmount() {
                return ((SetMediaEnhancementCorrectionAmount) this.instance).hasCorrectionAmount();
            }

            public Builder mergeCorrectionAmount(MediaEnhancementCorrectionAmount mediaEnhancementCorrectionAmount) {
                copyOnWrite();
                ((SetMediaEnhancementCorrectionAmount) this.instance).mergeCorrectionAmount(mediaEnhancementCorrectionAmount);
                return this;
            }

            public Builder setCorrectionAmount(MediaEnhancementCorrectionAmount mediaEnhancementCorrectionAmount) {
                copyOnWrite();
                ((SetMediaEnhancementCorrectionAmount) this.instance).setCorrectionAmount(mediaEnhancementCorrectionAmount);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setCorrectionAmount(MediaEnhancementCorrectionAmount.Builder builder) {
                copyOnWrite();
                ((SetMediaEnhancementCorrectionAmount) this.instance).setCorrectionAmount(builder);
                return this;
            }
        }

        public static Builder newBuilder(SetMediaEnhancementCorrectionAmount setMediaEnhancementCorrectionAmount) {
            return DEFAULT_INSTANCE.createBuilder(setMediaEnhancementCorrectionAmount);
        }

        public static SetMediaEnhancementCorrectionAmount parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SetMediaEnhancementCorrectionAmount parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCorrectionAmount(MediaEnhancementCorrectionAmount mediaEnhancementCorrectionAmount) {
            mediaEnhancementCorrectionAmount.getClass();
            this.correctionAmount_ = mediaEnhancementCorrectionAmount;
        }

        public static SetMediaEnhancementCorrectionAmount parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SetMediaEnhancementCorrectionAmount parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SetMediaEnhancementCorrectionAmount parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SetMediaEnhancementCorrectionAmount parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SetMediaEnhancementCorrectionAmount parseFrom(InputStream inputStream) throws IOException {
            return (SetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SetMediaEnhancementCorrectionAmount parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SetMediaEnhancementCorrectionAmount parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SetMediaEnhancementCorrectionAmount parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AudioBand extends GeneratedMessageLite<AudioBand, Builder> implements AudioBandOrBuilder {
        private static final AudioBand DEFAULT_INSTANCE;
        public static final int FC_FIELD_NUMBER = 1;
        private static volatile Parser<AudioBand> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private float fc_;
        private float value_;

        static {
            AudioBand audioBand = new AudioBand();
            DEFAULT_INSTANCE = audioBand;
            audioBand.makeImmutable();
        }

        private AudioBand() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFc() {
            this.fc_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = 0.0f;
        }

        public static AudioBand getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AudioBand parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AudioBand) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AudioBand parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AudioBand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AudioBand> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFc(float f) {
            this.fc_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(float f) {
            this.value_ = f;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AudioBand();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    AudioBand audioBand = (AudioBand) obj2;
                    float f = this.fc_;
                    boolean z = f != 0.0f;
                    float f2 = audioBand.fc_;
                    this.fc_ = visitor.visitFloat(z, f, f2 != 0.0f, f2);
                    float f3 = this.value_;
                    boolean z2 = f3 != 0.0f;
                    float f4 = audioBand.value_;
                    this.value_ = visitor.visitFloat(z2, f3, f4 != 0.0f, f4);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ((ExtensionRegistryLite) obj2).getClass();
                    while (objArr == null) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 13) {
                                    this.fc_ = codedInputStream.readFloat();
                                } else if (readTag == 21) {
                                    this.value_ = codedInputStream.readFloat();
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
                        synchronized (AudioBand.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Hearing.AudioBandOrBuilder
        public float getFc() {
            return this.fc_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            float f = this.fc_;
            int computeFloatSize = f != 0.0f ? CodedOutputStream.computeFloatSize(1, f) : 0;
            float f2 = this.value_;
            if (f2 != 0.0f) {
                computeFloatSize += CodedOutputStream.computeFloatSize(2, f2);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeFloatSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Hearing.AudioBandOrBuilder
        public float getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            float f = this.fc_;
            if (f != 0.0f) {
                codedOutputStream.writeFloat(1, f);
            }
            float f2 = this.value_;
            if (f2 != 0.0f) {
                codedOutputStream.writeFloat(2, f2);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<AudioBand, Builder> implements AudioBandOrBuilder {
            private Builder() {
                super(AudioBand.DEFAULT_INSTANCE);
            }

            public Builder clearFc() {
                copyOnWrite();
                ((AudioBand) this.instance).clearFc();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((AudioBand) this.instance).clearValue();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Hearing.AudioBandOrBuilder
            public float getFc() {
                return ((AudioBand) this.instance).getFc();
            }

            @Override // com.amazon.alexa.accessory.protocol.Hearing.AudioBandOrBuilder
            public float getValue() {
                return ((AudioBand) this.instance).getValue();
            }

            public Builder setFc(float f) {
                copyOnWrite();
                ((AudioBand) this.instance).setFc(f);
                return this;
            }

            public Builder setValue(float f) {
                copyOnWrite();
                ((AudioBand) this.instance).setValue(f);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(AudioBand audioBand) {
            return DEFAULT_INSTANCE.createBuilder(audioBand);
        }

        public static AudioBand parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AudioBand) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AudioBand parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AudioBand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AudioBand parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AudioBand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AudioBand parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AudioBand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AudioBand parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AudioBand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AudioBand parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AudioBand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AudioBand parseFrom(InputStream inputStream) throws IOException {
            return (AudioBand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AudioBand parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AudioBand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AudioBand parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AudioBand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AudioBand parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AudioBand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetAudiogram extends GeneratedMessageLite<GetAudiogram, Builder> implements GetAudiogramOrBuilder {
        private static final GetAudiogram DEFAULT_INSTANCE;
        public static final int DEVICE_ID_FIELD_NUMBER = 1;
        private static volatile Parser<GetAudiogram> PARSER;
        private int deviceId_;

        static {
            GetAudiogram getAudiogram = new GetAudiogram();
            DEFAULT_INSTANCE = getAudiogram;
            getAudiogram.makeImmutable();
        }

        private GetAudiogram() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceId() {
            this.deviceId_ = 0;
        }

        public static GetAudiogram getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetAudiogram parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetAudiogram) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetAudiogram parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetAudiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetAudiogram> parser() {
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
                    return new GetAudiogram();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    GetAudiogram getAudiogram = (GetAudiogram) obj2;
                    int i = this.deviceId_;
                    boolean z = i != 0;
                    int i2 = getAudiogram.deviceId_;
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
                        synchronized (GetAudiogram.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Hearing.GetAudiogramOrBuilder
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
        public static final class Builder extends GeneratedMessageLite.Builder<GetAudiogram, Builder> implements GetAudiogramOrBuilder {
            private Builder() {
                super(GetAudiogram.DEFAULT_INSTANCE);
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((GetAudiogram) this.instance).clearDeviceId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Hearing.GetAudiogramOrBuilder
            public int getDeviceId() {
                return ((GetAudiogram) this.instance).getDeviceId();
            }

            public Builder setDeviceId(int i) {
                copyOnWrite();
                ((GetAudiogram) this.instance).setDeviceId(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(GetAudiogram getAudiogram) {
            return DEFAULT_INSTANCE.createBuilder(getAudiogram);
        }

        public static GetAudiogram parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetAudiogram) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetAudiogram parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetAudiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetAudiogram parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetAudiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetAudiogram parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetAudiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetAudiogram parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetAudiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetAudiogram parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetAudiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetAudiogram parseFrom(InputStream inputStream) throws IOException {
            return (GetAudiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetAudiogram parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetAudiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetAudiogram parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetAudiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetAudiogram parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetAudiogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetMediaEnhancementCorrectionAmount extends GeneratedMessageLite<GetMediaEnhancementCorrectionAmount, Builder> implements GetMediaEnhancementCorrectionAmountOrBuilder {
        private static final GetMediaEnhancementCorrectionAmount DEFAULT_INSTANCE;
        public static final int DEVICE_ID_FIELD_NUMBER = 1;
        private static volatile Parser<GetMediaEnhancementCorrectionAmount> PARSER;
        private int deviceId_;

        static {
            GetMediaEnhancementCorrectionAmount getMediaEnhancementCorrectionAmount = new GetMediaEnhancementCorrectionAmount();
            DEFAULT_INSTANCE = getMediaEnhancementCorrectionAmount;
            getMediaEnhancementCorrectionAmount.makeImmutable();
        }

        private GetMediaEnhancementCorrectionAmount() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceId() {
            this.deviceId_ = 0;
        }

        public static GetMediaEnhancementCorrectionAmount getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetMediaEnhancementCorrectionAmount parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetMediaEnhancementCorrectionAmount parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetMediaEnhancementCorrectionAmount> parser() {
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
                    return new GetMediaEnhancementCorrectionAmount();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    GetMediaEnhancementCorrectionAmount getMediaEnhancementCorrectionAmount = (GetMediaEnhancementCorrectionAmount) obj2;
                    int i = this.deviceId_;
                    boolean z = i != 0;
                    int i2 = getMediaEnhancementCorrectionAmount.deviceId_;
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
                        synchronized (GetMediaEnhancementCorrectionAmount.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Hearing.GetMediaEnhancementCorrectionAmountOrBuilder
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
        public static final class Builder extends GeneratedMessageLite.Builder<GetMediaEnhancementCorrectionAmount, Builder> implements GetMediaEnhancementCorrectionAmountOrBuilder {
            private Builder() {
                super(GetMediaEnhancementCorrectionAmount.DEFAULT_INSTANCE);
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((GetMediaEnhancementCorrectionAmount) this.instance).clearDeviceId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Hearing.GetMediaEnhancementCorrectionAmountOrBuilder
            public int getDeviceId() {
                return ((GetMediaEnhancementCorrectionAmount) this.instance).getDeviceId();
            }

            public Builder setDeviceId(int i) {
                copyOnWrite();
                ((GetMediaEnhancementCorrectionAmount) this.instance).setDeviceId(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(GetMediaEnhancementCorrectionAmount getMediaEnhancementCorrectionAmount) {
            return DEFAULT_INSTANCE.createBuilder(getMediaEnhancementCorrectionAmount);
        }

        public static GetMediaEnhancementCorrectionAmount parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetMediaEnhancementCorrectionAmount parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetMediaEnhancementCorrectionAmount parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetMediaEnhancementCorrectionAmount parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetMediaEnhancementCorrectionAmount parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetMediaEnhancementCorrectionAmount parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetMediaEnhancementCorrectionAmount parseFrom(InputStream inputStream) throws IOException {
            return (GetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetMediaEnhancementCorrectionAmount parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetMediaEnhancementCorrectionAmount parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetMediaEnhancementCorrectionAmount parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetMediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class MediaEnhancementCorrectionAmount extends GeneratedMessageLite<MediaEnhancementCorrectionAmount, Builder> implements MediaEnhancementCorrectionAmountOrBuilder {
        public static final int CORRECTION_AMOUNT_FIELD_NUMBER = 2;
        private static final MediaEnhancementCorrectionAmount DEFAULT_INSTANCE;
        public static final int DEVICE_ID_FIELD_NUMBER = 1;
        private static volatile Parser<MediaEnhancementCorrectionAmount> PARSER;
        private int correctionAmount_;
        private int deviceId_;

        static {
            MediaEnhancementCorrectionAmount mediaEnhancementCorrectionAmount = new MediaEnhancementCorrectionAmount();
            DEFAULT_INSTANCE = mediaEnhancementCorrectionAmount;
            mediaEnhancementCorrectionAmount.makeImmutable();
        }

        private MediaEnhancementCorrectionAmount() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCorrectionAmount() {
            this.correctionAmount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceId() {
            this.deviceId_ = 0;
        }

        public static MediaEnhancementCorrectionAmount getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static MediaEnhancementCorrectionAmount parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MediaEnhancementCorrectionAmount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MediaEnhancementCorrectionAmount parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<MediaEnhancementCorrectionAmount> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCorrectionAmount(int i) {
            this.correctionAmount_ = i;
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
                    return new MediaEnhancementCorrectionAmount();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    MediaEnhancementCorrectionAmount mediaEnhancementCorrectionAmount = (MediaEnhancementCorrectionAmount) obj2;
                    int i = this.deviceId_;
                    boolean z = i != 0;
                    int i2 = mediaEnhancementCorrectionAmount.deviceId_;
                    this.deviceId_ = visitor.visitInt(z, i, i2 != 0, i2);
                    int i3 = this.correctionAmount_;
                    boolean z2 = i3 != 0;
                    int i4 = mediaEnhancementCorrectionAmount.correctionAmount_;
                    this.correctionAmount_ = visitor.visitInt(z2, i3, i4 != 0, i4);
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
                                    this.correctionAmount_ = codedInputStream.readUInt32();
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
                        synchronized (MediaEnhancementCorrectionAmount.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Hearing.MediaEnhancementCorrectionAmountOrBuilder
        public int getCorrectionAmount() {
            return this.correctionAmount_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Hearing.MediaEnhancementCorrectionAmountOrBuilder
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
            int i3 = this.correctionAmount_;
            if (i3 != 0) {
                computeUInt32Size += CodedOutputStream.computeUInt32Size(2, i3);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.deviceId_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            int i2 = this.correctionAmount_;
            if (i2 != 0) {
                codedOutputStream.writeUInt32(2, i2);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<MediaEnhancementCorrectionAmount, Builder> implements MediaEnhancementCorrectionAmountOrBuilder {
            private Builder() {
                super(MediaEnhancementCorrectionAmount.DEFAULT_INSTANCE);
            }

            public Builder clearCorrectionAmount() {
                copyOnWrite();
                ((MediaEnhancementCorrectionAmount) this.instance).clearCorrectionAmount();
                return this;
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((MediaEnhancementCorrectionAmount) this.instance).clearDeviceId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Hearing.MediaEnhancementCorrectionAmountOrBuilder
            public int getCorrectionAmount() {
                return ((MediaEnhancementCorrectionAmount) this.instance).getCorrectionAmount();
            }

            @Override // com.amazon.alexa.accessory.protocol.Hearing.MediaEnhancementCorrectionAmountOrBuilder
            public int getDeviceId() {
                return ((MediaEnhancementCorrectionAmount) this.instance).getDeviceId();
            }

            public Builder setCorrectionAmount(int i) {
                copyOnWrite();
                ((MediaEnhancementCorrectionAmount) this.instance).setCorrectionAmount(i);
                return this;
            }

            public Builder setDeviceId(int i) {
                copyOnWrite();
                ((MediaEnhancementCorrectionAmount) this.instance).setDeviceId(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(MediaEnhancementCorrectionAmount mediaEnhancementCorrectionAmount) {
            return DEFAULT_INSTANCE.createBuilder(mediaEnhancementCorrectionAmount);
        }

        public static MediaEnhancementCorrectionAmount parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MediaEnhancementCorrectionAmount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MediaEnhancementCorrectionAmount parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MediaEnhancementCorrectionAmount parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MediaEnhancementCorrectionAmount parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MediaEnhancementCorrectionAmount parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MediaEnhancementCorrectionAmount parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MediaEnhancementCorrectionAmount parseFrom(InputStream inputStream) throws IOException {
            return (MediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MediaEnhancementCorrectionAmount parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MediaEnhancementCorrectionAmount parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MediaEnhancementCorrectionAmount parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MediaEnhancementCorrectionAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AudioChannelType implements Internal.EnumLite {
        ALL(0),
        LEFT(1),
        RIGHT(2),
        UNRECOGNIZED(-1);

        public static final int ALL_VALUE = 0;
        public static final int LEFT_VALUE = 1;
        public static final int RIGHT_VALUE = 2;
        private static final Internal.EnumLiteMap<AudioChannelType> internalValueMap = new Internal.EnumLiteMap<AudioChannelType>() { // from class: com.amazon.alexa.accessory.protocol.Hearing.AudioChannelType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public AudioChannelType findValueByNumber(int i) {
                return AudioChannelType.forNumber(i);
            }
        };
        private final int value;

        AudioChannelType(int i) {
            this.value = i;
        }

        public static AudioChannelType forNumber(int i) {
            if (i == 0) {
                return ALL;
            }
            if (i == 1) {
                return LEFT;
            }
            if (i != 2) {
                return null;
            }
            return RIGHT;
        }

        public static Internal.EnumLiteMap<AudioChannelType> internalGetValueMap() {
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
        public static AudioChannelType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
