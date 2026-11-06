package com.amazon.alexa.auth;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class AbstractAccountManager implements AccountManager {
    private final AccountChangedBroadcastReceiver accountChangedBroadcastReceiver;
    private final List<AccountChangedListener> accountChangedListeners;
    private boolean isTornDown;

    public AbstractAccountManager(Context context) {
        Objects.requireNonNull(context);
        this.accountChangedListeners = new CopyOnWriteArrayList();
        this.accountChangedBroadcastReceiver = new AccountChangedBroadcastReceiver(context, new MAPAccountChangedCallback(this, 0));
    }

    @Override // com.amazon.alexa.auth.AccountManager
    public synchronized void addAccountChangedListener(AccountChangedListener accountChangedListener) {
        this.accountChangedListeners.add(accountChangedListener);
        if (this.accountChangedListeners.size() == 1) {
            this.accountChangedBroadcastReceiver.registerReceiver();
        }
    }

    @Override // com.amazon.alexa.auth.AccountManager
    public synchronized void removeAccountChangedListener(AccountChangedListener accountChangedListener) {
        if (this.accountChangedListeners.remove(accountChangedListener) && this.accountChangedListeners.size() == 0) {
            this.accountChangedBroadcastReceiver.unregisterReceiver();
        }
    }

    @Override // com.amazon.alexa.auth.AccountManager
    public synchronized void teardown() {
        if (this.isTornDown) {
            return;
        }
        this.isTornDown = true;
        if (this.accountChangedListeners.size() > 0) {
            this.accountChangedBroadcastReceiver.unregisterReceiver();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class MAPAccountChangedCallback implements AccountChangedListener {
        private MAPAccountChangedCallback() {
        }

        @Override // com.amazon.alexa.auth.AccountChangedListener
        public void onAccountAdded() {
            synchronized (AbstractAccountManager.this) {
                try {
                    AbstractAccountManager.this.clearCache();
                    Iterator it2 = AbstractAccountManager.this.accountChangedListeners.iterator();
                    while (it2.hasNext()) {
                        ((AccountChangedListener) it2.next()).onAccountAdded();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.amazon.alexa.auth.AccountChangedListener
        public void onAccountRemoved() {
            synchronized (AbstractAccountManager.this) {
                try {
                    AbstractAccountManager.this.clearCache();
                    Iterator it2 = AbstractAccountManager.this.accountChangedListeners.iterator();
                    while (it2.hasNext()) {
                        ((AccountChangedListener) it2.next()).onAccountRemoved();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public /* synthetic */ MAPAccountChangedCallback(AbstractAccountManager abstractAccountManager, int i) {
            this();
        }
    }
}
