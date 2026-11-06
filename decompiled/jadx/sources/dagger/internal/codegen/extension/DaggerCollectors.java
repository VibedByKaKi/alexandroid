package dagger.internal.codegen.extension;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import javax.annotation.Nullable;
import kotlin.text.Typography;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class DaggerCollectors {
    private static final Object NULL_PLACEHOLDER;
    private static final Collector<Object, ?, Object> ONLY_ELEMENT;
    private static final Collector<Object, ?, Optional<Object>> TO_OPTIONAL;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ToOptionalState {
        static final int MAX_EXTRAS = 4;

        @Nullable
        Object element = null;

        @Nullable
        List<Object> extras = null;

        public void add(Object obj) {
            Preconditions.checkNotNull(obj);
            if (this.element == null) {
                this.element = obj;
                return;
            }
            List<Object> list = this.extras;
            if (list == null) {
                ArrayList arrayList = new ArrayList(4);
                this.extras = arrayList;
                arrayList.add(obj);
            } else {
                if (list.size() >= 4) {
                    throw multiples(true);
                }
                this.extras.add(obj);
            }
        }

        public ToOptionalState combine(ToOptionalState toOptionalState) {
            if (this.element == null) {
                return toOptionalState;
            }
            if (toOptionalState.element != null) {
                if (this.extras == null) {
                    this.extras = new ArrayList();
                }
                this.extras.add(toOptionalState.element);
                List<Object> list = toOptionalState.extras;
                if (list != null) {
                    this.extras.addAll(list);
                }
                if (this.extras.size() > 4) {
                    List<Object> list2 = this.extras;
                    list2.subList(4, list2.size()).clear();
                    throw multiples(true);
                }
            }
            return this;
        }

        public Object getElement() {
            Object obj = this.element;
            if (obj == null) {
                Single$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            if (this.extras == null) {
                return obj;
            }
            throw multiples(false);
        }

        public Optional<Object> getOptional() {
            if (this.extras == null) {
                return Optional.ofNullable(this.element);
            }
            throw multiples(false);
        }

        public IllegalArgumentException multiples(boolean z) {
            StringBuilder sb = new StringBuilder("expected one element but was: <");
            sb.append(this.element);
            for (Object obj : this.extras) {
                sb.append(", ");
                sb.append(obj);
            }
            if (z) {
                sb.append(", ...");
            }
            sb.append(Typography.greater);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    static {
        DaggerStreams$$ExternalSyntheticLambda6 daggerStreams$$ExternalSyntheticLambda6 = new DaggerStreams$$ExternalSyntheticLambda6(1);
        DaggerStreams$$ExternalSyntheticLambda2 daggerStreams$$ExternalSyntheticLambda2 = new DaggerStreams$$ExternalSyntheticLambda2(1);
        DaggerStreams$$ExternalSyntheticLambda3 daggerStreams$$ExternalSyntheticLambda3 = new DaggerStreams$$ExternalSyntheticLambda3(1);
        Optionals$$ExternalSyntheticLambda0 optionals$$ExternalSyntheticLambda0 = new Optionals$$ExternalSyntheticLambda0(1);
        Collector.Characteristics characteristics = Collector.Characteristics.UNORDERED;
        TO_OPTIONAL = Collector.of(daggerStreams$$ExternalSyntheticLambda6, daggerStreams$$ExternalSyntheticLambda2, daggerStreams$$ExternalSyntheticLambda3, optionals$$ExternalSyntheticLambda0, characteristics);
        NULL_PLACEHOLDER = new Object();
        ONLY_ELEMENT = Collector.of(new DaggerStreams$$ExternalSyntheticLambda6(1), new DaggerStreams$$ExternalSyntheticLambda2(2), new DaggerStreams$$ExternalSyntheticLambda3(1), new Optionals$$ExternalSyntheticLambda0(2), characteristics);
    }

    private DaggerCollectors() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(ToOptionalState toOptionalState, Object obj) {
        if (obj == null) {
            obj = NULL_PLACEHOLDER;
        }
        toOptionalState.add(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$1(ToOptionalState toOptionalState) {
        Object element = toOptionalState.getElement();
        if (element == NULL_PLACEHOLDER) {
            return null;
        }
        return element;
    }

    public static <T> Collector<T, ?, T> onlyElement() {
        return (Collector<T, ?, T>) ONLY_ELEMENT;
    }

    public static <T> Collector<T, ?, Optional<T>> toOptional() {
        return (Collector<T, ?, Optional<T>>) TO_OPTIONAL;
    }
}
