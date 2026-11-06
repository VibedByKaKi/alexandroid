package com.dee.app.contacts.interfaces.models.data.enums;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum ContactSourceType {
    WhitelistedContact("whitelistedContact"),
    ManuallyAddedContact("manuallyAddedContact"),
    SyncedContact("syncedContact"),
    VoiceAddedContact("voiceAddedContact"),
    AutoAddedContact("autoAddedContact"),
    BulkImportedContact("bulkImportedContact"),
    SkypeContact("skypeContact"),
    MergedContact("mergedContact"),
    ProfileContact("profileContact"),
    AmazonPhotos("amazonPhotos"),
    AmazonMusic("amazonMusic"),
    UnsetContact("");


    @NonNull
    private final String name;

    ContactSourceType(@NonNull String str) {
        this.name = str;
    }

    @NonNull
    public String getName() {
        return this.name;
    }
}
