package org.commonmark.internal;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
class BlockContent {
    private int lineCount;
    private final StringBuilder sb;

    public BlockContent() {
        this.lineCount = 0;
        this.sb = new StringBuilder();
    }

    public void add(CharSequence charSequence) {
        if (this.lineCount != 0) {
            this.sb.append('\n');
        }
        this.sb.append(charSequence);
        this.lineCount++;
    }

    public String getString() {
        return this.sb.toString();
    }

    public BlockContent(String str) {
        this.lineCount = 0;
        this.sb = new StringBuilder(str);
    }
}
