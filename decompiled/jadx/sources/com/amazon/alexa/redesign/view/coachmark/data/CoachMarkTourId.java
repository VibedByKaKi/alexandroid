package com.amazon.alexa.redesign.view.coachmark.data;

import com.amazon.alexa.ra.core.metrics.InteractionLabel;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/redesign/view/coachmark/data/CoachMarkTourId;", "", "<init>", "(Ljava/lang/String;I)V", InteractionLabel.FOR_YOU, "FavoriteDevices", "ContinueWithAlexa", "ProgrammaticCarousel", "BottomNavBar", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class CoachMarkTourId {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CoachMarkTourId[] $VALUES;
    public static final CoachMarkTourId ForYou = new CoachMarkTourId(InteractionLabel.FOR_YOU, 0);
    public static final CoachMarkTourId FavoriteDevices = new CoachMarkTourId("FavoriteDevices", 1);
    public static final CoachMarkTourId ContinueWithAlexa = new CoachMarkTourId("ContinueWithAlexa", 2);
    public static final CoachMarkTourId ProgrammaticCarousel = new CoachMarkTourId("ProgrammaticCarousel", 3);
    public static final CoachMarkTourId BottomNavBar = new CoachMarkTourId("BottomNavBar", 4);

    private static final /* synthetic */ CoachMarkTourId[] $values() {
        return new CoachMarkTourId[]{ForYou, FavoriteDevices, ContinueWithAlexa, ProgrammaticCarousel, BottomNavBar};
    }

    static {
        CoachMarkTourId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private CoachMarkTourId(String str, int i) {
    }

    @NotNull
    public static EnumEntries<CoachMarkTourId> getEntries() {
        return $ENTRIES;
    }

    public static CoachMarkTourId valueOf(String str) {
        return (CoachMarkTourId) Enum.valueOf(CoachMarkTourId.class, str);
    }

    public static CoachMarkTourId[] values() {
        return (CoachMarkTourId[]) $VALUES.clone();
    }
}
