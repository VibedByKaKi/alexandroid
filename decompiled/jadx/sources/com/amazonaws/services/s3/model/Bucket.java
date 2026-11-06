package com.amazonaws.services.s3.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.io.Serializable;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Bucket implements Serializable {
    private static final long serialVersionUID = -8646831898339939580L;
    private Date creationDate;
    private String name;
    private Owner owner;

    public Bucket() {
        this.name = null;
        this.owner = null;
        this.creationDate = null;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public String getName() {
        return this.name;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public void setCreationDate(Date date) {
        this.creationDate = date;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String toString() {
        return "S3Bucket [name=" + getName() + ", creationDate=" + getCreationDate() + ", owner=" + getOwner() + MarkdownConstants.RIGHT_BRACKET;
    }

    public Bucket(String str) {
        this.owner = null;
        this.creationDate = null;
        this.name = str;
    }
}
