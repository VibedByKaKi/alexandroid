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
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class Media {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.Media$1, reason: invalid class name */
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
    public interface GetPlaybackStatusOrBuilder extends MessageLiteOrBuilder {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface IssueMediaControlOrBuilder extends MessageLiteOrBuilder {
        MediaControl getControl();

        int getControlValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface MediaEventOccurredOrBuilder extends MessageLiteOrBuilder {
        MediaEvent getEvent();

        int getEventValue();

        PlaybackStatus getPlaybackStatus();

        boolean hasPlaybackStatus();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface PlaybackStatusOrBuilder extends MessageLiteOrBuilder {
        PlayStatus getStatus();

        int getStatusValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface RegisterForMediaEventsOrBuilder extends MessageLiteOrBuilder {
        boolean getPlaybackStatusChanged();
    }

    private Media() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class MediaEventOccurred extends GeneratedMessageLite<MediaEventOccurred, Builder> implements MediaEventOccurredOrBuilder {
        private static final MediaEventOccurred DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 1;
        private static volatile Parser<MediaEventOccurred> PARSER = null;
        public static final int PLAYBACK_STATUS_FIELD_NUMBER = 2;
        private int event_;
        private PlaybackStatus playbackStatus_;

        static {
            MediaEventOccurred mediaEventOccurred = new MediaEventOccurred();
            DEFAULT_INSTANCE = mediaEventOccurred;
            mediaEventOccurred.makeImmutable();
        }

        private MediaEventOccurred() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEvent() {
            this.event_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlaybackStatus() {
            this.playbackStatus_ = null;
        }

        public static MediaEventOccurred getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePlaybackStatus(PlaybackStatus playbackStatus) {
            PlaybackStatus playbackStatus2 = this.playbackStatus_;
            if (playbackStatus2 == null || playbackStatus2 == PlaybackStatus.getDefaultInstance()) {
                this.playbackStatus_ = playbackStatus;
            } else {
                this.playbackStatus_ = PlaybackStatus.newBuilder(this.playbackStatus_).mergeFrom((PlaybackStatus.Builder) playbackStatus).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static MediaEventOccurred parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MediaEventOccurred) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MediaEventOccurred parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MediaEventOccurred) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<MediaEventOccurred> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEvent(MediaEvent mediaEvent) {
            mediaEvent.getClass();
            this.event_ = mediaEvent.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventValue(int i) {
            this.event_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlaybackStatus(PlaybackStatus.Builder builder) {
            this.playbackStatus_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new MediaEventOccurred();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    MediaEventOccurred mediaEventOccurred = (MediaEventOccurred) obj2;
                    int i = this.event_;
                    boolean z = i != 0;
                    int i2 = mediaEventOccurred.event_;
                    this.event_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.playbackStatus_ = (PlaybackStatus) visitor.visitMessage(this.playbackStatus_, mediaEventOccurred.playbackStatus_);
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
                                    this.event_ = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    PlaybackStatus playbackStatus = this.playbackStatus_;
                                    PlaybackStatus.Builder builder = playbackStatus != null ? playbackStatus.toBuilder() : null;
                                    PlaybackStatus playbackStatus2 = (PlaybackStatus) codedInputStream.readMessage(PlaybackStatus.parser(), extensionRegistryLite);
                                    this.playbackStatus_ = playbackStatus2;
                                    if (builder != null) {
                                        builder.mergeFrom((PlaybackStatus.Builder) playbackStatus2);
                                        this.playbackStatus_ = builder.buildPartial();
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
                        synchronized (MediaEventOccurred.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Media.MediaEventOccurredOrBuilder
        public MediaEvent getEvent() {
            MediaEvent forNumber = MediaEvent.forNumber(this.event_);
            return forNumber == null ? MediaEvent.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Media.MediaEventOccurredOrBuilder
        public int getEventValue() {
            return this.event_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Media.MediaEventOccurredOrBuilder
        public PlaybackStatus getPlaybackStatus() {
            PlaybackStatus playbackStatus = this.playbackStatus_;
            return playbackStatus == null ? PlaybackStatus.getDefaultInstance() : playbackStatus;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.event_ != MediaEvent.MEDIA_EVENT_PLAYBACK_STATUS_CHANGED.getNumber() ? CodedOutputStream.computeEnumSize(1, this.event_) : 0;
            if (this.playbackStatus_ != null) {
                computeEnumSize += CodedOutputStream.computeMessageSize(2, getPlaybackStatus());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Media.MediaEventOccurredOrBuilder
        public boolean hasPlaybackStatus() {
            return this.playbackStatus_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.event_ != MediaEvent.MEDIA_EVENT_PLAYBACK_STATUS_CHANGED.getNumber()) {
                codedOutputStream.writeEnum(1, this.event_);
            }
            if (this.playbackStatus_ != null) {
                codedOutputStream.writeMessage(2, getPlaybackStatus());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<MediaEventOccurred, Builder> implements MediaEventOccurredOrBuilder {
            private Builder() {
                super(MediaEventOccurred.DEFAULT_INSTANCE);
            }

            public Builder clearEvent() {
                copyOnWrite();
                ((MediaEventOccurred) this.instance).clearEvent();
                return this;
            }

            public Builder clearPlaybackStatus() {
                copyOnWrite();
                ((MediaEventOccurred) this.instance).clearPlaybackStatus();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Media.MediaEventOccurredOrBuilder
            public MediaEvent getEvent() {
                return ((MediaEventOccurred) this.instance).getEvent();
            }

            @Override // com.amazon.alexa.accessory.protocol.Media.MediaEventOccurredOrBuilder
            public int getEventValue() {
                return ((MediaEventOccurred) this.instance).getEventValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Media.MediaEventOccurredOrBuilder
            public PlaybackStatus getPlaybackStatus() {
                return ((MediaEventOccurred) this.instance).getPlaybackStatus();
            }

            @Override // com.amazon.alexa.accessory.protocol.Media.MediaEventOccurredOrBuilder
            public boolean hasPlaybackStatus() {
                return ((MediaEventOccurred) this.instance).hasPlaybackStatus();
            }

            public Builder mergePlaybackStatus(PlaybackStatus playbackStatus) {
                copyOnWrite();
                ((MediaEventOccurred) this.instance).mergePlaybackStatus(playbackStatus);
                return this;
            }

            public Builder setEvent(MediaEvent mediaEvent) {
                copyOnWrite();
                ((MediaEventOccurred) this.instance).setEvent(mediaEvent);
                return this;
            }

            public Builder setEventValue(int i) {
                copyOnWrite();
                ((MediaEventOccurred) this.instance).setEventValue(i);
                return this;
            }

            public Builder setPlaybackStatus(PlaybackStatus playbackStatus) {
                copyOnWrite();
                ((MediaEventOccurred) this.instance).setPlaybackStatus(playbackStatus);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setPlaybackStatus(PlaybackStatus.Builder builder) {
                copyOnWrite();
                ((MediaEventOccurred) this.instance).setPlaybackStatus(builder);
                return this;
            }
        }

        public static Builder newBuilder(MediaEventOccurred mediaEventOccurred) {
            return DEFAULT_INSTANCE.createBuilder(mediaEventOccurred);
        }

        public static MediaEventOccurred parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MediaEventOccurred) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MediaEventOccurred parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MediaEventOccurred) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlaybackStatus(PlaybackStatus playbackStatus) {
            playbackStatus.getClass();
            this.playbackStatus_ = playbackStatus;
        }

        public static MediaEventOccurred parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MediaEventOccurred) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MediaEventOccurred parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MediaEventOccurred) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MediaEventOccurred parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MediaEventOccurred) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MediaEventOccurred parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MediaEventOccurred) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MediaEventOccurred parseFrom(InputStream inputStream) throws IOException {
            return (MediaEventOccurred) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MediaEventOccurred parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MediaEventOccurred) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MediaEventOccurred parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MediaEventOccurred) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MediaEventOccurred parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MediaEventOccurred) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetPlaybackStatus extends GeneratedMessageLite<GetPlaybackStatus, Builder> implements GetPlaybackStatusOrBuilder {
        private static final GetPlaybackStatus DEFAULT_INSTANCE;
        private static volatile Parser<GetPlaybackStatus> PARSER;

        static {
            GetPlaybackStatus getPlaybackStatus = new GetPlaybackStatus();
            DEFAULT_INSTANCE = getPlaybackStatus;
            getPlaybackStatus.makeImmutable();
        }

        private GetPlaybackStatus() {
        }

        public static GetPlaybackStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetPlaybackStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetPlaybackStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetPlaybackStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetPlaybackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetPlaybackStatus> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetPlaybackStatus();
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
                        synchronized (GetPlaybackStatus.class) {
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
        public static final class Builder extends GeneratedMessageLite.Builder<GetPlaybackStatus, Builder> implements GetPlaybackStatusOrBuilder {
            private Builder() {
                super(GetPlaybackStatus.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(GetPlaybackStatus getPlaybackStatus) {
            return DEFAULT_INSTANCE.createBuilder(getPlaybackStatus);
        }

        public static GetPlaybackStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetPlaybackStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetPlaybackStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetPlaybackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetPlaybackStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetPlaybackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetPlaybackStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetPlaybackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetPlaybackStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetPlaybackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetPlaybackStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetPlaybackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetPlaybackStatus parseFrom(InputStream inputStream) throws IOException {
            return (GetPlaybackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetPlaybackStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetPlaybackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetPlaybackStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetPlaybackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetPlaybackStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetPlaybackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class IssueMediaControl extends GeneratedMessageLite<IssueMediaControl, Builder> implements IssueMediaControlOrBuilder {
        public static final int CONTROL_FIELD_NUMBER = 1;
        private static final IssueMediaControl DEFAULT_INSTANCE;
        private static volatile Parser<IssueMediaControl> PARSER;
        private int control_;

        static {
            IssueMediaControl issueMediaControl = new IssueMediaControl();
            DEFAULT_INSTANCE = issueMediaControl;
            issueMediaControl.makeImmutable();
        }

        private IssueMediaControl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearControl() {
            this.control_ = 0;
        }

        public static IssueMediaControl getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IssueMediaControl parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (IssueMediaControl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IssueMediaControl parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (IssueMediaControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<IssueMediaControl> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControl(MediaControl mediaControl) {
            mediaControl.getClass();
            this.control_ = mediaControl.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControlValue(int i) {
            this.control_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new IssueMediaControl();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    IssueMediaControl issueMediaControl = (IssueMediaControl) obj2;
                    int i = this.control_;
                    boolean z = i != 0;
                    int i2 = issueMediaControl.control_;
                    this.control_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    this.control_ = codedInputStream.readEnum();
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
                        synchronized (IssueMediaControl.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Media.IssueMediaControlOrBuilder
        public MediaControl getControl() {
            MediaControl forNumber = MediaControl.forNumber(this.control_);
            return forNumber == null ? MediaControl.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Media.IssueMediaControlOrBuilder
        public int getControlValue() {
            return this.control_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.control_ != MediaControl.PLAY.getNumber() ? CodedOutputStream.computeEnumSize(1, this.control_) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.control_ != MediaControl.PLAY.getNumber()) {
                codedOutputStream.writeEnum(1, this.control_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<IssueMediaControl, Builder> implements IssueMediaControlOrBuilder {
            private Builder() {
                super(IssueMediaControl.DEFAULT_INSTANCE);
            }

            public Builder clearControl() {
                copyOnWrite();
                ((IssueMediaControl) this.instance).clearControl();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Media.IssueMediaControlOrBuilder
            public MediaControl getControl() {
                return ((IssueMediaControl) this.instance).getControl();
            }

            @Override // com.amazon.alexa.accessory.protocol.Media.IssueMediaControlOrBuilder
            public int getControlValue() {
                return ((IssueMediaControl) this.instance).getControlValue();
            }

            public Builder setControl(MediaControl mediaControl) {
                copyOnWrite();
                ((IssueMediaControl) this.instance).setControl(mediaControl);
                return this;
            }

            public Builder setControlValue(int i) {
                copyOnWrite();
                ((IssueMediaControl) this.instance).setControlValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(IssueMediaControl issueMediaControl) {
            return DEFAULT_INSTANCE.createBuilder(issueMediaControl);
        }

        public static IssueMediaControl parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (IssueMediaControl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static IssueMediaControl parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (IssueMediaControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static IssueMediaControl parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (IssueMediaControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static IssueMediaControl parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (IssueMediaControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static IssueMediaControl parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (IssueMediaControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IssueMediaControl parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (IssueMediaControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static IssueMediaControl parseFrom(InputStream inputStream) throws IOException {
            return (IssueMediaControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IssueMediaControl parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (IssueMediaControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static IssueMediaControl parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (IssueMediaControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static IssueMediaControl parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (IssueMediaControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class PlaybackStatus extends GeneratedMessageLite<PlaybackStatus, Builder> implements PlaybackStatusOrBuilder {
        private static final PlaybackStatus DEFAULT_INSTANCE;
        private static volatile Parser<PlaybackStatus> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 1;
        private int status_;

        static {
            PlaybackStatus playbackStatus = new PlaybackStatus();
            DEFAULT_INSTANCE = playbackStatus;
            playbackStatus.makeImmutable();
        }

        private PlaybackStatus() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = 0;
        }

        public static PlaybackStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PlaybackStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PlaybackStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlaybackStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PlaybackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PlaybackStatus> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(PlayStatus playStatus) {
            playStatus.getClass();
            this.status_ = playStatus.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusValue(int i) {
            this.status_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new PlaybackStatus();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    PlaybackStatus playbackStatus = (PlaybackStatus) obj2;
                    int i = this.status_;
                    boolean z = i != 0;
                    int i2 = playbackStatus.status_;
                    this.status_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    this.status_ = codedInputStream.readEnum();
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
                        synchronized (PlaybackStatus.class) {
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
            int serializedSize = this.unknownFields.getSerializedSize() + (this.status_ != PlayStatus.MEDIA_PLAY_STATUS_UNKNOWN.getNumber() ? CodedOutputStream.computeEnumSize(1, this.status_) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Media.PlaybackStatusOrBuilder
        public PlayStatus getStatus() {
            PlayStatus forNumber = PlayStatus.forNumber(this.status_);
            return forNumber == null ? PlayStatus.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Media.PlaybackStatusOrBuilder
        public int getStatusValue() {
            return this.status_;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.status_ != PlayStatus.MEDIA_PLAY_STATUS_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.status_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<PlaybackStatus, Builder> implements PlaybackStatusOrBuilder {
            private Builder() {
                super(PlaybackStatus.DEFAULT_INSTANCE);
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((PlaybackStatus) this.instance).clearStatus();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Media.PlaybackStatusOrBuilder
            public PlayStatus getStatus() {
                return ((PlaybackStatus) this.instance).getStatus();
            }

            @Override // com.amazon.alexa.accessory.protocol.Media.PlaybackStatusOrBuilder
            public int getStatusValue() {
                return ((PlaybackStatus) this.instance).getStatusValue();
            }

            public Builder setStatus(PlayStatus playStatus) {
                copyOnWrite();
                ((PlaybackStatus) this.instance).setStatus(playStatus);
                return this;
            }

            public Builder setStatusValue(int i) {
                copyOnWrite();
                ((PlaybackStatus) this.instance).setStatusValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(PlaybackStatus playbackStatus) {
            return DEFAULT_INSTANCE.createBuilder(playbackStatus);
        }

        public static PlaybackStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PlaybackStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PlaybackStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PlaybackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PlaybackStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PlaybackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PlaybackStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PlaybackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PlaybackStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PlaybackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PlaybackStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PlaybackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PlaybackStatus parseFrom(InputStream inputStream) throws IOException {
            return (PlaybackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlaybackStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PlaybackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PlaybackStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PlaybackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PlaybackStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PlaybackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class RegisterForMediaEvents extends GeneratedMessageLite<RegisterForMediaEvents, Builder> implements RegisterForMediaEventsOrBuilder {
        private static final RegisterForMediaEvents DEFAULT_INSTANCE;
        private static volatile Parser<RegisterForMediaEvents> PARSER = null;
        public static final int PLAYBACK_STATUS_CHANGED_FIELD_NUMBER = 1;
        private boolean playbackStatusChanged_;

        static {
            RegisterForMediaEvents registerForMediaEvents = new RegisterForMediaEvents();
            DEFAULT_INSTANCE = registerForMediaEvents;
            registerForMediaEvents.makeImmutable();
        }

        private RegisterForMediaEvents() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlaybackStatusChanged() {
            this.playbackStatusChanged_ = false;
        }

        public static RegisterForMediaEvents getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RegisterForMediaEvents parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RegisterForMediaEvents) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RegisterForMediaEvents parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RegisterForMediaEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RegisterForMediaEvents> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlaybackStatusChanged(boolean z) {
            this.playbackStatusChanged_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RegisterForMediaEvents();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    boolean z = this.playbackStatusChanged_;
                    boolean z2 = ((RegisterForMediaEvents) obj2).playbackStatusChanged_;
                    this.playbackStatusChanged_ = ((GeneratedMessageLite.Visitor) obj).visitBoolean(z, z, z2, z2);
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
                                    this.playbackStatusChanged_ = codedInputStream.readBool();
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
                        synchronized (RegisterForMediaEvents.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Media.RegisterForMediaEventsOrBuilder
        public boolean getPlaybackStatusChanged() {
            return this.playbackStatusChanged_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            boolean z = this.playbackStatusChanged_;
            int serializedSize = this.unknownFields.getSerializedSize() + (z ? CodedOutputStream.computeBoolSize(1, z) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            boolean z = this.playbackStatusChanged_;
            if (z) {
                codedOutputStream.writeBool(1, z);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<RegisterForMediaEvents, Builder> implements RegisterForMediaEventsOrBuilder {
            private Builder() {
                super(RegisterForMediaEvents.DEFAULT_INSTANCE);
            }

            public Builder clearPlaybackStatusChanged() {
                copyOnWrite();
                ((RegisterForMediaEvents) this.instance).clearPlaybackStatusChanged();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Media.RegisterForMediaEventsOrBuilder
            public boolean getPlaybackStatusChanged() {
                return ((RegisterForMediaEvents) this.instance).getPlaybackStatusChanged();
            }

            public Builder setPlaybackStatusChanged(boolean z) {
                copyOnWrite();
                ((RegisterForMediaEvents) this.instance).setPlaybackStatusChanged(z);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(RegisterForMediaEvents registerForMediaEvents) {
            return DEFAULT_INSTANCE.createBuilder(registerForMediaEvents);
        }

        public static RegisterForMediaEvents parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RegisterForMediaEvents) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RegisterForMediaEvents parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RegisterForMediaEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RegisterForMediaEvents parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RegisterForMediaEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RegisterForMediaEvents parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RegisterForMediaEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RegisterForMediaEvents parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RegisterForMediaEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RegisterForMediaEvents parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RegisterForMediaEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RegisterForMediaEvents parseFrom(InputStream inputStream) throws IOException {
            return (RegisterForMediaEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RegisterForMediaEvents parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RegisterForMediaEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RegisterForMediaEvents parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RegisterForMediaEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RegisterForMediaEvents parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RegisterForMediaEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum MediaControl implements Internal.EnumLite {
        PLAY(0),
        PAUSE(1),
        NEXT(2),
        PREVIOUS(3),
        PLAY_PAUSE(4),
        UNRECOGNIZED(-1);

        public static final int NEXT_VALUE = 2;
        public static final int PAUSE_VALUE = 1;
        public static final int PLAY_PAUSE_VALUE = 4;
        public static final int PLAY_VALUE = 0;
        public static final int PREVIOUS_VALUE = 3;
        private static final Internal.EnumLiteMap<MediaControl> internalValueMap = new Internal.EnumLiteMap<MediaControl>() { // from class: com.amazon.alexa.accessory.protocol.Media.MediaControl.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public MediaControl findValueByNumber(int i) {
                return MediaControl.forNumber(i);
            }
        };
        private final int value;

        MediaControl(int i) {
            this.value = i;
        }

        public static MediaControl forNumber(int i) {
            if (i == 0) {
                return PLAY;
            }
            if (i == 1) {
                return PAUSE;
            }
            if (i == 2) {
                return NEXT;
            }
            if (i == 3) {
                return PREVIOUS;
            }
            if (i != 4) {
                return null;
            }
            return PLAY_PAUSE;
        }

        public static Internal.EnumLiteMap<MediaControl> internalGetValueMap() {
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
        public static MediaControl valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum MediaEvent implements Internal.EnumLite {
        MEDIA_EVENT_PLAYBACK_STATUS_CHANGED(0),
        UNRECOGNIZED(-1);

        public static final int MEDIA_EVENT_PLAYBACK_STATUS_CHANGED_VALUE = 0;
        private static final Internal.EnumLiteMap<MediaEvent> internalValueMap = new Internal.EnumLiteMap<MediaEvent>() { // from class: com.amazon.alexa.accessory.protocol.Media.MediaEvent.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public MediaEvent findValueByNumber(int i) {
                return MediaEvent.forNumber(i);
            }
        };
        private final int value;

        MediaEvent(int i) {
            this.value = i;
        }

        public static MediaEvent forNumber(int i) {
            if (i != 0) {
                return null;
            }
            return MEDIA_EVENT_PLAYBACK_STATUS_CHANGED;
        }

        public static Internal.EnumLiteMap<MediaEvent> internalGetValueMap() {
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
        public static MediaEvent valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum PlayStatus implements Internal.EnumLite {
        MEDIA_PLAY_STATUS_UNKNOWN(0),
        MEDIA_PLAY_STATUS_STOPPED(1),
        MEDIA_PLAY_STATUS_PLAYING(2),
        MEDIA_PLAY_STATUS_PAUSED(3),
        MEDIA_PLAY_STATUS_FWD_SEEK(4),
        MEDIA_PLAY_STATUS_REV_SEEK(5),
        MEDIA_PLAY_STATUS_ERROR(6),
        UNRECOGNIZED(-1);

        public static final int MEDIA_PLAY_STATUS_ERROR_VALUE = 6;
        public static final int MEDIA_PLAY_STATUS_FWD_SEEK_VALUE = 4;
        public static final int MEDIA_PLAY_STATUS_PAUSED_VALUE = 3;
        public static final int MEDIA_PLAY_STATUS_PLAYING_VALUE = 2;
        public static final int MEDIA_PLAY_STATUS_REV_SEEK_VALUE = 5;
        public static final int MEDIA_PLAY_STATUS_STOPPED_VALUE = 1;
        public static final int MEDIA_PLAY_STATUS_UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<PlayStatus> internalValueMap = new Internal.EnumLiteMap<PlayStatus>() { // from class: com.amazon.alexa.accessory.protocol.Media.PlayStatus.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public PlayStatus findValueByNumber(int i) {
                return PlayStatus.forNumber(i);
            }
        };
        private final int value;

        PlayStatus(int i) {
            this.value = i;
        }

        public static PlayStatus forNumber(int i) {
            switch (i) {
                case 0:
                    return MEDIA_PLAY_STATUS_UNKNOWN;
                case 1:
                    return MEDIA_PLAY_STATUS_STOPPED;
                case 2:
                    return MEDIA_PLAY_STATUS_PLAYING;
                case 3:
                    return MEDIA_PLAY_STATUS_PAUSED;
                case 4:
                    return MEDIA_PLAY_STATUS_FWD_SEEK;
                case 5:
                    return MEDIA_PLAY_STATUS_REV_SEEK;
                case 6:
                    return MEDIA_PLAY_STATUS_ERROR;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<PlayStatus> internalGetValueMap() {
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
        public static PlayStatus valueOf(int i) {
            return forNumber(i);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
