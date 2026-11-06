package com.dee.app.contacts.interfaces.models.data.preference.contactpreference;

import com.dee.app.contacts.interfaces.models.data.preference.IPreference;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DROP_IN_ENABLED' uses external variables
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
public final class ContactPreference implements IPreference<ContactPreferenceKey, ContactPreferenceValue> {
    private static final /* synthetic */ ContactPreference[] $VALUES;
    public static final ContactPreference DROP_IN_DISABLED;
    public static final ContactPreference DROP_IN_ENABLED;
    public static final ContactPreference EMERGENCY_CONTACT_DISABLED;
    public static final ContactPreference EMERGENCY_CONTACT_ENABLED;
    public static final ContactPreference FAVORITE_DISABLED;
    public static final ContactPreference FAVORITE_ENABLED;
    private final ContactPreferenceKey key;
    private final ContactPreferenceValue value;

    private static /* synthetic */ ContactPreference[] $values() {
        return new ContactPreference[]{DROP_IN_ENABLED, DROP_IN_DISABLED, EMERGENCY_CONTACT_ENABLED, EMERGENCY_CONTACT_DISABLED, FAVORITE_ENABLED, FAVORITE_DISABLED};
    }

    static {
        ContactPreferenceKey contactPreferenceKey = ContactPreferenceKey.DROP_IN;
        DROP_IN_ENABLED = new ContactPreference("DROP_IN_ENABLED", 0, contactPreferenceKey, ContactPreferenceValue.ENABLED);
        DROP_IN_DISABLED = new ContactPreference("DROP_IN_DISABLED", 1, contactPreferenceKey, ContactPreferenceValue.DISABLED);
        ContactPreferenceKey contactPreferenceKey2 = ContactPreferenceKey.EMERGENCY_CONTACT;
        ContactPreferenceValue contactPreferenceValue = ContactPreferenceValue.TRUE;
        EMERGENCY_CONTACT_ENABLED = new ContactPreference("EMERGENCY_CONTACT_ENABLED", 2, contactPreferenceKey2, contactPreferenceValue);
        ContactPreferenceValue contactPreferenceValue2 = ContactPreferenceValue.FALSE;
        EMERGENCY_CONTACT_DISABLED = new ContactPreference("EMERGENCY_CONTACT_DISABLED", 3, contactPreferenceKey2, contactPreferenceValue2);
        ContactPreferenceKey contactPreferenceKey3 = ContactPreferenceKey.FAVORITE_CONTACT;
        FAVORITE_ENABLED = new ContactPreference("FAVORITE_ENABLED", 4, contactPreferenceKey3, contactPreferenceValue);
        FAVORITE_DISABLED = new ContactPreference("FAVORITE_DISABLED", 5, contactPreferenceKey3, contactPreferenceValue2);
        $VALUES = $values();
    }

    private ContactPreference(String str, int i, ContactPreferenceKey contactPreferenceKey, ContactPreferenceValue contactPreferenceValue) {
        this.key = contactPreferenceKey;
        this.value = contactPreferenceValue;
    }

    public static ContactPreference getContactPreferenceForKeyAndValue(String str, String str2) {
        for (ContactPreference contactPreference : values()) {
            if (contactPreference.getPreferenceKey().isPreferenceKeyForString(str) && contactPreference.getPreferenceValue().isPreferenceValueForString(str2)) {
                return contactPreference;
            }
        }
        return null;
    }

    public static ContactPreference valueOf(String str) {
        return (ContactPreference) Enum.valueOf(ContactPreference.class, str);
    }

    public static ContactPreference[] values() {
        return (ContactPreference[]) $VALUES.clone();
    }

    @Override // com.dee.app.contacts.interfaces.models.data.preference.IPreference
    public ContactPreferenceKey getPreferenceKey() {
        return this.key;
    }

    @Override // com.dee.app.contacts.interfaces.models.data.preference.IPreference
    public ContactPreferenceValue getPreferenceValue() {
        return this.value;
    }
}
