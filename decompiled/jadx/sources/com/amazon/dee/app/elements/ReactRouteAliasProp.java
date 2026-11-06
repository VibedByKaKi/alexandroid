package com.amazon.dee.app.elements;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
class ReactRouteAliasProp {
    public int type;
    public String value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
        public static final int CONSTANT = 0;
        public static final int PARAMETER = 1;
    }

    public ReactRouteAliasProp(String str) {
        if (str.startsWith(":")) {
            this.type = 1;
            this.value = str.substring(1);
        } else {
            this.type = 0;
            this.value = str;
        }
    }
}
