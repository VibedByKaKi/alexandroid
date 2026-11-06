package com.amazon.comms.models.gui;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SystemTrayInfo implements Serializable {
    private String callDescription;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SystemTrayInfoBuilder {
        private String callDescription;

        public SystemTrayInfo build() {
            return new SystemTrayInfo(this.callDescription);
        }

        public SystemTrayInfoBuilder callDescription(String str) {
            this.callDescription = str;
            return this;
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m("SystemTrayInfo.SystemTrayInfoBuilder(callDescription=", this.callDescription, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public SystemTrayInfo(String str) {
        this.callDescription = str;
    }

    public static SystemTrayInfoBuilder builder() {
        return new SystemTrayInfoBuilder();
    }

    public String getCallDescription() {
        return this.callDescription;
    }
}
