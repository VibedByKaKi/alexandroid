package org.commonmark.internal;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import java.util.List;
import org.commonmark.node.Text;
import org.commonmark.parser.delimiter.DelimiterRun;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Delimiter implements DelimiterRun {
    private final boolean canClose;
    private final boolean canOpen;
    public final List<Text> characters;
    public final char delimiterChar;
    public Delimiter next;
    private final int originalLength;
    public Delimiter previous;

    public Delimiter(List<Text> list, char c, boolean z, boolean z2, Delimiter delimiter) {
        this.characters = list;
        this.delimiterChar = c;
        this.canOpen = z;
        this.canClose = z2;
        this.previous = delimiter;
        this.originalLength = list.size();
    }

    @Override // org.commonmark.parser.delimiter.DelimiterRun
    public boolean canClose() {
        return this.canClose;
    }

    @Override // org.commonmark.parser.delimiter.DelimiterRun
    public boolean canOpen() {
        return this.canOpen;
    }

    @Override // org.commonmark.parser.delimiter.DelimiterRun
    public Text getCloser() {
        return this.characters.get(0);
    }

    @Override // org.commonmark.parser.delimiter.DelimiterRun
    public Iterable<Text> getClosers(int i) {
        if (i >= 1 && i <= length()) {
            return this.characters.subList(0, i);
        }
        Gson$$ExternalSyntheticBUOutline0.m(", was ", length(), i, "length must be between 1 and ");
        return null;
    }

    @Override // org.commonmark.parser.delimiter.DelimiterRun
    public Text getOpener() {
        return (Text) ErrorUtils$$ExternalSyntheticOutline0.m(this.characters, 1);
    }

    @Override // org.commonmark.parser.delimiter.DelimiterRun
    public Iterable<Text> getOpeners(int i) {
        if (i < 1 || i > length()) {
            Gson$$ExternalSyntheticBUOutline0.m(", was ", length(), i, "length must be between 1 and ");
            return null;
        }
        List<Text> list = this.characters;
        return list.subList(list.size() - i, this.characters.size());
    }

    @Override // org.commonmark.parser.delimiter.DelimiterRun
    public int length() {
        return this.characters.size();
    }

    @Override // org.commonmark.parser.delimiter.DelimiterRun
    public int originalLength() {
        return this.originalLength;
    }
}
