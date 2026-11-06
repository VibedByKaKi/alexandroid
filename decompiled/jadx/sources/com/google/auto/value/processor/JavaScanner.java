package com.google.auto.value.processor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class JavaScanner {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final String s;

    public JavaScanner(String str) {
        this.s = str.endsWith("\n") ? str : str.concat("\n");
    }

    private int blockCommentEnd(int i) {
        int i2 = i + 2;
        while (true) {
            if (this.s.charAt(i2) == '*' && this.s.charAt(i2 + 1) == '/') {
                return i2 + 2;
            }
            i2++;
        }
    }

    private int lineCommentEnd(int i) {
        return this.s.indexOf(10, i + 2);
    }

    private int quoteEnd(int i) {
        char charAt = this.s.charAt(i);
        while (true) {
            i++;
            if (this.s.charAt(i) == charAt) {
                return i + 1;
            }
            if (this.s.charAt(i) == '\\') {
                i++;
            }
        }
    }

    private int spaceEnd(int i) {
        do {
            i++;
            if (i >= this.s.length()) {
                break;
            }
        } while (this.s.charAt(i) == ' ');
        return i;
    }

    public String string() {
        return this.s;
    }

    public int tokenEnd(int i) {
        int length = this.s.length();
        String str = this.s;
        if (i >= length) {
            return str.length();
        }
        char charAt = str.charAt(i);
        if (charAt == '\n' || charAt == ' ') {
            return spaceEnd(i);
        }
        if (charAt != '\"' && charAt != '\'') {
            if (charAt == '/') {
                int i2 = i + 1;
                return this.s.charAt(i2) == '*' ? blockCommentEnd(i) : this.s.charAt(i2) == '/' ? lineCommentEnd(i) : i2;
            }
            if (charAt != '`') {
                return i + 1;
            }
        }
        return quoteEnd(i);
    }
}
