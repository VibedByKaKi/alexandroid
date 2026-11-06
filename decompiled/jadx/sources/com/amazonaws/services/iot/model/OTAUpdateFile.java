package com.amazonaws.services.iot.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class OTAUpdateFile implements Serializable {
    private Map<String, String> attributes;
    private CodeSigning codeSigning;
    private FileLocation fileLocation;
    private String fileName;
    private Integer fileType;
    private String fileVersion;

    public OTAUpdateFile addattributesEntry(String str, String str2) {
        if (this.attributes == null) {
            this.attributes = new HashMap();
        }
        if (this.attributes.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.attributes.put(str, str2);
        return this;
    }

    public OTAUpdateFile clearattributesEntries() {
        this.attributes = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof OTAUpdateFile)) {
            return false;
        }
        OTAUpdateFile oTAUpdateFile = (OTAUpdateFile) obj;
        if ((oTAUpdateFile.getFileName() == null) ^ (getFileName() == null)) {
            return false;
        }
        if (oTAUpdateFile.getFileName() != null && !oTAUpdateFile.getFileName().equals(getFileName())) {
            return false;
        }
        if ((oTAUpdateFile.getFileType() == null) ^ (getFileType() == null)) {
            return false;
        }
        if (oTAUpdateFile.getFileType() != null && !oTAUpdateFile.getFileType().equals(getFileType())) {
            return false;
        }
        if ((oTAUpdateFile.getFileVersion() == null) ^ (getFileVersion() == null)) {
            return false;
        }
        if (oTAUpdateFile.getFileVersion() != null && !oTAUpdateFile.getFileVersion().equals(getFileVersion())) {
            return false;
        }
        if ((oTAUpdateFile.getFileLocation() == null) ^ (getFileLocation() == null)) {
            return false;
        }
        if (oTAUpdateFile.getFileLocation() != null && !oTAUpdateFile.getFileLocation().equals(getFileLocation())) {
            return false;
        }
        if ((oTAUpdateFile.getCodeSigning() == null) ^ (getCodeSigning() == null)) {
            return false;
        }
        if (oTAUpdateFile.getCodeSigning() != null && !oTAUpdateFile.getCodeSigning().equals(getCodeSigning())) {
            return false;
        }
        if ((oTAUpdateFile.getAttributes() == null) ^ (getAttributes() == null)) {
            return false;
        }
        return oTAUpdateFile.getAttributes() == null || oTAUpdateFile.getAttributes().equals(getAttributes());
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    public CodeSigning getCodeSigning() {
        return this.codeSigning;
    }

    public FileLocation getFileLocation() {
        return this.fileLocation;
    }

    public String getFileName() {
        return this.fileName;
    }

    public Integer getFileType() {
        return this.fileType;
    }

    public String getFileVersion() {
        return this.fileVersion;
    }

    public int hashCode() {
        return (((((((((((getFileName() == null ? 0 : getFileName().hashCode()) + 31) * 31) + (getFileType() == null ? 0 : getFileType().hashCode())) * 31) + (getFileVersion() == null ? 0 : getFileVersion().hashCode())) * 31) + (getFileLocation() == null ? 0 : getFileLocation().hashCode())) * 31) + (getCodeSigning() == null ? 0 : getCodeSigning().hashCode())) * 31) + (getAttributes() != null ? getAttributes().hashCode() : 0);
    }

    public void setAttributes(Map<String, String> map) {
        this.attributes = map;
    }

    public void setCodeSigning(CodeSigning codeSigning) {
        this.codeSigning = codeSigning;
    }

    public void setFileLocation(FileLocation fileLocation) {
        this.fileLocation = fileLocation;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setFileType(Integer num) {
        this.fileType = num;
    }

    public void setFileVersion(String str) {
        this.fileVersion = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getFileName() != null) {
            sb.append("fileName: " + getFileName() + ",");
        }
        if (getFileType() != null) {
            sb.append("fileType: " + getFileType() + ",");
        }
        if (getFileVersion() != null) {
            sb.append("fileVersion: " + getFileVersion() + ",");
        }
        if (getFileLocation() != null) {
            sb.append("fileLocation: " + getFileLocation() + ",");
        }
        if (getCodeSigning() != null) {
            sb.append("codeSigning: " + getCodeSigning() + ",");
        }
        if (getAttributes() != null) {
            sb.append("attributes: " + getAttributes());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public OTAUpdateFile withAttributes(Map<String, String> map) {
        this.attributes = map;
        return this;
    }

    public OTAUpdateFile withCodeSigning(CodeSigning codeSigning) {
        this.codeSigning = codeSigning;
        return this;
    }

    public OTAUpdateFile withFileLocation(FileLocation fileLocation) {
        this.fileLocation = fileLocation;
        return this;
    }

    public OTAUpdateFile withFileName(String str) {
        this.fileName = str;
        return this;
    }

    public OTAUpdateFile withFileType(Integer num) {
        this.fileType = num;
        return this;
    }

    public OTAUpdateFile withFileVersion(String str) {
        this.fileVersion = str;
        return this;
    }
}
