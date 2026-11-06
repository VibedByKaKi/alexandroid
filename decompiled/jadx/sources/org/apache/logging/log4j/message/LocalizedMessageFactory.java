package org.apache.logging.log4j.message;

import java.util.Objects;
import java.util.ResourceBundle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class LocalizedMessageFactory extends AbstractMessageFactory {
    private static final long serialVersionUID = -1996295808703146741L;
    private final String baseName;
    private final transient ResourceBundle resourceBundle;

    public LocalizedMessageFactory(ResourceBundle resourceBundle) {
        this.resourceBundle = resourceBundle;
        this.baseName = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LocalizedMessageFactory localizedMessageFactory = (LocalizedMessageFactory) obj;
            if (Objects.equals(this.resourceBundle, localizedMessageFactory.resourceBundle) && Objects.equals(this.baseName, localizedMessageFactory.baseName)) {
                return true;
            }
        }
        return false;
    }

    public String getBaseName() {
        return this.baseName;
    }

    public ResourceBundle getResourceBundle() {
        return this.resourceBundle;
    }

    public int hashCode() {
        return Objects.hash(this.resourceBundle, this.baseName);
    }

    @Override // org.apache.logging.log4j.message.AbstractMessageFactory, org.apache.logging.log4j.message.MessageFactory
    public Message newMessage(String str) {
        ResourceBundle resourceBundle = this.resourceBundle;
        return resourceBundle == null ? new LocalizedMessage(this.baseName, str) : new LocalizedMessage(resourceBundle, str);
    }

    public LocalizedMessageFactory(String str) {
        this.resourceBundle = null;
        this.baseName = str;
    }

    @Override // org.apache.logging.log4j.message.MessageFactory
    public Message newMessage(String str, Object... objArr) {
        ResourceBundle resourceBundle = this.resourceBundle;
        if (resourceBundle == null) {
            return new LocalizedMessage(this.baseName, str, objArr);
        }
        return new LocalizedMessage(resourceBundle, str, objArr);
    }
}
