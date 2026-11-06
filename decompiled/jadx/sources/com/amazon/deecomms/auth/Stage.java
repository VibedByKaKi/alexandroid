package com.amazon.deecomms.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum Stage {
    PROD("prod"),
    PROD_QA("prod", "arn:aws:remote-config:us-west-2:412793207129:appConfig:azq8123c"),
    PREPROD("prod"),
    GAMMA("gamma"),
    BETA("beta"),
    ALPHA("alpha");


    @NonNull
    private final String arcusConfigId;

    @NonNull
    private final String arcusEquivalentStage;

    Stage(@NonNull String str, @NonNull String str2) {
        this.arcusEquivalentStage = str;
        this.arcusConfigId = str2;
    }

    @NonNull
    public static Stage toStage(@Nullable String str) {
        if (str == null) {
            return PROD;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
        }
        return PROD;
    }

    @NonNull
    public String getArcusConfigId() {
        return this.arcusConfigId;
    }

    @NonNull
    public String getArcusEquivalentStage() {
        return this.arcusEquivalentStage;
    }

    Stage(@NonNull String str) {
        this(str, "arn:aws:remote-config:us-west-2:412793207129:appConfig:ayuw5hfh");
    }
}
