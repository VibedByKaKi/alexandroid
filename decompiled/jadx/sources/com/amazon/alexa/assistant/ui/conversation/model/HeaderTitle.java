package com.amazon.alexa.assistant.ui.conversation.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.voice.tta.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderTitle;", "", "<init>", "()V", Constants.Namespaces.TEXT, "Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderTitle$Text;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class HeaderTitle {
    public static final int $stable = 0;

    public /* synthetic */ HeaderTitle(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private HeaderTitle() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderTitle$Text;", "Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderTitle;", "text", "", "alignment", "Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderTitle$Text$Alignment;", "textType", "Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderTitle$Text$TextType;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderTitle$Text$Alignment;Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderTitle$Text$TextType;)V", "getText", "()Ljava/lang/String;", "getAlignment", "()Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderTitle$Text$Alignment;", "getTextType", "()Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderTitle$Text$TextType;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "TextType", "Alignment", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Text extends HeaderTitle {
        public static final int $stable = 0;

        @NotNull
        private final Alignment alignment;

        @NotNull
        private final String text;

        @NotNull
        private final TextType textType;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderTitle$Text$Alignment;", "", "<init>", "(Ljava/lang/String;I)V", "START", "MIDDLE", "END", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Alignment {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Alignment[] $VALUES;
            public static final Alignment START = new Alignment("START", 0);
            public static final Alignment MIDDLE = new Alignment("MIDDLE", 1);
            public static final Alignment END = new Alignment("END", 2);

            private static final /* synthetic */ Alignment[] $values() {
                return new Alignment[]{START, MIDDLE, END};
            }

            static {
                Alignment[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            private Alignment(String str, int i) {
            }

            @NotNull
            public static EnumEntries<Alignment> getEntries() {
                return $ENTRIES;
            }

            public static Alignment valueOf(String str) {
                return (Alignment) Enum.valueOf(Alignment.class, str);
            }

            public static Alignment[] values() {
                return (Alignment[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderTitle$Text$TextType;", "", "<init>", "(Ljava/lang/String;I)V", "STATIC", "DYNAMIC", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class TextType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ TextType[] $VALUES;
            public static final TextType STATIC = new TextType("STATIC", 0);
            public static final TextType DYNAMIC = new TextType("DYNAMIC", 1);

            private static final /* synthetic */ TextType[] $values() {
                return new TextType[]{STATIC, DYNAMIC};
            }

            static {
                TextType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            private TextType(String str, int i) {
            }

            @NotNull
            public static EnumEntries<TextType> getEntries() {
                return $ENTRIES;
            }

            public static TextType valueOf(String str) {
                return (TextType) Enum.valueOf(TextType.class, str);
            }

            public static TextType[] values() {
                return (TextType[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Text(String str, Alignment alignment, TextType textType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Alignment.MIDDLE : alignment, (i & 4) != 0 ? TextType.DYNAMIC : textType);
        }

        public static /* synthetic */ Text copy$default(Text text, String str, Alignment alignment, TextType textType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.text;
            }
            if ((i & 2) != 0) {
                alignment = text.alignment;
            }
            if ((i & 4) != 0) {
                textType = text.textType;
            }
            return text.copy(str, alignment, textType);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Alignment getAlignment() {
            return this.alignment;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextType getTextType() {
            return this.textType;
        }

        @NotNull
        public final Text copy(@NotNull String text, @NotNull Alignment alignment, @NotNull TextType textType) {
            text.getClass();
            alignment.getClass();
            textType.getClass();
            return new Text(text, alignment, textType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return Intrinsics.areEqual(this.text, text.text) && this.alignment == text.alignment && this.textType == text.textType;
        }

        @NotNull
        public final Alignment getAlignment() {
            return this.alignment;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final TextType getTextType() {
            return this.textType;
        }

        public int hashCode() {
            return this.textType.hashCode() + ((this.alignment.hashCode() + (this.text.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "Text(text=" + this.text + ", alignment=" + this.alignment + ", textType=" + this.textType + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        public Text() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(@NotNull String str, @NotNull Alignment alignment, @NotNull TextType textType) {
            super(null);
            str.getClass();
            alignment.getClass();
            textType.getClass();
            this.text = str;
            this.alignment = alignment;
            this.textType = textType;
        }
    }
}
