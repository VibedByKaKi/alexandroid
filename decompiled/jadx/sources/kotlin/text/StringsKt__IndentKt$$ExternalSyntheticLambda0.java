package kotlin.text;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class StringsKt__IndentKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ StringsKt__IndentKt$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String prependIndent$lambda$0$StringsKt__IndentKt;
        String indentFunction$lambda$1$StringsKt__IndentKt;
        MatchGroup matchGroup;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                prependIndent$lambda$0$StringsKt__IndentKt = StringsKt__IndentKt.prependIndent$lambda$0$StringsKt__IndentKt((String) obj2, (String) obj);
                return prependIndent$lambda$0$StringsKt__IndentKt;
            case 1:
                indentFunction$lambda$1$StringsKt__IndentKt = StringsKt__IndentKt.getIndentFunction$lambda$1$StringsKt__IndentKt((String) obj2, (String) obj);
                return indentFunction$lambda$1$StringsKt__IndentKt;
            default:
                matchGroup = ((MatcherMatchResult$groups$1) obj2).get(((Integer) obj).intValue());
                return matchGroup;
        }
    }
}
