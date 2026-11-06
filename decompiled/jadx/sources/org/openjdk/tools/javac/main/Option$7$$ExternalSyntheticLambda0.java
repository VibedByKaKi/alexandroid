package org.openjdk.tools.javac.main;

import java.util.function.Function;
import java.util.stream.Stream;
import org.openjdk.tools.javac.main.Option;
import org.openjdk.tools.javac.platform.PlatformProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class Option$7$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Option$7$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String lambda$process$0;
        Stream lambda$help$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$process$0 = Option.AnonymousClass7.lambda$process$0((String) obj);
                return lambda$process$0;
            default:
                lambda$help$0 = Option.AnonymousClass14.lambda$help$0((PlatformProvider) obj);
                return lambda$help$0;
        }
    }
}
