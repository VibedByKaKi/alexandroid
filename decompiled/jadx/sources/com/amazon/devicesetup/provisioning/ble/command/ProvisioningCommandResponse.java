package com.amazon.devicesetup.provisioning.ble.command;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Map;
import java.util.UUID;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ProvisioningCommandResponse {
    private final byte[] data;
    private final UUID identifier;
    private final int status;

    public ProvisioningCommandResponse(UUID uuid, int i, byte[] bArr) {
        if (uuid == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("identifier cannot be null.");
            throw null;
        }
        this.identifier = uuid;
        this.status = i;
        this.data = bArr == null ? null : (byte[]) bArr.clone();
    }

    public byte[] getData() {
        byte[] bArr = this.data;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public UUID getIdentifier() {
        return this.identifier;
    }

    public int getStatus() {
        return this.status;
    }

    public String getStatusMessage() {
        Map<UUID, Map<Integer, String>> map = ProvisioningCommands.PROVISIONING_COMMANDS_STATUS_MAPS;
        if (map.containsKey(this.identifier) && map.get(this.identifier).containsKey(Integer.valueOf(this.status))) {
            return map.get(this.identifier).get(Integer.valueOf(this.status));
        }
        return null;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m("ProvisioningCommandResponse [id=", String.valueOf(this.identifier), ", status=", getStatusMessage(), MarkdownConstants.RIGHT_BRACKET);
    }

    public ProvisioningCommandResponse(UUID uuid, int i) {
        this(uuid, i, null);
    }
}
