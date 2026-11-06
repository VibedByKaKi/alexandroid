package com.amazon.alexa.redesign.entity.templates;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/redesign/entity/templates/TemplateType;", "", "templateType", "", "<init>", "(Ljava/lang/String;II)V", "MiniTemplate", "CustomTemplate", "EmptyState", "PollingMiniTemplate", "SectionTemplate", "ContainerTemplate", "FavoriteTemplate", "HomeFavoritesTemplate", "AlertBanner", "DelegatorTemplate", "UNKNOWN", "templateTypeIntValue", "getTemplateTypeIntValue", "()I", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class TemplateType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TemplateType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int templateType;
    public static final TemplateType MiniTemplate = new TemplateType("MiniTemplate", 0, 3);
    public static final TemplateType CustomTemplate = new TemplateType("CustomTemplate", 1, 6);
    public static final TemplateType EmptyState = new TemplateType("EmptyState", 2, 7);
    public static final TemplateType PollingMiniTemplate = new TemplateType("PollingMiniTemplate", 3, 9);
    public static final TemplateType SectionTemplate = new TemplateType("SectionTemplate", 4, 12);
    public static final TemplateType ContainerTemplate = new TemplateType("ContainerTemplate", 5, 15);
    public static final TemplateType FavoriteTemplate = new TemplateType("FavoriteTemplate", 6, 17);
    public static final TemplateType HomeFavoritesTemplate = new TemplateType("HomeFavoritesTemplate", 7, 18);
    public static final TemplateType AlertBanner = new TemplateType("AlertBanner", 8, 19);
    public static final TemplateType DelegatorTemplate = new TemplateType("DelegatorTemplate", 9, 20);
    public static final TemplateType UNKNOWN = new TemplateType("UNKNOWN", 10, -1);

    private static final /* synthetic */ TemplateType[] $values() {
        return new TemplateType[]{MiniTemplate, CustomTemplate, EmptyState, PollingMiniTemplate, SectionTemplate, ContainerTemplate, FavoriteTemplate, HomeFavoritesTemplate, AlertBanner, DelegatorTemplate, UNKNOWN};
    }

    static {
        TemplateType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private TemplateType(String str, int i, int i2) {
        this.templateType = i2;
    }

    @JvmStatic
    @NotNull
    public static final TemplateType from(int i) {
        return INSTANCE.from(i);
    }

    @NotNull
    public static EnumEntries<TemplateType> getEntries() {
        return $ENTRIES;
    }

    public static TemplateType valueOf(String str) {
        return (TemplateType) Enum.valueOf(TemplateType.class, str);
    }

    public static TemplateType[] values() {
        return (TemplateType[]) $VALUES.clone();
    }

    /* renamed from: getTemplateTypeIntValue, reason: from getter */
    public final int getTemplateType() {
        return this.templateType;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/redesign/entity/templates/TemplateType$Companion;", "", "<init>", "()V", "from", "Lcom/amazon/alexa/redesign/entity/templates/TemplateType;", "templateType", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTemplateType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemplateType.kt\ncom/amazon/alexa/redesign/entity/templates/TemplateType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final TemplateType from(int templateType) {
            TemplateType templateType2;
            TemplateType[] values = TemplateType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    templateType2 = null;
                    break;
                }
                templateType2 = values[i];
                if (templateType2.templateType == templateType) {
                    break;
                }
                i++;
            }
            return templateType2 == null ? TemplateType.UNKNOWN : templateType2;
        }

        private Companion() {
        }
    }
}
