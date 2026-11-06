package com.amazon.comms.models.gui;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class IdentityMetadata {
    private String identityId;
    private MediaDisplays mediaDisplays;
    private String name;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class IdentityMetadataBuilder {
        private String identityId;
        private MediaDisplays mediaDisplays;
        private String name;

        public IdentityMetadata build() {
            return new IdentityMetadata(this.identityId, this.name, this.mediaDisplays, 0);
        }

        public IdentityMetadataBuilder identityId(String str) {
            this.identityId = str;
            return this;
        }

        public IdentityMetadataBuilder mediaDisplays(MediaDisplays mediaDisplays) {
            this.mediaDisplays = mediaDisplays;
            return this;
        }

        public IdentityMetadataBuilder name(String str) {
            this.name = str;
            return this;
        }

        public String toString() {
            String str = this.identityId;
            String str2 = this.name;
            return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("IdentityMetadata.IdentityMetadataBuilder(identityId=", str, ", name=", str2, ", mediaDisplays="), String.valueOf(this.mediaDisplays), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    private IdentityMetadata(String str, String str2, MediaDisplays mediaDisplays) {
        this.identityId = str;
        this.name = str2;
        this.mediaDisplays = mediaDisplays;
    }

    public static IdentityMetadataBuilder builder() {
        return new IdentityMetadataBuilder();
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public MediaDisplays getMediaDisplays() {
        return this.mediaDisplays;
    }

    public String getName() {
        return this.name;
    }

    public void setIdentityId(String str) {
        this.identityId = str;
    }

    public void setMediaDisplays(MediaDisplays mediaDisplays) {
        this.mediaDisplays = mediaDisplays;
    }

    public void setName(String str) {
        this.name = str;
    }

    public IdentityMetadata() {
    }

    public /* synthetic */ IdentityMetadata(String str, String str2, MediaDisplays mediaDisplays, int i) {
        this(str, str2, mediaDisplays);
    }
}
