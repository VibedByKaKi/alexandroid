package com.amazon.comms.models.gui;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.comms.models.scrubber.ScrubbedString;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PartyInfo implements Serializable {

    @JsonProperty
    private ScrubbedString credit;
    private boolean dropInPermission;

    @JsonProperty
    private ScrubbedString endpointDescription;

    @JsonProperty
    private ScrubbedString name;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PartyInfoBuilder {
        private ScrubbedString credit;
        private boolean dropInPermission;
        private ScrubbedString endpointDescription;
        private ScrubbedString name;

        public PartyInfo build() {
            return new PartyInfo(this.name, this.endpointDescription, this.credit, this.dropInPermission);
        }

        public PartyInfoBuilder credit(String str) {
            this.credit = new ScrubbedString(str);
            return this;
        }

        public PartyInfoBuilder dropInPermission(boolean z) {
            this.dropInPermission = z;
            return this;
        }

        public PartyInfoBuilder endpointDescription(String str) {
            this.endpointDescription = new ScrubbedString(str);
            return this;
        }

        public PartyInfoBuilder name(String str) {
            this.name = new ScrubbedString(str);
            return this;
        }

        public String toString() {
            String valueOf = String.valueOf(this.name);
            String valueOf2 = String.valueOf(this.endpointDescription);
            String valueOf3 = String.valueOf(this.credit);
            boolean z = this.dropInPermission;
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("PartyInfo.PartyInfoBuilder(name=", valueOf, ", endpointDescription=", valueOf2, ", credit=");
            m.append(valueOf3);
            m.append(", dropInPermission=");
            m.append(z);
            m.append(MarkdownConstants.RIGHT_PARENTHESIS);
            return m.toString();
        }
    }

    public PartyInfo(ScrubbedString scrubbedString, ScrubbedString scrubbedString2, ScrubbedString scrubbedString3, boolean z) {
        this.name = scrubbedString;
        this.endpointDescription = scrubbedString2;
        this.credit = scrubbedString3;
        this.dropInPermission = z;
    }

    public static PartyInfoBuilder builder() {
        return new PartyInfoBuilder();
    }

    @JsonIgnore
    public String getCredit() {
        ScrubbedString scrubbedString = this.credit;
        if (scrubbedString != null) {
            return scrubbedString.getValue();
        }
        return null;
    }

    public boolean getDropInPermission() {
        return this.dropInPermission;
    }

    @JsonIgnore
    public String getEndpointDescription() {
        ScrubbedString scrubbedString = this.endpointDescription;
        if (scrubbedString != null) {
            return scrubbedString.getValue();
        }
        return null;
    }

    @JsonIgnore
    public String getName() {
        ScrubbedString scrubbedString = this.name;
        if (scrubbedString != null) {
            return scrubbedString.getValue();
        }
        return null;
    }

    @JsonIgnore
    public void setCredit(String str) {
        this.credit = new ScrubbedString(str);
    }

    @JsonIgnore
    public void setEndpointDescription(String str) {
        this.endpointDescription = new ScrubbedString(str);
    }

    @JsonIgnore
    public void setName(String str) {
        this.name = new ScrubbedString(str);
    }

    public PartyInfo() {
    }
}
