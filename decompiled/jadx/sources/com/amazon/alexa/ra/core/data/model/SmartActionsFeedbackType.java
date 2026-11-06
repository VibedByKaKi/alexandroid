package com.amazon.alexa.ra.core.data.model;

import com.amazon.clouddrive.extended.model.ReactionKind;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tj\u0002\b\u0004j\u0002\b\u0005¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/SmartActionsFeedbackType;", "", "<init>", "(Ljava/lang/String;I)V", ReactionKind.LIKE, "DISLIKE", "label", "", "getLabel", "()Ljava/lang/String;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class SmartActionsFeedbackType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SmartActionsFeedbackType[] $VALUES;
    public static final SmartActionsFeedbackType LIKE = new SmartActionsFeedbackType(ReactionKind.LIKE, 0);
    public static final SmartActionsFeedbackType DISLIKE = new SmartActionsFeedbackType("DISLIKE", 1);

    private static final /* synthetic */ SmartActionsFeedbackType[] $values() {
        return new SmartActionsFeedbackType[]{LIKE, DISLIKE};
    }

    static {
        SmartActionsFeedbackType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private SmartActionsFeedbackType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<SmartActionsFeedbackType> getEntries() {
        return $ENTRIES;
    }

    public static SmartActionsFeedbackType valueOf(String str) {
        return (SmartActionsFeedbackType) Enum.valueOf(SmartActionsFeedbackType.class, str);
    }

    public static SmartActionsFeedbackType[] values() {
        return (SmartActionsFeedbackType[]) $VALUES.clone();
    }

    @NotNull
    public final String getLabel() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }
}
