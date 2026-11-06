package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/HeaderUiText;", "", "text", "", "textType", "Lcom/amazon/alexa/ra/core/data/model/HeaderUiText$TextType;", "alignment", "Lcom/amazon/alexa/ra/core/data/model/HeaderTitleAlignment;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/model/HeaderUiText$TextType;Lcom/amazon/alexa/ra/core/data/model/HeaderTitleAlignment;)V", "getText", "()Ljava/lang/String;", "getTextType", "()Lcom/amazon/alexa/ra/core/data/model/HeaderUiText$TextType;", "getAlignment", "()Lcom/amazon/alexa/ra/core/data/model/HeaderTitleAlignment;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "TextType", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class HeaderUiText {
    public static final int $stable = 0;

    @NotNull
    private final HeaderTitleAlignment alignment;

    @NotNull
    private final String text;

    @NotNull
    private final TextType textType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/HeaderUiText$TextType;", "", "<init>", "(Ljava/lang/String;I)V", "STATIC", "DYNAMIC", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public /* synthetic */ HeaderUiText(String str, TextType textType, HeaderTitleAlignment headerTitleAlignment, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TextType.DYNAMIC : textType, (i & 4) != 0 ? HeaderTitleAlignment.CENTER : headerTitleAlignment);
    }

    public static /* synthetic */ HeaderUiText copy$default(HeaderUiText headerUiText, String str, TextType textType, HeaderTitleAlignment headerTitleAlignment, int i, Object obj) {
        if ((i & 1) != 0) {
            str = headerUiText.text;
        }
        if ((i & 2) != 0) {
            textType = headerUiText.textType;
        }
        if ((i & 4) != 0) {
            headerTitleAlignment = headerUiText.alignment;
        }
        return headerUiText.copy(str, textType, headerTitleAlignment);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextType getTextType() {
        return this.textType;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final HeaderTitleAlignment getAlignment() {
        return this.alignment;
    }

    @NotNull
    public final HeaderUiText copy(@NotNull String text, @NotNull TextType textType, @NotNull HeaderTitleAlignment alignment) {
        text.getClass();
        textType.getClass();
        alignment.getClass();
        return new HeaderUiText(text, textType, alignment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderUiText)) {
            return false;
        }
        HeaderUiText headerUiText = (HeaderUiText) other;
        return Intrinsics.areEqual(this.text, headerUiText.text) && this.textType == headerUiText.textType && this.alignment == headerUiText.alignment;
    }

    @NotNull
    public final HeaderTitleAlignment getAlignment() {
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
        return this.alignment.hashCode() + ((this.textType.hashCode() + (this.text.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "HeaderUiText(text=" + this.text + ", textType=" + this.textType + ", alignment=" + this.alignment + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public HeaderUiText(@NotNull String str, @NotNull TextType textType, @NotNull HeaderTitleAlignment headerTitleAlignment) {
        str.getClass();
        textType.getClass();
        headerTitleAlignment.getClass();
        this.text = str;
        this.textType = textType;
        this.alignment = headerTitleAlignment;
    }

    public HeaderUiText() {
        this(null, null, null, 7, null);
    }
}
