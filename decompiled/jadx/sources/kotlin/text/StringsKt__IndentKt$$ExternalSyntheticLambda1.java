package kotlin.text;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class StringsKt__IndentKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ StringsKt__IndentKt$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String indentFunction$lambda$0$StringsKt__IndentKt;
        String windowed$lambda$0$StringsKt___StringsKt;
        String windowedSequence$lambda$0$StringsKt___StringsKt;
        String chunkedSequence$lambda$0$StringsKt___StringsKt;
        switch (this.$r8$classId) {
            case 0:
                indentFunction$lambda$0$StringsKt__IndentKt = StringsKt__IndentKt.getIndentFunction$lambda$0$StringsKt__IndentKt((String) obj);
                return indentFunction$lambda$0$StringsKt__IndentKt;
            case 1:
                windowed$lambda$0$StringsKt___StringsKt = StringsKt___StringsKt.windowed$lambda$0$StringsKt___StringsKt((CharSequence) obj);
                return windowed$lambda$0$StringsKt___StringsKt;
            case 2:
                windowedSequence$lambda$0$StringsKt___StringsKt = StringsKt___StringsKt.windowedSequence$lambda$0$StringsKt___StringsKt((CharSequence) obj);
                return windowedSequence$lambda$0$StringsKt___StringsKt;
            default:
                chunkedSequence$lambda$0$StringsKt___StringsKt = StringsKt___StringsKt.chunkedSequence$lambda$0$StringsKt___StringsKt((CharSequence) obj);
                return chunkedSequence$lambda$0$StringsKt___StringsKt;
        }
    }
}
