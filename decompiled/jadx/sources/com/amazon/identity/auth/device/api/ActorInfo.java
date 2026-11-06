package com.amazon.identity.auth.device.api;

import androidx.annotation.NonNull;
import com.amazon.fireos.sdk.annotations.FireOsSdk;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ActorInfo {

    @FireOsSdk
    public static final String ACTOR_TYPE_ADULT = "PERSON.ADULT";

    @FireOsSdk
    public static final String ACTOR_TYPE_CHILD = "PERSON.CHILD";

    @FireOsSdk
    public static final String ACTOR_TYPE_TEEN = "PERSON.TEEN";

    /* renamed from: a, reason: collision with root package name */
    private final String f467a;
    private final String b;
    private final String c;
    private final String d;

    @FireOsSdk
    public ActorInfo(@NonNull String str, @NonNull String str2, @NonNull String str3, String str4) {
        this.f467a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @FireOsSdk
    public String getAccountDirectedId() {
        return this.b;
    }

    @FireOsSdk
    public String getActorDirectedId() {
        return this.c;
    }

    @FireOsSdk
    public String getProgram() {
        return this.f467a;
    }

    @FireOsSdk
    public String getSuggestedActorType() {
        return this.d;
    }
}
