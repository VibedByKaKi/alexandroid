package com.google.googlejavaformat.java.javadoc;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class Token {
    private final Type type;
    private final String value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        BEGIN_JAVADOC,
        END_JAVADOC,
        FOOTER_JAVADOC_TAG_START,
        LIST_OPEN_TAG,
        LIST_CLOSE_TAG,
        LIST_ITEM_OPEN_TAG,
        LIST_ITEM_CLOSE_TAG,
        HEADER_OPEN_TAG,
        HEADER_CLOSE_TAG,
        PARAGRAPH_OPEN_TAG,
        PARAGRAPH_CLOSE_TAG,
        BLOCKQUOTE_OPEN_TAG,
        BLOCKQUOTE_CLOSE_TAG,
        PRE_OPEN_TAG,
        PRE_CLOSE_TAG,
        CODE_OPEN_TAG,
        CODE_CLOSE_TAG,
        TABLE_OPEN_TAG,
        TABLE_CLOSE_TAG,
        MOE_BEGIN_STRIP_COMMENT,
        MOE_END_STRIP_COMMENT,
        HTML_COMMENT,
        BR_TAG,
        WHITESPACE,
        FORCED_NEWLINE,
        OPTIONAL_LINE_BREAK,
        LITERAL
    }

    public Token(Type type, String str) {
        this.type = type;
        this.value = str;
    }

    public Type getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public int length() {
        return this.value.length();
    }

    public String toString() {
        return "\n" + getType() + ": " + getValue();
    }
}
