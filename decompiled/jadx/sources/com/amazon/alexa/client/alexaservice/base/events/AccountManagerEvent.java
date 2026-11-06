package com.amazon.alexa.client.alexaservice.base.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class AccountManagerEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class GetTokenTimeOutEvent extends AccountManagerEvent {
        public static GetTokenTimeOutEvent create() {
            return new AutoValue_AccountManagerEvent_GetTokenTimeOutEvent();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class IsLoggedInErrorEvent extends AccountManagerEvent {
        public static IsLoggedInErrorEvent create() {
            return new AutoValue_AccountManagerEvent_IsLoggedInErrorEvent();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class IsLoggedInTimeOutEvent extends AccountManagerEvent {
        public static IsLoggedInTimeOutEvent create() {
            return new AutoValue_AccountManagerEvent_IsLoggedInTimeOutEvent();
        }
    }
}
