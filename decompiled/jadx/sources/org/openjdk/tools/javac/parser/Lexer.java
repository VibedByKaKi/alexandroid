package org.openjdk.tools.javac.parser;

import org.openjdk.tools.javac.parser.Tokens;
import org.openjdk.tools.javac.util.Position;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public interface Lexer {
    int errPos();

    void errPos(int i);

    Position.LineMap getLineMap();

    void nextToken();

    Tokens.Token prevToken();

    Tokens.Token split();

    Tokens.Token token();

    Tokens.Token token(int i);
}
