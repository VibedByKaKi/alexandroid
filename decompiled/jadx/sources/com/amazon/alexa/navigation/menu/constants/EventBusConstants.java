package com.amazon.alexa.navigation.menu.constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class EventBusConstants {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public @interface EventType {
        public static final String ELEMENTS_TOOLBAR_VISIBILITY_CHANGED = "toolbar:visibilityChanged";
        public static final String ELEMENTS_TOOLBAR_VISIBILITY_INFO_REQUEST = "toolbar:visibilityInfoRequest";
        public static final String OPEN_MORE_BOTTOM_SHEET_EVENT_BUS = "open:more:bottom:sheet";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public @interface Payload {
        public static final String CHANNEL_NAME = "channelName";
        public static final String COMPONENT_TYPE = "componentType";
        public static final String MORE_MENU = "moreMenuAndroid";
        public static final String QUICK_ADD_BOTTOM_SHEET = "QUICK_ADD_BOTTOM_SHEET";
    }

    private EventBusConstants() {
    }
}
