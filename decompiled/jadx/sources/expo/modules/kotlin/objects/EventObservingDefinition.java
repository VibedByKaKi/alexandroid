package expo.modules.kotlin.objects;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0004\u0012\u0013\u0014\u0015B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ\u0016\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lexpo/modules/kotlin/objects/EventObservingDefinition;", "", "type", "Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;", "filer", "Lexpo/modules/kotlin/objects/EventObservingDefinition$Filter;", "body", "Lkotlin/Function0;", "", "<init>", "(Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;Lexpo/modules/kotlin/objects/EventObservingDefinition$Filter;Lkotlin/jvm/functions/Function0;)V", "shouldBeInvoked", "", "eventName", "", "shouldBeInvoked$expo_modules_core_release", "invokedIfNeed", "eventType", "Type", "Filter", "AllEventsFilter", "SelectedEventFiler", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class EventObservingDefinition {

    @NotNull
    private final Function0<Unit> body;

    @NotNull
    private final Filter filer;

    @NotNull
    private final Type type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lexpo/modules/kotlin/objects/EventObservingDefinition$AllEventsFilter;", "Lexpo/modules/kotlin/objects/EventObservingDefinition$Filter;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AllEventsFilter extends Filter {

        @NotNull
        public static final AllEventsFilter INSTANCE = new AllEventsFilter();

        private AllEventsFilter() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof AllEventsFilter);
        }

        public int hashCode() {
            return 728698842;
        }

        @NotNull
        public String toString() {
            return "AllEventsFilter";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/kotlin/objects/EventObservingDefinition$SelectedEventFiler;", "Lexpo/modules/kotlin/objects/EventObservingDefinition$Filter;", "event", "", "<init>", "(Ljava/lang/String;)V", "getEvent", "()Ljava/lang/String;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SelectedEventFiler extends Filter {

        @NotNull
        private final String event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectedEventFiler(@NotNull String str) {
            super(null);
            str.getClass();
            this.event = str;
        }

        @NotNull
        public final String getEvent() {
            return this.event;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "StartObserving", "StopObserving", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type StartObserving = new Type("StartObserving", 0, "startObserving");
        public static final Type StopObserving = new Type("StopObserving", 1, "stopObserving");

        @NotNull
        private final String value;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{StartObserving, StopObserving};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Type(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public EventObservingDefinition(@NotNull Type type, @NotNull Filter filter, @NotNull Function0<Unit> function0) {
        type.getClass();
        filter.getClass();
        function0.getClass();
        this.type = type;
        this.filer = filter;
        this.body = function0;
    }

    public final void invokedIfNeed(@NotNull Type eventType, @NotNull String eventName) {
        eventType.getClass();
        eventName.getClass();
        if (eventType == this.type && shouldBeInvoked$expo_modules_core_release(eventName)) {
            this.body.invoke();
        }
    }

    public final boolean shouldBeInvoked$expo_modules_core_release(@NotNull String eventName) {
        eventName.getClass();
        Filter filter = this.filer;
        if (filter instanceof AllEventsFilter) {
            return true;
        }
        if (filter instanceof SelectedEventFiler) {
            return Intrinsics.areEqual(((SelectedEventFiler) filter).getEvent(), eventName);
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return false;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/kotlin/objects/EventObservingDefinition$Filter;", "", "<init>", "()V", "Lexpo/modules/kotlin/objects/EventObservingDefinition$AllEventsFilter;", "Lexpo/modules/kotlin/objects/EventObservingDefinition$SelectedEventFiler;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Filter {
        public /* synthetic */ Filter(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Filter() {
        }
    }
}
