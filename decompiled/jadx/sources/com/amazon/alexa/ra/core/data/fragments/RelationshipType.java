package com.amazon.alexa.ra.core.data.fragments;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/RelationshipType;", "", "<init>", "(Ljava/lang/String;I)V", "CONTINUATION_OF", "EXPANSION_OF", "MEMBER_OF", "FOLLOWS", "RELATES_TO", "NONE", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class RelationshipType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RelationshipType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final RelationshipType CONTINUATION_OF = new RelationshipType("CONTINUATION_OF", 0);
    public static final RelationshipType EXPANSION_OF = new RelationshipType("EXPANSION_OF", 1);
    public static final RelationshipType MEMBER_OF = new RelationshipType("MEMBER_OF", 2);
    public static final RelationshipType FOLLOWS = new RelationshipType("FOLLOWS", 3);
    public static final RelationshipType RELATES_TO = new RelationshipType("RELATES_TO", 4);
    public static final RelationshipType NONE = new RelationshipType("NONE", 5);

    private static final /* synthetic */ RelationshipType[] $values() {
        return new RelationshipType[]{CONTINUATION_OF, EXPANSION_OF, MEMBER_OF, FOLLOWS, RELATES_TO, NONE};
    }

    static {
        RelationshipType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private RelationshipType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<RelationshipType> getEntries() {
        return $ENTRIES;
    }

    public static RelationshipType valueOf(String str) {
        return (RelationshipType) Enum.valueOf(RelationshipType.class, str);
    }

    public static RelationshipType[] values() {
        return (RelationshipType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/RelationshipType$Companion;", "", "<init>", "()V", "from", "Lcom/amazon/alexa/ra/core/data/fragments/RelationshipType;", "relationType", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @NotNull
        public final RelationshipType from(@NotNull String relationType) {
            relationType.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = relationType.toUpperCase(locale);
            upperCase.getClass();
            switch (upperCase.hashCode()) {
                case -1943840393:
                    if (upperCase.equals("EXPANSION_OF")) {
                        return RelationshipType.EXPANSION_OF;
                    }
                    break;
                case -986951457:
                    if (upperCase.equals("CONTINUATION_OF")) {
                        return RelationshipType.CONTINUATION_OF;
                    }
                    break;
                case -166121060:
                    if (upperCase.equals("MEMBER_OF")) {
                        return RelationshipType.MEMBER_OF;
                    }
                    break;
                case 34981570:
                    if (upperCase.equals("FOLLOWS")) {
                        return RelationshipType.FOLLOWS;
                    }
                    break;
                case 244390080:
                    if (upperCase.equals("RELATES_TO")) {
                        return RelationshipType.RELATES_TO;
                    }
                    break;
            }
            return RelationshipType.NONE;
        }

        private Companion() {
        }
    }
}
