package com.amazon.alexa.client.alexaservice.base.capabilities.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u00062\u00020\u0001:\u0002\u0005\u0006B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/client/alexaservice/base/capabilities/events/PublishCapabilityCacheEvent;", "Lcom/amazon/alexa/client/alexaservice/eventing/Event$NotGated;", "()V", "cacheType", "Lcom/amazon/alexa/client/alexaservice/base/capabilities/events/PublishCapabilityCacheEvent$CacheType;", "CacheType", "Companion", "AVSAndroidClient-alexaservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class PublishCapabilityCacheEvent extends Event.NotGated {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/amazon/alexa/client/alexaservice/base/capabilities/events/PublishCapabilityCacheEvent$CacheType;", "", "(Ljava/lang/String;I)V", "CACHE_HIT", "CACHE_MISS", "AVSAndroidClient-alexaservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CacheType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CacheType[] $VALUES;
        public static final CacheType CACHE_HIT = new CacheType("CACHE_HIT", 0);
        public static final CacheType CACHE_MISS = new CacheType("CACHE_MISS", 1);

        private static final /* synthetic */ CacheType[] $values() {
            return new CacheType[]{CACHE_HIT, CACHE_MISS};
        }

        static {
            CacheType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private CacheType(String str, int i) {
        }

        @NotNull
        public static EnumEntries<CacheType> getEntries() {
            return $ENTRIES;
        }

        public static CacheType valueOf(String str) {
            return (CacheType) Enum.valueOf(CacheType.class, str);
        }

        public static CacheType[] values() {
            return (CacheType[]) $VALUES.clone();
        }
    }

    @NotNull
    public abstract CacheType cacheType();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/client/alexaservice/base/capabilities/events/PublishCapabilityCacheEvent$Companion;", "", "()V", "create", "Lcom/amazon/alexa/client/alexaservice/base/capabilities/events/PublishCapabilityCacheEvent;", "cacheType", "Lcom/amazon/alexa/client/alexaservice/base/capabilities/events/PublishCapabilityCacheEvent$CacheType;", "AVSAndroidClient-alexaservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PublishCapabilityCacheEvent create(@NotNull CacheType cacheType) {
            cacheType.getClass();
            return new AutoValue_PublishCapabilityCacheEvent(cacheType);
        }

        private Companion() {
        }
    }
}
