package com.amazon.comms.models.gui;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MediaSettingsInfo implements Serializable {
    public static final String ENHANCED_PROCESSING_NOT_APPLICABLE = "NOT_APPLICABLE";
    public static final String ENHANCED_PROCESSING_OFF = "OFF";
    public static final String ENHANCED_PROCESSING_ON = "ON";
    private String enhancedProcessing;
    private boolean isEnhancedProcessingOptInRequired;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MediaSettingsInfoBuilder {
        private String enhancedProcessing;
        private boolean isEnhancedProcessingOptInRequired;

        public MediaSettingsInfo build() {
            return new MediaSettingsInfo(this.enhancedProcessing, this.isEnhancedProcessingOptInRequired);
        }

        public MediaSettingsInfoBuilder enhancedProcessing(String str) {
            this.enhancedProcessing = str;
            return this;
        }

        public MediaSettingsInfoBuilder isEnhancedProcessingOptInRequired(boolean z) {
            this.isEnhancedProcessingOptInRequired = z;
            return this;
        }

        public String toString() {
            return AppLaunchChecker$$ExternalSyntheticOutline0.m("MediaSettingsInfo.MediaSettingsInfoBuilder(enhancedProcessing=", this.enhancedProcessing, ", isEnhancedProcessingOptInRequired=", this.isEnhancedProcessingOptInRequired, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public MediaSettingsInfo(String str, boolean z) {
        this.enhancedProcessing = str;
        this.isEnhancedProcessingOptInRequired = z;
    }

    public static MediaSettingsInfoBuilder builder() {
        return new MediaSettingsInfoBuilder();
    }

    public String getEnhancedProcessing() {
        return this.enhancedProcessing;
    }

    public boolean getIsEnhancedProcessingOptInRequired() {
        return this.isEnhancedProcessingOptInRequired;
    }

    @JsonProperty("isEnhancedProcessingOptInRequired")
    public boolean isEnhancedProcessingOptInRequired() {
        return this.isEnhancedProcessingOptInRequired;
    }
}
