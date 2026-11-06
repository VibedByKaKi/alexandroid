package com.amazon.dee.app.ui.clouddrive;

import android.graphics.Bitmap;
import com.amazon.dee.app.core.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BISHOP' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class DeviceScreenConfiguration {
    private static final /* synthetic */ DeviceScreenConfiguration[] $VALUES;
    public static final DeviceScreenConfiguration BISHOP;
    public static final DeviceScreenConfiguration CHECKERS;
    public static final DeviceScreenConfiguration KNIGHT;
    public static final DeviceScreenConfiguration ROOK;
    public static final DeviceScreenConfiguration UNKNOWN;
    public static final DeviceScreenConfiguration VEGA;
    public final float aspectRatio;
    public final int description = setDescription();
    public final CropGeometry geometry;
    public final int height;
    public final String type;
    public final int width;

    private static /* synthetic */ DeviceScreenConfiguration[] $values() {
        return new DeviceScreenConfiguration[]{BISHOP, KNIGHT, ROOK, VEGA, CHECKERS, UNKNOWN};
    }

    static {
        CropGeometry cropGeometry = CropGeometry.RECTANGULAR;
        BISHOP = new DeviceScreenConfiguration("BISHOP", 0, 1280, 800, "AWZZ5CVHX2CD", cropGeometry);
        KNIGHT = new DeviceScreenConfiguration("KNIGHT", 1, 1024, 600, "A1NL4BVLQ4L3N3", cropGeometry);
        ROOK = new DeviceScreenConfiguration("ROOK", 2, 480, 480, "A10A33FOX2NUBK", CropGeometry.CIRCULAR);
        VEGA = new DeviceScreenConfiguration("VEGA", 3, 1920, 1200, "A2J0R2SD7G9LPA", cropGeometry);
        CHECKERS = new DeviceScreenConfiguration("CHECKERS", 4, 980, 460, "A4ZP7ZC4PI6TO", cropGeometry);
        UNKNOWN = new DeviceScreenConfiguration("UNKNOWN", 5, 1280, 800, "", cropGeometry);
        $VALUES = $values();
    }

    private DeviceScreenConfiguration(String str, int i, int i2, int i3, String str2, CropGeometry cropGeometry) {
        this.width = i2;
        this.height = i3;
        this.type = str2;
        this.geometry = cropGeometry;
        this.aspectRatio = i2 / i3;
    }

    public static DeviceScreenConfiguration getByType(String str) {
        for (DeviceScreenConfiguration deviceScreenConfiguration : values()) {
            if (deviceScreenConfiguration.type.equals(str)) {
                return deviceScreenConfiguration;
            }
        }
        return UNKNOWN;
    }

    private int setDescription() {
        return this.geometry == CropGeometry.CIRCULAR ? R.string.alexa_device_background_image_rook_crop_and_zoom_description : R.string.alexa_device_background_image_knight_crop_and_zoom_description;
    }

    public static DeviceScreenConfiguration valueOf(String str) {
        return (DeviceScreenConfiguration) Enum.valueOf(DeviceScreenConfiguration.class, str);
    }

    public static DeviceScreenConfiguration[] values() {
        return (DeviceScreenConfiguration[]) $VALUES.clone();
    }

    public double getScreenScale(Bitmap bitmap) {
        return this.width / bitmap.getWidth();
    }
}
