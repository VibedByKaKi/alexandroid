package com.amazon.alexa.assistant.foundation.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.voice.tta.Constants;
import java.io.Closeable;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/EventAttachment;", "Ljava/io/Closeable;", "inputStream", "Ljava/io/InputStream;", "contentType", "Lcom/amazon/alexa/assistant/foundation/model/EventAttachment$ContentType;", "contentName", "Lcom/amazon/alexa/assistant/foundation/model/EventAttachment$ContentName;", "<init>", "(Ljava/io/InputStream;Lcom/amazon/alexa/assistant/foundation/model/EventAttachment$ContentType;Lcom/amazon/alexa/assistant/foundation/model/EventAttachment$ContentName;)V", "getInputStream", "()Ljava/io/InputStream;", "getContentType", "()Lcom/amazon/alexa/assistant/foundation/model/EventAttachment$ContentType;", "getContentName", "()Lcom/amazon/alexa/assistant/foundation/model/EventAttachment$ContentName;", "close", "", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ContentName", "ContentType", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class EventAttachment implements Closeable {

    @NotNull
    private final ContentName contentName;

    @NotNull
    private final ContentType contentType;

    @NotNull
    private final InputStream inputStream;

    public EventAttachment(@NotNull InputStream inputStream, @NotNull ContentType contentType, @NotNull ContentName contentName) {
        inputStream.getClass();
        contentType.getClass();
        contentName.getClass();
        this.inputStream = inputStream;
        this.contentType = contentType;
        this.contentName = contentName;
    }

    public static /* synthetic */ EventAttachment copy$default(EventAttachment eventAttachment, InputStream inputStream, ContentType contentType, ContentName contentName, int i, Object obj) {
        if ((i & 1) != 0) {
            inputStream = eventAttachment.inputStream;
        }
        if ((i & 2) != 0) {
            contentType = eventAttachment.contentType;
        }
        if ((i & 4) != 0) {
            contentName = eventAttachment.contentName;
        }
        return eventAttachment.copy(inputStream, contentType, contentName);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inputStream.close();
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InputStream getInputStream() {
        return this.inputStream;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ContentType getContentType() {
        return this.contentType;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ContentName getContentName() {
        return this.contentName;
    }

    @NotNull
    public final EventAttachment copy(@NotNull InputStream inputStream, @NotNull ContentType contentType, @NotNull ContentName contentName) {
        inputStream.getClass();
        contentType.getClass();
        contentName.getClass();
        return new EventAttachment(inputStream, contentType, contentName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventAttachment)) {
            return false;
        }
        EventAttachment eventAttachment = (EventAttachment) other;
        return Intrinsics.areEqual(this.inputStream, eventAttachment.inputStream) && this.contentType == eventAttachment.contentType && this.contentName == eventAttachment.contentName;
    }

    @NotNull
    public final ContentName getContentName() {
        return this.contentName;
    }

    @NotNull
    public final ContentType getContentType() {
        return this.contentType;
    }

    @NotNull
    public final InputStream getInputStream() {
        return this.inputStream;
    }

    public int hashCode() {
        return this.contentName.hashCode() + ((this.contentType.hashCode() + (this.inputStream.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "EventAttachment(inputStream=" + this.inputStream + ", contentType=" + this.contentType + ", contentName=" + this.contentName + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/EventAttachment$ContentName;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Audio", "WakewordMetadata", Constants.Namespaces.TEXT, "Companion", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentName {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ContentName[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @NotNull
        private final String value;
        public static final ContentName Audio = new ContentName("Audio", 0, "audio");
        public static final ContentName WakewordMetadata = new ContentName("WakewordMetadata", 1, "wakewordEngineMetadata");
        public static final ContentName Text = new ContentName(Constants.Namespaces.TEXT, 2, "text");

        private static final /* synthetic */ ContentName[] $values() {
            return new ContentName[]{Audio, WakewordMetadata, Text};
        }

        static {
            ContentName[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            INSTANCE = new Companion(null);
        }

        private ContentName(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<ContentName> getEntries() {
            return $ENTRIES;
        }

        public static ContentName valueOf(String str) {
            return (ContentName) Enum.valueOf(ContentName.class, str);
        }

        public static ContentName[] values() {
            return (ContentName[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/EventAttachment$ContentName$Companion;", "", "<init>", "()V", "fromString", "Lcom/amazon/alexa/assistant/foundation/model/EventAttachment$ContentName;", "value", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nEventAttachment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventAttachment.kt\ncom/amazon/alexa/assistant/foundation/model/EventAttachment$ContentName$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final ContentName fromString(@NotNull String value) {
                value.getClass();
                for (ContentName contentName : ContentName.values()) {
                    if (Intrinsics.areEqual(contentName.getValue(), value)) {
                        return contentName;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/EventAttachment$ContentType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "OctetStream", "Utf8Json", "Companion", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final ContentType OctetStream = new ContentType("OctetStream", 0, "application/octet-stream");
        public static final ContentType Utf8Json = new ContentType("Utf8Json", 1, "application/json; charset=UTF-8");

        @NotNull
        private final String value;

        private static final /* synthetic */ ContentType[] $values() {
            return new ContentType[]{OctetStream, Utf8Json};
        }

        static {
            ContentType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            INSTANCE = new Companion(null);
        }

        private ContentType(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<ContentType> getEntries() {
            return $ENTRIES;
        }

        public static ContentType valueOf(String str) {
            return (ContentType) Enum.valueOf(ContentType.class, str);
        }

        public static ContentType[] values() {
            return (ContentType[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/EventAttachment$ContentType$Companion;", "", "<init>", "()V", "fromString", "Lcom/amazon/alexa/assistant/foundation/model/EventAttachment$ContentType;", "value", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nEventAttachment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventAttachment.kt\ncom/amazon/alexa/assistant/foundation/model/EventAttachment$ContentType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final ContentType fromString(@NotNull String value) {
                value.getClass();
                for (ContentType contentType : ContentType.values()) {
                    if (Intrinsics.areEqual(contentType.getValue(), value)) {
                        return contentType;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }
    }

    public /* synthetic */ EventAttachment(InputStream inputStream, ContentType contentType, ContentName contentName, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(inputStream, (i & 2) != 0 ? ContentType.OctetStream : contentType, (i & 4) != 0 ? ContentName.Audio : contentName);
    }
}
