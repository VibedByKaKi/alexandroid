package org.openjdk.tools.sjavac;

import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Predicate;
import org.apache.commons.lang3.concurrent.BackgroundInitializer;
import org.apache.commons.lang3.function.Predicates;
import org.apache.commons.text.WordUtils;
import org.apache.commons.text.translate.CharSequenceTranslator;
import org.openjdk.tools.javac.util.Dependencies;
import org.openjdk.tools.sjavac.comp.SjavacImpl;
import org.openjdk.tools.sjavac.comp.dependencies.NewDependencyCollector;
import org.openjdk.tools.sjavac.pubapi.PubApi;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class Main$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Main$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$go$0;
        boolean lambda$static$0;
        boolean lambda$static$1;
        boolean lambda$generateIsDelimiterFunction$0;
        boolean lambda$compile$0;
        boolean lambda$getDependencyNodes$1;
        boolean lambda$parseModifiers$3;
        switch (this.$r8$classId) {
            case 0:
                lambda$go$0 = Main.lambda$go$0((String) obj);
                return lambda$go$0;
            case 1:
                return ((BackgroundInitializer) obj).isInitialized();
            case 2:
                return Objects.nonNull((Throwable) obj);
            case 3:
                lambda$static$0 = Predicates.lambda$static$0(obj);
                return lambda$static$0;
            case 4:
                lambda$static$1 = Predicates.lambda$static$1(obj);
                return lambda$static$1;
            case 5:
                return Objects.nonNull((ConcurrentMap) obj);
            case 6:
                return Character.isWhitespace(((Integer) obj).intValue());
            case 7:
                lambda$generateIsDelimiterFunction$0 = WordUtils.lambda$generateIsDelimiterFunction$0((Integer) obj);
                return lambda$generateIsDelimiterFunction$0;
            case 8:
                return Objects.nonNull((CharSequenceTranslator) obj);
            case 9:
                lambda$compile$0 = SjavacImpl.lambda$compile$0((String) obj);
                return lambda$compile$0;
            case 10:
                lambda$getDependencyNodes$1 = NewDependencyCollector.lambda$getDependencyNodes$1((Dependencies.GraphDependencies.CompletionNode) obj);
                return lambda$getDependencyNodes$1;
            default:
                lambda$parseModifiers$3 = PubApi.lambda$parseModifiers$3((String) obj);
                return lambda$parseModifiers$3;
        }
    }
}
