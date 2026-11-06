package org.openjdk.tools.javac.util;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class Pair<A, B> {
    public final A fst;
    public final B snd;

    public Pair(A a2, B b) {
        this.fst = a2;
        this.snd = b;
    }

    public static <A, B> Pair<A, B> of(A a2, B b) {
        return new Pair<>(a2, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Objects.equals(this.fst, pair.fst) && Objects.equals(this.snd, pair.snd);
    }

    public int hashCode() {
        A a2 = this.fst;
        B b = this.snd;
        if (a2 == null) {
            if (b == null) {
                return 0;
            }
            return b.hashCode() + 1;
        }
        if (b == null) {
            return a2.hashCode() + 2;
        }
        return this.snd.hashCode() + (a2.hashCode() * 17);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Pair[");
        sb.append(this.fst);
        sb.append(",");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, MarkdownConstants.RIGHT_BRACKET, this.snd);
    }
}
