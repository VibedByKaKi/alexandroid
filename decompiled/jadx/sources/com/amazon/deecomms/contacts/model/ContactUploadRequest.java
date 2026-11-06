package com.amazon.deecomms.contacts.model;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ContactUploadRequest {
    private List<ContactUploadInfo> contacts;
    private String sourceDeviceId;

    public List<ContactUploadInfo> getContacts() {
        return this.contacts;
    }

    public String getSourceDeviceId() {
        return this.sourceDeviceId;
    }

    public void setContacts(List<ContactUploadInfo> list) {
        this.contacts = list;
    }

    public void setSourceDeviceId(String str) {
        this.sourceDeviceId = str;
    }
}
