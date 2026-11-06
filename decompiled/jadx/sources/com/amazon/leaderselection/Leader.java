package com.amazon.leaderselection;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class Leader implements Parcelable {
    private static final String UNKNOWN_CLASS_NAME = "unknown";
    private static final String UNKNOWN_PACKAGE_NAME = "unknown";
    private final ComponentName componentName;
    public static final Leader UNKNOWN = create("unknown", "unknown");
    public static final Parcelable.Creator<Leader> CREATOR = new Parcelable.Creator<Leader>() { // from class: com.amazon.leaderselection.Leader.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Leader createFromParcel(Parcel parcel) {
            return new Leader(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Leader[] newArray(int i) {
            return new Leader[i];
        }
    };

    public Leader(Parcel parcel) {
        this.componentName = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
    }

    public static Leader create(String str, String str2) {
        return create(ComponentNameFactory.create(str, str2));
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
        return Objects.equals(this.componentName, ((Leader) obj).componentName);
    }

    public ComponentName getComponentName() {
        return this.componentName;
    }

    public int hashCode() {
        return Objects.hash(this.componentName);
    }

    public String toString() {
        return this.componentName.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.componentName, i);
    }

    public static Leader create(ComponentName componentName) {
        return new Leader(componentName);
    }

    private Leader(ComponentName componentName) {
        this.componentName = componentName;
    }
}
