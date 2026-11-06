package com.dee.app.contacts.interfaces.models.data.enums;

import com.amazon.deecomms.contacts.util.ContactDownloader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum DedupeMode {
    REMOVE_A2A("RemoveA2AContactDuplicates"),
    REMOVE_CLOUD_ONLY(ContactDownloader.ACMS_QUERY_PARAM_DEDUPE_MODE_REMOVE_CLOUD_ONLY_CONTACT_DUPLICATES);

    private final String dedupeMode;

    DedupeMode(String str) {
        this.dedupeMode = str;
    }

    public String getDedupeMode() {
        return this.dedupeMode;
    }
}
