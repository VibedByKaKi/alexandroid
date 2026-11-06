package expo.modules.kotlin.objects;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import expo.modules.core.logging.PersistentFileLog$$ExternalSyntheticLambda2;
import expo.modules.kotlin.ConcatIterator;
import expo.modules.kotlin.events.EventsDefinition;
import expo.modules.kotlin.functions.AnyFunction;
import expo.modules.kotlin.functions.BaseAsyncFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B}\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u0004\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010 \u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0000H\u0086\u0002R%\u0010\u0002\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "", "legacyConstantsProvider", "Lkotlin/Function0;", "", "", "syncFunctions", "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "asyncFunctions", "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "eventsDefinition", "Lexpo/modules/kotlin/events/EventsDefinition;", "properties", "Lexpo/modules/kotlin/objects/PropertyComponent;", "constants", "Lexpo/modules/kotlin/objects/ConstantComponent;", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/util/Map;Ljava/util/Map;Lexpo/modules/kotlin/events/EventsDefinition;Ljava/util/Map;Ljava/util/Map;)V", "getLegacyConstantsProvider", "()Lkotlin/jvm/functions/Function0;", "getSyncFunctions", "()Ljava/util/Map;", "getAsyncFunctions", "getEventsDefinition", "()Lexpo/modules/kotlin/events/EventsDefinition;", "getProperties", "getConstants", "functions", "Lexpo/modules/kotlin/ConcatIterator;", "Lexpo/modules/kotlin/functions/AnyFunction;", "getFunctions", "()Lexpo/modules/kotlin/ConcatIterator;", "plus", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ObjectDefinitionData {

    @NotNull
    private final Map<String, BaseAsyncFunctionComponent> asyncFunctions;

    @NotNull
    private final Map<String, ConstantComponent> constants;

    @Nullable
    private final EventsDefinition eventsDefinition;

    @NotNull
    private final Function0<Map<String, Object>> legacyConstantsProvider;

    @NotNull
    private final Map<String, PropertyComponent> properties;

    @NotNull
    private final Map<String, SyncFunctionComponent> syncFunctions;

    /* JADX WARN: Multi-variable type inference failed */
    public ObjectDefinitionData(@NotNull Function0<? extends Map<String, ? extends Object>> function0, @NotNull Map<String, SyncFunctionComponent> map, @NotNull Map<String, ? extends BaseAsyncFunctionComponent> map2, @Nullable EventsDefinition eventsDefinition, @NotNull Map<String, PropertyComponent> map3, @NotNull Map<String, ConstantComponent> map4) {
        function0.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        this.legacyConstantsProvider = function0;
        this.syncFunctions = map;
        this.asyncFunctions = map2;
        this.eventsDefinition = eventsDefinition;
        this.properties = map3;
        this.constants = map4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map plus$lambda$0(ObjectDefinitionData objectDefinitionData, ObjectDefinitionData objectDefinitionData2) {
        return MapsKt.plus(objectDefinitionData.legacyConstantsProvider.invoke(), objectDefinitionData2.legacyConstantsProvider.invoke());
    }

    @NotNull
    public final Map<String, BaseAsyncFunctionComponent> getAsyncFunctions() {
        return this.asyncFunctions;
    }

    @NotNull
    public final Map<String, ConstantComponent> getConstants() {
        return this.constants;
    }

    @Nullable
    public final EventsDefinition getEventsDefinition() {
        return this.eventsDefinition;
    }

    @NotNull
    public final ConcatIterator<AnyFunction> getFunctions() {
        return new ConcatIterator<>(this.syncFunctions.values().iterator(), this.asyncFunctions.values().iterator());
    }

    @NotNull
    public final Function0<Map<String, Object>> getLegacyConstantsProvider() {
        return this.legacyConstantsProvider;
    }

    @NotNull
    public final Map<String, PropertyComponent> getProperties() {
        return this.properties;
    }

    @NotNull
    public final Map<String, SyncFunctionComponent> getSyncFunctions() {
        return this.syncFunctions;
    }

    @NotNull
    public final ObjectDefinitionData plus(@Nullable ObjectDefinitionData other) {
        if (other == null) {
            return this;
        }
        PersistentFileLog$$ExternalSyntheticLambda2 persistentFileLog$$ExternalSyntheticLambda2 = new PersistentFileLog$$ExternalSyntheticLambda2(this, other, 1);
        Map plus = MapsKt.plus(this.syncFunctions, other.syncFunctions);
        Map plus2 = MapsKt.plus(this.asyncFunctions, other.asyncFunctions);
        EventsDefinition eventsDefinition = this.eventsDefinition;
        return new ObjectDefinitionData(persistentFileLog$$ExternalSyntheticLambda2, plus, plus2, eventsDefinition != null ? eventsDefinition.plus(other.eventsDefinition) : null, MapsKt.plus(this.properties, other.properties), MapsKt.plus(this.constants, other.constants));
    }
}
