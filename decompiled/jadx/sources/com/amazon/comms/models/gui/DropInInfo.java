package com.amazon.comms.models.gui;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DropInInfo implements Serializable {
    private String dropInTransition;
    private Double frostedTransitionTime;
    private Double totalFrostTime;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DropInInfoBuilder {
        private String dropInTransition;
        private Double frostedTransitionTime;
        private Double totalFrostTime;

        public DropInInfo build() {
            return new DropInInfo(this.dropInTransition, this.frostedTransitionTime, this.totalFrostTime);
        }

        public DropInInfoBuilder dropInTransition(String str) {
            this.dropInTransition = str;
            return this;
        }

        public DropInInfoBuilder frostedTransitionTime(Double d) {
            this.frostedTransitionTime = d;
            return this;
        }

        public String toString() {
            return "DropInInfo.DropInInfoBuilder(dropInTransition=" + this.dropInTransition + ", frostedTransitionTime=" + this.frostedTransitionTime + ", totalFrostTime=" + this.totalFrostTime + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        public DropInInfoBuilder totalFrostTime(Double d) {
            this.totalFrostTime = d;
            return this;
        }
    }

    public DropInInfo(String str, Double d, Double d2) {
        this.dropInTransition = str;
        this.frostedTransitionTime = d;
        this.totalFrostTime = d2;
    }

    public static DropInInfoBuilder builder() {
        return new DropInInfoBuilder();
    }

    public String getDropInTransition() {
        return this.dropInTransition;
    }

    public Double getFrostedTransitionTime() {
        return this.frostedTransitionTime;
    }

    public Double getTotalFrostTime() {
        return this.totalFrostTime;
    }
}
