package com.amazon.alexa.redesign.entity.agentforward.domain;

import com.amazon.alexa.smarthomecameras.routing.CamerasRouteParameter;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/CardTitle;", "", CamerasRouteParameter.DISPLAY_NAME, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "DEVICES", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class CardTitle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CardTitle[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final CardTitle DEVICES = new CardTitle("DEVICES", 0, "Devices");

    @NotNull
    private final String displayName;

    private static final /* synthetic */ CardTitle[] $values() {
        return new CardTitle[]{DEVICES};
    }

    static {
        CardTitle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private CardTitle(String str, int i, String str2) {
        this.displayName = str2;
    }

    @NotNull
    public static EnumEntries<CardTitle> getEntries() {
        return $ENTRIES;
    }

    public static CardTitle valueOf(String str) {
        return (CardTitle) Enum.valueOf(CardTitle.class, str);
    }

    public static CardTitle[] values() {
        return (CardTitle[]) $VALUES.clone();
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/CardTitle$Companion;", "", "<init>", "()V", "fromString", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/CardTitle;", "title", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nGetHomeContentResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetHomeContentResponse.kt\ncom/amazon/alexa/redesign/entity/agentforward/domain/CardTitle$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,657:1\n1#2:658\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final CardTitle fromString(@Nullable String title) {
            for (CardTitle cardTitle : CardTitle.values()) {
                if (StringsKt.equals(cardTitle.getDisplayName(), title, true)) {
                    return cardTitle;
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}
