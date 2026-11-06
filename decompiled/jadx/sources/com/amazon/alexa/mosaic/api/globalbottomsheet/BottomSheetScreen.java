package com.amazon.alexa.mosaic.api.globalbottomsheet;

import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class BottomSheetScreen {
    private final String screen;
    private final Map<String, Object> screenProps;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private final String screen;
        private Map<String, Object> screenProps;

        public Builder(String str) {
            this.screen = str;
        }

        public BottomSheetScreen build() {
            return new BottomSheetScreen(this);
        }

        public Builder withScreenProps(Map<String, Object> map) {
            this.screenProps = map;
            return this;
        }
    }

    public BottomSheetScreen(Builder builder) {
        this.screen = builder.screen;
        this.screenProps = builder.screenProps;
    }

    public String getScreen() {
        return this.screen;
    }

    public Map<String, Object> getScreenProps() {
        return this.screenProps;
    }

    public String toString() {
        return "BottomSheetScreen={screen='" + this.screen + "', screenProps=" + String.valueOf(this.screenProps) + AbstractJsonLexerKt.END_OBJ;
    }
}
