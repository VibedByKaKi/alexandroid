package com.amazon.mobile.heremapsexplore.Constants;

import com.here.sdk.core.Anchor2D;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface MarkerLayoutPositionable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Anchored {
        Anchor2D getAnchor();
    }

    LayoutPosition getLayoutPosition();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class LayoutPosition implements Anchored {
        public static final LayoutPosition CENTER = new AnonymousClass1();
        public static final LayoutPosition BOTTOM_CENTER = new AnonymousClass2();
        private static final /* synthetic */ LayoutPosition[] $VALUES = $values();

        private static /* synthetic */ LayoutPosition[] $values() {
            return new LayoutPosition[]{CENTER, BOTTOM_CENTER};
        }

        public /* synthetic */ LayoutPosition(String str, int i, int i2) {
            this(str, i);
        }

        public static LayoutPosition valueOf(String str) {
            return (LayoutPosition) Enum.valueOf(LayoutPosition.class, str);
        }

        public static LayoutPosition[] values() {
            return (LayoutPosition[]) $VALUES.clone();
        }

        private LayoutPosition(String str, int i) {
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable$LayoutPosition$1, reason: invalid class name */
        public enum AnonymousClass1 extends LayoutPosition {
            public /* synthetic */ AnonymousClass1() {
                this("CENTER", 0);
            }

            @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable.Anchored
            public Anchor2D getAnchor() {
                return new Anchor2D(0.5d, 0.5d);
            }

            private AnonymousClass1(String str, int i) {
                super(str, i, 0);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        /* renamed from: com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable$LayoutPosition$2, reason: invalid class name */
        public enum AnonymousClass2 extends LayoutPosition {
            public /* synthetic */ AnonymousClass2() {
                this("BOTTOM_CENTER", 1);
            }

            @Override // com.amazon.mobile.heremapsexplore.Constants.MarkerLayoutPositionable.Anchored
            public Anchor2D getAnchor() {
                return new Anchor2D(0.5d, 1.0d);
            }

            private AnonymousClass2(String str, int i) {
                super(str, i, 0);
            }
        }
    }
}
