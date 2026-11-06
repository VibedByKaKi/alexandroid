package com.google.googlejavaformat.java;

import com.google.errorprone.annotations.Immutable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Immutable
/* loaded from: classes8.dex */
public class JavaFormatterOptions {
    static final int DEFAULT_MAX_LINE_LENGTH = 100;
    private final Style style;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private Style style;

        private Builder() {
            this.style = Style.GOOGLE;
        }

        public JavaFormatterOptions build() {
            return new JavaFormatterOptions(this.style);
        }

        public Builder style(Style style) {
            this.style = style;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Style {
        GOOGLE(1),
        AOSP(2);

        private final int indentationMultiplier;

        Style(int i) {
            this.indentationMultiplier = i;
        }

        public int indentationMultiplier() {
            return this.indentationMultiplier;
        }
    }

    private JavaFormatterOptions(Style style) {
        this.style = style;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JavaFormatterOptions defaultOptions() {
        return builder().build();
    }

    public int indentationMultiplier() {
        return this.style.indentationMultiplier();
    }

    public int maxLineLength() {
        return 100;
    }
}
