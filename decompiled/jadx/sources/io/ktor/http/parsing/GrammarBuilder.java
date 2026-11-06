package io.ktor.http.parsing;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0011\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0005H\u0086\u0004J\u0011\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0086\u0004J\u0013\u0010\u000b\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00050\rH\u0086\u0002J\r\u0010\u000b\u001a\u00020\f*\u00020\u0005H\u0086\u0002J\r\u0010\u000b\u001a\u00020\f*\u00020\nH\u0086\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lio/ktor/http/parsing/GrammarBuilder;", "", "()V", "grammars", "", "Lio/ktor/http/parsing/Grammar;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "then", "grammar", "value", "", "unaryPlus", "", "Lkotlin/Function0;", "ktor-http"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class GrammarBuilder {
    private final List<Grammar> grammars = new ArrayList();

    @NotNull
    public final Grammar build() {
        int size = this.grammars.size();
        List<Grammar> list = this.grammars;
        return size == 1 ? (Grammar) CollectionsKt.first((List) list) : new SequenceGrammar(list);
    }

    @NotNull
    public final GrammarBuilder then(@NotNull String value) {
        value.getClass();
        this.grammars.add(new StringGrammar(value));
        return this;
    }

    public final void unaryPlus(@NotNull String str) {
        str.getClass();
        this.grammars.add(new StringGrammar(str));
    }

    @NotNull
    public final GrammarBuilder then(@NotNull Grammar grammar) {
        grammar.getClass();
        this.grammars.add(grammar);
        return this;
    }

    public final void unaryPlus(@NotNull Grammar grammar) {
        grammar.getClass();
        this.grammars.add(grammar);
    }

    public final void unaryPlus(@NotNull Function0<? extends Grammar> function0) {
        function0.getClass();
        this.grammars.add(function0.invoke());
    }
}
