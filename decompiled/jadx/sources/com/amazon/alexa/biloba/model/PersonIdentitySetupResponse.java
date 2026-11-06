package com.amazon.alexa.biloba.model;

import com.google.gson.annotations.SerializedName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PersonIdentitySetupResponse {

    @SerializedName("client")
    PersonIdentityClient client;

    @SerializedName("locale")
    String locale;

    @SerializedName("workflow")
    PersonIdentityWorkflow workflow;

    public PersonIdentityClient getClient() {
        return this.client;
    }

    public String getLocale() {
        return this.locale;
    }

    public PersonIdentityWorkflow getWorkflow() {
        return this.workflow;
    }

    public String toString() {
        return "PersonIdentitySetupResponse{locale='" + this.locale + "', client=" + this.client + ", workflow=" + this.workflow + AbstractJsonLexerKt.END_OBJ;
    }
}
