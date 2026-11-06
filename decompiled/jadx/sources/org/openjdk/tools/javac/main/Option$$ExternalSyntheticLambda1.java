package org.openjdk.tools.javac.main;

import java.util.function.Predicate;
import org.openjdk.tools.javac.main.Option;
import org.openjdk.tools.javac.util.Options;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class Option$$ExternalSyntheticLambda1 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Option$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$getOptions$3;
        boolean lambda$showHelp$0;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$getOptions$3 = Option.lambda$getOptions$3((Option.OptionGroup) obj2, (Option) obj);
                return lambda$getOptions$3;
            case 1:
                return ((Options) obj2).isSet((Option) obj);
            default:
                lambda$showHelp$0 = Option.lambda$showHelp$0((Option.OptionKind) obj2, (Option) obj);
                return lambda$showHelp$0;
        }
    }
}
