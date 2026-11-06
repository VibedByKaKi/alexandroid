package org.commonmark.internal;

import org.commonmark.internal.inline.Position;
import org.commonmark.node.Text;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Bracket {
    public boolean allowed = true;
    public boolean bracketAfter = false;
    public final Position contentPosition;
    public final boolean image;
    public final Position markerPosition;
    public final Text node;
    public final Bracket previous;
    public final Delimiter previousDelimiter;

    private Bracket(Text text, Position position, Position position2, Bracket bracket, Delimiter delimiter, boolean z) {
        this.node = text;
        this.markerPosition = position;
        this.contentPosition = position2;
        this.image = z;
        this.previous = bracket;
        this.previousDelimiter = delimiter;
    }

    public static Bracket image(Text text, Position position, Position position2, Bracket bracket, Delimiter delimiter) {
        return new Bracket(text, position, position2, bracket, delimiter, true);
    }

    public static Bracket link(Text text, Position position, Position position2, Bracket bracket, Delimiter delimiter) {
        return new Bracket(text, position, position2, bracket, delimiter, false);
    }
}
