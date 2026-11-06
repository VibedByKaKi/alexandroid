package com.amazon.alexa.biloba.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class RelationshipGroupModel implements Parcelable {
    public static final Parcelable.Creator<RelationshipGroupModel> CREATOR = new Parcelable.Creator<RelationshipGroupModel>() { // from class: com.amazon.alexa.biloba.model.RelationshipGroupModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RelationshipGroupModel createFromParcel(Parcel parcel) {
            return new RelationshipGroupModel(parcel, 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RelationshipGroupModel[] newArray(int i) {
            return new RelationshipGroupModel[i];
        }
    };
    private String groupId;
    private String groupName;
    private CareContact groupOwner;
    private String groupType;
    private List<CareContact> members;

    private RelationshipGroupModel(Parcel parcel) {
        this.groupId = parcel.readString();
        this.groupName = parcel.readString();
        this.groupType = parcel.readString();
        this.groupOwner = (CareContact) parcel.readParcelable(CareContact.class.getClassLoader());
        this.members = parcel.createTypedArrayList(CareContact.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RelationshipGroupModel relationshipGroupModel = (RelationshipGroupModel) obj;
        String str = this.groupId;
        String str2 = relationshipGroupModel.groupId;
        if (str == null ? str2 != null : str.equals(str2)) {
            return false;
        }
        String str3 = this.groupName;
        String str4 = relationshipGroupModel.groupName;
        if (str3 == null ? str4 != null : str3.equals(str4)) {
            return false;
        }
        String str5 = this.groupType;
        String str6 = relationshipGroupModel.groupType;
        if (str5 == null ? str6 != null : str5.equals(str6)) {
            return false;
        }
        CareContact careContact = this.groupOwner;
        CareContact careContact2 = relationshipGroupModel.groupOwner;
        if (careContact == null ? careContact2 != null : careContact.equals(careContact2)) {
            return false;
        }
        List<CareContact> list = this.members;
        List<CareContact> list2 = relationshipGroupModel.members;
        if (list != null) {
            if (list2 == null || list.size() != relationshipGroupModel.members.size()) {
                return false;
            }
            for (int i = 0; i < this.members.size(); i++) {
                if (this.members.get(i) != null) {
                    if (this.members.get(i).equals(relationshipGroupModel.members.get(i))) {
                        return false;
                    }
                } else {
                    if (relationshipGroupModel.members.get(i) != null) {
                        return false;
                    }
                }
            }
        } else if (list2 != null) {
            return false;
        }
        return true;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public CareContact getGroupOwner() {
        return this.groupOwner;
    }

    public String getGroupType() {
        return this.groupType;
    }

    public List<CareContact> getMembers() {
        return this.members;
    }

    public int hashCode() {
        String str = this.groupId;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.groupName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.groupType;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        CareContact careContact = this.groupOwner;
        int hashCode4 = (hashCode3 + (careContact != null ? careContact.hashCode() : 0)) * 31;
        List<CareContact> list = this.members;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setGroupOwner(CareContact careContact) {
        this.groupOwner = careContact;
    }

    public void setGroupType(String str) {
        this.groupType = str;
    }

    public void setMembers(List<CareContact> list) {
        this.members = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.groupId);
        parcel.writeString(this.groupName);
        parcel.writeString(this.groupType);
        parcel.writeParcelable(this.groupOwner, i);
        parcel.writeTypedList(this.members);
    }

    public RelationshipGroupModel() {
    }

    public /* synthetic */ RelationshipGroupModel(Parcel parcel, int i) {
        this(parcel);
    }
}
