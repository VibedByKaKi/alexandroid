package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum RootProperty implements APLEnum {
    kRootPropertySetBegin(0),
    kAgentName(1),
    kAgentVersion(2),
    kAllowOpenUrl(3),
    kDisallowDialog(4),
    kDisallowEditText(5),
    kDisallowVideo(6),
    kAnimationQuality(7),
    kDefaultIdleTimeout(8),
    kReportedVersion(9),
    kEnforceTypeField(10),
    kDefaultFontColor(11),
    kDefaultHighlightColor(12),
    kDefaultFontFamily(13),
    kTrackProvenance(14),
    kPagerChildCache(15),
    kSequenceChildCache(16),
    kUTCTime(17),
    kLang(18),
    kLayoutDirection(19),
    kLocalTimeAdjustment(20),
    kDoublePressTimeout(21),
    kLongPressTimeout(22),
    kPressedDuration(23),
    kTapOrScrollTimeout(24),
    kSwipeAwayFulfillDistancePercentageThreshold(25),
    kSwipeAwayAnimationEasing(26),
    kSwipeVelocityThreshold(27),
    kSwipeMaxVelocity(28),
    kSwipeAngleTolerance(29),
    kDefaultSwipeAnimationDuration(30),
    kMaxSwipeAnimationDuration(31),
    kMinimumFlingVelocity(32),
    kTickHandlerUpdateLimit(33),
    kFontScale(34),
    kScreenMode(35),
    kScreenReader(36),
    kPointerInactivityTimeout(37),
    kMaximumFlingVelocity(38),
    kMaximumTapVelocity(39),
    kPointerSlopThreshold(40),
    kScrollCommandDuration(41),
    kScrollOnFocusDuration(42),
    kScrollSnapDuration(43),
    kDefaultPagerAnimationDuration(44),
    kDefaultPagerAnimationEasing(45),
    kScrollAngleSlopeVertical(46),
    kScrollAngleSlopeHorizontal(47),
    kScrollFlingVelocityLimitEasingVertical(48),
    kScrollFlingVelocityLimitEasingHorizontal(49),
    kUEScrollerVelocityEasing(50),
    kUEScrollerDurationEasing(51),
    kUEScrollerMaxDuration(52),
    kUEScrollerDeceleration(53),
    kSendEventAdditionalFlags(54),
    kTextMeasurementCacheLimit(55),
    kInitialDisplayState(56),
    kTrackedChangesCapacityLimit(57),
    kRootPropertySetEnd(58);

    private static SparseArray<RootProperty> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (RootProperty rootProperty : values()) {
            values.put(rootProperty.getIndex(), rootProperty);
        }
    }

    RootProperty(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static RootProperty valueOf(int i) {
        return values.get(i);
    }
}
