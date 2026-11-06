package com.amazon.mobile.heremapsexplore.Constants;

import com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable;
import com.amazon.mobile.heremapsexplore.Factories.ImageFactory;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class MarkerIconType implements MarkerLayoutPositionable, ImageIndexable {
    private final String name;
    public static final MarkerIconType SMALL_ACTIVE_FETCH_ICON_TYPE = new AnonymousClass1();
    public static final MarkerIconType SMALL_ACTIVE_TILE_ICON_TYPE = new AnonymousClass2();
    public static final MarkerIconType SMALL_ACTIVE_ECHO_AUTO_ICON_TYPE = new AnonymousClass3();
    public static final MarkerIconType SMALL_ACTIVE_LEFT_BUD_ICON_TYPE = new AnonymousClass4();
    public static final MarkerIconType SMALL_ACTIVE_LEFT_BUD_V2_ICON_TYPE = new AnonymousClass5();
    public static final MarkerIconType SMALL_ACTIVE_RIGHT_BUD_ICON_TYPE = new AnonymousClass6();
    public static final MarkerIconType SMALL_ACTIVE_RIGHT_BUD_V2_ICON_TYPE = new AnonymousClass7();
    public static final MarkerIconType SMALL_ACTIVE_ECHO_BUD_ICON_TYPE = new AnonymousClass8();
    public static final MarkerIconType SMALL_ACTIVE_ECHO_BUD_V2_ICON_TYPE = new AnonymousClass9();
    public static final MarkerIconType SMALL_ACTIVE_SMART_THINGS_ICON_TYPE = new AnonymousClass10();
    public static final MarkerIconType SMALL_ACTIVE_ECHO_FRAMES_ICON_TYPE = new AnonymousClass11();
    public static final MarkerIconType SMALL_ACTIVE_REMOTE_CONTROL_ICON_TYPE = new AnonymousClass12();
    public static final MarkerIconType SMALL_ACTIVE_FIRE_TABLET_ICON_TYPE = new AnonymousClass13();
    public static final MarkerIconType SMALL_ACTIVE_DEFAULT_ICON_TYPE = new AnonymousClass14();
    public static final MarkerIconType SMALL_INACTIVE_FETCH_ICON_TYPE = new AnonymousClass15();
    public static final MarkerIconType SMALL_INACTIVE_TILE_ICON_TYPE = new AnonymousClass16();
    public static final MarkerIconType SMALL_INACTIVE_ECHO_AUTO_ICON_TYPE = new AnonymousClass17();
    public static final MarkerIconType SMALL_INACTIVE_LEFT_BUD_ICON_TYPE = new AnonymousClass18();
    public static final MarkerIconType SMALL_INACTIVE_LEFT_BUD_V2_ICON_TYPE = new AnonymousClass19();
    public static final MarkerIconType SMALL_INACTIVE_RIGHT_BUD_ICON_TYPE = new AnonymousClass20();
    public static final MarkerIconType SMALL_INACTIVE_RIGHT_BUD_V2_ICON_TYPE = new AnonymousClass21();
    public static final MarkerIconType SMALL_INACTIVE_ECHO_BUD_ICON_TYPE = new AnonymousClass22();
    public static final MarkerIconType SMALL_INACTIVE_ECHO_BUD_V2_ICON_TYPE = new AnonymousClass23();
    public static final MarkerIconType SMALL_INACTIVE_SMART_THINGS_ICON_TYPE = new AnonymousClass24();
    public static final MarkerIconType SMALL_INACTIVE_ECHO_FRAMES_ICON_TYPE = new AnonymousClass25();
    public static final MarkerIconType SMALL_INACTIVE_REMOTE_CONTROL_ICON_TYPE = new AnonymousClass26();
    public static final MarkerIconType SMALL_INACTIVE_FIRE_TABLET_ICON_TYPE = new AnonymousClass27();
    public static final MarkerIconType SMALL_INACTIVE_DEFAULT_ICON_TYPE = new AnonymousClass28();
    public static final MarkerIconType SMALL_ACTIVE_SAMSUNG_WATCH_ICON_TYPE = new AnonymousClass29();
    public static final MarkerIconType SMALL_INACTIVE_SAMSUNG_WATCH_ICON_TYPE = new AnonymousClass30();
    public static final MarkerIconType SMALL_ACTIVE_SAMSUNG_PHONE_ICON_TYPE = new AnonymousClass31();
    public static final MarkerIconType SMALL_INACTIVE_SAMSUNG_PHONE_ICON_TYPE = new AnonymousClass32();
    public static final MarkerIconType SMALL_ACTIVE_SAMSUNG_TABLET_ICON_TYPE = new AnonymousClass33();
    public static final MarkerIconType SMALL_INACTIVE_SAMSUNG_TABLET_ICON_TYPE = new AnonymousClass34();
    public static final MarkerIconType SMALL_ACTIVE_SAMSUNG_BUDS_LEFT_ICON_TYPE = new AnonymousClass35();
    public static final MarkerIconType SMALL_INACTIVE_SAMSUNG_BUDS_LEFT_ICON_TYPE = new AnonymousClass36();
    public static final MarkerIconType SMALL_ACTIVE_SAMSUNG_BUDS_RIGHT_ICON_TYPE = new AnonymousClass37();
    public static final MarkerIconType SMALL_INACTIVE_SAMSUNG_BUDS_RIGHT_ICON_TYPE = new AnonymousClass38();
    public static final MarkerIconType LARGE_ACTIVE_FETCH_ICON_TYPE = new AnonymousClass39();
    public static final MarkerIconType LARGE_ACTIVE_TILE_ICON_TYPE = new AnonymousClass40();
    public static final MarkerIconType LARGE_ACTIVE_ECHO_AUTO_ICON_TYPE = new AnonymousClass41();
    public static final MarkerIconType LARGE_ACTIVE_LEFT_BUD_ICON_TYPE = new AnonymousClass42();
    public static final MarkerIconType LARGE_ACTIVE_LEFT_BUD_V2_ICON_TYPE = new AnonymousClass43();
    public static final MarkerIconType LARGE_ACTIVE_RIGHT_BUD_ICON_TYPE = new AnonymousClass44();
    public static final MarkerIconType LARGE_ACTIVE_RIGHT_BUD_V2_ICON_TYPE = new AnonymousClass45();
    public static final MarkerIconType LARGE_ACTIVE_ECHO_BUD_ICON_TYPE = new AnonymousClass46();
    public static final MarkerIconType LARGE_ACTIVE_ECHO_BUD_V2_ICON_TYPE = new AnonymousClass47();
    public static final MarkerIconType LARGE_ACTIVE_SMART_THINGS_ICON_TYPE = new AnonymousClass48();
    public static final MarkerIconType LARGE_ACTIVE_ECHO_FRAMES_ICON_TYPE = new AnonymousClass49();
    public static final MarkerIconType LARGE_ACTIVE_REMOTE_CONTROL_ICON_TYPE = new AnonymousClass50();
    public static final MarkerIconType LARGE_ACTIVE_FIRE_TABLET_ICON_TYPE = new AnonymousClass51();
    public static final MarkerIconType LARGE_ACTIVE_DEFAULT_ICON_TYPE = new AnonymousClass52();
    public static final MarkerIconType LARGE_INACTIVE_FETCH_ICON_TYPE = new AnonymousClass53();
    public static final MarkerIconType LARGE_INACTIVE_TILE_ICON_TYPE = new AnonymousClass54();
    public static final MarkerIconType LARGE_INACTIVE_ECHO_AUTO_ICON_TYPE = new AnonymousClass55();
    public static final MarkerIconType LARGE_INACTIVE_LEFT_BUD_ICON_TYPE = new AnonymousClass56();
    public static final MarkerIconType LARGE_INACTIVE_LEFT_BUD_V2_ICON_TYPE = new AnonymousClass57();
    public static final MarkerIconType LARGE_INACTIVE_RIGHT_BUD_ICON_TYPE = new AnonymousClass58();
    public static final MarkerIconType LARGE_INACTIVE_RIGHT_BUD_V2_ICON_TYPE = new AnonymousClass59();
    public static final MarkerIconType LARGE_INACTIVE_ECHO_BUD_ICON_TYPE = new AnonymousClass60();
    public static final MarkerIconType LARGE_INACTIVE_ECHO_BUD_V2_ICON_TYPE = new AnonymousClass61();
    public static final MarkerIconType LARGE_INACTIVE_SMART_THINGS_ICON_TYPE = new AnonymousClass62();
    public static final MarkerIconType LARGE_INACTIVE_ECHO_FRAMES_ICON_TYPE = new AnonymousClass63();
    public static final MarkerIconType LARGE_INACTIVE_REMOTE_CONTROL_ICON_TYPE = new AnonymousClass64();
    public static final MarkerIconType LARGE_INACTIVE_FIRE_TABLET_ICON_TYPE = new AnonymousClass65();
    public static final MarkerIconType LARGE_INACTIVE_DEFAULT_ICON_TYPE = new AnonymousClass66();
    public static final MarkerIconType LARGE_ACTIVE_SAMSUNG_WATCH_ICON_TYPE = new AnonymousClass67();
    public static final MarkerIconType LARGE_INACTIVE_SAMSUNG_WATCH_ICON_TYPE = new AnonymousClass68();
    public static final MarkerIconType LARGE_ACTIVE_SAMSUNG_PHONE_ICON_TYPE = new AnonymousClass69();
    public static final MarkerIconType LARGE_INACTIVE_SAMSUNG_PHONE_ICON_TYPE = new AnonymousClass70();
    public static final MarkerIconType LARGE_ACTIVE_SAMSUNG_TABLET_ICON_TYPE = new AnonymousClass71();
    public static final MarkerIconType LARGE_INACTIVE_SAMSUNG_TABLET_ICON_TYPE = new AnonymousClass72();
    public static final MarkerIconType LARGE_ACTIVE_SAMSUNG_BUDS_LEFT_ICON_TYPE = new AnonymousClass73();
    public static final MarkerIconType LARGE_INACTIVE_SAMSUNG_BUDS_LEFT_ICON_TYPE = new AnonymousClass74();
    public static final MarkerIconType LARGE_ACTIVE_SAMSUNG_BUDS_RIGHT_ICON_TYPE = new AnonymousClass75();
    public static final MarkerIconType LARGE_INACTIVE_SAMSUNG_BUDS_RIGHT_ICON_TYPE = new AnonymousClass76();
    public static final MarkerIconType CLUSTER_ICON = new AnonymousClass77();
    private static final /* synthetic */ MarkerIconType[] $VALUES = $values();
    private static final Map<String, MarkerIconType> map = new HashMap(values().length, 1.0f);

    private static /* synthetic */ MarkerIconType[] $values() {
        return new MarkerIconType[]{SMALL_ACTIVE_FETCH_ICON_TYPE, SMALL_ACTIVE_TILE_ICON_TYPE, SMALL_ACTIVE_ECHO_AUTO_ICON_TYPE, SMALL_ACTIVE_LEFT_BUD_ICON_TYPE, SMALL_ACTIVE_LEFT_BUD_V2_ICON_TYPE, SMALL_ACTIVE_RIGHT_BUD_ICON_TYPE, SMALL_ACTIVE_RIGHT_BUD_V2_ICON_TYPE, SMALL_ACTIVE_ECHO_BUD_ICON_TYPE, SMALL_ACTIVE_ECHO_BUD_V2_ICON_TYPE, SMALL_ACTIVE_SMART_THINGS_ICON_TYPE, SMALL_ACTIVE_ECHO_FRAMES_ICON_TYPE, SMALL_ACTIVE_REMOTE_CONTROL_ICON_TYPE, SMALL_ACTIVE_FIRE_TABLET_ICON_TYPE, SMALL_ACTIVE_DEFAULT_ICON_TYPE, SMALL_INACTIVE_FETCH_ICON_TYPE, SMALL_INACTIVE_TILE_ICON_TYPE, SMALL_INACTIVE_ECHO_AUTO_ICON_TYPE, SMALL_INACTIVE_LEFT_BUD_ICON_TYPE, SMALL_INACTIVE_LEFT_BUD_V2_ICON_TYPE, SMALL_INACTIVE_RIGHT_BUD_ICON_TYPE, SMALL_INACTIVE_RIGHT_BUD_V2_ICON_TYPE, SMALL_INACTIVE_ECHO_BUD_ICON_TYPE, SMALL_INACTIVE_ECHO_BUD_V2_ICON_TYPE, SMALL_INACTIVE_SMART_THINGS_ICON_TYPE, SMALL_INACTIVE_ECHO_FRAMES_ICON_TYPE, SMALL_INACTIVE_REMOTE_CONTROL_ICON_TYPE, SMALL_INACTIVE_FIRE_TABLET_ICON_TYPE, SMALL_INACTIVE_DEFAULT_ICON_TYPE, SMALL_ACTIVE_SAMSUNG_WATCH_ICON_TYPE, SMALL_INACTIVE_SAMSUNG_WATCH_ICON_TYPE, SMALL_ACTIVE_SAMSUNG_PHONE_ICON_TYPE, SMALL_INACTIVE_SAMSUNG_PHONE_ICON_TYPE, SMALL_ACTIVE_SAMSUNG_TABLET_ICON_TYPE, SMALL_INACTIVE_SAMSUNG_TABLET_ICON_TYPE, SMALL_ACTIVE_SAMSUNG_BUDS_LEFT_ICON_TYPE, SMALL_INACTIVE_SAMSUNG_BUDS_LEFT_ICON_TYPE, SMALL_ACTIVE_SAMSUNG_BUDS_RIGHT_ICON_TYPE, SMALL_INACTIVE_SAMSUNG_BUDS_RIGHT_ICON_TYPE, LARGE_ACTIVE_FETCH_ICON_TYPE, LARGE_ACTIVE_TILE_ICON_TYPE, LARGE_ACTIVE_ECHO_AUTO_ICON_TYPE, LARGE_ACTIVE_LEFT_BUD_ICON_TYPE, LARGE_ACTIVE_LEFT_BUD_V2_ICON_TYPE, LARGE_ACTIVE_RIGHT_BUD_ICON_TYPE, LARGE_ACTIVE_RIGHT_BUD_V2_ICON_TYPE, LARGE_ACTIVE_ECHO_BUD_ICON_TYPE, LARGE_ACTIVE_ECHO_BUD_V2_ICON_TYPE, LARGE_ACTIVE_SMART_THINGS_ICON_TYPE, LARGE_ACTIVE_ECHO_FRAMES_ICON_TYPE, LARGE_ACTIVE_REMOTE_CONTROL_ICON_TYPE, LARGE_ACTIVE_FIRE_TABLET_ICON_TYPE, LARGE_ACTIVE_DEFAULT_ICON_TYPE, LARGE_INACTIVE_FETCH_ICON_TYPE, LARGE_INACTIVE_TILE_ICON_TYPE, LARGE_INACTIVE_ECHO_AUTO_ICON_TYPE, LARGE_INACTIVE_LEFT_BUD_ICON_TYPE, LARGE_INACTIVE_LEFT_BUD_V2_ICON_TYPE, LARGE_INACTIVE_RIGHT_BUD_ICON_TYPE, LARGE_INACTIVE_RIGHT_BUD_V2_ICON_TYPE, LARGE_INACTIVE_ECHO_BUD_ICON_TYPE, LARGE_INACTIVE_ECHO_BUD_V2_ICON_TYPE, LARGE_INACTIVE_SMART_THINGS_ICON_TYPE, LARGE_INACTIVE_ECHO_FRAMES_ICON_TYPE, LARGE_INACTIVE_REMOTE_CONTROL_ICON_TYPE, LARGE_INACTIVE_FIRE_TABLET_ICON_TYPE, LARGE_INACTIVE_DEFAULT_ICON_TYPE, LARGE_ACTIVE_SAMSUNG_WATCH_ICON_TYPE, LARGE_INACTIVE_SAMSUNG_WATCH_ICON_TYPE, LARGE_ACTIVE_SAMSUNG_PHONE_ICON_TYPE, LARGE_INACTIVE_SAMSUNG_PHONE_ICON_TYPE, LARGE_ACTIVE_SAMSUNG_TABLET_ICON_TYPE, LARGE_INACTIVE_SAMSUNG_TABLET_ICON_TYPE, LARGE_ACTIVE_SAMSUNG_BUDS_LEFT_ICON_TYPE, LARGE_INACTIVE_SAMSUNG_BUDS_LEFT_ICON_TYPE, LARGE_ACTIVE_SAMSUNG_BUDS_RIGHT_ICON_TYPE, LARGE_INACTIVE_SAMSUNG_BUDS_RIGHT_ICON_TYPE, CLUSTER_ICON};
    }

    static {
        for (MarkerIconType markerIconType : values()) {
            map.put(markerIconType.name, markerIconType);
        }
    }

    private MarkerIconType(String str, int i, String str2) {
        this.name = str2;
    }

    public static MarkerIconType of(String str) {
        return map.get(str);
    }

    public static MarkerIconType valueOf(String str) {
        return (MarkerIconType) Enum.valueOf(MarkerIconType.class, str);
    }

    public static MarkerIconType[] values() {
        return (MarkerIconType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }

    public /* synthetic */ MarkerIconType(String str, int i, String str2, int i2) {
        this(str, i, str2);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$1, reason: invalid class name */
    public enum AnonymousClass1 extends MarkerIconType {
        public /* synthetic */ AnonymousClass1() {
            this("SMALL_ACTIVE_FETCH_ICON_TYPE", 0, "SmallActiveFetch");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_ACTIVE_FETCH_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass1(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$2, reason: invalid class name */
    public enum AnonymousClass2 extends MarkerIconType {
        public /* synthetic */ AnonymousClass2() {
            this("SMALL_ACTIVE_TILE_ICON_TYPE", 1, "SmallActiveTile");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_ACTIVE_TILE_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass2(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$3, reason: invalid class name */
    public enum AnonymousClass3 extends MarkerIconType {
        public /* synthetic */ AnonymousClass3() {
            this("SMALL_ACTIVE_ECHO_AUTO_ICON_TYPE", 2, "SmallActiveEchoAuto");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_ACTIVE_ECHO_AUTO_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass3(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$4, reason: invalid class name */
    public enum AnonymousClass4 extends MarkerIconType {
        public /* synthetic */ AnonymousClass4() {
            this("SMALL_ACTIVE_LEFT_BUD_ICON_TYPE", 3, "SmallActiveLeftBud");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_ACTIVE_LEFT_BUD_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass4(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$5, reason: invalid class name */
    public enum AnonymousClass5 extends MarkerIconType {
        public /* synthetic */ AnonymousClass5() {
            this("SMALL_ACTIVE_LEFT_BUD_V2_ICON_TYPE", 4, "SmallActiveLeftBudV2");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_ACTIVE_LEFT_BUD_V2_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass5(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$6, reason: invalid class name */
    public enum AnonymousClass6 extends MarkerIconType {
        public /* synthetic */ AnonymousClass6() {
            this("SMALL_ACTIVE_RIGHT_BUD_ICON_TYPE", 5, "SmallActiveRightBud");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_ACTIVE_RIGHT_BUD_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass6(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$7, reason: invalid class name */
    public enum AnonymousClass7 extends MarkerIconType {
        public /* synthetic */ AnonymousClass7() {
            this("SMALL_ACTIVE_RIGHT_BUD_V2_ICON_TYPE", 6, "SmallActiveRightBudV2");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_ACTIVE_RIGHT_BUD_V2_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass7(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$8, reason: invalid class name */
    public enum AnonymousClass8 extends MarkerIconType {
        public /* synthetic */ AnonymousClass8() {
            this("SMALL_ACTIVE_ECHO_BUD_ICON_TYPE", 7, "SmallActiveEchoBud");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_ACTIVE_ECHO_BUD_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass8(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$10, reason: invalid class name */
    public enum AnonymousClass10 extends MarkerIconType {
        public /* synthetic */ AnonymousClass10() {
            this("SMALL_ACTIVE_SMART_THINGS_ICON_TYPE", 9, "SmallActiveSmartThings");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_ACTIVE_SMART_THINGS_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass10(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$11, reason: invalid class name */
    public enum AnonymousClass11 extends MarkerIconType {
        public /* synthetic */ AnonymousClass11() {
            this("SMALL_ACTIVE_ECHO_FRAMES_ICON_TYPE", 10, "SmallActiveEchoFrames");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_ACTIVE_ECHO_FRAMES_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass11(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$12, reason: invalid class name */
    public enum AnonymousClass12 extends MarkerIconType {
        public /* synthetic */ AnonymousClass12() {
            this("SMALL_ACTIVE_REMOTE_CONTROL_ICON_TYPE", 11, "SmallActiveRemoteControl");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_ACTIVE_REMOTE_CONTROL_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass12(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$13, reason: invalid class name */
    public enum AnonymousClass13 extends MarkerIconType {
        public /* synthetic */ AnonymousClass13() {
            this("SMALL_ACTIVE_FIRE_TABLET_ICON_TYPE", 12, "SmallActiveFireTablet");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_ACTIVE_FIRE_TABLET_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass13(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$14, reason: invalid class name */
    public enum AnonymousClass14 extends MarkerIconType {
        public /* synthetic */ AnonymousClass14() {
            this("SMALL_ACTIVE_DEFAULT_ICON_TYPE", 13, "SmallActiveDefault");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_ACTIVE_DEFAULT_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass14(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$15, reason: invalid class name */
    public enum AnonymousClass15 extends MarkerIconType {
        public /* synthetic */ AnonymousClass15() {
            this("SMALL_INACTIVE_FETCH_ICON_TYPE", 14, "SmallInactiveFetch");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_INACTIVE_FETCH_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass15(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$16, reason: invalid class name */
    public enum AnonymousClass16 extends MarkerIconType {
        public /* synthetic */ AnonymousClass16() {
            this("SMALL_INACTIVE_TILE_ICON_TYPE", 15, "SmallInactiveTile");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_INACTIVE_TILE_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass16(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$17, reason: invalid class name */
    public enum AnonymousClass17 extends MarkerIconType {
        public /* synthetic */ AnonymousClass17() {
            this("SMALL_INACTIVE_ECHO_AUTO_ICON_TYPE", 16, "SmallInactiveEchoAuto");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_INACTIVE_ECHO_AUTO_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass17(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$18, reason: invalid class name */
    public enum AnonymousClass18 extends MarkerIconType {
        public /* synthetic */ AnonymousClass18() {
            this("SMALL_INACTIVE_LEFT_BUD_ICON_TYPE", 17, "SmallInactiveLeftBud");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_INACTIVE_LEFT_BUD_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass18(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$19, reason: invalid class name */
    public enum AnonymousClass19 extends MarkerIconType {
        public /* synthetic */ AnonymousClass19() {
            this("SMALL_INACTIVE_LEFT_BUD_V2_ICON_TYPE", 18, "SmallInactiveLeftBudV2");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_INACTIVE_LEFT_BUD_V2_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass19(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$20, reason: invalid class name */
    public enum AnonymousClass20 extends MarkerIconType {
        public /* synthetic */ AnonymousClass20() {
            this("SMALL_INACTIVE_RIGHT_BUD_ICON_TYPE", 19, "SmallInactiveRightBud");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_INACTIVE_RIGHT_BUD_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass20(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$21, reason: invalid class name */
    public enum AnonymousClass21 extends MarkerIconType {
        public /* synthetic */ AnonymousClass21() {
            this("SMALL_INACTIVE_RIGHT_BUD_V2_ICON_TYPE", 20, "SmallInactiveRightBudV2");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_INACTIVE_RIGHT_BUD_V2_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass21(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$22, reason: invalid class name */
    public enum AnonymousClass22 extends MarkerIconType {
        public /* synthetic */ AnonymousClass22() {
            this("SMALL_INACTIVE_ECHO_BUD_ICON_TYPE", 21, "SmallInactiveEchoBud");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_INACTIVE_ECHO_BUD_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass22(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$23, reason: invalid class name */
    public enum AnonymousClass23 extends MarkerIconType {
        public /* synthetic */ AnonymousClass23() {
            this("SMALL_INACTIVE_ECHO_BUD_V2_ICON_TYPE", 22, "SmallInactiveEchoBudV2");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_INACTIVE_ECHO_BUD_V2_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass23(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$24, reason: invalid class name */
    public enum AnonymousClass24 extends MarkerIconType {
        public /* synthetic */ AnonymousClass24() {
            this("SMALL_INACTIVE_SMART_THINGS_ICON_TYPE", 23, "SmallInactiveSmartThings");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_INACTIVE_SMART_THINGS_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass24(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$25, reason: invalid class name */
    public enum AnonymousClass25 extends MarkerIconType {
        public /* synthetic */ AnonymousClass25() {
            this("SMALL_INACTIVE_ECHO_FRAMES_ICON_TYPE", 24, "SmallInactiveEchoFrames");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_INACTIVE_ECHO_FRAMES_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass25(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$26, reason: invalid class name */
    public enum AnonymousClass26 extends MarkerIconType {
        public /* synthetic */ AnonymousClass26() {
            this("SMALL_INACTIVE_REMOTE_CONTROL_ICON_TYPE", 25, "SmallInactiveRemoteControl");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_INACTIVE_REMOTE_CONTROL_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass26(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$27, reason: invalid class name */
    public enum AnonymousClass27 extends MarkerIconType {
        public /* synthetic */ AnonymousClass27() {
            this("SMALL_INACTIVE_FIRE_TABLET_ICON_TYPE", 26, "SmallInactiveFireTablet");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_INACTIVE_FIRE_TABLET_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass27(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$28, reason: invalid class name */
    public enum AnonymousClass28 extends MarkerIconType {
        public /* synthetic */ AnonymousClass28() {
            this("SMALL_INACTIVE_DEFAULT_ICON_TYPE", 27, "SmallInactiveDefault");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_INACTIVE_DEFAULT_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass28(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$29, reason: invalid class name */
    public enum AnonymousClass29 extends MarkerIconType {
        public /* synthetic */ AnonymousClass29() {
            this("SMALL_ACTIVE_SAMSUNG_WATCH_ICON_TYPE", 28, "SmallActiveSamsungWatch");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_ACTIVE_SAMSUNG_WATCH_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass29(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$30, reason: invalid class name */
    public enum AnonymousClass30 extends MarkerIconType {
        public /* synthetic */ AnonymousClass30() {
            this("SMALL_INACTIVE_SAMSUNG_WATCH_ICON_TYPE", 29, "SmallInactiveSamsungWatch");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_INACTIVE_SAMSUNG_WATCH_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass30(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$31, reason: invalid class name */
    public enum AnonymousClass31 extends MarkerIconType {
        public /* synthetic */ AnonymousClass31() {
            this("SMALL_ACTIVE_SAMSUNG_PHONE_ICON_TYPE", 30, "SmallActiveSamsungPhone");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_ACTIVE_SAMSUNG_PHONE_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass31(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$32, reason: invalid class name */
    public enum AnonymousClass32 extends MarkerIconType {
        public /* synthetic */ AnonymousClass32() {
            this("SMALL_INACTIVE_SAMSUNG_PHONE_ICON_TYPE", 31, "SmallInactiveSamsungPhone");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_INACTIVE_SAMSUNG_PHONE_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass32(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$33, reason: invalid class name */
    public enum AnonymousClass33 extends MarkerIconType {
        public /* synthetic */ AnonymousClass33() {
            this("SMALL_ACTIVE_SAMSUNG_TABLET_ICON_TYPE", 32, "SmallActiveSamsungTablet");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_ACTIVE_SAMSUNG_TABLET_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass33(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$34, reason: invalid class name */
    public enum AnonymousClass34 extends MarkerIconType {
        public /* synthetic */ AnonymousClass34() {
            this("SMALL_INACTIVE_SAMSUNG_TABLET_ICON_TYPE", 33, "SmallInactiveSamsungTablet");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_INACTIVE_SAMSUNG_TABLET_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass34(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$35, reason: invalid class name */
    public enum AnonymousClass35 extends MarkerIconType {
        public /* synthetic */ AnonymousClass35() {
            this("SMALL_ACTIVE_SAMSUNG_BUDS_LEFT_ICON_TYPE", 34, "SmallActiveSamsungBudsLeft");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_ACTIVE_SAMSUNG_BUDS_LEFT_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass35(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$36, reason: invalid class name */
    public enum AnonymousClass36 extends MarkerIconType {
        public /* synthetic */ AnonymousClass36() {
            this("SMALL_INACTIVE_SAMSUNG_BUDS_LEFT_ICON_TYPE", 35, "SmallInactiveSamsungBudsLeft");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_INACTIVE_SAMSUNG_BUDS_LEFT_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass36(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$37, reason: invalid class name */
    public enum AnonymousClass37 extends MarkerIconType {
        public /* synthetic */ AnonymousClass37() {
            this("SMALL_ACTIVE_SAMSUNG_BUDS_RIGHT_ICON_TYPE", 36, "SmallActiveSamsungBudsRight");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_ACTIVE_SAMSUNG_BUDS_RIGHT_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass37(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$38, reason: invalid class name */
    public enum AnonymousClass38 extends MarkerIconType {
        public /* synthetic */ AnonymousClass38() {
            this("SMALL_INACTIVE_SAMSUNG_BUDS_RIGHT_ICON_TYPE", 37, "SmallInactiveSamsungBudsRight");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_INACTIVE_SAMSUNG_BUDS_RIGHT_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass38(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$39, reason: invalid class name */
    public enum AnonymousClass39 extends MarkerIconType {
        public /* synthetic */ AnonymousClass39() {
            this("LARGE_ACTIVE_FETCH_ICON_TYPE", 38, "LargeActiveFetch");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_ACTIVE_FETCH_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.BOTTOM_CENTER;
        }

        private AnonymousClass39(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$40, reason: invalid class name */
    public enum AnonymousClass40 extends MarkerIconType {
        public /* synthetic */ AnonymousClass40() {
            this("LARGE_ACTIVE_TILE_ICON_TYPE", 39, "LargeActiveTile");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_ACTIVE_TILE_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.BOTTOM_CENTER;
        }

        private AnonymousClass40(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$41, reason: invalid class name */
    public enum AnonymousClass41 extends MarkerIconType {
        public /* synthetic */ AnonymousClass41() {
            this("LARGE_ACTIVE_ECHO_AUTO_ICON_TYPE", 40, "LargeActiveEchoAuto");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_ACTIVE_ECHO_AUTO_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.BOTTOM_CENTER;
        }

        private AnonymousClass41(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$42, reason: invalid class name */
    public enum AnonymousClass42 extends MarkerIconType {
        public /* synthetic */ AnonymousClass42() {
            this("LARGE_ACTIVE_LEFT_BUD_ICON_TYPE", 41, "LargeActiveLeftBud");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_ACTIVE_LEFT_BUD_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.BOTTOM_CENTER;
        }

        private AnonymousClass42(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$43, reason: invalid class name */
    public enum AnonymousClass43 extends MarkerIconType {
        public /* synthetic */ AnonymousClass43() {
            this("LARGE_ACTIVE_LEFT_BUD_V2_ICON_TYPE", 42, "LargeActiveLeftBudV2");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_ACTIVE_LEFT_BUD_V2_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.BOTTOM_CENTER;
        }

        private AnonymousClass43(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$44, reason: invalid class name */
    public enum AnonymousClass44 extends MarkerIconType {
        public /* synthetic */ AnonymousClass44() {
            this("LARGE_ACTIVE_RIGHT_BUD_ICON_TYPE", 43, "LargeActiveRightBud");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_ACTIVE_RIGHT_BUD_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.BOTTOM_CENTER;
        }

        private AnonymousClass44(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$45, reason: invalid class name */
    public enum AnonymousClass45 extends MarkerIconType {
        public /* synthetic */ AnonymousClass45() {
            this("LARGE_ACTIVE_RIGHT_BUD_V2_ICON_TYPE", 44, "LargeActiveRightBudV2");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_ACTIVE_RIGHT_BUD_V2_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.BOTTOM_CENTER;
        }

        private AnonymousClass45(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$46, reason: invalid class name */
    public enum AnonymousClass46 extends MarkerIconType {
        public /* synthetic */ AnonymousClass46() {
            this("LARGE_ACTIVE_ECHO_BUD_ICON_TYPE", 45, "LargeActiveEchoBud");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_ACTIVE_ECHO_BUD_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.BOTTOM_CENTER;
        }

        private AnonymousClass46(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$47, reason: invalid class name */
    public enum AnonymousClass47 extends MarkerIconType {
        public /* synthetic */ AnonymousClass47() {
            this("LARGE_ACTIVE_ECHO_BUD_V2_ICON_TYPE", 46, "LargeActiveEchoBudV2");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_ACTIVE_ECHO_BUD_V2_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.BOTTOM_CENTER;
        }

        private AnonymousClass47(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$48, reason: invalid class name */
    public enum AnonymousClass48 extends MarkerIconType {
        public /* synthetic */ AnonymousClass48() {
            this("LARGE_ACTIVE_SMART_THINGS_ICON_TYPE", 47, "LargeActiveSmartThings");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_ACTIVE_SMART_THINGS_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass48(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$49, reason: invalid class name */
    public enum AnonymousClass49 extends MarkerIconType {
        public /* synthetic */ AnonymousClass49() {
            this("LARGE_ACTIVE_ECHO_FRAMES_ICON_TYPE", 48, "LargeActiveEchoFrames");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_ACTIVE_ECHO_FRAMES_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass49(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$50, reason: invalid class name */
    public enum AnonymousClass50 extends MarkerIconType {
        public /* synthetic */ AnonymousClass50() {
            this("LARGE_ACTIVE_REMOTE_CONTROL_ICON_TYPE", 49, "LargeActiveRemoteControl");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_ACTIVE_REMOTE_CONTROL_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass50(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$51, reason: invalid class name */
    public enum AnonymousClass51 extends MarkerIconType {
        public /* synthetic */ AnonymousClass51() {
            this("LARGE_ACTIVE_FIRE_TABLET_ICON_TYPE", 50, "LargeActiveFireTablet");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_ACTIVE_FIRE_TABLET_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass51(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$52, reason: invalid class name */
    public enum AnonymousClass52 extends MarkerIconType {
        public /* synthetic */ AnonymousClass52() {
            this("LARGE_ACTIVE_DEFAULT_ICON_TYPE", 51, "LargeActiveDefault");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_ACTIVE_DEFAULT_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.BOTTOM_CENTER;
        }

        private AnonymousClass52(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$53, reason: invalid class name */
    public enum AnonymousClass53 extends MarkerIconType {
        public /* synthetic */ AnonymousClass53() {
            this("LARGE_INACTIVE_FETCH_ICON_TYPE", 52, "LargeInactiveFetch");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_INACTIVE_FETCH_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.BOTTOM_CENTER;
        }

        private AnonymousClass53(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$54, reason: invalid class name */
    public enum AnonymousClass54 extends MarkerIconType {
        public /* synthetic */ AnonymousClass54() {
            this("LARGE_INACTIVE_TILE_ICON_TYPE", 53, "LargeInactiveTile");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_INACTIVE_TILE_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.BOTTOM_CENTER;
        }

        private AnonymousClass54(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$55, reason: invalid class name */
    public enum AnonymousClass55 extends MarkerIconType {
        public /* synthetic */ AnonymousClass55() {
            this("LARGE_INACTIVE_ECHO_AUTO_ICON_TYPE", 54, "LargeInactiveEchoAuto");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_INACTIVE_ECHO_AUTO_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.BOTTOM_CENTER;
        }

        private AnonymousClass55(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$56, reason: invalid class name */
    public enum AnonymousClass56 extends MarkerIconType {
        public /* synthetic */ AnonymousClass56() {
            this("LARGE_INACTIVE_LEFT_BUD_ICON_TYPE", 55, "LargeInactiveLeftBud");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_INACTIVE_LEFT_BUD_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.BOTTOM_CENTER;
        }

        private AnonymousClass56(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$57, reason: invalid class name */
    public enum AnonymousClass57 extends MarkerIconType {
        public /* synthetic */ AnonymousClass57() {
            this("LARGE_INACTIVE_LEFT_BUD_V2_ICON_TYPE", 56, "LargeInactiveLeftBudV2");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_INACTIVE_LEFT_BUD_V2_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.BOTTOM_CENTER;
        }

        private AnonymousClass57(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$58, reason: invalid class name */
    public enum AnonymousClass58 extends MarkerIconType {
        public /* synthetic */ AnonymousClass58() {
            this("LARGE_INACTIVE_RIGHT_BUD_ICON_TYPE", 57, "LargeInactiveRightBud");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_INACTIVE_RIGHT_BUD_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.BOTTOM_CENTER;
        }

        private AnonymousClass58(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$59, reason: invalid class name */
    public enum AnonymousClass59 extends MarkerIconType {
        public /* synthetic */ AnonymousClass59() {
            this("LARGE_INACTIVE_RIGHT_BUD_V2_ICON_TYPE", 58, "LargeInactiveRightBudV2");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_INACTIVE_RIGHT_BUD_V2_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.BOTTOM_CENTER;
        }

        private AnonymousClass59(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$60, reason: invalid class name */
    public enum AnonymousClass60 extends MarkerIconType {
        public /* synthetic */ AnonymousClass60() {
            this("LARGE_INACTIVE_ECHO_BUD_ICON_TYPE", 59, "LargeInactiveEchoBud");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_INACTIVE_ECHO_BUD_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.BOTTOM_CENTER;
        }

        private AnonymousClass60(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$61, reason: invalid class name */
    public enum AnonymousClass61 extends MarkerIconType {
        public /* synthetic */ AnonymousClass61() {
            this("LARGE_INACTIVE_ECHO_BUD_V2_ICON_TYPE", 60, "LargeInactiveEchoBudV2");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_INACTIVE_ECHO_BUD_V2_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.BOTTOM_CENTER;
        }

        private AnonymousClass61(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$62, reason: invalid class name */
    public enum AnonymousClass62 extends MarkerIconType {
        public /* synthetic */ AnonymousClass62() {
            this("LARGE_INACTIVE_SMART_THINGS_ICON_TYPE", 61, "LargeInactiveSmartThings");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_INACTIVE_SMART_THINGS_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass62(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$63, reason: invalid class name */
    public enum AnonymousClass63 extends MarkerIconType {
        public /* synthetic */ AnonymousClass63() {
            this("LARGE_INACTIVE_ECHO_FRAMES_ICON_TYPE", 62, "LargeInactiveEchoFrames");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_INACTIVE_ECHO_FRAMES_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass63(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$64, reason: invalid class name */
    public enum AnonymousClass64 extends MarkerIconType {
        public /* synthetic */ AnonymousClass64() {
            this("LARGE_INACTIVE_REMOTE_CONTROL_ICON_TYPE", 63, "LargeInactiveRemoteControl");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_INACTIVE_REMOTE_CONTROL_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass64(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$65, reason: invalid class name */
    public enum AnonymousClass65 extends MarkerIconType {
        public /* synthetic */ AnonymousClass65() {
            this("LARGE_INACTIVE_FIRE_TABLET_ICON_TYPE", 64, "LargeInactiveFireTablet");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_INACTIVE_FIRE_TABLET_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass65(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$66, reason: invalid class name */
    public enum AnonymousClass66 extends MarkerIconType {
        public /* synthetic */ AnonymousClass66() {
            this("LARGE_INACTIVE_DEFAULT_ICON_TYPE", 65, "LargeInactiveDefault");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_INACTIVE_DEFAULT_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.BOTTOM_CENTER;
        }

        private AnonymousClass66(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$67, reason: invalid class name */
    public enum AnonymousClass67 extends MarkerIconType {
        public /* synthetic */ AnonymousClass67() {
            this("LARGE_ACTIVE_SAMSUNG_WATCH_ICON_TYPE", 66, "LargeActiveSamsungWatch");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_ACTIVE_SAMSUNG_WATCH_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass67(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$68, reason: invalid class name */
    public enum AnonymousClass68 extends MarkerIconType {
        public /* synthetic */ AnonymousClass68() {
            this("LARGE_INACTIVE_SAMSUNG_WATCH_ICON_TYPE", 67, "LargeInactiveSamsungWatch");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_INACTIVE_SAMSUNG_WATCH_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass68(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$69, reason: invalid class name */
    public enum AnonymousClass69 extends MarkerIconType {
        public /* synthetic */ AnonymousClass69() {
            this("LARGE_ACTIVE_SAMSUNG_PHONE_ICON_TYPE", 68, "LargeActiveSamsungPhone");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_ACTIVE_SAMSUNG_PHONE_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass69(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$70, reason: invalid class name */
    public enum AnonymousClass70 extends MarkerIconType {
        public /* synthetic */ AnonymousClass70() {
            this("LARGE_INACTIVE_SAMSUNG_PHONE_ICON_TYPE", 69, "LargeInactiveSamsungPhone");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_INACTIVE_SAMSUNG_PHONE_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass70(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$71, reason: invalid class name */
    public enum AnonymousClass71 extends MarkerIconType {
        public /* synthetic */ AnonymousClass71() {
            this("LARGE_ACTIVE_SAMSUNG_TABLET_ICON_TYPE", 70, "LargeActiveSamsungTablet");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_ACTIVE_SAMSUNG_TABLET_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass71(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$72, reason: invalid class name */
    public enum AnonymousClass72 extends MarkerIconType {
        public /* synthetic */ AnonymousClass72() {
            this("LARGE_INACTIVE_SAMSUNG_TABLET_ICON_TYPE", 71, "LargeInactiveSamsungTablet");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_INACTIVE_SAMSUNG_TABLET_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass72(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$73, reason: invalid class name */
    public enum AnonymousClass73 extends MarkerIconType {
        public /* synthetic */ AnonymousClass73() {
            this("LARGE_ACTIVE_SAMSUNG_BUDS_LEFT_ICON_TYPE", 72, "LargeActiveSamsungBudsLeft");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_ACTIVE_SAMSUNG_BUDS_LEFT_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass73(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$74, reason: invalid class name */
    public enum AnonymousClass74 extends MarkerIconType {
        public /* synthetic */ AnonymousClass74() {
            this("LARGE_INACTIVE_SAMSUNG_BUDS_LEFT_ICON_TYPE", 73, "LargeInactiveSamsungBudsLeft");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_INACTIVE_SAMSUNG_BUDS_LEFT_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass74(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$75, reason: invalid class name */
    public enum AnonymousClass75 extends MarkerIconType {
        public /* synthetic */ AnonymousClass75() {
            this("LARGE_ACTIVE_SAMSUNG_BUDS_RIGHT_ICON_TYPE", 74, "LargeActiveSamsungBudsRight");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_ACTIVE_SAMSUNG_BUDS_RIGHT_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass75(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$76, reason: invalid class name */
    public enum AnonymousClass76 extends MarkerIconType {
        public /* synthetic */ AnonymousClass76() {
            this("LARGE_INACTIVE_SAMSUNG_BUDS_RIGHT_ICON_TYPE", 75, "LargeInactiveSamsungBudsRight");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.LARGE_INACTIVE_SAMSUNG_BUDS_RIGHT_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass76(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$77, reason: invalid class name */
    public enum AnonymousClass77 extends MarkerIconType {
        public /* synthetic */ AnonymousClass77() {
            this("CLUSTER_ICON", 76, "ClusterIcon");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.CLUSTER_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass77(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerIconType$9, reason: invalid class name */
    public enum AnonymousClass9 extends MarkerIconType {
        public /* synthetic */ AnonymousClass9() {
            this("SMALL_ACTIVE_ECHO_BUD_V2_ICON_TYPE", 8, "SmallActiveEchoBudV2");
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.ImageIndexable
        public ImageFactory.ImageId getImageId() {
            return ImageFactory.ImageId.SMALL_ACTIVE_ECHO_BUD_V2_ICON;
        }

        @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable
        public MarkerLayoutPositionable.LayoutPosition getLayoutPosition() {
            return MarkerLayoutPositionable.LayoutPosition.CENTER;
        }

        private AnonymousClass9(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }
}
