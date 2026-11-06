package com.amazon.alexa.accessory.protocol;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
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
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class Notification {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.protocol.Notification$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$Notification$NotificationActionPayload$ActionPayloadTypesCase;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$Notification$NotificationPayload$PayloadTypesCase;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[NotificationActionPayload.ActionPayloadTypesCase.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$Notification$NotificationActionPayload$ActionPayloadTypesCase = iArr;
            try {
                iArr[NotificationActionPayload.ActionPayloadTypesCase.GENERAL_NOTIFICATION_ACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Notification$NotificationActionPayload$ActionPayloadTypesCase[NotificationActionPayload.ActionPayloadTypesCase.CALENDAR_NOTIFICATION_ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Notification$NotificationActionPayload$ActionPayloadTypesCase[NotificationActionPayload.ActionPayloadTypesCase.ACTIONPAYLOADTYPES_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[NotificationPayload.PayloadTypesCase.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$Notification$NotificationPayload$PayloadTypesCase = iArr2;
            try {
                iArr2[NotificationPayload.PayloadTypesCase.GENERAL_NOTIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Notification$NotificationPayload$PayloadTypesCase[NotificationPayload.PayloadTypesCase.CALENDAR_NOTIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Notification$NotificationPayload$PayloadTypesCase[NotificationPayload.PayloadTypesCase.PAYLOADTYPES_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr3;
            try {
                iArr3[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 10;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AddNotificationOrBuilder extends MessageLiteOrBuilder {
        NotificationContent getNotificationContent();

        int getNotificationUid();

        boolean hasNotificationContent();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CalendarNotificationActionPayloadOrBuilder extends MessageLiteOrBuilder {
        CalendarNotificationActionPayload.CalendarNotificationActionType getActionType();

        int getActionTypeValue();

        int getRemindInSeconds();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CalendarNotificationPayloadOrBuilder extends MessageLiteOrBuilder {
        String getLocation();

        ByteString getLocationBytes();

        String getNotificationMessage();

        ByteString getNotificationMessageBytes();

        String getTime();

        ByteString getTimeBytes();

        String getTitle();

        ByteString getTitleBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ExecuteNotificationActionOrBuilder extends MessageLiteOrBuilder {
        NotificationActionPayload getAction();

        int getNotificationUid();

        boolean hasAction();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GeneralNotificationActionPayloadOrBuilder extends MessageLiteOrBuilder {
        GeneralNotificationActionPayload.GeneralNotificationActionType getActionType();

        int getActionTypeValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GeneralNotificationPayloadOrBuilder extends MessageLiteOrBuilder {
        String getNotificationMessage();

        ByteString getNotificationMessageBytes();

        String getSubtitle();

        ByteString getSubtitleBytes();

        String getTitle();

        ByteString getTitleBytes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NotificationActionPayloadOrBuilder extends MessageLiteOrBuilder {
        NotificationActionPayload.ActionPayloadTypesCase getActionPayloadTypesCase();

        CalendarNotificationActionPayload getCalendarNotificationAction();

        GeneralNotificationActionPayload getGeneralNotificationAction();

        boolean hasCalendarNotificationAction();

        boolean hasGeneralNotificationAction();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NotificationContentOrBuilder extends MessageLiteOrBuilder {
        NotificationContent.NotificationImportance getNotificationImportance();

        int getNotificationImportanceValue();

        NotificationPayload getNotificationPayload();

        int getTimeToLiveMilliseconds();

        int getTimestampMillisecondsHi();

        int getTimestampMillisecondsLo();

        boolean hasNotificationPayload();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NotificationPayloadOrBuilder extends MessageLiteOrBuilder {
        CalendarNotificationPayload getCalendarNotification();

        GeneralNotificationPayload getGeneralNotification();

        NotificationPayload.PayloadTypesCase getPayloadTypesCase();

        boolean hasCalendarNotification();

        boolean hasGeneralNotification();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface RemoveNotificationOrBuilder extends MessageLiteOrBuilder {
        int getNotificationUid();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface UpdateNotificationOrBuilder extends MessageLiteOrBuilder {
        NotificationContent getNotificationContent();

        int getNotificationUid();

        boolean hasNotificationContent();
    }

    private Notification() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AddNotification extends GeneratedMessageLite<AddNotification, Builder> implements AddNotificationOrBuilder {
        private static final AddNotification DEFAULT_INSTANCE;
        public static final int NOTIFICATION_CONTENT_FIELD_NUMBER = 2;
        public static final int NOTIFICATION_UID_FIELD_NUMBER = 1;
        private static volatile Parser<AddNotification> PARSER;
        private NotificationContent notificationContent_;
        private int notificationUid_;

        static {
            AddNotification addNotification = new AddNotification();
            DEFAULT_INSTANCE = addNotification;
            addNotification.makeImmutable();
        }

        private AddNotification() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotificationContent() {
            this.notificationContent_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotificationUid() {
            this.notificationUid_ = 0;
        }

        public static AddNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNotificationContent(NotificationContent notificationContent) {
            NotificationContent notificationContent2 = this.notificationContent_;
            if (notificationContent2 == null || notificationContent2 == NotificationContent.getDefaultInstance()) {
                this.notificationContent_ = notificationContent;
            } else {
                this.notificationContent_ = NotificationContent.newBuilder(this.notificationContent_).mergeFrom((NotificationContent.Builder) notificationContent).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AddNotification parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AddNotification) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AddNotification parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AddNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AddNotification> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotificationContent(NotificationContent.Builder builder) {
            this.notificationContent_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotificationUid(int i) {
            this.notificationUid_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AddNotification();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    AddNotification addNotification = (AddNotification) obj2;
                    int i = this.notificationUid_;
                    boolean z = i != 0;
                    int i2 = addNotification.notificationUid_;
                    this.notificationUid_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.notificationContent_ = (NotificationContent) visitor.visitMessage(this.notificationContent_, addNotification.notificationContent_);
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
                                    this.notificationUid_ = codedInputStream.readUInt32();
                                } else if (readTag == 18) {
                                    NotificationContent notificationContent = this.notificationContent_;
                                    NotificationContent.Builder builder = notificationContent != null ? notificationContent.toBuilder() : null;
                                    NotificationContent notificationContent2 = (NotificationContent) codedInputStream.readMessage(NotificationContent.parser(), extensionRegistryLite);
                                    this.notificationContent_ = notificationContent2;
                                    if (builder != null) {
                                        builder.mergeFrom((NotificationContent.Builder) notificationContent2);
                                        this.notificationContent_ = builder.buildPartial();
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
                        synchronized (AddNotification.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Notification.AddNotificationOrBuilder
        public NotificationContent getNotificationContent() {
            NotificationContent notificationContent = this.notificationContent_;
            return notificationContent == null ? NotificationContent.getDefaultInstance() : notificationContent;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.AddNotificationOrBuilder
        public int getNotificationUid() {
            return this.notificationUid_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.notificationUid_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            if (this.notificationContent_ != null) {
                computeUInt32Size += CodedOutputStream.computeMessageSize(2, getNotificationContent());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.AddNotificationOrBuilder
        public boolean hasNotificationContent() {
            return this.notificationContent_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.notificationUid_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            if (this.notificationContent_ != null) {
                codedOutputStream.writeMessage(2, getNotificationContent());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<AddNotification, Builder> implements AddNotificationOrBuilder {
            private Builder() {
                super(AddNotification.DEFAULT_INSTANCE);
            }

            public Builder clearNotificationContent() {
                copyOnWrite();
                ((AddNotification) this.instance).clearNotificationContent();
                return this;
            }

            public Builder clearNotificationUid() {
                copyOnWrite();
                ((AddNotification) this.instance).clearNotificationUid();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.AddNotificationOrBuilder
            public NotificationContent getNotificationContent() {
                return ((AddNotification) this.instance).getNotificationContent();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.AddNotificationOrBuilder
            public int getNotificationUid() {
                return ((AddNotification) this.instance).getNotificationUid();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.AddNotificationOrBuilder
            public boolean hasNotificationContent() {
                return ((AddNotification) this.instance).hasNotificationContent();
            }

            public Builder mergeNotificationContent(NotificationContent notificationContent) {
                copyOnWrite();
                ((AddNotification) this.instance).mergeNotificationContent(notificationContent);
                return this;
            }

            public Builder setNotificationContent(NotificationContent notificationContent) {
                copyOnWrite();
                ((AddNotification) this.instance).setNotificationContent(notificationContent);
                return this;
            }

            public Builder setNotificationUid(int i) {
                copyOnWrite();
                ((AddNotification) this.instance).setNotificationUid(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setNotificationContent(NotificationContent.Builder builder) {
                copyOnWrite();
                ((AddNotification) this.instance).setNotificationContent(builder);
                return this;
            }
        }

        public static Builder newBuilder(AddNotification addNotification) {
            return DEFAULT_INSTANCE.createBuilder(addNotification);
        }

        public static AddNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AddNotification) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AddNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AddNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotificationContent(NotificationContent notificationContent) {
            notificationContent.getClass();
            this.notificationContent_ = notificationContent;
        }

        public static AddNotification parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AddNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AddNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AddNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AddNotification parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AddNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AddNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AddNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AddNotification parseFrom(InputStream inputStream) throws IOException {
            return (AddNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AddNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AddNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AddNotification parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AddNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AddNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AddNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ExecuteNotificationAction extends GeneratedMessageLite<ExecuteNotificationAction, Builder> implements ExecuteNotificationActionOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 2;
        private static final ExecuteNotificationAction DEFAULT_INSTANCE;
        public static final int NOTIFICATION_UID_FIELD_NUMBER = 1;
        private static volatile Parser<ExecuteNotificationAction> PARSER;
        private NotificationActionPayload action_;
        private int notificationUid_;

        static {
            ExecuteNotificationAction executeNotificationAction = new ExecuteNotificationAction();
            DEFAULT_INSTANCE = executeNotificationAction;
            executeNotificationAction.makeImmutable();
        }

        private ExecuteNotificationAction() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotificationUid() {
            this.notificationUid_ = 0;
        }

        public static ExecuteNotificationAction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAction(NotificationActionPayload notificationActionPayload) {
            NotificationActionPayload notificationActionPayload2 = this.action_;
            if (notificationActionPayload2 == null || notificationActionPayload2 == NotificationActionPayload.getDefaultInstance()) {
                this.action_ = notificationActionPayload;
            } else {
                this.action_ = NotificationActionPayload.newBuilder(this.action_).mergeFrom((NotificationActionPayload.Builder) notificationActionPayload).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ExecuteNotificationAction parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ExecuteNotificationAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExecuteNotificationAction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ExecuteNotificationAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ExecuteNotificationAction> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(NotificationActionPayload.Builder builder) {
            this.action_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotificationUid(int i) {
            this.notificationUid_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ExecuteNotificationAction();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    ExecuteNotificationAction executeNotificationAction = (ExecuteNotificationAction) obj2;
                    int i = this.notificationUid_;
                    boolean z = i != 0;
                    int i2 = executeNotificationAction.notificationUid_;
                    this.notificationUid_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.action_ = (NotificationActionPayload) visitor.visitMessage(this.action_, executeNotificationAction.action_);
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
                                    this.notificationUid_ = codedInputStream.readUInt32();
                                } else if (readTag == 18) {
                                    NotificationActionPayload notificationActionPayload = this.action_;
                                    NotificationActionPayload.Builder builder = notificationActionPayload != null ? notificationActionPayload.toBuilder() : null;
                                    NotificationActionPayload notificationActionPayload2 = (NotificationActionPayload) codedInputStream.readMessage(NotificationActionPayload.parser(), extensionRegistryLite);
                                    this.action_ = notificationActionPayload2;
                                    if (builder != null) {
                                        builder.mergeFrom((NotificationActionPayload.Builder) notificationActionPayload2);
                                        this.action_ = builder.buildPartial();
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
                        synchronized (ExecuteNotificationAction.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Notification.ExecuteNotificationActionOrBuilder
        public NotificationActionPayload getAction() {
            NotificationActionPayload notificationActionPayload = this.action_;
            return notificationActionPayload == null ? NotificationActionPayload.getDefaultInstance() : notificationActionPayload;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.ExecuteNotificationActionOrBuilder
        public int getNotificationUid() {
            return this.notificationUid_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.notificationUid_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            if (this.action_ != null) {
                computeUInt32Size += CodedOutputStream.computeMessageSize(2, getAction());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.ExecuteNotificationActionOrBuilder
        public boolean hasAction() {
            return this.action_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.notificationUid_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            if (this.action_ != null) {
                codedOutputStream.writeMessage(2, getAction());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<ExecuteNotificationAction, Builder> implements ExecuteNotificationActionOrBuilder {
            private Builder() {
                super(ExecuteNotificationAction.DEFAULT_INSTANCE);
            }

            public Builder clearAction() {
                copyOnWrite();
                ((ExecuteNotificationAction) this.instance).clearAction();
                return this;
            }

            public Builder clearNotificationUid() {
                copyOnWrite();
                ((ExecuteNotificationAction) this.instance).clearNotificationUid();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.ExecuteNotificationActionOrBuilder
            public NotificationActionPayload getAction() {
                return ((ExecuteNotificationAction) this.instance).getAction();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.ExecuteNotificationActionOrBuilder
            public int getNotificationUid() {
                return ((ExecuteNotificationAction) this.instance).getNotificationUid();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.ExecuteNotificationActionOrBuilder
            public boolean hasAction() {
                return ((ExecuteNotificationAction) this.instance).hasAction();
            }

            public Builder mergeAction(NotificationActionPayload notificationActionPayload) {
                copyOnWrite();
                ((ExecuteNotificationAction) this.instance).mergeAction(notificationActionPayload);
                return this;
            }

            public Builder setAction(NotificationActionPayload notificationActionPayload) {
                copyOnWrite();
                ((ExecuteNotificationAction) this.instance).setAction(notificationActionPayload);
                return this;
            }

            public Builder setNotificationUid(int i) {
                copyOnWrite();
                ((ExecuteNotificationAction) this.instance).setNotificationUid(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setAction(NotificationActionPayload.Builder builder) {
                copyOnWrite();
                ((ExecuteNotificationAction) this.instance).setAction(builder);
                return this;
            }
        }

        public static Builder newBuilder(ExecuteNotificationAction executeNotificationAction) {
            return DEFAULT_INSTANCE.createBuilder(executeNotificationAction);
        }

        public static ExecuteNotificationAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExecuteNotificationAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ExecuteNotificationAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExecuteNotificationAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(NotificationActionPayload notificationActionPayload) {
            notificationActionPayload.getClass();
            this.action_ = notificationActionPayload;
        }

        public static ExecuteNotificationAction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ExecuteNotificationAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ExecuteNotificationAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExecuteNotificationAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ExecuteNotificationAction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ExecuteNotificationAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExecuteNotificationAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExecuteNotificationAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ExecuteNotificationAction parseFrom(InputStream inputStream) throws IOException {
            return (ExecuteNotificationAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExecuteNotificationAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExecuteNotificationAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ExecuteNotificationAction parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ExecuteNotificationAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ExecuteNotificationAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExecuteNotificationAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotificationActionPayload extends GeneratedMessageLite<NotificationActionPayload, Builder> implements NotificationActionPayloadOrBuilder {
        public static final int CALENDAR_NOTIFICATION_ACTION_FIELD_NUMBER = 2;
        private static final NotificationActionPayload DEFAULT_INSTANCE;
        public static final int GENERAL_NOTIFICATION_ACTION_FIELD_NUMBER = 1;
        private static volatile Parser<NotificationActionPayload> PARSER;
        private int actionPayloadTypesCase_ = 0;
        private Object actionPayloadTypes_;

        static {
            NotificationActionPayload notificationActionPayload = new NotificationActionPayload();
            DEFAULT_INSTANCE = notificationActionPayload;
            notificationActionPayload.makeImmutable();
        }

        private NotificationActionPayload() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActionPayloadTypes() {
            this.actionPayloadTypesCase_ = 0;
            this.actionPayloadTypes_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCalendarNotificationAction() {
            if (this.actionPayloadTypesCase_ == 2) {
                this.actionPayloadTypesCase_ = 0;
                this.actionPayloadTypes_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGeneralNotificationAction() {
            if (this.actionPayloadTypesCase_ == 1) {
                this.actionPayloadTypesCase_ = 0;
                this.actionPayloadTypes_ = null;
            }
        }

        public static NotificationActionPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCalendarNotificationAction(CalendarNotificationActionPayload calendarNotificationActionPayload) {
            if (this.actionPayloadTypesCase_ != 2 || this.actionPayloadTypes_ == CalendarNotificationActionPayload.getDefaultInstance()) {
                this.actionPayloadTypes_ = calendarNotificationActionPayload;
            } else {
                this.actionPayloadTypes_ = CalendarNotificationActionPayload.newBuilder((CalendarNotificationActionPayload) this.actionPayloadTypes_).mergeFrom((CalendarNotificationActionPayload.Builder) calendarNotificationActionPayload).buildPartial();
            }
            this.actionPayloadTypesCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGeneralNotificationAction(GeneralNotificationActionPayload generalNotificationActionPayload) {
            if (this.actionPayloadTypesCase_ != 1 || this.actionPayloadTypes_ == GeneralNotificationActionPayload.getDefaultInstance()) {
                this.actionPayloadTypes_ = generalNotificationActionPayload;
            } else {
                this.actionPayloadTypes_ = GeneralNotificationActionPayload.newBuilder((GeneralNotificationActionPayload) this.actionPayloadTypes_).mergeFrom((GeneralNotificationActionPayload.Builder) generalNotificationActionPayload).buildPartial();
            }
            this.actionPayloadTypesCase_ = 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotificationActionPayload parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NotificationActionPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotificationActionPayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NotificationActionPayload> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCalendarNotificationAction(CalendarNotificationActionPayload.Builder builder) {
            this.actionPayloadTypes_ = builder.build();
            this.actionPayloadTypesCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGeneralNotificationAction(GeneralNotificationActionPayload.Builder builder) {
            this.actionPayloadTypes_ = builder.build();
            this.actionPayloadTypesCase_ = 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NotificationActionPayload();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    NotificationActionPayload notificationActionPayload = (NotificationActionPayload) obj2;
                    int i2 = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Notification$NotificationActionPayload$ActionPayloadTypesCase[notificationActionPayload.getActionPayloadTypesCase().ordinal()];
                    if (i2 == 1) {
                        this.actionPayloadTypes_ = visitor.visitOneofMessage(this.actionPayloadTypesCase_ == 1, this.actionPayloadTypes_, notificationActionPayload.actionPayloadTypes_);
                    } else if (i2 == 2) {
                        this.actionPayloadTypes_ = visitor.visitOneofMessage(this.actionPayloadTypesCase_ == 2, this.actionPayloadTypes_, notificationActionPayload.actionPayloadTypes_);
                    } else if (i2 == 3) {
                        visitor.visitOneofNotSet(this.actionPayloadTypesCase_ != 0);
                    }
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE && (i = notificationActionPayload.actionPayloadTypesCase_) != 0) {
                        this.actionPayloadTypesCase_ = i;
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
                                    GeneralNotificationActionPayload.Builder builder = this.actionPayloadTypesCase_ == 1 ? ((GeneralNotificationActionPayload) this.actionPayloadTypes_).toBuilder() : null;
                                    MessageLite readMessage = codedInputStream.readMessage(GeneralNotificationActionPayload.parser(), extensionRegistryLite);
                                    this.actionPayloadTypes_ = readMessage;
                                    if (builder != null) {
                                        builder.mergeFrom((GeneralNotificationActionPayload.Builder) readMessage);
                                        this.actionPayloadTypes_ = builder.buildPartial();
                                    }
                                    this.actionPayloadTypesCase_ = 1;
                                } else if (readTag == 18) {
                                    CalendarNotificationActionPayload.Builder builder2 = this.actionPayloadTypesCase_ == 2 ? ((CalendarNotificationActionPayload) this.actionPayloadTypes_).toBuilder() : null;
                                    MessageLite readMessage2 = codedInputStream.readMessage(CalendarNotificationActionPayload.parser(), extensionRegistryLite);
                                    this.actionPayloadTypes_ = readMessage2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((CalendarNotificationActionPayload.Builder) readMessage2);
                                        this.actionPayloadTypes_ = builder2.buildPartial();
                                    }
                                    this.actionPayloadTypesCase_ = 2;
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
                        synchronized (NotificationActionPayload.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationActionPayloadOrBuilder
        public ActionPayloadTypesCase getActionPayloadTypesCase() {
            return ActionPayloadTypesCase.forNumber(this.actionPayloadTypesCase_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationActionPayloadOrBuilder
        public CalendarNotificationActionPayload getCalendarNotificationAction() {
            return this.actionPayloadTypesCase_ == 2 ? (CalendarNotificationActionPayload) this.actionPayloadTypes_ : CalendarNotificationActionPayload.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationActionPayloadOrBuilder
        public GeneralNotificationActionPayload getGeneralNotificationAction() {
            return this.actionPayloadTypesCase_ == 1 ? (GeneralNotificationActionPayload) this.actionPayloadTypes_ : GeneralNotificationActionPayload.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.actionPayloadTypesCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (GeneralNotificationActionPayload) this.actionPayloadTypes_) : 0;
            if (this.actionPayloadTypesCase_ == 2) {
                computeMessageSize += CodedOutputStream.computeMessageSize(2, (CalendarNotificationActionPayload) this.actionPayloadTypes_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationActionPayloadOrBuilder
        public boolean hasCalendarNotificationAction() {
            return this.actionPayloadTypesCase_ == 2;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationActionPayloadOrBuilder
        public boolean hasGeneralNotificationAction() {
            return this.actionPayloadTypesCase_ == 1;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.actionPayloadTypesCase_ == 1) {
                codedOutputStream.writeMessage(1, (GeneralNotificationActionPayload) this.actionPayloadTypes_);
            }
            if (this.actionPayloadTypesCase_ == 2) {
                codedOutputStream.writeMessage(2, (CalendarNotificationActionPayload) this.actionPayloadTypes_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NotificationActionPayload, Builder> implements NotificationActionPayloadOrBuilder {
            private Builder() {
                super(NotificationActionPayload.DEFAULT_INSTANCE);
            }

            public Builder clearActionPayloadTypes() {
                copyOnWrite();
                ((NotificationActionPayload) this.instance).clearActionPayloadTypes();
                return this;
            }

            public Builder clearCalendarNotificationAction() {
                copyOnWrite();
                ((NotificationActionPayload) this.instance).clearCalendarNotificationAction();
                return this;
            }

            public Builder clearGeneralNotificationAction() {
                copyOnWrite();
                ((NotificationActionPayload) this.instance).clearGeneralNotificationAction();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationActionPayloadOrBuilder
            public ActionPayloadTypesCase getActionPayloadTypesCase() {
                return ((NotificationActionPayload) this.instance).getActionPayloadTypesCase();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationActionPayloadOrBuilder
            public CalendarNotificationActionPayload getCalendarNotificationAction() {
                return ((NotificationActionPayload) this.instance).getCalendarNotificationAction();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationActionPayloadOrBuilder
            public GeneralNotificationActionPayload getGeneralNotificationAction() {
                return ((NotificationActionPayload) this.instance).getGeneralNotificationAction();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationActionPayloadOrBuilder
            public boolean hasCalendarNotificationAction() {
                return ((NotificationActionPayload) this.instance).hasCalendarNotificationAction();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationActionPayloadOrBuilder
            public boolean hasGeneralNotificationAction() {
                return ((NotificationActionPayload) this.instance).hasGeneralNotificationAction();
            }

            public Builder mergeCalendarNotificationAction(CalendarNotificationActionPayload calendarNotificationActionPayload) {
                copyOnWrite();
                ((NotificationActionPayload) this.instance).mergeCalendarNotificationAction(calendarNotificationActionPayload);
                return this;
            }

            public Builder mergeGeneralNotificationAction(GeneralNotificationActionPayload generalNotificationActionPayload) {
                copyOnWrite();
                ((NotificationActionPayload) this.instance).mergeGeneralNotificationAction(generalNotificationActionPayload);
                return this;
            }

            public Builder setCalendarNotificationAction(CalendarNotificationActionPayload calendarNotificationActionPayload) {
                copyOnWrite();
                ((NotificationActionPayload) this.instance).setCalendarNotificationAction(calendarNotificationActionPayload);
                return this;
            }

            public Builder setGeneralNotificationAction(GeneralNotificationActionPayload generalNotificationActionPayload) {
                copyOnWrite();
                ((NotificationActionPayload) this.instance).setGeneralNotificationAction(generalNotificationActionPayload);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setCalendarNotificationAction(CalendarNotificationActionPayload.Builder builder) {
                copyOnWrite();
                ((NotificationActionPayload) this.instance).setCalendarNotificationAction(builder);
                return this;
            }

            public Builder setGeneralNotificationAction(GeneralNotificationActionPayload.Builder builder) {
                copyOnWrite();
                ((NotificationActionPayload) this.instance).setGeneralNotificationAction(builder);
                return this;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum ActionPayloadTypesCase implements Internal.EnumLite {
            GENERAL_NOTIFICATION_ACTION(1),
            CALENDAR_NOTIFICATION_ACTION(2),
            ACTIONPAYLOADTYPES_NOT_SET(0);

            private final int value;

            ActionPayloadTypesCase(int i) {
                this.value = i;
            }

            public static ActionPayloadTypesCase forNumber(int i) {
                if (i == 0) {
                    return ACTIONPAYLOADTYPES_NOT_SET;
                }
                if (i == 1) {
                    return GENERAL_NOTIFICATION_ACTION;
                }
                if (i != 2) {
                    return null;
                }
                return CALENDAR_NOTIFICATION_ACTION;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ActionPayloadTypesCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(NotificationActionPayload notificationActionPayload) {
            return DEFAULT_INSTANCE.createBuilder(notificationActionPayload);
        }

        public static NotificationActionPayload parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotificationActionPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotificationActionPayload parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NotificationActionPayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCalendarNotificationAction(CalendarNotificationActionPayload calendarNotificationActionPayload) {
            calendarNotificationActionPayload.getClass();
            this.actionPayloadTypes_ = calendarNotificationActionPayload;
            this.actionPayloadTypesCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGeneralNotificationAction(GeneralNotificationActionPayload generalNotificationActionPayload) {
            generalNotificationActionPayload.getClass();
            this.actionPayloadTypes_ = generalNotificationActionPayload;
            this.actionPayloadTypesCase_ = 1;
        }

        public static NotificationActionPayload parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NotificationActionPayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotificationActionPayload parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NotificationActionPayload parseFrom(InputStream inputStream) throws IOException {
            return (NotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotificationActionPayload parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotificationActionPayload parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NotificationActionPayload parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotificationContent extends GeneratedMessageLite<NotificationContent, Builder> implements NotificationContentOrBuilder {
        private static final NotificationContent DEFAULT_INSTANCE;
        public static final int NOTIFICATION_IMPORTANCE_FIELD_NUMBER = 4;
        public static final int NOTIFICATION_PAYLOAD_FIELD_NUMBER = 5;
        private static volatile Parser<NotificationContent> PARSER = null;
        public static final int TIMESTAMP_MILLISECONDS_HI_FIELD_NUMBER = 1;
        public static final int TIMESTAMP_MILLISECONDS_LO_FIELD_NUMBER = 2;
        public static final int TIME_TO_LIVE_MILLISECONDS_FIELD_NUMBER = 3;
        private int notificationImportance_;
        private NotificationPayload notificationPayload_;
        private int timeToLiveMilliseconds_;
        private int timestampMillisecondsHi_;
        private int timestampMillisecondsLo_;

        static {
            NotificationContent notificationContent = new NotificationContent();
            DEFAULT_INSTANCE = notificationContent;
            notificationContent.makeImmutable();
        }

        private NotificationContent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotificationImportance() {
            this.notificationImportance_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotificationPayload() {
            this.notificationPayload_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeToLiveMilliseconds() {
            this.timeToLiveMilliseconds_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestampMillisecondsHi() {
            this.timestampMillisecondsHi_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestampMillisecondsLo() {
            this.timestampMillisecondsLo_ = 0;
        }

        public static NotificationContent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNotificationPayload(NotificationPayload notificationPayload) {
            NotificationPayload notificationPayload2 = this.notificationPayload_;
            if (notificationPayload2 == null || notificationPayload2 == NotificationPayload.getDefaultInstance()) {
                this.notificationPayload_ = notificationPayload;
            } else {
                this.notificationPayload_ = NotificationPayload.newBuilder(this.notificationPayload_).mergeFrom((NotificationPayload.Builder) notificationPayload).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotificationContent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NotificationContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotificationContent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NotificationContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NotificationContent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotificationImportance(NotificationImportance notificationImportance) {
            notificationImportance.getClass();
            this.notificationImportance_ = notificationImportance.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotificationImportanceValue(int i) {
            this.notificationImportance_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotificationPayload(NotificationPayload.Builder builder) {
            this.notificationPayload_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeToLiveMilliseconds(int i) {
            this.timeToLiveMilliseconds_ = i;
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
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NotificationContent();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    NotificationContent notificationContent = (NotificationContent) obj2;
                    int i = this.timestampMillisecondsHi_;
                    boolean z = i != 0;
                    int i2 = notificationContent.timestampMillisecondsHi_;
                    this.timestampMillisecondsHi_ = visitor.visitInt(z, i, i2 != 0, i2);
                    int i3 = this.timestampMillisecondsLo_;
                    boolean z2 = i3 != 0;
                    int i4 = notificationContent.timestampMillisecondsLo_;
                    this.timestampMillisecondsLo_ = visitor.visitInt(z2, i3, i4 != 0, i4);
                    int i5 = this.timeToLiveMilliseconds_;
                    boolean z3 = i5 != 0;
                    int i6 = notificationContent.timeToLiveMilliseconds_;
                    this.timeToLiveMilliseconds_ = visitor.visitInt(z3, i5, i6 != 0, i6);
                    int i7 = this.notificationImportance_;
                    boolean z4 = i7 != 0;
                    int i8 = notificationContent.notificationImportance_;
                    this.notificationImportance_ = visitor.visitInt(z4, i7, i8 != 0, i8);
                    this.notificationPayload_ = (NotificationPayload) visitor.visitMessage(this.notificationPayload_, notificationContent.notificationPayload_);
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
                                    this.timestampMillisecondsHi_ = codedInputStream.readUInt32();
                                } else if (readTag == 16) {
                                    this.timestampMillisecondsLo_ = codedInputStream.readUInt32();
                                } else if (readTag == 24) {
                                    this.timeToLiveMilliseconds_ = codedInputStream.readUInt32();
                                } else if (readTag == 32) {
                                    this.notificationImportance_ = codedInputStream.readEnum();
                                } else if (readTag == 42) {
                                    NotificationPayload notificationPayload = this.notificationPayload_;
                                    NotificationPayload.Builder builder = notificationPayload != null ? notificationPayload.toBuilder() : null;
                                    NotificationPayload notificationPayload2 = (NotificationPayload) codedInputStream.readMessage(NotificationPayload.parser(), extensionRegistryLite);
                                    this.notificationPayload_ = notificationPayload2;
                                    if (builder != null) {
                                        builder.mergeFrom((NotificationPayload.Builder) notificationPayload2);
                                        this.notificationPayload_ = builder.buildPartial();
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
                        synchronized (NotificationContent.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationContentOrBuilder
        public NotificationImportance getNotificationImportance() {
            NotificationImportance forNumber = NotificationImportance.forNumber(this.notificationImportance_);
            return forNumber == null ? NotificationImportance.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationContentOrBuilder
        public int getNotificationImportanceValue() {
            return this.notificationImportance_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationContentOrBuilder
        public NotificationPayload getNotificationPayload() {
            NotificationPayload notificationPayload = this.notificationPayload_;
            return notificationPayload == null ? NotificationPayload.getDefaultInstance() : notificationPayload;
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
            int i4 = this.timeToLiveMilliseconds_;
            if (i4 != 0) {
                computeUInt32Size += CodedOutputStream.computeUInt32Size(3, i4);
            }
            if (this.notificationImportance_ != NotificationImportance.NOTIFICATION_IMPORTANCE_DEFAULT.getNumber()) {
                computeUInt32Size += CodedOutputStream.computeEnumSize(4, this.notificationImportance_);
            }
            if (this.notificationPayload_ != null) {
                computeUInt32Size += CodedOutputStream.computeMessageSize(5, getNotificationPayload());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationContentOrBuilder
        public int getTimeToLiveMilliseconds() {
            return this.timeToLiveMilliseconds_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationContentOrBuilder
        public int getTimestampMillisecondsHi() {
            return this.timestampMillisecondsHi_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationContentOrBuilder
        public int getTimestampMillisecondsLo() {
            return this.timestampMillisecondsLo_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationContentOrBuilder
        public boolean hasNotificationPayload() {
            return this.notificationPayload_ != null;
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
            int i3 = this.timeToLiveMilliseconds_;
            if (i3 != 0) {
                codedOutputStream.writeUInt32(3, i3);
            }
            if (this.notificationImportance_ != NotificationImportance.NOTIFICATION_IMPORTANCE_DEFAULT.getNumber()) {
                codedOutputStream.writeEnum(4, this.notificationImportance_);
            }
            if (this.notificationPayload_ != null) {
                codedOutputStream.writeMessage(5, getNotificationPayload());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NotificationContent, Builder> implements NotificationContentOrBuilder {
            private Builder() {
                super(NotificationContent.DEFAULT_INSTANCE);
            }

            public Builder clearNotificationImportance() {
                copyOnWrite();
                ((NotificationContent) this.instance).clearNotificationImportance();
                return this;
            }

            public Builder clearNotificationPayload() {
                copyOnWrite();
                ((NotificationContent) this.instance).clearNotificationPayload();
                return this;
            }

            public Builder clearTimeToLiveMilliseconds() {
                copyOnWrite();
                ((NotificationContent) this.instance).clearTimeToLiveMilliseconds();
                return this;
            }

            public Builder clearTimestampMillisecondsHi() {
                copyOnWrite();
                ((NotificationContent) this.instance).clearTimestampMillisecondsHi();
                return this;
            }

            public Builder clearTimestampMillisecondsLo() {
                copyOnWrite();
                ((NotificationContent) this.instance).clearTimestampMillisecondsLo();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationContentOrBuilder
            public NotificationImportance getNotificationImportance() {
                return ((NotificationContent) this.instance).getNotificationImportance();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationContentOrBuilder
            public int getNotificationImportanceValue() {
                return ((NotificationContent) this.instance).getNotificationImportanceValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationContentOrBuilder
            public NotificationPayload getNotificationPayload() {
                return ((NotificationContent) this.instance).getNotificationPayload();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationContentOrBuilder
            public int getTimeToLiveMilliseconds() {
                return ((NotificationContent) this.instance).getTimeToLiveMilliseconds();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationContentOrBuilder
            public int getTimestampMillisecondsHi() {
                return ((NotificationContent) this.instance).getTimestampMillisecondsHi();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationContentOrBuilder
            public int getTimestampMillisecondsLo() {
                return ((NotificationContent) this.instance).getTimestampMillisecondsLo();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationContentOrBuilder
            public boolean hasNotificationPayload() {
                return ((NotificationContent) this.instance).hasNotificationPayload();
            }

            public Builder mergeNotificationPayload(NotificationPayload notificationPayload) {
                copyOnWrite();
                ((NotificationContent) this.instance).mergeNotificationPayload(notificationPayload);
                return this;
            }

            public Builder setNotificationImportance(NotificationImportance notificationImportance) {
                copyOnWrite();
                ((NotificationContent) this.instance).setNotificationImportance(notificationImportance);
                return this;
            }

            public Builder setNotificationImportanceValue(int i) {
                copyOnWrite();
                ((NotificationContent) this.instance).setNotificationImportanceValue(i);
                return this;
            }

            public Builder setNotificationPayload(NotificationPayload notificationPayload) {
                copyOnWrite();
                ((NotificationContent) this.instance).setNotificationPayload(notificationPayload);
                return this;
            }

            public Builder setTimeToLiveMilliseconds(int i) {
                copyOnWrite();
                ((NotificationContent) this.instance).setTimeToLiveMilliseconds(i);
                return this;
            }

            public Builder setTimestampMillisecondsHi(int i) {
                copyOnWrite();
                ((NotificationContent) this.instance).setTimestampMillisecondsHi(i);
                return this;
            }

            public Builder setTimestampMillisecondsLo(int i) {
                copyOnWrite();
                ((NotificationContent) this.instance).setTimestampMillisecondsLo(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setNotificationPayload(NotificationPayload.Builder builder) {
                copyOnWrite();
                ((NotificationContent) this.instance).setNotificationPayload(builder);
                return this;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum NotificationImportance implements Internal.EnumLite {
            NOTIFICATION_IMPORTANCE_DEFAULT(0),
            NOTIFICATION_IMPORTANCE_MINIMUM(1),
            NOTIFICATION_IMPORTANCE_LOW(2),
            NOTIFICATION_IMPORTANCE_HIGH(3),
            NOTIFICATION_IMPORTANCE_MAXIMUM(4),
            UNRECOGNIZED(-1);

            public static final int NOTIFICATION_IMPORTANCE_DEFAULT_VALUE = 0;
            public static final int NOTIFICATION_IMPORTANCE_HIGH_VALUE = 3;
            public static final int NOTIFICATION_IMPORTANCE_LOW_VALUE = 2;
            public static final int NOTIFICATION_IMPORTANCE_MAXIMUM_VALUE = 4;
            public static final int NOTIFICATION_IMPORTANCE_MINIMUM_VALUE = 1;
            private static final Internal.EnumLiteMap<NotificationImportance> internalValueMap = new Internal.EnumLiteMap<NotificationImportance>() { // from class: com.amazon.alexa.accessory.protocol.Notification.NotificationContent.NotificationImportance.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public NotificationImportance findValueByNumber(int i) {
                    return NotificationImportance.forNumber(i);
                }
            };
            private final int value;

            NotificationImportance(int i) {
                this.value = i;
            }

            public static NotificationImportance forNumber(int i) {
                if (i == 0) {
                    return NOTIFICATION_IMPORTANCE_DEFAULT;
                }
                if (i == 1) {
                    return NOTIFICATION_IMPORTANCE_MINIMUM;
                }
                if (i == 2) {
                    return NOTIFICATION_IMPORTANCE_LOW;
                }
                if (i == 3) {
                    return NOTIFICATION_IMPORTANCE_HIGH;
                }
                if (i != 4) {
                    return null;
                }
                return NOTIFICATION_IMPORTANCE_MAXIMUM;
            }

            public static Internal.EnumLiteMap<NotificationImportance> internalGetValueMap() {
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
            public static NotificationImportance valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(NotificationContent notificationContent) {
            return DEFAULT_INSTANCE.createBuilder(notificationContent);
        }

        public static NotificationContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotificationContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotificationContent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotificationContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotificationPayload(NotificationPayload notificationPayload) {
            notificationPayload.getClass();
            this.notificationPayload_ = notificationPayload;
        }

        public static NotificationContent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NotificationContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NotificationContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotificationContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NotificationContent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NotificationContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotificationContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotificationContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NotificationContent parseFrom(InputStream inputStream) throws IOException {
            return (NotificationContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotificationContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotificationContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotificationContent parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NotificationContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NotificationContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotificationContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotificationPayload extends GeneratedMessageLite<NotificationPayload, Builder> implements NotificationPayloadOrBuilder {
        public static final int CALENDAR_NOTIFICATION_FIELD_NUMBER = 2;
        private static final NotificationPayload DEFAULT_INSTANCE;
        public static final int GENERAL_NOTIFICATION_FIELD_NUMBER = 1;
        private static volatile Parser<NotificationPayload> PARSER;
        private int payloadTypesCase_ = 0;
        private Object payloadTypes_;

        static {
            NotificationPayload notificationPayload = new NotificationPayload();
            DEFAULT_INSTANCE = notificationPayload;
            notificationPayload.makeImmutable();
        }

        private NotificationPayload() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCalendarNotification() {
            if (this.payloadTypesCase_ == 2) {
                this.payloadTypesCase_ = 0;
                this.payloadTypes_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGeneralNotification() {
            if (this.payloadTypesCase_ == 1) {
                this.payloadTypesCase_ = 0;
                this.payloadTypes_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPayloadTypes() {
            this.payloadTypesCase_ = 0;
            this.payloadTypes_ = null;
        }

        public static NotificationPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCalendarNotification(CalendarNotificationPayload calendarNotificationPayload) {
            if (this.payloadTypesCase_ != 2 || this.payloadTypes_ == CalendarNotificationPayload.getDefaultInstance()) {
                this.payloadTypes_ = calendarNotificationPayload;
            } else {
                this.payloadTypes_ = CalendarNotificationPayload.newBuilder((CalendarNotificationPayload) this.payloadTypes_).mergeFrom((CalendarNotificationPayload.Builder) calendarNotificationPayload).buildPartial();
            }
            this.payloadTypesCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGeneralNotification(GeneralNotificationPayload generalNotificationPayload) {
            if (this.payloadTypesCase_ != 1 || this.payloadTypes_ == GeneralNotificationPayload.getDefaultInstance()) {
                this.payloadTypes_ = generalNotificationPayload;
            } else {
                this.payloadTypes_ = GeneralNotificationPayload.newBuilder((GeneralNotificationPayload) this.payloadTypes_).mergeFrom((GeneralNotificationPayload.Builder) generalNotificationPayload).buildPartial();
            }
            this.payloadTypesCase_ = 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotificationPayload parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NotificationPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotificationPayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NotificationPayload> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCalendarNotification(CalendarNotificationPayload.Builder builder) {
            this.payloadTypes_ = builder.build();
            this.payloadTypesCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGeneralNotification(GeneralNotificationPayload.Builder builder) {
            this.payloadTypes_ = builder.build();
            this.payloadTypesCase_ = 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NotificationPayload();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    NotificationPayload notificationPayload = (NotificationPayload) obj2;
                    int i2 = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Notification$NotificationPayload$PayloadTypesCase[notificationPayload.getPayloadTypesCase().ordinal()];
                    if (i2 == 1) {
                        this.payloadTypes_ = visitor.visitOneofMessage(this.payloadTypesCase_ == 1, this.payloadTypes_, notificationPayload.payloadTypes_);
                    } else if (i2 == 2) {
                        this.payloadTypes_ = visitor.visitOneofMessage(this.payloadTypesCase_ == 2, this.payloadTypes_, notificationPayload.payloadTypes_);
                    } else if (i2 == 3) {
                        visitor.visitOneofNotSet(this.payloadTypesCase_ != 0);
                    }
                    if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE && (i = notificationPayload.payloadTypesCase_) != 0) {
                        this.payloadTypesCase_ = i;
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
                                    GeneralNotificationPayload.Builder builder = this.payloadTypesCase_ == 1 ? ((GeneralNotificationPayload) this.payloadTypes_).toBuilder() : null;
                                    MessageLite readMessage = codedInputStream.readMessage(GeneralNotificationPayload.parser(), extensionRegistryLite);
                                    this.payloadTypes_ = readMessage;
                                    if (builder != null) {
                                        builder.mergeFrom((GeneralNotificationPayload.Builder) readMessage);
                                        this.payloadTypes_ = builder.buildPartial();
                                    }
                                    this.payloadTypesCase_ = 1;
                                } else if (readTag == 18) {
                                    CalendarNotificationPayload.Builder builder2 = this.payloadTypesCase_ == 2 ? ((CalendarNotificationPayload) this.payloadTypes_).toBuilder() : null;
                                    MessageLite readMessage2 = codedInputStream.readMessage(CalendarNotificationPayload.parser(), extensionRegistryLite);
                                    this.payloadTypes_ = readMessage2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((CalendarNotificationPayload.Builder) readMessage2);
                                        this.payloadTypes_ = builder2.buildPartial();
                                    }
                                    this.payloadTypesCase_ = 2;
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
                        synchronized (NotificationPayload.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationPayloadOrBuilder
        public CalendarNotificationPayload getCalendarNotification() {
            return this.payloadTypesCase_ == 2 ? (CalendarNotificationPayload) this.payloadTypes_ : CalendarNotificationPayload.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationPayloadOrBuilder
        public GeneralNotificationPayload getGeneralNotification() {
            return this.payloadTypesCase_ == 1 ? (GeneralNotificationPayload) this.payloadTypes_ : GeneralNotificationPayload.getDefaultInstance();
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationPayloadOrBuilder
        public PayloadTypesCase getPayloadTypesCase() {
            return PayloadTypesCase.forNumber(this.payloadTypesCase_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.payloadTypesCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (GeneralNotificationPayload) this.payloadTypes_) : 0;
            if (this.payloadTypesCase_ == 2) {
                computeMessageSize += CodedOutputStream.computeMessageSize(2, (CalendarNotificationPayload) this.payloadTypes_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationPayloadOrBuilder
        public boolean hasCalendarNotification() {
            return this.payloadTypesCase_ == 2;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationPayloadOrBuilder
        public boolean hasGeneralNotification() {
            return this.payloadTypesCase_ == 1;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadTypesCase_ == 1) {
                codedOutputStream.writeMessage(1, (GeneralNotificationPayload) this.payloadTypes_);
            }
            if (this.payloadTypesCase_ == 2) {
                codedOutputStream.writeMessage(2, (CalendarNotificationPayload) this.payloadTypes_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<NotificationPayload, Builder> implements NotificationPayloadOrBuilder {
            private Builder() {
                super(NotificationPayload.DEFAULT_INSTANCE);
            }

            public Builder clearCalendarNotification() {
                copyOnWrite();
                ((NotificationPayload) this.instance).clearCalendarNotification();
                return this;
            }

            public Builder clearGeneralNotification() {
                copyOnWrite();
                ((NotificationPayload) this.instance).clearGeneralNotification();
                return this;
            }

            public Builder clearPayloadTypes() {
                copyOnWrite();
                ((NotificationPayload) this.instance).clearPayloadTypes();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationPayloadOrBuilder
            public CalendarNotificationPayload getCalendarNotification() {
                return ((NotificationPayload) this.instance).getCalendarNotification();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationPayloadOrBuilder
            public GeneralNotificationPayload getGeneralNotification() {
                return ((NotificationPayload) this.instance).getGeneralNotification();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationPayloadOrBuilder
            public PayloadTypesCase getPayloadTypesCase() {
                return ((NotificationPayload) this.instance).getPayloadTypesCase();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationPayloadOrBuilder
            public boolean hasCalendarNotification() {
                return ((NotificationPayload) this.instance).hasCalendarNotification();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.NotificationPayloadOrBuilder
            public boolean hasGeneralNotification() {
                return ((NotificationPayload) this.instance).hasGeneralNotification();
            }

            public Builder mergeCalendarNotification(CalendarNotificationPayload calendarNotificationPayload) {
                copyOnWrite();
                ((NotificationPayload) this.instance).mergeCalendarNotification(calendarNotificationPayload);
                return this;
            }

            public Builder mergeGeneralNotification(GeneralNotificationPayload generalNotificationPayload) {
                copyOnWrite();
                ((NotificationPayload) this.instance).mergeGeneralNotification(generalNotificationPayload);
                return this;
            }

            public Builder setCalendarNotification(CalendarNotificationPayload calendarNotificationPayload) {
                copyOnWrite();
                ((NotificationPayload) this.instance).setCalendarNotification(calendarNotificationPayload);
                return this;
            }

            public Builder setGeneralNotification(GeneralNotificationPayload generalNotificationPayload) {
                copyOnWrite();
                ((NotificationPayload) this.instance).setGeneralNotification(generalNotificationPayload);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setCalendarNotification(CalendarNotificationPayload.Builder builder) {
                copyOnWrite();
                ((NotificationPayload) this.instance).setCalendarNotification(builder);
                return this;
            }

            public Builder setGeneralNotification(GeneralNotificationPayload.Builder builder) {
                copyOnWrite();
                ((NotificationPayload) this.instance).setGeneralNotification(builder);
                return this;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum PayloadTypesCase implements Internal.EnumLite {
            GENERAL_NOTIFICATION(1),
            CALENDAR_NOTIFICATION(2),
            PAYLOADTYPES_NOT_SET(0);

            private final int value;

            PayloadTypesCase(int i) {
                this.value = i;
            }

            public static PayloadTypesCase forNumber(int i) {
                if (i == 0) {
                    return PAYLOADTYPES_NOT_SET;
                }
                if (i == 1) {
                    return GENERAL_NOTIFICATION;
                }
                if (i != 2) {
                    return null;
                }
                return CALENDAR_NOTIFICATION;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static PayloadTypesCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(NotificationPayload notificationPayload) {
            return DEFAULT_INSTANCE.createBuilder(notificationPayload);
        }

        public static NotificationPayload parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotificationPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotificationPayload parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NotificationPayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCalendarNotification(CalendarNotificationPayload calendarNotificationPayload) {
            calendarNotificationPayload.getClass();
            this.payloadTypes_ = calendarNotificationPayload;
            this.payloadTypesCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGeneralNotification(GeneralNotificationPayload generalNotificationPayload) {
            generalNotificationPayload.getClass();
            this.payloadTypes_ = generalNotificationPayload;
            this.payloadTypesCase_ = 1;
        }

        public static NotificationPayload parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NotificationPayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotificationPayload parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NotificationPayload parseFrom(InputStream inputStream) throws IOException {
            return (NotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotificationPayload parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NotificationPayload parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NotificationPayload parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class UpdateNotification extends GeneratedMessageLite<UpdateNotification, Builder> implements UpdateNotificationOrBuilder {
        private static final UpdateNotification DEFAULT_INSTANCE;
        public static final int NOTIFICATION_CONTENT_FIELD_NUMBER = 2;
        public static final int NOTIFICATION_UID_FIELD_NUMBER = 1;
        private static volatile Parser<UpdateNotification> PARSER;
        private NotificationContent notificationContent_;
        private int notificationUid_;

        static {
            UpdateNotification updateNotification = new UpdateNotification();
            DEFAULT_INSTANCE = updateNotification;
            updateNotification.makeImmutable();
        }

        private UpdateNotification() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotificationContent() {
            this.notificationContent_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotificationUid() {
            this.notificationUid_ = 0;
        }

        public static UpdateNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNotificationContent(NotificationContent notificationContent) {
            NotificationContent notificationContent2 = this.notificationContent_;
            if (notificationContent2 == null || notificationContent2 == NotificationContent.getDefaultInstance()) {
                this.notificationContent_ = notificationContent;
            } else {
                this.notificationContent_ = NotificationContent.newBuilder(this.notificationContent_).mergeFrom((NotificationContent.Builder) notificationContent).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static UpdateNotification parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UpdateNotification) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateNotification parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UpdateNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<UpdateNotification> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotificationContent(NotificationContent.Builder builder) {
            this.notificationContent_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotificationUid(int i) {
            this.notificationUid_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new UpdateNotification();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    UpdateNotification updateNotification = (UpdateNotification) obj2;
                    int i = this.notificationUid_;
                    boolean z = i != 0;
                    int i2 = updateNotification.notificationUid_;
                    this.notificationUid_ = visitor.visitInt(z, i, i2 != 0, i2);
                    this.notificationContent_ = (NotificationContent) visitor.visitMessage(this.notificationContent_, updateNotification.notificationContent_);
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
                                    this.notificationUid_ = codedInputStream.readUInt32();
                                } else if (readTag == 18) {
                                    NotificationContent notificationContent = this.notificationContent_;
                                    NotificationContent.Builder builder = notificationContent != null ? notificationContent.toBuilder() : null;
                                    NotificationContent notificationContent2 = (NotificationContent) codedInputStream.readMessage(NotificationContent.parser(), extensionRegistryLite);
                                    this.notificationContent_ = notificationContent2;
                                    if (builder != null) {
                                        builder.mergeFrom((NotificationContent.Builder) notificationContent2);
                                        this.notificationContent_ = builder.buildPartial();
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
                        synchronized (UpdateNotification.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Notification.UpdateNotificationOrBuilder
        public NotificationContent getNotificationContent() {
            NotificationContent notificationContent = this.notificationContent_;
            return notificationContent == null ? NotificationContent.getDefaultInstance() : notificationContent;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.UpdateNotificationOrBuilder
        public int getNotificationUid() {
            return this.notificationUid_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.notificationUid_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            if (this.notificationContent_ != null) {
                computeUInt32Size += CodedOutputStream.computeMessageSize(2, getNotificationContent());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeUInt32Size;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.UpdateNotificationOrBuilder
        public boolean hasNotificationContent() {
            return this.notificationContent_ != null;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.notificationUid_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            if (this.notificationContent_ != null) {
                codedOutputStream.writeMessage(2, getNotificationContent());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<UpdateNotification, Builder> implements UpdateNotificationOrBuilder {
            private Builder() {
                super(UpdateNotification.DEFAULT_INSTANCE);
            }

            public Builder clearNotificationContent() {
                copyOnWrite();
                ((UpdateNotification) this.instance).clearNotificationContent();
                return this;
            }

            public Builder clearNotificationUid() {
                copyOnWrite();
                ((UpdateNotification) this.instance).clearNotificationUid();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.UpdateNotificationOrBuilder
            public NotificationContent getNotificationContent() {
                return ((UpdateNotification) this.instance).getNotificationContent();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.UpdateNotificationOrBuilder
            public int getNotificationUid() {
                return ((UpdateNotification) this.instance).getNotificationUid();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.UpdateNotificationOrBuilder
            public boolean hasNotificationContent() {
                return ((UpdateNotification) this.instance).hasNotificationContent();
            }

            public Builder mergeNotificationContent(NotificationContent notificationContent) {
                copyOnWrite();
                ((UpdateNotification) this.instance).mergeNotificationContent(notificationContent);
                return this;
            }

            public Builder setNotificationContent(NotificationContent notificationContent) {
                copyOnWrite();
                ((UpdateNotification) this.instance).setNotificationContent(notificationContent);
                return this;
            }

            public Builder setNotificationUid(int i) {
                copyOnWrite();
                ((UpdateNotification) this.instance).setNotificationUid(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder setNotificationContent(NotificationContent.Builder builder) {
                copyOnWrite();
                ((UpdateNotification) this.instance).setNotificationContent(builder);
                return this;
            }
        }

        public static Builder newBuilder(UpdateNotification updateNotification) {
            return DEFAULT_INSTANCE.createBuilder(updateNotification);
        }

        public static UpdateNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UpdateNotification) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UpdateNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UpdateNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotificationContent(NotificationContent notificationContent) {
            notificationContent.getClass();
            this.notificationContent_ = notificationContent;
        }

        public static UpdateNotification parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UpdateNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UpdateNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UpdateNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static UpdateNotification parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UpdateNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UpdateNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UpdateNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static UpdateNotification parseFrom(InputStream inputStream) throws IOException {
            return (UpdateNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UpdateNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UpdateNotification parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UpdateNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UpdateNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UpdateNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CalendarNotificationActionPayload extends GeneratedMessageLite<CalendarNotificationActionPayload, Builder> implements CalendarNotificationActionPayloadOrBuilder {
        public static final int ACTION_TYPE_FIELD_NUMBER = 1;
        private static final CalendarNotificationActionPayload DEFAULT_INSTANCE;
        private static volatile Parser<CalendarNotificationActionPayload> PARSER = null;
        public static final int REMIND_IN_SECONDS_FIELD_NUMBER = 2;
        private int actionType_;
        private int remindInSeconds_;

        static {
            CalendarNotificationActionPayload calendarNotificationActionPayload = new CalendarNotificationActionPayload();
            DEFAULT_INSTANCE = calendarNotificationActionPayload;
            calendarNotificationActionPayload.makeImmutable();
        }

        private CalendarNotificationActionPayload() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActionType() {
            this.actionType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemindInSeconds() {
            this.remindInSeconds_ = 0;
        }

        public static CalendarNotificationActionPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CalendarNotificationActionPayload parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CalendarNotificationActionPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CalendarNotificationActionPayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CalendarNotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CalendarNotificationActionPayload> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionType(CalendarNotificationActionType calendarNotificationActionType) {
            calendarNotificationActionType.getClass();
            this.actionType_ = calendarNotificationActionType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionTypeValue(int i) {
            this.actionType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemindInSeconds(int i) {
            this.remindInSeconds_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CalendarNotificationActionPayload();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    CalendarNotificationActionPayload calendarNotificationActionPayload = (CalendarNotificationActionPayload) obj2;
                    int i = this.actionType_;
                    boolean z = i != 0;
                    int i2 = calendarNotificationActionPayload.actionType_;
                    this.actionType_ = visitor.visitInt(z, i, i2 != 0, i2);
                    int i3 = this.remindInSeconds_;
                    boolean z2 = i3 != 0;
                    int i4 = calendarNotificationActionPayload.remindInSeconds_;
                    this.remindInSeconds_ = visitor.visitInt(z2, i3, i4 != 0, i4);
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
                                    this.actionType_ = codedInputStream.readEnum();
                                } else if (readTag == 16) {
                                    this.remindInSeconds_ = codedInputStream.readUInt32();
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
                        synchronized (CalendarNotificationActionPayload.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Notification.CalendarNotificationActionPayloadOrBuilder
        public CalendarNotificationActionType getActionType() {
            CalendarNotificationActionType forNumber = CalendarNotificationActionType.forNumber(this.actionType_);
            return forNumber == null ? CalendarNotificationActionType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.CalendarNotificationActionPayloadOrBuilder
        public int getActionTypeValue() {
            return this.actionType_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.CalendarNotificationActionPayloadOrBuilder
        public int getRemindInSeconds() {
            return this.remindInSeconds_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.actionType_ != CalendarNotificationActionType.REMIND.getNumber() ? CodedOutputStream.computeEnumSize(1, this.actionType_) : 0;
            int i2 = this.remindInSeconds_;
            if (i2 != 0) {
                computeEnumSize += CodedOutputStream.computeUInt32Size(2, i2);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeEnumSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.actionType_ != CalendarNotificationActionType.REMIND.getNumber()) {
                codedOutputStream.writeEnum(1, this.actionType_);
            }
            int i = this.remindInSeconds_;
            if (i != 0) {
                codedOutputStream.writeUInt32(2, i);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<CalendarNotificationActionPayload, Builder> implements CalendarNotificationActionPayloadOrBuilder {
            private Builder() {
                super(CalendarNotificationActionPayload.DEFAULT_INSTANCE);
            }

            public Builder clearActionType() {
                copyOnWrite();
                ((CalendarNotificationActionPayload) this.instance).clearActionType();
                return this;
            }

            public Builder clearRemindInSeconds() {
                copyOnWrite();
                ((CalendarNotificationActionPayload) this.instance).clearRemindInSeconds();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.CalendarNotificationActionPayloadOrBuilder
            public CalendarNotificationActionType getActionType() {
                return ((CalendarNotificationActionPayload) this.instance).getActionType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.CalendarNotificationActionPayloadOrBuilder
            public int getActionTypeValue() {
                return ((CalendarNotificationActionPayload) this.instance).getActionTypeValue();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.CalendarNotificationActionPayloadOrBuilder
            public int getRemindInSeconds() {
                return ((CalendarNotificationActionPayload) this.instance).getRemindInSeconds();
            }

            public Builder setActionType(CalendarNotificationActionType calendarNotificationActionType) {
                copyOnWrite();
                ((CalendarNotificationActionPayload) this.instance).setActionType(calendarNotificationActionType);
                return this;
            }

            public Builder setActionTypeValue(int i) {
                copyOnWrite();
                ((CalendarNotificationActionPayload) this.instance).setActionTypeValue(i);
                return this;
            }

            public Builder setRemindInSeconds(int i) {
                copyOnWrite();
                ((CalendarNotificationActionPayload) this.instance).setRemindInSeconds(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum CalendarNotificationActionType implements Internal.EnumLite {
            REMIND(0),
            UNRECOGNIZED(-1);

            public static final int REMIND_VALUE = 0;
            private static final Internal.EnumLiteMap<CalendarNotificationActionType> internalValueMap = new Internal.EnumLiteMap<CalendarNotificationActionType>() { // from class: com.amazon.alexa.accessory.protocol.Notification.CalendarNotificationActionPayload.CalendarNotificationActionType.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public CalendarNotificationActionType findValueByNumber(int i) {
                    return CalendarNotificationActionType.forNumber(i);
                }
            };
            private final int value;

            CalendarNotificationActionType(int i) {
                this.value = i;
            }

            public static CalendarNotificationActionType forNumber(int i) {
                if (i != 0) {
                    return null;
                }
                return REMIND;
            }

            public static Internal.EnumLiteMap<CalendarNotificationActionType> internalGetValueMap() {
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
            public static CalendarNotificationActionType valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(CalendarNotificationActionPayload calendarNotificationActionPayload) {
            return DEFAULT_INSTANCE.createBuilder(calendarNotificationActionPayload);
        }

        public static CalendarNotificationActionPayload parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CalendarNotificationActionPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CalendarNotificationActionPayload parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CalendarNotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CalendarNotificationActionPayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CalendarNotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CalendarNotificationActionPayload parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CalendarNotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CalendarNotificationActionPayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CalendarNotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CalendarNotificationActionPayload parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CalendarNotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CalendarNotificationActionPayload parseFrom(InputStream inputStream) throws IOException {
            return (CalendarNotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CalendarNotificationActionPayload parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CalendarNotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CalendarNotificationActionPayload parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CalendarNotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CalendarNotificationActionPayload parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CalendarNotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CalendarNotificationPayload extends GeneratedMessageLite<CalendarNotificationPayload, Builder> implements CalendarNotificationPayloadOrBuilder {
        private static final CalendarNotificationPayload DEFAULT_INSTANCE;
        public static final int LOCATION_FIELD_NUMBER = 2;
        public static final int NOTIFICATION_MESSAGE_FIELD_NUMBER = 4;
        private static volatile Parser<CalendarNotificationPayload> PARSER = null;
        public static final int TIME_FIELD_NUMBER = 3;
        public static final int TITLE_FIELD_NUMBER = 1;
        private String title_ = "";
        private String location_ = "";
        private String time_ = "";
        private String notificationMessage_ = "";

        static {
            CalendarNotificationPayload calendarNotificationPayload = new CalendarNotificationPayload();
            DEFAULT_INSTANCE = calendarNotificationPayload;
            calendarNotificationPayload.makeImmutable();
        }

        private CalendarNotificationPayload() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocation() {
            this.location_ = getDefaultInstance().getLocation();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotificationMessage() {
            this.notificationMessage_ = getDefaultInstance().getNotificationMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTime() {
            this.time_ = getDefaultInstance().getTime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        public static CalendarNotificationPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CalendarNotificationPayload parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CalendarNotificationPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CalendarNotificationPayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CalendarNotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CalendarNotificationPayload> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocation(String str) {
            str.getClass();
            this.location_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocationBytes(ByteString byteString) {
            this.location_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotificationMessage(String str) {
            str.getClass();
            this.notificationMessage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotificationMessageBytes(ByteString byteString) {
            this.notificationMessage_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTime(String str) {
            str.getClass();
            this.time_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeBytes(ByteString byteString) {
            this.time_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(ByteString byteString) {
            this.title_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CalendarNotificationPayload();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    CalendarNotificationPayload calendarNotificationPayload = (CalendarNotificationPayload) obj2;
                    this.title_ = visitor.visitString(!this.title_.isEmpty(), this.title_, !calendarNotificationPayload.title_.isEmpty(), calendarNotificationPayload.title_);
                    this.location_ = visitor.visitString(!this.location_.isEmpty(), this.location_, !calendarNotificationPayload.location_.isEmpty(), calendarNotificationPayload.location_);
                    this.time_ = visitor.visitString(!this.time_.isEmpty(), this.time_, !calendarNotificationPayload.time_.isEmpty(), calendarNotificationPayload.time_);
                    this.notificationMessage_ = visitor.visitString(!this.notificationMessage_.isEmpty(), this.notificationMessage_, !calendarNotificationPayload.notificationMessage_.isEmpty(), calendarNotificationPayload.notificationMessage_);
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
                                    this.title_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.location_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    this.time_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 34) {
                                    this.notificationMessage_ = codedInputStream.readStringRequireUtf8();
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
                        synchronized (CalendarNotificationPayload.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Notification.CalendarNotificationPayloadOrBuilder
        public String getLocation() {
            return this.location_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.CalendarNotificationPayloadOrBuilder
        public ByteString getLocationBytes() {
            return ByteString.copyFromUtf8(this.location_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.CalendarNotificationPayloadOrBuilder
        public String getNotificationMessage() {
            return this.notificationMessage_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.CalendarNotificationPayloadOrBuilder
        public ByteString getNotificationMessageBytes() {
            return ByteString.copyFromUtf8(this.notificationMessage_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.title_.isEmpty() ? CodedOutputStream.computeStringSize(1, getTitle()) : 0;
            if (!this.location_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(2, getLocation());
            }
            if (!this.time_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(3, getTime());
            }
            if (!this.notificationMessage_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(4, getNotificationMessage());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.CalendarNotificationPayloadOrBuilder
        public String getTime() {
            return this.time_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.CalendarNotificationPayloadOrBuilder
        public ByteString getTimeBytes() {
            return ByteString.copyFromUtf8(this.time_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.CalendarNotificationPayloadOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.CalendarNotificationPayloadOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.title_.isEmpty()) {
                codedOutputStream.writeString(1, getTitle());
            }
            if (!this.location_.isEmpty()) {
                codedOutputStream.writeString(2, getLocation());
            }
            if (!this.time_.isEmpty()) {
                codedOutputStream.writeString(3, getTime());
            }
            if (!this.notificationMessage_.isEmpty()) {
                codedOutputStream.writeString(4, getNotificationMessage());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<CalendarNotificationPayload, Builder> implements CalendarNotificationPayloadOrBuilder {
            private Builder() {
                super(CalendarNotificationPayload.DEFAULT_INSTANCE);
            }

            public Builder clearLocation() {
                copyOnWrite();
                ((CalendarNotificationPayload) this.instance).clearLocation();
                return this;
            }

            public Builder clearNotificationMessage() {
                copyOnWrite();
                ((CalendarNotificationPayload) this.instance).clearNotificationMessage();
                return this;
            }

            public Builder clearTime() {
                copyOnWrite();
                ((CalendarNotificationPayload) this.instance).clearTime();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((CalendarNotificationPayload) this.instance).clearTitle();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.CalendarNotificationPayloadOrBuilder
            public String getLocation() {
                return ((CalendarNotificationPayload) this.instance).getLocation();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.CalendarNotificationPayloadOrBuilder
            public ByteString getLocationBytes() {
                return ((CalendarNotificationPayload) this.instance).getLocationBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.CalendarNotificationPayloadOrBuilder
            public String getNotificationMessage() {
                return ((CalendarNotificationPayload) this.instance).getNotificationMessage();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.CalendarNotificationPayloadOrBuilder
            public ByteString getNotificationMessageBytes() {
                return ((CalendarNotificationPayload) this.instance).getNotificationMessageBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.CalendarNotificationPayloadOrBuilder
            public String getTime() {
                return ((CalendarNotificationPayload) this.instance).getTime();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.CalendarNotificationPayloadOrBuilder
            public ByteString getTimeBytes() {
                return ((CalendarNotificationPayload) this.instance).getTimeBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.CalendarNotificationPayloadOrBuilder
            public String getTitle() {
                return ((CalendarNotificationPayload) this.instance).getTitle();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.CalendarNotificationPayloadOrBuilder
            public ByteString getTitleBytes() {
                return ((CalendarNotificationPayload) this.instance).getTitleBytes();
            }

            public Builder setLocation(String str) {
                copyOnWrite();
                ((CalendarNotificationPayload) this.instance).setLocation(str);
                return this;
            }

            public Builder setLocationBytes(ByteString byteString) {
                copyOnWrite();
                ((CalendarNotificationPayload) this.instance).setLocationBytes(byteString);
                return this;
            }

            public Builder setNotificationMessage(String str) {
                copyOnWrite();
                ((CalendarNotificationPayload) this.instance).setNotificationMessage(str);
                return this;
            }

            public Builder setNotificationMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((CalendarNotificationPayload) this.instance).setNotificationMessageBytes(byteString);
                return this;
            }

            public Builder setTime(String str) {
                copyOnWrite();
                ((CalendarNotificationPayload) this.instance).setTime(str);
                return this;
            }

            public Builder setTimeBytes(ByteString byteString) {
                copyOnWrite();
                ((CalendarNotificationPayload) this.instance).setTimeBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((CalendarNotificationPayload) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((CalendarNotificationPayload) this.instance).setTitleBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(CalendarNotificationPayload calendarNotificationPayload) {
            return DEFAULT_INSTANCE.createBuilder(calendarNotificationPayload);
        }

        public static CalendarNotificationPayload parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CalendarNotificationPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CalendarNotificationPayload parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CalendarNotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CalendarNotificationPayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CalendarNotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CalendarNotificationPayload parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CalendarNotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CalendarNotificationPayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CalendarNotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CalendarNotificationPayload parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CalendarNotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CalendarNotificationPayload parseFrom(InputStream inputStream) throws IOException {
            return (CalendarNotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CalendarNotificationPayload parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CalendarNotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CalendarNotificationPayload parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CalendarNotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CalendarNotificationPayload parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CalendarNotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GeneralNotificationActionPayload extends GeneratedMessageLite<GeneralNotificationActionPayload, Builder> implements GeneralNotificationActionPayloadOrBuilder {
        public static final int ACTION_TYPE_FIELD_NUMBER = 1;
        private static final GeneralNotificationActionPayload DEFAULT_INSTANCE;
        private static volatile Parser<GeneralNotificationActionPayload> PARSER;
        private int actionType_;

        static {
            GeneralNotificationActionPayload generalNotificationActionPayload = new GeneralNotificationActionPayload();
            DEFAULT_INSTANCE = generalNotificationActionPayload;
            generalNotificationActionPayload.makeImmutable();
        }

        private GeneralNotificationActionPayload() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActionType() {
            this.actionType_ = 0;
        }

        public static GeneralNotificationActionPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GeneralNotificationActionPayload parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GeneralNotificationActionPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GeneralNotificationActionPayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GeneralNotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GeneralNotificationActionPayload> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionType(GeneralNotificationActionType generalNotificationActionType) {
            generalNotificationActionType.getClass();
            this.actionType_ = generalNotificationActionType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionTypeValue(int i) {
            this.actionType_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GeneralNotificationActionPayload();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    GeneralNotificationActionPayload generalNotificationActionPayload = (GeneralNotificationActionPayload) obj2;
                    int i = this.actionType_;
                    boolean z = i != 0;
                    int i2 = generalNotificationActionPayload.actionType_;
                    this.actionType_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    this.actionType_ = codedInputStream.readEnum();
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
                        synchronized (GeneralNotificationActionPayload.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Notification.GeneralNotificationActionPayloadOrBuilder
        public GeneralNotificationActionType getActionType() {
            GeneralNotificationActionType forNumber = GeneralNotificationActionType.forNumber(this.actionType_);
            return forNumber == null ? GeneralNotificationActionType.UNRECOGNIZED : forNumber;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.GeneralNotificationActionPayloadOrBuilder
        public int getActionTypeValue() {
            return this.actionType_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.actionType_ != GeneralNotificationActionType.DISMISS.getNumber() ? CodedOutputStream.computeEnumSize(1, this.actionType_) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.actionType_ != GeneralNotificationActionType.DISMISS.getNumber()) {
                codedOutputStream.writeEnum(1, this.actionType_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<GeneralNotificationActionPayload, Builder> implements GeneralNotificationActionPayloadOrBuilder {
            private Builder() {
                super(GeneralNotificationActionPayload.DEFAULT_INSTANCE);
            }

            public Builder clearActionType() {
                copyOnWrite();
                ((GeneralNotificationActionPayload) this.instance).clearActionType();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.GeneralNotificationActionPayloadOrBuilder
            public GeneralNotificationActionType getActionType() {
                return ((GeneralNotificationActionPayload) this.instance).getActionType();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.GeneralNotificationActionPayloadOrBuilder
            public int getActionTypeValue() {
                return ((GeneralNotificationActionPayload) this.instance).getActionTypeValue();
            }

            public Builder setActionType(GeneralNotificationActionType generalNotificationActionType) {
                copyOnWrite();
                ((GeneralNotificationActionPayload) this.instance).setActionType(generalNotificationActionType);
                return this;
            }

            public Builder setActionTypeValue(int i) {
                copyOnWrite();
                ((GeneralNotificationActionPayload) this.instance).setActionTypeValue(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum GeneralNotificationActionType implements Internal.EnumLite {
            DISMISS(0),
            UNRECOGNIZED(-1);

            public static final int DISMISS_VALUE = 0;
            private static final Internal.EnumLiteMap<GeneralNotificationActionType> internalValueMap = new Internal.EnumLiteMap<GeneralNotificationActionType>() { // from class: com.amazon.alexa.accessory.protocol.Notification.GeneralNotificationActionPayload.GeneralNotificationActionType.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public GeneralNotificationActionType findValueByNumber(int i) {
                    return GeneralNotificationActionType.forNumber(i);
                }
            };
            private final int value;

            GeneralNotificationActionType(int i) {
                this.value = i;
            }

            public static GeneralNotificationActionType forNumber(int i) {
                if (i != 0) {
                    return null;
                }
                return DISMISS;
            }

            public static Internal.EnumLiteMap<GeneralNotificationActionType> internalGetValueMap() {
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
            public static GeneralNotificationActionType valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(GeneralNotificationActionPayload generalNotificationActionPayload) {
            return DEFAULT_INSTANCE.createBuilder(generalNotificationActionPayload);
        }

        public static GeneralNotificationActionPayload parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GeneralNotificationActionPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GeneralNotificationActionPayload parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GeneralNotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GeneralNotificationActionPayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GeneralNotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GeneralNotificationActionPayload parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GeneralNotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GeneralNotificationActionPayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GeneralNotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GeneralNotificationActionPayload parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GeneralNotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GeneralNotificationActionPayload parseFrom(InputStream inputStream) throws IOException {
            return (GeneralNotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GeneralNotificationActionPayload parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GeneralNotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GeneralNotificationActionPayload parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GeneralNotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GeneralNotificationActionPayload parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GeneralNotificationActionPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GeneralNotificationPayload extends GeneratedMessageLite<GeneralNotificationPayload, Builder> implements GeneralNotificationPayloadOrBuilder {
        private static final GeneralNotificationPayload DEFAULT_INSTANCE;
        public static final int NOTIFICATION_MESSAGE_FIELD_NUMBER = 3;
        private static volatile Parser<GeneralNotificationPayload> PARSER = null;
        public static final int SUBTITLE_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 1;
        private String title_ = "";
        private String subtitle_ = "";
        private String notificationMessage_ = "";

        static {
            GeneralNotificationPayload generalNotificationPayload = new GeneralNotificationPayload();
            DEFAULT_INSTANCE = generalNotificationPayload;
            generalNotificationPayload.makeImmutable();
        }

        private GeneralNotificationPayload() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotificationMessage() {
            this.notificationMessage_ = getDefaultInstance().getNotificationMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubtitle() {
            this.subtitle_ = getDefaultInstance().getSubtitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        public static GeneralNotificationPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GeneralNotificationPayload parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GeneralNotificationPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GeneralNotificationPayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GeneralNotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GeneralNotificationPayload> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotificationMessage(String str) {
            str.getClass();
            this.notificationMessage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotificationMessageBytes(ByteString byteString) {
            this.notificationMessage_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubtitle(String str) {
            str.getClass();
            this.subtitle_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubtitleBytes(ByteString byteString) {
            this.subtitle_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(ByteString byteString) {
            this.title_ = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GeneralNotificationPayload();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(i);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    GeneralNotificationPayload generalNotificationPayload = (GeneralNotificationPayload) obj2;
                    this.title_ = visitor.visitString(!this.title_.isEmpty(), this.title_, !generalNotificationPayload.title_.isEmpty(), generalNotificationPayload.title_);
                    this.subtitle_ = visitor.visitString(!this.subtitle_.isEmpty(), this.subtitle_, !generalNotificationPayload.subtitle_.isEmpty(), generalNotificationPayload.subtitle_);
                    this.notificationMessage_ = visitor.visitString(!this.notificationMessage_.isEmpty(), this.notificationMessage_, !generalNotificationPayload.notificationMessage_.isEmpty(), generalNotificationPayload.notificationMessage_);
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
                                    this.title_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.subtitle_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    this.notificationMessage_ = codedInputStream.readStringRequireUtf8();
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
                        synchronized (GeneralNotificationPayload.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Notification.GeneralNotificationPayloadOrBuilder
        public String getNotificationMessage() {
            return this.notificationMessage_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.GeneralNotificationPayloadOrBuilder
        public ByteString getNotificationMessageBytes() {
            return ByteString.copyFromUtf8(this.notificationMessage_);
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.title_.isEmpty() ? CodedOutputStream.computeStringSize(1, getTitle()) : 0;
            if (!this.subtitle_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(2, getSubtitle());
            }
            if (!this.notificationMessage_.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(3, getNotificationMessage());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + computeStringSize;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.GeneralNotificationPayloadOrBuilder
        public String getSubtitle() {
            return this.subtitle_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.GeneralNotificationPayloadOrBuilder
        public ByteString getSubtitleBytes() {
            return ByteString.copyFromUtf8(this.subtitle_);
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.GeneralNotificationPayloadOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.amazon.alexa.accessory.protocol.Notification.GeneralNotificationPayloadOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.title_.isEmpty()) {
                codedOutputStream.writeString(1, getTitle());
            }
            if (!this.subtitle_.isEmpty()) {
                codedOutputStream.writeString(2, getSubtitle());
            }
            if (!this.notificationMessage_.isEmpty()) {
                codedOutputStream.writeString(3, getNotificationMessage());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<GeneralNotificationPayload, Builder> implements GeneralNotificationPayloadOrBuilder {
            private Builder() {
                super(GeneralNotificationPayload.DEFAULT_INSTANCE);
            }

            public Builder clearNotificationMessage() {
                copyOnWrite();
                ((GeneralNotificationPayload) this.instance).clearNotificationMessage();
                return this;
            }

            public Builder clearSubtitle() {
                copyOnWrite();
                ((GeneralNotificationPayload) this.instance).clearSubtitle();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((GeneralNotificationPayload) this.instance).clearTitle();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.GeneralNotificationPayloadOrBuilder
            public String getNotificationMessage() {
                return ((GeneralNotificationPayload) this.instance).getNotificationMessage();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.GeneralNotificationPayloadOrBuilder
            public ByteString getNotificationMessageBytes() {
                return ((GeneralNotificationPayload) this.instance).getNotificationMessageBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.GeneralNotificationPayloadOrBuilder
            public String getSubtitle() {
                return ((GeneralNotificationPayload) this.instance).getSubtitle();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.GeneralNotificationPayloadOrBuilder
            public ByteString getSubtitleBytes() {
                return ((GeneralNotificationPayload) this.instance).getSubtitleBytes();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.GeneralNotificationPayloadOrBuilder
            public String getTitle() {
                return ((GeneralNotificationPayload) this.instance).getTitle();
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.GeneralNotificationPayloadOrBuilder
            public ByteString getTitleBytes() {
                return ((GeneralNotificationPayload) this.instance).getTitleBytes();
            }

            public Builder setNotificationMessage(String str) {
                copyOnWrite();
                ((GeneralNotificationPayload) this.instance).setNotificationMessage(str);
                return this;
            }

            public Builder setNotificationMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((GeneralNotificationPayload) this.instance).setNotificationMessageBytes(byteString);
                return this;
            }

            public Builder setSubtitle(String str) {
                copyOnWrite();
                ((GeneralNotificationPayload) this.instance).setSubtitle(str);
                return this;
            }

            public Builder setSubtitleBytes(ByteString byteString) {
                copyOnWrite();
                ((GeneralNotificationPayload) this.instance).setSubtitleBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((GeneralNotificationPayload) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((GeneralNotificationPayload) this.instance).setTitleBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(GeneralNotificationPayload generalNotificationPayload) {
            return DEFAULT_INSTANCE.createBuilder(generalNotificationPayload);
        }

        public static GeneralNotificationPayload parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GeneralNotificationPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GeneralNotificationPayload parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GeneralNotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GeneralNotificationPayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GeneralNotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GeneralNotificationPayload parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GeneralNotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GeneralNotificationPayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GeneralNotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GeneralNotificationPayload parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GeneralNotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GeneralNotificationPayload parseFrom(InputStream inputStream) throws IOException {
            return (GeneralNotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GeneralNotificationPayload parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GeneralNotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GeneralNotificationPayload parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GeneralNotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GeneralNotificationPayload parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GeneralNotificationPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class RemoveNotification extends GeneratedMessageLite<RemoveNotification, Builder> implements RemoveNotificationOrBuilder {
        private static final RemoveNotification DEFAULT_INSTANCE;
        public static final int NOTIFICATION_UID_FIELD_NUMBER = 1;
        private static volatile Parser<RemoveNotification> PARSER;
        private int notificationUid_;

        static {
            RemoveNotification removeNotification = new RemoveNotification();
            DEFAULT_INSTANCE = removeNotification;
            removeNotification.makeImmutable();
        }

        private RemoveNotification() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotificationUid() {
            this.notificationUid_ = 0;
        }

        public static RemoveNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RemoveNotification parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RemoveNotification) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RemoveNotification parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RemoveNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RemoveNotification> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotificationUid(int i) {
            this.notificationUid_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Object[] objArr = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RemoveNotification();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                case 10:
                    return null;
                case 4:
                    return new Builder(false ? 1 : 0);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    RemoveNotification removeNotification = (RemoveNotification) obj2;
                    int i = this.notificationUid_;
                    boolean z = i != 0;
                    int i2 = removeNotification.notificationUid_;
                    this.notificationUid_ = visitor.visitInt(z, i, i2 != 0, i2);
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
                                    this.notificationUid_ = codedInputStream.readUInt32();
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
                        synchronized (RemoveNotification.class) {
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

        @Override // com.amazon.alexa.accessory.protocol.Notification.RemoveNotificationOrBuilder
        public int getNotificationUid() {
            return this.notificationUid_;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.notificationUid_;
            int serializedSize = this.unknownFields.getSerializedSize() + (i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0);
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.notificationUid_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder extends GeneratedMessageLite.Builder<RemoveNotification, Builder> implements RemoveNotificationOrBuilder {
            private Builder() {
                super(RemoveNotification.DEFAULT_INSTANCE);
            }

            public Builder clearNotificationUid() {
                copyOnWrite();
                ((RemoveNotification) this.instance).clearNotificationUid();
                return this;
            }

            @Override // com.amazon.alexa.accessory.protocol.Notification.RemoveNotificationOrBuilder
            public int getNotificationUid() {
                return ((RemoveNotification) this.instance).getNotificationUid();
            }

            public Builder setNotificationUid(int i) {
                copyOnWrite();
                ((RemoveNotification) this.instance).setNotificationUid(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(RemoveNotification removeNotification) {
            return DEFAULT_INSTANCE.createBuilder(removeNotification);
        }

        public static RemoveNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RemoveNotification) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RemoveNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RemoveNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RemoveNotification parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RemoveNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RemoveNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RemoveNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RemoveNotification parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RemoveNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RemoveNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RemoveNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RemoveNotification parseFrom(InputStream inputStream) throws IOException {
            return (RemoveNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RemoveNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RemoveNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RemoveNotification parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RemoveNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RemoveNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RemoveNotification) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
