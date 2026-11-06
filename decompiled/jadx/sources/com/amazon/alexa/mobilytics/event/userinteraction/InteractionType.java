package com.amazon.alexa.mobilytics.event.userinteraction;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes18.dex */
public @interface InteractionType {
    public static final String APP_START = "appStart";
    public static final String CLICK = "click";
    public static final String COMMS_CALL = "commsCall";
    public static final String COMMS_MESSAGE = "commsMessage";
    public static final String DEEP_LINK_CLICK = "deepLinkClick";
    public static final String LONG_PRESS = "longPress";
    public static final String PAGE_VIEW = "pageView";
    public static final String SLIDER = "slider";
    public static final String UTTERANCE = "utterance";
    public static final String VIEW = "view";
}
