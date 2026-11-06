package com.amazon.bluefront.api.common;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Arrf implements Comparable<Arrf> {
    private String mId;
    private List<NBestResult> mUtterances;

    @Override // java.lang.Comparable
    public int compareTo(Arrf arrf) {
        if (arrf == null) {
            return -1;
        }
        if (arrf == this) {
            return 0;
        }
        List<NBestResult> utterances = getUtterances();
        List<NBestResult> utterances2 = arrf.getUtterances();
        if (utterances != utterances2) {
            if (utterances == null) {
                return -1;
            }
            if (utterances2 == null) {
                return 1;
            }
            if (utterances instanceof Comparable) {
                int compareTo = ((Comparable) utterances).compareTo(utterances2);
                if (compareTo != 0) {
                    return compareTo;
                }
            } else if (!utterances.equals(utterances2)) {
                int hashCode = utterances.hashCode();
                int hashCode2 = utterances2.hashCode();
                if (hashCode < hashCode2) {
                    return -1;
                }
                if (hashCode > hashCode2) {
                    return 1;
                }
            }
        }
        String id = getId();
        String id2 = arrf.getId();
        if (id != id2) {
            if (id == null) {
                return -1;
            }
            if (id2 == null) {
                return 1;
            }
            int compareTo2 = id.compareTo(id2);
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
        return (obj instanceof Arrf) && compareTo((Arrf) obj) == 0;
    }

    public String getId() {
        return this.mId;
    }

    public List<NBestResult> getUtterances() {
        return this.mUtterances;
    }

    public int hashCode() {
        return (getUtterances() == null ? 0 : getUtterances().hashCode()) + 1 + (getId() != null ? getId().hashCode() : 0);
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setUtterances(List<NBestResult> list) {
        this.mUtterances = list;
    }
}
