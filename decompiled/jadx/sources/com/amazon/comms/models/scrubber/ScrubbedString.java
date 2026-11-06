package com.amazon.comms.models.scrubber;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.comms.models.scrubber.ScrubbedStringSerializationDeserializationSupport;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.gson.annotations.JsonAdapter;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonDeserialize(using = ScrubbedStringSerializationDeserializationSupport.JacksonDeserializer.class)
@JsonSerialize(using = ScrubbedStringSerializationDeserializationSupport.JacksonSerializer.class)
@JsonAdapter(ScrubbedStringSerializationDeserializationSupport.GsonSerializerDeserializer.class)
/* loaded from: classes20.dex */
public class ScrubbedString {
    static final String SCRUB_END_TAG = "</scrub>";
    static final String SCRUB_START_TAG = "<scrub>";
    private String value;

    public ScrubbedString(String str) {
        this.value = str;
    }

    public static ScrubbedString unscrub(String str) {
        return new ScrubbedString(str.replaceAll(SCRUB_START_TAG, "").replaceAll(SCRUB_END_TAG, ""));
    }

    public boolean canEqual(Object obj) {
        return obj instanceof ScrubbedString;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScrubbedString)) {
            return false;
        }
        ScrubbedString scrubbedString = (ScrubbedString) obj;
        if (!scrubbedString.canEqual(this)) {
            return false;
        }
        String value = getValue();
        String value2 = scrubbedString.getValue();
        return value != null ? value.equals(value2) : value2 == null;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        String value = getValue();
        return 59 + (value == null ? 43 : value.hashCode());
    }

    public String scrubbed() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder(SCRUB_START_TAG), this.value, SCRUB_END_TAG);
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m("ScrubbedString(value=", getValue(), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public ScrubbedString() {
    }
}
