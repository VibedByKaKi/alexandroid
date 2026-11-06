package com.amazon.deecomms.oobe.fragments;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.deecomms.oobe.PCAProfile;
import com.amazon.deecomms.oobe.Person;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class PersonItem implements Comparable<PersonItem> {
    public final boolean isPlaceholder;
    public final PCAProfile pcaProfile;
    public final Person person;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ViewHolder {
        public ImageView arrow;
        public ImageView profileIcon;
        public TextView userIdentification;
    }

    public PersonItem() {
        this.person = null;
        this.pcaProfile = null;
        this.isPlaceholder = true;
    }

    private int rank(PersonItem personItem) {
        if (personItem.isPlaceholder) {
            return 1;
        }
        Person person = personItem.person;
        return (person == null || person.isChild) ? 2 : 0;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull PersonItem personItem) {
        return Integer.compare(rank(this), rank(personItem));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PersonItem personItem = (PersonItem) obj;
            if (this.isPlaceholder == personItem.isPlaceholder && Objects.equals(this.person, personItem.person)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isPlaceholder), this.person);
    }

    public PersonItem(Person person, PCAProfile pCAProfile) {
        this.person = person;
        this.pcaProfile = pCAProfile;
        this.isPlaceholder = false;
    }
}
