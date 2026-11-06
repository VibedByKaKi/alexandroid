package com.here.sdk.search;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Contact {

    @NonNull
    public List<EmailAddress> emails;

    @NonNull
    public List<LandlinePhone> landlinePhones;

    @NonNull
    public List<MobilePhone> mobilePhones;

    @NonNull
    public List<WebsiteAddress> websites;

    public Contact() {
        this.landlinePhones = new ArrayList();
        this.mobilePhones = new ArrayList();
        this.emails = new ArrayList();
        this.websites = new ArrayList();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Contact)) {
            return false;
        }
        Contact contact = (Contact) obj;
        return Objects.equals(this.landlinePhones, contact.landlinePhones) && Objects.equals(this.mobilePhones, contact.mobilePhones) && Objects.equals(this.emails, contact.emails) && Objects.equals(this.websites, contact.websites);
    }

    public int hashCode() {
        List<LandlinePhone> list = this.landlinePhones;
        int hashCode = (JfifUtil.MARKER_EOI + (list != null ? list.hashCode() : 0)) * 31;
        List<MobilePhone> list2 = this.mobilePhones;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<EmailAddress> list3 = this.emails;
        int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<WebsiteAddress> list4 = this.websites;
        return hashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    public Contact(@NonNull List<LandlinePhone> list, @NonNull List<MobilePhone> list2, @NonNull List<EmailAddress> list3, @NonNull List<WebsiteAddress> list4) {
        this.landlinePhones = list;
        this.mobilePhones = list2;
        this.emails = list3;
        this.websites = list4;
    }
}
