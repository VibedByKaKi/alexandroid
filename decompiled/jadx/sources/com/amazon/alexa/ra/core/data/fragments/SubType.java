package com.amazon.alexa.ra.core.data.fragments;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.clouddrive.cdasdk.aps.account.FeatureName;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/SubType;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "BACKGROUND_IMAGE", "DETAIL", "CAROUSAL", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class SubType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SubType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final SubType UNKNOWN = new SubType("UNKNOWN", 0);
    public static final SubType BACKGROUND_IMAGE = new SubType("BACKGROUND_IMAGE", 1);
    public static final SubType DETAIL = new SubType("DETAIL", 2);
    public static final SubType CAROUSAL = new SubType("CAROUSAL", 3);

    private static final /* synthetic */ SubType[] $values() {
        return new SubType[]{UNKNOWN, BACKGROUND_IMAGE, DETAIL, CAROUSAL};
    }

    static {
        SubType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private SubType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<SubType> getEntries() {
        return $ENTRIES;
    }

    public static SubType valueOf(String str) {
        return (SubType) Enum.valueOf(SubType.class, str);
    }

    public static SubType[] values() {
        return (SubType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/SubType$Companion;", "", "<init>", "()V", "from", "Lcom/amazon/alexa/ra/core/data/fragments/SubType;", "layoutType", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SubType from(@NotNull String layoutType) {
            layoutType.getClass();
            Locale locale = Locale.US;
            String m = TableInfo$$ExternalSyntheticOutline0.m(locale, layoutType, locale);
            int hashCode = m.hashCode();
            if (hashCode != -1335224239) {
                if (hashCode != 2908512) {
                    if (hashCode == 1322148077 && m.equals("backgroundimage")) {
                        return SubType.BACKGROUND_IMAGE;
                    }
                } else if (m.equals(FeatureName.CAROUSEL)) {
                    return SubType.CAROUSAL;
                }
            } else if (m.equals(MessagingControllerConstant.MESSAGING_CONTROLLER_DETAIL_KEY)) {
                return SubType.DETAIL;
            }
            return SubType.UNKNOWN;
        }

        private Companion() {
        }
    }
}
