package com.amazon.alexa.ra.core.data.fragments;

import com.amazon.alexa.client.alexaservice.localfragment.LocalFragmentResult;
import com.amazon.alexa.voice.tta.metrics.SimbaEventProcessor;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/Purpose;", "", "<init>", "(Ljava/lang/String;I)V", "ADVERTISEMENT", LocalFragmentResult.DEFAULT_PURPOSE, "ENGAGEMENT", "INFORMATION", "RELATED", SimbaEventProcessor.SOURCE_SUGGESTION, "USER", "AGENT_PREAMBLE", "EXPANDED", "UNSUPPORTED", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class Purpose {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Purpose[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final Purpose ADVERTISEMENT = new Purpose("ADVERTISEMENT", 0);
    public static final Purpose AGENT = new Purpose(LocalFragmentResult.DEFAULT_PURPOSE, 1);
    public static final Purpose ENGAGEMENT = new Purpose("ENGAGEMENT", 2);
    public static final Purpose INFORMATION = new Purpose("INFORMATION", 3);
    public static final Purpose RELATED = new Purpose("RELATED", 4);
    public static final Purpose SUGGESTION = new Purpose(SimbaEventProcessor.SOURCE_SUGGESTION, 5);
    public static final Purpose USER = new Purpose("USER", 6);
    public static final Purpose AGENT_PREAMBLE = new Purpose("AGENT_PREAMBLE", 7);
    public static final Purpose EXPANDED = new Purpose("EXPANDED", 8);
    public static final Purpose UNSUPPORTED = new Purpose("UNSUPPORTED", 9);

    private static final /* synthetic */ Purpose[] $values() {
        return new Purpose[]{ADVERTISEMENT, AGENT, ENGAGEMENT, INFORMATION, RELATED, SUGGESTION, USER, AGENT_PREAMBLE, EXPANDED, UNSUPPORTED};
    }

    static {
        Purpose[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private Purpose(String str, int i) {
    }

    @NotNull
    public static EnumEntries<Purpose> getEntries() {
        return $ENTRIES;
    }

    public static Purpose valueOf(String str) {
        return (Purpose) Enum.valueOf(Purpose.class, str);
    }

    public static Purpose[] values() {
        return (Purpose[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/Purpose$Companion;", "", "<init>", "()V", "from", "Lcom/amazon/alexa/ra/core/data/fragments/Purpose;", "purpose", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @NotNull
        public final Purpose from(@NotNull String purpose) {
            purpose.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = purpose.toUpperCase(locale);
            upperCase.getClass();
            switch (upperCase.hashCode()) {
                case -1306793499:
                    if (upperCase.equals("ADVERTISEMENT")) {
                        return Purpose.ADVERTISEMENT;
                    }
                    break;
                case -1156473671:
                    if (upperCase.equals("EXPANDED")) {
                        return Purpose.EXPANDED;
                    }
                    break;
                case -1079622593:
                    if (upperCase.equals("ENGAGEMENT")) {
                        return Purpose.ENGAGEMENT;
                    }
                    break;
                case -173405940:
                    if (upperCase.equals("INFORMATION")) {
                        return Purpose.INFORMATION;
                    }
                    break;
                case -12012282:
                    if (upperCase.equals("AGENT_PREAMBLE")) {
                        return Purpose.AGENT_PREAMBLE;
                    }
                    break;
                case 2614219:
                    if (upperCase.equals("USER")) {
                        return Purpose.USER;
                    }
                    break;
                case 62212837:
                    if (upperCase.equals(LocalFragmentResult.DEFAULT_PURPOSE)) {
                        return Purpose.AGENT;
                    }
                    break;
                case 1682814468:
                    if (upperCase.equals(SimbaEventProcessor.SOURCE_SUGGESTION)) {
                        return Purpose.SUGGESTION;
                    }
                    break;
                case 1808476171:
                    if (upperCase.equals("RELATED")) {
                        return Purpose.RELATED;
                    }
                    break;
            }
            return Purpose.UNSUPPORTED;
        }

        private Companion() {
        }
    }
}
