package com.amazon.deecomms.calling.incallexperiences.effects.datachannel.model;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class EffectIcon {
    private boolean active;
    private String id;
    private String name;
    private String thumbnail;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private boolean active;
        private String id;
        private String name;
        private String thumbnail;

        public Builder active(boolean z) {
            this.active = z;
            return this;
        }

        public EffectIcon build() {
            return new EffectIcon(this.id, this.name, this.thumbnail, this.active);
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder thumbnail(String str) {
            this.thumbnail = str;
            return this;
        }
    }

    public EffectIcon(String str, String str2, String str3, boolean z) {
        this.id = str;
        this.name = str2;
        this.thumbnail = str3;
        this.active = z;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            EffectIcon effectIcon = (EffectIcon) obj;
            if (this.active == effectIcon.active && this.id.equals(effectIcon.id) && this.name.equals(effectIcon.name) && this.thumbnail.equals(effectIcon.thumbnail)) {
                return true;
            }
        }
        return false;
    }

    public String getActiveReactionThumbnail() {
        int lastIndexOf = this.thumbnail.lastIndexOf(46);
        int lastIndexOf2 = this.thumbnail.lastIndexOf(47);
        StringBuilder sb = new StringBuilder();
        TableInfo$$ExternalSyntheticOutline0.m(this.thumbnail, 0, lastIndexOf2, sb, ".active");
        TableInfo$$ExternalSyntheticOutline0.m(this.thumbnail, lastIndexOf2, lastIndexOf, sb, "_active");
        return a$$ExternalSyntheticOutline0.m(this.thumbnail, lastIndexOf, sb);
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getThumbnail() {
        return this.thumbnail;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.name, this.thumbnail, Boolean.valueOf(this.active));
    }

    public boolean isActive() {
        return this.active;
    }

    public void setActive(boolean z) {
        this.active = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setThumbnail(String str) {
        this.thumbnail = str;
    }
}
