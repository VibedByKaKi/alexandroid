package dagger.internal.codegen.extension;

import com.amazon.alexa.crashreporting.CustomGroupingHashProvider$$ExternalSyntheticLambda5;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class Optionals {
    private Optionals() {
    }

    public static <T> Comparator<Optional<T>> emptiesLast(Comparator<? super T> comparator) {
        Preconditions.checkNotNull(comparator);
        return Comparator.comparing(new Optionals$$ExternalSyntheticLambda0(9), Comparator.nullsLast(comparator));
    }

    @SafeVarargs
    public static <T> Optional<T> firstPresent(Optional<T> optional, Optional<T> optional2, Optional<T>... optionalArr) {
        return (Optional) Lists.asList(optional, optional2, optionalArr).stream().filter(new CustomGroupingHashProvider$$ExternalSyntheticLambda5(6)).findFirst().orElse(Optional.empty());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$emptiesLast$1(Optional optional) {
        return optional.orElse(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$optionalComparator$0(Optional optional) {
        return Boolean.valueOf(optional.isPresent());
    }

    public static <C extends Comparable<C>> Comparator<Optional<C>> optionalComparator() {
        return Comparator.comparing(new Optionals$$ExternalSyntheticLambda0(0)).thenComparing(new Optionals$$ExternalSyntheticLambda0(8));
    }

    public static <T> T rootmostValue(T t, Function<T, Optional<T>> function) {
        Optional<T> apply = function.apply(t);
        while (true) {
            Optional<T> optional = apply;
            if (!optional.isPresent()) {
                return t;
            }
            t = optional.get();
            apply = function.apply(t);
        }
    }
}
