package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Names implements Comparable<Names> {
    private String firstName;
    private String fullName;

    public boolean canEqual(Object obj) {
        return obj instanceof Names;
    }

    @Override // java.lang.Comparable
    public int compareTo(Names names) {
        if (names == null) {
            return -1;
        }
        if (names == this) {
            return 0;
        }
        int compare = ObjectComparator.compare(getFullName(), names.getFullName());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getFirstName(), names.getFirstName());
        if (compare2 != 0) {
            return compare2;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Names)) {
            return false;
        }
        Names names = (Names) obj;
        if (!names.canEqual(this)) {
            return false;
        }
        String fullName = getFullName();
        String fullName2 = names.getFullName();
        if (fullName != null ? !fullName.equals(fullName2) : fullName2 != null) {
            return false;
        }
        String firstName = getFirstName();
        String firstName2 = names.getFirstName();
        return firstName != null ? firstName.equals(firstName2) : firstName2 == null;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int hashCode() {
        String fullName = getFullName();
        int hashCode = fullName == null ? 43 : fullName.hashCode();
        String firstName = getFirstName();
        return ((hashCode + 59) * 59) + (firstName != null ? firstName.hashCode() : 43);
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public void setFullName(String str) {
        this.fullName = str;
    }

    public String toString() {
        return "Names(fullName=" + getFullName() + ", firstName=" + getFirstName() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
