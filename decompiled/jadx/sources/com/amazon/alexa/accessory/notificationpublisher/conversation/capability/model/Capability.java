package com.amazon.alexa.accessory.notificationpublisher.conversation.capability.model;

import com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.TextMessageSendingIntentWire;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/Capability;", "", "wireName", "", "metricLabel", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getWireName", "()Ljava/lang/String;", "getMetricLabel", TextMessageSendingIntentWire.TYPE, "Companion", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class Capability {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Capability[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final Capability TEXT_MESSAGE_SENDING = new Capability(TextMessageSendingIntentWire.TYPE, 0, TextMessageSendingIntentWire.TYPE, "textMessageSending");

    @NotNull
    private final String metricLabel;

    @NotNull
    private final String wireName;

    private static final /* synthetic */ Capability[] $values() {
        return new Capability[]{TEXT_MESSAGE_SENDING};
    }

    static {
        Capability[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private Capability(String str, int i, String str2, String str3) {
        this.wireName = str2;
        this.metricLabel = str3;
    }

    @JvmStatic
    @Nullable
    public static final Capability fromWireName(@NotNull String str) {
        return INSTANCE.fromWireName(str);
    }

    @NotNull
    public static EnumEntries<Capability> getEntries() {
        return $ENTRIES;
    }

    public static Capability valueOf(String str) {
        return (Capability) Enum.valueOf(Capability.class, str);
    }

    public static Capability[] values() {
        return (Capability[]) $VALUES.clone();
    }

    @NotNull
    public final String getMetricLabel() {
        return this.metricLabel;
    }

    @NotNull
    public final String getWireName() {
        return this.wireName;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/Capability$Companion;", "", "<init>", "()V", "fromWireName", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/Capability;", "wireName", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCapability.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Capability.kt\ncom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/Capability$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,36:1\n1282#2,2:37\n*S KotlinDebug\n*F\n+ 1 Capability.kt\ncom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/Capability$Companion\n*L\n33#1:37,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final Capability fromWireName(@NotNull String wireName) {
            wireName.getClass();
            for (Capability capability : Capability.values()) {
                if (Intrinsics.areEqual(capability.getWireName(), wireName)) {
                    return capability;
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}
