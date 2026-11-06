package com.typesafe.config.impl;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class MemoKey {
    private final Path restrictToChildOrNull;
    private final AbstractConfigValue value;

    public MemoKey(AbstractConfigValue abstractConfigValue, Path path) {
        this.value = abstractConfigValue;
        this.restrictToChildOrNull = path;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MemoKey) {
            MemoKey memoKey = (MemoKey) obj;
            if (memoKey.value != this.value) {
                return false;
            }
            Path path = memoKey.restrictToChildOrNull;
            Path path2 = this.restrictToChildOrNull;
            if (path == path2) {
                return true;
            }
            if (path != null && path2 != null) {
                return path.equals(path2);
            }
        }
        return false;
    }

    public final int hashCode() {
        int identityHashCode = System.identityHashCode(this.value);
        Path path = this.restrictToChildOrNull;
        return path != null ? ((path.hashCode() + 41) * 41) + identityHashCode : identityHashCode;
    }

    public final String toString() {
        return "MemoKey(" + this.value + "@" + System.identityHashCode(this.value) + "," + this.restrictToChildOrNull + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
