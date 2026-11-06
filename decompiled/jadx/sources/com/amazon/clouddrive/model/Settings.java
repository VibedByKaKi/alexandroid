package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Settings implements Comparable<Settings> {
    private Boolean favorite;
    private Boolean hidden;

    @Override // java.lang.Comparable
    public int compareTo(Settings settings) {
        if (settings == null) {
            return -1;
        }
        if (settings == this) {
            return 0;
        }
        Boolean isFavorite = isFavorite();
        Boolean isFavorite2 = settings.isFavorite();
        if (isFavorite != isFavorite2) {
            if (isFavorite == null) {
                return -1;
            }
            if (isFavorite2 == null) {
                return 1;
            }
            int compareTo = isFavorite.compareTo(isFavorite2);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        Boolean isHidden = isHidden();
        Boolean isHidden2 = settings.isHidden();
        if (isHidden != isHidden2) {
            if (isHidden == null) {
                return -1;
            }
            if (isHidden2 == null) {
                return 1;
            }
            int compareTo2 = isHidden.compareTo(isHidden2);
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Settings) && compareTo((Settings) obj) == 0;
    }

    public int hashCode() {
        return (isFavorite() == null ? 0 : isFavorite().hashCode()) + 1 + (isHidden() != null ? isHidden().hashCode() : 0);
    }

    public Boolean isFavorite() {
        return this.favorite;
    }

    public Boolean isHidden() {
        return this.hidden;
    }

    public void setFavorite(Boolean bool) {
        this.favorite = bool;
    }

    public void setHidden(Boolean bool) {
        this.hidden = bool;
    }
}
