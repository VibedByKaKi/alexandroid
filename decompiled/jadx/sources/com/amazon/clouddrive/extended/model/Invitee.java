package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.model.ObjectComparator;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class Invitee implements Comparable<Invitee> {

    @NonNull
    private final InviteAddress address;
    private final String inviteDeliveryType;
    private final String name;

    public Invitee(@NonNull InviteAddress inviteAddress, String str, String str2) {
        if (inviteAddress == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("address is null");
            throw null;
        }
        this.address = inviteAddress;
        this.name = str;
        this.inviteDeliveryType = str2;
    }

    @Override // java.lang.Comparable
    public int compareTo(Invitee invitee) {
        if (this.address.compareTo(invitee.address) < 0) {
            return -1;
        }
        if (this.address.compareTo(invitee.address) > 0) {
            return 1;
        }
        String str = this.name;
        if (str == null && invitee.name == null) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        String str2 = invitee.name;
        if (str2 == null) {
            return 1;
        }
        if (str.compareTo(str2) < 0) {
            return -1;
        }
        if (this.name.compareTo(invitee.name) > 0) {
            return 1;
        }
        int compare = ObjectComparator.compare(getInviteDeliveryType(), invitee.getInviteDeliveryType());
        if (compare != 0) {
            return compare;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Invitee)) {
            return false;
        }
        Invitee invitee = (Invitee) obj;
        InviteAddress address = getAddress();
        InviteAddress address2 = invitee.getAddress();
        if (address != null ? !address.equals(address2) : address2 != null) {
            return false;
        }
        String name = getName();
        String name2 = invitee.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String inviteDeliveryType = getInviteDeliveryType();
        String inviteDeliveryType2 = invitee.getInviteDeliveryType();
        return inviteDeliveryType != null ? inviteDeliveryType.equals(inviteDeliveryType2) : inviteDeliveryType2 == null;
    }

    @NonNull
    public InviteAddress getAddress() {
        return this.address;
    }

    public String getInviteDeliveryType() {
        return this.inviteDeliveryType;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        InviteAddress address = getAddress();
        int hashCode = address == null ? 43 : address.hashCode();
        String name = getName();
        int i = (hashCode + 59) * 59;
        int hashCode2 = name == null ? 43 : name.hashCode();
        String inviteDeliveryType = getInviteDeliveryType();
        return ((i + hashCode2) * 59) + (inviteDeliveryType != null ? inviteDeliveryType.hashCode() : 43);
    }

    public String toString() {
        return "Invitee(address=" + getAddress() + ", name=" + getName() + ", inviteDeliveryType=" + getInviteDeliveryType() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public Invitee(@NonNull InviteAddress inviteAddress, String str) {
        this(inviteAddress, str, null);
        if (inviteAddress != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("address is null");
        throw null;
    }

    public Invitee(@NonNull InviteAddress inviteAddress) {
        this(inviteAddress, null);
        if (inviteAddress != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("address is null");
        throw null;
    }
}
