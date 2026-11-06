package com.amazon.alexa.accessory.protocol;

import com.amazon.alexa.accessory.protocol.Central;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
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
import java.util.Iterator;
import java.util.List;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class System {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.System$1, reason: invalid class name */
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
    public interface ConnectUserOrBuilder extends MessageLiteOrBuilder {
        String getAddress();

        ByteString getAddressBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DisconnectUserOrBuilder extends MessageLiteOrBuilder {
        String getAddress();

        ByteString getAddressBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetCurrentUserOrBuilder extends MessageLiteOrBuilder {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetLocalesOrBuilder extends MessageLiteOrBuilder {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetUsersOrBuilder extends MessageLiteOrBuilder {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GetWakewordsOrBuilder extends MessageLiteOrBuilder {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface KeepAliveOrBuilder extends MessageLiteOrBuilder {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface LaunchAppOrBuilder extends MessageLiteOrBuilder {
        String getAppId();

        ByteString getAppIdBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface LocaleOrBuilder extends MessageLiteOrBuilder {
        String getName();

        ByteString getNameBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface LocalesOrBuilder extends MessageLiteOrBuilder {
        Locale getCurrentLocale();

        Locale getSupportedLocales(int i);

        int getSupportedLocalesCount();

        List<Locale> getSupportedLocalesList();

        boolean hasCurrentLocale();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface RemoveDeviceOrBuilder extends MessageLiteOrBuilder {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ResetConnectionOrBuilder extends MessageLiteOrBuilder {
        boolean getForceDisconnect();

        ResetConnection.ResetReason getResetReason();

        int getResetReasonValue();

        int getTimeout();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ResetDeviceOrBuilder extends MessageLiteOrBuilder {
        ResetDevice.ResetType getType();

        int getTypeValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ResetDeviceResponseOrBuilder extends MessageLiteOrBuilder {
        ResetDeviceStatus getStatus();

        boolean hasStatus();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ResetDeviceStatusOrBuilder extends MessageLiteOrBuilder {
        int getErrorCode();

        String getErrorMessage();

        ByteString getErrorMessageBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SendProfileInfoOrBuilder extends MessageLiteOrBuilder {
        String getProfileName();

        ByteString getProfileNameBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SetLocaleOrBuilder extends MessageLiteOrBuilder {
        Locale getLocale();

        boolean hasLocale();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SetWakewordsOrBuilder extends MessageLiteOrBuilder {
        String getActiveWakewords(int i);

        ByteString getActiveWakewordsBytes(int i);

        int getActiveWakewordsCount();

        List<String> getActiveWakewordsList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SwitchCurrentUserOrBuilder extends MessageLiteOrBuilder {
        int getUserId();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SynchronizeSettingsOrBuilder extends MessageLiteOrBuilder {
        int getTimestampHi();

        int getTimestampLo();

        String getUtcTimeOffset();

        ByteString getUtcTimeOffsetBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface UnpairUserOrBuilder extends MessageLiteOrBuilder {
        String getAddress();

        ByteString getAddressBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface UpdateUsersOrBuilder extends MessageLiteOrBuilder {
        Users getUsers();

        boolean hasUsers();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface UserOrBuilder extends MessageLiteOrBuilder {
        boolean getAapConnected();

        String getAddress();

        ByteString getAddressBytes();

        int getClassOfDevice();

        boolean getConnected();

        User.AudioConnectionType getConnectedAudioTypes(int i);

        int getConnectedAudioTypesCount();

        List<User.AudioConnectionType> getConnectedAudioTypesList();

        int getConnectedAudioTypesValue(int i);

        List<Integer> getConnectedAudioTypesValueList();

        User.Focus getFocus();

        int getFocusValue();

        int getId();

        User.AapCapability getLastKnownAapCapability();

        int getLastKnownAapCapabilityValue();

        String getName();

        ByteString getNameBytes();

        Central.Platform getPlatform();

        int getPlatformValue();

        User.AudioConnectionType getPrimaryAudioConnectionType();

        int getPrimaryAudioConnectionTypeValue();

        boolean getSelf();

        int getVendorId();

        int getVolume();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface UsersOrBuilder extends MessageLiteOrBuilder {
        User getUsers(int i);

        int getUsersCount();

        List<User> getUsersList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface WakewordsOrBuilder extends MessageLiteOrBuilder {
        String getCurrentWakewords(int i);

        ByteString getCurrentWakewordsBytes(int i);

        int getCurrentWakewordsCount();

        List<String> getCurrentWakewordsList();
    }

    private System() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Locales extends GeneratedMessageLite<Locales, Builder> implements LocalesOrBuilder {
        public static final int CURRENT_LOCALE_FIELD_NUMBER = 2;
        private static final Locales DEFAULT_INSTANCE;
        private static volatile Parser<Locales> PARSER = null;
        public static final int SUPPORTED_LOCALES_FIELD_NUMBER = 1;
        private int bitField0_;
        private Locale currentLocale_;
        private Internal.ProtobufList<Locale> supportedLocales_ = GeneratedMessageLite.emptyProtobufList();

        static {
            Locales locales = new Locales();
            DEFAULT_INSTANCE = locales;
            locales.makeImmutable();
        }

        private Locales() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSupportedLocales(Iterable<? extends Locale> iterable) {
            ensureSupportedLocalesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.supportedLocales_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSupportedLocales(Locale.Builder builder) {
            ensureSupportedLocalesIsMutable();
            this.supportedLocales_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentLocale() {
            this.currentLocale_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSupportedLocales() {
            this.supportedLocales_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureSupportedLocalesIsMutable() {
            if (this.supportedLocales_.isModifiable()) {
                return;
            }
            this.supportedLocales_ = GeneratedMessageLite.mutableCopy(this.supportedLocales_);
        }

        public static Locales getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCurrentLocale(Locale locale) {
            Locale locale2 = this.currentLocale_;
            if (locale2 == null || locale2 == Locale.getDefaultInstance()) {
                this.currentLocale_ = locale;
            } else {
                this.currentLocale_ = Locale.newBuilder(this.currentLocale_).mergeFrom((Locale.Builder) locale).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Locales parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Locales) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Locales parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Locales) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Locales> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSupportedLocales(int i) {
            ensureSupportedLocalesIsMutable();
            this.supportedLocales_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentLocale(Locale.Builder builder) {
            this.currentLocale_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSupportedLocales(int i, Locale.Builder builder) {
            ensureSupportedLocalesIsMutable();
            this.supportedLocales_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Locales();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.supportedLocales_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    Locales locales = (Locales) obj2;
                    this.supportedLocales_ = visitor.visitList(this.supportedLocales_, locales.supportedLocales_);
                    this.currentLocale_ = (Locale) visitor.visitMessage(this.currentLocale_, locales.currentLocale_);
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                        this.bitField0_ |= locales.bitField0_;
                    }
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
                                    if (!this.supportedLocales_.isModifiable()) {
                                        this.supportedLocales_ = GeneratedMessageLite.mutableCopy(this.supportedLocales_);
                                    }
                                    this.supportedLocales_.add((Locale) codedInputStream.readMessage(Locale.parser(), extensionRegistryLite));
                                } else if (readTag == 18) {
                                    Locale locale = this.currentLocale_;
                                    Locale.Builder builder = locale != null ? locale.toBuilder() : null;
                                    Locale locale2 = (Locale) codedInputStream.readMessage(Locale.parser(), extensionRegistryLite);
                                    this.currentLocale_ = locale2;
                                    if (builder != null) {
                                        builder.mergeFrom((Locale.Builder) locale2);
                                        this.currentLocale_ = builder.buildPartial();
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
                        synchronized (Locales.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.System.LocalesOrBuilder
        public Locale getCurrentLocale() {
            Locale locale = this.currentLocale_;
            return locale == null ? Locale.getDefaultInstance() : locale;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.supportedLocales_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.supportedLocales_.get(i3));
            }
            if (this.currentLocale_ != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getCurrentLocale());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.LocalesOrBuilder
        public Locale getSupportedLocales(int i) {
            return this.supportedLocales_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.System.LocalesOrBuilder
        public int getSupportedLocalesCount() {
            return this.supportedLocales_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.System.LocalesOrBuilder
        public List<Locale> getSupportedLocalesList() {
            return this.supportedLocales_;
        }

        public LocaleOrBuilder getSupportedLocalesOrBuilder(int i) {
            return this.supportedLocales_.get(i);
        }

        public List<? extends LocaleOrBuilder> getSupportedLocalesOrBuilderList() {
            return this.supportedLocales_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.LocalesOrBuilder
        public boolean hasCurrentLocale() {
            return this.currentLocale_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.supportedLocales_.size(); i++) {
                codedOutputStream.writeMessage(1, this.supportedLocales_.get(i));
            }
            if (this.currentLocale_ != null) {
                codedOutputStream.writeMessage(2, getCurrentLocale());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<Locales, Builder> implements LocalesOrBuilder {
            private Builder() {
                super(Locales.DEFAULT_INSTANCE);
            }

            public Builder addAllSupportedLocales(Iterable<? extends Locale> iterable) {
                copyOnWrite();
                ((Locales) this.instance).addAllSupportedLocales(iterable);
                return this;
            }

            public Builder addSupportedLocales(Locale locale) {
                copyOnWrite();
                ((Locales) this.instance).addSupportedLocales(locale);
                return this;
            }

            public Builder clearCurrentLocale() {
                copyOnWrite();
                ((Locales) this.instance).clearCurrentLocale();
                return this;
            }

            public Builder clearSupportedLocales() {
                copyOnWrite();
                ((Locales) this.instance).clearSupportedLocales();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.System.LocalesOrBuilder
            public Locale getCurrentLocale() {
                return ((Locales) this.instance).getCurrentLocale();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.LocalesOrBuilder
            public Locale getSupportedLocales(int i) {
                return ((Locales) this.instance).getSupportedLocales(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.System.LocalesOrBuilder
            public int getSupportedLocalesCount() {
                return ((Locales) this.instance).getSupportedLocalesCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.LocalesOrBuilder
            public List<Locale> getSupportedLocalesList() {
                return Collections.unmodifiableList(((Locales) this.instance).getSupportedLocalesList());
            }

            @Override // com.amazon.alexa.accessory.protocol.System.LocalesOrBuilder
            public boolean hasCurrentLocale() {
                return ((Locales) this.instance).hasCurrentLocale();
            }

            public Builder mergeCurrentLocale(Locale locale) {
                copyOnWrite();
                ((Locales) this.instance).mergeCurrentLocale(locale);
                return this;
            }

            public Builder removeSupportedLocales(int i) {
                copyOnWrite();
                ((Locales) this.instance).removeSupportedLocales(i);
                return this;
            }

            public Builder setCurrentLocale(Locale locale) {
                copyOnWrite();
                ((Locales) this.instance).setCurrentLocale(locale);
                return this;
            }

            public Builder setSupportedLocales(int i, Locale locale) {
                copyOnWrite();
                ((Locales) this.instance).setSupportedLocales(i, locale);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addSupportedLocales(int i, Locale locale) {
                copyOnWrite();
                ((Locales) this.instance).addSupportedLocales(i, locale);
                return this;
            }

            public Builder setCurrentLocale(Locale.Builder builder) {
                copyOnWrite();
                ((Locales) this.instance).setCurrentLocale(builder);
                return this;
            }

            public Builder setSupportedLocales(int i, Locale.Builder builder) {
                copyOnWrite();
                ((Locales) this.instance).setSupportedLocales(i, builder);
                return this;
            }

            public Builder addSupportedLocales(Locale.Builder builder) {
                copyOnWrite();
                ((Locales) this.instance).addSupportedLocales(builder);
                return this;
            }

            public Builder addSupportedLocales(int i, Locale.Builder builder) {
                copyOnWrite();
                ((Locales) this.instance).addSupportedLocales(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(Locales locales) {
            return DEFAULT_INSTANCE.createBuilder(locales);
        }

        public static Locales parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Locales) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Locales parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Locales) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentLocale(Locale locale) {
            locale.getClass();
            this.currentLocale_ = locale;
        }

        public static Locales parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Locales) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Locales parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Locales) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Locales parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Locales) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Locales parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Locales) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Locales parseFrom(InputStream inputStream) throws IOException {
            return (Locales) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSupportedLocales(int i, Locale locale) {
            locale.getClass();
            ensureSupportedLocalesIsMutable();
            this.supportedLocales_.add(i, locale);
        }

        public static Locales parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Locales) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSupportedLocales(int i, Locale locale) {
            locale.getClass();
            ensureSupportedLocalesIsMutable();
            this.supportedLocales_.set(i, locale);
        }

        public static Locales parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Locales) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Locales parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Locales) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSupportedLocales(Locale locale) {
            locale.getClass();
            ensureSupportedLocalesIsMutable();
            this.supportedLocales_.add(locale);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSupportedLocales(int i, Locale.Builder builder) {
            ensureSupportedLocalesIsMutable();
            this.supportedLocales_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ResetDeviceResponse extends GeneratedMessageLite<ResetDeviceResponse, Builder> implements ResetDeviceResponseOrBuilder {
        private static final ResetDeviceResponse DEFAULT_INSTANCE;
        private static volatile Parser<ResetDeviceResponse> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 1;
        private ResetDeviceStatus status_;

        static {
            ResetDeviceResponse resetDeviceResponse = new ResetDeviceResponse();
            DEFAULT_INSTANCE = resetDeviceResponse;
            resetDeviceResponse.makeImmutable();
        }

        private ResetDeviceResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = null;
        }

        public static ResetDeviceResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStatus(ResetDeviceStatus resetDeviceStatus) {
            ResetDeviceStatus resetDeviceStatus2 = this.status_;
            if (resetDeviceStatus2 == null || resetDeviceStatus2 == ResetDeviceStatus.getDefaultInstance()) {
                this.status_ = resetDeviceStatus;
            } else {
                this.status_ = ResetDeviceStatus.newBuilder(this.status_).mergeFrom((ResetDeviceStatus.Builder) resetDeviceStatus).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ResetDeviceResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ResetDeviceResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResetDeviceResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ResetDeviceResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ResetDeviceResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(ResetDeviceStatus.Builder builder) {
            this.status_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ResetDeviceResponse();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.status_ = (ResetDeviceStatus) ((GeneratedMessageLite.Visitor) obj).visitMessage(this.status_, ((ResetDeviceResponse) obj2).status_);
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
                                    ResetDeviceStatus resetDeviceStatus = this.status_;
                                    ResetDeviceStatus.Builder builder = resetDeviceStatus != null ? resetDeviceStatus.toBuilder() : null;
                                    ResetDeviceStatus resetDeviceStatus2 = (ResetDeviceStatus) codedInputStream.readMessage(ResetDeviceStatus.parser(), extensionRegistryLite);
                                    this.status_ = resetDeviceStatus2;
                                    if (builder != null) {
                                        builder.mergeFrom((ResetDeviceStatus.Builder) resetDeviceStatus2);
                                        this.status_ = builder.buildPartial();
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
                        synchronized (ResetDeviceResponse.class) {
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
            int serializedSize = this.unknownFields.getSerializedSize() + (this.status_ != null ? CodedOutputStream.computeMessageSize(1, getStatus()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.ResetDeviceResponseOrBuilder
        public ResetDeviceStatus getStatus() {
            ResetDeviceStatus resetDeviceStatus = this.status_;
            return resetDeviceStatus == null ? ResetDeviceStatus.getDefaultInstance() : resetDeviceStatus;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.ResetDeviceResponseOrBuilder
        public boolean hasStatus() {
            return this.status_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.status_ != null) {
                codedOutputStream.writeMessage(1, getStatus());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<ResetDeviceResponse, Builder> implements ResetDeviceResponseOrBuilder {
            private Builder() {
                super(ResetDeviceResponse.DEFAULT_INSTANCE);
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((ResetDeviceResponse) this.instance).clearStatus();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.System.ResetDeviceResponseOrBuilder
            public ResetDeviceStatus getStatus() {
                return ((ResetDeviceResponse) this.instance).getStatus();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.ResetDeviceResponseOrBuilder
            public boolean hasStatus() {
                return ((ResetDeviceResponse) this.instance).hasStatus();
            }

            public Builder mergeStatus(ResetDeviceStatus resetDeviceStatus) {
                copyOnWrite();
                ((ResetDeviceResponse) this.instance).mergeStatus(resetDeviceStatus);
                return this;
            }

            public Builder setStatus(ResetDeviceStatus resetDeviceStatus) {
                copyOnWrite();
                ((ResetDeviceResponse) this.instance).setStatus(resetDeviceStatus);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setStatus(ResetDeviceStatus.Builder builder) {
                copyOnWrite();
                ((ResetDeviceResponse) this.instance).setStatus(builder);
                return this;
            }
        }

        public static Builder newBuilder(ResetDeviceResponse resetDeviceResponse) {
            return DEFAULT_INSTANCE.createBuilder(resetDeviceResponse);
        }

        public static ResetDeviceResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResetDeviceResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ResetDeviceResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResetDeviceResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(ResetDeviceStatus resetDeviceStatus) {
            resetDeviceStatus.getClass();
            this.status_ = resetDeviceStatus;
        }

        public static ResetDeviceResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ResetDeviceResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ResetDeviceResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResetDeviceResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ResetDeviceResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ResetDeviceResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ResetDeviceResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResetDeviceResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ResetDeviceResponse parseFrom(InputStream inputStream) throws IOException {
            return (ResetDeviceResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResetDeviceResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResetDeviceResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ResetDeviceResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ResetDeviceResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ResetDeviceResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResetDeviceResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SetLocale extends GeneratedMessageLite<SetLocale, Builder> implements SetLocaleOrBuilder {
        private static final SetLocale DEFAULT_INSTANCE;
        public static final int LOCALE_FIELD_NUMBER = 1;
        private static volatile Parser<SetLocale> PARSER;
        private Locale locale_;

        static {
            SetLocale setLocale = new SetLocale();
            DEFAULT_INSTANCE = setLocale;
            setLocale.makeImmutable();
        }

        private SetLocale() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocale() {
            this.locale_ = null;
        }

        public static SetLocale getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLocale(Locale locale) {
            Locale locale2 = this.locale_;
            if (locale2 == null || locale2 == Locale.getDefaultInstance()) {
                this.locale_ = locale;
            } else {
                this.locale_ = Locale.newBuilder(this.locale_).mergeFrom((Locale.Builder) locale).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SetLocale parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SetLocale) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SetLocale parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SetLocale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SetLocale> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocale(Locale.Builder builder) {
            this.locale_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SetLocale();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.locale_ = (Locale) ((GeneratedMessageLite.Visitor) obj).visitMessage(this.locale_, ((SetLocale) obj2).locale_);
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
                                    Locale locale = this.locale_;
                                    Locale.Builder builder = locale != null ? locale.toBuilder() : null;
                                    Locale locale2 = (Locale) codedInputStream.readMessage(Locale.parser(), extensionRegistryLite);
                                    this.locale_ = locale2;
                                    if (builder != null) {
                                        builder.mergeFrom((Locale.Builder) locale2);
                                        this.locale_ = builder.buildPartial();
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
                        synchronized (SetLocale.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.System.SetLocaleOrBuilder
        public Locale getLocale() {
            Locale locale = this.locale_;
            return locale == null ? Locale.getDefaultInstance() : locale;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.locale_ != null ? CodedOutputStream.computeMessageSize(1, getLocale()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.SetLocaleOrBuilder
        public boolean hasLocale() {
            return this.locale_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.locale_ != null) {
                codedOutputStream.writeMessage(1, getLocale());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SetLocale, Builder> implements SetLocaleOrBuilder {
            private Builder() {
                super(SetLocale.DEFAULT_INSTANCE);
            }

            public Builder clearLocale() {
                copyOnWrite();
                ((SetLocale) this.instance).clearLocale();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.System.SetLocaleOrBuilder
            public Locale getLocale() {
                return ((SetLocale) this.instance).getLocale();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.SetLocaleOrBuilder
            public boolean hasLocale() {
                return ((SetLocale) this.instance).hasLocale();
            }

            public Builder mergeLocale(Locale locale) {
                copyOnWrite();
                ((SetLocale) this.instance).mergeLocale(locale);
                return this;
            }

            public Builder setLocale(Locale locale) {
                copyOnWrite();
                ((SetLocale) this.instance).setLocale(locale);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setLocale(Locale.Builder builder) {
                copyOnWrite();
                ((SetLocale) this.instance).setLocale(builder);
                return this;
            }
        }

        public static Builder newBuilder(SetLocale setLocale) {
            return DEFAULT_INSTANCE.createBuilder(setLocale);
        }

        public static SetLocale parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetLocale) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SetLocale parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetLocale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocale(Locale locale) {
            locale.getClass();
            this.locale_ = locale;
        }

        public static SetLocale parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SetLocale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SetLocale parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetLocale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SetLocale parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SetLocale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SetLocale parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetLocale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SetLocale parseFrom(InputStream inputStream) throws IOException {
            return (SetLocale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SetLocale parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetLocale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SetLocale parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SetLocale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SetLocale parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetLocale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class UpdateUsers extends GeneratedMessageLite<UpdateUsers, Builder> implements UpdateUsersOrBuilder {
        private static final UpdateUsers DEFAULT_INSTANCE;
        private static volatile Parser<UpdateUsers> PARSER = null;
        public static final int USERS_FIELD_NUMBER = 1;
        private Users users_;

        static {
            UpdateUsers updateUsers = new UpdateUsers();
            DEFAULT_INSTANCE = updateUsers;
            updateUsers.makeImmutable();
        }

        private UpdateUsers() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUsers() {
            this.users_ = null;
        }

        public static UpdateUsers getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUsers(Users users) {
            Users users2 = this.users_;
            if (users2 == null || users2 == Users.getDefaultInstance()) {
                this.users_ = users;
            } else {
                this.users_ = Users.newBuilder(this.users_).mergeFrom((Users.Builder) users).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static UpdateUsers parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UpdateUsers) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateUsers parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UpdateUsers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<UpdateUsers> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUsers(Users.Builder builder) {
            this.users_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new UpdateUsers();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.users_ = (Users) ((GeneratedMessageLite.Visitor) obj).visitMessage(this.users_, ((UpdateUsers) obj2).users_);
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
                                    Users users = this.users_;
                                    Users.Builder builder = users != null ? users.toBuilder() : null;
                                    Users users2 = (Users) codedInputStream.readMessage(Users.parser(), extensionRegistryLite);
                                    this.users_ = users2;
                                    if (builder != null) {
                                        builder.mergeFrom((Users.Builder) users2);
                                        this.users_ = builder.buildPartial();
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
                        synchronized (UpdateUsers.class) {
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
            int serializedSize = this.unknownFields.getSerializedSize() + (this.users_ != null ? CodedOutputStream.computeMessageSize(1, getUsers()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UpdateUsersOrBuilder
        public Users getUsers() {
            Users users = this.users_;
            return users == null ? Users.getDefaultInstance() : users;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UpdateUsersOrBuilder
        public boolean hasUsers() {
            return this.users_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.users_ != null) {
                codedOutputStream.writeMessage(1, getUsers());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<UpdateUsers, Builder> implements UpdateUsersOrBuilder {
            private Builder() {
                super(UpdateUsers.DEFAULT_INSTANCE);
            }

            public Builder clearUsers() {
                copyOnWrite();
                ((UpdateUsers) this.instance).clearUsers();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UpdateUsersOrBuilder
            public Users getUsers() {
                return ((UpdateUsers) this.instance).getUsers();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UpdateUsersOrBuilder
            public boolean hasUsers() {
                return ((UpdateUsers) this.instance).hasUsers();
            }

            public Builder mergeUsers(Users users) {
                copyOnWrite();
                ((UpdateUsers) this.instance).mergeUsers(users);
                return this;
            }

            public Builder setUsers(Users users) {
                copyOnWrite();
                ((UpdateUsers) this.instance).setUsers(users);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setUsers(Users.Builder builder) {
                copyOnWrite();
                ((UpdateUsers) this.instance).setUsers(builder);
                return this;
            }
        }

        public static Builder newBuilder(UpdateUsers updateUsers) {
            return DEFAULT_INSTANCE.createBuilder(updateUsers);
        }

        public static UpdateUsers parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UpdateUsers) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UpdateUsers parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UpdateUsers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUsers(Users users) {
            users.getClass();
            this.users_ = users;
        }

        public static UpdateUsers parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UpdateUsers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UpdateUsers parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UpdateUsers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static UpdateUsers parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UpdateUsers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UpdateUsers parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UpdateUsers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static UpdateUsers parseFrom(InputStream inputStream) throws IOException {
            return (UpdateUsers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateUsers parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UpdateUsers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UpdateUsers parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UpdateUsers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UpdateUsers parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UpdateUsers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Users extends GeneratedMessageLite<Users, Builder> implements UsersOrBuilder {
        private static final Users DEFAULT_INSTANCE;
        private static volatile Parser<Users> PARSER = null;
        public static final int USERS_FIELD_NUMBER = 1;
        private Internal.ProtobufList<User> users_ = GeneratedMessageLite.emptyProtobufList();

        static {
            Users users = new Users();
            DEFAULT_INSTANCE = users;
            users.makeImmutable();
        }

        private Users() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUsers(Iterable<? extends User> iterable) {
            ensureUsersIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.users_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUsers(User.Builder builder) {
            ensureUsersIsMutable();
            this.users_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUsers() {
            this.users_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUsersIsMutable() {
            if (this.users_.isModifiable()) {
                return;
            }
            this.users_ = GeneratedMessageLite.mutableCopy(this.users_);
        }

        public static Users getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Users parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Users) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Users parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Users) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Users> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUsers(int i) {
            ensureUsersIsMutable();
            this.users_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUsers(int i, User.Builder builder) {
            ensureUsersIsMutable();
            this.users_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Users();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.users_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.users_ = ((GeneratedMessageLite.Visitor) obj).visitList(this.users_, ((Users) obj2).users_);
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
                                    if (!this.users_.isModifiable()) {
                                        this.users_ = GeneratedMessageLite.mutableCopy(this.users_);
                                    }
                                    this.users_.add((User) codedInputStream.readMessage(User.parser(), extensionRegistryLite));
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
                        synchronized (Users.class) {
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

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.users_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.users_.get(i3));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UsersOrBuilder
        public User getUsers(int i) {
            return this.users_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UsersOrBuilder
        public int getUsersCount() {
            return this.users_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UsersOrBuilder
        public List<User> getUsersList() {
            return this.users_;
        }

        public UserOrBuilder getUsersOrBuilder(int i) {
            return this.users_.get(i);
        }

        public List<? extends UserOrBuilder> getUsersOrBuilderList() {
            return this.users_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.users_.size(); i++) {
                codedOutputStream.writeMessage(1, this.users_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<Users, Builder> implements UsersOrBuilder {
            private Builder() {
                super(Users.DEFAULT_INSTANCE);
            }

            public Builder addAllUsers(Iterable<? extends User> iterable) {
                copyOnWrite();
                ((Users) this.instance).addAllUsers(iterable);
                return this;
            }

            public Builder addUsers(User user) {
                copyOnWrite();
                ((Users) this.instance).addUsers(user);
                return this;
            }

            public Builder clearUsers() {
                copyOnWrite();
                ((Users) this.instance).clearUsers();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UsersOrBuilder
            public User getUsers(int i) {
                return ((Users) this.instance).getUsers(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UsersOrBuilder
            public int getUsersCount() {
                return ((Users) this.instance).getUsersCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UsersOrBuilder
            public List<User> getUsersList() {
                return Collections.unmodifiableList(((Users) this.instance).getUsersList());
            }

            public Builder removeUsers(int i) {
                copyOnWrite();
                ((Users) this.instance).removeUsers(i);
                return this;
            }

            public Builder setUsers(int i, User user) {
                copyOnWrite();
                ((Users) this.instance).setUsers(i, user);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addUsers(int i, User user) {
                copyOnWrite();
                ((Users) this.instance).addUsers(i, user);
                return this;
            }

            public Builder setUsers(int i, User.Builder builder) {
                copyOnWrite();
                ((Users) this.instance).setUsers(i, builder);
                return this;
            }

            public Builder addUsers(User.Builder builder) {
                copyOnWrite();
                ((Users) this.instance).addUsers(builder);
                return this;
            }

            public Builder addUsers(int i, User.Builder builder) {
                copyOnWrite();
                ((Users) this.instance).addUsers(i, builder);
                return this;
            }
        }

        public static Builder newBuilder(Users users) {
            return DEFAULT_INSTANCE.createBuilder(users);
        }

        public static Users parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Users) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Users parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Users) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Users parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Users) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Users parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Users) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Users parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Users) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Users parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Users) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Users parseFrom(InputStream inputStream) throws IOException {
            return (Users) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUsers(int i, User user) {
            user.getClass();
            ensureUsersIsMutable();
            this.users_.add(i, user);
        }

        public static Users parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Users) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUsers(int i, User user) {
            user.getClass();
            ensureUsersIsMutable();
            this.users_.set(i, user);
        }

        public static Users parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Users) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Users parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Users) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUsers(User user) {
            user.getClass();
            ensureUsersIsMutable();
            this.users_.add(user);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUsers(int i, User.Builder builder) {
            ensureUsersIsMutable();
            this.users_.add(i, builder.build());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ConnectUser extends GeneratedMessageLite<ConnectUser, Builder> implements ConnectUserOrBuilder {
        public static final int ADDRESS_FIELD_NUMBER = 1;
        private static final ConnectUser DEFAULT_INSTANCE;
        private static volatile Parser<ConnectUser> PARSER;
        private String address_ = "";

        static {
            ConnectUser connectUser = new ConnectUser();
            DEFAULT_INSTANCE = connectUser;
            connectUser.makeImmutable();
        }

        private ConnectUser() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddress() {
            this.address_ = getDefaultInstance().getAddress();
        }

        public static ConnectUser getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ConnectUser parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ConnectUser) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ConnectUser parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ConnectUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ConnectUser> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddress(String str) {
            str.getClass();
            this.address_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddressBytes(ByteString byteString) {
            this.address_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ConnectUser();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.address_ = ((GeneratedMessageLite.Visitor) obj).visitString(!this.address_.isEmpty(), this.address_, !r6.address_.isEmpty(), ((ConnectUser) obj2).address_);
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
                                    this.address_ = codedInputStream.readStringRequireUtf8();
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
                        synchronized (ConnectUser.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.System.ConnectUserOrBuilder
        public String getAddress() {
            return this.address_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.ConnectUserOrBuilder
        public ByteString getAddressBytes() {
            return ByteString.copyFromUtf8(this.address_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (!this.address_.isEmpty() ? CodedOutputStream.computeStringSize(1, getAddress()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.address_.isEmpty()) {
                codedOutputStream.writeString(1, getAddress());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<ConnectUser, Builder> implements ConnectUserOrBuilder {
            private Builder() {
                super(ConnectUser.DEFAULT_INSTANCE);
            }

            public Builder clearAddress() {
                copyOnWrite();
                ((ConnectUser) this.instance).clearAddress();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.System.ConnectUserOrBuilder
            public String getAddress() {
                return ((ConnectUser) this.instance).getAddress();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.ConnectUserOrBuilder
            public ByteString getAddressBytes() {
                return ((ConnectUser) this.instance).getAddressBytes();
            }

            public Builder setAddress(String str) {
                copyOnWrite();
                ((ConnectUser) this.instance).setAddress(str);
                return this;
            }

            public Builder setAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((ConnectUser) this.instance).setAddressBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(ConnectUser connectUser) {
            return DEFAULT_INSTANCE.createBuilder(connectUser);
        }

        public static ConnectUser parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ConnectUser) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ConnectUser parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ConnectUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ConnectUser parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ConnectUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ConnectUser parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ConnectUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ConnectUser parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ConnectUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ConnectUser parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ConnectUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ConnectUser parseFrom(InputStream inputStream) throws IOException {
            return (ConnectUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ConnectUser parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ConnectUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ConnectUser parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ConnectUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ConnectUser parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ConnectUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DisconnectUser extends GeneratedMessageLite<DisconnectUser, Builder> implements DisconnectUserOrBuilder {
        public static final int ADDRESS_FIELD_NUMBER = 1;
        private static final DisconnectUser DEFAULT_INSTANCE;
        private static volatile Parser<DisconnectUser> PARSER;
        private String address_ = "";

        static {
            DisconnectUser disconnectUser = new DisconnectUser();
            DEFAULT_INSTANCE = disconnectUser;
            disconnectUser.makeImmutable();
        }

        private DisconnectUser() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddress() {
            this.address_ = getDefaultInstance().getAddress();
        }

        public static DisconnectUser getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DisconnectUser parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DisconnectUser) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DisconnectUser parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DisconnectUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DisconnectUser> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddress(String str) {
            str.getClass();
            this.address_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddressBytes(ByteString byteString) {
            this.address_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new DisconnectUser();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.address_ = ((GeneratedMessageLite.Visitor) obj).visitString(!this.address_.isEmpty(), this.address_, !r6.address_.isEmpty(), ((DisconnectUser) obj2).address_);
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
                                    this.address_ = codedInputStream.readStringRequireUtf8();
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
                        synchronized (DisconnectUser.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.System.DisconnectUserOrBuilder
        public String getAddress() {
            return this.address_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.DisconnectUserOrBuilder
        public ByteString getAddressBytes() {
            return ByteString.copyFromUtf8(this.address_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (!this.address_.isEmpty() ? CodedOutputStream.computeStringSize(1, getAddress()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.address_.isEmpty()) {
                codedOutputStream.writeString(1, getAddress());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<DisconnectUser, Builder> implements DisconnectUserOrBuilder {
            private Builder() {
                super(DisconnectUser.DEFAULT_INSTANCE);
            }

            public Builder clearAddress() {
                copyOnWrite();
                ((DisconnectUser) this.instance).clearAddress();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.System.DisconnectUserOrBuilder
            public String getAddress() {
                return ((DisconnectUser) this.instance).getAddress();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.DisconnectUserOrBuilder
            public ByteString getAddressBytes() {
                return ((DisconnectUser) this.instance).getAddressBytes();
            }

            public Builder setAddress(String str) {
                copyOnWrite();
                ((DisconnectUser) this.instance).setAddress(str);
                return this;
            }

            public Builder setAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((DisconnectUser) this.instance).setAddressBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(DisconnectUser disconnectUser) {
            return DEFAULT_INSTANCE.createBuilder(disconnectUser);
        }

        public static DisconnectUser parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DisconnectUser) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DisconnectUser parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DisconnectUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DisconnectUser parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DisconnectUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DisconnectUser parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DisconnectUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DisconnectUser parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DisconnectUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DisconnectUser parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DisconnectUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DisconnectUser parseFrom(InputStream inputStream) throws IOException {
            return (DisconnectUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DisconnectUser parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DisconnectUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DisconnectUser parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DisconnectUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DisconnectUser parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DisconnectUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetCurrentUser extends GeneratedMessageLite<GetCurrentUser, Builder> implements GetCurrentUserOrBuilder {
        private static final GetCurrentUser DEFAULT_INSTANCE;
        private static volatile Parser<GetCurrentUser> PARSER;

        static {
            GetCurrentUser getCurrentUser = new GetCurrentUser();
            DEFAULT_INSTANCE = getCurrentUser;
            getCurrentUser.makeImmutable();
        }

        private GetCurrentUser() {
        }

        public static GetCurrentUser getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetCurrentUser parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetCurrentUser) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetCurrentUser parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetCurrentUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetCurrentUser> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetCurrentUser();
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
                        synchronized (GetCurrentUser.class) {
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
        public static final class Builder extends GeneratedMessageLite.Builder<GetCurrentUser, Builder> implements GetCurrentUserOrBuilder {
            private Builder() {
                super(GetCurrentUser.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(GetCurrentUser getCurrentUser) {
            return DEFAULT_INSTANCE.createBuilder(getCurrentUser);
        }

        public static GetCurrentUser parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCurrentUser) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetCurrentUser parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCurrentUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetCurrentUser parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetCurrentUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetCurrentUser parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCurrentUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetCurrentUser parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetCurrentUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetCurrentUser parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetCurrentUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetCurrentUser parseFrom(InputStream inputStream) throws IOException {
            return (GetCurrentUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetCurrentUser parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCurrentUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetCurrentUser parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetCurrentUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetCurrentUser parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetCurrentUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetLocales extends GeneratedMessageLite<GetLocales, Builder> implements GetLocalesOrBuilder {
        private static final GetLocales DEFAULT_INSTANCE;
        private static volatile Parser<GetLocales> PARSER;

        static {
            GetLocales getLocales = new GetLocales();
            DEFAULT_INSTANCE = getLocales;
            getLocales.makeImmutable();
        }

        private GetLocales() {
        }

        public static GetLocales getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetLocales parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetLocales) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetLocales parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetLocales) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetLocales> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetLocales();
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
                        synchronized (GetLocales.class) {
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
        public static final class Builder extends GeneratedMessageLite.Builder<GetLocales, Builder> implements GetLocalesOrBuilder {
            private Builder() {
                super(GetLocales.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(GetLocales getLocales) {
            return DEFAULT_INSTANCE.createBuilder(getLocales);
        }

        public static GetLocales parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetLocales) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetLocales parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetLocales) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetLocales parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetLocales) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetLocales parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetLocales) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetLocales parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetLocales) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetLocales parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetLocales) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetLocales parseFrom(InputStream inputStream) throws IOException {
            return (GetLocales) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetLocales parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetLocales) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetLocales parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetLocales) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetLocales parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetLocales) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetUsers extends GeneratedMessageLite<GetUsers, Builder> implements GetUsersOrBuilder {
        private static final GetUsers DEFAULT_INSTANCE;
        private static volatile Parser<GetUsers> PARSER;

        static {
            GetUsers getUsers = new GetUsers();
            DEFAULT_INSTANCE = getUsers;
            getUsers.makeImmutable();
        }

        private GetUsers() {
        }

        public static GetUsers getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetUsers parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetUsers) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetUsers parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetUsers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetUsers> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetUsers();
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
                        synchronized (GetUsers.class) {
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
        public static final class Builder extends GeneratedMessageLite.Builder<GetUsers, Builder> implements GetUsersOrBuilder {
            private Builder() {
                super(GetUsers.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(GetUsers getUsers) {
            return DEFAULT_INSTANCE.createBuilder(getUsers);
        }

        public static GetUsers parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetUsers) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetUsers parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetUsers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetUsers parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetUsers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetUsers parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetUsers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetUsers parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetUsers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetUsers parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetUsers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetUsers parseFrom(InputStream inputStream) throws IOException {
            return (GetUsers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetUsers parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetUsers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetUsers parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetUsers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetUsers parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetUsers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetWakewords extends GeneratedMessageLite<GetWakewords, Builder> implements GetWakewordsOrBuilder {
        private static final GetWakewords DEFAULT_INSTANCE;
        private static volatile Parser<GetWakewords> PARSER;

        static {
            GetWakewords getWakewords = new GetWakewords();
            DEFAULT_INSTANCE = getWakewords;
            getWakewords.makeImmutable();
        }

        private GetWakewords() {
        }

        public static GetWakewords getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetWakewords parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetWakewords) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetWakewords parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetWakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetWakewords> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetWakewords();
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
                        synchronized (GetWakewords.class) {
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
        public static final class Builder extends GeneratedMessageLite.Builder<GetWakewords, Builder> implements GetWakewordsOrBuilder {
            private Builder() {
                super(GetWakewords.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(GetWakewords getWakewords) {
            return DEFAULT_INSTANCE.createBuilder(getWakewords);
        }

        public static GetWakewords parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetWakewords) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetWakewords parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetWakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetWakewords parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetWakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetWakewords parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetWakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetWakewords parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetWakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetWakewords parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetWakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetWakewords parseFrom(InputStream inputStream) throws IOException {
            return (GetWakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetWakewords parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetWakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetWakewords parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetWakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetWakewords parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetWakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class KeepAlive extends GeneratedMessageLite<KeepAlive, Builder> implements KeepAliveOrBuilder {
        private static final KeepAlive DEFAULT_INSTANCE;
        private static volatile Parser<KeepAlive> PARSER;

        static {
            KeepAlive keepAlive = new KeepAlive();
            DEFAULT_INSTANCE = keepAlive;
            keepAlive.makeImmutable();
        }

        private KeepAlive() {
        }

        public static KeepAlive getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static KeepAlive parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (KeepAlive) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static KeepAlive parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (KeepAlive) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<KeepAlive> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new KeepAlive();
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
                        synchronized (KeepAlive.class) {
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
        public static final class Builder extends GeneratedMessageLite.Builder<KeepAlive, Builder> implements KeepAliveOrBuilder {
            private Builder() {
                super(KeepAlive.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(KeepAlive keepAlive) {
            return DEFAULT_INSTANCE.createBuilder(keepAlive);
        }

        public static KeepAlive parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (KeepAlive) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static KeepAlive parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (KeepAlive) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static KeepAlive parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (KeepAlive) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static KeepAlive parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (KeepAlive) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static KeepAlive parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (KeepAlive) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static KeepAlive parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (KeepAlive) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static KeepAlive parseFrom(InputStream inputStream) throws IOException {
            return (KeepAlive) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static KeepAlive parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (KeepAlive) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static KeepAlive parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (KeepAlive) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static KeepAlive parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (KeepAlive) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class LaunchApp extends GeneratedMessageLite<LaunchApp, Builder> implements LaunchAppOrBuilder {
        public static final int APP_ID_FIELD_NUMBER = 1;
        private static final LaunchApp DEFAULT_INSTANCE;
        private static volatile Parser<LaunchApp> PARSER;
        private String appId_ = "";

        static {
            LaunchApp launchApp = new LaunchApp();
            DEFAULT_INSTANCE = launchApp;
            launchApp.makeImmutable();
        }

        private LaunchApp() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppId() {
            this.appId_ = getDefaultInstance().getAppId();
        }

        public static LaunchApp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static LaunchApp parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LaunchApp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LaunchApp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (LaunchApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<LaunchApp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppId(String str) {
            str.getClass();
            this.appId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppIdBytes(ByteString byteString) {
            this.appId_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new LaunchApp();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.appId_ = ((GeneratedMessageLite.Visitor) obj).visitString(!this.appId_.isEmpty(), this.appId_, !r6.appId_.isEmpty(), ((LaunchApp) obj2).appId_);
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
                                    this.appId_ = codedInputStream.readStringRequireUtf8();
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
                        synchronized (LaunchApp.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.System.LaunchAppOrBuilder
        public String getAppId() {
            return this.appId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.LaunchAppOrBuilder
        public ByteString getAppIdBytes() {
            return ByteString.copyFromUtf8(this.appId_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (!this.appId_.isEmpty() ? CodedOutputStream.computeStringSize(1, getAppId()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.appId_.isEmpty()) {
                codedOutputStream.writeString(1, getAppId());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<LaunchApp, Builder> implements LaunchAppOrBuilder {
            private Builder() {
                super(LaunchApp.DEFAULT_INSTANCE);
            }

            public Builder clearAppId() {
                copyOnWrite();
                ((LaunchApp) this.instance).clearAppId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.System.LaunchAppOrBuilder
            public String getAppId() {
                return ((LaunchApp) this.instance).getAppId();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.LaunchAppOrBuilder
            public ByteString getAppIdBytes() {
                return ((LaunchApp) this.instance).getAppIdBytes();
            }

            public Builder setAppId(String str) {
                copyOnWrite();
                ((LaunchApp) this.instance).setAppId(str);
                return this;
            }

            public Builder setAppIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LaunchApp) this.instance).setAppIdBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(LaunchApp launchApp) {
            return DEFAULT_INSTANCE.createBuilder(launchApp);
        }

        public static LaunchApp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LaunchApp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LaunchApp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LaunchApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static LaunchApp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LaunchApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static LaunchApp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LaunchApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static LaunchApp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LaunchApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LaunchApp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LaunchApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static LaunchApp parseFrom(InputStream inputStream) throws IOException {
            return (LaunchApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LaunchApp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LaunchApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LaunchApp parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (LaunchApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static LaunchApp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LaunchApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Locale extends GeneratedMessageLite<Locale, Builder> implements LocaleOrBuilder {
        private static final Locale DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile Parser<Locale> PARSER;
        private String name_ = "";

        static {
            Locale locale = new Locale();
            DEFAULT_INSTANCE = locale;
            locale.makeImmutable();
        }

        private Locale() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        public static Locale getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Locale parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Locale) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Locale parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Locale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Locale> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Locale();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.name_ = ((GeneratedMessageLite.Visitor) obj).visitString(!this.name_.isEmpty(), this.name_, !r6.name_.isEmpty(), ((Locale) obj2).name_);
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
                                    this.name_ = codedInputStream.readStringRequireUtf8();
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
                        synchronized (Locale.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.System.LocaleOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.LocaleOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (!this.name_.isEmpty() ? CodedOutputStream.computeStringSize(1, getName()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.name_.isEmpty()) {
                codedOutputStream.writeString(1, getName());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<Locale, Builder> implements LocaleOrBuilder {
            private Builder() {
                super(Locale.DEFAULT_INSTANCE);
            }

            public Builder clearName() {
                copyOnWrite();
                ((Locale) this.instance).clearName();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.System.LocaleOrBuilder
            public String getName() {
                return ((Locale) this.instance).getName();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.LocaleOrBuilder
            public ByteString getNameBytes() {
                return ((Locale) this.instance).getNameBytes();
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((Locale) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((Locale) this.instance).setNameBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(Locale locale) {
            return DEFAULT_INSTANCE.createBuilder(locale);
        }

        public static Locale parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Locale) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Locale parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Locale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Locale parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Locale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Locale parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Locale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Locale parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Locale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Locale parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Locale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Locale parseFrom(InputStream inputStream) throws IOException {
            return (Locale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Locale parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Locale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Locale parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Locale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Locale parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Locale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class RemoveDevice extends GeneratedMessageLite<RemoveDevice, Builder> implements RemoveDeviceOrBuilder {
        private static final RemoveDevice DEFAULT_INSTANCE;
        private static volatile Parser<RemoveDevice> PARSER;

        static {
            RemoveDevice removeDevice = new RemoveDevice();
            DEFAULT_INSTANCE = removeDevice;
            removeDevice.makeImmutable();
        }

        private RemoveDevice() {
        }

        public static RemoveDevice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RemoveDevice parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RemoveDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RemoveDevice parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RemoveDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RemoveDevice> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RemoveDevice();
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
                        synchronized (RemoveDevice.class) {
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
        public static final class Builder extends GeneratedMessageLite.Builder<RemoveDevice, Builder> implements RemoveDeviceOrBuilder {
            private Builder() {
                super(RemoveDevice.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(RemoveDevice removeDevice) {
            return DEFAULT_INSTANCE.createBuilder(removeDevice);
        }

        public static RemoveDevice parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RemoveDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RemoveDevice parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RemoveDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RemoveDevice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RemoveDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RemoveDevice parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RemoveDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RemoveDevice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RemoveDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RemoveDevice parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RemoveDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RemoveDevice parseFrom(InputStream inputStream) throws IOException {
            return (RemoveDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RemoveDevice parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RemoveDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RemoveDevice parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RemoveDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RemoveDevice parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RemoveDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ResetConnection extends GeneratedMessageLite<ResetConnection, Builder> implements ResetConnectionOrBuilder {
        private static final ResetConnection DEFAULT_INSTANCE;
        public static final int FORCE_DISCONNECT_FIELD_NUMBER = 2;
        private static volatile Parser<ResetConnection> PARSER = null;
        public static final int RESET_REASON_FIELD_NUMBER = 3;
        public static final int TIMEOUT_FIELD_NUMBER = 1;
        private boolean forceDisconnect_;
        private int resetReason_;
        private int timeout_;

        static {
            ResetConnection resetConnection = new ResetConnection();
            DEFAULT_INSTANCE = resetConnection;
            resetConnection.makeImmutable();
        }

        private ResetConnection() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearForceDisconnect() {
            this.forceDisconnect_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResetReason() {
            this.resetReason_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeout() {
            this.timeout_ = 0;
        }

        public static ResetConnection getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ResetConnection parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ResetConnection) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResetConnection parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ResetConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ResetConnection> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setForceDisconnect(boolean z) {
            this.forceDisconnect_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResetReason(ResetReason resetReason) {
            resetReason.getClass();
            this.resetReason_ = resetReason.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResetReasonValue(int i) {
            this.resetReason_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeout(int i) {
            this.timeout_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ResetConnection();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    ResetConnection resetConnection = (ResetConnection) obj2;
                    int i = this.timeout_;
                    boolean z = i != 0;
                    int i2 = resetConnection.timeout_;
                    this.timeout_ = visitor.visitInt(z, i, i2 != 0, i2);
                    boolean z2 = this.forceDisconnect_;
                    boolean z3 = resetConnection.forceDisconnect_;
                    this.forceDisconnect_ = visitor.visitBoolean(z2, z2, z3, z3);
                    int i3 = this.resetReason_;
                    boolean z4 = i3 != 0;
                    int i4 = resetConnection.resetReason_;
                    this.resetReason_ = visitor.visitInt(z4, i3, i4 != 0, i4);
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
                                    this.timeout_ = codedInputStream.readUInt32();
                                } else if (readTag == 16) {
                                    this.forceDisconnect_ = codedInputStream.readBool();
                                } else if (readTag == 24) {
                                    this.resetReason_ = codedInputStream.readEnum();
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
                        synchronized (ResetConnection.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.System.ResetConnectionOrBuilder
        public boolean getForceDisconnect() {
            return this.forceDisconnect_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.ResetConnectionOrBuilder
        public ResetReason getResetReason() {
            ResetReason forNumber = ResetReason.forNumber(this.resetReason_);
            return forNumber == null ? ResetReason.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.ResetConnectionOrBuilder
        public int getResetReasonValue() {
            return this.resetReason_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.timeout_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            boolean z = this.forceDisconnect_;
            if (z) {
                computeUInt32Size += CodedOutputStream.computeBoolSize(2, z);
            }
            if (this.resetReason_ != ResetReason.UNKNOWN.getNumber()) {
                computeUInt32Size += CodedOutputStream.computeEnumSize(3, this.resetReason_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.ResetConnectionOrBuilder
        public int getTimeout() {
            return this.timeout_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.timeout_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            boolean z = this.forceDisconnect_;
            if (z) {
                codedOutputStream.writeBool(2, z);
            }
            if (this.resetReason_ != ResetReason.UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(3, this.resetReason_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<ResetConnection, Builder> implements ResetConnectionOrBuilder {
            private Builder() {
                super(ResetConnection.DEFAULT_INSTANCE);
            }

            public Builder clearForceDisconnect() {
                copyOnWrite();
                ((ResetConnection) this.instance).clearForceDisconnect();
                return this;
            }

            public Builder clearResetReason() {
                copyOnWrite();
                ((ResetConnection) this.instance).clearResetReason();
                return this;
            }

            public Builder clearTimeout() {
                copyOnWrite();
                ((ResetConnection) this.instance).clearTimeout();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.System.ResetConnectionOrBuilder
            public boolean getForceDisconnect() {
                return ((ResetConnection) this.instance).getForceDisconnect();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.ResetConnectionOrBuilder
            public ResetReason getResetReason() {
                return ((ResetConnection) this.instance).getResetReason();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.ResetConnectionOrBuilder
            public int getResetReasonValue() {
                return ((ResetConnection) this.instance).getResetReasonValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.ResetConnectionOrBuilder
            public int getTimeout() {
                return ((ResetConnection) this.instance).getTimeout();
            }

            public Builder setForceDisconnect(boolean z) {
                copyOnWrite();
                ((ResetConnection) this.instance).setForceDisconnect(z);
                return this;
            }

            public Builder setResetReason(ResetReason resetReason) {
                copyOnWrite();
                ((ResetConnection) this.instance).setResetReason(resetReason);
                return this;
            }

            public Builder setResetReasonValue(int i) {
                copyOnWrite();
                ((ResetConnection) this.instance).setResetReasonValue(i);
                return this;
            }

            public Builder setTimeout(int i) {
                copyOnWrite();
                ((ResetConnection) this.instance).setTimeout(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum ResetReason implements Internal.EnumLite {
            UNKNOWN(0),
            AAP_REFUSED_MAX_CONNECTIONS_REACHED(1),
            UNRECOGNIZED(-1);

            public static final int AAP_REFUSED_MAX_CONNECTIONS_REACHED_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private static final Internal.EnumLiteMap<ResetReason> internalValueMap = new Internal.EnumLiteMap<ResetReason>() { // from class: com.amazon.alexa.accessory.protocol.System.ResetConnection.ResetReason.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ResetReason findValueByNumber(int i) {
                    return ResetReason.forNumber(i);
                }
            };
            private final int value;

            ResetReason(int i) {
                this.value = i;
            }

            public static ResetReason forNumber(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i != 1) {
                    return null;
                }
                return AAP_REFUSED_MAX_CONNECTIONS_REACHED;
            }

            public static Internal.EnumLiteMap<ResetReason> internalGetValueMap() {
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
            public static ResetReason valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(ResetConnection resetConnection) {
            return DEFAULT_INSTANCE.createBuilder(resetConnection);
        }

        public static ResetConnection parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResetConnection) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ResetConnection parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResetConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ResetConnection parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ResetConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ResetConnection parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResetConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ResetConnection parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ResetConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ResetConnection parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResetConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ResetConnection parseFrom(InputStream inputStream) throws IOException {
            return (ResetConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResetConnection parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResetConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ResetConnection parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ResetConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ResetConnection parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResetConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ResetDevice extends GeneratedMessageLite<ResetDevice, Builder> implements ResetDeviceOrBuilder {
        private static final ResetDevice DEFAULT_INSTANCE;
        private static volatile Parser<ResetDevice> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int type_;

        static {
            ResetDevice resetDevice = new ResetDevice();
            DEFAULT_INSTANCE = resetDevice;
            resetDevice.makeImmutable();
        }

        private ResetDevice() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static ResetDevice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ResetDevice parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ResetDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResetDevice parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ResetDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ResetDevice> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(ResetType resetType) {
            resetType.getClass();
            this.type_ = resetType.getNumber();
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
                    return new ResetDevice();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    ResetDevice resetDevice = (ResetDevice) obj2;
                    int i = this.type_;
                    boolean z = i != 0;
                    int i2 = resetDevice.type_;
                    this.type_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    this.type_ = codedInputStream.readEnum();
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
                        synchronized (ResetDevice.class) {
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
            int serializedSize = this.unknownFields.getSerializedSize() + (this.type_ != ResetType.RESET_TYPE_UNSPECIFIED.getNumber() ? CodedOutputStream.computeEnumSize(1, this.type_) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.ResetDeviceOrBuilder
        public ResetType getType() {
            ResetType forNumber = ResetType.forNumber(this.type_);
            return forNumber == null ? ResetType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.ResetDeviceOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != ResetType.RESET_TYPE_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<ResetDevice, Builder> implements ResetDeviceOrBuilder {
            private Builder() {
                super(ResetDevice.DEFAULT_INSTANCE);
            }

            public Builder clearType() {
                copyOnWrite();
                ((ResetDevice) this.instance).clearType();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.System.ResetDeviceOrBuilder
            public ResetType getType() {
                return ((ResetDevice) this.instance).getType();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.ResetDeviceOrBuilder
            public int getTypeValue() {
                return ((ResetDevice) this.instance).getTypeValue();
            }

            public Builder setType(ResetType resetType) {
                copyOnWrite();
                ((ResetDevice) this.instance).setType(resetType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((ResetDevice) this.instance).setTypeValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum ResetType implements Internal.EnumLite {
            RESET_TYPE_UNSPECIFIED(0),
            RESET_TYPE_FACTORY_RESET(1),
            UNRECOGNIZED(-1);

            public static final int RESET_TYPE_FACTORY_RESET_VALUE = 1;
            public static final int RESET_TYPE_UNSPECIFIED_VALUE = 0;
            private static final Internal.EnumLiteMap<ResetType> internalValueMap = new Internal.EnumLiteMap<ResetType>() { // from class: com.amazon.alexa.accessory.protocol.System.ResetDevice.ResetType.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ResetType findValueByNumber(int i) {
                    return ResetType.forNumber(i);
                }
            };
            private final int value;

            ResetType(int i) {
                this.value = i;
            }

            public static ResetType forNumber(int i) {
                if (i == 0) {
                    return RESET_TYPE_UNSPECIFIED;
                }
                if (i != 1) {
                    return null;
                }
                return RESET_TYPE_FACTORY_RESET;
            }

            public static Internal.EnumLiteMap<ResetType> internalGetValueMap() {
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
            public static ResetType valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(ResetDevice resetDevice) {
            return DEFAULT_INSTANCE.createBuilder(resetDevice);
        }

        public static ResetDevice parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResetDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ResetDevice parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResetDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ResetDevice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ResetDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ResetDevice parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResetDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ResetDevice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ResetDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ResetDevice parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResetDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ResetDevice parseFrom(InputStream inputStream) throws IOException {
            return (ResetDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResetDevice parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResetDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ResetDevice parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ResetDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ResetDevice parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResetDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ResetDeviceStatus extends GeneratedMessageLite<ResetDeviceStatus, Builder> implements ResetDeviceStatusOrBuilder {
        private static final ResetDeviceStatus DEFAULT_INSTANCE;
        public static final int ERROR_CODE_FIELD_NUMBER = 1;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
        private static volatile Parser<ResetDeviceStatus> PARSER;
        private int errorCode_;
        private String errorMessage_ = "";

        static {
            ResetDeviceStatus resetDeviceStatus = new ResetDeviceStatus();
            DEFAULT_INSTANCE = resetDeviceStatus;
            resetDeviceStatus.makeImmutable();
        }

        private ResetDeviceStatus() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorCode() {
            this.errorCode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorMessage() {
            this.errorMessage_ = getDefaultInstance().getErrorMessage();
        }

        public static ResetDeviceStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ResetDeviceStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ResetDeviceStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResetDeviceStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ResetDeviceStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ResetDeviceStatus> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCode(int i) {
            this.errorCode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorMessage(String str) {
            str.getClass();
            this.errorMessage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorMessageBytes(ByteString byteString) {
            this.errorMessage_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ResetDeviceStatus();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    ResetDeviceStatus resetDeviceStatus = (ResetDeviceStatus) obj2;
                    int i = this.errorCode_;
                    boolean z = i != 0;
                    int i2 = resetDeviceStatus.errorCode_;
                    this.errorCode_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.errorMessage_ = visitor.visitString(!this.errorMessage_.isEmpty(), this.errorMessage_, !resetDeviceStatus.errorMessage_.isEmpty(), resetDeviceStatus.errorMessage_);
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
                                    this.errorCode_ = codedInputStream.readUInt32();
                                } else if (readTag == 18) {
                                    this.errorMessage_ = codedInputStream.readStringRequireUtf8();
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
                        synchronized (ResetDeviceStatus.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.System.ResetDeviceStatusOrBuilder
        public int getErrorCode() {
            return this.errorCode_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.ResetDeviceStatusOrBuilder
        public String getErrorMessage() {
            return this.errorMessage_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.ResetDeviceStatusOrBuilder
        public ByteString getErrorMessageBytes() {
            return ByteString.copyFromUtf8(this.errorMessage_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.errorCode_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            if (!this.errorMessage_.isEmpty()) {
                computeUInt32Size += CodedOutputStream.computeStringSize(2, getErrorMessage());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.errorCode_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            if (!this.errorMessage_.isEmpty()) {
                codedOutputStream.writeString(2, getErrorMessage());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<ResetDeviceStatus, Builder> implements ResetDeviceStatusOrBuilder {
            private Builder() {
                super(ResetDeviceStatus.DEFAULT_INSTANCE);
            }

            public Builder clearErrorCode() {
                copyOnWrite();
                ((ResetDeviceStatus) this.instance).clearErrorCode();
                return this;
            }

            public Builder clearErrorMessage() {
                copyOnWrite();
                ((ResetDeviceStatus) this.instance).clearErrorMessage();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.System.ResetDeviceStatusOrBuilder
            public int getErrorCode() {
                return ((ResetDeviceStatus) this.instance).getErrorCode();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.ResetDeviceStatusOrBuilder
            public String getErrorMessage() {
                return ((ResetDeviceStatus) this.instance).getErrorMessage();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.ResetDeviceStatusOrBuilder
            public ByteString getErrorMessageBytes() {
                return ((ResetDeviceStatus) this.instance).getErrorMessageBytes();
            }

            public Builder setErrorCode(int i) {
                copyOnWrite();
                ((ResetDeviceStatus) this.instance).setErrorCode(i);
                return this;
            }

            public Builder setErrorMessage(String str) {
                copyOnWrite();
                ((ResetDeviceStatus) this.instance).setErrorMessage(str);
                return this;
            }

            public Builder setErrorMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((ResetDeviceStatus) this.instance).setErrorMessageBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(ResetDeviceStatus resetDeviceStatus) {
            return DEFAULT_INSTANCE.createBuilder(resetDeviceStatus);
        }

        public static ResetDeviceStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResetDeviceStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ResetDeviceStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResetDeviceStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ResetDeviceStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ResetDeviceStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ResetDeviceStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResetDeviceStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ResetDeviceStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ResetDeviceStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ResetDeviceStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResetDeviceStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ResetDeviceStatus parseFrom(InputStream inputStream) throws IOException {
            return (ResetDeviceStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResetDeviceStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResetDeviceStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ResetDeviceStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ResetDeviceStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ResetDeviceStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResetDeviceStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SendProfileInfo extends GeneratedMessageLite<SendProfileInfo, Builder> implements SendProfileInfoOrBuilder {
        private static final SendProfileInfo DEFAULT_INSTANCE;
        private static volatile Parser<SendProfileInfo> PARSER = null;
        public static final int PROFILE_NAME_FIELD_NUMBER = 1;
        private String profileName_ = "";

        static {
            SendProfileInfo sendProfileInfo = new SendProfileInfo();
            DEFAULT_INSTANCE = sendProfileInfo;
            sendProfileInfo.makeImmutable();
        }

        private SendProfileInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProfileName() {
            this.profileName_ = getDefaultInstance().getProfileName();
        }

        public static SendProfileInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SendProfileInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SendProfileInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SendProfileInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SendProfileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SendProfileInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileName(String str) {
            str.getClass();
            this.profileName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileNameBytes(ByteString byteString) {
            this.profileName_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SendProfileInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.profileName_ = ((GeneratedMessageLite.Visitor) obj).visitString(!this.profileName_.isEmpty(), this.profileName_, !r6.profileName_.isEmpty(), ((SendProfileInfo) obj2).profileName_);
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
                                    this.profileName_ = codedInputStream.readStringRequireUtf8();
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
                        synchronized (SendProfileInfo.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.System.SendProfileInfoOrBuilder
        public String getProfileName() {
            return this.profileName_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.SendProfileInfoOrBuilder
        public ByteString getProfileNameBytes() {
            return ByteString.copyFromUtf8(this.profileName_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (!this.profileName_.isEmpty() ? CodedOutputStream.computeStringSize(1, getProfileName()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.profileName_.isEmpty()) {
                codedOutputStream.writeString(1, getProfileName());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SendProfileInfo, Builder> implements SendProfileInfoOrBuilder {
            private Builder() {
                super(SendProfileInfo.DEFAULT_INSTANCE);
            }

            public Builder clearProfileName() {
                copyOnWrite();
                ((SendProfileInfo) this.instance).clearProfileName();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.System.SendProfileInfoOrBuilder
            public String getProfileName() {
                return ((SendProfileInfo) this.instance).getProfileName();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.SendProfileInfoOrBuilder
            public ByteString getProfileNameBytes() {
                return ((SendProfileInfo) this.instance).getProfileNameBytes();
            }

            public Builder setProfileName(String str) {
                copyOnWrite();
                ((SendProfileInfo) this.instance).setProfileName(str);
                return this;
            }

            public Builder setProfileNameBytes(ByteString byteString) {
                copyOnWrite();
                ((SendProfileInfo) this.instance).setProfileNameBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(SendProfileInfo sendProfileInfo) {
            return DEFAULT_INSTANCE.createBuilder(sendProfileInfo);
        }

        public static SendProfileInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SendProfileInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SendProfileInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SendProfileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SendProfileInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SendProfileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SendProfileInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SendProfileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SendProfileInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SendProfileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SendProfileInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SendProfileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SendProfileInfo parseFrom(InputStream inputStream) throws IOException {
            return (SendProfileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SendProfileInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SendProfileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SendProfileInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SendProfileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SendProfileInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SendProfileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SetWakewords extends GeneratedMessageLite<SetWakewords, Builder> implements SetWakewordsOrBuilder {
        public static final int ACTIVE_WAKEWORDS_FIELD_NUMBER = 1;
        private static final SetWakewords DEFAULT_INSTANCE;
        private static volatile Parser<SetWakewords> PARSER;
        private Internal.ProtobufList<String> activeWakewords_ = GeneratedMessageLite.emptyProtobufList();

        static {
            SetWakewords setWakewords = new SetWakewords();
            DEFAULT_INSTANCE = setWakewords;
            setWakewords.makeImmutable();
        }

        private SetWakewords() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addActiveWakewords(String str) {
            str.getClass();
            ensureActiveWakewordsIsMutable();
            this.activeWakewords_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addActiveWakewordsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureActiveWakewordsIsMutable();
            this.activeWakewords_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllActiveWakewords(Iterable<String> iterable) {
            ensureActiveWakewordsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.activeWakewords_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActiveWakewords() {
            this.activeWakewords_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureActiveWakewordsIsMutable() {
            if (this.activeWakewords_.isModifiable()) {
                return;
            }
            this.activeWakewords_ = GeneratedMessageLite.mutableCopy(this.activeWakewords_);
        }

        public static SetWakewords getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SetWakewords parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SetWakewords) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SetWakewords parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SetWakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SetWakewords> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActiveWakewords(int i, String str) {
            str.getClass();
            ensureActiveWakewordsIsMutable();
            this.activeWakewords_.set(i, str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SetWakewords();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.activeWakewords_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.activeWakewords_ = ((GeneratedMessageLite.Visitor) obj).visitList(this.activeWakewords_, ((SetWakewords) obj2).activeWakewords_);
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
                                    if (!this.activeWakewords_.isModifiable()) {
                                        this.activeWakewords_ = GeneratedMessageLite.mutableCopy(this.activeWakewords_);
                                    }
                                    this.activeWakewords_.add(readStringRequireUtf8);
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
                        synchronized (SetWakewords.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.System.SetWakewordsOrBuilder
        public String getActiveWakewords(int i) {
            return this.activeWakewords_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.System.SetWakewordsOrBuilder
        public ByteString getActiveWakewordsBytes(int i) {
            return ByteString.copyFromUtf8(this.activeWakewords_.get(i));
        }

        @Override // com.amazon.alexa.accessory.protocol.System.SetWakewordsOrBuilder
        public int getActiveWakewordsCount() {
            return this.activeWakewords_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.System.SetWakewordsOrBuilder
        public List<String> getActiveWakewordsList() {
            return this.activeWakewords_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.activeWakewords_.size(); i3++) {
                i2 += CodedOutputStream.computeStringSizeNoTag(this.activeWakewords_.get(i3));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + getActiveWakewordsList().size() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.activeWakewords_.size(); i++) {
                codedOutputStream.writeString(1, this.activeWakewords_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SetWakewords, Builder> implements SetWakewordsOrBuilder {
            private Builder() {
                super(SetWakewords.DEFAULT_INSTANCE);
            }

            public Builder addActiveWakewords(String str) {
                copyOnWrite();
                ((SetWakewords) this.instance).addActiveWakewords(str);
                return this;
            }

            public Builder addActiveWakewordsBytes(ByteString byteString) {
                copyOnWrite();
                ((SetWakewords) this.instance).addActiveWakewordsBytes(byteString);
                return this;
            }

            public Builder addAllActiveWakewords(Iterable<String> iterable) {
                copyOnWrite();
                ((SetWakewords) this.instance).addAllActiveWakewords(iterable);
                return this;
            }

            public Builder clearActiveWakewords() {
                copyOnWrite();
                ((SetWakewords) this.instance).clearActiveWakewords();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.System.SetWakewordsOrBuilder
            public String getActiveWakewords(int i) {
                return ((SetWakewords) this.instance).getActiveWakewords(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.System.SetWakewordsOrBuilder
            public ByteString getActiveWakewordsBytes(int i) {
                return ((SetWakewords) this.instance).getActiveWakewordsBytes(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.System.SetWakewordsOrBuilder
            public int getActiveWakewordsCount() {
                return ((SetWakewords) this.instance).getActiveWakewordsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.SetWakewordsOrBuilder
            public List<String> getActiveWakewordsList() {
                return Collections.unmodifiableList(((SetWakewords) this.instance).getActiveWakewordsList());
            }

            public Builder setActiveWakewords(int i, String str) {
                copyOnWrite();
                ((SetWakewords) this.instance).setActiveWakewords(i, str);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(SetWakewords setWakewords) {
            return DEFAULT_INSTANCE.createBuilder(setWakewords);
        }

        public static SetWakewords parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetWakewords) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SetWakewords parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetWakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SetWakewords parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SetWakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SetWakewords parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetWakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SetWakewords parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SetWakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SetWakewords parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SetWakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SetWakewords parseFrom(InputStream inputStream) throws IOException {
            return (SetWakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SetWakewords parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetWakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SetWakewords parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SetWakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SetWakewords parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SetWakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SwitchCurrentUser extends GeneratedMessageLite<SwitchCurrentUser, Builder> implements SwitchCurrentUserOrBuilder {
        private static final SwitchCurrentUser DEFAULT_INSTANCE;
        private static volatile Parser<SwitchCurrentUser> PARSER = null;
        public static final int USER_ID_FIELD_NUMBER = 1;
        private int userId_;

        static {
            SwitchCurrentUser switchCurrentUser = new SwitchCurrentUser();
            DEFAULT_INSTANCE = switchCurrentUser;
            switchCurrentUser.makeImmutable();
        }

        private SwitchCurrentUser() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = 0;
        }

        public static SwitchCurrentUser getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SwitchCurrentUser parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SwitchCurrentUser) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SwitchCurrentUser parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SwitchCurrentUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SwitchCurrentUser> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(int i) {
            this.userId_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SwitchCurrentUser();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    SwitchCurrentUser switchCurrentUser = (SwitchCurrentUser) obj2;
                    int i = this.userId_;
                    boolean z = i != 0;
                    int i2 = switchCurrentUser.userId_;
                    this.userId_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    this.userId_ = codedInputStream.readUInt32();
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
                        synchronized (SwitchCurrentUser.class) {
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
            int i2 = this.userId_;
            int serializedSize = this.unknownFields.getSerializedSize() + (i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.SwitchCurrentUserOrBuilder
        public int getUserId() {
            return this.userId_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.userId_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SwitchCurrentUser, Builder> implements SwitchCurrentUserOrBuilder {
            private Builder() {
                super(SwitchCurrentUser.DEFAULT_INSTANCE);
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((SwitchCurrentUser) this.instance).clearUserId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.System.SwitchCurrentUserOrBuilder
            public int getUserId() {
                return ((SwitchCurrentUser) this.instance).getUserId();
            }

            public Builder setUserId(int i) {
                copyOnWrite();
                ((SwitchCurrentUser) this.instance).setUserId(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(SwitchCurrentUser switchCurrentUser) {
            return DEFAULT_INSTANCE.createBuilder(switchCurrentUser);
        }

        public static SwitchCurrentUser parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SwitchCurrentUser) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SwitchCurrentUser parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SwitchCurrentUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SwitchCurrentUser parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SwitchCurrentUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SwitchCurrentUser parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SwitchCurrentUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SwitchCurrentUser parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SwitchCurrentUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SwitchCurrentUser parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SwitchCurrentUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SwitchCurrentUser parseFrom(InputStream inputStream) throws IOException {
            return (SwitchCurrentUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SwitchCurrentUser parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SwitchCurrentUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SwitchCurrentUser parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SwitchCurrentUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SwitchCurrentUser parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SwitchCurrentUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SynchronizeSettings extends GeneratedMessageLite<SynchronizeSettings, Builder> implements SynchronizeSettingsOrBuilder {
        private static final SynchronizeSettings DEFAULT_INSTANCE;
        private static volatile Parser<SynchronizeSettings> PARSER = null;
        public static final int TIMESTAMP_HI_FIELD_NUMBER = 1;
        public static final int TIMESTAMP_LO_FIELD_NUMBER = 2;
        public static final int UTC_TIME_OFFSET_FIELD_NUMBER = 3;
        private int timestampHi_;
        private int timestampLo_;
        private String utcTimeOffset_ = "";

        static {
            SynchronizeSettings synchronizeSettings = new SynchronizeSettings();
            DEFAULT_INSTANCE = synchronizeSettings;
            synchronizeSettings.makeImmutable();
        }

        private SynchronizeSettings() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestampHi() {
            this.timestampHi_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestampLo() {
            this.timestampLo_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUtcTimeOffset() {
            this.utcTimeOffset_ = getDefaultInstance().getUtcTimeOffset();
        }

        public static SynchronizeSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SynchronizeSettings parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SynchronizeSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SynchronizeSettings parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SynchronizeSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SynchronizeSettings> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestampHi(int i) {
            this.timestampHi_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestampLo(int i) {
            this.timestampLo_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUtcTimeOffset(String str) {
            str.getClass();
            this.utcTimeOffset_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUtcTimeOffsetBytes(ByteString byteString) {
            this.utcTimeOffset_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SynchronizeSettings();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    SynchronizeSettings synchronizeSettings = (SynchronizeSettings) obj2;
                    int i = this.timestampHi_;
                    boolean z = i != 0;
                    int i2 = synchronizeSettings.timestampHi_;
                    this.timestampHi_ = visitor.visitInt(z, i, i2 != 0, i2);
                    int i3 = this.timestampLo_;
                    boolean z2 = i3 != 0;
                    int i4 = synchronizeSettings.timestampLo_;
                    this.timestampLo_ = visitor.visitInt(z2, i3, i4 != 0, i4);
                    this.utcTimeOffset_ = visitor.visitString(!this.utcTimeOffset_.isEmpty(), this.utcTimeOffset_, !synchronizeSettings.utcTimeOffset_.isEmpty(), synchronizeSettings.utcTimeOffset_);
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
                                    this.timestampHi_ = codedInputStream.readUInt32();
                                } else if (readTag == 16) {
                                    this.timestampLo_ = codedInputStream.readUInt32();
                                } else if (readTag == 26) {
                                    this.utcTimeOffset_ = codedInputStream.readStringRequireUtf8();
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
                        synchronized (SynchronizeSettings.class) {
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
            int i2 = this.timestampHi_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            int i3 = this.timestampLo_;
            if (i3 != 0) {
                computeUInt32Size += CodedOutputStream.computeUInt32Size(2, i3);
            }
            if (!this.utcTimeOffset_.isEmpty()) {
                computeUInt32Size += CodedOutputStream.computeStringSize(3, getUtcTimeOffset());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.SynchronizeSettingsOrBuilder
        public int getTimestampHi() {
            return this.timestampHi_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.SynchronizeSettingsOrBuilder
        public int getTimestampLo() {
            return this.timestampLo_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.SynchronizeSettingsOrBuilder
        public String getUtcTimeOffset() {
            return this.utcTimeOffset_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.SynchronizeSettingsOrBuilder
        public ByteString getUtcTimeOffsetBytes() {
            return ByteString.copyFromUtf8(this.utcTimeOffset_);
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.timestampHi_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            int i2 = this.timestampLo_;
            if (i2 != 0) {
                codedOutputStream.writeUInt32(2, i2);
            }
            if (!this.utcTimeOffset_.isEmpty()) {
                codedOutputStream.writeString(3, getUtcTimeOffset());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SynchronizeSettings, Builder> implements SynchronizeSettingsOrBuilder {
            private Builder() {
                super(SynchronizeSettings.DEFAULT_INSTANCE);
            }

            public Builder clearTimestampHi() {
                copyOnWrite();
                ((SynchronizeSettings) this.instance).clearTimestampHi();
                return this;
            }

            public Builder clearTimestampLo() {
                copyOnWrite();
                ((SynchronizeSettings) this.instance).clearTimestampLo();
                return this;
            }

            public Builder clearUtcTimeOffset() {
                copyOnWrite();
                ((SynchronizeSettings) this.instance).clearUtcTimeOffset();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.System.SynchronizeSettingsOrBuilder
            public int getTimestampHi() {
                return ((SynchronizeSettings) this.instance).getTimestampHi();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.SynchronizeSettingsOrBuilder
            public int getTimestampLo() {
                return ((SynchronizeSettings) this.instance).getTimestampLo();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.SynchronizeSettingsOrBuilder
            public String getUtcTimeOffset() {
                return ((SynchronizeSettings) this.instance).getUtcTimeOffset();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.SynchronizeSettingsOrBuilder
            public ByteString getUtcTimeOffsetBytes() {
                return ((SynchronizeSettings) this.instance).getUtcTimeOffsetBytes();
            }

            public Builder setTimestampHi(int i) {
                copyOnWrite();
                ((SynchronizeSettings) this.instance).setTimestampHi(i);
                return this;
            }

            public Builder setTimestampLo(int i) {
                copyOnWrite();
                ((SynchronizeSettings) this.instance).setTimestampLo(i);
                return this;
            }

            public Builder setUtcTimeOffset(String str) {
                copyOnWrite();
                ((SynchronizeSettings) this.instance).setUtcTimeOffset(str);
                return this;
            }

            public Builder setUtcTimeOffsetBytes(ByteString byteString) {
                copyOnWrite();
                ((SynchronizeSettings) this.instance).setUtcTimeOffsetBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(SynchronizeSettings synchronizeSettings) {
            return DEFAULT_INSTANCE.createBuilder(synchronizeSettings);
        }

        public static SynchronizeSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SynchronizeSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SynchronizeSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SynchronizeSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SynchronizeSettings parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SynchronizeSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SynchronizeSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SynchronizeSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SynchronizeSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SynchronizeSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SynchronizeSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SynchronizeSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SynchronizeSettings parseFrom(InputStream inputStream) throws IOException {
            return (SynchronizeSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SynchronizeSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SynchronizeSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SynchronizeSettings parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SynchronizeSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SynchronizeSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SynchronizeSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class UnpairUser extends GeneratedMessageLite<UnpairUser, Builder> implements UnpairUserOrBuilder {
        public static final int ADDRESS_FIELD_NUMBER = 1;
        private static final UnpairUser DEFAULT_INSTANCE;
        private static volatile Parser<UnpairUser> PARSER;
        private String address_ = "";

        static {
            UnpairUser unpairUser = new UnpairUser();
            DEFAULT_INSTANCE = unpairUser;
            unpairUser.makeImmutable();
        }

        private UnpairUser() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddress() {
            this.address_ = getDefaultInstance().getAddress();
        }

        public static UnpairUser getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static UnpairUser parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UnpairUser) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UnpairUser parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UnpairUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<UnpairUser> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddress(String str) {
            str.getClass();
            this.address_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddressBytes(ByteString byteString) {
            this.address_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new UnpairUser();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.address_ = ((GeneratedMessageLite.Visitor) obj).visitString(!this.address_.isEmpty(), this.address_, !r6.address_.isEmpty(), ((UnpairUser) obj2).address_);
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
                                    this.address_ = codedInputStream.readStringRequireUtf8();
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
                        synchronized (UnpairUser.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.System.UnpairUserOrBuilder
        public String getAddress() {
            return this.address_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UnpairUserOrBuilder
        public ByteString getAddressBytes() {
            return ByteString.copyFromUtf8(this.address_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (!this.address_.isEmpty() ? CodedOutputStream.computeStringSize(1, getAddress()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.address_.isEmpty()) {
                codedOutputStream.writeString(1, getAddress());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<UnpairUser, Builder> implements UnpairUserOrBuilder {
            private Builder() {
                super(UnpairUser.DEFAULT_INSTANCE);
            }

            public Builder clearAddress() {
                copyOnWrite();
                ((UnpairUser) this.instance).clearAddress();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UnpairUserOrBuilder
            public String getAddress() {
                return ((UnpairUser) this.instance).getAddress();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UnpairUserOrBuilder
            public ByteString getAddressBytes() {
                return ((UnpairUser) this.instance).getAddressBytes();
            }

            public Builder setAddress(String str) {
                copyOnWrite();
                ((UnpairUser) this.instance).setAddress(str);
                return this;
            }

            public Builder setAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((UnpairUser) this.instance).setAddressBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(UnpairUser unpairUser) {
            return DEFAULT_INSTANCE.createBuilder(unpairUser);
        }

        public static UnpairUser parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UnpairUser) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UnpairUser parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UnpairUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static UnpairUser parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UnpairUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UnpairUser parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UnpairUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static UnpairUser parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UnpairUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UnpairUser parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UnpairUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static UnpairUser parseFrom(InputStream inputStream) throws IOException {
            return (UnpairUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UnpairUser parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UnpairUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UnpairUser parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UnpairUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UnpairUser parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UnpairUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class User extends GeneratedMessageLite<User, Builder> implements UserOrBuilder {
        public static final int AAP_CONNECTED_FIELD_NUMBER = 10;
        public static final int ADDRESS_FIELD_NUMBER = 3;
        public static final int CLASS_OF_DEVICE_FIELD_NUMBER = 12;
        public static final int CONNECTED_AUDIO_TYPES_FIELD_NUMBER = 5;
        public static final int CONNECTED_FIELD_NUMBER = 7;
        private static final User DEFAULT_INSTANCE;
        public static final int FOCUS_FIELD_NUMBER = 8;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int LAST_KNOWN_AAP_CAPABILITY_FIELD_NUMBER = 11;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile Parser<User> PARSER = null;
        public static final int PLATFORM_FIELD_NUMBER = 13;
        public static final int PRIMARY_AUDIO_CONNECTION_TYPE_FIELD_NUMBER = 6;
        public static final int SELF_FIELD_NUMBER = 4;
        public static final int VENDOR_ID_FIELD_NUMBER = 14;
        public static final int VOLUME_FIELD_NUMBER = 9;
        private static final Internal.ListAdapter.Converter<Integer, AudioConnectionType> connectedAudioTypes_converter_ = new Internal.ListAdapter.Converter<Integer, AudioConnectionType>() { // from class: com.amazon.alexa.accessory.protocol.System.User.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public AudioConnectionType convert(Integer num) {
                AudioConnectionType forNumber = AudioConnectionType.forNumber(num.intValue());
                return forNumber == null ? AudioConnectionType.UNRECOGNIZED : forNumber;
            }
        };
        private boolean aapConnected_;
        private int bitField0_;
        private int classOfDevice_;
        private int connectedAudioTypesMemoizedSerializedSize;
        private boolean connected_;
        private int focus_;
        private int id_;
        private int lastKnownAapCapability_;
        private int platform_;
        private int primaryAudioConnectionType_;
        private boolean self_;
        private int vendorId_;
        private int volume_;
        private String name_ = "";
        private String address_ = "";
        private Internal.IntList connectedAudioTypes_ = GeneratedMessageLite.emptyIntList();

        static {
            User user = new User();
            DEFAULT_INSTANCE = user;
            user.makeImmutable();
        }

        private User() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllConnectedAudioTypes(Iterable<? extends AudioConnectionType> iterable) {
            ensureConnectedAudioTypesIsMutable();
            Iterator<? extends AudioConnectionType> it2 = iterable.iterator();
            while (it2.hasNext()) {
                this.connectedAudioTypes_.addInt(it2.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllConnectedAudioTypesValue(Iterable<Integer> iterable) {
            ensureConnectedAudioTypesIsMutable();
            Iterator<Integer> it2 = iterable.iterator();
            while (it2.hasNext()) {
                this.connectedAudioTypes_.addInt(it2.next().intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addConnectedAudioTypes(AudioConnectionType audioConnectionType) {
            audioConnectionType.getClass();
            ensureConnectedAudioTypesIsMutable();
            this.connectedAudioTypes_.addInt(audioConnectionType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addConnectedAudioTypesValue(int i) {
            ensureConnectedAudioTypesIsMutable();
            this.connectedAudioTypes_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAapConnected() {
            this.aapConnected_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddress() {
            this.address_ = getDefaultInstance().getAddress();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClassOfDevice() {
            this.classOfDevice_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnected() {
            this.connected_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectedAudioTypes() {
            this.connectedAudioTypes_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFocus() {
            this.focus_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastKnownAapCapability() {
            this.lastKnownAapCapability_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlatform() {
            this.platform_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrimaryAudioConnectionType() {
            this.primaryAudioConnectionType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSelf() {
            this.self_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVendorId() {
            this.vendorId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVolume() {
            this.volume_ = 0;
        }

        private void ensureConnectedAudioTypesIsMutable() {
            if (this.connectedAudioTypes_.isModifiable()) {
                return;
            }
            this.connectedAudioTypes_ = GeneratedMessageLite.mutableCopy(this.connectedAudioTypes_);
        }

        public static User getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static User parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (User) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static User parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<User> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAapConnected(boolean z) {
            this.aapConnected_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddress(String str) {
            str.getClass();
            this.address_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddressBytes(ByteString byteString) {
            this.address_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClassOfDevice(int i) {
            this.classOfDevice_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnected(boolean z) {
            this.connected_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectedAudioTypes(int i, AudioConnectionType audioConnectionType) {
            audioConnectionType.getClass();
            ensureConnectedAudioTypesIsMutable();
            this.connectedAudioTypes_.setInt(i, audioConnectionType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectedAudioTypesValue(int i, int i2) {
            ensureConnectedAudioTypesIsMutable();
            this.connectedAudioTypes_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFocus(Focus focus) {
            focus.getClass();
            this.focus_ = focus.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFocusValue(int i) {
            this.focus_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(int i) {
            this.id_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastKnownAapCapability(AapCapability aapCapability) {
            aapCapability.getClass();
            this.lastKnownAapCapability_ = aapCapability.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastKnownAapCapabilityValue(int i) {
            this.lastKnownAapCapability_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlatform(Central.Platform platform) {
            platform.getClass();
            this.platform_ = platform.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlatformValue(int i) {
            this.platform_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrimaryAudioConnectionType(AudioConnectionType audioConnectionType) {
            audioConnectionType.getClass();
            this.primaryAudioConnectionType_ = audioConnectionType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrimaryAudioConnectionTypeValue(int i) {
            this.primaryAudioConnectionType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSelf(boolean z) {
            this.self_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVendorId(int i) {
            this.vendorId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVolume(int i) {
            this.volume_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new User();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.connectedAudioTypes_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    User user = (User) obj2;
                    int i = this.id_;
                    boolean z = i != 0;
                    int i2 = user.id_;
                    this.id_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.name_ = visitor.visitString(!this.name_.isEmpty(), this.name_, !user.name_.isEmpty(), user.name_);
                    this.address_ = visitor.visitString(!this.address_.isEmpty(), this.address_, !user.address_.isEmpty(), user.address_);
                    boolean z2 = this.self_;
                    boolean z3 = user.self_;
                    this.self_ = visitor.visitBoolean(z2, z2, z3, z3);
                    this.connectedAudioTypes_ = visitor.visitIntList(this.connectedAudioTypes_, user.connectedAudioTypes_);
                    int i3 = this.primaryAudioConnectionType_;
                    boolean z4 = i3 != 0;
                    int i4 = user.primaryAudioConnectionType_;
                    this.primaryAudioConnectionType_ = visitor.visitInt(z4, i3, i4 != 0, i4);
                    boolean z5 = this.connected_;
                    boolean z6 = user.connected_;
                    this.connected_ = visitor.visitBoolean(z5, z5, z6, z6);
                    int i5 = this.focus_;
                    boolean z7 = i5 != 0;
                    int i6 = user.focus_;
                    this.focus_ = visitor.visitInt(z7, i5, i6 != 0, i6);
                    int i7 = this.volume_;
                    boolean z8 = i7 != 0;
                    int i8 = user.volume_;
                    this.volume_ = visitor.visitInt(z8, i7, i8 != 0, i8);
                    boolean z9 = this.aapConnected_;
                    boolean z10 = user.aapConnected_;
                    this.aapConnected_ = visitor.visitBoolean(z9, z9, z10, z10);
                    int i9 = this.lastKnownAapCapability_;
                    boolean z11 = i9 != 0;
                    int i10 = user.lastKnownAapCapability_;
                    this.lastKnownAapCapability_ = visitor.visitInt(z11, i9, i10 != 0, i10);
                    int i11 = this.classOfDevice_;
                    boolean z12 = i11 != 0;
                    int i12 = user.classOfDevice_;
                    this.classOfDevice_ = visitor.visitInt(z12, i11, i12 != 0, i12);
                    int i13 = this.platform_;
                    boolean z13 = i13 != 0;
                    int i14 = user.platform_;
                    this.platform_ = visitor.visitInt(z13, i13, i14 != 0, i14);
                    int i15 = this.vendorId_;
                    boolean z14 = i15 != 0;
                    int i16 = user.vendorId_;
                    this.vendorId_ = visitor.visitInt(z14, i15, i16 != 0, i16);
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                        this.bitField0_ |= user.bitField0_;
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
                                case 8:
                                    this.id_ = codedInputStream.readUInt32();
                                case 18:
                                    this.name_ = codedInputStream.readStringRequireUtf8();
                                case 26:
                                    this.address_ = codedInputStream.readStringRequireUtf8();
                                case 32:
                                    this.self_ = codedInputStream.readBool();
                                case 40:
                                    if (!this.connectedAudioTypes_.isModifiable()) {
                                        this.connectedAudioTypes_ = GeneratedMessageLite.mutableCopy(this.connectedAudioTypes_);
                                    }
                                    this.connectedAudioTypes_.addInt(codedInputStream.readEnum());
                                case 42:
                                    if (!this.connectedAudioTypes_.isModifiable()) {
                                        this.connectedAudioTypes_ = GeneratedMessageLite.mutableCopy(this.connectedAudioTypes_);
                                    }
                                    int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.connectedAudioTypes_.addInt(codedInputStream.readEnum());
                                    }
                                    codedInputStream.popLimit(pushLimit);
                                case 48:
                                    this.primaryAudioConnectionType_ = codedInputStream.readEnum();
                                case 56:
                                    this.connected_ = codedInputStream.readBool();
                                case 64:
                                    this.focus_ = codedInputStream.readEnum();
                                case 72:
                                    this.volume_ = codedInputStream.readUInt32();
                                case 80:
                                    this.aapConnected_ = codedInputStream.readBool();
                                case 88:
                                    this.lastKnownAapCapability_ = codedInputStream.readEnum();
                                case 96:
                                    this.classOfDevice_ = codedInputStream.readUInt32();
                                case 104:
                                    this.platform_ = codedInputStream.readEnum();
                                case 112:
                                    this.vendorId_ = codedInputStream.readUInt32();
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
                        synchronized (User.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public boolean getAapConnected() {
            return this.aapConnected_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public String getAddress() {
            return this.address_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public ByteString getAddressBytes() {
            return ByteString.copyFromUtf8(this.address_);
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public int getClassOfDevice() {
            return this.classOfDevice_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public boolean getConnected() {
            return this.connected_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public AudioConnectionType getConnectedAudioTypes(int i) {
            return connectedAudioTypes_converter_.convert(Integer.valueOf(this.connectedAudioTypes_.getInt(i)));
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public int getConnectedAudioTypesCount() {
            return this.connectedAudioTypes_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public List<AudioConnectionType> getConnectedAudioTypesList() {
            return new Internal.ListAdapter(this.connectedAudioTypes_, connectedAudioTypes_converter_);
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public int getConnectedAudioTypesValue(int i) {
            return this.connectedAudioTypes_.getInt(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public List<Integer> getConnectedAudioTypesValueList() {
            return this.connectedAudioTypes_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public Focus getFocus() {
            Focus forNumber = Focus.forNumber(this.focus_);
            return forNumber == null ? Focus.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public int getFocusValue() {
            return this.focus_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public AapCapability getLastKnownAapCapability() {
            AapCapability forNumber = AapCapability.forNumber(this.lastKnownAapCapability_);
            return forNumber == null ? AapCapability.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public int getLastKnownAapCapabilityValue() {
            return this.lastKnownAapCapability_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public Central.Platform getPlatform() {
            Central.Platform forNumber = Central.Platform.forNumber(this.platform_);
            return forNumber == null ? Central.Platform.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public int getPlatformValue() {
            return this.platform_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public AudioConnectionType getPrimaryAudioConnectionType() {
            AudioConnectionType forNumber = AudioConnectionType.forNumber(this.primaryAudioConnectionType_);
            return forNumber == null ? AudioConnectionType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public int getPrimaryAudioConnectionTypeValue() {
            return this.primaryAudioConnectionType_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public boolean getSelf() {
            return this.self_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.id_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            if (!this.name_.isEmpty()) {
                computeUInt32Size += CodedOutputStream.computeStringSize(2, getName());
            }
            if (!this.address_.isEmpty()) {
                computeUInt32Size += CodedOutputStream.computeStringSize(3, getAddress());
            }
            boolean z = this.self_;
            if (z) {
                computeUInt32Size += CodedOutputStream.computeBoolSize(4, z);
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.connectedAudioTypes_.size(); i4++) {
                i3 += CodedOutputStream.computeEnumSizeNoTag(this.connectedAudioTypes_.getInt(i4));
            }
            int i5 = computeUInt32Size + i3;
            if (!getConnectedAudioTypesList().isEmpty()) {
                i5 = i5 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i3);
            }
            this.connectedAudioTypesMemoizedSerializedSize = i3;
            if (this.primaryAudioConnectionType_ != AudioConnectionType.UNKNOWN.getNumber()) {
                i5 += CodedOutputStream.computeEnumSize(6, this.primaryAudioConnectionType_);
            }
            boolean z2 = this.connected_;
            if (z2) {
                i5 += CodedOutputStream.computeBoolSize(7, z2);
            }
            if (this.focus_ != Focus.UNKNOWN_FOCUS.getNumber()) {
                i5 += CodedOutputStream.computeEnumSize(8, this.focus_);
            }
            int i6 = this.volume_;
            if (i6 != 0) {
                i5 += CodedOutputStream.computeUInt32Size(9, i6);
            }
            boolean z3 = this.aapConnected_;
            if (z3) {
                i5 += CodedOutputStream.computeBoolSize(10, z3);
            }
            if (this.lastKnownAapCapability_ != AapCapability.AAP_SUPPORT_UNKNOWN.getNumber()) {
                i5 += CodedOutputStream.computeEnumSize(11, this.lastKnownAapCapability_);
            }
            int i7 = this.classOfDevice_;
            if (i7 != 0) {
                i5 += CodedOutputStream.computeUInt32Size(12, i7);
            }
            if (this.platform_ != Central.Platform.UNDEFINED.getNumber()) {
                i5 += CodedOutputStream.computeEnumSize(13, this.platform_);
            }
            int i8 = this.vendorId_;
            if (i8 != 0) {
                i5 += CodedOutputStream.computeUInt32Size(14, i8);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + i5;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public int getVendorId() {
            return this.vendorId_;
        }

        @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
        public int getVolume() {
            return this.volume_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            int i = this.id_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            if (!this.name_.isEmpty()) {
                codedOutputStream.writeString(2, getName());
            }
            if (!this.address_.isEmpty()) {
                codedOutputStream.writeString(3, getAddress());
            }
            boolean z = this.self_;
            if (z) {
                codedOutputStream.writeBool(4, z);
            }
            if (getConnectedAudioTypesList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(42);
                codedOutputStream.writeUInt32NoTag(this.connectedAudioTypesMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.connectedAudioTypes_.size(); i2++) {
                codedOutputStream.writeEnumNoTag(this.connectedAudioTypes_.getInt(i2));
            }
            if (this.primaryAudioConnectionType_ != AudioConnectionType.UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(6, this.primaryAudioConnectionType_);
            }
            boolean z2 = this.connected_;
            if (z2) {
                codedOutputStream.writeBool(7, z2);
            }
            if (this.focus_ != Focus.UNKNOWN_FOCUS.getNumber()) {
                codedOutputStream.writeEnum(8, this.focus_);
            }
            int i3 = this.volume_;
            if (i3 != 0) {
                codedOutputStream.writeUInt32(9, i3);
            }
            boolean z3 = this.aapConnected_;
            if (z3) {
                codedOutputStream.writeBool(10, z3);
            }
            if (this.lastKnownAapCapability_ != AapCapability.AAP_SUPPORT_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(11, this.lastKnownAapCapability_);
            }
            int i4 = this.classOfDevice_;
            if (i4 != 0) {
                codedOutputStream.writeUInt32(12, i4);
            }
            if (this.platform_ != Central.Platform.UNDEFINED.getNumber()) {
                codedOutputStream.writeEnum(13, this.platform_);
            }
            int i5 = this.vendorId_;
            if (i5 != 0) {
                codedOutputStream.writeUInt32(14, i5);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<User, Builder> implements UserOrBuilder {
            private Builder() {
                super(User.DEFAULT_INSTANCE);
            }

            public Builder addAllConnectedAudioTypes(Iterable<? extends AudioConnectionType> iterable) {
                copyOnWrite();
                ((User) this.instance).addAllConnectedAudioTypes(iterable);
                return this;
            }

            public Builder addAllConnectedAudioTypesValue(Iterable<Integer> iterable) {
                copyOnWrite();
                ((User) this.instance).addAllConnectedAudioTypesValue(iterable);
                return this;
            }

            public Builder addConnectedAudioTypes(AudioConnectionType audioConnectionType) {
                copyOnWrite();
                ((User) this.instance).addConnectedAudioTypes(audioConnectionType);
                return this;
            }

            public Builder addConnectedAudioTypesValue(int i) {
                ((User) this.instance).addConnectedAudioTypesValue(i);
                return this;
            }

            public Builder clearAapConnected() {
                copyOnWrite();
                ((User) this.instance).clearAapConnected();
                return this;
            }

            public Builder clearAddress() {
                copyOnWrite();
                ((User) this.instance).clearAddress();
                return this;
            }

            public Builder clearClassOfDevice() {
                copyOnWrite();
                ((User) this.instance).clearClassOfDevice();
                return this;
            }

            public Builder clearConnected() {
                copyOnWrite();
                ((User) this.instance).clearConnected();
                return this;
            }

            public Builder clearConnectedAudioTypes() {
                copyOnWrite();
                ((User) this.instance).clearConnectedAudioTypes();
                return this;
            }

            public Builder clearFocus() {
                copyOnWrite();
                ((User) this.instance).clearFocus();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((User) this.instance).clearId();
                return this;
            }

            public Builder clearLastKnownAapCapability() {
                copyOnWrite();
                ((User) this.instance).clearLastKnownAapCapability();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((User) this.instance).clearName();
                return this;
            }

            public Builder clearPlatform() {
                copyOnWrite();
                ((User) this.instance).clearPlatform();
                return this;
            }

            public Builder clearPrimaryAudioConnectionType() {
                copyOnWrite();
                ((User) this.instance).clearPrimaryAudioConnectionType();
                return this;
            }

            public Builder clearSelf() {
                copyOnWrite();
                ((User) this.instance).clearSelf();
                return this;
            }

            public Builder clearVendorId() {
                copyOnWrite();
                ((User) this.instance).clearVendorId();
                return this;
            }

            public Builder clearVolume() {
                copyOnWrite();
                ((User) this.instance).clearVolume();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public boolean getAapConnected() {
                return ((User) this.instance).getAapConnected();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public String getAddress() {
                return ((User) this.instance).getAddress();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public ByteString getAddressBytes() {
                return ((User) this.instance).getAddressBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public int getClassOfDevice() {
                return ((User) this.instance).getClassOfDevice();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public boolean getConnected() {
                return ((User) this.instance).getConnected();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public AudioConnectionType getConnectedAudioTypes(int i) {
                return ((User) this.instance).getConnectedAudioTypes(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public int getConnectedAudioTypesCount() {
                return ((User) this.instance).getConnectedAudioTypesCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public List<AudioConnectionType> getConnectedAudioTypesList() {
                return ((User) this.instance).getConnectedAudioTypesList();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public int getConnectedAudioTypesValue(int i) {
                return ((User) this.instance).getConnectedAudioTypesValue(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public List<Integer> getConnectedAudioTypesValueList() {
                return Collections.unmodifiableList(((User) this.instance).getConnectedAudioTypesValueList());
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public Focus getFocus() {
                return ((User) this.instance).getFocus();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public int getFocusValue() {
                return ((User) this.instance).getFocusValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public int getId() {
                return ((User) this.instance).getId();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public AapCapability getLastKnownAapCapability() {
                return ((User) this.instance).getLastKnownAapCapability();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public int getLastKnownAapCapabilityValue() {
                return ((User) this.instance).getLastKnownAapCapabilityValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public String getName() {
                return ((User) this.instance).getName();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public ByteString getNameBytes() {
                return ((User) this.instance).getNameBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public Central.Platform getPlatform() {
                return ((User) this.instance).getPlatform();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public int getPlatformValue() {
                return ((User) this.instance).getPlatformValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public AudioConnectionType getPrimaryAudioConnectionType() {
                return ((User) this.instance).getPrimaryAudioConnectionType();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public int getPrimaryAudioConnectionTypeValue() {
                return ((User) this.instance).getPrimaryAudioConnectionTypeValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public boolean getSelf() {
                return ((User) this.instance).getSelf();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public int getVendorId() {
                return ((User) this.instance).getVendorId();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.UserOrBuilder
            public int getVolume() {
                return ((User) this.instance).getVolume();
            }

            public Builder setAapConnected(boolean z) {
                copyOnWrite();
                ((User) this.instance).setAapConnected(z);
                return this;
            }

            public Builder setAddress(String str) {
                copyOnWrite();
                ((User) this.instance).setAddress(str);
                return this;
            }

            public Builder setAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((User) this.instance).setAddressBytes(byteString);
                return this;
            }

            public Builder setClassOfDevice(int i) {
                copyOnWrite();
                ((User) this.instance).setClassOfDevice(i);
                return this;
            }

            public Builder setConnected(boolean z) {
                copyOnWrite();
                ((User) this.instance).setConnected(z);
                return this;
            }

            public Builder setConnectedAudioTypes(int i, AudioConnectionType audioConnectionType) {
                copyOnWrite();
                ((User) this.instance).setConnectedAudioTypes(i, audioConnectionType);
                return this;
            }

            public Builder setConnectedAudioTypesValue(int i, int i2) {
                copyOnWrite();
                ((User) this.instance).setConnectedAudioTypesValue(i, i2);
                return this;
            }

            public Builder setFocus(Focus focus) {
                copyOnWrite();
                ((User) this.instance).setFocus(focus);
                return this;
            }

            public Builder setFocusValue(int i) {
                copyOnWrite();
                ((User) this.instance).setFocusValue(i);
                return this;
            }

            public Builder setId(int i) {
                copyOnWrite();
                ((User) this.instance).setId(i);
                return this;
            }

            public Builder setLastKnownAapCapability(AapCapability aapCapability) {
                copyOnWrite();
                ((User) this.instance).setLastKnownAapCapability(aapCapability);
                return this;
            }

            public Builder setLastKnownAapCapabilityValue(int i) {
                copyOnWrite();
                ((User) this.instance).setLastKnownAapCapabilityValue(i);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((User) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((User) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setPlatform(Central.Platform platform) {
                copyOnWrite();
                ((User) this.instance).setPlatform(platform);
                return this;
            }

            public Builder setPlatformValue(int i) {
                copyOnWrite();
                ((User) this.instance).setPlatformValue(i);
                return this;
            }

            public Builder setPrimaryAudioConnectionType(AudioConnectionType audioConnectionType) {
                copyOnWrite();
                ((User) this.instance).setPrimaryAudioConnectionType(audioConnectionType);
                return this;
            }

            public Builder setPrimaryAudioConnectionTypeValue(int i) {
                copyOnWrite();
                ((User) this.instance).setPrimaryAudioConnectionTypeValue(i);
                return this;
            }

            public Builder setSelf(boolean z) {
                copyOnWrite();
                ((User) this.instance).setSelf(z);
                return this;
            }

            public Builder setVendorId(int i) {
                copyOnWrite();
                ((User) this.instance).setVendorId(i);
                return this;
            }

            public Builder setVolume(int i) {
                copyOnWrite();
                ((User) this.instance).setVolume(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum AapCapability implements Internal.EnumLite {
            AAP_SUPPORT_UNKNOWN(0),
            AAP_NOT_SUPPORTED(1),
            AAP_SUPPORTED(2),
            UNRECOGNIZED(-1);

            public static final int AAP_NOT_SUPPORTED_VALUE = 1;
            public static final int AAP_SUPPORTED_VALUE = 2;
            public static final int AAP_SUPPORT_UNKNOWN_VALUE = 0;
            private static final Internal.EnumLiteMap<AapCapability> internalValueMap = new Internal.EnumLiteMap<AapCapability>() { // from class: com.amazon.alexa.accessory.protocol.System.User.AapCapability.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public AapCapability findValueByNumber(int i) {
                    return AapCapability.forNumber(i);
                }
            };
            private final int value;

            AapCapability(int i) {
                this.value = i;
            }

            public static AapCapability forNumber(int i) {
                if (i == 0) {
                    return AAP_SUPPORT_UNKNOWN;
                }
                if (i == 1) {
                    return AAP_NOT_SUPPORTED;
                }
                if (i != 2) {
                    return null;
                }
                return AAP_SUPPORTED;
            }

            public static Internal.EnumLiteMap<AapCapability> internalGetValueMap() {
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
            public static AapCapability valueOf(int i) {
                return forNumber(i);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum AudioConnectionType implements Internal.EnumLite {
            UNKNOWN(0),
            NONE(1),
            A2DP(2),
            HFP(3),
            UNRECOGNIZED(-1);

            public static final int A2DP_VALUE = 2;
            public static final int HFP_VALUE = 3;
            public static final int NONE_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private static final Internal.EnumLiteMap<AudioConnectionType> internalValueMap = new Internal.EnumLiteMap<AudioConnectionType>() { // from class: com.amazon.alexa.accessory.protocol.System.User.AudioConnectionType.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public AudioConnectionType findValueByNumber(int i) {
                    return AudioConnectionType.forNumber(i);
                }
            };
            private final int value;

            AudioConnectionType(int i) {
                this.value = i;
            }

            public static AudioConnectionType forNumber(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return NONE;
                }
                if (i == 2) {
                    return A2DP;
                }
                if (i != 3) {
                    return null;
                }
                return HFP;
            }

            public static Internal.EnumLiteMap<AudioConnectionType> internalGetValueMap() {
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
            public static AudioConnectionType valueOf(int i) {
                return forNumber(i);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum Focus implements Internal.EnumLite {
            UNKNOWN_FOCUS(0),
            NO_FOCUS(1),
            HAS_FOCUS(2),
            SUSPENDED(3),
            BORROWED(4),
            UNRECOGNIZED(-1);

            public static final int BORROWED_VALUE = 4;
            public static final int HAS_FOCUS_VALUE = 2;
            public static final int NO_FOCUS_VALUE = 1;
            public static final int SUSPENDED_VALUE = 3;
            public static final int UNKNOWN_FOCUS_VALUE = 0;
            private static final Internal.EnumLiteMap<Focus> internalValueMap = new Internal.EnumLiteMap<Focus>() { // from class: com.amazon.alexa.accessory.protocol.System.User.Focus.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Focus findValueByNumber(int i) {
                    return Focus.forNumber(i);
                }
            };
            private final int value;

            Focus(int i) {
                this.value = i;
            }

            public static Focus forNumber(int i) {
                if (i == 0) {
                    return UNKNOWN_FOCUS;
                }
                if (i == 1) {
                    return NO_FOCUS;
                }
                if (i == 2) {
                    return HAS_FOCUS;
                }
                if (i == 3) {
                    return SUSPENDED;
                }
                if (i != 4) {
                    return null;
                }
                return BORROWED;
            }

            public static Internal.EnumLiteMap<Focus> internalGetValueMap() {
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
            public static Focus valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(User user) {
            return DEFAULT_INSTANCE.createBuilder(user);
        }

        public static User parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (User) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static User parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static User parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static User parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static User parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static User parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static User parseFrom(InputStream inputStream) throws IOException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static User parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static User parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static User parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Wakewords extends GeneratedMessageLite<Wakewords, Builder> implements WakewordsOrBuilder {
        public static final int CURRENT_WAKEWORDS_FIELD_NUMBER = 1;
        private static final Wakewords DEFAULT_INSTANCE;
        private static volatile Parser<Wakewords> PARSER;
        private Internal.ProtobufList<String> currentWakewords_ = GeneratedMessageLite.emptyProtobufList();

        static {
            Wakewords wakewords = new Wakewords();
            DEFAULT_INSTANCE = wakewords;
            wakewords.makeImmutable();
        }

        private Wakewords() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCurrentWakewords(Iterable<String> iterable) {
            ensureCurrentWakewordsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.currentWakewords_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCurrentWakewords(String str) {
            str.getClass();
            ensureCurrentWakewordsIsMutable();
            this.currentWakewords_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCurrentWakewordsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureCurrentWakewordsIsMutable();
            this.currentWakewords_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentWakewords() {
            this.currentWakewords_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureCurrentWakewordsIsMutable() {
            if (this.currentWakewords_.isModifiable()) {
                return;
            }
            this.currentWakewords_ = GeneratedMessageLite.mutableCopy(this.currentWakewords_);
        }

        public static Wakewords getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Wakewords parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Wakewords) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Wakewords parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Wakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Wakewords> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentWakewords(int i, String str) {
            str.getClass();
            ensureCurrentWakewordsIsMutable();
            this.currentWakewords_.set(i, str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Wakewords();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.currentWakewords_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.currentWakewords_ = ((GeneratedMessageLite.Visitor) obj).visitList(this.currentWakewords_, ((Wakewords) obj2).currentWakewords_);
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
                                    if (!this.currentWakewords_.isModifiable()) {
                                        this.currentWakewords_ = GeneratedMessageLite.mutableCopy(this.currentWakewords_);
                                    }
                                    this.currentWakewords_.add(readStringRequireUtf8);
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
                        synchronized (Wakewords.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.System.WakewordsOrBuilder
        public String getCurrentWakewords(int i) {
            return this.currentWakewords_.get(i);
        }

        @Override // com.amazon.alexa.accessory.protocol.System.WakewordsOrBuilder
        public ByteString getCurrentWakewordsBytes(int i) {
            return ByteString.copyFromUtf8(this.currentWakewords_.get(i));
        }

        @Override // com.amazon.alexa.accessory.protocol.System.WakewordsOrBuilder
        public int getCurrentWakewordsCount() {
            return this.currentWakewords_.size();
        }

        @Override // com.amazon.alexa.accessory.protocol.System.WakewordsOrBuilder
        public List<String> getCurrentWakewordsList() {
            return this.currentWakewords_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.currentWakewords_.size(); i3++) {
                i2 += CodedOutputStream.computeStringSizeNoTag(this.currentWakewords_.get(i3));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + getCurrentWakewordsList().size() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.currentWakewords_.size(); i++) {
                codedOutputStream.writeString(1, this.currentWakewords_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<Wakewords, Builder> implements WakewordsOrBuilder {
            private Builder() {
                super(Wakewords.DEFAULT_INSTANCE);
            }

            public Builder addAllCurrentWakewords(Iterable<String> iterable) {
                copyOnWrite();
                ((Wakewords) this.instance).addAllCurrentWakewords(iterable);
                return this;
            }

            public Builder addCurrentWakewords(String str) {
                copyOnWrite();
                ((Wakewords) this.instance).addCurrentWakewords(str);
                return this;
            }

            public Builder addCurrentWakewordsBytes(ByteString byteString) {
                copyOnWrite();
                ((Wakewords) this.instance).addCurrentWakewordsBytes(byteString);
                return this;
            }

            public Builder clearCurrentWakewords() {
                copyOnWrite();
                ((Wakewords) this.instance).clearCurrentWakewords();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.System.WakewordsOrBuilder
            public String getCurrentWakewords(int i) {
                return ((Wakewords) this.instance).getCurrentWakewords(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.System.WakewordsOrBuilder
            public ByteString getCurrentWakewordsBytes(int i) {
                return ((Wakewords) this.instance).getCurrentWakewordsBytes(i);
            }

            @Override // com.amazon.alexa.accessory.protocol.System.WakewordsOrBuilder
            public int getCurrentWakewordsCount() {
                return ((Wakewords) this.instance).getCurrentWakewordsCount();
            }

            @Override // com.amazon.alexa.accessory.protocol.System.WakewordsOrBuilder
            public List<String> getCurrentWakewordsList() {
                return Collections.unmodifiableList(((Wakewords) this.instance).getCurrentWakewordsList());
            }

            public Builder setCurrentWakewords(int i, String str) {
                copyOnWrite();
                ((Wakewords) this.instance).setCurrentWakewords(i, str);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(Wakewords wakewords) {
            return DEFAULT_INSTANCE.createBuilder(wakewords);
        }

        public static Wakewords parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Wakewords) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Wakewords parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Wakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Wakewords parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Wakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Wakewords parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Wakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Wakewords parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Wakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Wakewords parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Wakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Wakewords parseFrom(InputStream inputStream) throws IOException {
            return (Wakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Wakewords parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Wakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Wakewords parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Wakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Wakewords parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Wakewords) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
