package com.amazon.dee.app.services.accessibility;

import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u001c\u001d\u001e\u001fJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0005H&J\b\u0010\u0010\u001a\u00020\u0005H&J\b\u0010\u0011\u001a\u00020\u0005H&J\b\u0010\u0012\u001a\u00020\u0005H&J\b\u0010\u0013\u001a\u00020\u0005H&J\b\u0010\u0014\u001a\u00020\u0005H&J\b\u0010\u0015\u001a\u00020\u0005H&J\b\u0010\u0016\u001a\u00020\u0005H&J\b\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u0005H&J\b\u0010\u001a\u001a\u00020\u001bH&¨\u0006 À\u0006\u0003"}, d2 = {"Lcom/amazon/dee/app/services/accessibility/AccessibilityService;", "", "recordAccessibilityMetrics", "", "isAccessibilityEnabled", "", "isTalkBackEnabled", "isBrailleReaderEnabled", "isSwitchAccessEnabled", "isClosedCaptioningEnabled", "isMagnificationGestureEnabled", "getFontSizeSetting", "Lcom/amazon/dee/app/services/accessibility/AccessibilityService$FontSizeSetting;", "getDisplaySizeSetting", "Lcom/amazon/dee/app/services/accessibility/AccessibilityService$DisplaySizeSetting;", "isClickAfterPointerStopsMovingEnabled", "isHighContrastEnabled", "isPowerButtonEndsCallEnabled", "isSpeakPasswordsEnabled", "isLargeMousePointerEnabled", "isMonoAudioEnabled", "isHearingDeviceEnabled", "isAccessibilityShortcutEnabled", "getTouchAndHoldDelaySetting", "Lcom/amazon/dee/app/services/accessibility/AccessibilityService$TouchAndHoldDelaySetting;", "isInvertedColorsEnabled", "getColorCorrectionMode", "Lcom/amazon/dee/app/services/accessibility/AccessibilityService$ColorCorrectionMode;", "ColorCorrectionMode", "FontSizeSetting", "DisplaySizeSetting", "TouchAndHoldDelaySetting", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AccessibilityService {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/dee/app/services/accessibility/AccessibilityService$ColorCorrectionMode;", "", "<init>", "(Ljava/lang/String;I)V", "None", "Deuteranomaly", "Protanomaly", "Tritanomaly", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ColorCorrectionMode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ColorCorrectionMode[] $VALUES;
        public static final ColorCorrectionMode None = new ColorCorrectionMode("None", 0);
        public static final ColorCorrectionMode Deuteranomaly = new ColorCorrectionMode("Deuteranomaly", 1);
        public static final ColorCorrectionMode Protanomaly = new ColorCorrectionMode("Protanomaly", 2);
        public static final ColorCorrectionMode Tritanomaly = new ColorCorrectionMode("Tritanomaly", 3);

        private static final /* synthetic */ ColorCorrectionMode[] $values() {
            return new ColorCorrectionMode[]{None, Deuteranomaly, Protanomaly, Tritanomaly};
        }

        static {
            ColorCorrectionMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private ColorCorrectionMode(String str, int i) {
        }

        @NotNull
        public static EnumEntries<ColorCorrectionMode> getEntries() {
            return $ENTRIES;
        }

        public static ColorCorrectionMode valueOf(String str) {
            return (ColorCorrectionMode) Enum.valueOf(ColorCorrectionMode.class, str);
        }

        public static ColorCorrectionMode[] values() {
            return (ColorCorrectionMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/dee/app/services/accessibility/AccessibilityService$DisplaySizeSetting;", "", "<init>", "(Ljava/lang/String;I)V", "Small", "Medium", "Large", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DisplaySizeSetting {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DisplaySizeSetting[] $VALUES;
        public static final DisplaySizeSetting Small = new DisplaySizeSetting("Small", 0);
        public static final DisplaySizeSetting Medium = new DisplaySizeSetting("Medium", 1);
        public static final DisplaySizeSetting Large = new DisplaySizeSetting("Large", 2);

        private static final /* synthetic */ DisplaySizeSetting[] $values() {
            return new DisplaySizeSetting[]{Small, Medium, Large};
        }

        static {
            DisplaySizeSetting[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private DisplaySizeSetting(String str, int i) {
        }

        @NotNull
        public static EnumEntries<DisplaySizeSetting> getEntries() {
            return $ENTRIES;
        }

        public static DisplaySizeSetting valueOf(String str) {
            return (DisplaySizeSetting) Enum.valueOf(DisplaySizeSetting.class, str);
        }

        public static DisplaySizeSetting[] values() {
            return (DisplaySizeSetting[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/dee/app/services/accessibility/AccessibilityService$FontSizeSetting;", "", "<init>", "(Ljava/lang/String;I)V", "Small", "Medium", "Large", "Largest", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FontSizeSetting {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FontSizeSetting[] $VALUES;
        public static final FontSizeSetting Small = new FontSizeSetting("Small", 0);
        public static final FontSizeSetting Medium = new FontSizeSetting("Medium", 1);
        public static final FontSizeSetting Large = new FontSizeSetting("Large", 2);
        public static final FontSizeSetting Largest = new FontSizeSetting("Largest", 3);

        private static final /* synthetic */ FontSizeSetting[] $values() {
            return new FontSizeSetting[]{Small, Medium, Large, Largest};
        }

        static {
            FontSizeSetting[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private FontSizeSetting(String str, int i) {
        }

        @NotNull
        public static EnumEntries<FontSizeSetting> getEntries() {
            return $ENTRIES;
        }

        public static FontSizeSetting valueOf(String str) {
            return (FontSizeSetting) Enum.valueOf(FontSizeSetting.class, str);
        }

        public static FontSizeSetting[] values() {
            return (FontSizeSetting[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/dee/app/services/accessibility/AccessibilityService$TouchAndHoldDelaySetting;", "", "<init>", "(Ljava/lang/String;I)V", "Short", "Medium", "Long", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TouchAndHoldDelaySetting {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TouchAndHoldDelaySetting[] $VALUES;
        public static final TouchAndHoldDelaySetting Short = new TouchAndHoldDelaySetting("Short", 0);
        public static final TouchAndHoldDelaySetting Medium = new TouchAndHoldDelaySetting("Medium", 1);
        public static final TouchAndHoldDelaySetting Long = new TouchAndHoldDelaySetting("Long", 2);

        private static final /* synthetic */ TouchAndHoldDelaySetting[] $values() {
            return new TouchAndHoldDelaySetting[]{Short, Medium, Long};
        }

        static {
            TouchAndHoldDelaySetting[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private TouchAndHoldDelaySetting(String str, int i) {
        }

        @NotNull
        public static EnumEntries<TouchAndHoldDelaySetting> getEntries() {
            return $ENTRIES;
        }

        public static TouchAndHoldDelaySetting valueOf(String str) {
            return (TouchAndHoldDelaySetting) Enum.valueOf(TouchAndHoldDelaySetting.class, str);
        }

        public static TouchAndHoldDelaySetting[] values() {
            return (TouchAndHoldDelaySetting[]) $VALUES.clone();
        }
    }

    @NotNull
    ColorCorrectionMode getColorCorrectionMode();

    @NotNull
    DisplaySizeSetting getDisplaySizeSetting();

    @NotNull
    FontSizeSetting getFontSizeSetting();

    @NotNull
    TouchAndHoldDelaySetting getTouchAndHoldDelaySetting();

    boolean isAccessibilityEnabled();

    boolean isAccessibilityShortcutEnabled();

    boolean isBrailleReaderEnabled();

    boolean isClickAfterPointerStopsMovingEnabled();

    boolean isClosedCaptioningEnabled();

    boolean isHearingDeviceEnabled();

    boolean isHighContrastEnabled();

    boolean isInvertedColorsEnabled();

    boolean isLargeMousePointerEnabled();

    boolean isMagnificationGestureEnabled();

    boolean isMonoAudioEnabled();

    boolean isPowerButtonEndsCallEnabled();

    boolean isSpeakPasswordsEnabled();

    boolean isSwitchAccessEnabled();

    boolean isTalkBackEnabled();

    void recordAccessibilityMetrics();
}
