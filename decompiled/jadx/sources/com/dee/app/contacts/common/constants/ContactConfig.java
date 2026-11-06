package com.dee.app.contacts.common.constants;

import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ContactConfig {
    public static final String DEFAULT_MAX_LENGTH_KEY = "Contacts.DefaultContactFieldsMaxLength";
    public static final String PHONE_NUMBER_MAX_LENGTH_KEY = "Contacts.PhoneNumberMaxLength";
    public Integer addressRawTypeMaxLength;
    public Integer addressValueMaxLength;
    public Integer maxEmailAddressLength;
    public Integer maxEmailAddressRawTypeLength;
    public Integer maxEmailCount;
    public Integer phoneNumberRawTypeMaxLength;
    public Integer defaultMaxLength = 200;
    public Integer nameMaxLength = 200;
    public Integer companyNameMaxLength = 200;
    public Integer phoneNumberMaxLength = 25;

    @Inject
    public ContactConfig() {
        Integer num = this.defaultMaxLength;
        this.phoneNumberRawTypeMaxLength = num;
        this.addressValueMaxLength = num;
        this.addressRawTypeMaxLength = num;
        this.maxEmailCount = 25;
        Integer num2 = this.defaultMaxLength;
        this.maxEmailAddressLength = num2;
        this.maxEmailAddressRawTypeLength = num2;
    }
}
