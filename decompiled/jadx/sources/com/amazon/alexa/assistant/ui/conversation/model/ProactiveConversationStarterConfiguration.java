package com.amazon.alexa.assistant.ui.conversation.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/ProactiveConversationStarterConfiguration;", "", "contentModelGroup", "Lcom/amazon/alexa/assistant/ui/conversation/model/ProactiveConversationStarterConfiguration$ContentModelGroup;", "<init>", "(Lcom/amazon/alexa/assistant/ui/conversation/model/ProactiveConversationStarterConfiguration$ContentModelGroup;)V", "getContentModelGroup", "()Lcom/amazon/alexa/assistant/ui/conversation/model/ProactiveConversationStarterConfiguration$ContentModelGroup;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ContentModelGroup", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ProactiveConversationStarterConfiguration {
    public static final int $stable = 0;

    @NotNull
    private final ContentModelGroup contentModelGroup;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/ProactiveConversationStarterConfiguration$ContentModelGroup;", "", "wireValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getWireValue$ui_release", "()Ljava/lang/String;", "SMALL_TEXT", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentModelGroup {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ContentModelGroup[] $VALUES;
        public static final ContentModelGroup SMALL_TEXT = new ContentModelGroup("SMALL_TEXT", 0, "HELIX_SMALL_TEXT_CONVERSATION_STARTERS_GROUP");

        @NotNull
        private final String wireValue;

        private static final /* synthetic */ ContentModelGroup[] $values() {
            return new ContentModelGroup[]{SMALL_TEXT};
        }

        static {
            ContentModelGroup[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private ContentModelGroup(String str, int i, String str2) {
            this.wireValue = str2;
        }

        @NotNull
        public static EnumEntries<ContentModelGroup> getEntries() {
            return $ENTRIES;
        }

        public static ContentModelGroup valueOf(String str) {
            return (ContentModelGroup) Enum.valueOf(ContentModelGroup.class, str);
        }

        public static ContentModelGroup[] values() {
            return (ContentModelGroup[]) $VALUES.clone();
        }

        @NotNull
        /* renamed from: getWireValue$ui_release, reason: from getter */
        public final String getWireValue() {
            return this.wireValue;
        }
    }

    public ProactiveConversationStarterConfiguration(@NotNull ContentModelGroup contentModelGroup) {
        contentModelGroup.getClass();
        this.contentModelGroup = contentModelGroup;
    }

    public static /* synthetic */ ProactiveConversationStarterConfiguration copy$default(ProactiveConversationStarterConfiguration proactiveConversationStarterConfiguration, ContentModelGroup contentModelGroup, int i, Object obj) {
        if ((i & 1) != 0) {
            contentModelGroup = proactiveConversationStarterConfiguration.contentModelGroup;
        }
        return proactiveConversationStarterConfiguration.copy(contentModelGroup);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ContentModelGroup getContentModelGroup() {
        return this.contentModelGroup;
    }

    @NotNull
    public final ProactiveConversationStarterConfiguration copy(@NotNull ContentModelGroup contentModelGroup) {
        contentModelGroup.getClass();
        return new ProactiveConversationStarterConfiguration(contentModelGroup);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProactiveConversationStarterConfiguration) && this.contentModelGroup == ((ProactiveConversationStarterConfiguration) other).contentModelGroup;
    }

    @NotNull
    public final ContentModelGroup getContentModelGroup() {
        return this.contentModelGroup;
    }

    public int hashCode() {
        return this.contentModelGroup.hashCode();
    }

    @NotNull
    public String toString() {
        return "ProactiveConversationStarterConfiguration(contentModelGroup=" + this.contentModelGroup + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
