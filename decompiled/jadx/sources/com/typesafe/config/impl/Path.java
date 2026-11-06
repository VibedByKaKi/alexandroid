package com.typesafe.config.impl;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class Path {
    private final String first;
    private final Path remainder;

    public Path(Iterator<Path> it2) {
        if (!it2.hasNext()) {
            CodecsKt$$ExternalSyntheticBUOutline0.m("empty path");
            throw null;
        }
        Path next = it2.next();
        this.first = next.first;
        PathBuilder pathBuilder = new PathBuilder();
        Path path = next.remainder;
        if (path != null) {
            pathBuilder.appendPath(path);
        }
        while (it2.hasNext()) {
            pathBuilder.appendPath(it2.next());
        }
        this.remainder = pathBuilder.result();
    }

    private void appendToStringBuilder(StringBuilder sb) {
        if (hasFunkyChars(this.first) || this.first.isEmpty()) {
            sb.append(ConfigImplUtil.renderJsonString(this.first));
        } else {
            sb.append(this.first);
        }
        if (this.remainder != null) {
            sb.append(".");
            this.remainder.appendToStringBuilder(sb);
        }
    }

    public static boolean hasFunkyChars(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (!Character.isLetterOrDigit(charAt) && charAt != '-' && charAt != '_') {
                return true;
            }
        }
        return false;
    }

    public static Path newKey(String str) {
        return new Path(str, null);
    }

    public static Path newPath(String str) {
        return PathParser.parsePath(str);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Path) {
            Path path = (Path) obj;
            if (this.first.equals(path.first) && ConfigImplUtil.equalsHandlingNull(this.remainder, path.remainder)) {
                return true;
            }
        }
        return false;
    }

    public String first() {
        return this.first;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(41, 41, this.first);
        Path path = this.remainder;
        return m + (path == null ? 0 : path.hashCode());
    }

    public String last() {
        while (true) {
            Path path = this.remainder;
            if (path == null) {
                return this.first;
            }
            this = path;
        }
    }

    public int length() {
        int i = 1;
        for (Path path = this.remainder; path != null; path = path.remainder) {
            i++;
        }
        return i;
    }

    public Path parent() {
        if (this.remainder == null) {
            return null;
        }
        PathBuilder pathBuilder = new PathBuilder();
        while (this.remainder != null) {
            pathBuilder.appendKey(this.first);
            this = this.remainder;
        }
        return pathBuilder.result();
    }

    public Path prepend(Path path) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.appendPath(path);
        pathBuilder.appendPath(this);
        return pathBuilder.result();
    }

    public Path remainder() {
        return this.remainder;
    }

    public String render() {
        StringBuilder sb = new StringBuilder();
        appendToStringBuilder(sb);
        return sb.toString();
    }

    public boolean startsWith(Path path) {
        if (path.length() > length()) {
            return false;
        }
        while (path != null) {
            if (!path.first().equals(this.first())) {
                return false;
            }
            this = this.remainder();
            path = path.remainder();
        }
        return true;
    }

    public Path subPath(int i, int i2) {
        if (i2 < i) {
            CodecsKt$$ExternalSyntheticBUOutline0.m("bad call to subPath");
            return null;
        }
        Path subPath = subPath(i);
        PathBuilder pathBuilder = new PathBuilder();
        int i3 = i2 - i;
        while (i3 > 0) {
            i3--;
            pathBuilder.appendKey(subPath.first());
            subPath = subPath.remainder();
            if (subPath == null) {
                CodecsKt$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m(i2, "subPath lastIndex out of range "));
                return null;
            }
        }
        return pathBuilder.result();
    }

    public String toString() {
        StringBuilder m = BitVector$$ExternalSyntheticOutline0.m("Path(");
        appendToStringBuilder(m);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public Path subPath(int i) {
        while (this != null && i > 0) {
            i--;
            this = this.remainder;
        }
        return this;
    }

    public Path(String... strArr) {
        if (strArr.length != 0) {
            this.first = strArr[0];
            if (strArr.length > 1) {
                PathBuilder pathBuilder = new PathBuilder();
                for (int i = 1; i < strArr.length; i++) {
                    pathBuilder.appendKey(strArr[i]);
                }
                this.remainder = pathBuilder.result();
                return;
            }
            this.remainder = null;
            return;
        }
        CodecsKt$$ExternalSyntheticBUOutline0.m("empty path");
        throw null;
    }

    public Path(List<Path> list) {
        this(list.iterator());
    }

    public Path(String str, Path path) {
        this.first = str;
        this.remainder = path;
    }
}
