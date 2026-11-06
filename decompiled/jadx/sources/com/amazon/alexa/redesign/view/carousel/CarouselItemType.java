package com.amazon.alexa.redesign.view.carousel;

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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/redesign/view/carousel/CarouselItemType;", "", "carouselType", "", "<init>", "(Ljava/lang/String;II)V", "ShfSkeleton", "UNKNOWN", "getCarouselTypeIntValue", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class CarouselItemType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CarouselItemType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final CarouselItemType ShfSkeleton = new CarouselItemType("ShfSkeleton", 0, 5);
    public static final CarouselItemType UNKNOWN = new CarouselItemType("UNKNOWN", 1, -1);
    private final int carouselType;

    private static final /* synthetic */ CarouselItemType[] $values() {
        return new CarouselItemType[]{ShfSkeleton, UNKNOWN};
    }

    static {
        CarouselItemType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private CarouselItemType(String str, int i, int i2) {
        this.carouselType = i2;
    }

    @JvmStatic
    @NotNull
    public static final CarouselItemType from(int i) {
        return INSTANCE.from(i);
    }

    @NotNull
    public static EnumEntries<CarouselItemType> getEntries() {
        return $ENTRIES;
    }

    public static CarouselItemType valueOf(String str) {
        return (CarouselItemType) Enum.valueOf(CarouselItemType.class, str);
    }

    public static CarouselItemType[] values() {
        return (CarouselItemType[]) $VALUES.clone();
    }

    /* renamed from: getCarouselTypeIntValue, reason: from getter */
    public final int getCarouselType() {
        return this.carouselType;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/redesign/view/carousel/CarouselItemType$Companion;", "", "<init>", "()V", "from", "Lcom/amazon/alexa/redesign/view/carousel/CarouselItemType;", "carouselType", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCarouselItemType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselItemType.kt\ncom/amazon/alexa/redesign/view/carousel/CarouselItemType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,16:1\n1#2:17\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CarouselItemType from(int carouselType) {
            CarouselItemType carouselItemType;
            CarouselItemType[] values = CarouselItemType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    carouselItemType = null;
                    break;
                }
                carouselItemType = values[i];
                if (carouselItemType.carouselType == carouselType) {
                    break;
                }
                i++;
            }
            return carouselItemType == null ? CarouselItemType.UNKNOWN : carouselItemType;
        }

        private Companion() {
        }
    }
}
