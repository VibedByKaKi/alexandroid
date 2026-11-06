package com.amazon.ds2.oobe.metrics;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum Event {
    AUTHENTICATION_START,
    AUTHENTICATION_STOP,
    CONNECTION_EVENT,
    CONNECTION_START,
    CONNECTION_STOP,
    EXPERIMENT_RESOLVED,
    FFS_START,
    FFS_STOP,
    OOBE_START,
    OOBE_STOP,
    OTA_EVENT,
    OTA_START,
    OTA_STOP,
    REGISTRATION_START,
    REGISTRATION_STOP,
    SCAN_EVENT,
    SCAN_START,
    SCAN_STOP,
    TIME_SYNCED,
    UPSELL_START,
    UPSELL_STOP,
    VIEW_START,
    VIEW_STOP;

    public static final String GROUP_ID = "ay93phze";
    public static final String SCHEMA_ID = "c5pu/2/02330463";
    private final String groupId = GROUP_ID;
    private final String schemaId = SCHEMA_ID;

    Event() {
    }

    @Generated
    public String getGroupId() {
        return this.groupId;
    }

    @Generated
    public String getSchemaId() {
        return this.schemaId;
    }

    @Override // java.lang.Enum
    @Generated
    public String toString() {
        return "Event." + name() + "(groupId=" + getGroupId() + ", schemaId=" + getSchemaId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
