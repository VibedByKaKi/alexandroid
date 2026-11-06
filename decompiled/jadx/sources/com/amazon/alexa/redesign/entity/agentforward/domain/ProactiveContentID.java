package com.amazon.alexa.redesign.entity.agentforward.domain;

import com.amazon.alexa.ra.core.metrics.InteractionLabel;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/ProactiveContentID;", "", "<init>", "(Ljava/lang/String;I)V", "RecentChats", InteractionLabel.FOR_YOU, "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ProactiveContentID {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProactiveContentID[] $VALUES;
    public static final ProactiveContentID RecentChats = new ProactiveContentID("RecentChats", 0);
    public static final ProactiveContentID ForYou = new ProactiveContentID(InteractionLabel.FOR_YOU, 1);

    private static final /* synthetic */ ProactiveContentID[] $values() {
        return new ProactiveContentID[]{RecentChats, ForYou};
    }

    static {
        ProactiveContentID[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ProactiveContentID(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ProactiveContentID> getEntries() {
        return $ENTRIES;
    }

    public static ProactiveContentID valueOf(String str) {
        return (ProactiveContentID) Enum.valueOf(ProactiveContentID.class, str);
    }

    public static ProactiveContentID[] values() {
        return (ProactiveContentID[]) $VALUES.clone();
    }
}
