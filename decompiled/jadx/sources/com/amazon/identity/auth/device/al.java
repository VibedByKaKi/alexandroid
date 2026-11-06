package com.amazon.identity.auth.device;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class al {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f461a = Pattern.compile("((.*[^0-9])|(^))([0-9]{4,6})[^0-9].*[a-zA-Z0-9+\\\\/]{11}", 32);
}
