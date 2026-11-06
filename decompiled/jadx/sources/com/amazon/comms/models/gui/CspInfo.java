package com.amazon.comms.models.gui;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CspInfo {
    private String cspId;
    private Image cspImage;
    private String displayName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CspInfoBuilder {
        private String cspId;
        private Image cspImage;
        private String displayName;

        public CspInfo build() {
            return new CspInfo(this.displayName, this.cspId, this.cspImage);
        }

        public CspInfoBuilder cspId(String str) {
            this.cspId = str;
            return this;
        }

        public CspInfoBuilder cspImage(Image image) {
            this.cspImage = image;
            return this;
        }

        public CspInfoBuilder displayName(String str) {
            this.displayName = str;
            return this;
        }

        public String toString() {
            String str = this.displayName;
            String str2 = this.cspId;
            return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("CspInfo.CspInfoBuilder(displayName=", str, ", cspId=", str2, ", cspImage="), String.valueOf(this.cspImage), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public CspInfo(String str, String str2, Image image) {
        this.displayName = str;
        this.cspId = str2;
        this.cspImage = image;
    }

    public static CspInfoBuilder builder() {
        return new CspInfoBuilder();
    }

    public String getCspId() {
        return this.cspId;
    }

    public Image getCspImage() {
        return this.cspImage;
    }

    public String getDisplayName() {
        return this.displayName;
    }
}
