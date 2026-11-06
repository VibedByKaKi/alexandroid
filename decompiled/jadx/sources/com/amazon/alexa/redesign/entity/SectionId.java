package com.amazon.alexa.redesign.entity;

import com.amazon.alexa.ra.core.metrics.InteractionLabel;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/redesign/entity/SectionId;", "", "<init>", "(Ljava/lang/String;I)V", "PriorityEvents", "QuickActions", "HomeStatusBar", InteractionLabel.FOR_YOU, "ContinueWithAlexa", "SomeSectionld", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class SectionId {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SectionId[] $VALUES;
    public static final SectionId PriorityEvents = new SectionId("PriorityEvents", 0);
    public static final SectionId QuickActions = new SectionId("QuickActions", 1);
    public static final SectionId HomeStatusBar = new SectionId("HomeStatusBar", 2);
    public static final SectionId ForYou = new SectionId(InteractionLabel.FOR_YOU, 3);
    public static final SectionId ContinueWithAlexa = new SectionId("ContinueWithAlexa", 4);
    public static final SectionId SomeSectionld = new SectionId("SomeSectionld", 5);

    private static final /* synthetic */ SectionId[] $values() {
        return new SectionId[]{PriorityEvents, QuickActions, HomeStatusBar, ForYou, ContinueWithAlexa, SomeSectionld};
    }

    static {
        SectionId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private SectionId(String str, int i) {
    }

    @NotNull
    public static EnumEntries<SectionId> getEntries() {
        return $ENTRIES;
    }

    public static SectionId valueOf(String str) {
        return (SectionId) Enum.valueOf(SectionId.class, str);
    }

    public static SectionId[] values() {
        return (SectionId[]) $VALUES.clone();
    }
}
