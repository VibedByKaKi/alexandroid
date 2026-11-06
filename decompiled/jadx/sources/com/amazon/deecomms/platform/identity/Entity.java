package com.amazon.deecomms.platform.identity;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum Entity {
    BOT("bot"),
    GROUP("group"),
    HOMEGROUP("hg"),
    PERSON(ReactBridgeSerializer.PERSON_TYPE_DISCRIMINATOR),
    ROOM("room");

    private String mCommsIDValue;

    Entity(String str) {
        this.mCommsIDValue = str;
    }

    public static Entity getValueOf(String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("A value must be specified");
            return null;
        }
        for (Entity entity : values()) {
            if (str.equals(entity.toString())) {
                return entity;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("No Entity found with value: [", str, MarkdownConstants.RIGHT_BRACKET));
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.mCommsIDValue;
    }
}
