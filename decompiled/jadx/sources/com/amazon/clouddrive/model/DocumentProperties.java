package com.amazon.clouddrive.model;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DocumentProperties implements Comparable<DocumentProperties> {
    private List<String> authors;
    private String documentVersion;
    private String title;

    @Override // java.lang.Comparable
    public int compareTo(DocumentProperties documentProperties) {
        if (documentProperties == null) {
            return -1;
        }
        if (documentProperties == this) {
            return 0;
        }
        String title = getTitle();
        String title2 = documentProperties.getTitle();
        if (title != title2) {
            if (title == null) {
                return -1;
            }
            if (title2 == null) {
                return 1;
            }
            int compareTo = title.compareTo(title2);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        List<String> authors = getAuthors();
        List<String> authors2 = documentProperties.getAuthors();
        if (authors != authors2) {
            if (authors == null) {
                return -1;
            }
            if (authors2 == null) {
                return 1;
            }
            if (authors instanceof Comparable) {
                int compareTo2 = ((Comparable) authors).compareTo(authors2);
                if (compareTo2 != 0) {
                    return compareTo2;
                }
            } else if (!authors.equals(authors2)) {
                int hashCode = authors.hashCode();
                int hashCode2 = authors2.hashCode();
                if (hashCode < hashCode2) {
                    return -1;
                }
                if (hashCode > hashCode2) {
                    return 1;
                }
            }
        }
        String documentVersion = getDocumentVersion();
        String documentVersion2 = documentProperties.getDocumentVersion();
        if (documentVersion != documentVersion2) {
            if (documentVersion == null) {
                return -1;
            }
            if (documentVersion2 == null) {
                return 1;
            }
            int compareTo3 = documentVersion.compareTo(documentVersion2);
            if (compareTo3 != 0) {
                return compareTo3;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof DocumentProperties) && compareTo((DocumentProperties) obj) == 0;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (getTitle() == null ? 0 : getTitle().hashCode()) + 1 + (getAuthors() == null ? 0 : getAuthors().hashCode()) + (getDocumentVersion() != null ? getDocumentVersion().hashCode() : 0);
    }

    public void setAuthors(List<String> list) {
        this.authors = list;
    }

    public void setDocumentVersion(String str) {
        this.documentVersion = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
