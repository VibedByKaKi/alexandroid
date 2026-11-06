package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DocumentProperties {

    @SerializedName("authors")
    @Expose
    private List<String> authors;

    @SerializedName("documentVersion")
    @Expose
    private String documentVersion;

    @SerializedName("title")
    @Expose
    private String title;

    @Generated
    public DocumentProperties() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof DocumentProperties;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DocumentProperties)) {
            return false;
        }
        DocumentProperties documentProperties = (DocumentProperties) obj;
        if (!documentProperties.canEqual(this)) {
            return false;
        }
        String title = getTitle();
        String title2 = documentProperties.getTitle();
        if (title != null ? !title.equals(title2) : title2 != null) {
            return false;
        }
        String documentVersion = getDocumentVersion();
        String documentVersion2 = documentProperties.getDocumentVersion();
        if (documentVersion != null ? !documentVersion.equals(documentVersion2) : documentVersion2 != null) {
            return false;
        }
        List<String> authors = getAuthors();
        List<String> authors2 = documentProperties.getAuthors();
        return authors != null ? authors.equals(authors2) : authors2 == null;
    }

    @Generated
    public List<String> getAuthors() {
        return this.authors;
    }

    @Generated
    public String getDocumentVersion() {
        return this.documentVersion;
    }

    @Generated
    public String getTitle() {
        return this.title;
    }

    @Generated
    public int hashCode() {
        String title = getTitle();
        int hashCode = title == null ? 43 : title.hashCode();
        String documentVersion = getDocumentVersion();
        int i = (hashCode + 59) * 59;
        int hashCode2 = documentVersion == null ? 43 : documentVersion.hashCode();
        List<String> authors = getAuthors();
        return ((i + hashCode2) * 59) + (authors != null ? authors.hashCode() : 43);
    }

    @Generated
    public void setAuthors(List<String> list) {
        this.authors = list;
    }

    @Generated
    public void setDocumentVersion(String str) {
        this.documentVersion = str;
    }

    @Generated
    public void setTitle(String str) {
        this.title = str;
    }

    @Generated
    public String toString() {
        return "DocumentProperties(title=" + getTitle() + ", documentVersion=" + getDocumentVersion() + ", authors=" + getAuthors() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
