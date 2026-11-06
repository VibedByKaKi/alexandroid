package com.amazon.alexa.accessory.protocol;

import com.amazon.alexa.accessory.protocol.Common;
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
public final class Speech {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.Speech$1, reason: invalid class name */
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
    public interface DialogOrBuilder extends MessageLiteOrBuilder {
        int getId();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface EndpointSpeechOrBuilder extends MessageLiteOrBuilder {
        Dialog getDialog();

        boolean hasDialog();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NotifySpeechStateOrBuilder extends MessageLiteOrBuilder {
        SpeechState getState();

        int getStateValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ProvideSpeechOrBuilder extends MessageLiteOrBuilder {
        Dialog getDialog();

        boolean hasDialog();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SpeechInitiatorOrBuilder extends MessageLiteOrBuilder {
        SpeechInitiator.Type getType();

        int getTypeValue();

        SpeechInitiator.WakeWord getWakeWord();

        boolean hasWakeWord();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SpeechProviderOrBuilder extends MessageLiteOrBuilder {
        Dialog getDialog();

        SpeechSettings getSpeechSettings();

        boolean hasDialog();

        boolean hasSpeechSettings();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SpeechSettingsOrBuilder extends MessageLiteOrBuilder {
        AudioFormat getAudioFormat();

        int getAudioFormatValue();

        AudioProfile getAudioProfile();

        int getAudioProfileValue();

        AudioSource getAudioSource();

        int getAudioSourceValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StartSpeechOrBuilder extends MessageLiteOrBuilder {
        Dialog getDialog();

        SpeechInitiator getInitiator();

        SpeechSettings getSettings();

        boolean getSuppressEndpointEarcon();

        boolean getSuppressStartEarcon();

        boolean hasDialog();

        boolean hasInitiator();

        boolean hasSettings();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StopSpeechOrBuilder extends MessageLiteOrBuilder {
        Dialog getDialog();

        Common.ErrorCode getErrorCode();

        int getErrorCodeValue();

        boolean hasDialog();
    }

    private Speech() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class EndpointSpeech extends GeneratedMessageLite<EndpointSpeech, Builder> implements EndpointSpeechOrBuilder {
        private static final EndpointSpeech DEFAULT_INSTANCE;
        public static final int DIALOG_FIELD_NUMBER = 1;
        private static volatile Parser<EndpointSpeech> PARSER;
        private Dialog dialog_;

        static {
            EndpointSpeech endpointSpeech = new EndpointSpeech();
            DEFAULT_INSTANCE = endpointSpeech;
            endpointSpeech.makeImmutable();
        }

        private EndpointSpeech() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialog() {
            this.dialog_ = null;
        }

        public static EndpointSpeech getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDialog(Dialog dialog) {
            Dialog dialog2 = this.dialog_;
            if (dialog2 == null || dialog2 == Dialog.getDefaultInstance()) {
                this.dialog_ = dialog;
            } else {
                this.dialog_ = Dialog.newBuilder(this.dialog_).mergeFrom((Dialog.Builder) dialog).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static EndpointSpeech parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EndpointSpeech) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EndpointSpeech parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EndpointSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EndpointSpeech> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialog(Dialog.Builder builder) {
            this.dialog_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new EndpointSpeech();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.dialog_ = (Dialog) ((GeneratedMessageLite.Visitor) obj).visitMessage(this.dialog_, ((EndpointSpeech) obj2).dialog_);
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
                                    Dialog dialog = this.dialog_;
                                    Dialog.Builder builder = dialog != null ? dialog.toBuilder() : null;
                                    Dialog dialog2 = (Dialog) codedInputStream.readMessage(Dialog.parser(), extensionRegistryLite);
                                    this.dialog_ = dialog2;
                                    if (builder != null) {
                                        builder.mergeFrom((Dialog.Builder) dialog2);
                                        this.dialog_ = builder.buildPartial();
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
                        synchronized (EndpointSpeech.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Speech.EndpointSpeechOrBuilder
        public Dialog getDialog() {
            Dialog dialog = this.dialog_;
            return dialog == null ? Dialog.getDefaultInstance() : dialog;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.dialog_ != null ? CodedOutputStream.computeMessageSize(1, getDialog()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.EndpointSpeechOrBuilder
        public boolean hasDialog() {
            return this.dialog_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.dialog_ != null) {
                codedOutputStream.writeMessage(1, getDialog());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<EndpointSpeech, Builder> implements EndpointSpeechOrBuilder {
            private Builder() {
                super(EndpointSpeech.DEFAULT_INSTANCE);
            }

            public Builder clearDialog() {
                copyOnWrite();
                ((EndpointSpeech) this.instance).clearDialog();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.EndpointSpeechOrBuilder
            public Dialog getDialog() {
                return ((EndpointSpeech) this.instance).getDialog();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.EndpointSpeechOrBuilder
            public boolean hasDialog() {
                return ((EndpointSpeech) this.instance).hasDialog();
            }

            public Builder mergeDialog(Dialog dialog) {
                copyOnWrite();
                ((EndpointSpeech) this.instance).mergeDialog(dialog);
                return this;
            }

            public Builder setDialog(Dialog dialog) {
                copyOnWrite();
                ((EndpointSpeech) this.instance).setDialog(dialog);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setDialog(Dialog.Builder builder) {
                copyOnWrite();
                ((EndpointSpeech) this.instance).setDialog(builder);
                return this;
            }
        }

        public static Builder newBuilder(EndpointSpeech endpointSpeech) {
            return DEFAULT_INSTANCE.createBuilder(endpointSpeech);
        }

        public static EndpointSpeech parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EndpointSpeech) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EndpointSpeech parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EndpointSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialog(Dialog dialog) {
            dialog.getClass();
            this.dialog_ = dialog;
        }

        public static EndpointSpeech parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EndpointSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EndpointSpeech parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EndpointSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EndpointSpeech parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EndpointSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EndpointSpeech parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EndpointSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EndpointSpeech parseFrom(InputStream inputStream) throws IOException {
            return (EndpointSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EndpointSpeech parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EndpointSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EndpointSpeech parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (EndpointSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EndpointSpeech parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EndpointSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ProvideSpeech extends GeneratedMessageLite<ProvideSpeech, Builder> implements ProvideSpeechOrBuilder {
        private static final ProvideSpeech DEFAULT_INSTANCE;
        public static final int DIALOG_FIELD_NUMBER = 1;
        private static volatile Parser<ProvideSpeech> PARSER;
        private Dialog dialog_;

        static {
            ProvideSpeech provideSpeech = new ProvideSpeech();
            DEFAULT_INSTANCE = provideSpeech;
            provideSpeech.makeImmutable();
        }

        private ProvideSpeech() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialog() {
            this.dialog_ = null;
        }

        public static ProvideSpeech getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDialog(Dialog dialog) {
            Dialog dialog2 = this.dialog_;
            if (dialog2 == null || dialog2 == Dialog.getDefaultInstance()) {
                this.dialog_ = dialog;
            } else {
                this.dialog_ = Dialog.newBuilder(this.dialog_).mergeFrom((Dialog.Builder) dialog).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ProvideSpeech parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ProvideSpeech) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProvideSpeech parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ProvideSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ProvideSpeech> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialog(Dialog.Builder builder) {
            this.dialog_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ProvideSpeech();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    this.dialog_ = (Dialog) ((GeneratedMessageLite.Visitor) obj).visitMessage(this.dialog_, ((ProvideSpeech) obj2).dialog_);
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
                                    Dialog dialog = this.dialog_;
                                    Dialog.Builder builder = dialog != null ? dialog.toBuilder() : null;
                                    Dialog dialog2 = (Dialog) codedInputStream.readMessage(Dialog.parser(), extensionRegistryLite);
                                    this.dialog_ = dialog2;
                                    if (builder != null) {
                                        builder.mergeFrom((Dialog.Builder) dialog2);
                                        this.dialog_ = builder.buildPartial();
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
                        synchronized (ProvideSpeech.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Speech.ProvideSpeechOrBuilder
        public Dialog getDialog() {
            Dialog dialog = this.dialog_;
            return dialog == null ? Dialog.getDefaultInstance() : dialog;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.dialog_ != null ? CodedOutputStream.computeMessageSize(1, getDialog()) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.ProvideSpeechOrBuilder
        public boolean hasDialog() {
            return this.dialog_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.dialog_ != null) {
                codedOutputStream.writeMessage(1, getDialog());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<ProvideSpeech, Builder> implements ProvideSpeechOrBuilder {
            private Builder() {
                super(ProvideSpeech.DEFAULT_INSTANCE);
            }

            public Builder clearDialog() {
                copyOnWrite();
                ((ProvideSpeech) this.instance).clearDialog();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.ProvideSpeechOrBuilder
            public Dialog getDialog() {
                return ((ProvideSpeech) this.instance).getDialog();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.ProvideSpeechOrBuilder
            public boolean hasDialog() {
                return ((ProvideSpeech) this.instance).hasDialog();
            }

            public Builder mergeDialog(Dialog dialog) {
                copyOnWrite();
                ((ProvideSpeech) this.instance).mergeDialog(dialog);
                return this;
            }

            public Builder setDialog(Dialog dialog) {
                copyOnWrite();
                ((ProvideSpeech) this.instance).setDialog(dialog);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setDialog(Dialog.Builder builder) {
                copyOnWrite();
                ((ProvideSpeech) this.instance).setDialog(builder);
                return this;
            }
        }

        public static Builder newBuilder(ProvideSpeech provideSpeech) {
            return DEFAULT_INSTANCE.createBuilder(provideSpeech);
        }

        public static ProvideSpeech parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ProvideSpeech) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProvideSpeech parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ProvideSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialog(Dialog dialog) {
            dialog.getClass();
            this.dialog_ = dialog;
        }

        public static ProvideSpeech parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ProvideSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ProvideSpeech parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ProvideSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ProvideSpeech parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ProvideSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ProvideSpeech parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ProvideSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ProvideSpeech parseFrom(InputStream inputStream) throws IOException {
            return (ProvideSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProvideSpeech parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ProvideSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProvideSpeech parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ProvideSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ProvideSpeech parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ProvideSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SpeechInitiator extends GeneratedMessageLite<SpeechInitiator, Builder> implements SpeechInitiatorOrBuilder {
        private static final SpeechInitiator DEFAULT_INSTANCE;
        private static volatile Parser<SpeechInitiator> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int WAKE_WORD_FIELD_NUMBER = 2;
        private int type_;
        private WakeWord wakeWord_;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public interface WakeWordOrBuilder extends MessageLiteOrBuilder {
            int getEndIndexInSamples();

            ByteString getMetadata();

            boolean getNearMiss();

            int getStartIndexInSamples();

            String getWakewordString();

            ByteString getWakewordStringBytes();
        }

        static {
            SpeechInitiator speechInitiator = new SpeechInitiator();
            DEFAULT_INSTANCE = speechInitiator;
            speechInitiator.makeImmutable();
        }

        private SpeechInitiator() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWakeWord() {
            this.wakeWord_ = null;
        }

        public static SpeechInitiator getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWakeWord(WakeWord wakeWord) {
            WakeWord wakeWord2 = this.wakeWord_;
            if (wakeWord2 == null || wakeWord2 == WakeWord.getDefaultInstance()) {
                this.wakeWord_ = wakeWord;
            } else {
                this.wakeWord_ = WakeWord.newBuilder(this.wakeWord_).mergeFrom((WakeWord.Builder) wakeWord).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SpeechInitiator parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SpeechInitiator) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SpeechInitiator parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SpeechInitiator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SpeechInitiator> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(Type type) {
            type.getClass();
            this.type_ = type.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWakeWord(WakeWord.Builder builder) {
            this.wakeWord_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SpeechInitiator();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    SpeechInitiator speechInitiator = (SpeechInitiator) obj2;
                    int i = this.type_;
                    boolean z = i != 0;
                    int i2 = speechInitiator.type_;
                    this.type_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.wakeWord_ = (WakeWord) visitor.visitMessage(this.wakeWord_, speechInitiator.wakeWord_);
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
                                    this.type_ = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    WakeWord wakeWord = this.wakeWord_;
                                    WakeWord.Builder builder = wakeWord != null ? wakeWord.toBuilder() : null;
                                    WakeWord wakeWord2 = (WakeWord) codedInputStream.readMessage(WakeWord.parser(), extensionRegistryLite);
                                    this.wakeWord_ = wakeWord2;
                                    if (builder != null) {
                                        builder.mergeFrom((WakeWord.Builder) wakeWord2);
                                        this.wakeWord_ = builder.buildPartial();
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
                        synchronized (SpeechInitiator.class) {
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
            int computeEnumSize = this.type_ != Type.NONE.getNumber() ? CodedOutputStream.computeEnumSize(1, this.type_) : 0;
            if (this.wakeWord_ != null) {
                computeEnumSize += CodedOutputStream.computeMessageSize(2, getWakeWord());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechInitiatorOrBuilder
        public Type getType() {
            Type forNumber = Type.forNumber(this.type_);
            return forNumber == null ? Type.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechInitiatorOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechInitiatorOrBuilder
        public WakeWord getWakeWord() {
            WakeWord wakeWord = this.wakeWord_;
            return wakeWord == null ? WakeWord.getDefaultInstance() : wakeWord;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechInitiatorOrBuilder
        public boolean hasWakeWord() {
            return this.wakeWord_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != Type.NONE.getNumber()) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            if (this.wakeWord_ != null) {
                codedOutputStream.writeMessage(2, getWakeWord());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class WakeWord extends GeneratedMessageLite<WakeWord, Builder> implements WakeWordOrBuilder {
            private static final WakeWord DEFAULT_INSTANCE;
            public static final int END_INDEX_IN_SAMPLES_FIELD_NUMBER = 2;
            public static final int METADATA_FIELD_NUMBER = 4;
            public static final int NEAR_MISS_FIELD_NUMBER = 3;
            private static volatile Parser<WakeWord> PARSER = null;
            public static final int START_INDEX_IN_SAMPLES_FIELD_NUMBER = 1;
            public static final int WAKEWORD_STRING_FIELD_NUMBER = 5;
            private int endIndexInSamples_;
            private boolean nearMiss_;
            private int startIndexInSamples_;
            private ByteString metadata_ = ByteString.EMPTY;
            private String wakewordString_ = "";

            static {
                WakeWord wakeWord = new WakeWord();
                DEFAULT_INSTANCE = wakeWord;
                wakeWord.makeImmutable();
            }

            private WakeWord() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEndIndexInSamples() {
                this.endIndexInSamples_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMetadata() {
                this.metadata_ = getDefaultInstance().getMetadata();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNearMiss() {
                this.nearMiss_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearStartIndexInSamples() {
                this.startIndexInSamples_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearWakewordString() {
                this.wakewordString_ = getDefaultInstance().getWakewordString();
            }

            public static WakeWord getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static WakeWord parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (WakeWord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static WakeWord parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (WakeWord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<WakeWord> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEndIndexInSamples(int i) {
                this.endIndexInSamples_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMetadata(ByteString byteString) {
                byteString.getClass();
                this.metadata_ = byteString;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNearMiss(boolean z) {
                this.nearMiss_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStartIndexInSamples(int i) {
                this.startIndexInSamples_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setWakewordString(String str) {
                str.getClass();
                this.wakewordString_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setWakewordStringBytes(ByteString byteString) {
                this.wakewordString_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Object[] objArr = null;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new WakeWord();
                    case 2:
                        return DEFAULT_INSTANCE;
                    case 3:
                    case 10:
                        return null;
                    case 4:
                        return new Builder(false ? 1 : 0);
                    case 5:
                        GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                        WakeWord wakeWord = (WakeWord) obj2;
                        int i = this.startIndexInSamples_;
                        boolean z = i != 0;
                        int i2 = wakeWord.startIndexInSamples_;
                        this.startIndexInSamples_ = visitor.visitInt(z, i, i2 != 0, i2);
                        int i3 = this.endIndexInSamples_;
                        boolean z2 = i3 != 0;
                        int i4 = wakeWord.endIndexInSamples_;
                        this.endIndexInSamples_ = visitor.visitInt(z2, i3, i4 != 0, i4);
                        boolean z3 = this.nearMiss_;
                        boolean z4 = wakeWord.nearMiss_;
                        this.nearMiss_ = visitor.visitBoolean(z3, z3, z4, z4);
                        ByteString byteString = this.metadata_;
                        ByteString byteString2 = ByteString.EMPTY;
                        boolean z5 = byteString != byteString2;
                        ByteString byteString3 = wakeWord.metadata_;
                        this.metadata_ = visitor.visitByteString(z5, byteString, byteString3 != byteString2, byteString3);
                        this.wakewordString_ = visitor.visitString(!this.wakewordString_.isEmpty(), this.wakewordString_, !wakeWord.wakewordString_.isEmpty(), wakeWord.wakewordString_);
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
                                        this.startIndexInSamples_ = codedInputStream.readUInt32();
                                    } else if (readTag == 16) {
                                        this.endIndexInSamples_ = codedInputStream.readUInt32();
                                    } else if (readTag == 24) {
                                        this.nearMiss_ = codedInputStream.readBool();
                                    } else if (readTag == 34) {
                                        this.metadata_ = codedInputStream.readBytes();
                                    } else if (readTag == 42) {
                                        this.wakewordString_ = codedInputStream.readStringRequireUtf8();
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
                            synchronized (WakeWord.class) {
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

            @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechInitiator.WakeWordOrBuilder
            public int getEndIndexInSamples() {
                return this.endIndexInSamples_;
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechInitiator.WakeWordOrBuilder
            public ByteString getMetadata() {
                return this.metadata_;
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechInitiator.WakeWordOrBuilder
            public boolean getNearMiss() {
                return this.nearMiss_;
            }

            @Override // com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = this.startIndexInSamples_;
                int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
                int i3 = this.endIndexInSamples_;
                if (i3 != 0) {
                    computeUInt32Size += CodedOutputStream.computeUInt32Size(2, i3);
                }
                boolean z = this.nearMiss_;
                if (z) {
                    computeUInt32Size += CodedOutputStream.computeBoolSize(3, z);
                }
                if (!this.metadata_.isEmpty()) {
                    computeUInt32Size += CodedOutputStream.computeBytesSize(4, this.metadata_);
                }
                if (!this.wakewordString_.isEmpty()) {
                    computeUInt32Size += CodedOutputStream.computeStringSize(5, getWakewordString());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
                this.memoizedSerializedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechInitiator.WakeWordOrBuilder
            public int getStartIndexInSamples() {
                return this.startIndexInSamples_;
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechInitiator.WakeWordOrBuilder
            public String getWakewordString() {
                return this.wakewordString_;
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechInitiator.WakeWordOrBuilder
            public ByteString getWakewordStringBytes() {
                return ByteString.copyFromUtf8(this.wakewordString_);
            }

            @Override // com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                int i = this.startIndexInSamples_;
                if (i != 0) {
                    codedOutputStream.writeUInt32(1, i);
                }
                int i2 = this.endIndexInSamples_;
                if (i2 != 0) {
                    codedOutputStream.writeUInt32(2, i2);
                }
                boolean z = this.nearMiss_;
                if (z) {
                    codedOutputStream.writeBool(3, z);
                }
                if (!this.metadata_.isEmpty()) {
                    codedOutputStream.writeBytes(4, this.metadata_);
                }
                if (!this.wakewordString_.isEmpty()) {
                    codedOutputStream.writeString(5, getWakewordString());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Builder extends GeneratedMessageLite.Builder<WakeWord, Builder> implements WakeWordOrBuilder {
                private Builder() {
                    super(WakeWord.DEFAULT_INSTANCE);
                }

                public Builder clearEndIndexInSamples() {
                    copyOnWrite();
                    ((WakeWord) this.instance).clearEndIndexInSamples();
                    return this;
                }

                public Builder clearMetadata() {
                    copyOnWrite();
                    ((WakeWord) this.instance).clearMetadata();
                    return this;
                }

                public Builder clearNearMiss() {
                    copyOnWrite();
                    ((WakeWord) this.instance).clearNearMiss();
                    return this;
                }

                public Builder clearStartIndexInSamples() {
                    copyOnWrite();
                    ((WakeWord) this.instance).clearStartIndexInSamples();
                    return this;
                }

                public Builder clearWakewordString() {
                    copyOnWrite();
                    ((WakeWord) this.instance).clearWakewordString();
                    return this;
                }

                @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechInitiator.WakeWordOrBuilder
                public int getEndIndexInSamples() {
                    return ((WakeWord) this.instance).getEndIndexInSamples();
                }

                @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechInitiator.WakeWordOrBuilder
                public ByteString getMetadata() {
                    return ((WakeWord) this.instance).getMetadata();
                }

                @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechInitiator.WakeWordOrBuilder
                public boolean getNearMiss() {
                    return ((WakeWord) this.instance).getNearMiss();
                }

                @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechInitiator.WakeWordOrBuilder
                public int getStartIndexInSamples() {
                    return ((WakeWord) this.instance).getStartIndexInSamples();
                }

                @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechInitiator.WakeWordOrBuilder
                public String getWakewordString() {
                    return ((WakeWord) this.instance).getWakewordString();
                }

                @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechInitiator.WakeWordOrBuilder
                public ByteString getWakewordStringBytes() {
                    return ((WakeWord) this.instance).getWakewordStringBytes();
                }

                public Builder setEndIndexInSamples(int i) {
                    copyOnWrite();
                    ((WakeWord) this.instance).setEndIndexInSamples(i);
                    return this;
                }

                public Builder setMetadata(ByteString byteString) {
                    copyOnWrite();
                    ((WakeWord) this.instance).setMetadata(byteString);
                    return this;
                }

                public Builder setNearMiss(boolean z) {
                    copyOnWrite();
                    ((WakeWord) this.instance).setNearMiss(z);
                    return this;
                }

                public Builder setStartIndexInSamples(int i) {
                    copyOnWrite();
                    ((WakeWord) this.instance).setStartIndexInSamples(i);
                    return this;
                }

                public Builder setWakewordString(String str) {
                    copyOnWrite();
                    ((WakeWord) this.instance).setWakewordString(str);
                    return this;
                }

                public Builder setWakewordStringBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WakeWord) this.instance).setWakewordStringBytes(byteString);
                    return this;
                }

                public /* synthetic */ Builder(int i) {
                    this();
                }
            }

            public static Builder newBuilder(WakeWord wakeWord) {
                return DEFAULT_INSTANCE.createBuilder(wakeWord);
            }

            public static WakeWord parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (WakeWord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static WakeWord parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (WakeWord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static WakeWord parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (WakeWord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static WakeWord parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (WakeWord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static WakeWord parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (WakeWord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static WakeWord parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (WakeWord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static WakeWord parseFrom(InputStream inputStream) throws IOException {
                return (WakeWord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static WakeWord parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (WakeWord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static WakeWord parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (WakeWord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static WakeWord parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (WakeWord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SpeechInitiator, Builder> implements SpeechInitiatorOrBuilder {
            private Builder() {
                super(SpeechInitiator.DEFAULT_INSTANCE);
            }

            public Builder clearType() {
                copyOnWrite();
                ((SpeechInitiator) this.instance).clearType();
                return this;
            }

            public Builder clearWakeWord() {
                copyOnWrite();
                ((SpeechInitiator) this.instance).clearWakeWord();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechInitiatorOrBuilder
            public Type getType() {
                return ((SpeechInitiator) this.instance).getType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechInitiatorOrBuilder
            public int getTypeValue() {
                return ((SpeechInitiator) this.instance).getTypeValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechInitiatorOrBuilder
            public WakeWord getWakeWord() {
                return ((SpeechInitiator) this.instance).getWakeWord();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechInitiatorOrBuilder
            public boolean hasWakeWord() {
                return ((SpeechInitiator) this.instance).hasWakeWord();
            }

            public Builder mergeWakeWord(WakeWord wakeWord) {
                copyOnWrite();
                ((SpeechInitiator) this.instance).mergeWakeWord(wakeWord);
                return this;
            }

            public Builder setType(Type type) {
                copyOnWrite();
                ((SpeechInitiator) this.instance).setType(type);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((SpeechInitiator) this.instance).setTypeValue(i);
                return this;
            }

            public Builder setWakeWord(WakeWord wakeWord) {
                copyOnWrite();
                ((SpeechInitiator) this.instance).setWakeWord(wakeWord);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setWakeWord(WakeWord.Builder builder) {
                copyOnWrite();
                ((SpeechInitiator) this.instance).setWakeWord(builder);
                return this;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum Type implements Internal.EnumLite {
            NONE(0),
            PRESS_AND_HOLD(1),
            TAP(3),
            WAKEWORD(4),
            SERVER(5),
            NATURAL_TURN(6),
            UNRECOGNIZED(-1);

            public static final int NATURAL_TURN_VALUE = 6;
            public static final int NONE_VALUE = 0;
            public static final int PRESS_AND_HOLD_VALUE = 1;
            public static final int SERVER_VALUE = 5;
            public static final int TAP_VALUE = 3;
            public static final int WAKEWORD_VALUE = 4;
            private static final Internal.EnumLiteMap<Type> internalValueMap = new Internal.EnumLiteMap<Type>() { // from class: com.amazon.alexa.accessory.protocol.Speech.SpeechInitiator.Type.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Type findValueByNumber(int i) {
                    return Type.forNumber(i);
                }
            };
            private final int value;

            Type(int i) {
                this.value = i;
            }

            public static Type forNumber(int i) {
                if (i == 0) {
                    return NONE;
                }
                if (i == 1) {
                    return PRESS_AND_HOLD;
                }
                if (i == 3) {
                    return TAP;
                }
                if (i == 4) {
                    return WAKEWORD;
                }
                if (i == 5) {
                    return SERVER;
                }
                if (i != 6) {
                    return null;
                }
                return NATURAL_TURN;
            }

            public static Internal.EnumLiteMap<Type> internalGetValueMap() {
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
            public static Type valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(SpeechInitiator speechInitiator) {
            return DEFAULT_INSTANCE.createBuilder(speechInitiator);
        }

        public static SpeechInitiator parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SpeechInitiator) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SpeechInitiator parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SpeechInitiator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWakeWord(WakeWord wakeWord) {
            wakeWord.getClass();
            this.wakeWord_ = wakeWord;
        }

        public static SpeechInitiator parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SpeechInitiator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SpeechInitiator parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SpeechInitiator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SpeechInitiator parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SpeechInitiator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SpeechInitiator parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SpeechInitiator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SpeechInitiator parseFrom(InputStream inputStream) throws IOException {
            return (SpeechInitiator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SpeechInitiator parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SpeechInitiator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SpeechInitiator parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SpeechInitiator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SpeechInitiator parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SpeechInitiator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SpeechProvider extends GeneratedMessageLite<SpeechProvider, Builder> implements SpeechProviderOrBuilder {
        private static final SpeechProvider DEFAULT_INSTANCE;
        public static final int DIALOG_FIELD_NUMBER = 2;
        private static volatile Parser<SpeechProvider> PARSER = null;
        public static final int SPEECH_SETTINGS_FIELD_NUMBER = 1;
        private Dialog dialog_;
        private SpeechSettings speechSettings_;

        static {
            SpeechProvider speechProvider = new SpeechProvider();
            DEFAULT_INSTANCE = speechProvider;
            speechProvider.makeImmutable();
        }

        private SpeechProvider() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialog() {
            this.dialog_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpeechSettings() {
            this.speechSettings_ = null;
        }

        public static SpeechProvider getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDialog(Dialog dialog) {
            Dialog dialog2 = this.dialog_;
            if (dialog2 == null || dialog2 == Dialog.getDefaultInstance()) {
                this.dialog_ = dialog;
            } else {
                this.dialog_ = Dialog.newBuilder(this.dialog_).mergeFrom((Dialog.Builder) dialog).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSpeechSettings(SpeechSettings speechSettings) {
            SpeechSettings speechSettings2 = this.speechSettings_;
            if (speechSettings2 == null || speechSettings2 == SpeechSettings.getDefaultInstance()) {
                this.speechSettings_ = speechSettings;
            } else {
                this.speechSettings_ = SpeechSettings.newBuilder(this.speechSettings_).mergeFrom((SpeechSettings.Builder) speechSettings).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SpeechProvider parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SpeechProvider) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SpeechProvider parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SpeechProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SpeechProvider> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialog(Dialog.Builder builder) {
            this.dialog_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpeechSettings(SpeechSettings.Builder builder) {
            this.speechSettings_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SpeechProvider();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    SpeechProvider speechProvider = (SpeechProvider) obj2;
                    this.speechSettings_ = (SpeechSettings) visitor.visitMessage(this.speechSettings_, speechProvider.speechSettings_);
                    this.dialog_ = (Dialog) visitor.visitMessage(this.dialog_, speechProvider.dialog_);
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
                                    SpeechSettings speechSettings = this.speechSettings_;
                                    SpeechSettings.Builder builder = speechSettings != null ? speechSettings.toBuilder() : null;
                                    SpeechSettings speechSettings2 = (SpeechSettings) codedInputStream.readMessage(SpeechSettings.parser(), extensionRegistryLite);
                                    this.speechSettings_ = speechSettings2;
                                    if (builder != null) {
                                        builder.mergeFrom((SpeechSettings.Builder) speechSettings2);
                                        this.speechSettings_ = builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    Dialog dialog = this.dialog_;
                                    Dialog.Builder builder2 = dialog != null ? dialog.toBuilder() : null;
                                    Dialog dialog2 = (Dialog) codedInputStream.readMessage(Dialog.parser(), extensionRegistryLite);
                                    this.dialog_ = dialog2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((Dialog.Builder) dialog2);
                                        this.dialog_ = builder2.buildPartial();
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
                        synchronized (SpeechProvider.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechProviderOrBuilder
        public Dialog getDialog() {
            Dialog dialog = this.dialog_;
            return dialog == null ? Dialog.getDefaultInstance() : dialog;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.speechSettings_ != null ? CodedOutputStream.computeMessageSize(1, getSpeechSettings()) : 0;
            if (this.dialog_ != null) {
                computeMessageSize += CodedOutputStream.computeMessageSize(2, getDialog());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechProviderOrBuilder
        public SpeechSettings getSpeechSettings() {
            SpeechSettings speechSettings = this.speechSettings_;
            return speechSettings == null ? SpeechSettings.getDefaultInstance() : speechSettings;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechProviderOrBuilder
        public boolean hasDialog() {
            return this.dialog_ != null;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechProviderOrBuilder
        public boolean hasSpeechSettings() {
            return this.speechSettings_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.speechSettings_ != null) {
                codedOutputStream.writeMessage(1, getSpeechSettings());
            }
            if (this.dialog_ != null) {
                codedOutputStream.writeMessage(2, getDialog());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SpeechProvider, Builder> implements SpeechProviderOrBuilder {
            private Builder() {
                super(SpeechProvider.DEFAULT_INSTANCE);
            }

            public Builder clearDialog() {
                copyOnWrite();
                ((SpeechProvider) this.instance).clearDialog();
                return this;
            }

            public Builder clearSpeechSettings() {
                copyOnWrite();
                ((SpeechProvider) this.instance).clearSpeechSettings();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechProviderOrBuilder
            public Dialog getDialog() {
                return ((SpeechProvider) this.instance).getDialog();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechProviderOrBuilder
            public SpeechSettings getSpeechSettings() {
                return ((SpeechProvider) this.instance).getSpeechSettings();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechProviderOrBuilder
            public boolean hasDialog() {
                return ((SpeechProvider) this.instance).hasDialog();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechProviderOrBuilder
            public boolean hasSpeechSettings() {
                return ((SpeechProvider) this.instance).hasSpeechSettings();
            }

            public Builder mergeDialog(Dialog dialog) {
                copyOnWrite();
                ((SpeechProvider) this.instance).mergeDialog(dialog);
                return this;
            }

            public Builder mergeSpeechSettings(SpeechSettings speechSettings) {
                copyOnWrite();
                ((SpeechProvider) this.instance).mergeSpeechSettings(speechSettings);
                return this;
            }

            public Builder setDialog(Dialog dialog) {
                copyOnWrite();
                ((SpeechProvider) this.instance).setDialog(dialog);
                return this;
            }

            public Builder setSpeechSettings(SpeechSettings speechSettings) {
                copyOnWrite();
                ((SpeechProvider) this.instance).setSpeechSettings(speechSettings);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setDialog(Dialog.Builder builder) {
                copyOnWrite();
                ((SpeechProvider) this.instance).setDialog(builder);
                return this;
            }

            public Builder setSpeechSettings(SpeechSettings.Builder builder) {
                copyOnWrite();
                ((SpeechProvider) this.instance).setSpeechSettings(builder);
                return this;
            }
        }

        public static Builder newBuilder(SpeechProvider speechProvider) {
            return DEFAULT_INSTANCE.createBuilder(speechProvider);
        }

        public static SpeechProvider parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SpeechProvider) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SpeechProvider parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SpeechProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialog(Dialog dialog) {
            dialog.getClass();
            this.dialog_ = dialog;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpeechSettings(SpeechSettings speechSettings) {
            speechSettings.getClass();
            this.speechSettings_ = speechSettings;
        }

        public static SpeechProvider parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SpeechProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SpeechProvider parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SpeechProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SpeechProvider parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SpeechProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SpeechProvider parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SpeechProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SpeechProvider parseFrom(InputStream inputStream) throws IOException {
            return (SpeechProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SpeechProvider parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SpeechProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SpeechProvider parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SpeechProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SpeechProvider parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SpeechProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StartSpeech extends GeneratedMessageLite<StartSpeech, Builder> implements StartSpeechOrBuilder {
        private static final StartSpeech DEFAULT_INSTANCE;
        public static final int DIALOG_FIELD_NUMBER = 3;
        public static final int INITIATOR_FIELD_NUMBER = 2;
        private static volatile Parser<StartSpeech> PARSER = null;
        public static final int SETTINGS_FIELD_NUMBER = 1;
        public static final int SUPPRESSENDPOINTEARCON_FIELD_NUMBER = 4;
        public static final int SUPPRESSSTARTEARCON_FIELD_NUMBER = 5;
        private Dialog dialog_;
        private SpeechInitiator initiator_;
        private SpeechSettings settings_;
        private boolean suppressEndpointEarcon_;
        private boolean suppressStartEarcon_;

        static {
            StartSpeech startSpeech = new StartSpeech();
            DEFAULT_INSTANCE = startSpeech;
            startSpeech.makeImmutable();
        }

        private StartSpeech() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialog() {
            this.dialog_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInitiator() {
            this.initiator_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettings() {
            this.settings_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSuppressEndpointEarcon() {
            this.suppressEndpointEarcon_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSuppressStartEarcon() {
            this.suppressStartEarcon_ = false;
        }

        public static StartSpeech getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDialog(Dialog dialog) {
            Dialog dialog2 = this.dialog_;
            if (dialog2 == null || dialog2 == Dialog.getDefaultInstance()) {
                this.dialog_ = dialog;
            } else {
                this.dialog_ = Dialog.newBuilder(this.dialog_).mergeFrom((Dialog.Builder) dialog).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInitiator(SpeechInitiator speechInitiator) {
            SpeechInitiator speechInitiator2 = this.initiator_;
            if (speechInitiator2 == null || speechInitiator2 == SpeechInitiator.getDefaultInstance()) {
                this.initiator_ = speechInitiator;
            } else {
                this.initiator_ = SpeechInitiator.newBuilder(this.initiator_).mergeFrom((SpeechInitiator.Builder) speechInitiator).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSettings(SpeechSettings speechSettings) {
            SpeechSettings speechSettings2 = this.settings_;
            if (speechSettings2 == null || speechSettings2 == SpeechSettings.getDefaultInstance()) {
                this.settings_ = speechSettings;
            } else {
                this.settings_ = SpeechSettings.newBuilder(this.settings_).mergeFrom((SpeechSettings.Builder) speechSettings).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StartSpeech parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StartSpeech) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartSpeech parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StartSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StartSpeech> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialog(Dialog.Builder builder) {
            this.dialog_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitiator(SpeechInitiator.Builder builder) {
            this.initiator_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettings(SpeechSettings.Builder builder) {
            this.settings_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSuppressEndpointEarcon(boolean z) {
            this.suppressEndpointEarcon_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSuppressStartEarcon(boolean z) {
            this.suppressStartEarcon_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StartSpeech();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    StartSpeech startSpeech = (StartSpeech) obj2;
                    this.settings_ = (SpeechSettings) visitor.visitMessage(this.settings_, startSpeech.settings_);
                    this.initiator_ = (SpeechInitiator) visitor.visitMessage(this.initiator_, startSpeech.initiator_);
                    this.dialog_ = (Dialog) visitor.visitMessage(this.dialog_, startSpeech.dialog_);
                    boolean z = this.suppressEndpointEarcon_;
                    boolean z2 = startSpeech.suppressEndpointEarcon_;
                    this.suppressEndpointEarcon_ = visitor.visitBoolean(z, z, z2, z2);
                    boolean z3 = this.suppressStartEarcon_;
                    boolean z4 = startSpeech.suppressStartEarcon_;
                    this.suppressStartEarcon_ = visitor.visitBoolean(z3, z3, z4, z4);
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
                                    SpeechSettings speechSettings = this.settings_;
                                    SpeechSettings.Builder builder = speechSettings != null ? speechSettings.toBuilder() : null;
                                    SpeechSettings speechSettings2 = (SpeechSettings) codedInputStream.readMessage(SpeechSettings.parser(), extensionRegistryLite);
                                    this.settings_ = speechSettings2;
                                    if (builder != null) {
                                        builder.mergeFrom((SpeechSettings.Builder) speechSettings2);
                                        this.settings_ = builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    SpeechInitiator speechInitiator = this.initiator_;
                                    SpeechInitiator.Builder builder2 = speechInitiator != null ? speechInitiator.toBuilder() : null;
                                    SpeechInitiator speechInitiator2 = (SpeechInitiator) codedInputStream.readMessage(SpeechInitiator.parser(), extensionRegistryLite);
                                    this.initiator_ = speechInitiator2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((SpeechInitiator.Builder) speechInitiator2);
                                        this.initiator_ = builder2.buildPartial();
                                    }
                                } else if (readTag == 26) {
                                    Dialog dialog = this.dialog_;
                                    Dialog.Builder builder3 = dialog != null ? dialog.toBuilder() : null;
                                    Dialog dialog2 = (Dialog) codedInputStream.readMessage(Dialog.parser(), extensionRegistryLite);
                                    this.dialog_ = dialog2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom((Dialog.Builder) dialog2);
                                        this.dialog_ = builder3.buildPartial();
                                    }
                                } else if (readTag == 32) {
                                    this.suppressEndpointEarcon_ = codedInputStream.readBool();
                                } else if (readTag == 40) {
                                    this.suppressStartEarcon_ = codedInputStream.readBool();
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
                        synchronized (StartSpeech.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Speech.StartSpeechOrBuilder
        public Dialog getDialog() {
            Dialog dialog = this.dialog_;
            return dialog == null ? Dialog.getDefaultInstance() : dialog;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.StartSpeechOrBuilder
        public SpeechInitiator getInitiator() {
            SpeechInitiator speechInitiator = this.initiator_;
            return speechInitiator == null ? SpeechInitiator.getDefaultInstance() : speechInitiator;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.settings_ != null ? CodedOutputStream.computeMessageSize(1, getSettings()) : 0;
            if (this.initiator_ != null) {
                computeMessageSize += CodedOutputStream.computeMessageSize(2, getInitiator());
            }
            if (this.dialog_ != null) {
                computeMessageSize += CodedOutputStream.computeMessageSize(3, getDialog());
            }
            boolean z = this.suppressEndpointEarcon_;
            if (z) {
                computeMessageSize += CodedOutputStream.computeBoolSize(4, z);
            }
            boolean z2 = this.suppressStartEarcon_;
            if (z2) {
                computeMessageSize += CodedOutputStream.computeBoolSize(5, z2);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.StartSpeechOrBuilder
        public SpeechSettings getSettings() {
            SpeechSettings speechSettings = this.settings_;
            return speechSettings == null ? SpeechSettings.getDefaultInstance() : speechSettings;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.StartSpeechOrBuilder
        public boolean getSuppressEndpointEarcon() {
            return this.suppressEndpointEarcon_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.StartSpeechOrBuilder
        public boolean getSuppressStartEarcon() {
            return this.suppressStartEarcon_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.StartSpeechOrBuilder
        public boolean hasDialog() {
            return this.dialog_ != null;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.StartSpeechOrBuilder
        public boolean hasInitiator() {
            return this.initiator_ != null;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.StartSpeechOrBuilder
        public boolean hasSettings() {
            return this.settings_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.settings_ != null) {
                codedOutputStream.writeMessage(1, getSettings());
            }
            if (this.initiator_ != null) {
                codedOutputStream.writeMessage(2, getInitiator());
            }
            if (this.dialog_ != null) {
                codedOutputStream.writeMessage(3, getDialog());
            }
            boolean z = this.suppressEndpointEarcon_;
            if (z) {
                codedOutputStream.writeBool(4, z);
            }
            boolean z2 = this.suppressStartEarcon_;
            if (z2) {
                codedOutputStream.writeBool(5, z2);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<StartSpeech, Builder> implements StartSpeechOrBuilder {
            private Builder() {
                super(StartSpeech.DEFAULT_INSTANCE);
            }

            public Builder clearDialog() {
                copyOnWrite();
                ((StartSpeech) this.instance).clearDialog();
                return this;
            }

            public Builder clearInitiator() {
                copyOnWrite();
                ((StartSpeech) this.instance).clearInitiator();
                return this;
            }

            public Builder clearSettings() {
                copyOnWrite();
                ((StartSpeech) this.instance).clearSettings();
                return this;
            }

            public Builder clearSuppressEndpointEarcon() {
                copyOnWrite();
                ((StartSpeech) this.instance).clearSuppressEndpointEarcon();
                return this;
            }

            public Builder clearSuppressStartEarcon() {
                copyOnWrite();
                ((StartSpeech) this.instance).clearSuppressStartEarcon();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.StartSpeechOrBuilder
            public Dialog getDialog() {
                return ((StartSpeech) this.instance).getDialog();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.StartSpeechOrBuilder
            public SpeechInitiator getInitiator() {
                return ((StartSpeech) this.instance).getInitiator();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.StartSpeechOrBuilder
            public SpeechSettings getSettings() {
                return ((StartSpeech) this.instance).getSettings();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.StartSpeechOrBuilder
            public boolean getSuppressEndpointEarcon() {
                return ((StartSpeech) this.instance).getSuppressEndpointEarcon();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.StartSpeechOrBuilder
            public boolean getSuppressStartEarcon() {
                return ((StartSpeech) this.instance).getSuppressStartEarcon();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.StartSpeechOrBuilder
            public boolean hasDialog() {
                return ((StartSpeech) this.instance).hasDialog();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.StartSpeechOrBuilder
            public boolean hasInitiator() {
                return ((StartSpeech) this.instance).hasInitiator();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.StartSpeechOrBuilder
            public boolean hasSettings() {
                return ((StartSpeech) this.instance).hasSettings();
            }

            public Builder mergeDialog(Dialog dialog) {
                copyOnWrite();
                ((StartSpeech) this.instance).mergeDialog(dialog);
                return this;
            }

            public Builder mergeInitiator(SpeechInitiator speechInitiator) {
                copyOnWrite();
                ((StartSpeech) this.instance).mergeInitiator(speechInitiator);
                return this;
            }

            public Builder mergeSettings(SpeechSettings speechSettings) {
                copyOnWrite();
                ((StartSpeech) this.instance).mergeSettings(speechSettings);
                return this;
            }

            public Builder setDialog(Dialog dialog) {
                copyOnWrite();
                ((StartSpeech) this.instance).setDialog(dialog);
                return this;
            }

            public Builder setInitiator(SpeechInitiator speechInitiator) {
                copyOnWrite();
                ((StartSpeech) this.instance).setInitiator(speechInitiator);
                return this;
            }

            public Builder setSettings(SpeechSettings speechSettings) {
                copyOnWrite();
                ((StartSpeech) this.instance).setSettings(speechSettings);
                return this;
            }

            public Builder setSuppressEndpointEarcon(boolean z) {
                copyOnWrite();
                ((StartSpeech) this.instance).setSuppressEndpointEarcon(z);
                return this;
            }

            public Builder setSuppressStartEarcon(boolean z) {
                copyOnWrite();
                ((StartSpeech) this.instance).setSuppressStartEarcon(z);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setDialog(Dialog.Builder builder) {
                copyOnWrite();
                ((StartSpeech) this.instance).setDialog(builder);
                return this;
            }

            public Builder setInitiator(SpeechInitiator.Builder builder) {
                copyOnWrite();
                ((StartSpeech) this.instance).setInitiator(builder);
                return this;
            }

            public Builder setSettings(SpeechSettings.Builder builder) {
                copyOnWrite();
                ((StartSpeech) this.instance).setSettings(builder);
                return this;
            }
        }

        public static Builder newBuilder(StartSpeech startSpeech) {
            return DEFAULT_INSTANCE.createBuilder(startSpeech);
        }

        public static StartSpeech parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartSpeech) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartSpeech parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialog(Dialog dialog) {
            dialog.getClass();
            this.dialog_ = dialog;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitiator(SpeechInitiator speechInitiator) {
            speechInitiator.getClass();
            this.initiator_ = speechInitiator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettings(SpeechSettings speechSettings) {
            speechSettings.getClass();
            this.settings_ = speechSettings;
        }

        public static StartSpeech parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StartSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StartSpeech parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StartSpeech parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StartSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StartSpeech parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StartSpeech parseFrom(InputStream inputStream) throws IOException {
            return (StartSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartSpeech parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartSpeech parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StartSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StartSpeech parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StopSpeech extends GeneratedMessageLite<StopSpeech, Builder> implements StopSpeechOrBuilder {
        private static final StopSpeech DEFAULT_INSTANCE;
        public static final int DIALOG_FIELD_NUMBER = 2;
        public static final int ERROR_CODE_FIELD_NUMBER = 1;
        private static volatile Parser<StopSpeech> PARSER;
        private Dialog dialog_;
        private int errorCode_;

        static {
            StopSpeech stopSpeech = new StopSpeech();
            DEFAULT_INSTANCE = stopSpeech;
            stopSpeech.makeImmutable();
        }

        private StopSpeech() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialog() {
            this.dialog_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorCode() {
            this.errorCode_ = 0;
        }

        public static StopSpeech getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDialog(Dialog dialog) {
            Dialog dialog2 = this.dialog_;
            if (dialog2 == null || dialog2 == Dialog.getDefaultInstance()) {
                this.dialog_ = dialog;
            } else {
                this.dialog_ = Dialog.newBuilder(this.dialog_).mergeFrom((Dialog.Builder) dialog).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StopSpeech parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StopSpeech) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StopSpeech parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StopSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StopSpeech> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialog(Dialog.Builder builder) {
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
                    return new StopSpeech();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    StopSpeech stopSpeech = (StopSpeech) obj2;
                    int i = this.errorCode_;
                    boolean z = i != 0;
                    int i2 = stopSpeech.errorCode_;
                    this.errorCode_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.dialog_ = (Dialog) visitor.visitMessage(this.dialog_, stopSpeech.dialog_);
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
                                    this.errorCode_ = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    Dialog dialog = this.dialog_;
                                    Dialog.Builder builder = dialog != null ? dialog.toBuilder() : null;
                                    Dialog dialog2 = (Dialog) codedInputStream.readMessage(Dialog.parser(), extensionRegistryLite);
                                    this.dialog_ = dialog2;
                                    if (builder != null) {
                                        builder.mergeFrom((Dialog.Builder) dialog2);
                                        this.dialog_ = builder.buildPartial();
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
                        synchronized (StopSpeech.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Speech.StopSpeechOrBuilder
        public Dialog getDialog() {
            Dialog dialog = this.dialog_;
            return dialog == null ? Dialog.getDefaultInstance() : dialog;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.StopSpeechOrBuilder
        public Common.ErrorCode getErrorCode() {
            Common.ErrorCode forNumber = Common.ErrorCode.forNumber(this.errorCode_);
            return forNumber == null ? Common.ErrorCode.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.StopSpeechOrBuilder
        public int getErrorCodeValue() {
            return this.errorCode_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.errorCode_ != Common.ErrorCode.SUCCESS.getNumber() ? CodedOutputStream.computeEnumSize(1, this.errorCode_) : 0;
            if (this.dialog_ != null) {
                computeEnumSize += CodedOutputStream.computeMessageSize(2, getDialog());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.StopSpeechOrBuilder
        public boolean hasDialog() {
            return this.dialog_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.errorCode_ != Common.ErrorCode.SUCCESS.getNumber()) {
                codedOutputStream.writeEnum(1, this.errorCode_);
            }
            if (this.dialog_ != null) {
                codedOutputStream.writeMessage(2, getDialog());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<StopSpeech, Builder> implements StopSpeechOrBuilder {
            private Builder() {
                super(StopSpeech.DEFAULT_INSTANCE);
            }

            public Builder clearDialog() {
                copyOnWrite();
                ((StopSpeech) this.instance).clearDialog();
                return this;
            }

            public Builder clearErrorCode() {
                copyOnWrite();
                ((StopSpeech) this.instance).clearErrorCode();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.StopSpeechOrBuilder
            public Dialog getDialog() {
                return ((StopSpeech) this.instance).getDialog();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.StopSpeechOrBuilder
            public Common.ErrorCode getErrorCode() {
                return ((StopSpeech) this.instance).getErrorCode();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.StopSpeechOrBuilder
            public int getErrorCodeValue() {
                return ((StopSpeech) this.instance).getErrorCodeValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.StopSpeechOrBuilder
            public boolean hasDialog() {
                return ((StopSpeech) this.instance).hasDialog();
            }

            public Builder mergeDialog(Dialog dialog) {
                copyOnWrite();
                ((StopSpeech) this.instance).mergeDialog(dialog);
                return this;
            }

            public Builder setDialog(Dialog dialog) {
                copyOnWrite();
                ((StopSpeech) this.instance).setDialog(dialog);
                return this;
            }

            public Builder setErrorCode(Common.ErrorCode errorCode) {
                copyOnWrite();
                ((StopSpeech) this.instance).setErrorCode(errorCode);
                return this;
            }

            public Builder setErrorCodeValue(int i) {
                copyOnWrite();
                ((StopSpeech) this.instance).setErrorCodeValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setDialog(Dialog.Builder builder) {
                copyOnWrite();
                ((StopSpeech) this.instance).setDialog(builder);
                return this;
            }
        }

        public static Builder newBuilder(StopSpeech stopSpeech) {
            return DEFAULT_INSTANCE.createBuilder(stopSpeech);
        }

        public static StopSpeech parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopSpeech) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StopSpeech parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialog(Dialog dialog) {
            dialog.getClass();
            this.dialog_ = dialog;
        }

        public static StopSpeech parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StopSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StopSpeech parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StopSpeech parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StopSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StopSpeech parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StopSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StopSpeech parseFrom(InputStream inputStream) throws IOException {
            return (StopSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StopSpeech parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StopSpeech parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StopSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StopSpeech parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StopSpeech) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Dialog extends GeneratedMessageLite<Dialog, Builder> implements DialogOrBuilder {
        private static final Dialog DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile Parser<Dialog> PARSER;
        private int id_;

        static {
            Dialog dialog = new Dialog();
            DEFAULT_INSTANCE = dialog;
            dialog.makeImmutable();
        }

        private Dialog() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0;
        }

        public static Dialog getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Dialog parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Dialog) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Dialog parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Dialog> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(int i) {
            this.id_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Dialog();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    Dialog dialog = (Dialog) obj2;
                    int i = this.id_;
                    boolean z = i != 0;
                    int i2 = dialog.id_;
                    this.id_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    this.id_ = codedInputStream.readUInt32();
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
                        synchronized (Dialog.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Speech.DialogOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.id_;
            int serializedSize = this.unknownFields.getSerializedSize() + (i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.id_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<Dialog, Builder> implements DialogOrBuilder {
            private Builder() {
                super(Dialog.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((Dialog) this.instance).clearId();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.DialogOrBuilder
            public int getId() {
                return ((Dialog) this.instance).getId();
            }

            public Builder setId(int i) {
                copyOnWrite();
                ((Dialog) this.instance).setId(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(Dialog dialog) {
            return DEFAULT_INSTANCE.createBuilder(dialog);
        }

        public static Dialog parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Dialog) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Dialog parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Dialog parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Dialog parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Dialog parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Dialog parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Dialog parseFrom(InputStream inputStream) throws IOException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Dialog parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Dialog parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Dialog parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotifySpeechState extends GeneratedMessageLite<NotifySpeechState, Builder> implements NotifySpeechStateOrBuilder {
        private static final NotifySpeechState DEFAULT_INSTANCE;
        private static volatile Parser<NotifySpeechState> PARSER = null;
        public static final int STATE_FIELD_NUMBER = 1;
        private int state_;

        static {
            NotifySpeechState notifySpeechState = new NotifySpeechState();
            DEFAULT_INSTANCE = notifySpeechState;
            notifySpeechState.makeImmutable();
        }

        private NotifySpeechState() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearState() {
            this.state_ = 0;
        }

        public static NotifySpeechState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifySpeechState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NotifySpeechState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifySpeechState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NotifySpeechState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NotifySpeechState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setState(SpeechState speechState) {
            speechState.getClass();
            this.state_ = speechState.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStateValue(int i) {
            this.state_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NotifySpeechState();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    NotifySpeechState notifySpeechState = (NotifySpeechState) obj2;
                    int i = this.state_;
                    boolean z = i != 0;
                    int i2 = notifySpeechState.state_;
                    this.state_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    this.state_ = codedInputStream.readEnum();
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
                        synchronized (NotifySpeechState.class) {
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
            int serializedSize = this.unknownFields.getSerializedSize() + (this.state_ != SpeechState.IDLE.getNumber() ? CodedOutputStream.computeEnumSize(1, this.state_) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.NotifySpeechStateOrBuilder
        public SpeechState getState() {
            SpeechState forNumber = SpeechState.forNumber(this.state_);
            return forNumber == null ? SpeechState.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.NotifySpeechStateOrBuilder
        public int getStateValue() {
            return this.state_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.state_ != SpeechState.IDLE.getNumber()) {
                codedOutputStream.writeEnum(1, this.state_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NotifySpeechState, Builder> implements NotifySpeechStateOrBuilder {
            private Builder() {
                super(NotifySpeechState.DEFAULT_INSTANCE);
            }

            public Builder clearState() {
                copyOnWrite();
                ((NotifySpeechState) this.instance).clearState();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.NotifySpeechStateOrBuilder
            public SpeechState getState() {
                return ((NotifySpeechState) this.instance).getState();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.NotifySpeechStateOrBuilder
            public int getStateValue() {
                return ((NotifySpeechState) this.instance).getStateValue();
            }

            public Builder setState(SpeechState speechState) {
                copyOnWrite();
                ((NotifySpeechState) this.instance).setState(speechState);
                return this;
            }

            public Builder setStateValue(int i) {
                copyOnWrite();
                ((NotifySpeechState) this.instance).setStateValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(NotifySpeechState notifySpeechState) {
            return DEFAULT_INSTANCE.createBuilder(notifySpeechState);
        }

        public static NotifySpeechState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifySpeechState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifySpeechState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifySpeechState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NotifySpeechState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NotifySpeechState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NotifySpeechState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifySpeechState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NotifySpeechState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NotifySpeechState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotifySpeechState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotifySpeechState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NotifySpeechState parseFrom(InputStream inputStream) throws IOException {
            return (NotifySpeechState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifySpeechState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifySpeechState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotifySpeechState parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NotifySpeechState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NotifySpeechState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotifySpeechState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SpeechSettings extends GeneratedMessageLite<SpeechSettings, Builder> implements SpeechSettingsOrBuilder {
        public static final int AUDIO_FORMAT_FIELD_NUMBER = 2;
        public static final int AUDIO_PROFILE_FIELD_NUMBER = 1;
        public static final int AUDIO_SOURCE_FIELD_NUMBER = 3;
        private static final SpeechSettings DEFAULT_INSTANCE;
        private static volatile Parser<SpeechSettings> PARSER;
        private int audioFormat_;
        private int audioProfile_;
        private int audioSource_;

        static {
            SpeechSettings speechSettings = new SpeechSettings();
            DEFAULT_INSTANCE = speechSettings;
            speechSettings.makeImmutable();
        }

        private SpeechSettings() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAudioFormat() {
            this.audioFormat_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAudioProfile() {
            this.audioProfile_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAudioSource() {
            this.audioSource_ = 0;
        }

        public static SpeechSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SpeechSettings parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SpeechSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SpeechSettings parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SpeechSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SpeechSettings> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudioFormat(AudioFormat audioFormat) {
            audioFormat.getClass();
            this.audioFormat_ = audioFormat.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudioFormatValue(int i) {
            this.audioFormat_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudioProfile(AudioProfile audioProfile) {
            audioProfile.getClass();
            this.audioProfile_ = audioProfile.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudioProfileValue(int i) {
            this.audioProfile_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudioSource(AudioSource audioSource) {
            audioSource.getClass();
            this.audioSource_ = audioSource.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudioSourceValue(int i) {
            this.audioSource_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SpeechSettings();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    SpeechSettings speechSettings = (SpeechSettings) obj2;
                    int i = this.audioProfile_;
                    boolean z = i != 0;
                    int i2 = speechSettings.audioProfile_;
                    this.audioProfile_ = visitor.visitInt(z, i, i2 != 0, i2);
                    int i3 = this.audioFormat_;
                    boolean z2 = i3 != 0;
                    int i4 = speechSettings.audioFormat_;
                    this.audioFormat_ = visitor.visitInt(z2, i3, i4 != 0, i4);
                    int i5 = this.audioSource_;
                    boolean z3 = i5 != 0;
                    int i6 = speechSettings.audioSource_;
                    this.audioSource_ = visitor.visitInt(z3, i5, i6 != 0, i6);
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
                                    this.audioProfile_ = codedInputStream.readEnum();
                                } else if (readTag == 16) {
                                    this.audioFormat_ = codedInputStream.readEnum();
                                } else if (readTag == 24) {
                                    this.audioSource_ = codedInputStream.readEnum();
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
                        synchronized (SpeechSettings.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechSettingsOrBuilder
        public AudioFormat getAudioFormat() {
            AudioFormat forNumber = AudioFormat.forNumber(this.audioFormat_);
            return forNumber == null ? AudioFormat.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechSettingsOrBuilder
        public int getAudioFormatValue() {
            return this.audioFormat_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechSettingsOrBuilder
        public AudioProfile getAudioProfile() {
            AudioProfile forNumber = AudioProfile.forNumber(this.audioProfile_);
            return forNumber == null ? AudioProfile.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechSettingsOrBuilder
        public int getAudioProfileValue() {
            return this.audioProfile_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechSettingsOrBuilder
        public AudioSource getAudioSource() {
            AudioSource forNumber = AudioSource.forNumber(this.audioSource_);
            return forNumber == null ? AudioSource.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechSettingsOrBuilder
        public int getAudioSourceValue() {
            return this.audioSource_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.audioProfile_ != AudioProfile.CLOSE_TALK.getNumber() ? CodedOutputStream.computeEnumSize(1, this.audioProfile_) : 0;
            if (this.audioFormat_ != AudioFormat.PCM_L16_16KHZ_MONO.getNumber()) {
                computeEnumSize += CodedOutputStream.computeEnumSize(2, this.audioFormat_);
            }
            if (this.audioSource_ != AudioSource.STREAM.getNumber()) {
                computeEnumSize += CodedOutputStream.computeEnumSize(3, this.audioSource_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.audioProfile_ != AudioProfile.CLOSE_TALK.getNumber()) {
                codedOutputStream.writeEnum(1, this.audioProfile_);
            }
            if (this.audioFormat_ != AudioFormat.PCM_L16_16KHZ_MONO.getNumber()) {
                codedOutputStream.writeEnum(2, this.audioFormat_);
            }
            if (this.audioSource_ != AudioSource.STREAM.getNumber()) {
                codedOutputStream.writeEnum(3, this.audioSource_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<SpeechSettings, Builder> implements SpeechSettingsOrBuilder {
            private Builder() {
                super(SpeechSettings.DEFAULT_INSTANCE);
            }

            public Builder clearAudioFormat() {
                copyOnWrite();
                ((SpeechSettings) this.instance).clearAudioFormat();
                return this;
            }

            public Builder clearAudioProfile() {
                copyOnWrite();
                ((SpeechSettings) this.instance).clearAudioProfile();
                return this;
            }

            public Builder clearAudioSource() {
                copyOnWrite();
                ((SpeechSettings) this.instance).clearAudioSource();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechSettingsOrBuilder
            public AudioFormat getAudioFormat() {
                return ((SpeechSettings) this.instance).getAudioFormat();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechSettingsOrBuilder
            public int getAudioFormatValue() {
                return ((SpeechSettings) this.instance).getAudioFormatValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechSettingsOrBuilder
            public AudioProfile getAudioProfile() {
                return ((SpeechSettings) this.instance).getAudioProfile();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechSettingsOrBuilder
            public int getAudioProfileValue() {
                return ((SpeechSettings) this.instance).getAudioProfileValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechSettingsOrBuilder
            public AudioSource getAudioSource() {
                return ((SpeechSettings) this.instance).getAudioSource();
            }

            @Override // com.amazon.alexa.accessory.protocol.Speech.SpeechSettingsOrBuilder
            public int getAudioSourceValue() {
                return ((SpeechSettings) this.instance).getAudioSourceValue();
            }

            public Builder setAudioFormat(AudioFormat audioFormat) {
                copyOnWrite();
                ((SpeechSettings) this.instance).setAudioFormat(audioFormat);
                return this;
            }

            public Builder setAudioFormatValue(int i) {
                copyOnWrite();
                ((SpeechSettings) this.instance).setAudioFormatValue(i);
                return this;
            }

            public Builder setAudioProfile(AudioProfile audioProfile) {
                copyOnWrite();
                ((SpeechSettings) this.instance).setAudioProfile(audioProfile);
                return this;
            }

            public Builder setAudioProfileValue(int i) {
                copyOnWrite();
                ((SpeechSettings) this.instance).setAudioProfileValue(i);
                return this;
            }

            public Builder setAudioSource(AudioSource audioSource) {
                copyOnWrite();
                ((SpeechSettings) this.instance).setAudioSource(audioSource);
                return this;
            }

            public Builder setAudioSourceValue(int i) {
                copyOnWrite();
                ((SpeechSettings) this.instance).setAudioSourceValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(SpeechSettings speechSettings) {
            return DEFAULT_INSTANCE.createBuilder(speechSettings);
        }

        public static SpeechSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SpeechSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SpeechSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SpeechSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SpeechSettings parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SpeechSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SpeechSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SpeechSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SpeechSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SpeechSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SpeechSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SpeechSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SpeechSettings parseFrom(InputStream inputStream) throws IOException {
            return (SpeechSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SpeechSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SpeechSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SpeechSettings parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SpeechSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SpeechSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SpeechSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AudioFormat implements Internal.EnumLite {
        PCM_L16_16KHZ_MONO(0),
        OPUS_16KHZ_32KBPS_CBR_0_20MS(1),
        OPUS_16KHZ_16KBPS_CBR_0_20MS(2),
        MSBC(3),
        UNRECOGNIZED(-1);

        public static final int MSBC_VALUE = 3;
        public static final int OPUS_16KHZ_16KBPS_CBR_0_20MS_VALUE = 2;
        public static final int OPUS_16KHZ_32KBPS_CBR_0_20MS_VALUE = 1;
        public static final int PCM_L16_16KHZ_MONO_VALUE = 0;
        private static final Internal.EnumLiteMap<AudioFormat> internalValueMap = new Internal.EnumLiteMap<AudioFormat>() { // from class: com.amazon.alexa.accessory.protocol.Speech.AudioFormat.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public AudioFormat findValueByNumber(int i) {
                return AudioFormat.forNumber(i);
            }
        };
        private final int value;

        AudioFormat(int i) {
            this.value = i;
        }

        public static AudioFormat forNumber(int i) {
            if (i == 0) {
                return PCM_L16_16KHZ_MONO;
            }
            if (i == 1) {
                return OPUS_16KHZ_32KBPS_CBR_0_20MS;
            }
            if (i == 2) {
                return OPUS_16KHZ_16KBPS_CBR_0_20MS;
            }
            if (i != 3) {
                return null;
            }
            return MSBC;
        }

        public static Internal.EnumLiteMap<AudioFormat> internalGetValueMap() {
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
        public static AudioFormat valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AudioProfile implements Internal.EnumLite {
        CLOSE_TALK(0),
        NEAR_FIELD(1),
        FAR_FIELD(2),
        UNRECOGNIZED(-1);

        public static final int CLOSE_TALK_VALUE = 0;
        public static final int FAR_FIELD_VALUE = 2;
        public static final int NEAR_FIELD_VALUE = 1;
        private static final Internal.EnumLiteMap<AudioProfile> internalValueMap = new Internal.EnumLiteMap<AudioProfile>() { // from class: com.amazon.alexa.accessory.protocol.Speech.AudioProfile.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public AudioProfile findValueByNumber(int i) {
                return AudioProfile.forNumber(i);
            }
        };
        private final int value;

        AudioProfile(int i) {
            this.value = i;
        }

        public static AudioProfile forNumber(int i) {
            if (i == 0) {
                return CLOSE_TALK;
            }
            if (i == 1) {
                return NEAR_FIELD;
            }
            if (i != 2) {
                return null;
            }
            return FAR_FIELD;
        }

        public static Internal.EnumLiteMap<AudioProfile> internalGetValueMap() {
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
        public static AudioProfile valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AudioSource implements Internal.EnumLite {
        STREAM(0),
        BLUETOOTH_SCO(1),
        UNRECOGNIZED(-1);

        public static final int BLUETOOTH_SCO_VALUE = 1;
        public static final int STREAM_VALUE = 0;
        private static final Internal.EnumLiteMap<AudioSource> internalValueMap = new Internal.EnumLiteMap<AudioSource>() { // from class: com.amazon.alexa.accessory.protocol.Speech.AudioSource.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public AudioSource findValueByNumber(int i) {
                return AudioSource.forNumber(i);
            }
        };
        private final int value;

        AudioSource(int i) {
            this.value = i;
        }

        public static AudioSource forNumber(int i) {
            if (i == 0) {
                return STREAM;
            }
            if (i != 1) {
                return null;
            }
            return BLUETOOTH_SCO;
        }

        public static Internal.EnumLiteMap<AudioSource> internalGetValueMap() {
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
        public static AudioSource valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SpeechState implements Internal.EnumLite {
        IDLE(0),
        LISTENING(1),
        PROCESSING(2),
        SPEAKING(3),
        UNRECOGNIZED(-1);

        public static final int IDLE_VALUE = 0;
        public static final int LISTENING_VALUE = 1;
        public static final int PROCESSING_VALUE = 2;
        public static final int SPEAKING_VALUE = 3;
        private static final Internal.EnumLiteMap<SpeechState> internalValueMap = new Internal.EnumLiteMap<SpeechState>() { // from class: com.amazon.alexa.accessory.protocol.Speech.SpeechState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SpeechState findValueByNumber(int i) {
                return SpeechState.forNumber(i);
            }
        };
        private final int value;

        SpeechState(int i) {
            this.value = i;
        }

        public static SpeechState forNumber(int i) {
            if (i == 0) {
                return IDLE;
            }
            if (i == 1) {
                return LISTENING;
            }
            if (i == 2) {
                return PROCESSING;
            }
            if (i != 3) {
                return null;
            }
            return SPEAKING;
        }

        public static Internal.EnumLiteMap<SpeechState> internalGetValueMap() {
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
        public static SpeechState valueOf(int i) {
            return forNumber(i);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
