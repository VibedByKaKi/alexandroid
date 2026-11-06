package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum EventProperty implements APLEnum {
    kEventPropertyAlign(0),
    kEventPropertyArguments(1),
    kEventPropertyAudioTrack(2),
    kEventPropertyCommand(3),
    kEventPropertyComponent(4),
    kEventPropertyComponents(5),
    kEventPropertyDirection(6),
    kEventPropertyExtension(7),
    kEventPropertyExtensionURI(8),
    kEventPropertyExtensionResourceId(9),
    kEventPropertyFlags(10),
    kEventPropertyHeaders(11),
    kEventPropertyHighlightMode(12),
    kEventPropertyMediaType(13),
    kEventPropertyName(14),
    kEventPropertyPosition(15),
    kEventPropertyRangeStart(16),
    kEventPropertyRangeEnd(17),
    kEventPropertyReason(18),
    kEventPropertySource(19),
    kEventPropertyValue(20);

    private static SparseArray<EventProperty> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (EventProperty eventProperty : values()) {
            values.put(eventProperty.getIndex(), eventProperty);
        }
    }

    EventProperty(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static EventProperty valueOf(int i) {
        return values.get(i);
    }
}
