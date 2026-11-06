package com.amazon.alexa.sharing.repo.models.acms.announcement.enums;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum SoundEffect {
    DINNER_BELL("dinner_bell"),
    FART("fart"),
    GOOD_MORNING("good_morning"),
    HAPPY_BIRTHDAY("happy_birthday"),
    HOORAY("hooray"),
    I_AM_HOME("i_am_home"),
    I_LOVE_YOU("i_love_you"),
    LULLABY("lullaby"),
    ON_MY_WAY("on_my_way"),
    OOPS("oops");


    @NonNull
    private final String soundEffect;

    SoundEffect(@NonNull String str) {
        this.soundEffect = str;
    }
}
