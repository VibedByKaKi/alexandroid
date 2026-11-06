package io.ktor.http.parsing;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0003\u001a\u00020\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/http/parsing/MaybeGrammar;", "Lio/ktor/http/parsing/Grammar;", "Lio/ktor/http/parsing/SimpleGrammar;", "grammar", "(Lio/ktor/http/parsing/Grammar;)V", "getGrammar", "()Lio/ktor/http/parsing/Grammar;", "ktor-http"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class MaybeGrammar extends Grammar implements SimpleGrammar {

    @NotNull
    private final Grammar grammar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaybeGrammar(@NotNull Grammar grammar) {
        super(null);
        grammar.getClass();
        this.grammar = grammar;
    }

    @Override // io.ktor.http.parsing.SimpleGrammar
    @NotNull
    public Grammar getGrammar() {
        return this.grammar;
    }
}
