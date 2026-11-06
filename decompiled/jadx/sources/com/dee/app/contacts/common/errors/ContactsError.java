package com.dee.app.contacts.common.errors;

import com.dee.app.contacts.common.exceptions.ContactsException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ContactsError extends Error {
    public ContactsError(Throwable th) throws ContactsException {
        throw new ContactsException(th.getMessage());
    }

    public ContactsError(String str) throws ContactsException {
        throw new ContactsException(str);
    }

    public ContactsError(String str, Throwable th) throws ContactsException {
        throw new ContactsException(str);
    }

    public ContactsError() throws ContactsException {
        throw new ContactsException("Error occurred during Contacts flows");
    }

    public ContactsError(String str, Throwable th, boolean z, boolean z2) throws ContactsException {
        throw new ContactsException(str);
    }
}
