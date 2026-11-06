package com.dee.app.contacts.interfaces.models.data.preference.contactownerpreference;

import com.dee.app.contacts.interfaces.models.data.preference.IPreference;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AMAZON_CONTACTS_ENABLED' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final class ContactOwnerPreference implements IPreference<ContactOwnerPreferenceKey, ContactOwnerPreferenceValue> {
    private static final /* synthetic */ ContactOwnerPreference[] $VALUES;
    public static final ContactOwnerPreference AMAZON_CONTACTS_DISABLED;
    public static final ContactOwnerPreference AMAZON_CONTACTS_ENABLED;
    public static final ContactOwnerPreference AUTO_DISCOVERY_DISABLED;
    public static final ContactOwnerPreference AUTO_DISCOVERY_ENABLED;
    public static final ContactOwnerPreference CONTACT_IMPORT_DISABLED;
    public static final ContactOwnerPreference CONTACT_IMPORT_ENABLED;
    public static final ContactOwnerPreference CONTACT_SELECTIVE_IMPORT;
    public static final ContactOwnerPreference PHONE_NUMBER_VERIFIED_DISABLED;
    public static final ContactOwnerPreference PHONE_NUMBER_VERIFIED_ENABLED;
    private final ContactOwnerPreferenceKey key;
    private final ContactOwnerPreferenceValue value;

    private static /* synthetic */ ContactOwnerPreference[] $values() {
        return new ContactOwnerPreference[]{AMAZON_CONTACTS_ENABLED, AMAZON_CONTACTS_DISABLED, CONTACT_IMPORT_ENABLED, CONTACT_IMPORT_DISABLED, CONTACT_SELECTIVE_IMPORT, AUTO_DISCOVERY_ENABLED, AUTO_DISCOVERY_DISABLED, PHONE_NUMBER_VERIFIED_ENABLED, PHONE_NUMBER_VERIFIED_DISABLED};
    }

    static {
        ContactOwnerPreferenceKey contactOwnerPreferenceKey = ContactOwnerPreferenceKey.AMAZON_CONTACTS;
        ContactOwnerPreferenceValue contactOwnerPreferenceValue = ContactOwnerPreferenceValue.ENABLED;
        AMAZON_CONTACTS_ENABLED = new ContactOwnerPreference("AMAZON_CONTACTS_ENABLED", 0, contactOwnerPreferenceKey, contactOwnerPreferenceValue);
        ContactOwnerPreferenceValue contactOwnerPreferenceValue2 = ContactOwnerPreferenceValue.DISABLED;
        AMAZON_CONTACTS_DISABLED = new ContactOwnerPreference("AMAZON_CONTACTS_DISABLED", 1, contactOwnerPreferenceKey, contactOwnerPreferenceValue2);
        ContactOwnerPreferenceKey contactOwnerPreferenceKey2 = ContactOwnerPreferenceKey.CONTACT_IMPORT;
        CONTACT_IMPORT_ENABLED = new ContactOwnerPreference("CONTACT_IMPORT_ENABLED", 2, contactOwnerPreferenceKey2, contactOwnerPreferenceValue);
        CONTACT_IMPORT_DISABLED = new ContactOwnerPreference("CONTACT_IMPORT_DISABLED", 3, contactOwnerPreferenceKey2, contactOwnerPreferenceValue2);
        CONTACT_SELECTIVE_IMPORT = new ContactOwnerPreference("CONTACT_SELECTIVE_IMPORT", 4, contactOwnerPreferenceKey2, ContactOwnerPreferenceValue.SELECTIVE_IMPORT);
        ContactOwnerPreferenceKey contactOwnerPreferenceKey3 = ContactOwnerPreferenceKey.AUTO_DISCOVERY;
        AUTO_DISCOVERY_ENABLED = new ContactOwnerPreference("AUTO_DISCOVERY_ENABLED", 5, contactOwnerPreferenceKey3, contactOwnerPreferenceValue);
        AUTO_DISCOVERY_DISABLED = new ContactOwnerPreference("AUTO_DISCOVERY_DISABLED", 6, contactOwnerPreferenceKey3, contactOwnerPreferenceValue2);
        ContactOwnerPreferenceKey contactOwnerPreferenceKey4 = ContactOwnerPreferenceKey.PHONE_NUMBER_VERIFIED;
        PHONE_NUMBER_VERIFIED_ENABLED = new ContactOwnerPreference("PHONE_NUMBER_VERIFIED_ENABLED", 7, contactOwnerPreferenceKey4, contactOwnerPreferenceValue);
        PHONE_NUMBER_VERIFIED_DISABLED = new ContactOwnerPreference("PHONE_NUMBER_VERIFIED_DISABLED", 8, contactOwnerPreferenceKey4, contactOwnerPreferenceValue2);
        $VALUES = $values();
    }

    private ContactOwnerPreference(String str, int i, ContactOwnerPreferenceKey contactOwnerPreferenceKey, ContactOwnerPreferenceValue contactOwnerPreferenceValue) {
        this.key = contactOwnerPreferenceKey;
        this.value = contactOwnerPreferenceValue;
    }

    public static ContactOwnerPreference getContactPreferenceForKeyAndValue(String str, String str2) {
        for (ContactOwnerPreference contactOwnerPreference : values()) {
            if (contactOwnerPreference.getPreferenceKey().isPreferenceKeyForString(str) && contactOwnerPreference.getPreferenceValue().isPreferenceValueForString(str2)) {
                return contactOwnerPreference;
            }
        }
        return null;
    }

    public static ContactOwnerPreference valueOf(String str) {
        return (ContactOwnerPreference) Enum.valueOf(ContactOwnerPreference.class, str);
    }

    public static ContactOwnerPreference[] values() {
        return (ContactOwnerPreference[]) $VALUES.clone();
    }

    @Override // com.dee.app.contacts.interfaces.models.data.preference.IPreference
    public ContactOwnerPreferenceKey getPreferenceKey() {
        return this.key;
    }

    @Override // com.dee.app.contacts.interfaces.models.data.preference.IPreference
    public ContactOwnerPreferenceValue getPreferenceValue() {
        return this.value;
    }
}
