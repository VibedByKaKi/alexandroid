package com.amazon.alexa.accessory.speech.events.model;

import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.speech.events.model.PersonInfo;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_PersonInfo extends PersonInfo {

    @Nullable
    private final String activePersonId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends PersonInfo.Builder {
        private String activePersonId;

        @Override // com.amazon.alexa.accessory.speech.events.model.PersonInfo.Builder
        public PersonInfo build() {
            return new AutoValue_PersonInfo(this.activePersonId, 0);
        }

        @Override // com.amazon.alexa.accessory.speech.events.model.PersonInfo.Builder
        public PersonInfo.Builder setActivePersonId(String str) {
            this.activePersonId = str;
            return this;
        }
    }

    private AutoValue_PersonInfo(@Nullable String str) {
        this.activePersonId = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersonInfo)) {
            return false;
        }
        PersonInfo personInfo = (PersonInfo) obj;
        String str = this.activePersonId;
        return str == null ? personInfo.getActivePersonId() == null : str.equals(personInfo.getActivePersonId());
    }

    @Override // com.amazon.alexa.accessory.speech.events.model.PersonInfo
    @Nullable
    public String getActivePersonId() {
        return this.activePersonId;
    }

    public int hashCode() {
        String str = this.activePersonId;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("PersonInfo{activePersonId="), this.activePersonId, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_PersonInfo(String str, int i) {
        this(str);
    }
}
