package com.dee.app.contacts.interfaces.models.apis.getaccounts;

import com.dee.app.contacts.interfaces.models.data.Account;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetAccountsResponse {
    private List<Account> accounts;

    public GetAccountsResponse(List<Account> list) {
        this.accounts = list;
    }

    public List<Account> getAccounts() {
        return this.accounts;
    }

    public void setAccounts(List<Account> list) {
        this.accounts = list;
    }
}
