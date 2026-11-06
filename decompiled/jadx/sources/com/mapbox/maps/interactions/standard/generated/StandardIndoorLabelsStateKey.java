package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.maps.MapboxDelicateApi;
import com.mapbox.maps.interactions.FeatureStateKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardIndoorLabelsStateKey;", "Lcom/mapbox/maps/interactions/FeatureStateKey;", "Lcom/mapbox/maps/interactions/standard/generated/StandardIndoorLabelsState;", "key", "", "(Ljava/lang/String;)V", "Companion", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class StandardIndoorLabelsStateKey extends FeatureStateKey<StandardIndoorLabelsState> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final StandardIndoorLabelsStateKey HIGHLIGHT = new StandardIndoorLabelsStateKey("highlight");

    @NotNull
    private static final StandardIndoorLabelsStateKey SELECT = new StandardIndoorLabelsStateKey("select");

    public /* synthetic */ StandardIndoorLabelsStateKey(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardIndoorLabelsStateKey$Companion;", "", "()V", "HIGHLIGHT", "Lcom/mapbox/maps/interactions/standard/generated/StandardIndoorLabelsStateKey;", "getHIGHLIGHT", "()Lcom/mapbox/maps/interactions/standard/generated/StandardIndoorLabelsStateKey;", "SELECT", "getSELECT", "create", "key", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @MapboxDelicateApi
        @NotNull
        public final StandardIndoorLabelsStateKey create(@NotNull String key) {
            key.getClass();
            return new StandardIndoorLabelsStateKey(key, null);
        }

        @NotNull
        public final StandardIndoorLabelsStateKey getHIGHLIGHT() {
            return StandardIndoorLabelsStateKey.HIGHLIGHT;
        }

        @NotNull
        public final StandardIndoorLabelsStateKey getSELECT() {
            return StandardIndoorLabelsStateKey.SELECT;
        }

        private Companion() {
        }
    }

    private StandardIndoorLabelsStateKey(String str) {
        super(str);
    }
}
