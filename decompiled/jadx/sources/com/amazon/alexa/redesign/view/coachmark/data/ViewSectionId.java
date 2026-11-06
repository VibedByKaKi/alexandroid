package com.amazon.alexa.redesign.view.coachmark.data;

import com.amazon.alexa.ra.core.metrics.InteractionLabel;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/redesign/view/coachmark/data/ViewSectionId;", "", "<init>", "(Ljava/lang/String;I)V", InteractionLabel.FOR_YOU, "FavoriteDevices", "ContinueWithAlexa", "ProgrammaticCarousel", "AlexaVoice", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ViewSectionId {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ViewSectionId[] $VALUES;
    public static final ViewSectionId ForYou = new ViewSectionId(InteractionLabel.FOR_YOU, 0);
    public static final ViewSectionId FavoriteDevices = new ViewSectionId("FavoriteDevices", 1);
    public static final ViewSectionId ContinueWithAlexa = new ViewSectionId("ContinueWithAlexa", 2);
    public static final ViewSectionId ProgrammaticCarousel = new ViewSectionId("ProgrammaticCarousel", 3);
    public static final ViewSectionId AlexaVoice = new ViewSectionId("AlexaVoice", 4);

    private static final /* synthetic */ ViewSectionId[] $values() {
        return new ViewSectionId[]{ForYou, FavoriteDevices, ContinueWithAlexa, ProgrammaticCarousel, AlexaVoice};
    }

    static {
        ViewSectionId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ViewSectionId(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ViewSectionId> getEntries() {
        return $ENTRIES;
    }

    public static ViewSectionId valueOf(String str) {
        return (ViewSectionId) Enum.valueOf(ViewSectionId.class, str);
    }

    public static ViewSectionId[] values() {
        return (ViewSectionId[]) $VALUES.clone();
    }
}
