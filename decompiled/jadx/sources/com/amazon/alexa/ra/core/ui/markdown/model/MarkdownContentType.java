package com.amazon.alexa.ra.core.ui.markdown.model;

import com.amazon.deecomms.common.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/markdown/model/MarkdownContentType;", "", "<init>", "(Ljava/lang/String;I)V", "HEADING", "PARAGRAPH", "LIST", "CODE_BLOCK", "BLOCKQUOTE", "TABLE", "THEMATIC_BREAK", "HTML_BLOCK", Constants.Calling.MEDIA_STREAM_TYPE_TEXT, "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class MarkdownContentType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MarkdownContentType[] $VALUES;
    public static final MarkdownContentType HEADING = new MarkdownContentType("HEADING", 0);
    public static final MarkdownContentType PARAGRAPH = new MarkdownContentType("PARAGRAPH", 1);
    public static final MarkdownContentType LIST = new MarkdownContentType("LIST", 2);
    public static final MarkdownContentType CODE_BLOCK = new MarkdownContentType("CODE_BLOCK", 3);
    public static final MarkdownContentType BLOCKQUOTE = new MarkdownContentType("BLOCKQUOTE", 4);
    public static final MarkdownContentType TABLE = new MarkdownContentType("TABLE", 5);
    public static final MarkdownContentType THEMATIC_BREAK = new MarkdownContentType("THEMATIC_BREAK", 6);
    public static final MarkdownContentType HTML_BLOCK = new MarkdownContentType("HTML_BLOCK", 7);
    public static final MarkdownContentType TEXT = new MarkdownContentType(Constants.Calling.MEDIA_STREAM_TYPE_TEXT, 8);

    private static final /* synthetic */ MarkdownContentType[] $values() {
        return new MarkdownContentType[]{HEADING, PARAGRAPH, LIST, CODE_BLOCK, BLOCKQUOTE, TABLE, THEMATIC_BREAK, HTML_BLOCK, TEXT};
    }

    static {
        MarkdownContentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private MarkdownContentType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<MarkdownContentType> getEntries() {
        return $ENTRIES;
    }

    public static MarkdownContentType valueOf(String str) {
        return (MarkdownContentType) Enum.valueOf(MarkdownContentType.class, str);
    }

    public static MarkdownContentType[] values() {
        return (MarkdownContentType[]) $VALUES.clone();
    }
}
