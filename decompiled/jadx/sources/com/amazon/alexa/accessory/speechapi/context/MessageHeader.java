package com.amazon.alexa.accessory.speechapi.context;

import android.text.TextUtils;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB7\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/context/MessageHeader;", "", "namespace", "", "name", "messageId", "correlationToken", "payloadVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCorrelationToken", "()Ljava/lang/String;", "getMessageId", "getName", "getNamespace", "getPayloadVersion", "Companion", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessageHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageHeader.kt\ncom/amazon/alexa/accessory/speechapi/context/MessageHeader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
/* loaded from: classes16.dex */
public final class MessageHeader {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String correlationToken;

    @NotNull
    private final String messageId;

    @NotNull
    private final String name;

    @NotNull
    private final String namespace;

    @Nullable
    private final String payloadVersion;

    private MessageHeader(String str, String str2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            Single$$ExternalSyntheticBUOutline0.m$2("The provided namespace was null or empty");
            throw null;
        }
        if (TextUtils.isEmpty(str2)) {
            Single$$ExternalSyntheticBUOutline0.m$2("The provided name was null or empty");
            throw null;
        }
        this.namespace = str;
        this.name = str2;
        this.messageId = str3;
        this.correlationToken = str4;
        this.payloadVersion = str5;
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final MessageHeader create(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5) {
        return INSTANCE.create(str, str2, str3, str4, str5);
    }

    @Nullable
    public final String getCorrelationToken() {
        return this.correlationToken;
    }

    @NotNull
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNamespace() {
        return this.namespace;
    }

    @Nullable
    public final String getPayloadVersion() {
        return this.payloadVersion;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0007J\b\u0010\u000b\u001a\u00020\u0006H\u0002¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/context/MessageHeader$Companion;", "", "()V", "create", "Lcom/amazon/alexa/accessory/speechapi/context/MessageHeader;", "namespace", "", "name", "messageId", "correlationToken", "payloadVersion", "generateMessageId", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ MessageHeader create$default(Companion companion, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 4) != 0) {
                str3 = companion.generateMessageId();
            }
            return companion.create(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
        }

        private final String generateMessageId() {
            return TableInfo$$ExternalSyntheticOutline0.m();
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final MessageHeader create(@NotNull String namespace, @NotNull String name, @NotNull String messageId, @Nullable String correlationToken, @Nullable String payloadVersion) {
            namespace.getClass();
            name.getClass();
            messageId.getClass();
            return TextUtils.isEmpty(messageId) ? new MessageHeader(namespace, name, generateMessageId(), correlationToken, payloadVersion, null) : new MessageHeader(namespace, name, messageId, correlationToken, payloadVersion, null);
        }

        private Companion() {
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final MessageHeader create(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str3);
            return create$default(this, str, str2, str3, null, null, 24, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final MessageHeader create(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4) {
            ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str3);
            return create$default(this, str, str2, str3, str4, null, 16, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final MessageHeader create(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            return create$default(this, str, str2, null, null, null, 28, null);
        }
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final MessageHeader create(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return INSTANCE.create(str, str2, str3);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final MessageHeader create(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4) {
        return INSTANCE.create(str, str2, str3, str4);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final MessageHeader create(@NotNull String str, @NotNull String str2) {
        return INSTANCE.create(str, str2);
    }

    public /* synthetic */ MessageHeader(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public /* synthetic */ MessageHeader(String str, String str2, String str3, String str4, String str5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5);
    }
}
