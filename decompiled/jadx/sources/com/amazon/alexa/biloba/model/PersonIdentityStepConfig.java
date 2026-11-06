package com.amazon.alexa.biloba.model;

import com.google.gson.annotations.SerializedName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PersonIdentityStepConfig {

    @SerializedName("isSetup")
    Boolean isSetup;

    @SerializedName("listSubtitle")
    String listSubtitle;

    @SerializedName("listTitle")
    String listTitle;

    @SerializedName("skip")
    Boolean skip;

    public String getListSubtitle() {
        return this.listSubtitle;
    }

    public String getListTitle() {
        return this.listTitle;
    }

    public Boolean getSetup() {
        return this.isSetup;
    }

    public Boolean getSkip() {
        return this.skip;
    }

    public String toString() {
        return "PersonIdentityStepConfig{listTitle='" + this.listTitle + "', listSubtitle='" + this.listSubtitle + "', isSetup=" + this.isSetup + ", skip=" + this.skip + AbstractJsonLexerKt.END_OBJ;
    }
}
