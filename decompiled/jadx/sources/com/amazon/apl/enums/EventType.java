package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum EventType implements APLEnum {
    kEventTypeFocus(0),
    kEventTypeOpenURL(1),
    kEventTypeRequestLineBounds(2),
    kEventTypeLineHighlight(3),
    kEventTypeSendEvent(4),
    kEventTypeFinish(5),
    kEventTypeExtension(6),
    kEventTypeDataSourceFetchRequest(7),
    kEventTypeReinflate(8),
    kEventTypeMediaRequest(9),
    kEventTypeOpenKeyboard(10),
    kEventTypeContentRefresh(11);

    private static SparseArray<EventType> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (EventType eventType : values()) {
            values.put(eventType.getIndex(), eventType);
        }
    }

    EventType(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static EventType valueOf(int i) {
        return values.get(i);
    }
}
