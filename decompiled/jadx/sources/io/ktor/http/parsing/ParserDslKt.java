package io.ktor.http.parsing;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.accessory.notificationpublisher.utils.GroupNotificationHelper;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a'\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0080\b\u001a\u0014\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0003H\u0000\u001a\u0015\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0080\u0004\u001a\u0015\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\u0004\u001a\u0015\u0010\u0014\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0080\u0004\u001a\u0015\u0010\u0015\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0080\u0004\u001a\u0015\u0010\u0015\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\u0004\u001a\u0015\u0010\u0015\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0080\u0004\u001a\u0015\u0010\u0016\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0080\u0004¨\u0006\u0019"}, d2 = {"anyOf", "Lio/ktor/http/parsing/Grammar;", "value", "", "atLeastOne", "grammar", "many", "maybe", "Lkotlin/Function0;", "block", "Lkotlin/Function1;", "Lio/ktor/http/parsing/GrammarBuilder;", "", "Lkotlin/ExtensionFunctionType;", "flatten", "", ExifInterface.GPS_DIRECTION_TRUE, "Lio/ktor/http/parsing/ComplexGrammar;", GroupNotificationHelper.GROUP_TYPE_NAMED, "name", "or", "then", TypedValues.TransitionType.S_TO, "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "ktor-http"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class ParserDslKt {
    @NotNull
    public static final Grammar anyOf(@NotNull String str) {
        str.getClass();
        return new AnyOfGrammar(str);
    }

    @NotNull
    public static final Grammar atLeastOne(@NotNull Grammar grammar) {
        grammar.getClass();
        return new AtLeastOne(grammar);
    }

    private static final <T extends ComplexGrammar> List<Grammar> flatten(@NotNull List<? extends Grammar> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (obj instanceof ComplexGrammar) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, ((ComplexGrammar) obj).getGrammars());
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final Grammar many(@NotNull Grammar grammar) {
        grammar.getClass();
        return new ManyGrammar(grammar);
    }

    @NotNull
    public static final Grammar maybe(@NotNull String str) {
        str.getClass();
        return new MaybeGrammar(new StringGrammar(str));
    }

    @NotNull
    public static final Grammar named(@NotNull Grammar grammar, @NotNull String str) {
        grammar.getClass();
        str.getClass();
        return new NamedGrammar(str, grammar);
    }

    @NotNull
    public static final Grammar or(@NotNull Grammar grammar, @NotNull Grammar grammar2) {
        grammar.getClass();
        grammar2.getClass();
        return new OrGrammar(CollectionsKt.listOf((Object[]) new Grammar[]{grammar, grammar2}));
    }

    @NotNull
    public static final Grammar then(@NotNull Grammar grammar, @NotNull Grammar grammar2) {
        grammar.getClass();
        grammar2.getClass();
        return new SequenceGrammar(CollectionsKt.listOf((Object[]) new Grammar[]{grammar, grammar2}));
    }

    @NotNull
    public static final Grammar to(char c, char c2) {
        return new RangeGrammar(c, c2);
    }

    @NotNull
    public static final Grammar maybe(@NotNull Grammar grammar) {
        grammar.getClass();
        return new MaybeGrammar(grammar);
    }

    @NotNull
    public static final Function0<Grammar> maybe(@NotNull final Function1<? super GrammarBuilder, Unit> function1) {
        function1.getClass();
        return new Function0<Grammar>() { // from class: io.ktor.http.parsing.ParserDslKt$maybe$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Grammar invoke() {
                GrammarBuilder grammarBuilder = new GrammarBuilder();
                Function1.this.invoke(grammarBuilder);
                return ParserDslKt.maybe(grammarBuilder.build());
            }
        };
    }

    @NotNull
    public static final Grammar or(@NotNull Grammar grammar, @NotNull String str) {
        grammar.getClass();
        str.getClass();
        return or(grammar, new StringGrammar(str));
    }

    @NotNull
    public static final Grammar then(@NotNull String str, @NotNull Grammar grammar) {
        str.getClass();
        grammar.getClass();
        return then(new StringGrammar(str), grammar);
    }

    @NotNull
    public static final Grammar or(@NotNull String str, @NotNull Grammar grammar) {
        str.getClass();
        grammar.getClass();
        return or(new StringGrammar(str), grammar);
    }

    @NotNull
    public static final Grammar then(@NotNull Grammar grammar, @NotNull String str) {
        grammar.getClass();
        str.getClass();
        return then(grammar, new StringGrammar(str));
    }
}
