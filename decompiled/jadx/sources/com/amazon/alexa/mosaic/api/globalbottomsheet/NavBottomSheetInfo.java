package com.amazon.alexa.mosaic.api.globalbottomsheet;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class NavBottomSheetInfo {
    private final boolean autoReopen;
    private final Map<String, Object> bottomSheetProps;
    private final boolean persistent;
    private final ArrayList<BottomSheetScreen> screens;
    private final String whenFSTPresent;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private Map<String, Object> bottomSheetProps;
        private final ArrayList<BottomSheetScreen> screens;
        private boolean autoReopen = false;
        private boolean persistent = false;
        private String whenFSTPresent = "ignore";

        public Builder(ArrayList<BottomSheetScreen> arrayList) {
            this.screens = arrayList;
        }

        public NavBottomSheetInfo build() {
            return new NavBottomSheetInfo(this, 0);
        }

        public Builder withAutoReopen(boolean z) {
            this.autoReopen = z;
            return this;
        }

        public Builder withBottomSheetProps(Map<String, Object> map) {
            this.bottomSheetProps = map;
            return this;
        }

        public Builder withPersistent(boolean z) {
            this.persistent = z;
            return this;
        }

        public Builder withWhenFSTPresent(String str) {
            this.whenFSTPresent = str;
            return this;
        }
    }

    private NavBottomSheetInfo(Builder builder) {
        this.screens = builder.screens;
        this.bottomSheetProps = builder.bottomSheetProps;
        this.autoReopen = builder.autoReopen;
        this.persistent = builder.persistent;
        this.whenFSTPresent = builder.whenFSTPresent;
    }

    public Map<String, Object> getBottomSheetProps() {
        return this.bottomSheetProps;
    }

    public ArrayList<BottomSheetScreen> getScreens() {
        return this.screens;
    }

    public String getWhenFSTPresent() {
        return this.whenFSTPresent;
    }

    public boolean isAutoReopen() {
        return this.autoReopen;
    }

    public boolean isPersistent() {
        return this.persistent;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavBottomSheetInfo={screens=");
        sb.append(this.screens.toString());
        sb.append(", bottomSheetProps=");
        sb.append(String.valueOf(this.bottomSheetProps));
        sb.append(", autoReopen=");
        sb.append(String.valueOf(this.autoReopen));
        sb.append(", persistent=");
        sb.append(String.valueOf(this.persistent));
        sb.append(", whenFSTPresent=");
        return a$$ExternalSyntheticOutline0.m(sb, this.whenFSTPresent, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ NavBottomSheetInfo(Builder builder, int i) {
        this(builder);
    }
}
